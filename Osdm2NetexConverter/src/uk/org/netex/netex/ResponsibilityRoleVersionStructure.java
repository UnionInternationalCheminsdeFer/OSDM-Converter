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
 *  Type for a RESPONSIBILITY ROLE that can be associated with a DATA MANAGED OBJECT. A Child ENTITY has the same responsibilities as its parent.
 * 
 * <p>Java-Klasse f�r ResponsibilityRole_VersionStructure complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="ResponsibilityRole_VersionStructure">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.netex.org.uk/netex}DataManagedObjectStructure">
 *       &lt;group ref="{http://www.netex.org.uk/netex}ResponsibilityRoleGroup"/>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ResponsibilityRole_VersionStructure", propOrder = {
    "name",
    "description",
    "typeOfResponsibilityRoleRef"
})
@XmlSeeAlso({
    ResponsibilityRole.class
})
public class ResponsibilityRoleVersionStructure
    extends DataManagedObjectStructure
{

    @XmlElement(name = "Name")
    protected MultilingualString name;
    @XmlElement(name = "Description")
    protected MultilingualString description;
    @XmlElement(name = "TypeOfResponsibilityRoleRef")
    protected TypeOfResponsibilityRoleRefStructure typeOfResponsibilityRoleRef;

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
     * Ruft den Wert der typeOfResponsibilityRoleRef-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link TypeOfResponsibilityRoleRefStructure }
     *     
     */
    public TypeOfResponsibilityRoleRefStructure getTypeOfResponsibilityRoleRef() {
        return typeOfResponsibilityRoleRef;
    }

    /**
     * Legt den Wert der typeOfResponsibilityRoleRef-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeOfResponsibilityRoleRefStructure }
     *     
     */
    public void setTypeOfResponsibilityRoleRef(TypeOfResponsibilityRoleRefStructure value) {
        this.typeOfResponsibilityRoleRef = value;
    }

}
