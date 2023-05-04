
package gtmV31;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "number",
    "passengerTypeRef",
    "passengerConstraintRef"
})
public class IncludedFreePassenger {

    /**
     * Number of passengers that can be included with one passenger for free. The number is given in fractions. The  calculation needs a precision of 1 digit fraction (e.g. with 0.33 dogs you need 3 adults to transport one dog  for free).
     * 
     */
    @JsonProperty("number")
    @JsonPropertyDescription("Number of passengers that can be included with one passenger for free. The number is given in fractions. The  calculation needs a precision of 1 digit fraction (e.g. with 0.33 dogs you need 3 adults to transport one dog  for free).")
    private Integer number;
    /**
     * Subset of the values from the traveler type code list IRS 90918-10 
     * 
     */
    @JsonProperty("passengerTypeRef")
    @JsonPropertyDescription("Subset of the values from the traveler type code list IRS 90918-10 ")
    private String passengerTypeRef;
    @JsonProperty("passengerConstraintRef")
    private String passengerConstraintRef;

    /**
     * Number of passengers that can be included with one passenger for free. The number is given in fractions. The  calculation needs a precision of 1 digit fraction (e.g. with 0.33 dogs you need 3 adults to transport one dog  for free).
     * 
     */
    @JsonProperty("number")
    public Integer getNumber() {
        return number;
    }

    /**
     * Number of passengers that can be included with one passenger for free. The number is given in fractions. The  calculation needs a precision of 1 digit fraction (e.g. with 0.33 dogs you need 3 adults to transport one dog  for free).
     * 
     */
    @JsonProperty("number")
    public void setNumber(Integer number) {
        this.number = number;
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

    @JsonProperty("passengerConstraintRef")
    public String getPassengerConstraintRef() {
        return passengerConstraintRef;
    }

    @JsonProperty("passengerConstraintRef")
    public void setPassengerConstraintRef(String passengerConstraintRef) {
        this.passengerConstraintRef = passengerConstraintRef;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(IncludedFreePassenger.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("number");
        sb.append('=');
        sb.append(((this.number == null)?"<null>":this.number));
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
        result = ((result* 31)+((this.number == null)? 0 :this.number.hashCode()));
        result = ((result* 31)+((this.passengerTypeRef == null)? 0 :this.passengerTypeRef.hashCode()));
        result = ((result* 31)+((this.passengerConstraintRef == null)? 0 :this.passengerConstraintRef.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof IncludedFreePassenger) == false) {
            return false;
        }
        IncludedFreePassenger rhs = ((IncludedFreePassenger) other);
        return ((((this.number == rhs.number)||((this.number!= null)&&this.number.equals(rhs.number)))&&((this.passengerTypeRef == rhs.passengerTypeRef)||((this.passengerTypeRef!= null)&&this.passengerTypeRef.equals(rhs.passengerTypeRef))))&&((this.passengerConstraintRef == rhs.passengerConstraintRef)||((this.passengerConstraintRef!= null)&&this.passengerConstraintRef.equals(rhs.passengerConstraintRef))));
    }

}
