
package gtmV20;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "transactionType",
    "feeRef",
    "applicationTime",
    "applicationTimeStamp",
    "isAllocatorFee",
    "individualContracts",
    "involvedTCOs"
})
public class AfterSalesRuleDef {

    /**
     * code list Reason for after sale
     * (Required)
     * 
     */
    @JsonProperty("transactionType")
    @JsonPropertyDescription("code list Reason for after sale")
    private String transactionType;
    /**
     * Reference to a price data item defining the fee; optional in case there is no fee but the  after sales transaction is allowed. Online services include fee directly in the fee tag.
     * 
     */
    @JsonProperty("feeRef")
    @JsonPropertyDescription("Reference to a price data item defining the fee; optional in case there is no fee but the  after sales transaction is allowed. Online services include fee directly in the fee tag.")
    private String feeRef;
    @JsonProperty("applicationTime")
    private RelativeTimeDef applicationTime;
    /**
     * absolute application time (UTC) in case of online services
     * 
     */
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm:ssZZZ", timezone = "UTC")
    @JsonProperty("applicationTimeStamp")
    @JsonPropertyDescription("absolute application time (UTC) in case of online services")
    private Date applicationTimeStamp;
    /**
     * indicates that the fee belongs to the allocator
     * 
     */
    @JsonProperty("isAllocatorFee")
    @JsonPropertyDescription("indicates that the fee belongs to the allocator")
    private Boolean isAllocatorFee = false;
    /**
     * indicates that the after sales of this fare can be treated independently per person.
     * 
     */
    @JsonProperty("individualContracts")
    @JsonPropertyDescription("indicates that the after sales of this fare can be treated independently per person.")
    private Boolean individualContracts = false;
    /**
     * ticket controlling organizations involved in the control. Used to provide TCOs access to the ticket in the control data (IRS 90918-4)
     * 
     */
    @JsonProperty("involvedTCOs")
    @JsonPropertyDescription("ticket controlling organizations involved in the control. Used to provide TCOs access to the ticket in the control data (IRS 90918-4)")
    private List<String> involvedTCOs = new ArrayList<String>();

    /**
     * code list Reason for after sale
     * (Required)
     * 
     */
    @JsonProperty("transactionType")
    public String getTransactionType() {
        return transactionType;
    }

    /**
     * code list Reason for after sale
     * (Required)
     * 
     */
    @JsonProperty("transactionType")
    public void setTransactionType(String transactionType) {
        this.transactionType = transactionType;
    }

    /**
     * Reference to a price data item defining the fee; optional in case there is no fee but the  after sales transaction is allowed. Online services include fee directly in the fee tag.
     * 
     */
    @JsonProperty("feeRef")
    public String getFeeRef() {
        return feeRef;
    }

    /**
     * Reference to a price data item defining the fee; optional in case there is no fee but the  after sales transaction is allowed. Online services include fee directly in the fee tag.
     * 
     */
    @JsonProperty("feeRef")
    public void setFeeRef(String feeRef) {
        this.feeRef = feeRef;
    }

    @JsonProperty("applicationTime")
    public RelativeTimeDef getApplicationTime() {
        return applicationTime;
    }

    @JsonProperty("applicationTime")
    public void setApplicationTime(RelativeTimeDef applicationTime) {
        this.applicationTime = applicationTime;
    }

    /**
     * absolute application time (UTC) in case of online services
     * 
     */
    @JsonProperty("applicationTimeStamp")
    public Date getApplicationTimeStamp() {
        return applicationTimeStamp;
    }

    /**
     * absolute application time (UTC) in case of online services
     * 
     */
    @JsonProperty("applicationTimeStamp")
    public void setApplicationTimeStamp(Date applicationTimeStamp) {
        this.applicationTimeStamp = applicationTimeStamp;
    }

    /**
     * indicates that the fee belongs to the allocator
     * 
     */
    @JsonProperty("isAllocatorFee")
    public Boolean getIsAllocatorFee() {
        return isAllocatorFee;
    }

    /**
     * indicates that the fee belongs to the allocator
     * 
     */
    @JsonProperty("isAllocatorFee")
    public void setIsAllocatorFee(Boolean isAllocatorFee) {
        this.isAllocatorFee = isAllocatorFee;
    }

    /**
     * indicates that the after sales of this fare can be treated independently per person.
     * 
     */
    @JsonProperty("individualContracts")
    public Boolean getIndividualContracts() {
        return individualContracts;
    }

    /**
     * indicates that the after sales of this fare can be treated independently per person.
     * 
     */
    @JsonProperty("individualContracts")
    public void setIndividualContracts(Boolean individualContracts) {
        this.individualContracts = individualContracts;
    }

    /**
     * ticket controlling organizations involved in the control. Used to provide TCOs access to the ticket in the control data (IRS 90918-4)
     * 
     */
    @JsonProperty("involvedTCOs")
    public List<String> getInvolvedTCOs() {
        return involvedTCOs;
    }

    /**
     * ticket controlling organizations involved in the control. Used to provide TCOs access to the ticket in the control data (IRS 90918-4)
     * 
     */
    @JsonProperty("involvedTCOs")
    public void setInvolvedTCOs(List<String> involvedTCOs) {
        this.involvedTCOs = involvedTCOs;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(AfterSalesRuleDef.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("transactionType");
        sb.append('=');
        sb.append(((this.transactionType == null)?"<null>":this.transactionType));
        sb.append(',');
        sb.append("feeRef");
        sb.append('=');
        sb.append(((this.feeRef == null)?"<null>":this.feeRef));
        sb.append(',');
        sb.append("applicationTime");
        sb.append('=');
        sb.append(((this.applicationTime == null)?"<null>":this.applicationTime));
        sb.append(',');
        sb.append("applicationTimeStamp");
        sb.append('=');
        sb.append(((this.applicationTimeStamp == null)?"<null>":this.applicationTimeStamp));
        sb.append(',');
        sb.append("isAllocatorFee");
        sb.append('=');
        sb.append(((this.isAllocatorFee == null)?"<null>":this.isAllocatorFee));
        sb.append(',');
        sb.append("individualContracts");
        sb.append('=');
        sb.append(((this.individualContracts == null)?"<null>":this.individualContracts));
        sb.append(',');
        sb.append("involvedTCOs");
        sb.append('=');
        sb.append(((this.involvedTCOs == null)?"<null>":this.involvedTCOs));
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
        result = ((result* 31)+((this.transactionType == null)? 0 :this.transactionType.hashCode()));
        result = ((result* 31)+((this.isAllocatorFee == null)? 0 :this.isAllocatorFee.hashCode()));
        result = ((result* 31)+((this.feeRef == null)? 0 :this.feeRef.hashCode()));
        result = ((result* 31)+((this.involvedTCOs == null)? 0 :this.involvedTCOs.hashCode()));
        result = ((result* 31)+((this.individualContracts == null)? 0 :this.individualContracts.hashCode()));
        result = ((result* 31)+((this.applicationTime == null)? 0 :this.applicationTime.hashCode()));
        result = ((result* 31)+((this.applicationTimeStamp == null)? 0 :this.applicationTimeStamp.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof AfterSalesRuleDef) == false) {
            return false;
        }
        AfterSalesRuleDef rhs = ((AfterSalesRuleDef) other);
        return ((((((((this.transactionType == rhs.transactionType)||((this.transactionType!= null)&&this.transactionType.equals(rhs.transactionType)))&&((this.isAllocatorFee == rhs.isAllocatorFee)||((this.isAllocatorFee!= null)&&this.isAllocatorFee.equals(rhs.isAllocatorFee))))&&((this.feeRef == rhs.feeRef)||((this.feeRef!= null)&&this.feeRef.equals(rhs.feeRef))))&&((this.involvedTCOs == rhs.involvedTCOs)||((this.involvedTCOs!= null)&&this.involvedTCOs.equals(rhs.involvedTCOs))))&&((this.individualContracts == rhs.individualContracts)||((this.individualContracts!= null)&&this.individualContracts.equals(rhs.individualContracts))))&&((this.applicationTime == rhs.applicationTime)||((this.applicationTime!= null)&&this.applicationTime.equals(rhs.applicationTime))))&&((this.applicationTimeStamp == rhs.applicationTimeStamp)||((this.applicationTimeStamp!= null)&&this.applicationTimeStamp.equals(rhs.applicationTimeStamp))));
    }

}
