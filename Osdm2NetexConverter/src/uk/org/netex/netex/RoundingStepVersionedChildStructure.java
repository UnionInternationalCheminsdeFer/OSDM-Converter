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
 * Type for ROUNDING STEP.
 * 
 * <p>Java-Klasse f�r RoundingStep_VersionedChildStructure complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="RoundingStep_VersionedChildStructure">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.netex.org.uk/netex}VersionedChildStructure">
 *       &lt;sequence>
 *         &lt;group ref="{http://www.netex.org.uk/netex}RoundingStepGroup"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RoundingStep_VersionedChildStructure", propOrder = {
    "roundingStepRef",
    "roundIfGreaterThan",
    "roundTo"
})
@XmlSeeAlso({
    RoundingStep.class
})
public abstract class RoundingStepVersionedChildStructure
    extends VersionedChildStructure
{

    @XmlElement(name = "RoundingStepRef")
    protected RoundingStepRefStructure roundingStepRef;
    @XmlElement(name = "RoundIfGreaterThan", required = true)
    protected BigDecimal roundIfGreaterThan;
    @XmlElement(name = "RoundTo", required = true)
    protected BigDecimal roundTo;

    /**
     * Ruft den Wert der roundingStepRef-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link RoundingStepRefStructure }
     *     
     */
    public RoundingStepRefStructure getRoundingStepRef() {
        return roundingStepRef;
    }

    /**
     * Legt den Wert der roundingStepRef-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link RoundingStepRefStructure }
     *     
     */
    public void setRoundingStepRef(RoundingStepRefStructure value) {
        this.roundingStepRef = value;
    }

    /**
     * Ruft den Wert der roundIfGreaterThan-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getRoundIfGreaterThan() {
        return roundIfGreaterThan;
    }

    /**
     * Legt den Wert der roundIfGreaterThan-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setRoundIfGreaterThan(BigDecimal value) {
        this.roundIfGreaterThan = value;
    }

    /**
     * Ruft den Wert der roundTo-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getRoundTo() {
        return roundTo;
    }

    /**
     * Legt den Wert der roundTo-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setRoundTo(BigDecimal value) {
        this.roundTo = value;
    }

}
