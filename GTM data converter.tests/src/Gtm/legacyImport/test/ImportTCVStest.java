package Gtm.legacyImport.test;

import org.junit.Before;
import org.junit.Test;


import Gtm.GTMTool;
import Gtm.LegacyCalculationType;
import Gtm.LegacySeries;
import Gtm.LegacySeriesType;
import Gtm.converter.tests.dataFactories.LegacyDataFactory;
import Gtm.converter.tests.utils.TestUtils;
import Gtm.legacyImportExport.LegacyImporter;
import Gtm.utils.GtmUtils;

                     
public class ImportTCVStest {
	
	String line = 
			"1080010090101537200Aachen Sued(Gr)  01443100Basel Bad Bf     010000 0 0 0<1080>"
			+ "Koeln*Koblenz*(Frankfurt(M)/Mainz)*Karlsruhe              0005940005940202000"
			+ "0000000000000000000154581119023111106820190513014228110201912150120991231" + 
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
		
		LegacySeries series = importer.decodeTCVSLine(line, "UTC");
		
		assert(series != null);
		
		assert(series.getNumber() == 1009);
		
		assert(series.getBusCode().equals(" "));
		
		assert(series.getCarrierCode().equals("1080"));
		
		assert(series.getDistance1() == 594);
		
		assert(series.getDistance2() == 594);
		
		assert(series.getFareTableNumber() == 2000);
		
		assert(series.getFerryCode().equals(" "));
		
		assert (series.getFromStation() == 15372);
		
		assert(series.getFromStationName().equals("Aachen Sued(Gr)"));
		
		assert (series.getToStation() == 14431);
		
		assert(series.getToStationName().equals("Basel Bad Bf"));
		
		assert(series.getMemoNumber() == 0);
		
		assert(series.getPricetype().equals(LegacyCalculationType.ROUTE_BASED));
		
		assert(series.getRouteNumber() == 0);
		
		assert(series.getSupplyingCarrierCode().equals("1080"));
		
		assert(series.getType().equals(LegacySeriesType.TRANSIT));
		
		assert(TestUtils.getDateString(series.getValidFrom()).equals("20191215"));
		
		assert(TestUtils.getDateString(series.getValidUntil()).equals("20991231"));
		
		assert(series.getViastations().size() == 5);
		
		assert(series.getViastations().get(0).getCode() == 15458);
		assert(series.getViastations().get(0).getPosition() == 1);
		
		assert(series.getViastations().get(1).getCode() == 19023);
		assert(series.getViastations().get(1).getPosition() == 1);
	
		assert(series.getViastations().get(2).getCode() == 11068);
		assert(series.getViastations().get(2).getPosition() == 2);
	
		assert(series.getViastations().get(3).getCode() == 19051);
		assert(series.getViastations().get(3).getPosition() == 3);
	
		assert(series.getViastations().get(4).getCode() == 14228);
		assert(series.getViastations().get(4).getPosition() == 1);
	
		

	}
}
