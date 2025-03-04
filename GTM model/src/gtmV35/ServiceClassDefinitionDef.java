
package gtmV35;

import java.util.HashMap;
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
    "textRef",
    "comfortClass",
    "travelClass"
})
public class ServiceClassDefinitionDef {

    /**
     * Level of quality, finer grained than the comfort class.
     * (Required)
     * 
     */
    @JsonProperty("id")
    @JsonPropertyDescription("Level of quality, finer grained than the comfort class.")
    private ServiceClassDefinitionDef.ServiceClassIdDef id;
    /**
     * id of the text describing the class within the offline data text list
     * 
     */
    @JsonProperty("textRef")
    @JsonPropertyDescription("id of the text describing the class within the offline data text list")
    private String textRef;
    /**
     * Generic class classification, mostly used to harmonize choice and representation across multiple carriers
     * 
     */
    @JsonProperty("comfortClass")
    @JsonPropertyDescription("Generic class classification, mostly used to harmonize choice and representation across multiple carriers")
    private ServiceClassDefinitionDef.ComfortClassDef comfortClass;
    /**
     * Generic class classification, mostly used to harmonize choice and representation across multiple carriers
     * 
     */
    @JsonProperty("travelClass")
    @JsonPropertyDescription("Generic class classification, mostly used to harmonize choice and representation across multiple carriers")
    private ServiceClassDefinitionDef.TravelClassDef travelClass;

    /**
     * Level of quality, finer grained than the comfort class.
     * (Required)
     * 
     */
    @JsonProperty("id")
    public ServiceClassDefinitionDef.ServiceClassIdDef getId() {
        return id;
    }

    /**
     * Level of quality, finer grained than the comfort class.
     * (Required)
     * 
     */
    @JsonProperty("id")
    public void setId(ServiceClassDefinitionDef.ServiceClassIdDef id) {
        this.id = id;
    }

    /**
     * id of the text describing the class within the offline data text list
     * 
     */
    @JsonProperty("textRef")
    public String getTextRef() {
        return textRef;
    }

    /**
     * id of the text describing the class within the offline data text list
     * 
     */
    @JsonProperty("textRef")
    public void setTextRef(String textRef) {
        this.textRef = textRef;
    }

    /**
     * Generic class classification, mostly used to harmonize choice and representation across multiple carriers
     * 
     */
    @JsonProperty("comfortClass")
    public ServiceClassDefinitionDef.ComfortClassDef getComfortClass() {
        return comfortClass;
    }

    /**
     * Generic class classification, mostly used to harmonize choice and representation across multiple carriers
     * 
     */
    @JsonProperty("comfortClass")
    public void setComfortClass(ServiceClassDefinitionDef.ComfortClassDef comfortClass) {
        this.comfortClass = comfortClass;
    }

    /**
     * Generic class classification, mostly used to harmonize choice and representation across multiple carriers
     * 
     */
    @JsonProperty("travelClass")
    public ServiceClassDefinitionDef.TravelClassDef getTravelClass() {
        return travelClass;
    }

    /**
     * Generic class classification, mostly used to harmonize choice and representation across multiple carriers
     * 
     */
    @JsonProperty("travelClass")
    public void setTravelClass(ServiceClassDefinitionDef.TravelClassDef travelClass) {
        this.travelClass = travelClass;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(ServiceClassDefinitionDef.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("id");
        sb.append('=');
        sb.append(((this.id == null)?"<null>":this.id));
        sb.append(',');
        sb.append("textRef");
        sb.append('=');
        sb.append(((this.textRef == null)?"<null>":this.textRef));
        sb.append(',');
        sb.append("comfortClass");
        sb.append('=');
        sb.append(((this.comfortClass == null)?"<null>":this.comfortClass));
        sb.append(',');
        sb.append("travelClass");
        sb.append('=');
        sb.append(((this.travelClass == null)?"<null>":this.travelClass));
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
        result = ((result* 31)+((this.id == null)? 0 :this.id.hashCode()));
        result = ((result* 31)+((this.textRef == null)? 0 :this.textRef.hashCode()));
        result = ((result* 31)+((this.comfortClass == null)? 0 :this.comfortClass.hashCode()));
        result = ((result* 31)+((this.travelClass == null)? 0 :this.travelClass.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof ServiceClassDefinitionDef) == false) {
            return false;
        }
        ServiceClassDefinitionDef rhs = ((ServiceClassDefinitionDef) other);
        return (((((this.id == rhs.id)||((this.id!= null)&&this.id.equals(rhs.id)))&&((this.textRef == rhs.textRef)||((this.textRef!= null)&&this.textRef.equals(rhs.textRef))))&&((this.comfortClass == rhs.comfortClass)||((this.comfortClass!= null)&&this.comfortClass.equals(rhs.comfortClass))))&&((this.travelClass == rhs.travelClass)||((this.travelClass!= null)&&this.travelClass.equals(rhs.travelClass))));
    }

    public enum ComfortClassDef {

        FIRST("FIRST"),
        SECOND("SECOND"),
        ANY_CLASS("ANY_CLASS");
        private final String value;
        private final static Map<String, ServiceClassDefinitionDef.ComfortClassDef> CONSTANTS = new HashMap<String, ServiceClassDefinitionDef.ComfortClassDef>();

        static {
            for (ServiceClassDefinitionDef.ComfortClassDef c: values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        private ComfortClassDef(String value) {
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
        public static ServiceClassDefinitionDef.ComfortClassDef fromValue(String value) {
            ServiceClassDefinitionDef.ComfortClassDef constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

    public enum ServiceClassIdDef {

        BEST("BEST"),
        HIGH("HIGH"),
        STANDARD("STANDARD"),
        BASIC("BASIC"),
        ANY_CLASS("ANY_CLASS");
        private final String value;
        private final static Map<String, ServiceClassDefinitionDef.ServiceClassIdDef> CONSTANTS = new HashMap<String, ServiceClassDefinitionDef.ServiceClassIdDef>();

        static {
            for (ServiceClassDefinitionDef.ServiceClassIdDef c: values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        private ServiceClassIdDef(String value) {
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
        public static ServiceClassDefinitionDef.ServiceClassIdDef fromValue(String value) {
            ServiceClassDefinitionDef.ServiceClassIdDef constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

    public enum TravelClassDef {

        FIRST("FIRST"),
        SECOND("SECOND"),
        ANY_CLASS("ANY_CLASS");
        private final String value;
        private final static Map<String, ServiceClassDefinitionDef.TravelClassDef> CONSTANTS = new HashMap<String, ServiceClassDefinitionDef.TravelClassDef>();

        static {
            for (ServiceClassDefinitionDef.TravelClassDef c: values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        private TravelClassDef(String value) {
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
        public static ServiceClassDefinitionDef.TravelClassDef fromValue(String value) {
            ServiceClassDefinitionDef.TravelClassDef constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

}
