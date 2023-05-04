
package gtmV31;

import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonValue;


/**
 * luggage dimension to be used in luggage restrictions
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "dimension",
    "value"
})
public class LuggageDimension {

    /**
     * type of the restriction. weight in kg, length in cm, volume in liter. Combined sizes are the sum of the sizes  WIDTH_HEIGHT_LENGTH = sum of width, hight and length in cm (linear equivalent).
     * (Required)
     * 
     */
    @JsonProperty("dimension")
    @JsonPropertyDescription("type of the restriction. weight in kg, length in cm, volume in liter. Combined sizes are the sum of the sizes  WIDTH_HEIGHT_LENGTH = sum of width, hight and length in cm (linear equivalent).")
    private LuggageDimension.Dimension dimension;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("value")
    private Integer value;

    /**
     * type of the restriction. weight in kg, length in cm, volume in liter. Combined sizes are the sum of the sizes  WIDTH_HEIGHT_LENGTH = sum of width, hight and length in cm (linear equivalent).
     * (Required)
     * 
     */
    @JsonProperty("dimension")
    public LuggageDimension.Dimension getDimension() {
        return dimension;
    }

    /**
     * type of the restriction. weight in kg, length in cm, volume in liter. Combined sizes are the sum of the sizes  WIDTH_HEIGHT_LENGTH = sum of width, hight and length in cm (linear equivalent).
     * (Required)
     * 
     */
    @JsonProperty("dimension")
    public void setDimension(LuggageDimension.Dimension dimension) {
        this.dimension = dimension;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("value")
    public Integer getValue() {
        return value;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("value")
    public void setValue(Integer value) {
        this.value = value;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(LuggageDimension.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("dimension");
        sb.append('=');
        sb.append(((this.dimension == null)?"<null>":this.dimension));
        sb.append(',');
        sb.append("value");
        sb.append('=');
        sb.append(((this.value == null)?"<null>":this.value));
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
        result = ((result* 31)+((this.dimension == null)? 0 :this.dimension.hashCode()));
        result = ((result* 31)+((this.value == null)? 0 :this.value.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof LuggageDimension) == false) {
            return false;
        }
        LuggageDimension rhs = ((LuggageDimension) other);
        return (((this.dimension == rhs.dimension)||((this.dimension!= null)&&this.dimension.equals(rhs.dimension)))&&((this.value == rhs.value)||((this.value!= null)&&this.value.equals(rhs.value))));
    }

    public enum Dimension {

        WIDTH("WIDTH"),
        HEIGHT("HEIGHT"),
        LENGTH("LENGTH"),
        WIDTH_HEIGHT("WIDTH_HEIGHT"),
        WIDTH_HEIGHT_LENGTH("WIDTH_HEIGHT_LENGTH"),
        WEIGHT("WEIGHT"),
        VOLUME("VOLUME");
        private final String value;
        private final static Map<String, LuggageDimension.Dimension> CONSTANTS = new HashMap<String, LuggageDimension.Dimension>();

        static {
            for (LuggageDimension.Dimension c: values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        private Dimension(String value) {
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
        public static LuggageDimension.Dimension fromValue(String value) {
            LuggageDimension.Dimension constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

}
