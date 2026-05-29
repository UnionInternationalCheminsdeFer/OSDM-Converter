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
import jakarta.xml.bind.annotation.XmlType;


/**
 * Type for a Group of Entities Constraint Member. Specifies an allowed class to include in a group.
 * 
 * <p>Java-Klasse f�r GroupConstraintMember_VersionedChildStructure complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="GroupConstraintMember_VersionedChildStructure">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.netex.org.uk/netex}VersionedChildStructure">
 *       &lt;sequence>
 *         &lt;element name="PurposeOfGroupingRef" type="{http://www.netex.org.uk/netex}PurposeOfGroupingRefStructure" minOccurs="0"/>
 *         &lt;element name="MemberClassRef" type="{http://www.netex.org.uk/netex}ClassRefStructure"/>
 *         &lt;element name="MemberTypeOfValueRef" type="{http://www.netex.org.uk/netex}TypeOfValueRefStructure" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GroupConstraintMember_VersionedChildStructure", propOrder = {
    "purposeOfGroupingRef",
    "memberClassRef",
    "memberTypeOfValueRef"
})
public class GroupConstraintMemberVersionedChildStructure
    extends VersionedChildStructure
{

    @XmlElement(name = "PurposeOfGroupingRef")
    protected PurposeOfGroupingRefStructure purposeOfGroupingRef;
    @XmlElement(name = "MemberClassRef", required = true)
    protected ClassRefStructure memberClassRef;
    @XmlElement(name = "MemberTypeOfValueRef")
    protected TypeOfValueRefStructure memberTypeOfValueRef;

    /**
     * Ruft den Wert der purposeOfGroupingRef-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link PurposeOfGroupingRefStructure }
     *     
     */
    public PurposeOfGroupingRefStructure getPurposeOfGroupingRef() {
        return purposeOfGroupingRef;
    }

    /**
     * Legt den Wert der purposeOfGroupingRef-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link PurposeOfGroupingRefStructure }
     *     
     */
    public void setPurposeOfGroupingRef(PurposeOfGroupingRefStructure value) {
        this.purposeOfGroupingRef = value;
    }

    /**
     * Ruft den Wert der memberClassRef-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ClassRefStructure }
     *     
     */
    public ClassRefStructure getMemberClassRef() {
        return memberClassRef;
    }

    /**
     * Legt den Wert der memberClassRef-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ClassRefStructure }
     *     
     */
    public void setMemberClassRef(ClassRefStructure value) {
        this.memberClassRef = value;
    }

    /**
     * Ruft den Wert der memberTypeOfValueRef-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link TypeOfValueRefStructure }
     *     
     */
    public TypeOfValueRefStructure getMemberTypeOfValueRef() {
        return memberTypeOfValueRef;
    }

    /**
     * Legt den Wert der memberTypeOfValueRef-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeOfValueRefStructure }
     *     
     */
    public void setMemberTypeOfValueRef(TypeOfValueRefStructure value) {
        this.memberTypeOfValueRef = value;
    }

}
