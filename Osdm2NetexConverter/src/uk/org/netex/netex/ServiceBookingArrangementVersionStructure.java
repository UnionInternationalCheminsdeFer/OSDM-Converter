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
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;
import javax.xml.datatype.Duration;


/**
 * Version of a SERVICE BOOKING ARRANGEMENT.
 * 
 * <p>Java-Klasse f�r ServiceBookingArrangement_VersionStructure complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="ServiceBookingArrangement_VersionStructure">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.netex.org.uk/netex}BookingArrangement_VersionStructure">
 *       &lt;sequence>
 *         &lt;group ref="{http://www.netex.org.uk/netex}ServiceBookingArrangementGroup"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ServiceBookingArrangement_VersionStructure", propOrder = {
    "minimumBookingDuration",
    "maximumBookingDuration",
    "depositRequired",
    "bookingChargeType"
})
@XmlSeeAlso({
    ServiceBookingArrangement.class
})
public class ServiceBookingArrangementVersionStructure
    extends BookingArrangementVersionStructure
{

    @XmlElement(name = "MinimumBookingDuration")
    protected Duration minimumBookingDuration;
    @XmlElement(name = "MaximumBookingDuration")
    protected Duration maximumBookingDuration;
    @XmlElement(name = "DepositRequired")
    protected Boolean depositRequired;
    @XmlElement(name = "BookingChargeType")
    @XmlSchemaType(name = "normalizedString")
    protected BookingChargeTypeEnumeration bookingChargeType;

    /**
     * Ruft den Wert der minimumBookingDuration-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Duration }
     *     
     */
    public Duration getMinimumBookingDuration() {
        return minimumBookingDuration;
    }

    /**
     * Legt den Wert der minimumBookingDuration-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Duration }
     *     
     */
    public void setMinimumBookingDuration(Duration value) {
        this.minimumBookingDuration = value;
    }

    /**
     * Ruft den Wert der maximumBookingDuration-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Duration }
     *     
     */
    public Duration getMaximumBookingDuration() {
        return maximumBookingDuration;
    }

    /**
     * Legt den Wert der maximumBookingDuration-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Duration }
     *     
     */
    public void setMaximumBookingDuration(Duration value) {
        this.maximumBookingDuration = value;
    }

    /**
     * Ruft den Wert der depositRequired-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDepositRequired() {
        return depositRequired;
    }

    /**
     * Legt den Wert der depositRequired-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDepositRequired(Boolean value) {
        this.depositRequired = value;
    }

    /**
     * Ruft den Wert der bookingChargeType-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BookingChargeTypeEnumeration }
     *     
     */
    public BookingChargeTypeEnumeration getBookingChargeType() {
        return bookingChargeType;
    }

    /**
     * Legt den Wert der bookingChargeType-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BookingChargeTypeEnumeration }
     *     
     */
    public void setBookingChargeType(BookingChargeTypeEnumeration value) {
        this.bookingChargeType = value;
    }

}
