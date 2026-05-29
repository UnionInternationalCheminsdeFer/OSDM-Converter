//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// �nderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2026.05.22 um 10:24:00 AM CEST 
//


package uk.org.netex.netex;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Type for COMMON VEHICLE SERVICE.
 * 
 * <p>Java-Klasse f�r CommonVehicleService_VersionStructure complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="CommonVehicleService_VersionStructure">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.netex.org.uk/netex}MobilityService_VersionStructure">
 *       &lt;sequence>
 *         &lt;group ref="{http://www.netex.org.uk/netex}CommonVehicleServiceGroup"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CommonVehicleService_VersionStructure", propOrder = {
    "bookingRequired",
    "registrationRequired",
    "proposedByServices"
})
@XmlSeeAlso({
    CommonVehicleService.class,
    VehicleSharingServiceVersionStructure.class,
    VehiclePoolingServiceVersionStructure.class,
    VehicleRentalServiceVersionStructure.class
})
public class CommonVehicleServiceVersionStructure
    extends MobilityServiceVersionStructure
{

    @XmlElement(name = "BookingRequired")
    protected Boolean bookingRequired;
    @XmlElement(name = "RegistrationRequired")
    protected Boolean registrationRequired;
    protected OnlineServiceRefsRelStructure proposedByServices;

    /**
     * Ruft den Wert der bookingRequired-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isBookingRequired() {
        return bookingRequired;
    }

    /**
     * Legt den Wert der bookingRequired-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setBookingRequired(Boolean value) {
        this.bookingRequired = value;
    }

    /**
     * Ruft den Wert der registrationRequired-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isRegistrationRequired() {
        return registrationRequired;
    }

    /**
     * Legt den Wert der registrationRequired-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setRegistrationRequired(Boolean value) {
        this.registrationRequired = value;
    }

    /**
     * Ruft den Wert der proposedByServices-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link OnlineServiceRefsRelStructure }
     *     
     */
    public OnlineServiceRefsRelStructure getProposedByServices() {
        return proposedByServices;
    }

    /**
     * Legt den Wert der proposedByServices-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link OnlineServiceRefsRelStructure }
     *     
     */
    public void setProposedByServices(OnlineServiceRefsRelStructure value) {
        this.proposedByServices = value;
    }

}
