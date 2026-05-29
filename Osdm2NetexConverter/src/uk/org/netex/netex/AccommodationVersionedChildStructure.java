//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// �nderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2026.05.22 um 10:24:00 AM CEST 
//


package uk.org.netex.netex;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlElementRef;
import jakarta.xml.bind.annotation.XmlList;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Type for allowed combinations of ACCOMMODATION.
 * 
 * <p>Java-Klasse f�r Accommodation_VersionedChildStructure complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="Accommodation_VersionedChildStructure">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.netex.org.uk/netex}VersionedChildStructure">
 *       &lt;sequence>
 *         &lt;group ref="{http://www.netex.org.uk/netex}AccommodationGroup"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Accommodation_VersionedChildStructure", propOrder = {
    "name",
    "serviceFacilitySetRef",
    "fareClass",
    "classOfUseRef",
    "accommodationFacility",
    "couchetteFacility",
    "maximumNumberOfBerths",
    "berthFacility",
    "showerFacility",
    "toiletFacility",
    "genderLimitation",
    "nuisanceFacilityList",
    "passengerCommsFacilityList"
})
@XmlSeeAlso({
    Accommodation.class
})
public class AccommodationVersionedChildStructure
    extends VersionedChildStructure
{

    @XmlElement(name = "Name")
    protected MultilingualString name;
    @XmlElementRef(name = "ServiceFacilitySetRef", namespace = "http://www.netex.org.uk/netex", type = JAXBElement.class, required = false)
    protected JAXBElement<? extends ServiceFacilitySetRefStructure> serviceFacilitySetRef;
    @XmlElement(name = "FareClass", defaultValue = "unknown")
    @XmlSchemaType(name = "NMTOKEN")
    protected FareClassEnumeration fareClass;
    @XmlElement(name = "ClassOfUseRef")
    protected ClassOfUseRef classOfUseRef;
    @XmlElement(name = "AccommodationFacility", defaultValue = "seating")
    @XmlSchemaType(name = "NMTOKEN")
    protected AccommodationFacilityEnumeration accommodationFacility;
    @XmlElement(name = "CouchetteFacility", defaultValue = "unknown")
    @XmlSchemaType(name = "NMTOKEN")
    protected CouchetteFacilityEnumeration couchetteFacility;
    @XmlElement(name = "MaximumNumberOfBerths")
    protected BigInteger maximumNumberOfBerths;
    @XmlElement(name = "BerthFacility")
    @XmlSchemaType(name = "NMTOKEN")
    protected BerthFacilityEnumeration berthFacility;
    @XmlElement(name = "ShowerFacility", defaultValue = "none")
    @XmlSchemaType(name = "string")
    protected SanitaryFacilityEnumeration showerFacility;
    @XmlElement(name = "ToiletFacility", defaultValue = "none")
    @XmlSchemaType(name = "string")
    protected SanitaryFacilityEnumeration toiletFacility;
    @XmlElement(name = "GenderLimitation")
    @XmlSchemaType(name = "normalizedString")
    protected GenderLimitationEnumeration genderLimitation;
    @XmlList
    @XmlElement(name = "NuisanceFacilityList")
    protected List<NuisanceFacilityEnumeration> nuisanceFacilityList;
    @XmlList
    @XmlElement(name = "PassengerCommsFacilityList")
    protected List<PassengerCommsFacilityEnumeration> passengerCommsFacilityList;

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
     * Ruft den Wert der serviceFacilitySetRef-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link RestrictedServiceFacilitySetRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link ServiceFacilitySetRefStructure }{@code >}
     *     
     */
    public JAXBElement<? extends ServiceFacilitySetRefStructure> getServiceFacilitySetRef() {
        return serviceFacilitySetRef;
    }

    /**
     * Legt den Wert der serviceFacilitySetRef-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link RestrictedServiceFacilitySetRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link ServiceFacilitySetRefStructure }{@code >}
     *     
     */
    public void setServiceFacilitySetRef(JAXBElement<? extends ServiceFacilitySetRefStructure> value) {
        this.serviceFacilitySetRef = value;
    }

    /**
     * Fare class of ACCOMMODATION.
     * 
     * @return
     *     possible object is
     *     {@link FareClassEnumeration }
     *     
     */
    public FareClassEnumeration getFareClass() {
        return fareClass;
    }

    /**
     * Legt den Wert der fareClass-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FareClassEnumeration }
     *     
     */
    public void setFareClass(FareClassEnumeration value) {
        this.fareClass = value;
    }

    /**
     * Ruft den Wert der classOfUseRef-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ClassOfUseRef }
     *     
     */
    public ClassOfUseRef getClassOfUseRef() {
        return classOfUseRef;
    }

    /**
     * Legt den Wert der classOfUseRef-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ClassOfUseRef }
     *     
     */
    public void setClassOfUseRef(ClassOfUseRef value) {
        this.classOfUseRef = value;
    }

    /**
     * Type of ACCOMMODATION. . Default is seating.
     * 
     * @return
     *     possible object is
     *     {@link AccommodationFacilityEnumeration }
     *     
     */
    public AccommodationFacilityEnumeration getAccommodationFacility() {
        return accommodationFacility;
    }

    /**
     * Legt den Wert der accommodationFacility-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link AccommodationFacilityEnumeration }
     *     
     */
    public void setAccommodationFacility(AccommodationFacilityEnumeration value) {
        this.accommodationFacility = value;
    }

    /**
     * Type of Couchette.
     * 
     * @return
     *     possible object is
     *     {@link CouchetteFacilityEnumeration }
     *     
     */
    public CouchetteFacilityEnumeration getCouchetteFacility() {
        return couchetteFacility;
    }

    /**
     * Legt den Wert der couchetteFacility-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link CouchetteFacilityEnumeration }
     *     
     */
    public void setCouchetteFacility(CouchetteFacilityEnumeration value) {
        this.couchetteFacility = value;
    }

    /**
     * Ruft den Wert der maximumNumberOfBerths-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getMaximumNumberOfBerths() {
        return maximumNumberOfBerths;
    }

    /**
     * Legt den Wert der maximumNumberOfBerths-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setMaximumNumberOfBerths(BigInteger value) {
        this.maximumNumberOfBerths = value;
    }

    /**
     * Classification of BERTH FACILITY.
     * 
     * @return
     *     possible object is
     *     {@link BerthFacilityEnumeration }
     *     
     */
    public BerthFacilityEnumeration getBerthFacility() {
        return berthFacility;
    }

    /**
     * Legt den Wert der berthFacility-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BerthFacilityEnumeration }
     *     
     */
    public void setBerthFacility(BerthFacilityEnumeration value) {
        this.berthFacility = value;
    }

    /**
     * Ruft den Wert der showerFacility-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link SanitaryFacilityEnumeration }
     *     
     */
    public SanitaryFacilityEnumeration getShowerFacility() {
        return showerFacility;
    }

    /**
     * Legt den Wert der showerFacility-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link SanitaryFacilityEnumeration }
     *     
     */
    public void setShowerFacility(SanitaryFacilityEnumeration value) {
        this.showerFacility = value;
    }

    /**
     * Ruft den Wert der toiletFacility-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link SanitaryFacilityEnumeration }
     *     
     */
    public SanitaryFacilityEnumeration getToiletFacility() {
        return toiletFacility;
    }

    /**
     * Legt den Wert der toiletFacility-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link SanitaryFacilityEnumeration }
     *     
     */
    public void setToiletFacility(SanitaryFacilityEnumeration value) {
        this.toiletFacility = value;
    }

    /**
     * Ruft den Wert der genderLimitation-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link GenderLimitationEnumeration }
     *     
     */
    public GenderLimitationEnumeration getGenderLimitation() {
        return genderLimitation;
    }

    /**
     * Legt den Wert der genderLimitation-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link GenderLimitationEnumeration }
     *     
     */
    public void setGenderLimitation(GenderLimitationEnumeration value) {
        this.genderLimitation = value;
    }

    /**
     * Gets the value of the nuisanceFacilityList property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the nuisanceFacilityList property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNuisanceFacilityList().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link NuisanceFacilityEnumeration }
     * 
     * 
     */
    public List<NuisanceFacilityEnumeration> getNuisanceFacilityList() {
        if (nuisanceFacilityList == null) {
            nuisanceFacilityList = new ArrayList<NuisanceFacilityEnumeration>();
        }
        return this.nuisanceFacilityList;
    }

    /**
     * Gets the value of the passengerCommsFacilityList property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the passengerCommsFacilityList property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPassengerCommsFacilityList().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PassengerCommsFacilityEnumeration }
     * 
     * 
     */
    public List<PassengerCommsFacilityEnumeration> getPassengerCommsFacilityList() {
        if (passengerCommsFacilityList == null) {
            passengerCommsFacilityList = new ArrayList<PassengerCommsFacilityEnumeration>();
        }
        return this.passengerCommsFacilityList;
    }

}
