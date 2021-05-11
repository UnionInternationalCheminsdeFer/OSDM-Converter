
package gtm;

import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * single fare within a blk fare data delivery
 * 
 */
@JsonInclude(JsonInclude.Include.NON_DEFAULT)
@JsonPropertyOrder({
    "id",
    "bundleRef",
    "fareType",
    "nameRef",
    "priceRef",
    "regionalConstraintRef",
    "serviceConstraintRef",
    "carrierConstraintRef",
    "regulatoryConditions",
    "serviceClassRef",
    "serviceLevelRef",
    "passengerConstraintRef",
    "afterSalesRulesRef",
    "reductionConstraintRef",
    "reservationParameterRef",
    "legacyAccountingIdentifier",
    "fareDetailDescriptionRef",
    "legacyConversion",
    "individualContracts"
})
public class FareDef {

    /**
     * unique id of the fare item to be included in accounting
     * (Required)
     * 
     */
    @JsonProperty("id")
    @JsonPropertyDescription("unique id of the fare item to be included in accounting")
    private String id;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("bundleRef")
    private String bundleRef;
    /**
     * UIC fare types
     * (Required)
     * 
     */
    @JsonProperty("fareType")
    @JsonPropertyDescription("UIC fare types")
    private gtm.FareConstraintBundle.FareTypeDef fareType;
    /**
     * reference to the fare name
     * 
     */
    @JsonProperty("nameRef")
    @JsonPropertyDescription("reference to the fare name")
    private String nameRef;
    /**
     * reference to the price 
     * 
     */
    @JsonProperty("priceRef")
    @JsonPropertyDescription("reference to the price ")
    private String priceRef;
    /**
     * reference to the regional validity
     * 
     */
    @JsonProperty("regionalConstraintRef")
    @JsonPropertyDescription("reference to the regional validity")
    private String regionalConstraintRef;
    @JsonProperty("serviceConstraintRef")
    private String serviceConstraintRef;
    @JsonProperty("carrierConstraintRef")
    private String carrierConstraintRef;
    /**
     * regulatory condition
     * 
     */
    @JsonProperty("regulatoryConditions")
    @JsonPropertyDescription("regulatory condition")
    private List<RegulatoryConditionsDef> regulatoryConditions = new ArrayList<RegulatoryConditionsDef>();
    @JsonProperty("serviceClassRef")
    private String serviceClassRef;
    @JsonProperty("serviceLevelRef")
    private String serviceLevelRef;
    @JsonProperty("passengerConstraintRef")
    private String passengerConstraintRef;
    @JsonProperty("afterSalesRulesRef")
    private String afterSalesRulesRef;
    @JsonProperty("reductionConstraintRef")
    private String reductionConstraintRef;
    @JsonProperty("reservationParameterRef")
    private String reservationParameterRef;
    /**
     * identifier of the fare in the current 301 accounting file
     * 
     */
    @JsonProperty("legacyAccountingIdentifier")
    @JsonPropertyDescription("identifier of the fare in the current 301 accounting file")
    private LegacyAccountingIdentifierDef legacyAccountingIdentifier;
    /**
     * reference to a text with the details of the fare
     * 
     */
    @JsonProperty("fareDetailDescriptionRef")
    @JsonPropertyDescription("reference to a text with the details of the fare")
    private String fareDetailDescriptionRef;
    /**
     * options for legacy conversion to 108.1: NO ( no conversion) YES (conversion allowed), ONLY (fare is provided only for conversion and should not be used otherwise 
     * 
     */
    @JsonProperty("legacyConversion")
    @JsonPropertyDescription("options for legacy conversion to 108.1: NO ( no conversion) YES (conversion allowed), ONLY (fare is provided only for conversion and should not be used otherwise ")
    private String legacyConversion = "NO";
    /**
     * indicates that the fare can be treated independently per person although booked for more than one person.
     * 
     */
    @JsonProperty("individualContracts")
    @JsonPropertyDescription("indicates that the fare can be treated independently per person although booked for more than one person.")
    private Boolean individualContracts = false;

    /**
     * unique id of the fare item to be included in accounting
     * (Required)
     * 
     */
    @JsonProperty("id")
    public String getId() {
        return id;
    }

    /**
     * unique id of the fare item to be included in accounting
     * (Required)
     * 
     */
    @JsonProperty("id")
    public void setId(String id) {
        this.id = id;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("bundleRef")
    public String getBundleRef() {
        return bundleRef;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("bundleRef")
    public void setBundleRef(String bundleRef) {
        this.bundleRef = bundleRef;
    }

    /**
     * UIC fare types
     * (Required)
     * 
     */
    @JsonProperty("fareType")
    public gtm.FareConstraintBundle.FareTypeDef getFareType() {
        return fareType;
    }

    /**
     * UIC fare types
     * (Required)
     * 
     */
    @JsonProperty("fareType")
    public void setFareType(gtm.FareConstraintBundle.FareTypeDef fareType) {
        this.fareType = fareType;
    }

    /**
     * reference to the fare name
     * 
     */
    @JsonProperty("nameRef")
    public String getNameRef() {
        return nameRef;
    }

    /**
     * reference to the fare name
     * 
     */
    @JsonProperty("nameRef")
    public void setNameRef(String nameRef) {
        this.nameRef = nameRef;
    }

    /**
     * reference to the price 
     * 
     */
    @JsonProperty("priceRef")
    public String getPriceRef() {
        return priceRef;
    }

    /**
     * reference to the price 
     * 
     */
    @JsonProperty("priceRef")
    public void setPriceRef(String priceRef) {
        this.priceRef = priceRef;
    }

    /**
     * reference to the regional validity
     * 
     */
    @JsonProperty("regionalConstraintRef")
    public String getRegionalConstraintRef() {
        return regionalConstraintRef;
    }

    /**
     * reference to the regional validity
     * 
     */
    @JsonProperty("regionalConstraintRef")
    public void setRegionalConstraintRef(String regionalConstraintRef) {
        this.regionalConstraintRef = regionalConstraintRef;
    }

    @JsonProperty("serviceConstraintRef")
    public String getServiceConstraintRef() {
        return serviceConstraintRef;
    }

    @JsonProperty("serviceConstraintRef")
    public void setServiceConstraintRef(String serviceConstraintRef) {
        this.serviceConstraintRef = serviceConstraintRef;
    }

    @JsonProperty("carrierConstraintRef")
    public String getCarrierConstraintRef() {
        return carrierConstraintRef;
    }

    @JsonProperty("carrierConstraintRef")
    public void setCarrierConstraintRef(String carrierConstraintRef) {
        this.carrierConstraintRef = carrierConstraintRef;
    }

    /**
     * regulatory condition
     * 
     */
    @JsonProperty("regulatoryConditions")
    public List<RegulatoryConditionsDef> getRegulatoryConditions() {
        return regulatoryConditions;
    }

    /**
     * regulatory condition
     * 
     */
    @JsonProperty("regulatoryConditions")
    public void setRegulatoryConditions(List<RegulatoryConditionsDef> regulatoryConditions) {
        this.regulatoryConditions = regulatoryConditions;
    }

    @JsonProperty("serviceClassRef")
    public String getServiceClassRef() {
        return serviceClassRef;
    }

    @JsonProperty("serviceClassRef")
    public void setServiceClassRef(String serviceClassRef) {
        this.serviceClassRef = serviceClassRef;
    }

    @JsonProperty("serviceLevelRef")
    public String getServiceLevelRef() {
        return serviceLevelRef;
    }

    @JsonProperty("serviceLevelRef")
    public void setServiceLevelRef(String serviceLevelRef) {
        this.serviceLevelRef = serviceLevelRef;
    }

    @JsonProperty("passengerConstraintRef")
    public String getPassengerConstraintRef() {
        return passengerConstraintRef;
    }

    @JsonProperty("passengerConstraintRef")
    public void setPassengerConstraintRef(String passengerConstraintRef) {
        this.passengerConstraintRef = passengerConstraintRef;
    }

    @JsonProperty("afterSalesRulesRef")
    public String getAfterSalesRulesRef() {
        return afterSalesRulesRef;
    }

    @JsonProperty("afterSalesRulesRef")
    public void setAfterSalesRulesRef(String afterSalesRulesRef) {
        this.afterSalesRulesRef = afterSalesRulesRef;
    }

    @JsonProperty("reductionConstraintRef")
    public String getReductionConstraintRef() {
        return reductionConstraintRef;
    }

    @JsonProperty("reductionConstraintRef")
    public void setReductionConstraintRef(String reductionConstraintRef) {
        this.reductionConstraintRef = reductionConstraintRef;
    }

    @JsonProperty("reservationParameterRef")
    public String getReservationParameterRef() {
        return reservationParameterRef;
    }

    @JsonProperty("reservationParameterRef")
    public void setReservationParameterRef(String reservationParameterRef) {
        this.reservationParameterRef = reservationParameterRef;
    }

    /**
     * identifier of the fare in the current 301 accounting file
     * 
     */
    @JsonProperty("legacyAccountingIdentifier")
    public LegacyAccountingIdentifierDef getLegacyAccountingIdentifier() {
        return legacyAccountingIdentifier;
    }

    /**
     * identifier of the fare in the current 301 accounting file
     * 
     */
    @JsonProperty("legacyAccountingIdentifier")
    public void setLegacyAccountingIdentifier(LegacyAccountingIdentifierDef legacyAccountingIdentifier) {
        this.legacyAccountingIdentifier = legacyAccountingIdentifier;
    }

    /**
     * reference to a text with the details of the fare
     * 
     */
    @JsonProperty("fareDetailDescriptionRef")
    public String getFareDetailDescriptionRef() {
        return fareDetailDescriptionRef;
    }

    /**
     * reference to a text with the details of the fare
     * 
     */
    @JsonProperty("fareDetailDescriptionRef")
    public void setFareDetailDescriptionRef(String fareDetailDescriptionRef) {
        this.fareDetailDescriptionRef = fareDetailDescriptionRef;
    }

    /**
     * options for legacy conversion to 108.1: NO ( no conversion) YES (conversion allowed), ONLY (fare is provided only for conversion and should not be used otherwise 
     * 
     */
    @JsonProperty("legacyConversion")
    public String getLegacyConversion() {
        return legacyConversion;
    }

    /**
     * options for legacy conversion to 108.1: NO ( no conversion) YES (conversion allowed), ONLY (fare is provided only for conversion and should not be used otherwise 
     * 
     */
    @JsonProperty("legacyConversion")
    public void setLegacyConversion(String legacyConversion) {
        this.legacyConversion = legacyConversion;
    }

    /**
     * indicates that the fare can be treated independently per person although booked for more than one person.
     * 
     */
    @JsonProperty("individualContracts")
    public Boolean getIndividualContracts() {
        return individualContracts;
    }

    /**
     * indicates that the fare can be treated independently per person although booked for more than one person.
     * 
     */
    @JsonProperty("individualContracts")
    public void setIndividualContracts(Boolean individualContracts) {
        this.individualContracts = individualContracts;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(FareDef.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("id");
        sb.append('=');
        sb.append(((this.id == null)?"<null>":this.id));
        sb.append(',');
        sb.append("bundleRef");
        sb.append('=');
        sb.append(((this.bundleRef == null)?"<null>":this.bundleRef));
        sb.append(',');
        sb.append("fareType");
        sb.append('=');
        sb.append(((this.fareType == null)?"<null>":this.fareType));
        sb.append(',');
        sb.append("nameRef");
        sb.append('=');
        sb.append(((this.nameRef == null)?"<null>":this.nameRef));
        sb.append(',');
        sb.append("priceRef");
        sb.append('=');
        sb.append(((this.priceRef == null)?"<null>":this.priceRef));
        sb.append(',');
        sb.append("regionalConstraintRef");
        sb.append('=');
        sb.append(((this.regionalConstraintRef == null)?"<null>":this.regionalConstraintRef));
        sb.append(',');
        sb.append("serviceConstraintRef");
        sb.append('=');
        sb.append(((this.serviceConstraintRef == null)?"<null>":this.serviceConstraintRef));
        sb.append(',');
        sb.append("carrierConstraintRef");
        sb.append('=');
        sb.append(((this.carrierConstraintRef == null)?"<null>":this.carrierConstraintRef));
        sb.append(',');
        sb.append("regulatoryConditions");
        sb.append('=');
        sb.append(((this.regulatoryConditions == null)?"<null>":this.regulatoryConditions));
        sb.append(',');
        sb.append("serviceClassRef");
        sb.append('=');
        sb.append(((this.serviceClassRef == null)?"<null>":this.serviceClassRef));
        sb.append(',');
        sb.append("serviceLevelRef");
        sb.append('=');
        sb.append(((this.serviceLevelRef == null)?"<null>":this.serviceLevelRef));
        sb.append(',');
        sb.append("passengerConstraintRef");
        sb.append('=');
        sb.append(((this.passengerConstraintRef == null)?"<null>":this.passengerConstraintRef));
        sb.append(',');
        sb.append("afterSalesRulesRef");
        sb.append('=');
        sb.append(((this.afterSalesRulesRef == null)?"<null>":this.afterSalesRulesRef));
        sb.append(',');
        sb.append("reductionConstraintRef");
        sb.append('=');
        sb.append(((this.reductionConstraintRef == null)?"<null>":this.reductionConstraintRef));
        sb.append(',');
        sb.append("reservationParameterRef");
        sb.append('=');
        sb.append(((this.reservationParameterRef == null)?"<null>":this.reservationParameterRef));
        sb.append(',');
        sb.append("legacyAccountingIdentifier");
        sb.append('=');
        sb.append(((this.legacyAccountingIdentifier == null)?"<null>":this.legacyAccountingIdentifier));
        sb.append(',');
        sb.append("fareDetailDescriptionRef");
        sb.append('=');
        sb.append(((this.fareDetailDescriptionRef == null)?"<null>":this.fareDetailDescriptionRef));
        sb.append(',');
        sb.append("legacyConversion");
        sb.append('=');
        sb.append(((this.legacyConversion == null)?"<null>":this.legacyConversion));
        sb.append(',');
        sb.append("individualContracts");
        sb.append('=');
        sb.append(((this.individualContracts == null)?"<null>":this.individualContracts));
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
        result = ((result* 31)+((this.fareDetailDescriptionRef == null)? 0 :this.fareDetailDescriptionRef.hashCode()));
        result = ((result* 31)+((this.afterSalesRulesRef == null)? 0 :this.afterSalesRulesRef.hashCode()));
        result = ((result* 31)+((this.serviceConstraintRef == null)? 0 :this.serviceConstraintRef.hashCode()));
        result = ((result* 31)+((this.serviceLevelRef == null)? 0 :this.serviceLevelRef.hashCode()));
        result = ((result* 31)+((this.nameRef == null)? 0 :this.nameRef.hashCode()));
        result = ((result* 31)+((this.carrierConstraintRef == null)? 0 :this.carrierConstraintRef.hashCode()));
        result = ((result* 31)+((this.reductionConstraintRef == null)? 0 :this.reductionConstraintRef.hashCode()));
        result = ((result* 31)+((this.serviceClassRef == null)? 0 :this.serviceClassRef.hashCode()));
        result = ((result* 31)+((this.passengerConstraintRef == null)? 0 :this.passengerConstraintRef.hashCode()));
        result = ((result* 31)+((this.priceRef == null)? 0 :this.priceRef.hashCode()));
        result = ((result* 31)+((this.regulatoryConditions == null)? 0 :this.regulatoryConditions.hashCode()));
        result = ((result* 31)+((this.individualContracts == null)? 0 :this.individualContracts.hashCode()));
        result = ((result* 31)+((this.id == null)? 0 :this.id.hashCode()));
        result = ((result* 31)+((this.regionalConstraintRef == null)? 0 :this.regionalConstraintRef.hashCode()));
        result = ((result* 31)+((this.fareType == null)? 0 :this.fareType.hashCode()));
        result = ((result* 31)+((this.legacyAccountingIdentifier == null)? 0 :this.legacyAccountingIdentifier.hashCode()));
        result = ((result* 31)+((this.reservationParameterRef == null)? 0 :this.reservationParameterRef.hashCode()));
        result = ((result* 31)+((this.legacyConversion == null)? 0 :this.legacyConversion.hashCode()));
        result = ((result* 31)+((this.bundleRef == null)? 0 :this.bundleRef.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof FareDef) == false) {
            return false;
        }
        FareDef rhs = ((FareDef) other);
        return ((((((((((((((((((((this.fareDetailDescriptionRef == rhs.fareDetailDescriptionRef)||((this.fareDetailDescriptionRef!= null)&&this.fareDetailDescriptionRef.equals(rhs.fareDetailDescriptionRef)))&&((this.afterSalesRulesRef == rhs.afterSalesRulesRef)||((this.afterSalesRulesRef!= null)&&this.afterSalesRulesRef.equals(rhs.afterSalesRulesRef))))&&((this.serviceConstraintRef == rhs.serviceConstraintRef)||((this.serviceConstraintRef!= null)&&this.serviceConstraintRef.equals(rhs.serviceConstraintRef))))&&((this.serviceLevelRef == rhs.serviceLevelRef)||((this.serviceLevelRef!= null)&&this.serviceLevelRef.equals(rhs.serviceLevelRef))))&&((this.nameRef == rhs.nameRef)||((this.nameRef!= null)&&this.nameRef.equals(rhs.nameRef))))&&((this.carrierConstraintRef == rhs.carrierConstraintRef)||((this.carrierConstraintRef!= null)&&this.carrierConstraintRef.equals(rhs.carrierConstraintRef))))&&((this.reductionConstraintRef == rhs.reductionConstraintRef)||((this.reductionConstraintRef!= null)&&this.reductionConstraintRef.equals(rhs.reductionConstraintRef))))&&((this.serviceClassRef == rhs.serviceClassRef)||((this.serviceClassRef!= null)&&this.serviceClassRef.equals(rhs.serviceClassRef))))&&((this.passengerConstraintRef == rhs.passengerConstraintRef)||((this.passengerConstraintRef!= null)&&this.passengerConstraintRef.equals(rhs.passengerConstraintRef))))&&((this.priceRef == rhs.priceRef)||((this.priceRef!= null)&&this.priceRef.equals(rhs.priceRef))))&&((this.regulatoryConditions == rhs.regulatoryConditions)||((this.regulatoryConditions!= null)&&this.regulatoryConditions.equals(rhs.regulatoryConditions))))&&((this.individualContracts == rhs.individualContracts)||((this.individualContracts!= null)&&this.individualContracts.equals(rhs.individualContracts))))&&((this.id == rhs.id)||((this.id!= null)&&this.id.equals(rhs.id))))&&((this.regionalConstraintRef == rhs.regionalConstraintRef)||((this.regionalConstraintRef!= null)&&this.regionalConstraintRef.equals(rhs.regionalConstraintRef))))&&((this.fareType == rhs.fareType)||((this.fareType!= null)&&this.fareType.equals(rhs.fareType))))&&((this.legacyAccountingIdentifier == rhs.legacyAccountingIdentifier)||((this.legacyAccountingIdentifier!= null)&&this.legacyAccountingIdentifier.equals(rhs.legacyAccountingIdentifier))))&&((this.reservationParameterRef == rhs.reservationParameterRef)||((this.reservationParameterRef!= null)&&this.reservationParameterRef.equals(rhs.reservationParameterRef))))&&((this.legacyConversion == rhs.legacyConversion)||((this.legacyConversion!= null)&&this.legacyConversion.equals(rhs.legacyConversion))))&&((this.bundleRef == rhs.bundleRef)||((this.bundleRef!= null)&&this.bundleRef.equals(rhs.bundleRef))));
    }

}
