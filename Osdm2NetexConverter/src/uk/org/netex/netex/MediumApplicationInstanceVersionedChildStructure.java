//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// �nderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2026.05.22 um 10:24:00 AM CEST 
//


package uk.org.netex.netex;

import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlElementRef;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.NormalizedStringAdapter;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * Type for MEDIUM APPLICATION INSTANCE restricts id.
 * 
 * <p>Java-Klasse f�r MediumApplicationInstance_VersionedChildStructure complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="MediumApplicationInstance_VersionedChildStructure">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.netex.org.uk/netex}VersionedChildStructure">
 *       &lt;sequence>
 *         &lt;group ref="{http://www.netex.org.uk/netex}MediumApplicationInstanceGroup"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MediumApplicationInstance_VersionedChildStructure", propOrder = {
    "name",
    "identityToken",
    "mediumAccessDeviceRef",
    "customerAccountRef",
    "typeOfTravelDocumentRef",
    "travelDocumentRef"
})
@XmlSeeAlso({
    MediumApplicationInstance.class
})
public class MediumApplicationInstanceVersionedChildStructure
    extends VersionedChildStructure
{

    @XmlElement(name = "Name")
    protected MultilingualString name;
    @XmlElement(name = "IdentityToken")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String identityToken;
    @XmlElementRef(name = "MediumAccessDeviceRef", namespace = "http://www.netex.org.uk/netex", type = JAXBElement.class, required = false)
    protected JAXBElement<? extends MediumAccessDeviceRefStructure> mediumAccessDeviceRef;
    @XmlElement(name = "CustomerAccountRef")
    protected CustomerAccountRefStructure customerAccountRef;
    @XmlElement(name = "TypeOfTravelDocumentRef")
    protected TypeOfTravelDocumentRefStructure typeOfTravelDocumentRef;
    @XmlElementRef(name = "TravelDocumentRef", namespace = "http://www.netex.org.uk/netex", type = JAXBElement.class, required = false)
    protected JAXBElement<? extends TravelDocumentRefStructure> travelDocumentRef;

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
     * Ruft den Wert der identityToken-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdentityToken() {
        return identityToken;
    }

    /**
     * Legt den Wert der identityToken-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdentityToken(String value) {
        this.identityToken = value;
    }

    /**
     * Ruft den Wert der mediumAccessDeviceRef-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MobileDeviceRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link SmartcardRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link EmvCardRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link MediumAccessDeviceRefStructure }{@code >}
     *     
     */
    public JAXBElement<? extends MediumAccessDeviceRefStructure> getMediumAccessDeviceRef() {
        return mediumAccessDeviceRef;
    }

    /**
     * Legt den Wert der mediumAccessDeviceRef-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MobileDeviceRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link SmartcardRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link EmvCardRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link MediumAccessDeviceRefStructure }{@code >}
     *     
     */
    public void setMediumAccessDeviceRef(JAXBElement<? extends MediumAccessDeviceRefStructure> value) {
        this.mediumAccessDeviceRef = value;
    }

    /**
     * Ruft den Wert der customerAccountRef-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link CustomerAccountRefStructure }
     *     
     */
    public CustomerAccountRefStructure getCustomerAccountRef() {
        return customerAccountRef;
    }

    /**
     * Legt den Wert der customerAccountRef-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomerAccountRefStructure }
     *     
     */
    public void setCustomerAccountRef(CustomerAccountRefStructure value) {
        this.customerAccountRef = value;
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
     * Ruft den Wert der travelDocumentRef-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ServiceAccessCodeRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link TravelDocumentRefStructure }{@code >}
     *     
     */
    public JAXBElement<? extends TravelDocumentRefStructure> getTravelDocumentRef() {
        return travelDocumentRef;
    }

    /**
     * Legt den Wert der travelDocumentRef-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ServiceAccessCodeRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link TravelDocumentRefStructure }{@code >}
     *     
     */
    public void setTravelDocumentRef(JAXBElement<? extends TravelDocumentRefStructure> value) {
        this.travelDocumentRef = value;
    }

}
