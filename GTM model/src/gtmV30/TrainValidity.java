
package gtmV30;

import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonValue;


/**
 * validity depending on boarding / leaving of a train. The ticket is also valid from departure until the destination station in the train 
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "carrierConstraintRef",
    "serviceConstraintRef",
    "scope"
})
public class TrainValidity {

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("carrierConstraintRef")
    private String carrierConstraintRef;
    @JsonProperty("serviceConstraintRef")
    private String serviceConstraintRef;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("scope")
    private TrainValidity.Scope scope = TrainValidity.Scope.fromValue("BOARDING");

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("carrierConstraintRef")
    public String getCarrierConstraintRef() {
        return carrierConstraintRef;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("carrierConstraintRef")
    public void setCarrierConstraintRef(String carrierConstraintRef) {
        this.carrierConstraintRef = carrierConstraintRef;
    }

    @JsonProperty("serviceConstraintRef")
    public String getServiceConstraintRef() {
        return serviceConstraintRef;
    }

    @JsonProperty("serviceConstraintRef")
    public void setServiceConstraintRef(String serviceConstraintRef) {
        this.serviceConstraintRef = serviceConstraintRef;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("scope")
    public TrainValidity.Scope getScope() {
        return scope;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("scope")
    public void setScope(TrainValidity.Scope scope) {
        this.scope = scope;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(TrainValidity.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("carrierConstraintRef");
        sb.append('=');
        sb.append(((this.carrierConstraintRef == null)?"<null>":this.carrierConstraintRef));
        sb.append(',');
        sb.append("serviceConstraintRef");
        sb.append('=');
        sb.append(((this.serviceConstraintRef == null)?"<null>":this.serviceConstraintRef));
        sb.append(',');
        sb.append("scope");
        sb.append('=');
        sb.append(((this.scope == null)?"<null>":this.scope));
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
        result = ((result* 31)+((this.carrierConstraintRef == null)? 0 :this.carrierConstraintRef.hashCode()));
        result = ((result* 31)+((this.serviceConstraintRef == null)? 0 :this.serviceConstraintRef.hashCode()));
        result = ((result* 31)+((this.scope == null)? 0 :this.scope.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof TrainValidity) == false) {
            return false;
        }
        TrainValidity rhs = ((TrainValidity) other);
        return ((((this.carrierConstraintRef == rhs.carrierConstraintRef)||((this.carrierConstraintRef!= null)&&this.carrierConstraintRef.equals(rhs.carrierConstraintRef)))&&((this.serviceConstraintRef == rhs.serviceConstraintRef)||((this.serviceConstraintRef!= null)&&this.serviceConstraintRef.equals(rhs.serviceConstraintRef))))&&((this.scope == rhs.scope)||((this.scope!= null)&&this.scope.equals(rhs.scope))));
    }

    public enum Scope {

        BOARDING("BOARDING"),
        ARRIVAL("ARRIVAL");
        private final String value;
        private final static Map<String, TrainValidity.Scope> CONSTANTS = new HashMap<String, TrainValidity.Scope>();

        static {
            for (TrainValidity.Scope c: values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        private Scope(String value) {
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
        public static TrainValidity.Scope fromValue(String value) {
            TrainValidity.Scope constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

}
