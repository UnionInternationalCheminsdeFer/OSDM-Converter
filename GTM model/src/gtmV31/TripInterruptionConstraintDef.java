
package gtmV31;

import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * rules on allowed trip interruptions. Interruptions due to a train change  indicated by a trip search must not be included here.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "maxInterruptions",
    "maxDuration",
    "totalMaxDuration",
    "requiredProcesses"
})
public class TripInterruptionConstraintDef {

    /**
     * maximum number of interruptions
     * (Required)
     * 
     */
    @JsonProperty("maxInterruptions")
    @JsonPropertyDescription("maximum number of interruptions")
    private Integer maxInterruptions;
    /**
     * maximum duration of one interruption
     * 
     */
    @JsonProperty("maxDuration")
    @JsonPropertyDescription("maximum duration of one interruption")
    private String maxDuration;
    /**
     * maximum duration of all interruptions on the route
     * 
     */
    @JsonProperty("totalMaxDuration")
    @JsonPropertyDescription("maximum duration of all interruptions on the route")
    private String totalMaxDuration;
    /**
     * one of the listed processes is required for the interruption of the trip.
     * (Required)
     * 
     */
    @JsonProperty("requiredProcesses")
    @JsonPropertyDescription("one of the listed processes is required for the interruption of the trip.")
    private List<String> requiredProcesses = new ArrayList<String>();

    /**
     * maximum number of interruptions
     * (Required)
     * 
     */
    @JsonProperty("maxInterruptions")
    public Integer getMaxInterruptions() {
        return maxInterruptions;
    }

    /**
     * maximum number of interruptions
     * (Required)
     * 
     */
    @JsonProperty("maxInterruptions")
    public void setMaxInterruptions(Integer maxInterruptions) {
        this.maxInterruptions = maxInterruptions;
    }

    /**
     * maximum duration of one interruption
     * 
     */
    @JsonProperty("maxDuration")
    public String getMaxDuration() {
        return maxDuration;
    }

    /**
     * maximum duration of one interruption
     * 
     */
    @JsonProperty("maxDuration")
    public void setMaxDuration(String maxDuration) {
        this.maxDuration = maxDuration;
    }

    /**
     * maximum duration of all interruptions on the route
     * 
     */
    @JsonProperty("totalMaxDuration")
    public String getTotalMaxDuration() {
        return totalMaxDuration;
    }

    /**
     * maximum duration of all interruptions on the route
     * 
     */
    @JsonProperty("totalMaxDuration")
    public void setTotalMaxDuration(String totalMaxDuration) {
        this.totalMaxDuration = totalMaxDuration;
    }

    /**
     * one of the listed processes is required for the interruption of the trip.
     * (Required)
     * 
     */
    @JsonProperty("requiredProcesses")
    public List<String> getRequiredProcesses() {
        return requiredProcesses;
    }

    /**
     * one of the listed processes is required for the interruption of the trip.
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
        sb.append(TripInterruptionConstraintDef.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("maxInterruptions");
        sb.append('=');
        sb.append(((this.maxInterruptions == null)?"<null>":this.maxInterruptions));
        sb.append(',');
        sb.append("maxDuration");
        sb.append('=');
        sb.append(((this.maxDuration == null)?"<null>":this.maxDuration));
        sb.append(',');
        sb.append("totalMaxDuration");
        sb.append('=');
        sb.append(((this.totalMaxDuration == null)?"<null>":this.totalMaxDuration));
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
        result = ((result* 31)+((this.requiredProcesses == null)? 0 :this.requiredProcesses.hashCode()));
        result = ((result* 31)+((this.maxDuration == null)? 0 :this.maxDuration.hashCode()));
        result = ((result* 31)+((this.totalMaxDuration == null)? 0 :this.totalMaxDuration.hashCode()));
        result = ((result* 31)+((this.maxInterruptions == null)? 0 :this.maxInterruptions.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof TripInterruptionConstraintDef) == false) {
            return false;
        }
        TripInterruptionConstraintDef rhs = ((TripInterruptionConstraintDef) other);
        return (((((this.requiredProcesses == rhs.requiredProcesses)||((this.requiredProcesses!= null)&&this.requiredProcesses.equals(rhs.requiredProcesses)))&&((this.maxDuration == rhs.maxDuration)||((this.maxDuration!= null)&&this.maxDuration.equals(rhs.maxDuration))))&&((this.totalMaxDuration == rhs.totalMaxDuration)||((this.totalMaxDuration!= null)&&this.totalMaxDuration.equals(rhs.totalMaxDuration))))&&((this.maxInterruptions == rhs.maxInterruptions)||((this.maxInterruptions!= null)&&this.maxInterruptions.equals(rhs.maxInterruptions))));
    }

}
