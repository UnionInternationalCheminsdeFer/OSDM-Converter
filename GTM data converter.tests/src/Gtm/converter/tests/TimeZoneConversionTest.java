package Gtm.converter.tests;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.junit.Before;
import org.junit.Test;
//import org.mockito.InjectMocks;
//import org.mockito.Mock;
//import org.mockito.Mockito;
//import org.mockito.MockitoAnnotations;

import Gtm.GTMTool;
import Gtm.TimeZone;
import Gtm.converter.ConverterFromLegacy;
import Gtm.converter.ConverterToLegacy;
import Gtm.converter.tests.dataFactories.LegacyDataFactory;
import Gtm.converter.tests.mocks.MockedEditingDomain;
import Gtm.converter.tests.mocks.MockedProgressMonitor;
import Gtm.utils.GtmUtils;

                     
public class TimeZoneConversionTest {
	
	GTMTool tool = null;
	
//	@Mock
	GtmUtils gtmUtilsMock;
	
//	@InjectMocks 
	ConverterFromLegacy converter2osdm;	
	
//	@InjectMocks 
	ConverterToLegacy converter2legacy;	

	@Before
	public void setUp() throws Exception {
//		MockitoAnnotations.initMocks(this);
				
		tool = LegacyDataFactory.createBasicData();	
			
		
		tool.getConversionFromLegacy().getLegacy108().setTimeZone(TimeZone.EET);
		
		
//		gtmUtilsMock = Mockito.mock(GtmUtils.class);				
		
		converter2osdm = new ConverterFromLegacy(tool, new MockedEditingDomain(), null);
		
		//prepare codelists
		converter2osdm.initializeConverter();
		
		//convert
		converter2osdm.convertToGtmTest(new MockedProgressMonitor());
			
	}
	
	@Test 
	public void testTimeZoneConversion() {
		
		DateFormat osdmDate = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ssZZZ");
		osdmDate.setTimeZone(java.util.TimeZone.getTimeZone("UTC"));
		String datetime = "2021-12-12T01:00:00+0200";
		Date date = null;
		try {
			date = osdmDate.parse(datetime);
		} catch (ParseException e) {
			assert(false);
		}
		
		DateFormat dateFormat = new SimpleDateFormat("yyyyMMdd"); //$NON-NLS-1$
		
		String timeZone = null;
		
		if (tool.getConversionFromLegacy().getLegacy108().getTimeZone() != null) {
			timeZone = tool.getConversionFromLegacy().getLegacy108().getTimeZone().getName();
		}
		if (timeZone == null || timeZone.length() < 3) {
			timeZone = "UTC"; //$NON-NLS-1$
		}
		dateFormat.setTimeZone(java.util.TimeZone.getTimeZone(timeZone)); 
		String dateString = dateFormat.format(date);
		
		assert("20211212".equals(dateString));

	}
}
