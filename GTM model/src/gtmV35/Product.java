
package gtmV35;

import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * Basic product definition of products. A products covers multiple regional validities, passenger types or reductions. Fares might be included in Products of a distributor depending on the combination models and then loose their original product definition. 
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "id",
    "code",
    "name",
    "summary",
    "type",
    "description",
    "travelClass",
    "isTrainBound",
    "isReturnProduct",
    "serviceConstraintText",
    "carrierConstraintText",
    "conditions",
    "isExchangeableAfterValidity",
    "isExchangeablebeforeValidity",
    "isRefundableBeforeValidity",
    "isRefundableAfterValidity"
})
public class Product {

    /**
     * technical id of this product description
     * (Required)
     * 
     */
    @JsonProperty("id")
    @JsonPropertyDescription("technical id of this product description")
    private String id;
    /**
     * stable code for the product accross different versions
     * (Required)
     * 
     */
    @JsonProperty("code")
    @JsonPropertyDescription("stable code for the product accross different versions")
    private String code;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("name")
    private TextDef name;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("summary")
    private TextDef summary;
    /**
     * General product types harmonized across fare providers. (More to be added, use null for types not listed yet.)
     * 
     */
    @JsonProperty("type")
    @JsonPropertyDescription("General product types harmonized across fare providers. (More to be added, use null for types not listed yet.)")
    private String type;
    @JsonProperty("description")
    private TextDef description;
    /**
     * Generic class classification, mostly used to harmonize choice and representation across multiple carriers
     * 
     */
    @JsonProperty("travelClass")
    @JsonPropertyDescription("Generic class classification, mostly used to harmonize choice and representation across multiple carriers")
    private gtmV35.ServiceClassDefinitionDef.TravelClassDef travelClass;
    /**
     * the product is at least in some parts bound to specific trains
     * 
     */
    @JsonProperty("isTrainBound")
    @JsonPropertyDescription("the product is at least in some parts bound to specific trains")
    private Boolean isTrainBound;
    /**
     * the product includes a return journey
     * 
     */
    @JsonProperty("isReturnProduct")
    @JsonPropertyDescription("the product includes a return journey")
    private Boolean isReturnProduct;
    @JsonProperty("serviceConstraintText")
    private TextDef serviceConstraintText;
    @JsonProperty("carrierConstraintText")
    private TextDef carrierConstraintText;
    /**
     * generic descriptions of the conditions.
     * 
     */
    @JsonProperty("conditions")
    @JsonPropertyDescription("generic descriptions of the conditions.")
    private List<ConditionText> conditions = new ArrayList<ConditionText>();
    @JsonProperty("isExchangeableAfterValidity")
    private Boolean isExchangeableAfterValidity;
    @JsonProperty("isExchangeablebeforeValidity")
    private Boolean isExchangeablebeforeValidity;
    @JsonProperty("isRefundableBeforeValidity")
    private Boolean isRefundableBeforeValidity;
    @JsonProperty("isRefundableAfterValidity")
    private Boolean isRefundableAfterValidity;

    /**
     * technical id of this product description
     * (Required)
     * 
     */
    @JsonProperty("id")
    public String getId() {
        return id;
    }

    /**
     * technical id of this product description
     * (Required)
     * 
     */
    @JsonProperty("id")
    public void setId(String id) {
        this.id = id;
    }

    /**
     * stable code for the product accross different versions
     * (Required)
     * 
     */
    @JsonProperty("code")
    public String getCode() {
        return code;
    }

    /**
     * stable code for the product accross different versions
     * (Required)
     * 
     */
    @JsonProperty("code")
    public void setCode(String code) {
        this.code = code;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("name")
    public TextDef getName() {
        return name;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("name")
    public void setName(TextDef name) {
        this.name = name;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("summary")
    public TextDef getSummary() {
        return summary;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("summary")
    public void setSummary(TextDef summary) {
        this.summary = summary;
    }

    /**
     * General product types harmonized across fare providers. (More to be added, use null for types not listed yet.)
     * 
     */
    @JsonProperty("type")
    public String getType() {
        return type;
    }

    /**
     * General product types harmonized across fare providers. (More to be added, use null for types not listed yet.)
     * 
     */
    @JsonProperty("type")
    public void setType(String type) {
        this.type = type;
    }

    @JsonProperty("description")
    public TextDef getDescription() {
        return description;
    }

    @JsonProperty("description")
    public void setDescription(TextDef description) {
        this.description = description;
    }

    /**
     * Generic class classification, mostly used to harmonize choice and representation across multiple carriers
     * 
     */
    @JsonProperty("travelClass")
    public gtmV35.ServiceClassDefinitionDef.TravelClassDef getTravelClass() {
        return travelClass;
    }

    /**
     * Generic class classification, mostly used to harmonize choice and representation across multiple carriers
     * 
     */
    @JsonProperty("travelClass")
    public void setTravelClass(gtmV35.ServiceClassDefinitionDef.TravelClassDef travelClass) {
        this.travelClass = travelClass;
    }

    /**
     * the product is at least in some parts bound to specific trains
     * 
     */
    @JsonProperty("isTrainBound")
    public Boolean getIsTrainBound() {
        return isTrainBound;
    }

    /**
     * the product is at least in some parts bound to specific trains
     * 
     */
    @JsonProperty("isTrainBound")
    public void setIsTrainBound(Boolean isTrainBound) {
        this.isTrainBound = isTrainBound;
    }

    /**
     * the product includes a return journey
     * 
     */
    @JsonProperty("isReturnProduct")
    public Boolean getIsReturnProduct() {
        return isReturnProduct;
    }

    /**
     * the product includes a return journey
     * 
     */
    @JsonProperty("isReturnProduct")
    public void setIsReturnProduct(Boolean isReturnProduct) {
        this.isReturnProduct = isReturnProduct;
    }

    @JsonProperty("serviceConstraintText")
    public TextDef getServiceConstraintText() {
        return serviceConstraintText;
    }

    @JsonProperty("serviceConstraintText")
    public void setServiceConstraintText(TextDef serviceConstraintText) {
        this.serviceConstraintText = serviceConstraintText;
    }

    @JsonProperty("carrierConstraintText")
    public TextDef getCarrierConstraintText() {
        return carrierConstraintText;
    }

    @JsonProperty("carrierConstraintText")
    public void setCarrierConstraintText(TextDef carrierConstraintText) {
        this.carrierConstraintText = carrierConstraintText;
    }

    /**
     * generic descriptions of the conditions.
     * 
     */
    @JsonProperty("conditions")
    public List<ConditionText> getConditions() {
        return conditions;
    }

    /**
     * generic descriptions of the conditions.
     * 
     */
    @JsonProperty("conditions")
    public void setConditions(List<ConditionText> conditions) {
        this.conditions = conditions;
    }

    @JsonProperty("isExchangeableAfterValidity")
    public Boolean getIsExchangeableAfterValidity() {
        return isExchangeableAfterValidity;
    }

    @JsonProperty("isExchangeableAfterValidity")
    public void setIsExchangeableAfterValidity(Boolean isExchangeableAfterValidity) {
        this.isExchangeableAfterValidity = isExchangeableAfterValidity;
    }

    @JsonProperty("isExchangeablebeforeValidity")
    public Boolean getIsExchangeablebeforeValidity() {
        return isExchangeablebeforeValidity;
    }

    @JsonProperty("isExchangeablebeforeValidity")
    public void setIsExchangeablebeforeValidity(Boolean isExchangeablebeforeValidity) {
        this.isExchangeablebeforeValidity = isExchangeablebeforeValidity;
    }

    @JsonProperty("isRefundableBeforeValidity")
    public Boolean getIsRefundableBeforeValidity() {
        return isRefundableBeforeValidity;
    }

    @JsonProperty("isRefundableBeforeValidity")
    public void setIsRefundableBeforeValidity(Boolean isRefundableBeforeValidity) {
        this.isRefundableBeforeValidity = isRefundableBeforeValidity;
    }

    @JsonProperty("isRefundableAfterValidity")
    public Boolean getIsRefundableAfterValidity() {
        return isRefundableAfterValidity;
    }

    @JsonProperty("isRefundableAfterValidity")
    public void setIsRefundableAfterValidity(Boolean isRefundableAfterValidity) {
        this.isRefundableAfterValidity = isRefundableAfterValidity;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Product.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
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
        sb.append("summary");
        sb.append('=');
        sb.append(((this.summary == null)?"<null>":this.summary));
        sb.append(',');
        sb.append("type");
        sb.append('=');
        sb.append(((this.type == null)?"<null>":this.type));
        sb.append(',');
        sb.append("description");
        sb.append('=');
        sb.append(((this.description == null)?"<null>":this.description));
        sb.append(',');
        sb.append("travelClass");
        sb.append('=');
        sb.append(((this.travelClass == null)?"<null>":this.travelClass));
        sb.append(',');
        sb.append("isTrainBound");
        sb.append('=');
        sb.append(((this.isTrainBound == null)?"<null>":this.isTrainBound));
        sb.append(',');
        sb.append("isReturnProduct");
        sb.append('=');
        sb.append(((this.isReturnProduct == null)?"<null>":this.isReturnProduct));
        sb.append(',');
        sb.append("serviceConstraintText");
        sb.append('=');
        sb.append(((this.serviceConstraintText == null)?"<null>":this.serviceConstraintText));
        sb.append(',');
        sb.append("carrierConstraintText");
        sb.append('=');
        sb.append(((this.carrierConstraintText == null)?"<null>":this.carrierConstraintText));
        sb.append(',');
        sb.append("conditions");
        sb.append('=');
        sb.append(((this.conditions == null)?"<null>":this.conditions));
        sb.append(',');
        sb.append("isExchangeableAfterValidity");
        sb.append('=');
        sb.append(((this.isExchangeableAfterValidity == null)?"<null>":this.isExchangeableAfterValidity));
        sb.append(',');
        sb.append("isExchangeablebeforeValidity");
        sb.append('=');
        sb.append(((this.isExchangeablebeforeValidity == null)?"<null>":this.isExchangeablebeforeValidity));
        sb.append(',');
        sb.append("isRefundableBeforeValidity");
        sb.append('=');
        sb.append(((this.isRefundableBeforeValidity == null)?"<null>":this.isRefundableBeforeValidity));
        sb.append(',');
        sb.append("isRefundableAfterValidity");
        sb.append('=');
        sb.append(((this.isRefundableAfterValidity == null)?"<null>":this.isRefundableAfterValidity));
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
        result = ((result* 31)+((this.summary == null)? 0 :this.summary.hashCode()));
        result = ((result* 31)+((this.isExchangeableAfterValidity == null)? 0 :this.isExchangeableAfterValidity.hashCode()));
        result = ((result* 31)+((this.code == null)? 0 :this.code.hashCode()));
        result = ((result* 31)+((this.carrierConstraintText == null)? 0 :this.carrierConstraintText.hashCode()));
        result = ((result* 31)+((this.description == null)? 0 :this.description.hashCode()));
        result = ((result* 31)+((this.type == null)? 0 :this.type.hashCode()));
        result = ((result* 31)+((this.isRefundableBeforeValidity == null)? 0 :this.isRefundableBeforeValidity.hashCode()));
        result = ((result* 31)+((this.travelClass == null)? 0 :this.travelClass.hashCode()));
        result = ((result* 31)+((this.isReturnProduct == null)? 0 :this.isReturnProduct.hashCode()));
        result = ((result* 31)+((this.isTrainBound == null)? 0 :this.isTrainBound.hashCode()));
        result = ((result* 31)+((this.name == null)? 0 :this.name.hashCode()));
        result = ((result* 31)+((this.id == null)? 0 :this.id.hashCode()));
        result = ((result* 31)+((this.isExchangeablebeforeValidity == null)? 0 :this.isExchangeablebeforeValidity.hashCode()));
        result = ((result* 31)+((this.conditions == null)? 0 :this.conditions.hashCode()));
        result = ((result* 31)+((this.serviceConstraintText == null)? 0 :this.serviceConstraintText.hashCode()));
        result = ((result* 31)+((this.isRefundableAfterValidity == null)? 0 :this.isRefundableAfterValidity.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Product) == false) {
            return false;
        }
        Product rhs = ((Product) other);
        return (((((((((((((((((this.summary == rhs.summary)||((this.summary!= null)&&this.summary.equals(rhs.summary)))&&((this.isExchangeableAfterValidity == rhs.isExchangeableAfterValidity)||((this.isExchangeableAfterValidity!= null)&&this.isExchangeableAfterValidity.equals(rhs.isExchangeableAfterValidity))))&&((this.code == rhs.code)||((this.code!= null)&&this.code.equals(rhs.code))))&&((this.carrierConstraintText == rhs.carrierConstraintText)||((this.carrierConstraintText!= null)&&this.carrierConstraintText.equals(rhs.carrierConstraintText))))&&((this.description == rhs.description)||((this.description!= null)&&this.description.equals(rhs.description))))&&((this.type == rhs.type)||((this.type!= null)&&this.type.equals(rhs.type))))&&((this.isRefundableBeforeValidity == rhs.isRefundableBeforeValidity)||((this.isRefundableBeforeValidity!= null)&&this.isRefundableBeforeValidity.equals(rhs.isRefundableBeforeValidity))))&&((this.travelClass == rhs.travelClass)||((this.travelClass!= null)&&this.travelClass.equals(rhs.travelClass))))&&((this.isReturnProduct == rhs.isReturnProduct)||((this.isReturnProduct!= null)&&this.isReturnProduct.equals(rhs.isReturnProduct))))&&((this.isTrainBound == rhs.isTrainBound)||((this.isTrainBound!= null)&&this.isTrainBound.equals(rhs.isTrainBound))))&&((this.name == rhs.name)||((this.name!= null)&&this.name.equals(rhs.name))))&&((this.id == rhs.id)||((this.id!= null)&&this.id.equals(rhs.id))))&&((this.isExchangeablebeforeValidity == rhs.isExchangeablebeforeValidity)||((this.isExchangeablebeforeValidity!= null)&&this.isExchangeablebeforeValidity.equals(rhs.isExchangeablebeforeValidity))))&&((this.conditions == rhs.conditions)||((this.conditions!= null)&&this.conditions.equals(rhs.conditions))))&&((this.serviceConstraintText == rhs.serviceConstraintText)||((this.serviceConstraintText!= null)&&this.serviceConstraintText.equals(rhs.serviceConstraintText))))&&((this.isRefundableAfterValidity == rhs.isRefundableAfterValidity)||((this.isRefundableAfterValidity!= null)&&this.isRefundableAfterValidity.equals(rhs.isRefundableAfterValidity))));
    }

}
