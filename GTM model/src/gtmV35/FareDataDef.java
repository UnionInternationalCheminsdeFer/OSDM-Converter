
package gtmV35;

import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "calendars",
    "serviceClassDefinitions",
    "serviceLevelDefinitions",
    "texts",
    "fareResourceLocation",
    "prices",
    "regionalConstraints",
    "serviceConstraints",
    "carrierConstraints",
    "passengerConstraints",
    "fareConstraintBundles",
    "passengerCombinationConstraints",
    "fares",
    "afterSalesConditions",
    "supportedOnlineServices",
    "salesAvailabilityConstraint",
    "travelValidityConstraints",
    "combinationConstraints",
    "fulfillmentConstraints",
    "reductionConstraints",
    "reductionCards",
    "personalDataConstraints",
    "reservationParameters",
    "connectionPoints",
    "stationNames",
    "fareReferenceStationSetDefinitions",
    "zoneDefinitions",
    "luggageConstraints",
    "products",
    "carrierGroups"
})
public class FareDataDef {

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("calendars")
    private List<CalendarDef> calendars = new ArrayList<CalendarDef>();
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("serviceClassDefinitions")
    private List<ServiceClassDefinitionDef> serviceClassDefinitions = new ArrayList<ServiceClassDefinitionDef>();
    @JsonProperty("serviceLevelDefinitions")
    private List<ServiceLevelDef> serviceLevelDefinitions = new ArrayList<ServiceLevelDef>();
    @JsonProperty("texts")
    private List<TextDef> texts = new ArrayList<TextDef>();
    /**
     * Locate the online services
     * 
     */
    @JsonProperty("fareResourceLocation")
    @JsonPropertyDescription("Locate the online services")
    private FareResourceLocationDef fareResourceLocation;
    @JsonProperty("prices")
    private List<PriceDef> prices = new ArrayList<PriceDef>();
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("regionalConstraints")
    private List<RegionalConstraintDef> regionalConstraints = new ArrayList<RegionalConstraintDef>();
    @JsonProperty("serviceConstraints")
    private List<ServiceConstraintDef> serviceConstraints = new ArrayList<ServiceConstraintDef>();
    @JsonProperty("carrierConstraints")
    private List<CarrierConstraintDef> carrierConstraints = new ArrayList<CarrierConstraintDef>();
    @JsonProperty("passengerConstraints")
    private List<PassengerConstraintDef> passengerConstraints = new ArrayList<PassengerConstraintDef>();
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("fareConstraintBundles")
    private List<FareConstraintBundle> fareConstraintBundles = new ArrayList<FareConstraintBundle>();
    @JsonProperty("passengerCombinationConstraints")
    private List<PassengerCombinationConstraintDef> passengerCombinationConstraints = new ArrayList<PassengerCombinationConstraintDef>();
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("fares")
    private List<FareDef> fares = new ArrayList<FareDef>();
    /**
     * list of allowed after sales transactions and conditions
     * 
     */
    @JsonProperty("afterSalesConditions")
    @JsonPropertyDescription("list of allowed after sales transactions and conditions")
    private List<AfterSalesConditionDef> afterSalesConditions = new ArrayList<AfterSalesConditionDef>();
    @JsonProperty("supportedOnlineServices")
    private List<String> supportedOnlineServices = new ArrayList<String>();
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("salesAvailabilityConstraint")
    private List<SalesAvailabilityConstraintDef> salesAvailabilityConstraint = new ArrayList<SalesAvailabilityConstraintDef>();
    @JsonProperty("travelValidityConstraints")
    private List<TravelValidityConstraintDef> travelValidityConstraints = new ArrayList<TravelValidityConstraintDef>();
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("combinationConstraints")
    private List<FareCombinationConstraintDef> combinationConstraints = new ArrayList<FareCombinationConstraintDef>();
    @JsonProperty("fulfillmentConstraints")
    private List<FulfillmentConstraintDef> fulfillmentConstraints = new ArrayList<FulfillmentConstraintDef>();
    @JsonProperty("reductionConstraints")
    private List<ReductionConstraintDef> reductionConstraints = new ArrayList<ReductionConstraintDef>();
    @JsonProperty("reductionCards")
    private List<ReductionCardDef> reductionCards = new ArrayList<ReductionCardDef>();
    @JsonProperty("personalDataConstraints")
    private List<PersonalDataConstraintDef> personalDataConstraints = new ArrayList<PersonalDataConstraintDef>();
    @JsonProperty("reservationParameters")
    private List<ReservationParameterDef> reservationParameters = new ArrayList<ReservationParameterDef>();
    @JsonProperty("connectionPoints")
    private List<ConnectionPointDef> connectionPoints = new ArrayList<ConnectionPointDef>();
    /**
     * temporary option to include station details as long as MERITS can not provide them. Station codes must be those of merits
     * 
     */
    @JsonProperty("stationNames")
    @JsonPropertyDescription("temporary option to include station details as long as MERITS can not provide them. Station codes must be those of merits")
    private List<StationNamesDef> stationNames = new ArrayList<StationNamesDef>();
    @JsonProperty("fareReferenceStationSetDefinitions")
    private List<FareReferenceStationSetDef> fareReferenceStationSetDefinitions = new ArrayList<FareReferenceStationSetDef>();
    @JsonProperty("zoneDefinitions")
    private List<ZoneDefinitionDef> zoneDefinitions = new ArrayList<ZoneDefinitionDef>();
    @JsonProperty("luggageConstraints")
    private List<LuggageConstraint> luggageConstraints = new ArrayList<LuggageConstraint>();
    @JsonProperty("products")
    private List<Product> products = new ArrayList<Product>();
    @JsonProperty("carrierGroups")
    private List<CarrierGroup> carrierGroups = new ArrayList<CarrierGroup>();

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("calendars")
    public List<CalendarDef> getCalendars() {
        return calendars;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("calendars")
    public void setCalendars(List<CalendarDef> calendars) {
        this.calendars = calendars;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("serviceClassDefinitions")
    public List<ServiceClassDefinitionDef> getServiceClassDefinitions() {
        return serviceClassDefinitions;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("serviceClassDefinitions")
    public void setServiceClassDefinitions(List<ServiceClassDefinitionDef> serviceClassDefinitions) {
        this.serviceClassDefinitions = serviceClassDefinitions;
    }

    @JsonProperty("serviceLevelDefinitions")
    public List<ServiceLevelDef> getServiceLevelDefinitions() {
        return serviceLevelDefinitions;
    }

    @JsonProperty("serviceLevelDefinitions")
    public void setServiceLevelDefinitions(List<ServiceLevelDef> serviceLevelDefinitions) {
        this.serviceLevelDefinitions = serviceLevelDefinitions;
    }

    @JsonProperty("texts")
    public List<TextDef> getTexts() {
        return texts;
    }

    @JsonProperty("texts")
    public void setTexts(List<TextDef> texts) {
        this.texts = texts;
    }

    /**
     * Locate the online services
     * 
     */
    @JsonProperty("fareResourceLocation")
    public FareResourceLocationDef getFareResourceLocation() {
        return fareResourceLocation;
    }

    /**
     * Locate the online services
     * 
     */
    @JsonProperty("fareResourceLocation")
    public void setFareResourceLocation(FareResourceLocationDef fareResourceLocation) {
        this.fareResourceLocation = fareResourceLocation;
    }

    @JsonProperty("prices")
    public List<PriceDef> getPrices() {
        return prices;
    }

    @JsonProperty("prices")
    public void setPrices(List<PriceDef> prices) {
        this.prices = prices;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("regionalConstraints")
    public List<RegionalConstraintDef> getRegionalConstraints() {
        return regionalConstraints;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("regionalConstraints")
    public void setRegionalConstraints(List<RegionalConstraintDef> regionalConstraints) {
        this.regionalConstraints = regionalConstraints;
    }

    @JsonProperty("serviceConstraints")
    public List<ServiceConstraintDef> getServiceConstraints() {
        return serviceConstraints;
    }

    @JsonProperty("serviceConstraints")
    public void setServiceConstraints(List<ServiceConstraintDef> serviceConstraints) {
        this.serviceConstraints = serviceConstraints;
    }

    @JsonProperty("carrierConstraints")
    public List<CarrierConstraintDef> getCarrierConstraints() {
        return carrierConstraints;
    }

    @JsonProperty("carrierConstraints")
    public void setCarrierConstraints(List<CarrierConstraintDef> carrierConstraints) {
        this.carrierConstraints = carrierConstraints;
    }

    @JsonProperty("passengerConstraints")
    public List<PassengerConstraintDef> getPassengerConstraints() {
        return passengerConstraints;
    }

    @JsonProperty("passengerConstraints")
    public void setPassengerConstraints(List<PassengerConstraintDef> passengerConstraints) {
        this.passengerConstraints = passengerConstraints;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("fareConstraintBundles")
    public List<FareConstraintBundle> getFareConstraintBundles() {
        return fareConstraintBundles;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("fareConstraintBundles")
    public void setFareConstraintBundles(List<FareConstraintBundle> fareConstraintBundles) {
        this.fareConstraintBundles = fareConstraintBundles;
    }

    @JsonProperty("passengerCombinationConstraints")
    public List<PassengerCombinationConstraintDef> getPassengerCombinationConstraints() {
        return passengerCombinationConstraints;
    }

    @JsonProperty("passengerCombinationConstraints")
    public void setPassengerCombinationConstraints(List<PassengerCombinationConstraintDef> passengerCombinationConstraints) {
        this.passengerCombinationConstraints = passengerCombinationConstraints;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("fares")
    public List<FareDef> getFares() {
        return fares;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("fares")
    public void setFares(List<FareDef> fares) {
        this.fares = fares;
    }

    /**
     * list of allowed after sales transactions and conditions
     * 
     */
    @JsonProperty("afterSalesConditions")
    public List<AfterSalesConditionDef> getAfterSalesConditions() {
        return afterSalesConditions;
    }

    /**
     * list of allowed after sales transactions and conditions
     * 
     */
    @JsonProperty("afterSalesConditions")
    public void setAfterSalesConditions(List<AfterSalesConditionDef> afterSalesConditions) {
        this.afterSalesConditions = afterSalesConditions;
    }

    @JsonProperty("supportedOnlineServices")
    public List<String> getSupportedOnlineServices() {
        return supportedOnlineServices;
    }

    @JsonProperty("supportedOnlineServices")
    public void setSupportedOnlineServices(List<String> supportedOnlineServices) {
        this.supportedOnlineServices = supportedOnlineServices;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("salesAvailabilityConstraint")
    public List<SalesAvailabilityConstraintDef> getSalesAvailabilityConstraint() {
        return salesAvailabilityConstraint;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("salesAvailabilityConstraint")
    public void setSalesAvailabilityConstraint(List<SalesAvailabilityConstraintDef> salesAvailabilityConstraint) {
        this.salesAvailabilityConstraint = salesAvailabilityConstraint;
    }

    @JsonProperty("travelValidityConstraints")
    public List<TravelValidityConstraintDef> getTravelValidityConstraints() {
        return travelValidityConstraints;
    }

    @JsonProperty("travelValidityConstraints")
    public void setTravelValidityConstraints(List<TravelValidityConstraintDef> travelValidityConstraints) {
        this.travelValidityConstraints = travelValidityConstraints;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("combinationConstraints")
    public List<FareCombinationConstraintDef> getCombinationConstraints() {
        return combinationConstraints;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("combinationConstraints")
    public void setCombinationConstraints(List<FareCombinationConstraintDef> combinationConstraints) {
        this.combinationConstraints = combinationConstraints;
    }

    @JsonProperty("fulfillmentConstraints")
    public List<FulfillmentConstraintDef> getFulfillmentConstraints() {
        return fulfillmentConstraints;
    }

    @JsonProperty("fulfillmentConstraints")
    public void setFulfillmentConstraints(List<FulfillmentConstraintDef> fulfillmentConstraints) {
        this.fulfillmentConstraints = fulfillmentConstraints;
    }

    @JsonProperty("reductionConstraints")
    public List<ReductionConstraintDef> getReductionConstraints() {
        return reductionConstraints;
    }

    @JsonProperty("reductionConstraints")
    public void setReductionConstraints(List<ReductionConstraintDef> reductionConstraints) {
        this.reductionConstraints = reductionConstraints;
    }

    @JsonProperty("reductionCards")
    public List<ReductionCardDef> getReductionCards() {
        return reductionCards;
    }

    @JsonProperty("reductionCards")
    public void setReductionCards(List<ReductionCardDef> reductionCards) {
        this.reductionCards = reductionCards;
    }

    @JsonProperty("personalDataConstraints")
    public List<PersonalDataConstraintDef> getPersonalDataConstraints() {
        return personalDataConstraints;
    }

    @JsonProperty("personalDataConstraints")
    public void setPersonalDataConstraints(List<PersonalDataConstraintDef> personalDataConstraints) {
        this.personalDataConstraints = personalDataConstraints;
    }

    @JsonProperty("reservationParameters")
    public List<ReservationParameterDef> getReservationParameters() {
        return reservationParameters;
    }

    @JsonProperty("reservationParameters")
    public void setReservationParameters(List<ReservationParameterDef> reservationParameters) {
        this.reservationParameters = reservationParameters;
    }

    @JsonProperty("connectionPoints")
    public List<ConnectionPointDef> getConnectionPoints() {
        return connectionPoints;
    }

    @JsonProperty("connectionPoints")
    public void setConnectionPoints(List<ConnectionPointDef> connectionPoints) {
        this.connectionPoints = connectionPoints;
    }

    /**
     * temporary option to include station details as long as MERITS can not provide them. Station codes must be those of merits
     * 
     */
    @JsonProperty("stationNames")
    public List<StationNamesDef> getStationNames() {
        return stationNames;
    }

    /**
     * temporary option to include station details as long as MERITS can not provide them. Station codes must be those of merits
     * 
     */
    @JsonProperty("stationNames")
    public void setStationNames(List<StationNamesDef> stationNames) {
        this.stationNames = stationNames;
    }

    @JsonProperty("fareReferenceStationSetDefinitions")
    public List<FareReferenceStationSetDef> getFareReferenceStationSetDefinitions() {
        return fareReferenceStationSetDefinitions;
    }

    @JsonProperty("fareReferenceStationSetDefinitions")
    public void setFareReferenceStationSetDefinitions(List<FareReferenceStationSetDef> fareReferenceStationSetDefinitions) {
        this.fareReferenceStationSetDefinitions = fareReferenceStationSetDefinitions;
    }

    @JsonProperty("zoneDefinitions")
    public List<ZoneDefinitionDef> getZoneDefinitions() {
        return zoneDefinitions;
    }

    @JsonProperty("zoneDefinitions")
    public void setZoneDefinitions(List<ZoneDefinitionDef> zoneDefinitions) {
        this.zoneDefinitions = zoneDefinitions;
    }

    @JsonProperty("luggageConstraints")
    public List<LuggageConstraint> getLuggageConstraints() {
        return luggageConstraints;
    }

    @JsonProperty("luggageConstraints")
    public void setLuggageConstraints(List<LuggageConstraint> luggageConstraints) {
        this.luggageConstraints = luggageConstraints;
    }

    @JsonProperty("products")
    public List<Product> getProducts() {
        return products;
    }

    @JsonProperty("products")
    public void setProducts(List<Product> products) {
        this.products = products;
    }

    @JsonProperty("carrierGroups")
    public List<CarrierGroup> getCarrierGroups() {
        return carrierGroups;
    }

    @JsonProperty("carrierGroups")
    public void setCarrierGroups(List<CarrierGroup> carrierGroups) {
        this.carrierGroups = carrierGroups;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(FareDataDef.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("calendars");
        sb.append('=');
        sb.append(((this.calendars == null)?"<null>":this.calendars));
        sb.append(',');
        sb.append("serviceClassDefinitions");
        sb.append('=');
        sb.append(((this.serviceClassDefinitions == null)?"<null>":this.serviceClassDefinitions));
        sb.append(',');
        sb.append("serviceLevelDefinitions");
        sb.append('=');
        sb.append(((this.serviceLevelDefinitions == null)?"<null>":this.serviceLevelDefinitions));
        sb.append(',');
        sb.append("texts");
        sb.append('=');
        sb.append(((this.texts == null)?"<null>":this.texts));
        sb.append(',');
        sb.append("fareResourceLocation");
        sb.append('=');
        sb.append(((this.fareResourceLocation == null)?"<null>":this.fareResourceLocation));
        sb.append(',');
        sb.append("prices");
        sb.append('=');
        sb.append(((this.prices == null)?"<null>":this.prices));
        sb.append(',');
        sb.append("regionalConstraints");
        sb.append('=');
        sb.append(((this.regionalConstraints == null)?"<null>":this.regionalConstraints));
        sb.append(',');
        sb.append("serviceConstraints");
        sb.append('=');
        sb.append(((this.serviceConstraints == null)?"<null>":this.serviceConstraints));
        sb.append(',');
        sb.append("carrierConstraints");
        sb.append('=');
        sb.append(((this.carrierConstraints == null)?"<null>":this.carrierConstraints));
        sb.append(',');
        sb.append("passengerConstraints");
        sb.append('=');
        sb.append(((this.passengerConstraints == null)?"<null>":this.passengerConstraints));
        sb.append(',');
        sb.append("fareConstraintBundles");
        sb.append('=');
        sb.append(((this.fareConstraintBundles == null)?"<null>":this.fareConstraintBundles));
        sb.append(',');
        sb.append("passengerCombinationConstraints");
        sb.append('=');
        sb.append(((this.passengerCombinationConstraints == null)?"<null>":this.passengerCombinationConstraints));
        sb.append(',');
        sb.append("fares");
        sb.append('=');
        sb.append(((this.fares == null)?"<null>":this.fares));
        sb.append(',');
        sb.append("afterSalesConditions");
        sb.append('=');
        sb.append(((this.afterSalesConditions == null)?"<null>":this.afterSalesConditions));
        sb.append(',');
        sb.append("supportedOnlineServices");
        sb.append('=');
        sb.append(((this.supportedOnlineServices == null)?"<null>":this.supportedOnlineServices));
        sb.append(',');
        sb.append("salesAvailabilityConstraint");
        sb.append('=');
        sb.append(((this.salesAvailabilityConstraint == null)?"<null>":this.salesAvailabilityConstraint));
        sb.append(',');
        sb.append("travelValidityConstraints");
        sb.append('=');
        sb.append(((this.travelValidityConstraints == null)?"<null>":this.travelValidityConstraints));
        sb.append(',');
        sb.append("combinationConstraints");
        sb.append('=');
        sb.append(((this.combinationConstraints == null)?"<null>":this.combinationConstraints));
        sb.append(',');
        sb.append("fulfillmentConstraints");
        sb.append('=');
        sb.append(((this.fulfillmentConstraints == null)?"<null>":this.fulfillmentConstraints));
        sb.append(',');
        sb.append("reductionConstraints");
        sb.append('=');
        sb.append(((this.reductionConstraints == null)?"<null>":this.reductionConstraints));
        sb.append(',');
        sb.append("reductionCards");
        sb.append('=');
        sb.append(((this.reductionCards == null)?"<null>":this.reductionCards));
        sb.append(',');
        sb.append("personalDataConstraints");
        sb.append('=');
        sb.append(((this.personalDataConstraints == null)?"<null>":this.personalDataConstraints));
        sb.append(',');
        sb.append("reservationParameters");
        sb.append('=');
        sb.append(((this.reservationParameters == null)?"<null>":this.reservationParameters));
        sb.append(',');
        sb.append("connectionPoints");
        sb.append('=');
        sb.append(((this.connectionPoints == null)?"<null>":this.connectionPoints));
        sb.append(',');
        sb.append("stationNames");
        sb.append('=');
        sb.append(((this.stationNames == null)?"<null>":this.stationNames));
        sb.append(',');
        sb.append("fareReferenceStationSetDefinitions");
        sb.append('=');
        sb.append(((this.fareReferenceStationSetDefinitions == null)?"<null>":this.fareReferenceStationSetDefinitions));
        sb.append(',');
        sb.append("zoneDefinitions");
        sb.append('=');
        sb.append(((this.zoneDefinitions == null)?"<null>":this.zoneDefinitions));
        sb.append(',');
        sb.append("luggageConstraints");
        sb.append('=');
        sb.append(((this.luggageConstraints == null)?"<null>":this.luggageConstraints));
        sb.append(',');
        sb.append("products");
        sb.append('=');
        sb.append(((this.products == null)?"<null>":this.products));
        sb.append(',');
        sb.append("carrierGroups");
        sb.append('=');
        sb.append(((this.carrierGroups == null)?"<null>":this.carrierGroups));
        sb.append(',');
        if (sb.charAt((sb.length()- 1)) == ',') {
            sb.setCharAt((sb.length()- 1), ']');
        } else {
            sb.append(']');
        }
        return sb.toString();
    }

    @Override
    public int hashCode() {
        int result = 1;
        result = ((result* 31)+((this.serviceConstraints == null)? 0 :this.serviceConstraints.hashCode()));
        result = ((result* 31)+((this.luggageConstraints == null)? 0 :this.luggageConstraints.hashCode()));
        result = ((result* 31)+((this.carrierConstraints == null)? 0 :this.carrierConstraints.hashCode()));
        result = ((result* 31)+((this.fareConstraintBundles == null)? 0 :this.fareConstraintBundles.hashCode()));
        result = ((result* 31)+((this.connectionPoints == null)? 0 :this.connectionPoints.hashCode()));
        result = ((result* 31)+((this.passengerConstraints == null)? 0 :this.passengerConstraints.hashCode()));
        result = ((result* 31)+((this.salesAvailabilityConstraint == null)? 0 :this.salesAvailabilityConstraint.hashCode()));
        result = ((result* 31)+((this.afterSalesConditions == null)? 0 :this.afterSalesConditions.hashCode()));
        result = ((result* 31)+((this.fares == null)? 0 :this.fares.hashCode()));
        result = ((result* 31)+((this.products == null)? 0 :this.products.hashCode()));
        result = ((result* 31)+((this.regionalConstraints == null)? 0 :this.regionalConstraints.hashCode()));
        result = ((result* 31)+((this.zoneDefinitions == null)? 0 :this.zoneDefinitions.hashCode()));
        result = ((result* 31)+((this.supportedOnlineServices == null)? 0 :this.supportedOnlineServices.hashCode()));
        result = ((result* 31)+((this.reservationParameters == null)? 0 :this.reservationParameters.hashCode()));
        result = ((result* 31)+((this.stationNames == null)? 0 :this.stationNames.hashCode()));
        result = ((result* 31)+((this.combinationConstraints == null)? 0 :this.combinationConstraints.hashCode()));
        result = ((result* 31)+((this.prices == null)? 0 :this.prices.hashCode()));
        result = ((result* 31)+((this.serviceLevelDefinitions == null)? 0 :this.serviceLevelDefinitions.hashCode()));
        result = ((result* 31)+((this.travelValidityConstraints == null)? 0 :this.travelValidityConstraints.hashCode()));
        result = ((result* 31)+((this.fareResourceLocation == null)? 0 :this.fareResourceLocation.hashCode()));
        result = ((result* 31)+((this.passengerCombinationConstraints == null)? 0 :this.passengerCombinationConstraints.hashCode()));
        result = ((result* 31)+((this.personalDataConstraints == null)? 0 :this.personalDataConstraints.hashCode()));
        result = ((result* 31)+((this.serviceClassDefinitions == null)? 0 :this.serviceClassDefinitions.hashCode()));
        result = ((result* 31)+((this.texts == null)? 0 :this.texts.hashCode()));
        result = ((result* 31)+((this.carrierGroups == null)? 0 :this.carrierGroups.hashCode()));
        result = ((result* 31)+((this.calendars == null)? 0 :this.calendars.hashCode()));
        result = ((result* 31)+((this.fulfillmentConstraints == null)? 0 :this.fulfillmentConstraints.hashCode()));
        result = ((result* 31)+((this.fareReferenceStationSetDefinitions == null)? 0 :this.fareReferenceStationSetDefinitions.hashCode()));
        result = ((result* 31)+((this.reductionCards == null)? 0 :this.reductionCards.hashCode()));
        result = ((result* 31)+((this.reductionConstraints == null)? 0 :this.reductionConstraints.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof FareDataDef) == false) {
            return false;
        }
        FareDataDef rhs = ((FareDataDef) other);
        return (((((((((((((((((((((((((((((((this.serviceConstraints == rhs.serviceConstraints)||((this.serviceConstraints!= null)&&this.serviceConstraints.equals(rhs.serviceConstraints)))&&((this.luggageConstraints == rhs.luggageConstraints)||((this.luggageConstraints!= null)&&this.luggageConstraints.equals(rhs.luggageConstraints))))&&((this.carrierConstraints == rhs.carrierConstraints)||((this.carrierConstraints!= null)&&this.carrierConstraints.equals(rhs.carrierConstraints))))&&((this.fareConstraintBundles == rhs.fareConstraintBundles)||((this.fareConstraintBundles!= null)&&this.fareConstraintBundles.equals(rhs.fareConstraintBundles))))&&((this.connectionPoints == rhs.connectionPoints)||((this.connectionPoints!= null)&&this.connectionPoints.equals(rhs.connectionPoints))))&&((this.passengerConstraints == rhs.passengerConstraints)||((this.passengerConstraints!= null)&&this.passengerConstraints.equals(rhs.passengerConstraints))))&&((this.salesAvailabilityConstraint == rhs.salesAvailabilityConstraint)||((this.salesAvailabilityConstraint!= null)&&this.salesAvailabilityConstraint.equals(rhs.salesAvailabilityConstraint))))&&((this.afterSalesConditions == rhs.afterSalesConditions)||((this.afterSalesConditions!= null)&&this.afterSalesConditions.equals(rhs.afterSalesConditions))))&&((this.fares == rhs.fares)||((this.fares!= null)&&this.fares.equals(rhs.fares))))&&((this.products == rhs.products)||((this.products!= null)&&this.products.equals(rhs.products))))&&((this.regionalConstraints == rhs.regionalConstraints)||((this.regionalConstraints!= null)&&this.regionalConstraints.equals(rhs.regionalConstraints))))&&((this.zoneDefinitions == rhs.zoneDefinitions)||((this.zoneDefinitions!= null)&&this.zoneDefinitions.equals(rhs.zoneDefinitions))))&&((this.supportedOnlineServices == rhs.supportedOnlineServices)||((this.supportedOnlineServices!= null)&&this.supportedOnlineServices.equals(rhs.supportedOnlineServices))))&&((this.reservationParameters == rhs.reservationParameters)||((this.reservationParameters!= null)&&this.reservationParameters.equals(rhs.reservationParameters))))&&((this.stationNames == rhs.stationNames)||((this.stationNames!= null)&&this.stationNames.equals(rhs.stationNames))))&&((this.combinationConstraints == rhs.combinationConstraints)||((this.combinationConstraints!= null)&&this.combinationConstraints.equals(rhs.combinationConstraints))))&&((this.prices == rhs.prices)||((this.prices!= null)&&this.prices.equals(rhs.prices))))&&((this.serviceLevelDefinitions == rhs.serviceLevelDefinitions)||((this.serviceLevelDefinitions!= null)&&this.serviceLevelDefinitions.equals(rhs.serviceLevelDefinitions))))&&((this.travelValidityConstraints == rhs.travelValidityConstraints)||((this.travelValidityConstraints!= null)&&this.travelValidityConstraints.equals(rhs.travelValidityConstraints))))&&((this.fareResourceLocation == rhs.fareResourceLocation)||((this.fareResourceLocation!= null)&&this.fareResourceLocation.equals(rhs.fareResourceLocation))))&&((this.passengerCombinationConstraints == rhs.passengerCombinationConstraints)||((this.passengerCombinationConstraints!= null)&&this.passengerCombinationConstraints.equals(rhs.passengerCombinationConstraints))))&&((this.personalDataConstraints == rhs.personalDataConstraints)||((this.personalDataConstraints!= null)&&this.personalDataConstraints.equals(rhs.personalDataConstraints))))&&((this.serviceClassDefinitions == rhs.serviceClassDefinitions)||((this.serviceClassDefinitions!= null)&&this.serviceClassDefinitions.equals(rhs.serviceClassDefinitions))))&&((this.texts == rhs.texts)||((this.texts!= null)&&this.texts.equals(rhs.texts))))&&((this.carrierGroups == rhs.carrierGroups)||((this.carrierGroups!= null)&&this.carrierGroups.equals(rhs.carrierGroups))))&&((this.calendars == rhs.calendars)||((this.calendars!= null)&&this.calendars.equals(rhs.calendars))))&&((this.fulfillmentConstraints == rhs.fulfillmentConstraints)||((this.fulfillmentConstraints!= null)&&this.fulfillmentConstraints.equals(rhs.fulfillmentConstraints))))&&((this.fareReferenceStationSetDefinitions == rhs.fareReferenceStationSetDefinitions)||((this.fareReferenceStationSetDefinitions!= null)&&this.fareReferenceStationSetDefinitions.equals(rhs.fareReferenceStationSetDefinitions))))&&((this.reductionCards == rhs.reductionCards)||((this.reductionCards!= null)&&this.reductionCards.equals(rhs.reductionCards))))&&((this.reductionConstraints == rhs.reductionConstraints)||((this.reductionConstraints!= null)&&this.reductionConstraints.equals(rhs.reductionConstraints))));
    }

}
