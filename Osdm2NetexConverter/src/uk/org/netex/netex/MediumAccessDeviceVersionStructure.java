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
import jakarta.xml.bind.annotation.adapters.NormalizedStringAdapter;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * Type for MEDIUM ACCESS DEVICE restricts id.
 * 
 * <p>Java-Klasse f�r MediumAccessDevice_VersionStructure complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="MediumAccessDevice_VersionStructure">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.netex.org.uk/netex}DataManagedObjectStructure">
 *       &lt;sequence>
 *         &lt;group ref="{http://www.netex.org.uk/netex}MediumAccessDeviceGroup"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MediumAccessDevice_VersionStructure", propOrder = {
    "name",
    "customerRef",
    "identityToken",
    "typeOfMediumAccessDeviceRef",
    "applicationInstances"
})
@XmlSeeAlso({
    MediumAccessDevice.class,
    EmvCardVersionStructure.class,
    SmartcardVersionStructure.class,
    MobileDeviceVersionStructure.class
})
public class MediumAccessDeviceVersionStructure
    extends DataManagedObjectStructure
{

    @XmlElement(name = "Name")
    protected MultilingualString name;
    @XmlElement(name = "CustomerRef")
    protected CustomerRefStructure customerRef;
    @XmlElement(name = "IdentityToken")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String identityToken;
    @XmlElement(name = "TypeOfMediumAccessDeviceRef")
    protected TypeOfMediumAccessDeviceRefStructure typeOfMediumAccessDeviceRef;
    protected MediumApplicationInstanceRelStructure applicationInstances;

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
     * Ruft den Wert der customerRef-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link CustomerRefStructure }
     *     
     */
    public CustomerRefStructure getCustomerRef() {
        return customerRef;
    }

    /**
     * Legt den Wert der customerRef-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomerRefStructure }
     *     
     */
    public void setCustomerRef(CustomerRefStructure value) {
        this.customerRef = value;
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
     * Ruft den Wert der typeOfMediumAccessDeviceRef-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link TypeOfMediumAccessDeviceRefStructure }
     *     
     */
    public TypeOfMediumAccessDeviceRefStructure getTypeOfMediumAccessDeviceRef() {
        return typeOfMediumAccessDeviceRef;
    }

    /**
     * Legt den Wert der typeOfMediumAccessDeviceRef-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeOfMediumAccessDeviceRefStructure }
     *     
     */
    public void setTypeOfMediumAccessDeviceRef(TypeOfMediumAccessDeviceRefStructure value) {
        this.typeOfMediumAccessDeviceRef = value;
    }

    /**
     * Ruft den Wert der applicationInstances-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link MediumApplicationInstanceRelStructure }
     *     
     */
    public MediumApplicationInstanceRelStructure getApplicationInstances() {
        return applicationInstances;
    }

    /**
     * Legt den Wert der applicationInstances-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link MediumApplicationInstanceRelStructure }
     *     
     */
    public void setApplicationInstances(MediumApplicationInstanceRelStructure value) {
        this.applicationInstances = value;
    }

}
