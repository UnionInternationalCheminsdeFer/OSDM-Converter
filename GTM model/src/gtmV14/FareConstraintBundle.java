
package gtmV14;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonValue;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "id",
    "combinationConstraintRef",
    "salesAvailabilityConstraintRef",
    "travelValidityConstraintRef",
    "fulfillmentConstraintRef",
    "personalDataConstraintRef",
    "passengerCombinationConstraintRef",
    "defaultFareType",
    "defaultCarrierConstraintRef",
    "defaultRegulatoryConditions"
})
public class FareConstraintBundle {

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("id")
    private String id;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("combinationConstraintRef")
    private String combinationConstraintRef;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("salesAvailabilityConstraintRef")
    private String salesAvailabilityConstraintRef;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("travelValidityConstraintRef")
    private String travelValidityConstraintRef;
    @JsonProperty("fulfillmentConstraintRef")
    private String fulfillmentConstraintRef;
    @JsonProperty("personalDataConstraintRef")
    private String personalDataConstraintRef;
    @JsonProperty("passengerCombinationConstraintRef")
    private String passengerCombinationConstraintRef;
    /**
     * UIC fare types
     * (Required)
     * 
     */
    @JsonProperty("defaultFareType")
    @JsonPropertyDescription("UIC fare types")
    private FareConstraintBundle.FareTypeDef defaultFareType;
    /**
     * CarrierConstraint
     * 
     */
    @JsonProperty("defaultCarrierConstraintRef")
    @JsonPropertyDescription("CarrierConstraint")
    private String defaultCarrierConstraintRef;
    /**
     * regulatory condition
     * 
     */
    @JsonProperty("defaultRegulatoryConditions")
    @JsonPropertyDescription("regulatory condition")
    private List<RegulatoryConditionsDef> defaultRegulatoryConditions = new ArrayList<RegulatoryConditionsDef>();

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("id")
    public String getId() {
        return id;
    }

    /**
     * 
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
    @JsonProperty("combinationConstraintRef")
    public String getCombinationConstraintRef() {
        return combinationConstraintRef;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("combinationConstraintRef")
    public void setCombinationConstraintRef(String combinationConstraintRef) {
        this.combinationConstraintRef = combinationConstraintRef;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("salesAvailabilityConstraintRef")
    public String getSalesAvailabilityConstraintRef() {
        return salesAvailabilityConstraintRef;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("salesAvailabilityConstraintRef")
    public void setSalesAvailabilityConstraintRef(String salesAvailabilityConstraintRef) {
        this.salesAvailabilityConstraintRef = salesAvailabilityConstraintRef;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("travelValidityConstraintRef")
    public String getTravelValidityConstraintRef() {
        return travelValidityConstraintRef;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("travelValidityConstraintRef")
    public void setTravelValidityConstraintRef(String travelValidityConstraintRef) {
        this.travelValidityConstraintRef = travelValidityConstraintRef;
    }

    @JsonProperty("fulfillmentConstraintRef")
    public String getFulfillmentConstraintRef() {
        return fulfillmentConstraintRef;
    }

    @JsonProperty("fulfillmentConstraintRef")
    public void setFulfillmentConstraintRef(String fulfillmentConstraintRef) {
        this.fulfillmentConstraintRef = fulfillmentConstraintRef;
    }

    @JsonProperty("personalDataConstraintRef")
    public String getPersonalDataConstraintRef() {
        return personalDataConstraintRef;
    }

    @JsonProperty("personalDataConstraintRef")
    public void setPersonalDataConstraintRef(String personalDataConstraintRef) {
        this.personalDataConstraintRef = personalDataConstraintRef;
    }

    @JsonProperty("passengerCombinationConstraintRef")
    public String getPassengerCombinationConstraintRef() {
        return passengerCombinationConstraintRef;
    }

    @JsonProperty("passengerCombinationConstraintRef")
    public void setPassengerCombinationConstraintRef(String passengerCombinationConstraintRef) {
        this.passengerCombinationConstraintRef = passengerCombinationConstraintRef;
    }

    /**
     * UIC fare types
     * (Required)
     * 
     */
    @JsonProperty("defaultFareType")
    public FareConstraintBundle.FareTypeDef getDefaultFareType() {
        return defaultFareType;
    }

    /**
     * UIC fare types
     * (Required)
     * 
     */
    @JsonProperty("defaultFareType")
    public void setDefaultFareType(FareConstraintBundle.FareTypeDef defaultFareType) {
        this.defaultFareType = defaultFareType;
    }

    /**
     * CarrierConstraint
     * 
     */
    @JsonProperty("defaultCarrierConstraintRef")
    public String getDefaultCarrierConstraintRef() {
        return defaultCarrierConstraintRef;
    }

    /**
     * CarrierConstraint
     * 
     */
    @JsonProperty("defaultCarrierConstraintRef")
    public void setDefaultCarrierConstraintRef(String defaultCarrierConstraintRef) {
        this.defaultCarrierConstraintRef = defaultCarrierConstraintRef;
    }

    /**
     * regulatory condition
     * 
     */
    @JsonProperty("defaultRegulatoryConditions")
    public List<RegulatoryConditionsDef> getDefaultRegulatoryConditions() {
        return defaultRegulatoryConditions;
    }

    /**
     * regulatory condition
     * 
     */
    @JsonProperty("defaultRegulatoryConditions")
    public void setDefaultRegulatoryConditions(List<RegulatoryConditionsDef> defaultRegulatoryConditions) {
        this.defaultRegulatoryConditions = defaultRegulatoryConditions;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(FareConstraintBundle.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("id");
        sb.append('=');
        sb.append(((this.id == null)?"<null>":this.id));
        sb.append(',');
        sb.append("combinationConstraintRef");
        sb.append('=');
        sb.append(((this.combinationConstraintRef == null)?"<null>":this.combinationConstraintRef));
        sb.append(',');
        sb.append("salesAvailabilityConstraintRef");
        sb.append('=');
        sb.append(((this.salesAvailabilityConstraintRef == null)?"<null>":this.salesAvailabilityConstraintRef));
        sb.append(',');
        sb.append("travelValidityConstraintRef");
        sb.append('=');
        sb.append(((this.travelValidityConstraintRef == null)?"<null>":this.travelValidityConstraintRef));
        sb.append(',');
        sb.append("fulfillmentConstraintRef");
        sb.append('=');
        sb.append(((this.fulfillmentConstraintRef == null)?"<null>":this.fulfillmentConstraintRef));
        sb.append(',');
        sb.append("personalDataConstraintRef");
        sb.append('=');
        sb.append(((this.personalDataConstraintRef == null)?"<null>":this.personalDataConstraintRef));
        sb.append(',');
        sb.append("passengerCombinationConstraintRef");
        sb.append('=');
        sb.append(((this.passengerCombinationConstraintRef == null)?"<null>":this.passengerCombinationConstraintRef));
        sb.append(',');
        sb.append("defaultFareType");
        sb.append('=');
        sb.append(((this.defaultFareType == null)?"<null>":this.defaultFareType));
        sb.append(',');
        sb.append("defaultCarrierConstraintRef");
        sb.append('=');
        sb.append(((this.defaultCarrierConstraintRef == null)?"<null>":this.defaultCarrierConstraintRef));
        sb.append(',');
        sb.append("defaultRegulatoryConditions");
        sb.append('=');
        sb.append(((this.defaultRegulatoryConditions == null)?"<null>":this.defaultRegulatoryConditions));
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
        result = ((result* 31)+((this.travelValidityConstraintRef == null)? 0 :this.travelValidityConstraintRef.hashCode()));
        result = ((result* 31)+((this.defaultCarrierConstraintRef == null)? 0 :this.defaultCarrierConstraintRef.hashCode()));
        result = ((result* 31)+((this.defaultFareType == null)? 0 :this.defaultFareType.hashCode()));
        result = ((result* 31)+((this.combinationConstraintRef == null)? 0 :this.combinationConstraintRef.hashCode()));
        result = ((result* 31)+((this.id == null)? 0 :this.id.hashCode()));
        result = ((result* 31)+((this.fulfillmentConstraintRef == null)? 0 :this.fulfillmentConstraintRef.hashCode()));
        result = ((result* 31)+((this.passengerCombinationConstraintRef == null)? 0 :this.passengerCombinationConstraintRef.hashCode()));
        result = ((result* 31)+((this.defaultRegulatoryConditions == null)? 0 :this.defaultRegulatoryConditions.hashCode()));
        result = ((result* 31)+((this.salesAvailabilityConstraintRef == null)? 0 :this.salesAvailabilityConstraintRef.hashCode()));
        result = ((result* 31)+((this.personalDataConstraintRef == null)? 0 :this.personalDataConstraintRef.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof FareConstraintBundle) == false) {
            return false;
        }
        FareConstraintBundle rhs = ((FareConstraintBundle) other);
        return (((((((((((this.travelValidityConstraintRef == rhs.travelValidityConstraintRef)||((this.travelValidityConstraintRef!= null)&&this.travelValidityConstraintRef.equals(rhs.travelValidityConstraintRef)))&&((this.defaultCarrierConstraintRef == rhs.defaultCarrierConstraintRef)||((this.defaultCarrierConstraintRef!= null)&&this.defaultCarrierConstraintRef.equals(rhs.defaultCarrierConstraintRef))))&&((this.defaultFareType == rhs.defaultFareType)||((this.defaultFareType!= null)&&this.defaultFareType.equals(rhs.defaultFareType))))&&((this.combinationConstraintRef == rhs.combinationConstraintRef)||((this.combinationConstraintRef!= null)&&this.combinationConstraintRef.equals(rhs.combinationConstraintRef))))&&((this.id == rhs.id)||((this.id!= null)&&this.id.equals(rhs.id))))&&((this.fulfillmentConstraintRef == rhs.fulfillmentConstraintRef)||((this.fulfillmentConstraintRef!= null)&&this.fulfillmentConstraintRef.equals(rhs.fulfillmentConstraintRef))))&&((this.passengerCombinationConstraintRef == rhs.passengerCombinationConstraintRef)||((this.passengerCombinationConstraintRef!= null)&&this.passengerCombinationConstraintRef.equals(rhs.passengerCombinationConstraintRef))))&&((this.defaultRegulatoryConditions == rhs.defaultRegulatoryConditions)||((this.defaultRegulatoryConditions!= null)&&this.defaultRegulatoryConditions.equals(rhs.defaultRegulatoryConditions))))&&((this.salesAvailabilityConstraintRef == rhs.salesAvailabilityConstraintRef)||((this.salesAvailabilityConstraintRef!= null)&&this.salesAvailabilityConstraintRef.equals(rhs.salesAvailabilityConstraintRef))))&&((this.personalDataConstraintRef == rhs.personalDataConstraintRef)||((this.personalDataConstraintRef!= null)&&this.personalDataConstraintRef.equals(rhs.personalDataConstraintRef))));
    }

    public enum FareTypeDef {

        ADMISSION("ADMISSION"),
        RESERVATION("RESERVATION"),
        INTEGRATED_RESERVATION("INTEGRATED_RESERVATION"),
        ANCILLARY("ANCILLARY");
        private final String value;
        private final static Map<String, FareConstraintBundle.FareTypeDef> CONSTANTS = new HashMap<String, FareConstraintBundle.FareTypeDef>();

        static {
            for (FareConstraintBundle.FareTypeDef c: values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        private FareTypeDef(String value) {
            this.value = value;
        }

        @Override
        public String toString() {
            return this.value;
        }

        @JsonValue
        public String value() {
            return this.value;
        }

        @JsonCreator
        public static FareConstraintBundle.FareTypeDef fromValue(String value) {
            FareConstraintBundle.FareTypeDef constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

}
