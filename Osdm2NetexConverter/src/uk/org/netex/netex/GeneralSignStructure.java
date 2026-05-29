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
 * Type for an GENERAL SIGN.
 * 
 * <p>Java-Klasse f�r GeneralSignStructure complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="GeneralSignStructure">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.netex.org.uk/netex}SignEquipment_VersionStructure">
 *       &lt;sequence>
 *         &lt;group ref="{http://www.netex.org.uk/netex}GeneralSignGroup"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GeneralSignStructure", propOrder = {
    "content",
    "signContentType"
})
@XmlSeeAlso({
    GeneralSign.class
})
public class GeneralSignStructure
    extends SignEquipmentVersionStructure
{

    @XmlElement(name = "Content")
    protected MultilingualString content;
    @XmlElement(name = "SignContentType")
    @XmlSchemaType(name = "string")
    protected SignContentEnumeration signContentType;

    /**
     * Ruft den Wert der content-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link MultilingualString }
     *     
     */
    public MultilingualString getContent() {
        return content;
    }

    /**
     * Legt den Wert der content-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link MultilingualString }
     *     
     */
    public void setContent(MultilingualString value) {
        this.content = value;
    }

    /**
     * Ruft den Wert der signContentType-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link SignContentEnumeration }
     *     
     */
    public SignContentEnumeration getSignContentType() {
        return signContentType;
    }

    /**
     * Legt den Wert der signContentType-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link SignContentEnumeration }
     *     
     */
    public void setSignContentType(SignContentEnumeration value) {
        this.signContentType = value;
    }

}
