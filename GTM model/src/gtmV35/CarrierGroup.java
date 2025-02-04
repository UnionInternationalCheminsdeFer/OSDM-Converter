
package gtmV35;

import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "id",
    "code",
    "name",
    "legacyCode",
    "description",
    "companies"
})
public class CarrierGroup {

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("id")
    private String id;
    /**
     * code of the carrier group e.g. used in IRS 90918-4 / ETCD to grant access to involved carriers
     * 
     */
    @JsonProperty("code")
    @JsonPropertyDescription("code of the carrier group e.g. used in IRS 90918-4 / ETCD to grant access to involved carriers")
    private String code;
    /**
     * Name of the carrier group that can be used in communication with passengers
     * (Required)
     * 
     */
    @JsonProperty("name")
    @JsonPropertyDescription("Name of the carrier group that can be used in communication with passengers")
    private String name;
    /**
     * legacy code used in 108.1 data to represent the group
     * 
     */
    @JsonProperty("legacyCode")
    @JsonPropertyDescription("legacy code used in 108.1 data to represent the group")
    private String legacyCode;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("description")
    private TextDef description;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("companies")
    private List<String> companies = new ArrayList<String>();

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
     * code of the carrier group e.g. used in IRS 90918-4 / ETCD to grant access to involved carriers
     * 
     */
    @JsonProperty("code")
    public String getCode() {
        return code;
    }

    /**
     * code of the carrier group e.g. used in IRS 90918-4 / ETCD to grant access to involved carriers
     * 
     */
    @JsonProperty("code")
    public void setCode(String code) {
        this.code = code;
    }

    /**
     * Name of the carrier group that can be used in communication with passengers
     * (Required)
     * 
     */
    @JsonProperty("name")
    public String getName() {
        return name;
    }

    /**
     * Name of the carrier group that can be used in communication with passengers
     * (Required)
     * 
     */
    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    /**
     * legacy code used in 108.1 data to represent the group
     * 
     */
    @JsonProperty("legacyCode")
    public String getLegacyCode() {
        return legacyCode;
    }

    /**
     * legacy code used in 108.1 data to represent the group
     * 
     */
    @JsonProperty("legacyCode")
    public void setLegacyCode(String legacyCode) {
        this.legacyCode = legacyCode;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("description")
    public TextDef getDescription() {
        return description;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("description")
    public void setDescription(TextDef description) {
        this.description = description;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("companies")
    public List<String> getCompanies() {
        return companies;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("companies")
    public void setCompanies(List<String> companies) {
        this.companies = companies;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(CarrierGroup.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("id");
        sb.append('=');
        sb.append(((this.id == null)?"<null>":this.id));
        sb.append(',');
        sb.append("code");
        sb.append('=');
        sb.append(((this.code == null)?"<null>":this.code));
        sb.append(',');
        sb.append("name");
        sb.append('=');
        sb.append(((this.name == null)?"<null>":this.name));
        sb.append(',');
        sb.append("legacyCode");
        sb.append('=');
        sb.append(((this.legacyCode == null)?"<null>":this.legacyCode));
        sb.append(',');
        sb.append("description");
        sb.append('=');
        sb.append(((this.description == null)?"<null>":this.description));
        sb.append(',');
        sb.append("companies");
        sb.append('=');
        sb.append(((this.companies == null)?"<null>":this.companies));
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
        result = ((result* 31)+((this.companies == null)? 0 :this.companies.hashCode()));
        result = ((result* 31)+((this.code == null)? 0 :this.code.hashCode()));
        result = ((result* 31)+((this.name == null)? 0 :this.name.hashCode()));
        result = ((result* 31)+((this.description == null)? 0 :this.description.hashCode()));
        result = ((result* 31)+((this.id == null)? 0 :this.id.hashCode()));
        result = ((result* 31)+((this.legacyCode == null)? 0 :this.legacyCode.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof CarrierGroup) == false) {
            return false;
        }
        CarrierGroup rhs = ((CarrierGroup) other);
        return (((((((this.companies == rhs.companies)||((this.companies!= null)&&this.companies.equals(rhs.companies)))&&((this.code == rhs.code)||((this.code!= null)&&this.code.equals(rhs.code))))&&((this.name == rhs.name)||((this.name!= null)&&this.name.equals(rhs.name))))&&((this.description == rhs.description)||((this.description!= null)&&this.description.equals(rhs.description))))&&((this.id == rhs.id)||((this.id!= null)&&this.id.equals(rhs.id))))&&((this.legacyCode == rhs.legacyCode)||((this.legacyCode!= null)&&this.legacyCode.equals(rhs.legacyCode))));
    }

}
