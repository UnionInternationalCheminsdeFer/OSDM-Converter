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
 * Type for SERVICE ACCESS RIGHT.
 * 
 * <p>Java-Klasse f�r ServiceAccessRight_VersionStructure complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="ServiceAccessRight_VersionStructure">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.netex.org.uk/netex}PriceableObject_VersionStructure">
 *       &lt;sequence>
 *         &lt;group ref="{http://www.netex.org.uk/netex}ServiceAccessRightGroup"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ServiceAccessRight_VersionStructure", propOrder = {
    "privateCode",
    "infoUrl",
    "documentLinks"
})
@XmlSeeAlso({
    ServiceAccessRight.class,
    EntitlementProductVersionStructure.class,
    FareProductVersionStructure.class
})
public class ServiceAccessRightVersionStructure
    extends PriceableObjectVersionStructure
{

    @XmlElement(name = "PrivateCode")
    protected PrivateCodeStructure privateCode;
    @XmlElement(name = "InfoUrl")
    @XmlSchemaType(name = "anyURI")
    protected String infoUrl;
    protected InfoLinksRelStructure documentLinks;

    /**
     * DEPRECATED - use privateCodes. -v2.0
     * 
     * @return
     *     possible object is
     *     {@link PrivateCodeStructure }
     *     
     */
    public PrivateCodeStructure getPrivateCode() {
        return privateCode;
    }

    /**
     * Legt den Wert der privateCode-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link PrivateCodeStructure }
     *     
     */
    public void setPrivateCode(PrivateCodeStructure value) {
        this.privateCode = value;
    }

    /**
     * Ruft den Wert der infoUrl-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInfoUrl() {
        return infoUrl;
    }

    /**
     * Legt den Wert der infoUrl-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInfoUrl(String value) {
        this.infoUrl = value;
    }

    /**
     * Ruft den Wert der documentLinks-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link InfoLinksRelStructure }
     *     
     */
    public InfoLinksRelStructure getDocumentLinks() {
        return documentLinks;
    }

    /**
     * Legt den Wert der documentLinks-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link InfoLinksRelStructure }
     *     
     */
    public void setDocumentLinks(InfoLinksRelStructure value) {
        this.documentLinks = value;
    }

}
