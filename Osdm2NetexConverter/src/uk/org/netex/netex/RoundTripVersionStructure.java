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


/**
 * Type for ROUND TRIP.
 * 
 * <p>Java-Klasse f�r RoundTrip_VersionStructure complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="RoundTrip_VersionStructure">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.netex.org.uk/netex}UsageParameter_VersionStructure">
 *       &lt;sequence>
 *         &lt;group ref="{http://www.netex.org.uk/netex}RoundTripGroup"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RoundTrip_VersionStructure", propOrder = {
    "tripType",
    "doubleSingleFare",
    "shortTrip",
    "isRequired"
})
@XmlSeeAlso({
    RoundTrip.class
})
public class RoundTripVersionStructure
    extends UsageParameterVersionStructure
{

    @XmlElement(name = "TripType", defaultValue = "single")
    @XmlSchemaType(name = "normalizedString")
    protected RoundTripTypeEnumeration tripType;
    @XmlElement(name = "DoubleSingleFare")
    protected Boolean doubleSingleFare;
    @XmlElement(name = "ShortTrip")
    protected Boolean shortTrip;
    @XmlElement(name = "IsRequired")
    protected Boolean isRequired;

    /**
     * Ruft den Wert der tripType-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link RoundTripTypeEnumeration }
     *     
     */
    public RoundTripTypeEnumeration getTripType() {
        return tripType;
    }

    /**
     * Legt den Wert der tripType-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link RoundTripTypeEnumeration }
     *     
     */
    public void setTripType(RoundTripTypeEnumeration value) {
        this.tripType = value;
    }

    /**
     * Ruft den Wert der doubleSingleFare-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDoubleSingleFare() {
        return doubleSingleFare;
    }

    /**
     * Legt den Wert der doubleSingleFare-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDoubleSingleFare(Boolean value) {
        this.doubleSingleFare = value;
    }

    /**
     * Ruft den Wert der shortTrip-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isShortTrip() {
        return shortTrip;
    }

    /**
     * Legt den Wert der shortTrip-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setShortTrip(Boolean value) {
        this.shortTrip = value;
    }

    /**
     * Ruft den Wert der isRequired-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsRequired() {
        return isRequired;
    }

    /**
     * Legt den Wert der isRequired-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsRequired(Boolean value) {
        this.isRequired = value;
    }

}
