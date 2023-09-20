package Gtm.legacyImport.test;

import org.junit.Before;
import org.junit.Test;


import Gtm.GTMTool;
import Gtm.converter.tests.dataFactories.LegacyDataFactory;
import Gtm.legacyImportExport.LegacyImporter;
import Gtm.utils.GtmUtils;

                     
public class ImportTCVtest {
	
	String line = "1080DB AG                         200010800236450000000000000000310000"
			+ "31000506023129023161023130023160000000000000000000000000000000000000000000"
			+ "201912150120991231"
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
	public void testImportTCV() {
		
		String fileName = importer.decodeTCVLine(line);
		
		assert(fileName != null);
		
		assert(fileName.equals("20001080"));	

	}
}
