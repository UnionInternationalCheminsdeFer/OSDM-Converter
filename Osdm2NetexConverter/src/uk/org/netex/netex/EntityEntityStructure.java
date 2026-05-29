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
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * Type for a ENTITY. Will contain one or more versions of the appropriate ENTITY IN VERSION.
 * 
 * <p>Java-Klasse f�r Entity_EntityStructure complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="Entity_EntityStructure">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.netex.org.uk/netex}EntityStructure">
 *       &lt;sequence>
 *         &lt;element name="versions" type="{http://www.netex.org.uk/netex}entitiesInVersion_RelStructure"/>
 *       &lt;/sequence>
 *       &lt;attribute name="created" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
 *       &lt;attribute name="changed" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Entity_EntityStructure", propOrder = {
    "versions"
})
public class EntityEntityStructure
    extends EntityStructure
{

    @XmlElement(required = true)
    protected EntitiesInVersionRelStructure versions;
    @XmlAttribute(name = "created")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar created;
    @XmlAttribute(name = "changed")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar changed;

    /**
     * Ruft den Wert der versions-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link EntitiesInVersionRelStructure }
     *     
     */
    public EntitiesInVersionRelStructure getVersions() {
        return versions;
    }

    /**
     * Legt den Wert der versions-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link EntitiesInVersionRelStructure }
     *     
     */
    public void setVersions(EntitiesInVersionRelStructure value) {
        this.versions = value;
    }

    /**
     * Ruft den Wert der created-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCreated() {
        return created;
    }

    /**
     * Legt den Wert der created-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCreated(XMLGregorianCalendar value) {
        this.created = value;
    }

    /**
     * Ruft den Wert der changed-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getChanged() {
        return changed;
    }

    /**
     * Legt den Wert der changed-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setChanged(XMLGregorianCalendar value) {
        this.changed = value;
    }

}
