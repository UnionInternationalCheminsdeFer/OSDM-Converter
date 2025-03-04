
package gtmV35;

import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * Locate the online services
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "carrierLocations",
    "trainLocations",
    "stationLocations"
})
public class FareResourceLocationDef {

    /**
     * Locating the online resource via the carrier provided in the time table.
     * 
     */
    @JsonProperty("carrierLocations")
    @JsonPropertyDescription("Locating the online resource via the carrier provided in the time table.")
    private List<CarrierResourceLocationDef> carrierLocations = new ArrayList<CarrierResourceLocationDef>();
    /**
     * Locating the online resource via the train from the time table.
     * 
     */
    @JsonProperty("trainLocations")
    @JsonPropertyDescription("Locating the online resource via the train from the time table.")
    private List<TrainResourceLocationDef> trainLocations = new ArrayList<TrainResourceLocationDef>();
    /**
     * Locating the online resource via stations or connection points. The link is valid if start and end station (or connection points) provide the link.
     * 
     */
    @JsonProperty("stationLocations")
    @JsonPropertyDescription("Locating the online resource via stations or connection points. The link is valid if start and end station (or connection points) provide the link.")
    private List<StationResourceLocationDef> stationLocations = new ArrayList<StationResourceLocationDef>();

    /**
     * Locating the online resource via the carrier provided in the time table.
     * 
     */
    @JsonProperty("carrierLocations")
    public List<CarrierResourceLocationDef> getCarrierLocations() {
        return carrierLocations;
    }

    /**
     * Locating the online resource via the carrier provided in the time table.
     * 
     */
    @JsonProperty("carrierLocations")
    public void setCarrierLocations(List<CarrierResourceLocationDef> carrierLocations) {
        this.carrierLocations = carrierLocations;
    }

    /**
     * Locating the online resource via the train from the time table.
     * 
     */
    @JsonProperty("trainLocations")
    public List<TrainResourceLocationDef> getTrainLocations() {
        return trainLocations;
    }

    /**
     * Locating the online resource via the train from the time table.
     * 
     */
    @JsonProperty("trainLocations")
    public void setTrainLocations(List<TrainResourceLocationDef> trainLocations) {
        this.trainLocations = trainLocations;
    }

    /**
     * Locating the online resource via stations or connection points. The link is valid if start and end station (or connection points) provide the link.
     * 
     */
    @JsonProperty("stationLocations")
    public List<StationResourceLocationDef> getStationLocations() {
        return stationLocations;
    }

    /**
     * Locating the online resource via stations or connection points. The link is valid if start and end station (or connection points) provide the link.
     * 
     */
    @JsonProperty("stationLocations")
    public void setStationLocations(List<StationResourceLocationDef> stationLocations) {
        this.stationLocations = stationLocations;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(FareResourceLocationDef.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("carrierLocations");
        sb.append('=');
        sb.append(((this.carrierLocations == null)?"<null>":this.carrierLocations));
        sb.append(',');
        sb.append("trainLocations");
        sb.append('=');
        sb.append(((this.trainLocations == null)?"<null>":this.trainLocations));
        sb.append(',');
        sb.append("stationLocations");
        sb.append('=');
        sb.append(((this.stationLocations == null)?"<null>":this.stationLocations));
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
        result = ((result* 31)+((this.carrierLocations == null)? 0 :this.carrierLocations.hashCode()));
        result = ((result* 31)+((this.trainLocations == null)? 0 :this.trainLocations.hashCode()));
        result = ((result* 31)+((this.stationLocations == null)? 0 :this.stationLocations.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof FareResourceLocationDef) == false) {
            return false;
        }
        FareResourceLocationDef rhs = ((FareResourceLocationDef) other);
        return ((((this.carrierLocations == rhs.carrierLocations)||((this.carrierLocations!= null)&&this.carrierLocations.equals(rhs.carrierLocations)))&&((this.trainLocations == rhs.trainLocations)||((this.trainLocations!= null)&&this.trainLocations.equals(rhs.trainLocations))))&&((this.stationLocations == rhs.stationLocations)||((this.stationLocations!= null)&&this.stationLocations.equals(rhs.stationLocations))));
    }

}
