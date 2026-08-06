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
 * Type for FULFILMENT METHOD.
 * 
 * <p>Java-Klasse f�r FulfilmentMethod_VersionStructure complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="FulfilmentMethod_VersionStructure">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.netex.org.uk/netex}PriceableObject_VersionStructure">
 *       &lt;sequence>
 *         &lt;group ref="{http://www.netex.org.uk/netex}FulfilmentMethodGroup"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FulfilmentMethod_VersionStructure", propOrder = {
    "fulfilmentMethodType",
    "requiresCard",
    "requiresBookingReference",
    "typesOfTravelDocument",
    "prices"
})
@XmlSeeAlso({
    FulfilmentMethod.class
})
public class FulfilmentMethodVersionStructure
    extends PriceableObjectVersionStructure
{

    @XmlElement(name = "FulfilmentMethodType")
    @XmlSchemaType(name = "normalizedString")
    protected FulfilmentMethodTypeEnumeration fulfilmentMethodType;
    @XmlElement(name = "RequiresCard")
    protected Boolean requiresCard;
    @XmlElement(name = "RequiresBookingReference")
    protected Boolean requiresBookingReference;
    protected TypeOfTravelDocumentRefsRelStructure typesOfTravelDocument;
    protected FulfilmentMethodPricesRelStructure prices;

    /**
     * Ruft den Wert der fulfilmentMethodType-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FulfilmentMethodTypeEnumeration }
     *     
     */
    public FulfilmentMethodTypeEnumeration getFulfilmentMethodType() {
        return fulfilmentMethodType;
    }

    /**
     * Legt den Wert der fulfilmentMethodType-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FulfilmentMethodTypeEnumeration }
     *     
     */
    public void setFulfilmentMethodType(FulfilmentMethodTypeEnumeration value) {
        this.fulfilmentMethodType = value;
    }

    /**
     * Ruft den Wert der requiresCard-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isRequiresCard() {
        return requiresCard;
    }

    /**
     * Legt den Wert der requiresCard-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setRequiresCard(Boolean value) {
        this.requiresCard = value;
    }

    /**
     * Ruft den Wert der requiresBookingReference-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isRequiresBookingReference() {
        return requiresBookingReference;
    }

    /**
     * Legt den Wert der requiresBookingReference-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setRequiresBookingReference(Boolean value) {
        this.requiresBookingReference = value;
    }

    /**
     * Ruft den Wert der typesOfTravelDocument-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link TypeOfTravelDocumentRefsRelStructure }
     *     
     */
    public TypeOfTravelDocumentRefsRelStructure getTypesOfTravelDocument() {
        return typesOfTravelDocument;
    }

    /**
     * Legt den Wert der typesOfTravelDocument-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeOfTravelDocumentRefsRelStructure }
     *     
     */
    public void setTypesOfTravelDocument(TypeOfTravelDocumentRefsRelStructure value) {
        this.typesOfTravelDocument = value;
    }

    /**
     * Ruft den Wert der prices-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FulfilmentMethodPricesRelStructure }
     *     
     */
    public FulfilmentMethodPricesRelStructure getPrices() {
        return prices;
    }

    /**
     * Legt den Wert der prices-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FulfilmentMethodPricesRelStructure }
     *     
     */
    public void setPrices(FulfilmentMethodPricesRelStructure value) {
        this.prices = value;
    }

}
