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
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Type for ROUNDING.
 * 
 * <p>Java-Klasse f�r Rounding_VersionedStructure complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="Rounding_VersionedStructure">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.netex.org.uk/netex}DataManagedObjectStructure">
 *       &lt;sequence>
 *         &lt;group ref="{http://www.netex.org.uk/netex}RoundingGroup"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Rounding_VersionedStructure", propOrder = {
    "name",
    "roundingMethod",
    "roundingModulus",
    "roundingSteps"
})
@XmlSeeAlso({
    Rounding.class
})
public class RoundingVersionedStructure
    extends DataManagedObjectStructure
{

    @XmlElement(name = "Name")
    protected MultilingualString name;
    @XmlElement(name = "RoundingMethod")
    @XmlSchemaType(name = "normalizedString")
    protected RoundingMethodEnumeration roundingMethod;
    @XmlElement(name = "RoundingModulus")
    protected BigDecimal roundingModulus;
    protected RoundingStepsRelStructure roundingSteps;

    /**
     * Ruft den Wert der name-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link MultilingualString }
     *     
     */
    public MultilingualString getName() {
        return name;
    }

    /**
     * Legt den Wert der name-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link MultilingualString }
     *     
     */
    public void setName(MultilingualString value) {
        this.name = value;
    }

    /**
     * Ruft den Wert der roundingMethod-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link RoundingMethodEnumeration }
     *     
     */
    public RoundingMethodEnumeration getRoundingMethod() {
        return roundingMethod;
    }

    /**
     * Legt den Wert der roundingMethod-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link RoundingMethodEnumeration }
     *     
     */
    public void setRoundingMethod(RoundingMethodEnumeration value) {
        this.roundingMethod = value;
    }

    /**
     * Ruft den Wert der roundingModulus-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getRoundingModulus() {
        return roundingModulus;
    }

    /**
     * Legt den Wert der roundingModulus-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setRoundingModulus(BigDecimal value) {
        this.roundingModulus = value;
    }

    /**
     * Ruft den Wert der roundingSteps-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link RoundingStepsRelStructure }
     *     
     */
    public RoundingStepsRelStructure getRoundingSteps() {
        return roundingSteps;
    }

    /**
     * Legt den Wert der roundingSteps-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link RoundingStepsRelStructure }
     *     
     */
    public void setRoundingSteps(RoundingStepsRelStructure value) {
        this.roundingSteps = value;
    }

}
