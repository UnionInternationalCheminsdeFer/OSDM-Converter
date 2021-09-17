package Gtm.osdmExport.test;

import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;

import Gtm.GTMTool;
import Gtm.GtmFactory;
import Gtm.converter.ConverterFromLegacy;
import Gtm.converter.ConverterToLegacy;
import Gtm.converter.tests.dataFactories.LegacyDataFactory;
import Gtm.converter.tests.mocks.MockedEditingDomain;
import Gtm.converter.tests.mocks.MockedProgressMonitor;
import Gtm.jsonImportExport.GtmJsonExporter;
import Gtm.utils.GtmUtils;
import gtm.FareDelivery;

                     
public class BasicExportTest {
	
	
	GTMTool tool = null;
	
	@Mock
	GtmUtils gtmUtilsMock;
	
	@InjectMocks 
	ConverterFromLegacy converterFromLegacy;	
	
	@InjectMocks 
	ConverterToLegacy converterToLegacy;	
	
	@Before 
	public void initialize() {
		
		MockitoAnnotations.initMocks(this);
				
		tool = LegacyDataFactory.createBasicData();
		
		gtmUtilsMock = Mockito.mock(GtmUtils.class);				
		
		converterFromLegacy = new ConverterFromLegacy(tool, new MockedEditingDomain(), null);
		
		//prepare codelists
		converterFromLegacy.initializeConverter();
		
		//convert
		converterFromLegacy.convertToGtmTest(new MockedProgressMonitor());
			
	}
	
	@Test 
	public void testBasicExport() {
		
		
		tool.getGeneralTariffModel().setDelivery(GtmFactory.eINSTANCE.createDelivery());
		tool.getGeneralTariffModel().getDelivery().setProvider(tool.getConversionFromLegacy().getLegacy108().getCarrier());
		
		GtmJsonExporter exporter = new GtmJsonExporter();
		FareDelivery fd = exporter.convertToJson(tool.getGeneralTariffModel(), new MockedProgressMonitor());
		
		//validate export model
		assert (fd != null);
		
		assert(fd.getFareStructureDelivery() != null);
		
		assert(fd.getFareStructureDelivery().getDelivery() != null);
		
		assert(fd.getFareStructureDelivery().getDelivery().getFareProvider().equals("9999"));
		
		assert(fd.getFareStructureDelivery().getDelivery().getVersion().equals("1.2"));
		
		assert(fd.getFareStructureDelivery().getDelivery().getOptionalDelivery() == false);
		
		assert(fd.getFareStructureDelivery().getDelivery().getAcceptedVersion().equals("1.2"));
		
		
		assert(fd.getFareStructureDelivery().getFareStructure() != null );
		
		assert(fd.getFareStructureDelivery().getFareStructure().getCalendars().size() == 1);
		
		assert(fd.getFareStructureDelivery().getFareStructure().getCarrierConstraints().size() == 1);
		
		assert(fd.getFareStructureDelivery().getFareStructure().getCombinationConstraints().size() == 1);
		
		assert(fd.getFareStructureDelivery().getFareStructure().getFareConstraintBundles().size() == 1);
		
		assert(fd.getFareStructureDelivery().getFareStructure().getFareReferenceStationSetDefinitions().size() == 2 );
		
		assert(fd.getFareStructureDelivery().getFareStructure().getConnectionPoints().size() == 2);
		
		assert(fd.getFareStructureDelivery().getFareStructure().getPassengerConstraints().size() == 1 );
		
		assert(fd.getFareStructureDelivery().getFareStructure().getFares().size() == 24 );
		
		assert(fd.getFareStructureDelivery().getFareStructure().getPrices().size() == 2 );
		
		assert(fd.getFareStructureDelivery().getFareStructure().getRegionalConstraints().size() == 12 );
		
		assert(fd.getFareStructureDelivery().getFareStructure().getSalesAvailabilityConstraint().size() == 1 );
		
		assert(fd.getFareStructureDelivery().getFareStructure().getStationNames().size() == 9 );
		
		
		
		

	}
}