package osdm2netex;

import java.util.ArrayList;
import java.util.Calendar;

import jakarta.xml.bind.JAXBElement;

import org.eclipse.core.runtime.IProgressMonitor;

import Gtm.FareStructure;
import Gtm.GeneralTariffModel;
import Gtm.RegionalConstraint;
import Gtm.StationNames;
import Gtm.util.RouteDescriptionBuilder;
import uk.org.netex.netex.ConnectionRefStructure;
import uk.org.netex.netex.DataObjectsRelStructure;
import uk.org.netex.netex.DistributionAssignment;
import uk.org.netex.netex.DistributionAssignmentsRelStructure;
import uk.org.netex.netex.DistributionRightsEnumeration;
import uk.org.netex.netex.FareBasisEnumeration;
import uk.org.netex.netex.FareFrame;
import uk.org.netex.netex.FareProductsInFrameRelStructure;
import uk.org.netex.netex.FareScheduledStopPointsInFrameRelStructure;
import uk.org.netex.netex.FareSeriesInFrameRelStructure;
import uk.org.netex.netex.FareStructureElementsInFrameRelStructure;
import uk.org.netex.netex.FareTablesInFrameRelStructure;
import uk.org.netex.netex.FareTablesRelStructure;
import uk.org.netex.netex.ObjectFactory;
import uk.org.netex.netex.PricingServiceRefStructure;
import uk.org.netex.netex.PublicCodeStructure;
import uk.org.netex.netex.PublicationDeliveryStructure;
import uk.org.netex.netex.QualityStructureFactorsRelStructure;
import uk.org.netex.netex.ResourceFrame;
import uk.org.netex.netex.SalesOfferPackage;
import uk.org.netex.netex.SalesOfferPackageElementsRelStructure;
import uk.org.netex.netex.SalesOfferPackagesInFrameRelStructure;
import uk.org.netex.netex.ScheduledStopPointVersionStructure;
import uk.org.netex.netex.SeriesConstraint;
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
		fareFrameNrt.setFareZones(null);
		
		fareFrameNrt.setFareScheduledStopPoints(convertStations(osdmFares.getStationNames(), osdmFares, factory));
		
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
	
	private static FareScheduledStopPointsInFrameRelStructure convertStations(StationNames stationNames, FareStructure osdmFares, ObjectFactory factory) {
		
		FareScheduledStopPointsInFrameRelStructure stopPoints =  factory.createFareScheduledStopPointsInFrameRelStructure();
		
		
		for (Gtm.Station sn : osdmFares.getStationNames().getStationName()) {
			
			ScheduledStopPointVersionStructure sp = factory.createScheduledStopPointVersionStructure();
			
			sp.setName(Osdm2MultiLanguageString.getMultiLanguageString(sn.getNameCaseUTF8()));
			sp.setShortName(Osdm2MultiLanguageString.getMultiLanguageString(sn.getShortNameCaseUTF8()));
			sp.setId(UrnUtils.getStationUri(sn.getCode()));
			PublicCodeStructure pcs = factory.createPublicCodeStructure();
			pcs.setType("UIC");		
			pcs.setValue(UrnUtils.getStationUri(sn.getCode()));		
			sp.setPublicCode(pcs);
			
			
			stopPoints.getScheduledStopPointOrFareScheduledStopPoint().add(sp);
		}
		return stopPoints;
	}



	private static void convertFares(FareStructure osdmFares, FareFrame fareFrameNrt) {
		
		Osdm2SalesDiscountRights.convertToSalesDicountRights(osdmFares, fareFrameNrt);
		
		for (Gtm.FareElement fare : osdmFares.getFareElements().getFareElements()) {
			
			Osdm2FareProduct.convertFare (fare,fareFrameNrt);

		}
		
	}

	
	private static SiteFrame convertStations (GeneralTariffModel osdm) {
		
		ObjectFactory factory = new ObjectFactory();
		
		SiteFrame siteFrame = factory.createSiteFrame();
		siteFrame.setId("Stations_" + osdm.getDelivery().getId());
		
		StopPlacesInFrameRelStructure places = factory.createStopPlacesInFrameRelStructure();
		
		for ( Gtm.Station s : osdm.getFareStructure().getStationNames().getStationName()) {
			
			StopPlace stop = factory.createStopPlace();
			
			stop.setId(UrnUtils.getStationUri(s.getCode()));
			stop.setName(Osdm2MultiLanguageString.getMultiLanguageString(s.getName()));
			stop.setShortName(Osdm2MultiLanguageString.getMultiLanguageString(s.getShortNameCaseUTF8()));
			
			places.getStopPlace().add(stop);
		}
		
		siteFrame.setStopPlaces(places);
		
		return siteFrame;
	}

	
	private SeriesConstraint convertRegionalConstraint(RegionalConstraint rc) {
		SeriesConstraint sc = new SeriesConstraint();
		
		sc.setFareBasis(FareBasisEnumeration.ROUTE);
		
		String routeDescription = RouteDescriptionBuilder.getRouteDescription(rc);
		
		sc.setItinerary(Osdm2MultiLanguageString.getMultiLanguageString (routeDescription));	
		
		sc.setId(rc.getId());
		
		if (rc.getEntryConnectionPoint() != null && rc.getEntryConnectionPoint().getLegacyBorderPointCode() > 0) {
			ConnectionRefStructure fcr = new ConnectionRefStructure();
			fcr.setRef(Osdm2SeriesConnection.getRef(rc.getEntryConnectionPoint()));
			sc.setFromConnectionRef(fcr);
		}
		
		if (rc.getExitConnectionPoint() != null && rc.getExitConnectionPoint().getLegacyBorderPointCode() > 0) {
			ConnectionRefStructure tcr = new ConnectionRefStructure();
			tcr.setRef(Osdm2SeriesConnection.getRef(rc.getEntryConnectionPoint()));		
			sc.setToConnectionRef(tcr);
		}
		
		return sc;
		
	}

}
