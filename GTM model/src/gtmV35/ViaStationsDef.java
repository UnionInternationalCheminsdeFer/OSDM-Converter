
package gtmV35;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonValue;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "isBorder",
    "routeId",
    "seriesId",
    "alternativeRoute",
    "carrier",
    "carrierConstraintRef",
    "route",
    "serviceBrand",
    "serviceConstraintRef",
    "station",
    "fareReferenceStationSet",
    "routeValidityType",
    "stop",
    "technicalViaOnly"
})
public class ViaStationsDef {

    @JsonProperty("isBorder")
    private Boolean isBorder = false;
    @JsonProperty("routeId")
    private Integer routeId;
    @JsonProperty("seriesId")
    private Integer seriesId;
    @JsonProperty("alternativeRoute")
    private List<ViaStationsDef> alternativeRoute = new ArrayList<ViaStationsDef>();
    /**
     * RICS company code or the upcoming compatible ERA company code. In case proprietary codes are used on a bilateral base the  codes must have at least 5 positions and start with x
     * 
     */
    @JsonProperty("carrier")
    @JsonPropertyDescription("RICS company code or the upcoming compatible ERA company code. In case proprietary codes are used on a bilateral base the  codes must have at least 5 positions and start with x")
    private String carrier;
    /**
     * restriction to a specific carriers
     * 
     */
    @JsonProperty("carrierConstraintRef")
    @JsonPropertyDescription("restriction to a specific carriers")
    private String carrierConstraintRef;
    @JsonProperty("route")
    private List<ViaStationsDef> route = new ArrayList<ViaStationsDef>();
    /**
     * restriction to a specific service brand
     * 
     */
    @JsonProperty("serviceBrand")
    @JsonPropertyDescription("restriction to a specific service brand")
    private String serviceBrand;
    /**
     * restriction to a specific service brands
     * 
     */
    @JsonProperty("serviceConstraintRef")
    @JsonPropertyDescription("restriction to a specific service brands")
    private String serviceConstraintRef;
    /**
     * Used to represent a station location. This is a location that can be used as origin and destination for a train journey
     * 
     */
    @JsonProperty("station")
    @JsonPropertyDescription("Used to represent a station location. This is a location that can be used as origin and destination for a train journey")
    private StationDef station;
    /**
     * reference to a list of stations included in the fare
     * 
     */
    @JsonProperty("fareReferenceStationSet")
    @JsonPropertyDescription("reference to a list of stations included in the fare")
    private FareReferenceStationSet fareReferenceStationSet;
    /**
     * Indiction of the type of validity for a route. In case of LINE validity (Default) the described lines are allowed for travel. In case of BUBBLE it is additionally allowed to travel on all routes inbetween the defined lines.
     * 
     */
    @JsonProperty("routeValidityType")
    @JsonPropertyDescription("Indiction of the type of validity for a route. In case of LINE validity (Default) the described lines are allowed for travel. In case of BUBBLE it is additionally allowed to travel on all routes inbetween the defined lines.")
    private ViaStationsDef.RouteValidityType routeValidityType = ViaStationsDef.RouteValidityType.fromValue("LINE");
    /**
     * indicates that the station must be a real stop. In case a service passes the station but does not stop there the fare is not valid. Default is false. 
     * 
     */
    @JsonProperty("stop")
    @JsonPropertyDescription("indicates that the station must be a real stop. In case a service passes the station but does not stop there the fare is not valid. Default is false. ")
    private Boolean stop = false;
    /**
     * indicates that the via station is included to support the alignment with time tables but is not part of the contractual route provided to the passenger.
     * 
     */
    @JsonProperty("technicalViaOnly")
    @JsonPropertyDescription("indicates that the via station is included to support the alignment with time tables but is not part of the contractual route provided to the passenger.")
    private Boolean technicalViaOnly = false;

    @JsonProperty("isBorder")
    public Boolean getIsBorder() {
        return isBorder;
    }

    @JsonProperty("isBorder")
    public void setIsBorder(Boolean isBorder) {
        this.isBorder = isBorder;
    }

    @JsonProperty("routeId")
    public Integer getRouteId() {
        return routeId;
    }

    @JsonProperty("routeId")
    public void setRouteId(Integer routeId) {
        this.routeId = routeId;
    }

    @JsonProperty("seriesId")
    public Integer getSeriesId() {
        return seriesId;
    }

    @JsonProperty("seriesId")
    public void setSeriesId(Integer seriesId) {
        this.seriesId = seriesId;
    }

    @JsonProperty("alternativeRoute")
    public List<ViaStationsDef> getAlternativeRoute() {
        return alternativeRoute;
    }

    @JsonProperty("alternativeRoute")
    public void setAlternativeRoute(List<ViaStationsDef> alternativeRoute) {
        this.alternativeRoute = alternativeRoute;
    }

    /**
     * RICS company code or the upcoming compatible ERA company code. In case proprietary codes are used on a bilateral base the  codes must have at least 5 positions and start with x
     * 
     */
    @JsonProperty("carrier")
    public String getCarrier() {
        return carrier;
    }

    /**
     * RICS company code or the upcoming compatible ERA company code. In case proprietary codes are used on a bilateral base the  codes must have at least 5 positions and start with x
     * 
     */
    @JsonProperty("carrier")
    public void setCarrier(String carrier) {
        this.carrier = carrier;
    }

    /**
     * restriction to a specific carriers
     * 
     */
    @JsonProperty("carrierConstraintRef")
    public String getCarrierConstraintRef() {
        return carrierConstraintRef;
    }

    /**
     * restriction to a specific carriers
     * 
     */
    @JsonProperty("carrierConstraintRef")
    public void setCarrierConstraintRef(String carrierConstraintRef) {
        this.carrierConstraintRef = carrierConstraintRef;
    }

    @JsonProperty("route")
    public List<ViaStationsDef> getRoute() {
        return route;
    }

    @JsonProperty("route")
    public void setRoute(List<ViaStationsDef> route) {
        this.route = route;
    }

    /**
     * restriction to a specific service brand
     * 
     */
    @JsonProperty("serviceBrand")
    public String getServiceBrand() {
        return serviceBrand;
    }

    /**
     * restriction to a specific service brand
     * 
     */
    @JsonProperty("serviceBrand")
    public void setServiceBrand(String serviceBrand) {
        this.serviceBrand = serviceBrand;
    }

    /**
     * restriction to a specific service brands
     * 
     */
    @JsonProperty("serviceConstraintRef")
    public String getServiceConstraintRef() {
        return serviceConstraintRef;
    }

    /**
     * restriction to a specific service brands
     * 
     */
    @JsonProperty("serviceConstraintRef")
    public void setServiceConstraintRef(String serviceConstraintRef) {
        this.serviceConstraintRef = serviceConstraintRef;
    }

    /**
     * Used to represent a station location. This is a location that can be used as origin and destination for a train journey
     * 
     */
    @JsonProperty("station")
    public StationDef getStation() {
        return station;
    }

    /**
     * Used to represent a station location. This is a location that can be used as origin and destination for a train journey
     * 
     */
    @JsonProperty("station")
    public void setStation(StationDef station) {
        this.station = station;
    }

    /**
     * reference to a list of stations included in the fare
     * 
     */
    @JsonProperty("fareReferenceStationSet")
    public FareReferenceStationSet getFareReferenceStationSet() {
        return fareReferenceStationSet;
    }

    /**
     * reference to a list of stations included in the fare
     * 
     */
    @JsonProperty("fareReferenceStationSet")
    public void setFareReferenceStationSet(FareReferenceStationSet fareReferenceStationSet) {
        this.fareReferenceStationSet = fareReferenceStationSet;
    }

    /**
     * Indiction of the type of validity for a route. In case of LINE validity (Default) the described lines are allowed for travel. In case of BUBBLE it is additionally allowed to travel on all routes inbetween the defined lines.
     * 
     */
    @JsonProperty("routeValidityType")
    public ViaStationsDef.RouteValidityType getRouteValidityType() {
        return routeValidityType;
    }

    /**
     * Indiction of the type of validity for a route. In case of LINE validity (Default) the described lines are allowed for travel. In case of BUBBLE it is additionally allowed to travel on all routes inbetween the defined lines.
     * 
     */
    @JsonProperty("routeValidityType")
    public void setRouteValidityType(ViaStationsDef.RouteValidityType routeValidityType) {
        this.routeValidityType = routeValidityType;
    }

    /**
     * indicates that the station must be a real stop. In case a service passes the station but does not stop there the fare is not valid. Default is false. 
     * 
     */
    @JsonProperty("stop")
    public Boolean getStop() {
        return stop;
    }

    /**
     * indicates that the station must be a real stop. In case a service passes the station but does not stop there the fare is not valid. Default is false. 
     * 
     */
    @JsonProperty("stop")
    public void setStop(Boolean stop) {
        this.stop = stop;
    }

    /**
     * indicates that the via station is included to support the alignment with time tables but is not part of the contractual route provided to the passenger.
     * 
     */
    @JsonProperty("technicalViaOnly")
    public Boolean getTechnicalViaOnly() {
        return technicalViaOnly;
    }

    /**
     * indicates that the via station is included to support the alignment with time tables but is not part of the contractual route provided to the passenger.
     * 
     */
    @JsonProperty("technicalViaOnly")
    public void setTechnicalViaOnly(Boolean technicalViaOnly) {
        this.technicalViaOnly = technicalViaOnly;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(ViaStationsDef.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("isBorder");
        sb.append('=');
        sb.append(((this.isBorder == null)?"<null>":this.isBorder));
        sb.append(',');
        sb.append("routeId");
        sb.append('=');
        sb.append(((this.routeId == null)?"<null>":this.routeId));
        sb.append(',');
        sb.append("seriesId");
        sb.append('=');
        sb.append(((this.seriesId == null)?"<null>":this.seriesId));
        sb.append(',');
        sb.append("alternativeRoute");
        sb.append('=');
        sb.append(((this.alternativeRoute == null)?"<null>":this.alternativeRoute));
        sb.append(',');
        sb.append("carrier");
        sb.append('=');
        sb.append(((this.carrier == null)?"<null>":this.carrier));
        sb.append(',');
        sb.append("carrierConstraintRef");
        sb.append('=');
        sb.append(((this.carrierConstraintRef == null)?"<null>":this.carrierConstraintRef));
        sb.append(',');
        sb.append("route");
        sb.append('=');
        sb.append(((this.route == null)?"<null>":this.route));
        sb.append(',');
        sb.append("serviceBrand");
        sb.append('=');
        sb.append(((this.serviceBrand == null)?"<null>":this.serviceBrand));
        sb.append(',');
        sb.append("serviceConstraintRef");
        sb.append('=');
        sb.append(((this.serviceConstraintRef == null)?"<null>":this.serviceConstraintRef));
        sb.append(',');
        sb.append("station");
        sb.append('=');
        sb.append(((this.station == null)?"<null>":this.station));
        sb.append(',');
        sb.append("fareReferenceStationSet");
        sb.append('=');
        sb.append(((this.fareReferenceStationSet == null)?"<null>":this.fareReferenceStationSet));
        sb.append(',');
        sb.append("routeValidityType");
        sb.append('=');
        sb.append(((this.routeValidityType == null)?"<null>":this.routeValidityType));
        sb.append(',');
        sb.append("stop");
        sb.append('=');
        sb.append(((this.stop == null)?"<null>":this.stop));
        sb.append(',');
        sb.append("technicalViaOnly");
        sb.append('=');
        sb.append(((this.technicalViaOnly == null)?"<null>":this.technicalViaOnly));
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
        result = ((result* 31)+((this.serviceConstraintRef == null)? 0 :this.serviceConstraintRef.hashCode()));
        result = ((result* 31)+((this.carrierConstraintRef == null)? 0 :this.carrierConstraintRef.hashCode()));
        result = ((result* 31)+((this.seriesId == null)? 0 :this.seriesId.hashCode()));
        result = ((result* 31)+((this.serviceBrand == null)? 0 :this.serviceBrand.hashCode()));
        result = ((result* 31)+((this.fareReferenceStationSet == null)? 0 :this.fareReferenceStationSet.hashCode()));
        result = ((result* 31)+((this.isBorder == null)? 0 :this.isBorder.hashCode()));
        result = ((result* 31)+((this.carrier == null)? 0 :this.carrier.hashCode()));
        result = ((result* 31)+((this.routeId == null)? 0 :this.routeId.hashCode()));
        result = ((result* 31)+((this.route == null)? 0 :this.route.hashCode()));
        result = ((result* 31)+((this.routeValidityType == null)? 0 :this.routeValidityType.hashCode()));
        result = ((result* 31)+((this.stop == null)? 0 :this.stop.hashCode()));
        result = ((result* 31)+((this.alternativeRoute == null)? 0 :this.alternativeRoute.hashCode()));
        result = ((result* 31)+((this.station == null)? 0 :this.station.hashCode()));
        result = ((result* 31)+((this.technicalViaOnly == null)? 0 :this.technicalViaOnly.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof ViaStationsDef) == false) {
            return false;
        }
        ViaStationsDef rhs = ((ViaStationsDef) other);
        return (((((((((((((((this.serviceConstraintRef == rhs.serviceConstraintRef)||((this.serviceConstraintRef!= null)&&this.serviceConstraintRef.equals(rhs.serviceConstraintRef)))&&((this.carrierConstraintRef == rhs.carrierConstraintRef)||((this.carrierConstraintRef!= null)&&this.carrierConstraintRef.equals(rhs.carrierConstraintRef))))&&((this.seriesId == rhs.seriesId)||((this.seriesId!= null)&&this.seriesId.equals(rhs.seriesId))))&&((this.serviceBrand == rhs.serviceBrand)||((this.serviceBrand!= null)&&this.serviceBrand.equals(rhs.serviceBrand))))&&((this.fareReferenceStationSet == rhs.fareReferenceStationSet)||((this.fareReferenceStationSet!= null)&&this.fareReferenceStationSet.equals(rhs.fareReferenceStationSet))))&&((this.isBorder == rhs.isBorder)||((this.isBorder!= null)&&this.isBorder.equals(rhs.isBorder))))&&((this.carrier == rhs.carrier)||((this.carrier!= null)&&this.carrier.equals(rhs.carrier))))&&((this.routeId == rhs.routeId)||((this.routeId!= null)&&this.routeId.equals(rhs.routeId))))&&((this.route == rhs.route)||((this.route!= null)&&this.route.equals(rhs.route))))&&((this.routeValidityType == rhs.routeValidityType)||((this.routeValidityType!= null)&&this.routeValidityType.equals(rhs.routeValidityType))))&&((this.stop == rhs.stop)||((this.stop!= null)&&this.stop.equals(rhs.stop))))&&((this.alternativeRoute == rhs.alternativeRoute)||((this.alternativeRoute!= null)&&this.alternativeRoute.equals(rhs.alternativeRoute))))&&((this.station == rhs.station)||((this.station!= null)&&this.station.equals(rhs.station))))&&((this.technicalViaOnly == rhs.technicalViaOnly)||((this.technicalViaOnly!= null)&&this.technicalViaOnly.equals(rhs.technicalViaOnly))));
    }

    public enum RouteValidityType {

        LINE("LINE"),
        BUBBLE("BUBBLE");
        private final String value;
        private final static Map<String, ViaStationsDef.RouteValidityType> CONSTANTS = new HashMap<String, ViaStationsDef.RouteValidityType>();

        static {
            for (ViaStationsDef.RouteValidityType c: values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        private RouteValidityType(String value) {
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
        public static ViaStationsDef.RouteValidityType fromValue(String value) {
            ViaStationsDef.RouteValidityType constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

}
