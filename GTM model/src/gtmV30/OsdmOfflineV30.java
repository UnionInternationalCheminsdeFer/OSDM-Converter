
package gtmV30;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * OSDM Offline Fare Delivery
 * <p>
 * OSDM extract of offline fare delivery
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "fareDelivery"
})
public class OsdmOfflineV30 {

    @JsonProperty("fareDelivery")
    private FareDeliveryDef fareDelivery;

    @JsonProperty("fareDelivery")
    public FareDeliveryDef getFareDelivery() {
        return fareDelivery;
    }

    @JsonProperty("fareDelivery")
    public void setFareDelivery(FareDeliveryDef fareDelivery) {
        this.fareDelivery = fareDelivery;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(OsdmOfflineV30 .class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("fareDelivery");
        sb.append('=');
        sb.append(((this.fareDelivery == null)?"<null>":this.fareDelivery));
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
        result = ((result* 31)+((this.fareDelivery == null)? 0 :this.fareDelivery.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof OsdmOfflineV30) == false) {
            return false;
        }
        OsdmOfflineV30 rhs = ((OsdmOfflineV30) other);
        return ((this.fareDelivery == rhs.fareDelivery)||((this.fareDelivery!= null)&&this.fareDelivery.equals(rhs.fareDelivery)));
    }

}
