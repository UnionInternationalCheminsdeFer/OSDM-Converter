package gtmV30;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_DEFAULT)
@JsonPropertyOrder({
    "fareStructureDelivery"
})
public class FareDelivery {

    @JsonProperty("fareDelivery")
    private FareDeliveryDef fareDelivery;

    @JsonProperty("fareDelivery")
    public FareDeliveryDef getFareStructureDelivery() {
        return fareDelivery;
    }

    @JsonProperty("fareDelivery")
    public void setFareStructureDelivery(FareDeliveryDef fareStructureDelivery) {
        this.fareDelivery = fareStructureDelivery;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(FareDelivery.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
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
        if ((other instanceof FareDelivery) == false) {
            return false;
        }
        FareDelivery rhs = ((FareDelivery) other);
        return ((this.fareDelivery == rhs.fareDelivery)||((this.fareDelivery!= null)&&this.fareDelivery.equals(rhs.fareDelivery)));
    }

}
