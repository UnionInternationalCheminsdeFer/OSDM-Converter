//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// �nderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2026.05.22 um 10:24:00 AM CEST 
//


package uk.org.netex.netex;

import java.math.BigInteger;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Type for a HAIL AND RIDE AREA.
 * 
 * <p>Java-Klasse f�r HailAndRideArea_VersionStructure complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="HailAndRideArea_VersionStructure">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.netex.org.uk/netex}FlexibleQuay_VersionStructure">
 *       &lt;sequence>
 *         &lt;group ref="{http://www.netex.org.uk/netex}HailAndRideAreaGroup"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HailAndRideArea_VersionStructure", propOrder = {
    "bearingCompass",
    "bearingDegrees",
    "destinations",
    "startPointRef",
    "endPointRef"
})
@XmlSeeAlso({
    HailAndRideArea.class
})
public class HailAndRideAreaVersionStructure
    extends FlexibleQuayVersionStructure
{

    @XmlElement(name = "BearingCompass")
    @XmlSchemaType(name = "string")
    protected CompassBearing16Enumeration bearingCompass;
    @XmlElement(name = "BearingDegrees")
    protected BigInteger bearingDegrees;
    protected DestinationDisplayViewsRelStructure destinations;
    @XmlElement(name = "StartPointRef", required = true)
    protected PointRefStructure startPointRef;
    @XmlElement(name = "EndPointRef", required = true)
    protected PointRefStructure endPointRef;

    /**
     * Ruft den Wert der bearingCompass-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link CompassBearing16Enumeration }
     *     
     */
    public CompassBearing16Enumeration getBearingCompass() {
        return bearingCompass;
    }

    /**
     * Legt den Wert der bearingCompass-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link CompassBearing16Enumeration }
     *     
     */
    public void setBearingCompass(CompassBearing16Enumeration value) {
        this.bearingCompass = value;
    }

    /**
     * Ruft den Wert der bearingDegrees-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getBearingDegrees() {
        return bearingDegrees;
    }

    /**
     * Legt den Wert der bearingDegrees-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setBearingDegrees(BigInteger value) {
        this.bearingDegrees = value;
    }

    /**
     * Ruft den Wert der destinations-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link DestinationDisplayViewsRelStructure }
     *     
     */
    public DestinationDisplayViewsRelStructure getDestinations() {
        return destinations;
    }

    /**
     * Legt den Wert der destinations-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link DestinationDisplayViewsRelStructure }
     *     
     */
    public void setDestinations(DestinationDisplayViewsRelStructure value) {
        this.destinations = value;
    }

    /**
     * Ruft den Wert der startPointRef-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link PointRefStructure }
     *     
     */
    public PointRefStructure getStartPointRef() {
        return startPointRef;
    }

    /**
     * Legt den Wert der startPointRef-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link PointRefStructure }
     *     
     */
    public void setStartPointRef(PointRefStructure value) {
        this.startPointRef = value;
    }

    /**
     * Ruft den Wert der endPointRef-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link PointRefStructure }
     *     
     */
    public PointRefStructure getEndPointRef() {
        return endPointRef;
    }

    /**
     * Legt den Wert der endPointRef-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link PointRefStructure }
     *     
     */
    public void setEndPointRef(PointRefStructure value) {
        this.endPointRef = value;
    }

}
