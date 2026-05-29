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
import javax.xml.datatype.Duration;


/**
 * Type for a CHECK CONSTRAINT DELAY.
 * 
 * <p>Java-Klasse f�r CheckConstraintDelay_VersionStructure complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="CheckConstraintDelay_VersionStructure">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.netex.org.uk/netex}Assignment_VersionStructure">
 *       &lt;sequence>
 *         &lt;group ref="{http://www.netex.org.uk/netex}CheckConstraintDelayGroup"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CheckConstraintDelay_VersionStructure", propOrder = {
    "checkConstraintRef",
    "classOfUseRef",
    "minimumLikelyDelay",
    "averageDelay",
    "maximumLikelyDelay"
})
@XmlSeeAlso({
    CheckConstraintDelay.class
})
public class CheckConstraintDelayVersionStructure
    extends AssignmentVersionStructure
{

    @XmlElement(name = "CheckConstraintRef")
    protected CheckConstraintRefStructure checkConstraintRef;
    @XmlElement(name = "ClassOfUseRef")
    protected ClassOfUseRef classOfUseRef;
    @XmlElement(name = "MinimumLikelyDelay")
    protected Duration minimumLikelyDelay;
    @XmlElement(name = "AverageDelay")
    protected Duration averageDelay;
    @XmlElement(name = "MaximumLikelyDelay")
    protected Duration maximumLikelyDelay;

    /**
     * Reference to a CHECK CONSTRAINT. Can be omitted if given by context.
     * 
     * @return
     *     possible object is
     *     {@link CheckConstraintRefStructure }
     *     
     */
    public CheckConstraintRefStructure getCheckConstraintRef() {
        return checkConstraintRef;
    }

    /**
     * Legt den Wert der checkConstraintRef-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link CheckConstraintRefStructure }
     *     
     */
    public void setCheckConstraintRef(CheckConstraintRefStructure value) {
        this.checkConstraintRef = value;
    }

    /**
     * Ruft den Wert der classOfUseRef-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ClassOfUseRef }
     *     
     */
    public ClassOfUseRef getClassOfUseRef() {
        return classOfUseRef;
    }

    /**
     * Legt den Wert der classOfUseRef-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ClassOfUseRef }
     *     
     */
    public void setClassOfUseRef(ClassOfUseRef value) {
        this.classOfUseRef = value;
    }

    /**
     * Ruft den Wert der minimumLikelyDelay-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Duration }
     *     
     */
    public Duration getMinimumLikelyDelay() {
        return minimumLikelyDelay;
    }

    /**
     * Legt den Wert der minimumLikelyDelay-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Duration }
     *     
     */
    public void setMinimumLikelyDelay(Duration value) {
        this.minimumLikelyDelay = value;
    }

    /**
     * Ruft den Wert der averageDelay-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Duration }
     *     
     */
    public Duration getAverageDelay() {
        return averageDelay;
    }

    /**
     * Legt den Wert der averageDelay-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Duration }
     *     
     */
    public void setAverageDelay(Duration value) {
        this.averageDelay = value;
    }

    /**
     * Ruft den Wert der maximumLikelyDelay-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Duration }
     *     
     */
    public Duration getMaximumLikelyDelay() {
        return maximumLikelyDelay;
    }

    /**
     * Legt den Wert der maximumLikelyDelay-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Duration }
     *     
     */
    public void setMaximumLikelyDelay(Duration value) {
        this.maximumLikelyDelay = value;
    }

}
