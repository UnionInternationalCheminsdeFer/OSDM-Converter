package Gtm.legacyImport.test;

import org.junit.Before;
import org.junit.Test;


import Gtm.GTMTool;
import Gtm.Legacy108Station;
import Gtm.converter.tests.dataFactories.LegacyDataFactory;
import Gtm.legacyImportExport.LegacyImporter;
import Gtm.utils.GtmUtils;

                     
public class ImportTCVGtest {
	
	String line = "108015372000000Aachen Süd(Gr)                     0Aachen Sued(Gr)  0Aach"
			+ "en Sued(Gr)  000000045202 A070000000000000020          0000000000000000000000"
			+ "000000000000201912150120991231"
			+ '\r' 
			+ '\n'; 
	
	//@Mock
	GtmUtils gtmUtilsMock;
	
	GTMTool tool = null;
	
	//@InjectMocks 
	LegacyImporter importer;
	
	@Before 
	public void initialize() {
		
		//MockitoAnnotations.initMocks(this);
				
		tool = LegacyDataFactory.createBasicData();
		
		importer = new LegacyImporter(tool, null, null, null);
					
	}
	
	@Test 
	public void testImportTCVM() {
		
		Legacy108Station station = importer.decodeTCVGLine(line);
		
		assert(station != null);
		
		assert(station.getStationCode() == 15372);
	
		assert(station.getBorderPointCode() == 452);
		
		assert(station.getFareReferenceStationCode() == 0);
		
		assert(station.getName().equals("Aachen Sued(Gr)"));
		
		assert(station.getNameUTF8().equals("Aachen Süd(Gr)"));
		
		assert(station.getShortName().equals("Aachen Sued(Gr)"));
		
		assert(station.getShortNameUtf8() == null);
		

	}
}
