
package gtmV35;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "maxNumber",
    "minNumber",
    "passengerTypeRef",
    "passengerConstraintRef"
})
public class CombinationConstraint {

    /**
     * number of passengers allowed per accompanying passenger
     * 
     */
    @JsonProperty("maxNumber")
    @JsonPropertyDescription("number of passengers allowed per accompanying passenger")
    private Integer maxNumber = 999;
    /**
     * number of passengers required as accompanying passenger
     * 
     */
    @JsonProperty("minNumber")
    @JsonPropertyDescription("number of passengers required as accompanying passenger")
    private Integer minNumber = 999;
    /**
     * Subset of the values from the traveler type code list IRS 90918-10 
     * 
     */
    @JsonProperty("passengerTypeRef")
    @JsonPropertyDescription("Subset of the values from the traveler type code list IRS 90918-10 ")
    private String passengerTypeRef;
    /**
     * Reference to a passenger constraint defining the passengers to be included for free. The referenced passenger constraint must not itself contain included free passengers
     * 
     */
    @JsonProperty("passengerConstraintRef")
    @JsonPropertyDescription("Reference to a passenger constraint defining the passengers to be included for free. The referenced passenger constraint must not itself contain included free passengers")
    private String passengerConstraintRef;

    /**
     * number of passengers allowed per accompanying passenger
     * 
     */
    @JsonProperty("maxNumber")
    public Integer getMaxNumber() {
        return maxNumber;
    }

    /**
     * number of passengers allowed per accompanying passenger
     * 
     */
    @JsonProperty("maxNumber")
    public void setMaxNumber(Integer maxNumber) {
        this.maxNumber = maxNumber;
    }

    /**
     * number of passengers required as accompanying passenger
     * 
     */
    @JsonProperty("minNumber")
    public Integer getMinNumber() {
        return minNumber;
    }

    /**
     * number of passengers required as accompanying passenger
     * 
     */
    @JsonProperty("minNumber")
    public void setMinNumber(Integer minNumber) {
        this.minNumber = minNumber;
    }

    /**
     * Subset of the values from the traveler type code list IRS 90918-10 
     * 
     */
    @JsonProperty("passengerTypeRef")
    public String getPassengerTypeRef() {
        return passengerTypeRef;
    }

    /**
     * Subset of the values from the traveler type code list IRS 90918-10 
     * 
     */
    @JsonProperty("passengerTypeRef")
    public void setPassengerTypeRef(String passengerTypeRef) {
        this.passengerTypeRef = passengerTypeRef;
    }

    /**
     * Reference to a passenger constraint defining the passengers to be included for free. The referenced passenger constraint must not itself contain included free passengers
     * 
     */
    @JsonProperty("passengerConstraintRef")
    public String getPassengerConstraintRef() {
        return passengerConstraintRef;
    }

    /**
     * Reference to a passenger constraint defining the passengers to be included for free. The referenced passenger constraint must not itself contain included free passengers
     * 
     */
    @JsonProperty("passengerConstraintRef")
    public void setPassengerConstraintRef(String passengerConstraintRef) {
        this.passengerConstraintRef = passengerConstraintRef;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(CombinationConstraint.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("maxNumber");
        sb.append('=');
        sb.append(((this.maxNumber == null)?"<null>":this.maxNumber));
        sb.append(',');
        sb.append("minNumber");
        sb.append('=');
        sb.append(((this.minNumber == null)?"<null>":this.minNumber));
        sb.append(',');
        sb.append("passengerTypeRef");
        sb.append('=');
        sb.append(((this.passengerTypeRef == null)?"<null>":this.passengerTypeRef));
        sb.append(',');
        sb.append("passengerConstraintRef");
        sb.append('=');
        sb.append(((this.passengerConstraintRef == null)?"<null>":this.passengerConstraintRef));
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
        result = ((result* 31)+((this.passengerTypeRef == null)? 0 :this.passengerTypeRef.hashCode()));
        result = ((result* 31)+((this.minNumber == null)? 0 :this.minNumber.hashCode()));
        result = ((result* 31)+((this.passengerConstraintRef == null)? 0 :this.passengerConstraintRef.hashCode()));
        result = ((result* 31)+((this.maxNumber == null)? 0 :this.maxNumber.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof CombinationConstraint) == false) {
            return false;
        }
        CombinationConstraint rhs = ((CombinationConstraint) other);
        return (((((this.passengerTypeRef == rhs.passengerTypeRef)||((this.passengerTypeRef!= null)&&this.passengerTypeRef.equals(rhs.passengerTypeRef)))&&((this.minNumber == rhs.minNumber)||((this.minNumber!= null)&&this.minNumber.equals(rhs.minNumber))))&&((this.passengerConstraintRef == rhs.passengerConstraintRef)||((this.passengerConstraintRef!= null)&&this.passengerConstraintRef.equals(rhs.passengerConstraintRef))))&&((this.maxNumber == rhs.maxNumber)||((this.maxNumber!= null)&&this.maxNumber.equals(rhs.maxNumber))));
    }

}
