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
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * Type for CUSTOMER PAYMENT MEANS restricts id.
 * 
 * <p>Java-Klasse f�r CustomerPaymentMeans_VersionedChildStructure complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="CustomerPaymentMeans_VersionedChildStructure">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.netex.org.uk/netex}VersionedChildStructure">
 *       &lt;sequence>
 *         &lt;group ref="{http://www.netex.org.uk/netex}CustomerPaymentMeansGroup"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CustomerPaymentMeans_VersionedChildStructure", propOrder = {
    "name",
    "customerAccountRef",
    "mediumAccessDeviceRef",
    "paymentMethod",
    "typeOfPaymentMethodRef",
    "lastVerifiedDate"
})
@XmlSeeAlso({
    CustomerPaymentMeans.class
})
public class CustomerPaymentMeansVersionedChildStructure
    extends VersionedChildStructure
{

    @XmlElement(name = "Name")
    protected MultilingualString name;
    @XmlElement(name = "CustomerAccountRef")
    protected CustomerAccountRefStructure customerAccountRef;
    @XmlElementRef(name = "MediumAccessDeviceRef", namespace = "http://www.netex.org.uk/netex", type = JAXBElement.class, required = false)
    protected JAXBElement<? extends MediumAccessDeviceRefStructure> mediumAccessDeviceRef;
    @XmlElement(name = "PaymentMethod")
    @XmlSchemaType(name = "normalizedString")
    protected PaymentMethodEnumeration paymentMethod;
    @XmlElement(name = "TypeOfPaymentMethodRef")
    protected TypeOfPaymentMethodRef typeOfPaymentMethodRef;
    @XmlElement(name = "LastVerifiedDate")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar lastVerifiedDate;

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
     * Ruft den Wert der paymentMethod-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link PaymentMethodEnumeration }
     *     
     */
    public PaymentMethodEnumeration getPaymentMethod() {
        return paymentMethod;
    }

    /**
     * Legt den Wert der paymentMethod-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link PaymentMethodEnumeration }
     *     
     */
    public void setPaymentMethod(PaymentMethodEnumeration value) {
        this.paymentMethod = value;
    }

    /**
     * Ruft den Wert der typeOfPaymentMethodRef-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link TypeOfPaymentMethodRef }
     *     
     */
    public TypeOfPaymentMethodRef getTypeOfPaymentMethodRef() {
        return typeOfPaymentMethodRef;
    }

    /**
     * Legt den Wert der typeOfPaymentMethodRef-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeOfPaymentMethodRef }
     *     
     */
    public void setTypeOfPaymentMethodRef(TypeOfPaymentMethodRef value) {
        this.typeOfPaymentMethodRef = value;
    }

    /**
     * Ruft den Wert der lastVerifiedDate-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getLastVerifiedDate() {
        return lastVerifiedDate;
    }

    /**
     * Legt den Wert der lastVerifiedDate-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setLastVerifiedDate(XMLGregorianCalendar value) {
        this.lastVerifiedDate = value;
    }

}
