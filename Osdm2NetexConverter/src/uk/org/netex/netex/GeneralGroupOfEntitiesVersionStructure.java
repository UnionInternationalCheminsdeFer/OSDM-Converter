//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// �nderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2026.05.22 um 10:24:00 AM CEST 
//


package uk.org.netex.netex;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.CollapsedStringAdapter;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * Type for a GENERAL GROUP OF ENTITies.
 * 
 * <p>Java-Klasse f�r GeneralGroupOfEntities_VersionStructure complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="GeneralGroupOfEntities_VersionStructure">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.netex.org.uk/netex}GroupOfEntities_VersionStructure">
 *       &lt;sequence>
 *         &lt;group ref="{http://www.netex.org.uk/netex}GeneralGroupOfEntitiesGroup"/>
 *       &lt;/sequence>
 *       &lt;attribute name="nameOfMemberClass" type="{http://www.netex.org.uk/netex}NameOfClass" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GeneralGroupOfEntities_VersionStructure", propOrder = {
    "members"
})
@XmlSeeAlso({
    GeneralGroupOfEntities.class
})
public class GeneralGroupOfEntitiesVersionStructure
    extends GroupOfEntitiesVersionStructure
{

    protected ObjectRefsRelStructure members;
    @XmlAttribute(name = "nameOfMemberClass")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String nameOfMemberClass;

    /**
     * Ruft den Wert der members-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ObjectRefsRelStructure }
     *     
     */
    public ObjectRefsRelStructure getMembers() {
        return members;
    }

    /**
     * Legt den Wert der members-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ObjectRefsRelStructure }
     *     
     */
    public void setMembers(ObjectRefsRelStructure value) {
        this.members = value;
    }

    /**
     * Ruft den Wert der nameOfMemberClass-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNameOfMemberClass() {
        return nameOfMemberClass;
    }

    /**
     * Legt den Wert der nameOfMemberClass-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNameOfMemberClass(String value) {
        this.nameOfMemberClass = value;
    }

}
