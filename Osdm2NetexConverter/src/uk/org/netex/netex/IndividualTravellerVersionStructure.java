//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// �nderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2026.05.22 um 10:24:00 AM CEST 
//


package uk.org.netex.netex;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlList;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Type for INDIVIDUAL TRAVELLER.
 * 
 * <p>Java-Klasse f�r IndividualTraveller_VersionStructure complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="IndividualTraveller_VersionStructure">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.netex.org.uk/netex}DataManagedObjectStructure">
 *       &lt;sequence>
 *         &lt;group ref="{http://www.netex.org.uk/netex}IndividualTravellerGroup"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "IndividualTraveller_VersionStructure", propOrder = {
    "name",
    "customerRef",
    "identityVerified",
    "ranking",
    "gender",
    "talkative",
    "smoker",
    "languages",
    "vehiclePoolingDriverInfos",
    "individualPassengerInfos"
})
@XmlSeeAlso({
    IndividualTraveller.class
})
public class IndividualTravellerVersionStructure
    extends DataManagedObjectStructure
{

    @XmlElement(name = "Name")
    protected MultilingualString name;
    @XmlElement(name = "CustomerRef")
    protected CustomerRefStructure customerRef;
    @XmlElement(name = "IdentityVerified")
    protected Boolean identityVerified;
    @XmlElement(name = "Ranking")
    protected BigDecimal ranking;
    @XmlElement(name = "Gender")
    @XmlSchemaType(name = "string")
    protected GenderEnumeration gender;
    @XmlElement(name = "Talkative")
    protected Boolean talkative;
    @XmlElement(name = "Smoker")
    protected Boolean smoker;
    @XmlList
    @XmlElement(name = "Languages")
    protected List<String> languages;
    protected VehiclePoolingDriverInfosRelStructure vehiclePoolingDriverInfos;
    protected IndividualPassengerInfosRelStructure individualPassengerInfos;

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
     * Ruft den Wert der identityVerified-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIdentityVerified() {
        return identityVerified;
    }

    /**
     * Legt den Wert der identityVerified-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIdentityVerified(Boolean value) {
        this.identityVerified = value;
    }

    /**
     * Ruft den Wert der ranking-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getRanking() {
        return ranking;
    }

    /**
     * Legt den Wert der ranking-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setRanking(BigDecimal value) {
        this.ranking = value;
    }

    /**
     * Ruft den Wert der gender-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link GenderEnumeration }
     *     
     */
    public GenderEnumeration getGender() {
        return gender;
    }

    /**
     * Legt den Wert der gender-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link GenderEnumeration }
     *     
     */
    public void setGender(GenderEnumeration value) {
        this.gender = value;
    }

    /**
     * Ruft den Wert der talkative-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isTalkative() {
        return talkative;
    }

    /**
     * Legt den Wert der talkative-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setTalkative(Boolean value) {
        this.talkative = value;
    }

    /**
     * Ruft den Wert der smoker-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSmoker() {
        return smoker;
    }

    /**
     * Legt den Wert der smoker-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSmoker(Boolean value) {
        this.smoker = value;
    }

    /**
     * Gets the value of the languages property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the languages property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLanguages().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getLanguages() {
        if (languages == null) {
            languages = new ArrayList<String>();
        }
        return this.languages;
    }

    /**
     * Ruft den Wert der vehiclePoolingDriverInfos-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link VehiclePoolingDriverInfosRelStructure }
     *     
     */
    public VehiclePoolingDriverInfosRelStructure getVehiclePoolingDriverInfos() {
        return vehiclePoolingDriverInfos;
    }

    /**
     * Legt den Wert der vehiclePoolingDriverInfos-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link VehiclePoolingDriverInfosRelStructure }
     *     
     */
    public void setVehiclePoolingDriverInfos(VehiclePoolingDriverInfosRelStructure value) {
        this.vehiclePoolingDriverInfos = value;
    }

    /**
     * Ruft den Wert der individualPassengerInfos-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link IndividualPassengerInfosRelStructure }
     *     
     */
    public IndividualPassengerInfosRelStructure getIndividualPassengerInfos() {
        return individualPassengerInfos;
    }

    /**
     * Legt den Wert der individualPassengerInfos-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link IndividualPassengerInfosRelStructure }
     *     
     */
    public void setIndividualPassengerInfos(IndividualPassengerInfosRelStructure value) {
        this.individualPassengerInfos = value;
    }

}
