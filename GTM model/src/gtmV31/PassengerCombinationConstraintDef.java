
package gtmV31;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "id",
    "maxWeightedPassengers",
    "minWeightedPassengers"
})
public class PassengerCombinationConstraintDef {

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("id")
    private String id;
    /**
     * The total weighted number of passengers on the offer is restricted to be equal or smaller than this maximum
     * 
     */
    @JsonProperty("maxWeightedPassengers")
    @JsonPropertyDescription("The total weighted number of passengers on the offer is restricted to be equal or smaller than this maximum")
    private Float maxWeightedPassengers = 999.0F;
    /**
     * The total weighted number of passengers on the offer is restricted to equal or larger than this minimum
     * 
     */
    @JsonProperty("minWeightedPassengers")
    @JsonPropertyDescription("The total weighted number of passengers on the offer is restricted to equal or larger than this minimum")
    private Float minWeightedPassengers = 0.0F;

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
     * The total weighted number of passengers on the offer is restricted to be equal or smaller than this maximum
     * 
     */
    @JsonProperty("maxWeightedPassengers")
    public Float getMaxWeightedPassengers() {
        return maxWeightedPassengers;
    }

    /**
     * The total weighted number of passengers on the offer is restricted to be equal or smaller than this maximum
     * 
     */
    @JsonProperty("maxWeightedPassengers")
    public void setMaxWeightedPassengers(Float maxWeightedPassengers) {
        this.maxWeightedPassengers = maxWeightedPassengers;
    }

    /**
     * The total weighted number of passengers on the offer is restricted to equal or larger than this minimum
     * 
     */
    @JsonProperty("minWeightedPassengers")
    public Float getMinWeightedPassengers() {
        return minWeightedPassengers;
    }

    /**
     * The total weighted number of passengers on the offer is restricted to equal or larger than this minimum
     * 
     */
    @JsonProperty("minWeightedPassengers")
    public void setMinWeightedPassengers(Float minWeightedPassengers) {
        this.minWeightedPassengers = minWeightedPassengers;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(PassengerCombinationConstraintDef.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("id");
        sb.append('=');
        sb.append(((this.id == null)?"<null>":this.id));
        sb.append(',');
        sb.append("maxWeightedPassengers");
        sb.append('=');
        sb.append(((this.maxWeightedPassengers == null)?"<null>":this.maxWeightedPassengers));
        sb.append(',');
        sb.append("minWeightedPassengers");
        sb.append('=');
        sb.append(((this.minWeightedPassengers == null)?"<null>":this.minWeightedPassengers));
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
        result = ((result* 31)+((this.maxWeightedPassengers == null)? 0 :this.maxWeightedPassengers.hashCode()));
        result = ((result* 31)+((this.id == null)? 0 :this.id.hashCode()));
        result = ((result* 31)+((this.minWeightedPassengers == null)? 0 :this.minWeightedPassengers.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof PassengerCombinationConstraintDef) == false) {
            return false;
        }
        PassengerCombinationConstraintDef rhs = ((PassengerCombinationConstraintDef) other);
        return ((((this.maxWeightedPassengers == rhs.maxWeightedPassengers)||((this.maxWeightedPassengers!= null)&&this.maxWeightedPassengers.equals(rhs.maxWeightedPassengers)))&&((this.id == rhs.id)||((this.id!= null)&&this.id.equals(rhs.id))))&&((this.minWeightedPassengers == rhs.minWeightedPassengers)||((this.minWeightedPassengers!= null)&&this.minWeightedPassengers.equals(rhs.minWeightedPassengers))));
    }

}
