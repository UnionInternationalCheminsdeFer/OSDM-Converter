
package gtm;

import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * options for reservations, Note: full details might be provided in the online version only
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "preferences",
    "graphicalReservation",
    "serviceBrands"
})
public class ReservationOptions {

    /**
     * possible preferences to be requested in reservation without changing the fare
     * 
     */
    @JsonProperty("preferences")
    @JsonPropertyDescription("possible preferences to be requested in reservation without changing the fare")
    private List<ReservationOptionGroupDef> preferences = new ArrayList<ReservationOptionGroupDef>();
    /**
     * graphical reservation is supported, interface type "NO","UIC_918",..
     * 
     */
    @JsonProperty("graphicalReservation")
    @JsonPropertyDescription("graphical reservation is supported, interface type \"NO\",\"UIC_918\",..")
    private String graphicalReservation;
    /**
     * service brands where the options apply
     * 
     */
    @JsonProperty("serviceBrands")
    @JsonPropertyDescription("service brands where the options apply")
    private List<Integer> serviceBrands = new ArrayList<Integer>();

    /**
     * possible preferences to be requested in reservation without changing the fare
     * 
     */
    @JsonProperty("preferences")
    public List<ReservationOptionGroupDef> getPreferences() {
        return preferences;
    }

    /**
     * possible preferences to be requested in reservation without changing the fare
     * 
     */
    @JsonProperty("preferences")
    public void setPreferences(List<ReservationOptionGroupDef> preferences) {
        this.preferences = preferences;
    }

    /**
     * graphical reservation is supported, interface type "NO","UIC_918",..
     * 
     */
    @JsonProperty("graphicalReservation")
    public String getGraphicalReservation() {
        return graphicalReservation;
    }

    /**
     * graphical reservation is supported, interface type "NO","UIC_918",..
     * 
     */
    @JsonProperty("graphicalReservation")
    public void setGraphicalReservation(String graphicalReservation) {
        this.graphicalReservation = graphicalReservation;
    }

    /**
     * service brands where the options apply
     * 
     */
    @JsonProperty("serviceBrands")
    public List<Integer> getServiceBrands() {
        return serviceBrands;
    }

    /**
     * service brands where the options apply
     * 
     */
    @JsonProperty("serviceBrands")
    public void setServiceBrands(List<Integer> serviceBrands) {
        this.serviceBrands = serviceBrands;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(ReservationOptions.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("preferences");
        sb.append('=');
        sb.append(((this.preferences == null)?"<null>":this.preferences));
        sb.append(',');
        sb.append("graphicalReservation");
        sb.append('=');
        sb.append(((this.graphicalReservation == null)?"<null>":this.graphicalReservation));
        sb.append(',');
        sb.append("serviceBrands");
        sb.append('=');
        sb.append(((this.serviceBrands == null)?"<null>":this.serviceBrands));
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
        result = ((result* 31)+((this.graphicalReservation == null)? 0 :this.graphicalReservation.hashCode()));
        result = ((result* 31)+((this.preferences == null)? 0 :this.preferences.hashCode()));
        result = ((result* 31)+((this.serviceBrands == null)? 0 :this.serviceBrands.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof ReservationOptions) == false) {
            return false;
        }
        ReservationOptions rhs = ((ReservationOptions) other);
        return ((((this.graphicalReservation == rhs.graphicalReservation)||((this.graphicalReservation!= null)&&this.graphicalReservation.equals(rhs.graphicalReservation)))&&((this.preferences == rhs.preferences)||((this.preferences!= null)&&this.preferences.equals(rhs.preferences))))&&((this.serviceBrands == rhs.serviceBrands)||((this.serviceBrands!= null)&&this.serviceBrands.equals(rhs.serviceBrands))));
    }

}
