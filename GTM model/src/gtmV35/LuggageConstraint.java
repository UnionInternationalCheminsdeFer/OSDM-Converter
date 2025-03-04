
package gtmV35;

import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * constraints on luggage
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "id",
    "maxHandLuggage",
    "maxLargeLuggage",
    "restrictedLuggageItems",
    "luggageRules"
})
public class LuggageConstraint {

    @JsonProperty("id")
    private String id;
    /**
     * Standard hand luggage pieces
     * 
     */
    @JsonProperty("maxHandLuggage")
    @JsonPropertyDescription("Standard hand luggage pieces")
    private Integer maxHandLuggage;
    /**
     * Standard non-hand luggage pieces
     * 
     */
    @JsonProperty("maxLargeLuggage")
    @JsonPropertyDescription("Standard non-hand luggage pieces")
    private Integer maxLargeLuggage;
    @JsonProperty("restrictedLuggageItems")
    private List<LuggageRestriction> restrictedLuggageItems = new ArrayList<LuggageRestriction>();
    @JsonProperty("luggageRules")
    private List<String> luggageRules = new ArrayList<String>();

    @JsonProperty("id")
    public String getId() {
        return id;
    }

    @JsonProperty("id")
    public void setId(String id) {
        this.id = id;
    }

    /**
     * Standard hand luggage pieces
     * 
     */
    @JsonProperty("maxHandLuggage")
    public Integer getMaxHandLuggage() {
        return maxHandLuggage;
    }

    /**
     * Standard hand luggage pieces
     * 
     */
    @JsonProperty("maxHandLuggage")
    public void setMaxHandLuggage(Integer maxHandLuggage) {
        this.maxHandLuggage = maxHandLuggage;
    }

    /**
     * Standard non-hand luggage pieces
     * 
     */
    @JsonProperty("maxLargeLuggage")
    public Integer getMaxLargeLuggage() {
        return maxLargeLuggage;
    }

    /**
     * Standard non-hand luggage pieces
     * 
     */
    @JsonProperty("maxLargeLuggage")
    public void setMaxLargeLuggage(Integer maxLargeLuggage) {
        this.maxLargeLuggage = maxLargeLuggage;
    }

    @JsonProperty("restrictedLuggageItems")
    public List<LuggageRestriction> getRestrictedLuggageItems() {
        return restrictedLuggageItems;
    }

    @JsonProperty("restrictedLuggageItems")
    public void setRestrictedLuggageItems(List<LuggageRestriction> restrictedLuggageItems) {
        this.restrictedLuggageItems = restrictedLuggageItems;
    }

    @JsonProperty("luggageRules")
    public List<String> getLuggageRules() {
        return luggageRules;
    }

    @JsonProperty("luggageRules")
    public void setLuggageRules(List<String> luggageRules) {
        this.luggageRules = luggageRules;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(LuggageConstraint.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("id");
        sb.append('=');
        sb.append(((this.id == null)?"<null>":this.id));
        sb.append(',');
        sb.append("maxHandLuggage");
        sb.append('=');
        sb.append(((this.maxHandLuggage == null)?"<null>":this.maxHandLuggage));
        sb.append(',');
        sb.append("maxLargeLuggage");
        sb.append('=');
        sb.append(((this.maxLargeLuggage == null)?"<null>":this.maxLargeLuggage));
        sb.append(',');
        sb.append("restrictedLuggageItems");
        sb.append('=');
        sb.append(((this.restrictedLuggageItems == null)?"<null>":this.restrictedLuggageItems));
        sb.append(',');
        sb.append("luggageRules");
        sb.append('=');
        sb.append(((this.luggageRules == null)?"<null>":this.luggageRules));
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
        result = ((result* 31)+((this.restrictedLuggageItems == null)? 0 :this.restrictedLuggageItems.hashCode()));
        result = ((result* 31)+((this.maxHandLuggage == null)? 0 :this.maxHandLuggage.hashCode()));
        result = ((result* 31)+((this.maxLargeLuggage == null)? 0 :this.maxLargeLuggage.hashCode()));
        result = ((result* 31)+((this.id == null)? 0 :this.id.hashCode()));
        result = ((result* 31)+((this.luggageRules == null)? 0 :this.luggageRules.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof LuggageConstraint) == false) {
            return false;
        }
        LuggageConstraint rhs = ((LuggageConstraint) other);
        return ((((((this.restrictedLuggageItems == rhs.restrictedLuggageItems)||((this.restrictedLuggageItems!= null)&&this.restrictedLuggageItems.equals(rhs.restrictedLuggageItems)))&&((this.maxHandLuggage == rhs.maxHandLuggage)||((this.maxHandLuggage!= null)&&this.maxHandLuggage.equals(rhs.maxHandLuggage))))&&((this.maxLargeLuggage == rhs.maxLargeLuggage)||((this.maxLargeLuggage!= null)&&this.maxLargeLuggage.equals(rhs.maxLargeLuggage))))&&((this.id == rhs.id)||((this.id!= null)&&this.id.equals(rhs.id))))&&((this.luggageRules == rhs.luggageRules)||((this.luggageRules!= null)&&this.luggageRules.equals(rhs.luggageRules))));
    }

}
