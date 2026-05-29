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
 * Type for TRAVEL DOCUMENT.
 * 
 * <p>Java-Klasse f�r TravelDocument_VersionStructure complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="TravelDocument_VersionStructure">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.netex.org.uk/netex}DataManagedObjectStructure">
 *       &lt;sequence>
 *         &lt;group ref="{http://www.netex.org.uk/netex}TravelDocumentGroup"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TravelDocument_VersionStructure", propOrder = {
    "name",
    "description",
    "privateCode",
    "typeOfTravelDocumentRef",
    "customerPurchasePackageRef",
    "markedAs"
})
@XmlSeeAlso({
    TravelDocument.class,
    ServiceAccessCodeVersionStructure.class
})
public class TravelDocumentVersionStructure
    extends DataManagedObjectStructure
{

    @XmlElement(name = "Name")
    protected MultilingualString name;
    @XmlElement(name = "Description")
    protected MultilingualString description;
    @XmlElement(name = "PrivateCode")
    protected PrivateCodeStructure privateCode;
    @XmlElement(name = "TypeOfTravelDocumentRef")
    protected TypeOfTravelDocumentRefStructure typeOfTravelDocumentRef;
    @XmlElement(name = "CustomerPurchasePackageRef")
    protected CustomerPurchasePackageRefStructure customerPurchasePackageRef;
    @XmlElement(name = "MarkedAs")
    @XmlSchemaType(name = "normalizedString")
    protected MarkedAsEnumeration markedAs;

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
     * Ruft den Wert der typeOfTravelDocumentRef-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link TypeOfTravelDocumentRefStructure }
     *     
     */
    public TypeOfTravelDocumentRefStructure getTypeOfTravelDocumentRef() {
        return typeOfTravelDocumentRef;
    }

    /**
     * Legt den Wert der typeOfTravelDocumentRef-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeOfTravelDocumentRefStructure }
     *     
     */
    public void setTypeOfTravelDocumentRef(TypeOfTravelDocumentRefStructure value) {
        this.typeOfTravelDocumentRef = value;
    }

    /**
     * Ruft den Wert der customerPurchasePackageRef-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link CustomerPurchasePackageRefStructure }
     *     
     */
    public CustomerPurchasePackageRefStructure getCustomerPurchasePackageRef() {
        return customerPurchasePackageRef;
    }

    /**
     * Legt den Wert der customerPurchasePackageRef-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomerPurchasePackageRefStructure }
     *     
     */
    public void setCustomerPurchasePackageRef(CustomerPurchasePackageRefStructure value) {
        this.customerPurchasePackageRef = value;
    }

    /**
     * Ruft den Wert der markedAs-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link MarkedAsEnumeration }
     *     
     */
    public MarkedAsEnumeration getMarkedAs() {
        return markedAs;
    }

    /**
     * Legt den Wert der markedAs-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link MarkedAsEnumeration }
     *     
     */
    public void setMarkedAs(MarkedAsEnumeration value) {
        this.markedAs = value;
    }

}
