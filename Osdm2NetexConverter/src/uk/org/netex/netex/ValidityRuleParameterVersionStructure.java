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
import jakarta.xml.bind.annotation.adapters.CollapsedStringAdapter;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * Type for a VALIDITY PARAMETER.
 * 
 * <p>Java-Klasse f�r ValidityRuleParameter_VersionStructure complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="ValidityRuleParameter_VersionStructure">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.netex.org.uk/netex}ValidityCondition_VersionStructure">
 *       &lt;sequence>
 *         &lt;group ref="{http://www.netex.org.uk/netex}ValidityRuleParameterGroup"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ValidityRuleParameter_VersionStructure", propOrder = {
    "ruleObjectRef",
    "attributeName",
    "comparisonOperator",
    "attributeValue",
    "method",
    "isValid"
})
@XmlSeeAlso({
    ValidityRuleParameter.class
})
public class ValidityRuleParameterVersionStructure
    extends ValidityConditionVersionStructure
{

    @XmlElement(name = "RuleObjectRef")
    protected VersionOfObjectRefStructure ruleObjectRef;
    @XmlElement(name = "AttributeName")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NMTOKEN")
    protected String attributeName;
    @XmlElement(name = "ComparisonOperator")
    @XmlSchemaType(name = "NMTOKEN")
    protected RelativeOperatorEnumeration comparisonOperator;
    @XmlElement(name = "AttributeValue")
    protected Object attributeValue;
    @XmlElement(name = "Method")
    protected Object method;
    protected Boolean isValid;

    /**
     * Ruft den Wert der ruleObjectRef-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link VersionOfObjectRefStructure }
     *     
     */
    public VersionOfObjectRefStructure getRuleObjectRef() {
        return ruleObjectRef;
    }

    /**
     * Legt den Wert der ruleObjectRef-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link VersionOfObjectRefStructure }
     *     
     */
    public void setRuleObjectRef(VersionOfObjectRefStructure value) {
        this.ruleObjectRef = value;
    }

    /**
     * Ruft den Wert der attributeName-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAttributeName() {
        return attributeName;
    }

    /**
     * Legt den Wert der attributeName-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAttributeName(String value) {
        this.attributeName = value;
    }

    /**
     * Ruft den Wert der comparisonOperator-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link RelativeOperatorEnumeration }
     *     
     */
    public RelativeOperatorEnumeration getComparisonOperator() {
        return comparisonOperator;
    }

    /**
     * Legt den Wert der comparisonOperator-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link RelativeOperatorEnumeration }
     *     
     */
    public void setComparisonOperator(RelativeOperatorEnumeration value) {
        this.comparisonOperator = value;
    }

    /**
     * Ruft den Wert der attributeValue-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getAttributeValue() {
        return attributeValue;
    }

    /**
     * Legt den Wert der attributeValue-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setAttributeValue(Object value) {
        this.attributeValue = value;
    }

    /**
     * Ruft den Wert der method-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getMethod() {
        return method;
    }

    /**
     * Legt den Wert der method-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setMethod(Object value) {
        this.method = value;
    }

    /**
     * Ruft den Wert der isValid-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsValid() {
        return isValid;
    }

    /**
     * Legt den Wert der isValid-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsValid(Boolean value) {
        this.isValid = value;
    }

}
