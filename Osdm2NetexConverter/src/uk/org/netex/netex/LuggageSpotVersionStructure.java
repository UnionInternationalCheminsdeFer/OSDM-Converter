//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// �nderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2026.05.22 um 10:24:00 AM CEST 
//


package uk.org.netex.netex;

import java.math.BigDecimal;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Type for a LUGGAGE SPOT.
 * 
 * <p>Java-Klasse f�r LuggageSpot_VersionStructure complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="LuggageSpot_VersionStructure">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.netex.org.uk/netex}LocatableSpot_VersionStructure">
 *       &lt;sequence>
 *         &lt;group ref="{http://www.netex.org.uk/netex}LuggageSpotGroup"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LuggageSpot_VersionStructure", propOrder = {
    "isAccessibleOnVoyage",
    "heightFromFloor"
})
@XmlSeeAlso({
    LuggageSpot.class
})
public class LuggageSpotVersionStructure
    extends LocatableSpotVersionStructure
{

    @XmlElement(name = "IsAccessibleOnVoyage", defaultValue = "true")
    protected Boolean isAccessibleOnVoyage;
    @XmlElement(name = "HeightFromFloor")
    protected BigDecimal heightFromFloor;

    /**
     * Ruft den Wert der isAccessibleOnVoyage-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsAccessibleOnVoyage() {
        return isAccessibleOnVoyage;
    }

    /**
     * Legt den Wert der isAccessibleOnVoyage-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsAccessibleOnVoyage(Boolean value) {
        this.isAccessibleOnVoyage = value;
    }

    /**
     * Ruft den Wert der heightFromFloor-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getHeightFromFloor() {
        return heightFromFloor;
    }

    /**
     * Legt den Wert der heightFromFloor-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setHeightFromFloor(BigDecimal value) {
        this.heightFromFloor = value;
    }

}
