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


/**
 * Type for an ACCESS SPACE.
 * 
 * <p>Java-Klasse f�r AccessSpace_VersionStructure complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="AccessSpace_VersionStructure">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.netex.org.uk/netex}StopPlaceSpace_VersionStructure">
 *       &lt;sequence>
 *         &lt;group ref="{http://www.netex.org.uk/netex}AccessSpaceGroup"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AccessSpace_VersionStructure", propOrder = {
    "accessSpaceType",
    "passageType",
    "parentAccessSpaceRef"
})
@XmlSeeAlso({
    AccessSpace.class
})
public class AccessSpaceVersionStructure
    extends StopPlaceSpaceVersionStructure
{

    @XmlElement(name = "AccessSpaceType")
    @XmlSchemaType(name = "string")
    protected AccessSpaceTypeEnumeration accessSpaceType;
    @XmlElement(name = "PassageType")
    @XmlSchemaType(name = "string")
    protected PassageTypeEnumeration passageType;
    @XmlElement(name = "ParentAccessSpaceRef")
    protected AccessSpaceRefStructure parentAccessSpaceRef;

    /**
     * Ruft den Wert der accessSpaceType-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link AccessSpaceTypeEnumeration }
     *     
     */
    public AccessSpaceTypeEnumeration getAccessSpaceType() {
        return accessSpaceType;
    }

    /**
     * Legt den Wert der accessSpaceType-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link AccessSpaceTypeEnumeration }
     *     
     */
    public void setAccessSpaceType(AccessSpaceTypeEnumeration value) {
        this.accessSpaceType = value;
    }

    /**
     * Ruft den Wert der passageType-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link PassageTypeEnumeration }
     *     
     */
    public PassageTypeEnumeration getPassageType() {
        return passageType;
    }

    /**
     * Legt den Wert der passageType-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link PassageTypeEnumeration }
     *     
     */
    public void setPassageType(PassageTypeEnumeration value) {
        this.passageType = value;
    }

    /**
     * Ruft den Wert der parentAccessSpaceRef-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link AccessSpaceRefStructure }
     *     
     */
    public AccessSpaceRefStructure getParentAccessSpaceRef() {
        return parentAccessSpaceRef;
    }

    /**
     * Legt den Wert der parentAccessSpaceRef-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link AccessSpaceRefStructure }
     *     
     */
    public void setParentAccessSpaceRef(AccessSpaceRefStructure value) {
        this.parentAccessSpaceRef = value;
    }

}
