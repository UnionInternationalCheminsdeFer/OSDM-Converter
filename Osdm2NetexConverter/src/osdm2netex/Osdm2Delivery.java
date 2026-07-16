package osdm2netex;

import java.util.ArrayList;
import java.util.Calendar;

import org.eclipse.core.runtime.IProgressMonitor;

import Gtm.FareStructure;
import Gtm.FulfillmentType;
import Gtm.GeneralTariffModel;
import uk.org.netex.netex.DataObjectsRelStructure;
import uk.org.netex.netex.DistributionAssignment;
import uk.org.netex.netex.DistributionAssignmentsRelStructure;
import uk.org.netex.netex.DistributionRightsEnumeration;
import uk.org.netex.netex.FareFrame;
import uk.org.netex.netex.FareProductsInFrameRelStructure;
import uk.org.netex.netex.FareSeriesInFrameRelStructure;
import uk.org.netex.netex.FareStructureElementsInFrameRelStructure;
import uk.org.netex.netex.FareTablesInFrameRelStructure;
import uk.org.netex.netex.FareTablesRelStructure;
import uk.org.netex.netex.FareZonesInFrameRelStructure;
import uk.org.netex.netex.ObjectFactory;
import uk.org.netex.netex.PricingServiceRefStructure;
import uk.org.netex.netex.PublicationDeliveryStructure;
import uk.org.netex.netex.ResourceFrame;
import uk.org.netex.netex.SalesOfferPackage;
import uk.org.netex.netex.SalesOfferPackageElementsRelStructure;
import uk.org.netex.netex.SalesOfferPackagesInFrameRelStructure;
import uk.org.netex.netex.SiteFrame;
import uk.org.netex.netex.StatusEnumeration;
import uk.org.netex.netex.Tariff;
import uk.org.netex.netex.TransportOrganisationRefStructure;
import uk.org.netex.netex.TypeOfTravelDocument;

public class Osdm2Delivery {
	

	
	public static PublicationDeliveryStructure convert(IProgressMonitor monitor, GeneralTariffModel osdm) {
		
		ObjectFactory factory = new ObjectFactory();
		
		Gtm.FareStructure osdmFares = osdm.getFareStructure();	
		
		FareSeriesInFrameRelStructure seriesList = factory.createFareSeriesInFrameRelStructure();

		FareStructureElementsInFrameRelStructure structureList = factory.createFareStructureElementsInFrameRelStructure();
		 
		FareProductsInFrameRelStructure productsList = factory.createFareProductsInFrameRelStructure();
		
		FareTablesInFrameRelStructure tablesStructure = factory.createFareTablesInFrameRelStructure();
		
		SalesOfferPackage salesOfferPackageNrt = factory.createSalesOfferPackage();
		
		PricingServiceRefStructure osdmPricingServiceRef = factory.createPricingServiceRefStructure();
		
		//Publication
		PublicationDeliveryStructure delivery = factory.createPublicationDeliveryStructure();
		DataObjectsRelStructure dos = factory.createDataObjectsRelStructure();
		delivery.setParticipantRef(UrnUtils.getCompanyUri(osdm.getDelivery().getProvider()));
		delivery.setVersion(osdm.getDelivery().getId());
		
		//Site frame to hold the stations
		SiteFrame siteFrame = Osdm2Stations.convertStations(osdm);
		dos.getCompositeFrameOrCommonFrame().add(factory.createSiteFrame(siteFrame));
		
		//deactivate the previous delivered fare frame
        FareFrame oldFareFrame = null;
        if (osdm.getDelivery().getReplacedDeliveryId() != null) {
        	oldFareFrame = factory.createFareFrame();
        	oldFareFrame.setId(IdFactory.getOldFareFrameId(osdm.getDelivery()));
			oldFareFrame.setVersion(osdm.getDelivery().getId());		
			oldFareFrame.setStatus(StatusEnumeration.INACTIVE);     
			dos.getCompositeFrameOrCommonFrame().add(factory.createFareFrame(oldFareFrame));
        }

        //resource frame to hold the organizations
		ResourceFrame resourceFrameNrt = factory.createResourceFrame();
		resourceFrameNrt.setId(IdFactory.getResourceFrameId(osdm.getDelivery()));
		//Organisations
		resourceFrameNrt.setGroupsOfOperators(factory.createGroupsOfOperatorsInFrameRelStructure());
		resourceFrameNrt.setOrganisations(factory.createOrganisationsInFrameRelStructure());
		TransportOrganisationRefStructure to = factory.createTransportOrganisationRefStructure();
		to.setValue(osdm.getDelivery().getProvider().getName());
		to.setUri(UrnUtils.getCompanyUri(osdm.getDelivery().getProvider()));
		dos.getCompositeFrameOrCommonFrame().add(factory.createResourceFrame(resourceFrameNrt));
		
		//fare frame
		FareFrame fareFrameNrt = factory.createFareFrame();
		fareFrameNrt.setId(IdFactory.getFareFrameId(osdm.getDelivery()));
		fareFrameNrt.setVersion(osdm.getDelivery().getId());		
		fareFrameNrt.setStatus(StatusEnumeration.ACTIVE);
		fareFrameNrt.setCreated(DateUtils.toXMLGregorianCalendar(Calendar.getInstance().getTime()));
		dos.getCompositeFrameOrCommonFrame().add(factory.createFareFrame(fareFrameNrt));
		
		
		delivery.setDataObjects(dos);		
		
        //pricing service
		osdmPricingServiceRef.setUri("OSDM");
		

		//populate fare frame
		fareFrameNrt.setTransportOrganisationRef(factory.createTransportOrganisationRef(to));
		
    	//add SalesOfferPackageto the fare frame
		SalesOfferPackagesInFrameRelStructure sops = factory.createSalesOfferPackagesInFrameRelStructure();
		FareTablesRelStructure ftrs = factory.createFareTablesRelStructure();
        salesOfferPackageNrt.setFareTables(ftrs);
        salesOfferPackageNrt.setPricingServiceRef(osdmPricingServiceRef);
        SalesOfferPackageElementsRelStructure sope = factory.createSalesOfferPackageElementsRelStructure();
        salesOfferPackageNrt.setSalesOfferPackageElements(sope);
        
        DistributionAssignmentsRelStructure dar = factory.createDistributionAssignmentsRelStructure();
        DistributionAssignment da = factory.createDistributionAssignment();        
        ArrayList<DistributionRightsEnumeration> drl = new ArrayList<DistributionRightsEnumeration>();
        drl.add(DistributionRightsEnumeration.NONE);
        da.getRest().add(factory.createDistributionAssignmentVersionStructureDistributionRights(drl));
        dar.getDistributionAssignmentRefOrDistributionAssignment().add(da);
        salesOfferPackageNrt.setDistributionAssignments(dar);
        
        sops.getSalesOfferPackage().add(salesOfferPackageNrt);
		fareFrameNrt.setSalesOfferPackages(sops);
		
		

		/*
		Tariff t = factory.createTariff();
		fareFrameNrt.setTariffs(factory.createTariffsInFrameRelStructure());
		fareFrameNrt.getTariffs().getTariff().add(t);
		*/

		fareFrameNrt.setAccessRightParameterAssignments(factory.createAccessRightParameterAssignmentsInFrameRelStructure());
		fareFrameNrt.setUsageParameters(factory.createUsageParametersInFrameRelStructure());;

		fareFrameNrt.setAlternativeTexts(factory.createAlternativeTextsRelStructure());	
		Osdm2MultiLanguageString.convertTexts(osdm.getFareStructure().getTexts(), fareFrameNrt);

		fareFrameNrt.setBrandingRef(null);
		fareFrameNrt.setFareSections(null);
		fareFrameNrt.setFareTables(null);
	
		//fareFrameNrt.setFareScheduledStopPoints(convertStations(osdmFares.getStationNames(), osdmFares, factory));
	
		// add the fare station sets as zones to the fare frame
		FareZonesInFrameRelStructure zones = factory.createFareZonesInFrameRelStructure();
		zones.setId("zones_" + osdm.getDelivery().getId());
		Osdm2Zones.convertFareStationSets(osdmFares.getFareStationSetDefinitions(), zones);
		fareFrameNrt.setFareZones(zones);
		
		//prepare the frame to hold fare elements
		fareFrameNrt.setFareProducts(productsList);		
		fareFrameNrt.setFareTables(tablesStructure);	
		fareFrameNrt.setResponsibilitySetRef(null);
		fareFrameNrt.setSeriesConstraints(seriesList);
	
		fareFrameNrt.setFareStructureElements(structureList);
		

		//add fare structure elements
		Osdm2FareStructureElements.convertToFareStructureElements(osdmFares, resourceFrameNrt, structureList, fareFrameNrt);
		
		//convertSeries();
		// add the fare elements (prices and refereces to fare structure elements)
		convertFares(osdmFares, fareFrameNrt);
	
		
		/*
		QualityStructureFactorsRelStructure qfs = factory.createQualityStructureFactorsRelStructure();
		fareFrameNrt.setQualityStructureFactors(qfs);
		fareFrameNrt.setTimeIntervals(null);
		*/
		
		//set publication dates
		delivery.setPublicationTimestamp(DateUtils.toXMLGregorianCalendar(Calendar.getInstance().getTime()));			
		
		return delivery;
		
		
	}
	
	private static void convertFares(FareStructure osdmFares, FareFrame fareFrameNrt) {
		
		OsdmReductionCard2Entitlement.convertToSalesDicountRights(osdmFares, fareFrameNrt);
		
		for (Gtm.FareElement fare : osdmFares.getFareElements().getFareElements()) {
			
			if (TestFareSelector.selectRegionalConstraint(fare.getRegionalConstraint()) ) {
			
				Osdm2FareProduct.convertFare (fare,fareFrameNrt);
				
			}

		}
		
	}

	


}
