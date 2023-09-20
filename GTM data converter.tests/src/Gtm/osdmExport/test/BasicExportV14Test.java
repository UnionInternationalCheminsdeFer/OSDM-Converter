package Gtm.osdmExport.test;

import org.junit.Before;
import org.junit.Test;


import Gtm.GTMTool;
import Gtm.GtmFactory;
import Gtm.converter.ConverterFromLegacy;
import Gtm.converter.ConverterToLegacy;
import Gtm.converter.tests.dataFactories.LegacyDataFactory;
import Gtm.converter.tests.mocks.MockedEditingDomain;
import Gtm.converter.tests.mocks.MockedProgressMonitor;
import Gtm.converter.tests.utils.TestUtils;
import Gtm.jsonImportExport.GtmJsonExporterV14;
import Gtm.utils.GtmUtils;
import gtmV14.FareDelivery;
import gtmV14.FareDeliveryDef;

                     
public class BasicExportV14Test {
	
	
	GTMTool tool = null;
	
	//@Mock
	GtmUtils gtmUtilsMock;
	
	//@InjectMocks 
	ConverterFromLegacy converterFromLegacy;	
	
	//@InjectMocks 
	ConverterToLegacy converterToLegacy;	
	
	@Before 
	public void initialize() {
		
		//MockitoAnnotations.initMocks(this);
				
		tool = LegacyDataFactory.createBasicData();
		
		//gtmUtilsMock = Mockito.mock(GtmUtils.class);				
		
		converterFromLegacy = new ConverterFromLegacy(tool, new MockedEditingDomain(), null);
		
		//prepare codelists
		converterFromLegacy.initializeConverter();
		
		//convert
		converterFromLegacy.convertToGtmTest(new MockedProgressMonitor());
		
		TestUtils.setIds(tool);
			
	}
	
	@Test 
	public void testBasicExport() {
		
		
		tool.getGeneralTariffModel().setDelivery(GtmFactory.eINSTANCE.createDelivery());
		tool.getGeneralTariffModel().getDelivery().setProvider(tool.getConversionFromLegacy().getLegacy108().getCarrier());
		
		GtmJsonExporterV14 exporter = new GtmJsonExporterV14();
		FareDelivery fd = exporter.convertToJson(tool.getGeneralTariffModel(), new MockedProgressMonitor());
		
		//validate export model
		assert (fd != null);
		
		assert(fd.getFareStructureDelivery() != null);
		
		FareDeliveryDef gtm = fd.getFareStructureDelivery();
		
		assert(gtm.getDelivery() != null);
		
		assert(gtm.getDelivery().getFareProvider().equals("9999"));
		
		assert(gtm.getDelivery().getVersion().equals("1.2"));
		
		assert(gtm.getDelivery().getOptionalDelivery() == false);
		
		assert(gtm.getDelivery().getAcceptedVersion().equals("1.2"));
		
		
		assert(gtm.getFareStructure() != null );
		
		assert(gtm.getFareStructure().getCalendars().size() == 1);
		
		assert(gtm.getFareStructure().getCarrierConstraints().size() == 1);
		
		assert(gtm.getFareStructure().getCombinationConstraints().size() == 1);
		
		assert(gtm.getFareStructure().getFareConstraintBundles().size() == 1);
		
		assert(gtm.getFareStructure().getFareReferenceStationSetDefinitions().size() == 2 );
		
		assert(gtm.getFareStructure().getConnectionPoints().size() == 2);
		
		assert(gtm.getFareStructure().getPassengerConstraints().size() == 1 );
		
		assert(gtm.getFareStructure().getFares().size() == 24 );
		assert(!gtm.getFareStructure().getFares().get(0).getInvolvedTCOs().isEmpty());
		
		assert(gtm.getFareStructure().getPrices().size() == 2 );
		
		assert(gtm.getFareStructure().getRegionalConstraints().size() == 12 );
		assert(gtm.getFareStructure().getRegionalConstraints().get(0).getRegionalValidity().get(0).getViaStations().getCarrierConstraintRef() != null);
		
		assert(gtm.getFareStructure().getSalesAvailabilityConstraint().size() == 1 );
		
		assert(gtm.getFareStructure().getStationNames().size() == 9 );	
		assert(gtm.getFareStructure().getStationNames().get(0).getCode() != null);
		
		
		
		
		

	}
}