
package gtmV35;

import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "numberOfItems",
    "restrictions"
})
public class LuggageRestriction {

    /**
     * number of luggage  items allowed with this restriction
     * (Required)
     * 
     */
    @JsonProperty("numberOfItems")
    @JsonPropertyDescription("number of luggage  items allowed with this restriction")
    private Integer numberOfItems;
    /**
     * all listed dimensions apply to the luggage items as upper limits
     * (Required)
     * 
     */
    @JsonProperty("restrictions")
    @JsonPropertyDescription("all listed dimensions apply to the luggage items as upper limits")
    private List<LuggageDimension> restrictions = new ArrayList<LuggageDimension>();

    /**
     * number of luggage  items allowed with this restriction
     * (Required)
     * 
     */
    @JsonProperty("numberOfItems")
    public Integer getNumberOfItems() {
        return numberOfItems;
    }

    /**
     * number of luggage  items allowed with this restriction
     * (Required)
     * 
     */
    @JsonProperty("numberOfItems")
    public void setNumberOfItems(Integer numberOfItems) {
        this.numberOfItems = numberOfItems;
    }

    /**
     * all listed dimensions apply to the luggage items as upper limits
     * (Required)
     * 
     */
    @JsonProperty("restrictions")
    public List<LuggageDimension> getRestrictions() {
        return restrictions;
    }

    /**
     * all listed dimensions apply to the luggage items as upper limits
     * (Required)
     * 
     */
    @JsonProperty("restrictions")
    public void setRestrictions(List<LuggageDimension> restrictions) {
        this.restrictions = restrictions;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(LuggageRestriction.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("numberOfItems");
        sb.append('=');
        sb.append(((this.numberOfItems == null)?"<null>":this.numberOfItems));
        sb.append(',');
        sb.append("restrictions");
        sb.append('=');
        sb.append(((this.restrictions == null)?"<null>":this.restrictions));
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
        result = ((result* 31)+((this.restrictions == null)? 0 :this.restrictions.hashCode()));
        result = ((result* 31)+((this.numberOfItems == null)? 0 :this.numberOfItems.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof LuggageRestriction) == false) {
            return false;
        }
        LuggageRestriction rhs = ((LuggageRestriction) other);
        return (((this.restrictions == rhs.restrictions)||((this.restrictions!= null)&&this.restrictions.equals(rhs.restrictions)))&&((this.numberOfItems == rhs.numberOfItems)||((this.numberOfItems!= null)&&this.numberOfItems.equals(rhs.numberOfItems))));
    }

}
