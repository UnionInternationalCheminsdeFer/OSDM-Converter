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
 * Type for a VEHICLE Manoeuvring REQUIREMENT.
 * 
 * <p>Java-Klasse f�r VehicleManoeuvringRequirement_VersionStructure complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="VehicleManoeuvringRequirement_VersionStructure">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.netex.org.uk/netex}VehicleRequirement_VersionStructure">
 *       &lt;sequence>
 *         &lt;group ref="{http://www.netex.org.uk/netex}VehicleManoeuvringRequirementGroup"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VehicleManoeuvringRequirement_VersionStructure", propOrder = {
    "reversible",
    "minimumTurningCircle",
    "minimumOvertakingWidth",
    "minimumLength"
})
@XmlSeeAlso({
    VehicleManoeuvringRequirement.class
})
public class VehicleManoeuvringRequirementVersionStructure
    extends VehicleRequirementVersionStructure
{

    @XmlElement(name = "Reversible", defaultValue = "true")
    protected Boolean reversible;
    @XmlElement(name = "MinimumTurningCircle")
    protected BigDecimal minimumTurningCircle;
    @XmlElement(name = "MinimumOvertakingWidth")
    protected BigDecimal minimumOvertakingWidth;
    @XmlElement(name = "MinimumLength")
    protected BigDecimal minimumLength;

    /**
     * Ruft den Wert der reversible-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isReversible() {
        return reversible;
    }

    /**
     * Legt den Wert der reversible-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setReversible(Boolean value) {
        this.reversible = value;
    }

    /**
     * Ruft den Wert der minimumTurningCircle-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMinimumTurningCircle() {
        return minimumTurningCircle;
    }

    /**
     * Legt den Wert der minimumTurningCircle-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMinimumTurningCircle(BigDecimal value) {
        this.minimumTurningCircle = value;
    }

    /**
     * Ruft den Wert der minimumOvertakingWidth-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMinimumOvertakingWidth() {
        return minimumOvertakingWidth;
    }

    /**
     * Legt den Wert der minimumOvertakingWidth-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMinimumOvertakingWidth(BigDecimal value) {
        this.minimumOvertakingWidth = value;
    }

    /**
     * Ruft den Wert der minimumLength-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMinimumLength() {
        return minimumLength;
    }

    /**
     * Legt den Wert der minimumLength-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMinimumLength(BigDecimal value) {
        this.minimumLength = value;
    }

}
