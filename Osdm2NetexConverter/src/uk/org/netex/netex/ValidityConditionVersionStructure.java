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
 * Types for a VALIDITY CONDITION.
 * 
 * <p>Java-Klasse f�r ValidityCondition_VersionStructure complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="ValidityCondition_VersionStructure">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.netex.org.uk/netex}DataManagedObjectStructure">
 *       &lt;group ref="{http://www.netex.org.uk/netex}ValidityConditionGroup"/>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ValidityCondition_VersionStructure", propOrder = {
    "name",
    "description",
    "conditionedObjectRef",
    "withConditionRef"
})
@XmlSeeAlso({
    ValidityCondition.class,
    ValidityRuleParameterVersionStructure.class,
    ValidityTriggerVersionStructure.class,
    ValidBetweenVersionStructure.class
})
public class ValidityConditionVersionStructure
    extends DataManagedObjectStructure
{

    @XmlElement(name = "Name")
    protected MultilingualString name;
    @XmlElement(name = "Description")
    protected MultilingualString description;
    @XmlElement(name = "ConditionedObjectRef")
    protected VersionOfObjectRefStructure conditionedObjectRef;
    @XmlElement(name = "WithConditionRef")
    protected ValidityConditionRefStructure withConditionRef;

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
     * Ruft den Wert der description-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link MultilingualString }
     *     
     */
    public MultilingualString getDescription() {
        return description;
    }

    /**
     * Legt den Wert der description-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link MultilingualString }
     *     
     */
    public void setDescription(MultilingualString value) {
        this.description = value;
    }

    /**
     * Ruft den Wert der conditionedObjectRef-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link VersionOfObjectRefStructure }
     *     
     */
    public VersionOfObjectRefStructure getConditionedObjectRef() {
        return conditionedObjectRef;
    }

    /**
     * Legt den Wert der conditionedObjectRef-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link VersionOfObjectRefStructure }
     *     
     */
    public void setConditionedObjectRef(VersionOfObjectRefStructure value) {
        this.conditionedObjectRef = value;
    }

    /**
     * Ruft den Wert der withConditionRef-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ValidityConditionRefStructure }
     *     
     */
    public ValidityConditionRefStructure getWithConditionRef() {
        return withConditionRef;
    }

    /**
     * Legt den Wert der withConditionRef-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ValidityConditionRefStructure }
     *     
     */
    public void setWithConditionRef(ValidityConditionRefStructure value) {
        this.withConditionRef = value;
    }

}
