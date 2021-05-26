
package gtm;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "language",
    "textUtf8",
    "text",
    "shortTextUtf8",
    "shortText"
})
public class TranslationDef {

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("language")
    private String language;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("textUtf8")
    private String textUtf8;
    /**
     * text without special characters according to ICAO specification
     * (Required)
     * 
     */
    @JsonProperty("text")
    @JsonPropertyDescription("text without special characters according to ICAO specification")
    private String text;
    @JsonProperty("shortTextUtf8")
    private String shortTextUtf8;
    /**
     * text without special characters according to ICAO specification
     * 
     */
    @JsonProperty("shortText")
    @JsonPropertyDescription("text without special characters according to ICAO specification")
    private String shortText;

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("language")
    public String getLanguage() {
        return language;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("language")
    public void setLanguage(String language) {
        this.language = language;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("textUtf8")
    public String getTextUtf8() {
        return textUtf8;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("textUtf8")
    public void setTextUtf8(String textUtf8) {
        this.textUtf8 = textUtf8;
    }

    /**
     * text without special characters according to ICAO specification
     * (Required)
     * 
     */
    @JsonProperty("text")
    public String getText() {
        return text;
    }

    /**
     * text without special characters according to ICAO specification
     * (Required)
     * 
     */
    @JsonProperty("text")
    public void setText(String text) {
        this.text = text;
    }

    @JsonProperty("shortTextUtf8")
    public String getShortTextUtf8() {
        return shortTextUtf8;
    }

    @JsonProperty("shortTextUtf8")
    public void setShortTextUtf8(String shortTextUtf8) {
        this.shortTextUtf8 = shortTextUtf8;
    }

    /**
     * text without special characters according to ICAO specification
     * 
     */
    @JsonProperty("shortText")
    public String getShortText() {
        return shortText;
    }

    /**
     * text without special characters according to ICAO specification
     * 
     */
    @JsonProperty("shortText")
    public void setShortText(String shortText) {
        this.shortText = shortText;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(TranslationDef.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("language");
        sb.append('=');
        sb.append(((this.language == null)?"<null>":this.language));
        sb.append(',');
        sb.append("textUtf8");
        sb.append('=');
        sb.append(((this.textUtf8 == null)?"<null>":this.textUtf8));
        sb.append(',');
        sb.append("text");
        sb.append('=');
        sb.append(((this.text == null)?"<null>":this.text));
        sb.append(',');
        sb.append("shortTextUtf8");
        sb.append('=');
        sb.append(((this.shortTextUtf8 == null)?"<null>":this.shortTextUtf8));
        sb.append(',');
        sb.append("shortText");
        sb.append('=');
        sb.append(((this.shortText == null)?"<null>":this.shortText));
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
        result = ((result* 31)+((this.textUtf8 == null)? 0 :this.textUtf8 .hashCode()));
        result = ((result* 31)+((this.language == null)? 0 :this.language.hashCode()));
        result = ((result* 31)+((this.text == null)? 0 :this.text.hashCode()));
        result = ((result* 31)+((this.shortTextUtf8 == null)? 0 :this.shortTextUtf8 .hashCode()));
        result = ((result* 31)+((this.shortText == null)? 0 :this.shortText.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof TranslationDef) == false) {
            return false;
        }
        TranslationDef rhs = ((TranslationDef) other);
        return ((((((this.textUtf8 == rhs.textUtf8)||((this.textUtf8 != null)&&this.textUtf8 .equals(rhs.textUtf8)))&&((this.language == rhs.language)||((this.language!= null)&&this.language.equals(rhs.language))))&&((this.text == rhs.text)||((this.text!= null)&&this.text.equals(rhs.text))))&&((this.shortTextUtf8 == rhs.shortTextUtf8)||((this.shortTextUtf8 != null)&&this.shortTextUtf8 .equals(rhs.shortTextUtf8))))&&((this.shortText == rhs.shortText)||((this.shortText!= null)&&this.shortText.equals(rhs.shortText))));
    }

}
