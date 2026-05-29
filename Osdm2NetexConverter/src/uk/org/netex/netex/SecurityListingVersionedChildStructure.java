//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// �nderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2026.05.22 um 10:24:00 AM CEST 
//


package uk.org.netex.netex;

import java.math.BigInteger;
import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlElementRef;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Type for SECURITY LISTING.
 * 
 * <p>Java-Klasse f�r SecurityListing_VersionedChildStructure complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="SecurityListing_VersionedChildStructure">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.netex.org.uk/netex}VersionedChildStructure">
 *       &lt;sequence>
 *         &lt;group ref="{http://www.netex.org.uk/netex}SecurityListingGroup"/>
 *       &lt;/sequence>
 *       &lt;attribute name="order" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SecurityListing_VersionedChildStructure", propOrder = {
    "name",
    "securityListRef"
})
@XmlSeeAlso({
    SecurityListing.class,
    FareContractSecurityListingVersionedChildStructure.class,
    MediumAccessDeviceSecurityListingVersionedChildStructure.class,
    TravelDocumentSecurityListingVersionedChildStructure.class,
    CustomerSecurityListingVersionedChildStructure.class,
    CustomerAccountSecurityListingVersionedChildStructure.class,
    RetailDeviceSecurityListingVersionedChildStructure.class
})
public class SecurityListingVersionedChildStructure
    extends VersionedChildStructure
{

    @XmlElement(name = "Name")
    protected MultilingualString name;
    @XmlElementRef(name = "SecurityListRef", namespace = "http://www.netex.org.uk/netex", type = JAXBElement.class, required = false)
    protected JAXBElement<? extends SecurityListRefStructure> securityListRef;
    @XmlAttribute(name = "order")
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger order;

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
     * Ruft den Wert der securityListRef-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BlacklistRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link WhitelistRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link SecurityListRefStructure }{@code >}
     *     
     */
    public JAXBElement<? extends SecurityListRefStructure> getSecurityListRef() {
        return securityListRef;
    }

    /**
     * Legt den Wert der securityListRef-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BlacklistRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link WhitelistRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link SecurityListRefStructure }{@code >}
     *     
     */
    public void setSecurityListRef(JAXBElement<? extends SecurityListRefStructure> value) {
        this.securityListRef = value;
    }

    /**
     * Ruft den Wert der order-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getOrder() {
        return order;
    }

    /**
     * Legt den Wert der order-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setOrder(BigInteger value) {
        this.order = value;
    }

}
