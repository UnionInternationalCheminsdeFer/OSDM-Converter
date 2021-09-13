package Gtm.legacyImport.test;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import Gtm.GTMTool;
import Gtm.Legacy108Memo;
import Gtm.converter.tests.dataFactories.LegacyDataFactory;
import Gtm.legacyImportExport.LegacyImporter;
import Gtm.utils.GtmUtils;

                     
public class ImportTCVMtest {
	
	String line = "108011110IC Bus:                                                     Für "
			+ "Busstrecken gelten die gesetzlichen                     Vorschriften der jewe"
			+ "iligen Länder für die Personen-        beförderung auf der Straße.           "
			+ "                      IC Bus:                                                "
			+ "     Pour les lignes de bus, les dispositions                    légales de c"
			+ "haque pays pour le transport de voyageurs       sur la route s'appliquent.   "
			+ "                               IC Bus:                                       "
			+ "              Für Busstrecken gelten die gesetzlichen                     Vor"
			+ "schriften der jeweiligen Länder für die Personen-        beförderung auf der "
			+ "Straße.                                 IC Bus:                              "
			+ "                       For bus routes the legal regulations                  "
			+ "      for passenger transportation by road                        of the resp"
			+ "ective countries are to be applied.                                          "
			+ "                                                                             "
			+ "                                                                             "
			+ "                                                          0201912150120991231"
			+ '\r' 
			+ '\n'; 
	
	@Mock
	GtmUtils gtmUtilsMock;
	
	GTMTool tool = null;
	
	//@InjectMocks 
	LegacyImporter importer;
	
	@Before 
	public void initialize() {
		
		MockitoAnnotations.initMocks(this);
				
		tool = LegacyDataFactory.createBasicData();
		
		importer = new LegacyImporter(tool, null, null, null);
					
	}
	
	@Test 
	public void testImportTCVM() {
		
		Legacy108Memo memo = importer.decodeTCVMLine(line);
		
		assert(memo != null);
		
		assert(memo.getNumber() == 1111);
		
		String local = 
				"IC Bus:                                                     "+'\n' + 
				"Für Busstrecken gelten die gesetzlichen                     "+'\n' + 
				"Vorschriften der jeweiligen Länder für die Personen-        "+'\n' + 
				"beförderung auf der Straße.                                 ";
		
		assert(memo.getLocal().equals(local));
		
		String english = 
				"IC Bus:                                                     "+'\n' + 
				"For bus routes the legal regulations                        "+'\n' + 
				"for passenger transportation by road                        "+'\n' +  
				"of the respective countries are to be applied.              ";         
		
		assert(memo.getEnglish().equals(english));
		
		
		String french = 
				"IC Bus:                                                     "+'\n' + 
				"Pour les lignes de bus, les dispositions                    "+'\n' +  
				"légales de chaque pays pour le transport de voyageurs       "+'\n' +  
				"sur la route s'appliquent.                                  ";
		
		assert(memo.getFrench().equals(french));
		
		String german = 
				"IC Bus:                                                     "+'\n' +  
				"Für Busstrecken gelten die gesetzlichen                     "+'\n' + 
				"Vorschriften der jeweiligen Länder für die Personen-        "+'\n' + 
				"beförderung auf der Straße.                                 ";
		
		assert(memo.getGerman().equals(german));

	}
}
