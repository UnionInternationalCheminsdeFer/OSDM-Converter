//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// �nderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2026.05.22 um 10:24:00 AM CEST 
//


package uk.org.netex.netex;

import java.math.BigInteger;
import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlElementRef;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * Type for SINGLE JOURNEY.
 * 
 * <p>Java-Klasse f�r SingleJourney_VersionStructure complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="SingleJourney_VersionStructure">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.netex.org.uk/netex}Journey_VersionStructure">
 *       &lt;sequence>
 *         &lt;group ref="{http://www.netex.org.uk/netex}SingleJourneyGroup"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SingleJourney_VersionStructure", propOrder = {
    "commonVehicleServiceRef",
    "vehicleRef",
    "singleJourneyPathRef",
    "departureTime",
    "departureDayOffset",
    "operatingDayRef",
    "datedPassingTimes",
    "meetingPointAssignments",
    "vehiclePoolingDriverInfoRef"
})
@XmlSeeAlso({
    SingleJourney.class
})
public class SingleJourneyVersionStructure
    extends JourneyVersionStructure
{

    @XmlElementRef(name = "CommonVehicleServiceRef", namespace = "http://www.netex.org.uk/netex", type = JAXBElement.class, required = false)
    protected JAXBElement<? extends CommonVehicleServiceRefStructure> commonVehicleServiceRef;
    @XmlElementRef(name = "VehicleRef", namespace = "http://www.netex.org.uk/netex", type = JAXBElement.class, required = false)
    protected JAXBElement<? extends VehicleRefStructure> vehicleRef;
    @XmlElement(name = "SingleJourneyPathRef")
    protected SingleJourneyPathRefStructure singleJourneyPathRef;
    @XmlElement(name = "DepartureTime")
    @XmlSchemaType(name = "time")
    protected XMLGregorianCalendar departureTime;
    @XmlElement(name = "DepartureDayOffset")
    protected BigInteger departureDayOffset;
    @XmlElement(name = "OperatingDayRef")
    protected OperatingDayRefStructure operatingDayRef;
    protected TargetPassingTimesRelStructure datedPassingTimes;
    protected VehicleMeetingPointAssignmentsRelStructure meetingPointAssignments;
    @XmlElement(name = "VehiclePoolingDriverInfoRef")
    protected VehiclePoolingDriverInfoRefStructure vehiclePoolingDriverInfoRef;

    /**
     * Ruft den Wert der commonVehicleServiceRef-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link VehicleSharingServiceRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link ChauffeuredVehicleServiceRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link VehicleRentalServiceRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link CarPoolingServiceRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link CommonVehicleServiceRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link VehiclePoolingServiceRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link TaxiServiceRefStructure }{@code >}
     *     
     */
    public JAXBElement<? extends CommonVehicleServiceRefStructure> getCommonVehicleServiceRef() {
        return commonVehicleServiceRef;
    }

    /**
     * Legt den Wert der commonVehicleServiceRef-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link VehicleSharingServiceRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link ChauffeuredVehicleServiceRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link VehicleRentalServiceRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link CarPoolingServiceRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link CommonVehicleServiceRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link VehiclePoolingServiceRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link TaxiServiceRefStructure }{@code >}
     *     
     */
    public void setCommonVehicleServiceRef(JAXBElement<? extends CommonVehicleServiceRefStructure> value) {
        this.commonVehicleServiceRef = value;
    }

    /**
     * Ruft den Wert der vehicleRef-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link TractiveRollingStockItemRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link VehicleRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link TrailingRollingStockItemRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link RollingStockItemRefStructure }{@code >}
     *     
     */
    public JAXBElement<? extends VehicleRefStructure> getVehicleRef() {
        return vehicleRef;
    }

    /**
     * Legt den Wert der vehicleRef-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link TractiveRollingStockItemRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link VehicleRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link TrailingRollingStockItemRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link RollingStockItemRefStructure }{@code >}
     *     
     */
    public void setVehicleRef(JAXBElement<? extends VehicleRefStructure> value) {
        this.vehicleRef = value;
    }

    /**
     * Ruft den Wert der singleJourneyPathRef-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link SingleJourneyPathRefStructure }
     *     
     */
    public SingleJourneyPathRefStructure getSingleJourneyPathRef() {
        return singleJourneyPathRef;
    }

    /**
     * Legt den Wert der singleJourneyPathRef-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link SingleJourneyPathRefStructure }
     *     
     */
    public void setSingleJourneyPathRef(SingleJourneyPathRefStructure value) {
        this.singleJourneyPathRef = value;
    }

    /**
     * Ruft den Wert der departureTime-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDepartureTime() {
        return departureTime;
    }

    /**
     * Legt den Wert der departureTime-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDepartureTime(XMLGregorianCalendar value) {
        this.departureTime = value;
    }

    /**
     * Ruft den Wert der departureDayOffset-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getDepartureDayOffset() {
        return departureDayOffset;
    }

    /**
     * Legt den Wert der departureDayOffset-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setDepartureDayOffset(BigInteger value) {
        this.departureDayOffset = value;
    }

    /**
     * Ruft den Wert der operatingDayRef-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link OperatingDayRefStructure }
     *     
     */
    public OperatingDayRefStructure getOperatingDayRef() {
        return operatingDayRef;
    }

    /**
     * Legt den Wert der operatingDayRef-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link OperatingDayRefStructure }
     *     
     */
    public void setOperatingDayRef(OperatingDayRefStructure value) {
        this.operatingDayRef = value;
    }

    /**
     * Ruft den Wert der datedPassingTimes-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link TargetPassingTimesRelStructure }
     *     
     */
    public TargetPassingTimesRelStructure getDatedPassingTimes() {
        return datedPassingTimes;
    }

    /**
     * Legt den Wert der datedPassingTimes-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link TargetPassingTimesRelStructure }
     *     
     */
    public void setDatedPassingTimes(TargetPassingTimesRelStructure value) {
        this.datedPassingTimes = value;
    }

    /**
     * Ruft den Wert der meetingPointAssignments-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link VehicleMeetingPointAssignmentsRelStructure }
     *     
     */
    public VehicleMeetingPointAssignmentsRelStructure getMeetingPointAssignments() {
        return meetingPointAssignments;
    }

    /**
     * Legt den Wert der meetingPointAssignments-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link VehicleMeetingPointAssignmentsRelStructure }
     *     
     */
    public void setMeetingPointAssignments(VehicleMeetingPointAssignmentsRelStructure value) {
        this.meetingPointAssignments = value;
    }

    /**
     * Possible relation to a VEHICLE POOLING DRIVER, as defined in Transmodel.
     * 
     * @return
     *     possible object is
     *     {@link VehiclePoolingDriverInfoRefStructure }
     *     
     */
    public VehiclePoolingDriverInfoRefStructure getVehiclePoolingDriverInfoRef() {
        return vehiclePoolingDriverInfoRef;
    }

    /**
     * Legt den Wert der vehiclePoolingDriverInfoRef-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link VehiclePoolingDriverInfoRefStructure }
     *     
     */
    public void setVehiclePoolingDriverInfoRef(VehiclePoolingDriverInfoRefStructure value) {
        this.vehiclePoolingDriverInfoRef = value;
    }

}
