package osdm2netex;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Calendar;

import jakarta.xml.bind.JAXBElement;

import org.eclipse.core.runtime.IProgressMonitor;

import Gtm.FareStructure;
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
import uk.org.netex.netex.PublicCodeStructure;
import uk.org.netex.netex.PublicationDeliveryStructure;
import uk.org.netex.netex.QualityStructureFactorsRelStructure;
import uk.org.netex.netex.ResourceFrame;
import uk.org.netex.netex.SalesOfferPackage;
import uk.org.netex.netex.SalesOfferPackageElementsRelStructure;
import uk.org.netex.netex.SalesOfferPackagesInFrameRelStructure;
import uk.org.netex.netex.SiteFrame;
import uk.org.netex.netex.StatusEnumeration;
import uk.org.netex.netex.StopPlace;
import uk.org.netex.netex.StopPlacesInFrameRelStructure;
import uk.org.netex.netex.Tariff;
import uk.org.netex.netex.TransportOrganisationRefStructure;

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
		delivery.setParticipantRef(Osdm2Company.getCompanyUri(osdm.getDelivery().getProvider().getCode()));
		delivery.setVersion(osdm.getDelivery().getId());
		
		
		
		SiteFrame siteFrame = convertStations(osdm);
		
        FareFrame oldFareFrame = null;
        if (osdm.getDelivery().getReplacedDeliveryId() != null) {
        	oldFareFrame = factory.createFareFrame();
        	oldFareFrame.setId(osdm.getDelivery().getReplacedDeliveryId());
        }

		ResourceFrame resourceFrameNrt = factory.createResourceFrame();
		resourceFrameNrt.setId("resources_" + osdm.getDelivery().getId());
		
		FareFrame fareFrameNrt = factory.createFareFrame();
		fareFrameNrt.setId("fareFrame_" + osdm.getDelivery().getId());
		fareFrameNrt.setVersion(osdm.getDelivery().getId());		
		fareFrameNrt.setStatus(StatusEnumeration.INACTIVE);
		fareFrameNrt.setCreated(DateUtils.toXMLGregorianCalendar(Calendar.getInstance().getTime()));
		
		JAXBElement<ResourceFrame> jResourceFrame = factory.createResourceFrame(resourceFrameNrt);
		JAXBElement<FareFrame> jFareFrameNrt = factory.createFareFrame(fareFrameNrt);
		JAXBElement<FareFrame> jOldFareFrameNrt = factory.createFareFrame(oldFareFrame);		
		JAXBElement<SiteFrame> jSiteFrame = factory.createSiteFrame(siteFrame);

		dos.getCompositeFrameOrCommonFrame().add(jResourceFrame);
		dos.getCompositeFrameOrCommonFrame().add(jSiteFrame);
		dos.getCompositeFrameOrCommonFrame().add(jOldFareFrameNrt);
		dos.getCompositeFrameOrCommonFrame().add(jFareFrameNrt);
		delivery.setDataObjects(dos);		
		
        
        //pricing service
		osdmPricingServiceRef.setUri("OSDM");
		
		//Organisations
		resourceFrameNrt.setGroupsOfOperators(factory.createGroupsOfOperatorsInFrameRelStructure());
		resourceFrameNrt.setOrganisations(factory.createOrganisationsInFrameRelStructure());
		

		TransportOrganisationRefStructure to = factory.createTransportOrganisationRefStructure();
		to.setValue(osdm.getDelivery().getProvider().getName());
		to.setUri(Osdm2Company.getCompanyUri(osdm.getDelivery().getProvider().getCode()));
		
		fareFrameNrt.setTransportOrganisationRef(factory.createTransportOrganisationRef(to));
		
    	//SalesOfferPackage
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
		
		Tariff t = factory.createTariff();
		fareFrameNrt.setTariffs(factory.createTariffsInFrameRelStructure());
		fareFrameNrt.getTariffs().getTariff().add(t);

		fareFrameNrt.setAccessRightParameterAssignments(factory.createAccessRightParameterAssignmentsInFrameRelStructure());
		fareFrameNrt.setUsageParameters(factory.createUsageParametersInFrameRelStructure());;

		fareFrameNrt.setAlternativeTexts(factory.createAlternativeTextsRelStructure());	
		Osdm2MultiLanguageString.convertTexts(osdm.getFareStructure().getTexts(), fareFrameNrt);

		
		fareFrameNrt.setBrandingRef(null);
		fareFrameNrt.setFareSections(null);
		fareFrameNrt.setFareTables(null);
	
		
		//fareFrameNrt.setFareScheduledStopPoints(convertStations(osdmFares.getStationNames(), osdmFares, factory));
	
		FareZonesInFrameRelStructure zones = factory.createFareZonesInFrameRelStructure();
		zones.setId("zones_" + osdm.getDelivery().getId());
		Osdm2Zones.convertFareStationSets(osdmFares.getFareStationSetDefinitions(), zones);
		fareFrameNrt.setFareZones(zones);
		
		
		
		fareFrameNrt.setFareProducts(productsList);		
		fareFrameNrt.setFareTables(tablesStructure);	
		fareFrameNrt.setResponsibilitySetRef(null);
		fareFrameNrt.setSeriesConstraints(seriesList);
	
		fareFrameNrt.setFareStructureElements(structureList);
		

		Osdm2FareStructureElements.convertToFareStructureElements(osdmFares, resourceFrameNrt, structureList, fareFrameNrt);
		
		//convertSeries();
		
		convertFares(osdmFares, fareFrameNrt);
	
		QualityStructureFactorsRelStructure qfs = factory.createQualityStructureFactorsRelStructure();
		fareFrameNrt.setQualityStructureFactors(qfs);
		fareFrameNrt.setTimeIntervals(null);
		
		fareFrameNrt.setValidityConditions(null);
		fareFrameNrt.setUsageParameters(null);
		
		
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

	
	private static SiteFrame convertStations (GeneralTariffModel osdm) {
		
		ObjectFactory factory = new ObjectFactory();
		
		SiteFrame siteFrame = factory.createSiteFrame();
		siteFrame.setId("Stations_" + osdm.getDelivery().getId());
		
		StopPlacesInFrameRelStructure places = factory.createStopPlacesInFrameRelStructure();
		
		for ( Gtm.Station s : osdm.getFareStructure().getStationNames().getStationName()) {
			
			
			if (TestFareSelector.selectStation(s,  osdm.getFareStructure().getStationNames())) {
			
				StopPlace stop = factory.createStopPlace();
				
				stop.setId(UrnUtils.getStationUri(s.getStationCode()));
				stop.setName(Osdm2MultiLanguageString.getMultiLanguageString(s.getName()));
				stop.setShortName(Osdm2MultiLanguageString.getMultiLanguageString(s.getShortNameCaseUTF8()));
				
				PublicCodeStructure pcs = factory.createPublicCodeStructure();
				pcs.setType("UIC");		
				pcs.setValue(UrnUtils.getStationUri(s.getStationCode()));		
				stop.setPublicCode(pcs);
				
				stop.setCentroid(factory.createSimplePointVersionStructure());
				stop.getCentroid().setLocation(factory.createLocationStructure());
				stop.getCentroid().getLocation().setLatitude(new BigDecimal(s.getLatitude()));
				stop.getCentroid().getLocation().setLongitude(new BigDecimal(s.getLongitude()));
								
				places.getStopPlace().add(stop);
				
			}
		}
		
		siteFrame.setStopPlaces(places);
		
		return siteFrame;
	}

}
