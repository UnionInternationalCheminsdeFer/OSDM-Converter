
package gtmV35;

import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * constraint on the use of a multiple trip ticket
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "allocationUnit",
    "maxUnits",
    "durationUnit",
    "requiredProcesses"
})
public class TripAllocationConstraintDef {

    /**
     * NONE: Individual trips don't need to be allocated. TRIP: allocation per individual trip. DAY: The allocation is per travel day DURATION: the allocation is per duration
     * (Required)
     * 
     */
    @JsonProperty("allocationUnit")
    @JsonPropertyDescription("NONE: Individual trips don't need to be allocated. TRIP: allocation per individual trip. DAY: The allocation is per travel day DURATION: the allocation is per duration")
    private String allocationUnit;
    /**
     * maximum number of allowed units to be allocated
     * 
     */
    @JsonProperty("maxUnits")
    @JsonPropertyDescription("maximum number of allowed units to be allocated")
    private Integer maxUnits;
    /**
     * multiples of this duration can be allocated
     * 
     */
    @JsonProperty("durationUnit")
    @JsonPropertyDescription("multiples of this duration can be allocated")
    private String durationUnit;
    /**
     * one of the listed processes is required for the allocation of a single trip.
     * (Required)
     * 
     */
    @JsonProperty("requiredProcesses")
    @JsonPropertyDescription("one of the listed processes is required for the allocation of a single trip.")
    private List<String> requiredProcesses = new ArrayList<String>();

    /**
     * NONE: Individual trips don't need to be allocated. TRIP: allocation per individual trip. DAY: The allocation is per travel day DURATION: the allocation is per duration
     * (Required)
     * 
     */
    @JsonProperty("allocationUnit")
    public String getAllocationUnit() {
        return allocationUnit;
    }

    /**
     * NONE: Individual trips don't need to be allocated. TRIP: allocation per individual trip. DAY: The allocation is per travel day DURATION: the allocation is per duration
     * (Required)
     * 
     */
    @JsonProperty("allocationUnit")
    public void setAllocationUnit(String allocationUnit) {
        this.allocationUnit = allocationUnit;
    }

    /**
     * maximum number of allowed units to be allocated
     * 
     */
    @JsonProperty("maxUnits")
    public Integer getMaxUnits() {
        return maxUnits;
    }

    /**
     * maximum number of allowed units to be allocated
     * 
     */
    @JsonProperty("maxUnits")
    public void setMaxUnits(Integer maxUnits) {
        this.maxUnits = maxUnits;
    }

    /**
     * multiples of this duration can be allocated
     * 
     */
    @JsonProperty("durationUnit")
    public String getDurationUnit() {
        return durationUnit;
    }

    /**
     * multiples of this duration can be allocated
     * 
     */
    @JsonProperty("durationUnit")
    public void setDurationUnit(String durationUnit) {
        this.durationUnit = durationUnit;
    }

    /**
     * one of the listed processes is required for the allocation of a single trip.
     * (Required)
     * 
     */
    @JsonProperty("requiredProcesses")
    public List<String> getRequiredProcesses() {
        return requiredProcesses;
    }

    /**
     * one of the listed processes is required for the allocation of a single trip.
     * (Required)
     * 
     */
    @JsonProperty("requiredProcesses")
    public void setRequiredProcesses(List<String> requiredProcesses) {
        this.requiredProcesses = requiredProcesses;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(TripAllocationConstraintDef.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("allocationUnit");
        sb.append('=');
        sb.append(((this.allocationUnit == null)?"<null>":this.allocationUnit));
        sb.append(',');
        sb.append("maxUnits");
        sb.append('=');
        sb.append(((this.maxUnits == null)?"<null>":this.maxUnits));
        sb.append(',');
        sb.append("durationUnit");
        sb.append('=');
        sb.append(((this.durationUnit == null)?"<null>":this.durationUnit));
        sb.append(',');
        sb.append("requiredProcesses");
        sb.append('=');
        sb.append(((this.requiredProcesses == null)?"<null>":this.requiredProcesses));
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
        result = ((result* 31)+((this.maxUnits == null)? 0 :this.maxUnits.hashCode()));
        result = ((result* 31)+((this.allocationUnit == null)? 0 :this.allocationUnit.hashCode()));
        result = ((result* 31)+((this.durationUnit == null)? 0 :this.durationUnit.hashCode()));
        result = ((result* 31)+((this.requiredProcesses == null)? 0 :this.requiredProcesses.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof TripAllocationConstraintDef) == false) {
            return false;
        }
        TripAllocationConstraintDef rhs = ((TripAllocationConstraintDef) other);
        return (((((this.maxUnits == rhs.maxUnits)||((this.maxUnits!= null)&&this.maxUnits.equals(rhs.maxUnits)))&&((this.allocationUnit == rhs.allocationUnit)||((this.allocationUnit!= null)&&this.allocationUnit.equals(rhs.allocationUnit))))&&((this.durationUnit == rhs.durationUnit)||((this.durationUnit!= null)&&this.durationUnit.equals(rhs.durationUnit))))&&((this.requiredProcesses == rhs.requiredProcesses)||((this.requiredProcesses!= null)&&this.requiredProcesses.equals(rhs.requiredProcesses))));
    }

}
