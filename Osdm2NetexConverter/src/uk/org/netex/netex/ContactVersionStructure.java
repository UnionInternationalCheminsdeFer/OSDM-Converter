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
 * Type for a CONTACT.
 * 
 * <p>Java-Klasse f�r Contact_VersionStructure complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="Contact_VersionStructure">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.netex.org.uk/netex}DataManagedObjectStructure">
 *       &lt;sequence>
 *         &lt;group ref="{http://www.netex.org.uk/netex}ContactGroup"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Contact_VersionStructure", propOrder = {
    "name",
    "contactDetails",
    "contactType"
})
@XmlSeeAlso({
    Contact.class
})
public class ContactVersionStructure
    extends DataManagedObjectStructure
{

    @XmlElement(name = "Name")
    protected MultilingualString name;
    @XmlElement(name = "ContactDetails")
    protected ContactDetailsStructure contactDetails;
    @XmlElement(name = "ContactType")
    @XmlSchemaType(name = "NMTOKEN")
    protected ContactTypeEnumeration contactType;

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
     * Ruft den Wert der contactDetails-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ContactDetailsStructure }
     *     
     */
    public ContactDetailsStructure getContactDetails() {
        return contactDetails;
    }

    /**
     * Legt den Wert der contactDetails-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ContactDetailsStructure }
     *     
     */
    public void setContactDetails(ContactDetailsStructure value) {
        this.contactDetails = value;
    }

    /**
     * Ruft den Wert der contactType-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ContactTypeEnumeration }
     *     
     */
    public ContactTypeEnumeration getContactType() {
        return contactType;
    }

    /**
     * Legt den Wert der contactType-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ContactTypeEnumeration }
     *     
     */
    public void setContactType(ContactTypeEnumeration value) {
        this.contactType = value;
    }

}
