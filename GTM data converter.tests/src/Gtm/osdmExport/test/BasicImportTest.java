package Gtm.osdmExport.test;

import org.junit.Before;
import org.junit.Test;


import Gtm.GTMTool;
import Gtm.GeneralTariffModel;
import Gtm.GtmFactory;
import Gtm.converter.ConverterFromLegacy;
import Gtm.converter.ConverterToLegacy;
import Gtm.converter.tests.dataFactories.LegacyDataFactory;
import Gtm.converter.tests.mocks.MockedEditingDomain;
import Gtm.converter.tests.mocks.MockedProgressMonitor;
import Gtm.converter.tests.utils.TestUtils;
import Gtm.jsonImportExport.GTMJsonImporterGeneric;
import Gtm.jsonImportExport.GtmJsonExporterV35;
import Gtm.utils.GtmUtils;
import gtmV35.FareDelivery;

                     
public class BasicImportTest {
	
	
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
	public void testBasicImport() {
		
		
		
		tool.getGeneralTariffModel().setDelivery(GtmFactory.eINSTANCE.createDelivery());
		tool.getGeneralTariffModel().getDelivery().setProvider(tool.getConversionFromLegacy().getLegacy108().getCarrier());
		
		GtmJsonExporterV35 exporter = new GtmJsonExporterV35();
		FareDelivery fd = exporter.convertToJson(tool.getGeneralTariffModel(), new MockedProgressMonitor());
		
		GTMJsonImporterGeneric importer = new GTMJsonImporterGeneric(tool, null, null);

		GeneralTariffModel gtm = importer.convertFromJson(fd);
		
		TestUtils.setIds(tool);
		
		//validate import model
		assert (gtm != null);
		
		assert(gtm.getDelivery() != null);
		
		
		assert(gtm.getDelivery().getProvider().getCode().equals("9999"));
		
		assert(gtm.getDelivery().getSchemaVersion().getLiteral().equals("1.2"));
		
		assert(gtm.getDelivery().isOptional() == false);
		
		assert(gtm.getDelivery().getAcceptedSchemaVersion().getLiteral().equals("1.2"));
		
		
		assert(gtm.getFareStructure() != null );
		
		assert(gtm.getFareStructure().getCalendars().getCalendars().size() == 1);
		
		assert(gtm.getFareStructure().getCarrierConstraints().getCarrierConstraints().size() == 1);
		
		assert(gtm.getFareStructure().getCombinationConstraints().getCombinationConstraints().size() == 1);
		
		assert(gtm.getFareStructure().getFareConstraintBundles().getFareConstraintBundles().size() == 1);
		
		assert(gtm.getFareStructure().getFareStationSetDefinitions().getFareStationSetDefinitions().size() == 2 );
		
		assert(gtm.getFareStructure().getConnectionPoints().getConnectionPoints().size() == 2);
		
		assert(gtm.getFareStructure().getPassengerConstraints().getPassengerConstraints().size() == 1 );
		
		assert(gtm.getFareStructure().getFareElements().getFareElements().size() == 24 );
		assert(!gtm.getFareStructure().getFareElements().getFareElements().get(0).getInvolvedTcos().isEmpty());

		
		assert(gtm.getFareStructure().getPrices().getPrices().size() == 2 );
		
		assert(gtm.getFareStructure().getRegionalConstraints().getRegionalConstraints().size() == 12 );
		assert(gtm.getFareStructure().getRegionalConstraints().getRegionalConstraints().get(0).getRegionalValidity().get(0).getViaStation().getCarrierConstraint() != null);
		assert(gtm.getFareStructure().getRegionalConstraints().getRegionalConstraints().get(0).getRegionalValidity().get(0).getViaStation().getCarrierConstraint().getIncludedCarriers().size() == 1);
		
		assert(gtm.getFareStructure().getSalesAvailabilityConstraints().getSalesAvailabilityConstraints().size() == 1 );
		
		assert(gtm.getFareStructure().getStationNames().getStationName().size() == 9 );
		assert(gtm.getFareStructure().getStationNames().getStationName().get(0).getStationCode() > 0);
		
	
		
	}
}