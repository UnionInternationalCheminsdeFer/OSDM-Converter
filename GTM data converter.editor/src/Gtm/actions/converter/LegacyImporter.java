package Gtm.actions.converter;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.TimeZone;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.common.command.CompoundCommand;
import org.eclipse.emf.edit.command.SetCommand;
import org.eclipse.emf.edit.domain.EditingDomain;

import Gtm.Carrier;
import Gtm.ConversionFromLegacy;
import Gtm.GTMTool;
import Gtm.GtmFactory;
import Gtm.GtmPackage;
import Gtm.Legacy108;
import Gtm.Legacy108Station;
import Gtm.Legacy108Stations;
import Gtm.LegacyCalculationType;
import Gtm.LegacyDistanceFare;
import Gtm.LegacyDistanceFares;
import Gtm.LegacyRouteFare;
import Gtm.LegacyRouteFares;
import Gtm.LegacySeparateContractSeries;
import Gtm.LegacySeparateContractSeriesList;
import Gtm.LegacySeries;
import Gtm.LegacySeriesList;
import Gtm.LegacySeriesType;
import Gtm.LegacyViastation;
import Gtm.Station;
import Gtm.actions.GtmUtils;
import Gtm.nls.NationalLanguageSupport;
import Gtm.preferences.PreferenceConstants;
import Gtm.preferences.PreferencesAccess;
import Gtm.presentation.GtmEditor;

public class LegacyImporter {
	
	private GTMTool tool = null;
	private DateFormat dateFormat = new SimpleDateFormat("yyyyMMdd"); //$NON-NLS-1$
	private String charset = null;
	private Path TCVfilePath = null;
	private Legacy108 legacy108 = null;
	private String timeZone = null;
	EditingDomain domain = null;
	GtmEditor editor = null;
	
	public LegacyImporter(GTMTool tool, Path filePathTCV, EditingDomain domain, GtmEditor editor) {
		this.tool = tool;
		this.domain = domain;
		this.editor = editor;
		
		this.legacy108 = tool.getConversionFromLegacy().getLegacy108();
				
		this.TCVfilePath  = filePathTCV;
		
		try  {
			String charsetlit = tool.getConversionFromLegacy().getLegacy108().getCharacterSet().getLiteral();
			int i = charsetlit.indexOf("_");	 //$NON-NLS-1$
			charset = charsetlit.substring(i+1);
			if (!Charset.isSupported(charset)) {
				String message = NationalLanguageSupport.LegacyImporter_2;
				GtmUtils.writeConsoleInfo(message, editor);
				charset = null; 
				return;
			};

		} catch (Exception e) {
			String message = NationalLanguageSupport.LegacyImporter_3;
			GtmUtils.writeConsoleError(message, editor);
			e.printStackTrace();
			return;
		}
		
		this.timeZone = legacy108.getTimeZone().getName();
		if (timeZone == null || timeZone.length() < 3) {
			timeZone = "GMT"; //$NON-NLS-1$
		}
		dateFormat.setTimeZone(TimeZone.getTimeZone(timeZone)); 
	}
	
	public void importAll(IProgressMonitor monitor) {
		
		// monitor has 30 subtasks
		
		
		monitor.subTask(NationalLanguageSupport.ImportLegayTask_TCVfile);
		File TCVfile = TCVfilePath.toFile();
		Path namePath = TCVfilePath.getFileName();
		String name = namePath.toString();
		String provider = name.substring(3,7);
		Carrier carrier = findCarrier(tool, provider);
		//set the carrier providing the data
		Command com = SetCommand.create(domain, tool.getConversionFromLegacy().getLegacy108(), GtmPackage.Literals.LEGACY108__CARRIER, carrier);
		if (com.canExecute()) {
			domain.getCommandStack().execute(com);
		}
		monitor.worked(1);
		
		monitor.subTask(NationalLanguageSupport.ImportLegayTask_TCVGfile);		
		Path directory = TCVfilePath.getParent();
		Path TCVGfilePath = Paths.get(directory.toString(), "TCVG" + provider + ".txt"); //$NON-NLS-1$ //$NON-NLS-2$
		File TCVGfile =  TCVGfilePath.toFile();
		importTCVG(TCVGfile);
		monitor.worked(1);
		
		monitor.subTask(NationalLanguageSupport.ImportLegayTask_TCVSfile);
		Path TCVSfilePath = Paths.get(directory.toString(), "TCVS" + provider + ".txt"); //$NON-NLS-1$ //$NON-NLS-2$
		File TCVSfile =  TCVSfilePath.toFile();
		importTCVS(TCVSfile);
		monitor.worked(1);
		
		ArrayList<String> fareFiles = readTCVFilelist(TCVfile);
		
		int workSteps = 1;
		if (fareFiles.size() > 0) {
			workSteps = 26 / fareFiles.size();
		}
		
		for (String fileName : fareFiles) {
			monitor.subTask(NationalLanguageSupport.ImportLegayTask_TCVfareFile + " " + fileName);
			Path filePath = Paths.get(directory.toString(), fileName);
			File fareFile =  filePath.toFile();
			importFare(fareFile);
			monitor.worked(workSteps);
		}
		
		if (PreferencesAccess.getBoolFromPreferenceStore(PreferenceConstants.P_LINK_STATIONS_BY_GEO)) {
			monitor.subTask(NationalLanguageSupport.ImportLegayTask_BorderPoints);
			updateMERITSStations();	
		}
		monitor.worked(1);
		
		
		monitor.subTask(NationalLanguageSupport.ImportLegayTask_TCVLfile);
		Path TCVLfilePath = Paths.get(directory.toString(), "TCVL" + provider + ".txt"); //$NON-NLS-1$ //$NON-NLS-2$
		File TCVLfile =  TCVLfilePath.toFile();
		if (TCVLfile.exists()) {
			importTCVL(TCVLfile);
		}
		monitor.worked(1);
	
	}
	
	
	private Carrier findCarrier(GTMTool tool, String code) {
		for (Carrier c : tool.getCodeLists().getCarriers().getCarriers()) {
			if (c.getCode().equals(code)) {
				return c;
			}
		}
		return null;	
	}

	private void importTCVL(File file) {
		BufferedReader br = getReader (file);
		if (br == null) return;
		
	       String st; 
	        
	       LegacySeparateContractSeriesList list = GtmFactory.eINSTANCE.createLegacySeparateContractSeriesList();
	        

	        try {
				while ((st = br.readLine()) != null) {
					
					LegacySeparateContractSeries series = decodeTCVLLine(st, charset);
					if (series != null) {
					  list.getSeparateContractSeries().add(series);
					}
				}
			} catch (IOException e) {
				String message = "TCVL file import failed" + " - " + e.getMessage();
				GtmUtils.writeConsoleError(message, editor);
				e.printStackTrace();
				return;
			} 
	        
	           	
			Command cmd =  SetCommand.create(domain, legacy108, GtmPackage.Literals.LEGACY108__LEGACY_STATIONS, list );
			if (cmd.canExecute()) {
				domain.getCommandStack().execute(cmd);
				String message = "TCVL series imported: " + Integer.toString(list.getSeparateContractSeries().size());
				GtmUtils.writeConsoleInfo(message, editor);
			}
	}

	private LegacySeparateContractSeries decodeTCVLLine(String st, String charset) {
		
		// 1 Code of the supplier RU numeric 4 M TAP TSI Technical Document B.8 1-4 e.g. 0081 for �BB 
		// 2 Series numeric 5 M  5-9 Serves to assign fares to a specific series 
		// 3 Flag for series numeric 5 M  10-14 0, 1 or 2 (cf. Subsection 2.2) 
		// 4 First day of validity of fare numeric 8 M  15-22 Expressed as: "YYYYMMDD" 	
		// 5 version number numeric 2 M  23-24 Serial numbering for versions on the fare date; "01" for the first issue; "02" for the second 
		// 6 Last day of validity of fare numeric 8 M  25-32 Expressed as: "YYYYMMDD

		String number  					= st.substring(4, 9);
		String flag  					= st.substring(9, 10);
				
		String validFromString 			= st.substring(211,219);		
		String validUntilString 		= st.substring(221,229);				
		
		if (flag.equals("2")) return null; //$NON-NLS-1$
		
		LegacySeparateContractSeries series = GtmFactory.eINSTANCE.createLegacySeparateContractSeries();
			
		series.setSeriesNumber(Integer.parseInt(number));
		
		for (LegacySeries s : tool.getConversionFromLegacy().getLegacy108().getLegacySeriesList().getSeries()) {
			if (s.getNumber() == series.getSeriesNumber()) {
				series.setSeries(s);
			}
		}
		
		Date dt = null;
		try {
		    dt = dateFormat.parse(validFromString);
		    series.setValidFrom(dt);
		} catch (ParseException e) {
		    e.printStackTrace();
		} 
		Date dt2 = null;
		try {
		    dt2 = dateFormat.parse(validUntilString);
		    series.setValidUntil(dt2);
		} catch (ParseException e) {
		    e.printStackTrace();
		} 
		
		return series;
	}

	private void importTCVG(File file) {
		
		BufferedReader br = getReader (file);
		if (br == null) return;
		
	       String st; 
	        
	        Legacy108Stations stations = GtmFactory.eINSTANCE.createLegacy108Stations();
	        

	        try {
				while ((st = br.readLine()) != null) {
					
				  Legacy108Station station = decodeTCVGLine(st, charset);
				  if (station != null) {
					  stations.getLegacyStations().add(station);
				  }
				}
			} catch (IOException e) {
				String message = NationalLanguageSupport.LegacyImporter_9 + " - " + e.getMessage();
				GtmUtils.writeConsoleError(message, editor);
				e.printStackTrace();
				return;
			} 
	        
	           	
			Command cmd =  SetCommand.create(domain, legacy108, GtmPackage.Literals.LEGACY108__LEGACY_STATIONS, stations );
			if (cmd.canExecute()) {
				domain.getCommandStack().execute(cmd);
				String message = NationalLanguageSupport.LegacyImporter_10 + Integer.toString(stations.getLegacyStations().size());
				GtmUtils.writeConsoleInfo(message, editor);			
			}
		
	}

	private void importTCVS(File file) {
		
		BufferedReader br = getReader (file);
		if (br == null) return;
		
        String st; 
        
        LegacySeriesList seriesList = GtmFactory.eINSTANCE.createLegacySeriesList();
		ConversionFromLegacy converter = (ConversionFromLegacy) legacy108.eContainer();
		String timeZone = converter.getLegacy108().getTimeZone().getName();
		if (timeZone == null || timeZone.length() < 3) {
			timeZone = "GMT"; //$NON-NLS-1$
		}
        
        try {
			while ((st = br.readLine()) != null) {
				
			  LegacySeries series = decodeTCVSLine(st, timeZone);
			  if (series != null) {
				  seriesList.getSeries().add(series);
			  }
			}
		} catch (IOException e) {
			String message = NationalLanguageSupport.LegacyImporter_12 + " - " + e.getMessage();
			GtmUtils.writeConsoleInfo(message, editor);
			e.printStackTrace();
			return;
		} 
           	
		Command cmd =  SetCommand.create(domain, legacy108, GtmPackage.Literals.LEGACY108__LEGACY_SERIES_LIST, seriesList );
		if (cmd.canExecute()) {
			domain.getCommandStack().execute(cmd);
			String message = NationalLanguageSupport.LegacyImporter_13 + Integer.toString(seriesList.getSeries().size());
			GtmUtils.writeConsoleInfo(message, editor);
		}

		
	}

	private void importFare(File file) {
		
		BufferedReader br = getReader (file);
		if (br == null) return;
		
	       String st; 
	        
			LegacyRouteFares resultListRouteFares = GtmFactory.eINSTANCE.createLegacyRouteFares();
			
			LegacyDistanceFares resultListDistanceFares = GtmFactory.eINSTANCE.createLegacyDistanceFares();
			
			Legacy108 legacy108 = tool.getConversionFromLegacy().getLegacy108();
			
			
	        try {
				while ((st = br.readLine()) != null) {
					
				  if ((st.length() == 174))	{
					
					  LegacyRouteFare fare = decodeLineRouteFare(st, timeZone);
				  
					  if (fare != null) {
						  resultListRouteFares.getRouteFare().add(fare);
					  }
				  } else if ((st.length() == 64)) {
					  
						LegacyDistanceFare fare = decodeLineDistanceFare(st, timeZone);
						
						if (fare != null) {
							resultListDistanceFares.getDistanceFare().add(fare);
						}
					  
					  
				  }
				}
			} catch (IOException e) {
				
				String message = NationalLanguageSupport.LegacyImporter_14 + " - " + e.getMessage();
				GtmUtils.writeConsoleInfo(message, editor);
				e.printStackTrace();
				return;
			} 
	        
	        CompoundCommand command = new CompoundCommand();
	        
	        if (!resultListRouteFares.getRouteFare().isEmpty()) {
	    		command.append(SetCommand.create(domain, legacy108, GtmPackage.Literals.LEGACY108__LEGACY_ROUTE_FARES, resultListRouteFares) );
	        }
	        if (!resultListDistanceFares.getDistanceFare().isEmpty()) {        
	        	command.append(SetCommand.create(domain, legacy108, GtmPackage.Literals.LEGACY108__LEGACY_DISTANCE_FARES, resultListDistanceFares) );
	        }


			if (!command.isEmpty() && command.canExecute()) {
				domain.getCommandStack().execute(command);
				String message = NationalLanguageSupport.LegacyImporter_15 + Integer.toString(resultListRouteFares.getRouteFare().size());
				GtmUtils.writeConsoleInfo(message, editor);
			}
			
	}


	private LegacyRouteFare decodeLineRouteFare(String st, String timeZone) {
			
			if (st.length() != 174)	return null;
			
			//String carrier 		= st.substring(0, 4);
			//String number  			= st.substring(4, 8);
			String series    		= st.substring(8,13);

			String fare1st 	 		= st.substring(132,139);	
			String fare2nd 	 		= st.substring(124,131);	
			
			String returnFare1st 	= st.substring(148,155);	
			String returnFare2nd 	= st.substring(140,147);	
			
			String validFromString   = st.substring(156,164); //YYYYMMDD
			String validUntilString  = st.substring(166,174); //YYYYMMDD
			
			
			LegacyRouteFare fare = GtmFactory.eINSTANCE.createLegacyRouteFare();

			fare.setSeriesNumber(Integer.parseInt(series));
			
			fare.setFare1st(Integer.parseInt(fare1st));
			fare.setFare2nd(Integer.parseInt(fare2nd));
			
			fare.setReturnFare1st(Integer.parseInt(returnFare1st));
			fare.setReturnFare2nd(Integer.parseInt(returnFare2nd));		
			
			Date dt = null;
			try {
			    dt = dateFormat.parse(validFromString);
			    fare.setValidFrom(dt);
			} catch (ParseException e) {
			    e.printStackTrace();
			} 
			Date dt2 = null;
			try {
			    dt2 = dateFormat.parse(validUntilString);
			    fare.setValidUntil(dt2);
			} catch (ParseException e) {
			    e.printStackTrace();
			} 
			
			
			return fare;
	}

	private LegacyDistanceFare decodeLineDistanceFare(String st, String timeZone) {

			if (st.length()!= 64)	return null;
			
			try {
				

			//String carrier 		= st.substring(0, 4);
			String number  			= st.substring(4, 8);
			String distance  		= st.substring(8,13);
			String flag 			= st.substring(13,14);	 
					
			if (flag.equals("2")) return null; //$NON-NLS-1$

			String fare2nd 	 		= st.substring(14,21);	
			String fare1st 	 		= st.substring(22,29);	
			
			String returnFare1st 	= st.substring(38,45);	
			String returnFare2nd 	= st.substring(30,37);	
			
			String validFromString   = st.substring(46,54); //YYYYMMDD
			String validUntilString  = st.substring(56,64); //YYYYMMDD

			
			LegacyDistanceFare fare = GtmFactory.eINSTANCE.createLegacyDistanceFare();
			
			fare.setFareTableNumber(Integer.parseInt(number));
			fare.setDistance(Integer.parseInt(distance));
			
			
			fare.setFare1st(Integer.parseInt(fare1st));
			fare.setFare2nd(Integer.parseInt(fare2nd));
			
			fare.setReturnFare1st(Integer.parseInt(returnFare1st));
			fare.setReturnFare2nd(Integer.parseInt(returnFare2nd));		
			
			Date dt = null;
			try {
			    dt = dateFormat.parse(validFromString);
			    fare.setValidFrom(dt);
			} catch (ParseException e) {
			    e.printStackTrace();
			} 
			Date dt2 = null;
			try {
			    dt2 = dateFormat.parse(validUntilString);
			    fare.setValidUntil(dt2);
			} catch (ParseException e) {
			    e.printStackTrace();
			} 
			
			return fare;
			
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}


	private ArrayList<String> readTCVFilelist(File file) {
		ArrayList<String> filenames = new ArrayList<String>();
		
		BufferedReader br = getReader (file);
		if (br == null) return null;
		
		
		String st = null;
		
        try {
			while ((st = br.readLine()) != null) {
				
			  String name = decodeTCVLine(st, charset);
			  if (name != null) {
				 filenames.add(name+".txt"); //$NON-NLS-1$
			  }
			}
		} catch (IOException e) {
			String message = NationalLanguageSupport.LegacyImporter_18 + " - " + e.getMessage();
			GtmUtils.writeConsoleError(message, editor);
			e.printStackTrace();
			return null;
		} 

		return filenames;
	}
	
	private BufferedReader getReader(File file) {
    
		BufferedReader br;
		try {
			br = new BufferedReader(new FileReader(file));
		} catch (FileNotFoundException e) {
			String message = NationalLanguageSupport.LegacyImporter_19+ " - " + e.getMessage();
			GtmUtils.writeConsoleError(message, editor);
			e.printStackTrace();
			return null;
		} 
    
		return br;

	}
	
	private String decodeTCVLine(String st , String charset) {
		//get fare file names
		String name	= st.substring(34,42);
		if (name.startsWith("TCV")) { //$NON-NLS-1$
			return null;
		} else {
			return name;
		}
		
	}
	
	private Legacy108Station decodeTCVGLine(String st , String charset) {
		
		//	1 code of the supplying RU numeric 4 M TAP TSI Technical Document B.8 1-4 e.g. 0081 for �BB 
		//	2 station code numeric 5 M TAP TSI Technical Document B.9 5-9  
		//	3 Key flag for station code numeric 1 M  10 0, 1 or 2 (see point 2.2) 
		//	4 Old railway code numeric 5 O TAP TSI Technical Document B.9 11-15 This field is only used when stations are first introduced. 
		//	5 35-character station designation alpha numeric 35 M  16-50 Station designation in the national language including accents and in upper and lower case. 
		//	6 Flag 1 for the 35- character station designation numeric 1 M  51 0 or 3 (see point 2.2) 
		//	7 17-character station designation alpha numeric 17 M  52-68 Computer notation with no accents but in upper and lower case. The file is to be transferred in the ascending alphanumeric order of this field. 
		//	8 Flag 2 for the 17- character station designation numeric 1 M  69 0 or 3 (see point 2.2) 
		//	9 17-character route description of station alpha numeric 17 O  70-86 Field 7 notation for route instruction purposes. 
		//	10 Flag 3 for the 17- character route description of the station numeric 1 M  87 0 or 3 (see point 2.2) 
		//	11 Zone numeric 4 O  88-91  
		//	12 Flag 4 for zone numeric 1 O  92 0 or 3 (see point 2.2) 
		//	13 border-point code numeric 4 O Code List  B.1.3 93-96 Where a station has the status of a border station, the border point code shall be entered in this field and may not be omitted. 
		//	14 Flag 5 for border- point code numeric 1 M  97 0 or 3 (see point 2.2) 
		//	15 reserved alpha numeric 2 M  98-99  
		//	16 reserved alpha numeric 1 M  100  
		//	17 reserved numeric 2 M  101-102  
		//	18 reserved numeric 1 M  103  
		//	19 1st pictogram code numeric 4 O  104-107 numeric pictogram code as listed in Appendix L. 
		//	20 2nd pictogram code numeric 4 O  108-111  
		//	21 3rd pictogram code numeric 4 O  112-115  
		//	22 Flag 7 of pictogram codes numeric 1 O  116 This field relates to fields 19-21; 0 or 3 (see point 2.2). 
		//	23 Font numeric 1 M  117 Determines font for printing of fare only 1 = normal 2 = bold 3 = italics 
		//	24 Flag 8 for font numeric 1 M  118 0 or 3 (see point 2.2) 
		//	25 Designation for third party RU  alpha numeric 10 O  119-128 Details of private transport undertaking to which the station applies. 
		//	26 Flag 9 for third party RU numeric 1 M  129 0 or 3 (see point 2.2) 
		//	27  code for fare reference station numeric 5 O TAP TSI Technical Document B.9 130-134  code for station setting fare/price in respect of field 2. 
		//	28 Flag 10 for fare reference station numeric 1 M  135 0 or 3 (see point 2.2) 
		//	29  code for accounting station numeric 5 O TAP TSI Technical Document B.9 136-140 This field is only used if there is a separate accounting station. 
		//	30 Flag 11 for accounting station numeric 1 M  141 0 or 3 (see point 2.2) 
		//	31 Station latitude numeric 10 O  142-1 51 Latitude using Gauss-Kr�ger coordinate system 10-digit figure with 6 decimal places 
		//	32 Station�s longitude numeric 10 O  152-161 Longitude using Gauss-Kr�ger coordinate system 10-digit figure with 6 decimal places 
		//	33 Flag 12 for geographic details numeric 1 M  162 This field relates to fields 31-32;  0 or 3 (see point 2.2) 
		//	34 First day of validity of fare numeric 8 M  163-170 Expressed as: 'YYYYMMDD' 
		//	35 Version number numeric 2 M  171-172 Sequential version number related to the fare date; '01' for the first issue, '02' for the second, etc. 
		//	36 Last day of validity of fare numeric 8 M  173-180 Expressed as: 'YYYYMMDD' 
			
		
		try {
		
		String flag  		= st.substring(9, 10);
		
		if (flag.equals("2")) return null; //$NON-NLS-1$


		String nameUTF8 = new String(st.substring(15,50).getBytes(charset)).trim();
	
		String nameASCII 	= st.substring(51,68).trim();	

		String shortNameASCII 	= st.substring(69,86).trim();	
		
		int code	= 0;
		try  {
			code = Integer.parseInt(st.substring(4, 9));		
		} catch (Exception e) {
			//do nothing
		}

		int fareReferenceStationCode = 0;
		try {
			fareReferenceStationCode = Integer.parseInt(st.substring(129,134));		
		} catch (Exception e) {
			//do nothing
		}	
		
		int borderPointCode	= 0;
		try  {
			borderPointCode = Integer.parseInt(st.substring(92,96));		
		} catch (Exception e) {
			//do nothing
		}

		
		Legacy108Station station = GtmFactory.eINSTANCE.createLegacy108Station();
		
		station.setBorderPointCode(borderPointCode);
		station.setName(nameASCII);
		station.setNameUTF8(nameUTF8);
		station.setShortName(shortNameASCII);
		station.setStationCode(code);
		station.setFareReferenceStationCode(fareReferenceStationCode);
		
		return station;
		
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}

	}
	
	private LegacySeries decodeTCVSLine(String st, String timeZone) {
		
		try {
		
		String supplier   				= st.substring(0, 4);
		String number  					= st.substring(4, 9);
		String flag  					= st.substring(9, 10);
		
		if (flag.equals("2")) return null; //$NON-NLS-1$
		
		String type 					= st.substring(10,11);
		//String flag2 					= st.substring(11,12);		
		String departure 				= st.substring(12,17);		
		String departureStationName 	= st.substring(19,36);	
		
		String destination				= st.substring(37,42);		
		String destinationStationName 	= st.substring(44,61);	

		String carrier   	        	= st.substring(74,78);
		String routeDescription 		= st.substring(79,137);	

		String distanceKl2				= st.substring(138,143);
		String distanceKl1				= st.substring(144,149);		
		
		String calculation				= st.substring(150,151);		
		
			
		String via1						= st.substring(175,180);			
		String pos1						= st.substring(180,181);			
		String abr1 					= st.substring(181,182);	

		String via2						= st.substring(182,187);			
		String pos2						= st.substring(187,188);	
		String abr2 					= st.substring(188,189);
		
		String via3						= st.substring(189,194);			
		String pos3						= st.substring(194,195);	
		String abr3 					= st.substring(195,196);		
		
		String via4						= st.substring(196,201);			
		String pos4						= st.substring(201,202);	
		String abr4 					= st.substring(202,203);		
		
		String via5						= st.substring(203,208);			
		String pos5						= st.substring(208,209);	
		String abr5 					= st.substring(210,211);
		
		String validFromString 			= st.substring(211,219);		
		String validUntilString 		= st.substring(221,229);				
		
		LegacySeries series = GtmFactory.eINSTANCE.createLegacySeries();
		
		series.setCarrierCode(carrier);
		series.setSupplyingCarrierCode(supplier);
		series.setRouteDescription(routeDescription);
		series.setFromStationName(departureStationName);
		series.setToStationName(destinationStationName);
		
		series.setNumber(Integer.parseInt(number));
		
		if (type.equals("1")) series.setType(LegacySeriesType.TRANSIT); //$NON-NLS-1$
		if (type.equals("2")) series.setType(LegacySeriesType.BORDER_DESTINATION); //$NON-NLS-1$
		if (type.equals("3")) series.setType(LegacySeriesType.STATION_STATION); //$NON-NLS-1$

		if (calculation.equals("1")) series.setPricetype(LegacyCalculationType.DISTANCE_BASED); //$NON-NLS-1$
		if (calculation.equals("2")) series.setPricetype(LegacyCalculationType.ROUTE_BASED);		 //$NON-NLS-1$
		
		series.setFromStation(Integer.parseInt(departure));
		series.setToStation(Integer.parseInt(destination));
		
		series.setDistance1(Integer.parseInt(distanceKl1));
		series.setDistance2(Integer.parseInt(distanceKl2));

		Date dt = null;
		try {
		    dt = dateFormat.parse(validFromString);
		    series.setValidFrom(dt);
		} catch (ParseException e) {
		    e.printStackTrace();
		} 
		Date dt2 = null;
		try {
		    dt2 = dateFormat.parse(validUntilString);
		    series.setValidUntil(dt2);
		} catch (ParseException e) {
		    e.printStackTrace();
		} 
		
		
		int viaStation1 = Integer.parseInt(via1); 
		int viaStation2 = Integer.parseInt(via2); 
		int viaStation3 = Integer.parseInt(via3); 
		int viaStation4 = Integer.parseInt(via4); 
		int viaStation5 = Integer.parseInt(via5); 
		
		boolean includeOptionalVias = !PreferencesAccess.getBoolFromPreferenceStore(PreferenceConstants.P_REMOVE_OPTIONAL_VIAS);
		
		if (viaStation1 > 0 && (includeOptionalVias || !abr1.equals("1") ) ) {
			addViaStation(series, viaStation1, pos1);
		}
			
		if (viaStation2 > 0 && (includeOptionalVias || !abr2.equals("1") ) ) {
			addViaStation(series, viaStation2, pos2);
		}
		
		if (viaStation3 > 0 && (includeOptionalVias || !abr3.equals("1") ) ) {
			addViaStation(series, viaStation3, pos3);
		}
		
		if (viaStation4 > 0 && (includeOptionalVias || !abr4.equals("1") ) ) {
			addViaStation(series, viaStation4, pos4);
		}
		
		if (viaStation5 > 0 && (includeOptionalVias || !abr5.equals("1") ) ) {
			addViaStation(series, viaStation5, pos5);
		}
		
		return series;
		
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}

	}


	private void addViaStation(LegacySeries series, int via, String pos1) {
		LegacyViastation station = GtmFactory.eINSTANCE.createLegacyViastation();
		
		station.setCode(via);
		station.setPosition(Integer.parseInt(pos1));
		series.getViastations().add(station);
		
	}
	
	private void updateMERITSStations() {
		//correcting merits data using 108 data
		
		CompoundCommand command = new CompoundCommand();
		
		HashMap<Integer,Station> stations = GtmUtils.getStationMap(tool);
		
		int countryBase = tool.getConversionFromLegacy().getParams().getCountry().getCode() * 100000;
		
				
		for (Legacy108Station lStation : tool.getConversionFromLegacy().getLegacy108().getLegacyStations().getLegacyStations() ) {
			
			Station station = stations.get(Integer.valueOf(lStation.getStationCode() + countryBase));
			
			if (station != null) {
			
				if (lStation.getBorderPointCode() > 0) {
				
					if (station != null && station.isBorderStation() == false){
						
						Command com = SetCommand.create(domain, station, GtmPackage.Literals.STATION__BORDER_STATION, true);
						if (com != null && com.canExecute()) {
							command.append(com);	
						}
						Command comm2 = SetCommand.create(domain, station, GtmPackage.Literals.STATION__LEGACY_BORDER_POINT_CODE, lStation.getBorderPointCode());
						if (comm2 != null && comm2.canExecute()) {
							command.append(comm2);	
						}					
					
					}
				
				}
			
				if (lStation.getShortName() != null && 
					(station.getShortNameCaseASCII() == null || !station.getShortNameCaseASCII().equals(lStation.getShortName()))) {
					Command com = SetCommand.create(domain, station, GtmPackage.Literals.STATION__SHORT_NAME_CASE_ASCII, lStation.getShortName());
					if (com.canExecute()) {
						command.append(com);
					}
				}
				
				if ((lStation.getShortName() == null || lStation.getShortName().length() == 0) && 
					lStation.getName() !=null &&
					(station.getShortNameCaseASCII() == null || !station.getShortNameCaseASCII().equals(lStation.getName()))) {
					Command com = SetCommand.create(domain, station, GtmPackage.Literals.STATION__SHORT_NAME_CASE_ASCII, lStation.getName());
					if (com.canExecute()) {
						command.append(com);
					}
				}				
				
				if (lStation.getName() != null && 
					(station.getNameCaseASCII() == null || !station.getNameCaseASCII().equals(lStation.getName()))) {
					Command com = SetCommand.create(domain, station, GtmPackage.Literals.STATION__NAME_CASE_ASCII, lStation.getName());
					if (com.canExecute()) {
						command.append(com);					
					}
				}

				if (lStation.getNameUTF8() != null && 
					(station.getNameCaseUTF8() == null || !station.getNameCaseUTF8().equals(lStation.getNameUTF8()))) {
					Command com = SetCommand.create(domain, station, GtmPackage.Literals.STATION__NAME_CASE_UTF8, lStation.getNameUTF8());
					if (com.canExecute()) {
						command.append(com);					
					}
				}

				if (lStation.getBorderPointCode() != lStation.getBorderPointCode()) {
					Command com = SetCommand.create(domain, station, GtmPackage.Literals.STATION__LEGACY_BORDER_POINT_CODE, lStation.getBorderPointCode());
					if (com.canExecute()) {
						command.append(com);					
					}
				}
		
			}
		}
		
		if (command != null && !command.isEmpty()) {
			domain.getCommandStack().execute(command);
		}
		
	}
		

}
