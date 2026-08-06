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
 * Type for a General purpose member of a GROUP OF ENTITies.
 * 
 * <p>Java-Klasse f�r GroupMember_VersionedChildStructure complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="GroupMember_VersionedChildStructure">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.netex.org.uk/netex}AbstractGroupMember_VersionedChildStructure">
 *       &lt;sequence>
 *         &lt;element name="GroupRef" type="{http://www.netex.org.uk/netex}VersionOfObjectRefStructure" minOccurs="0"/>
 *         &lt;element name="MemberObjectRef" type="{http://www.netex.org.uk/netex}VersionOfObjectRefStructure"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GroupMember_VersionedChildStructure", propOrder = {
    "groupRef",
    "memberObjectRef"
})
@XmlSeeAlso({
    TimeDemandProfileMemberVersionStructure.class
})
public class GroupMemberVersionedChildStructure
    extends AbstractGroupMemberVersionedChildStructure
{

    @XmlElement(name = "GroupRef")
    protected VersionOfObjectRefStructure groupRef;
    @XmlElement(name = "MemberObjectRef", required = true)
    protected VersionOfObjectRefStructure memberObjectRef;

    /**
     * Ruft den Wert der groupRef-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link VersionOfObjectRefStructure }
     *     
     */
    public VersionOfObjectRefStructure getGroupRef() {
        return groupRef;
    }

    /**
     * Legt den Wert der groupRef-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link VersionOfObjectRefStructure }
     *     
     */
    public void setGroupRef(VersionOfObjectRefStructure value) {
        this.groupRef = value;
    }

    /**
     * Ruft den Wert der memberObjectRef-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link VersionOfObjectRefStructure }
     *     
     */
    public VersionOfObjectRefStructure getMemberObjectRef() {
        return memberObjectRef;
    }

    /**
     * Legt den Wert der memberObjectRef-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link VersionOfObjectRefStructure }
     *     
     */
    public void setMemberObjectRef(VersionOfObjectRefStructure value) {
        this.memberObjectRef = value;
    }

}
