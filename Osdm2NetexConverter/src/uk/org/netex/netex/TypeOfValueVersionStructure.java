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
 * Type for a TYPE OF VALUE. Abstract supertype used to define open classifications of value types.
 * 
 * <p>Java-Klasse f�r TypeOfValue_VersionStructure complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="TypeOfValue_VersionStructure">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.netex.org.uk/netex}DataManagedObjectStructure">
 *       &lt;sequence>
 *         &lt;group ref="{http://www.netex.org.uk/netex}TypeOfValueGroup"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TypeOfValue_VersionStructure", propOrder = {
    "name",
    "shortName",
    "description",
    "image",
    "url",
    "privateCode"
})
@XmlSeeAlso({
    PurposeOfGroupingValueStructure.class,
    TypeOfValidityValueStructure.class,
    TypeOfVersionValueStructure.class,
    TypeOfMachineReadabilityVersionStructure.class,
    ParkingBayStatusValueStructure.class,
    TypeOfMediumAccessDeviceValueStructure.class,
    DistributionChannelVersionStructure.class,
    TypeOfWheelchairValueStructure.class,
    TypeOfFareTableVersionStructure.class,
    TypeOfPricingRuleVersionStructure.class,
    PointOfInterestClassificationVersionStructure.class,
    TypeOfConcessionVersionStructure.class,
    TypeOfUsageParameterVersionStructure.class,
    OpenTransportModeValueStructure.class,
    DataSourceVersionStructure.class,
    TypeOfDeckSpaceValueStructure.class,
    TypeOfPaymentMethodValueStructure.class,
    PurposeOfEquipmentProfileValueStructure.class,
    TypeOfParkingValueStructure.class,
    TypeOfCodespaceAssignmentValueStructure.class,
    TypeOfDeckEntranceUsageValueStructure.class,
    TypeOfLocatableSpotValueStructure.class,
    BrandingVersionStructure.class,
    TypeOfFleetValueStructure.class,
    ChargingMomentValueStructure.class,
    ClassOfUseValueStructure.class,
    DirectionValueStructure.class,
    TimingAlgorithmTypeValueStructure.class,
    ModeOfOperationValueStructure.class,
    PriceUnitVersionStructure.class,
    TypeOfDeckEntranceValueStructure.class,
    TypeOfProofValueStructure.class,
    TypeOfDriverPermitValueStructure.class,
    PurposeOfJourneyPartitionValueStructure.class,
    ClassificationDescriptorVersionStructure.class,
    TypeOfEntityVersionStructure.class
})
public abstract class TypeOfValueVersionStructure
    extends DataManagedObjectStructure
{

    @XmlElement(name = "Name")
    protected MultilingualString name;
    @XmlElement(name = "ShortName")
    protected MultilingualString shortName;
    @XmlElement(name = "Description")
    protected MultilingualString description;
    @XmlElement(name = "Image")
    @XmlSchemaType(name = "anyURI")
    protected String image;
    @XmlElement(name = "Url")
    @XmlSchemaType(name = "anyURI")
    protected String url;
    @XmlElement(name = "PrivateCode")
    protected PrivateCodeStructure privateCode;

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
     * Ruft den Wert der shortName-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link MultilingualString }
     *     
     */
    public MultilingualString getShortName() {
        return shortName;
    }

    /**
     * Legt den Wert der shortName-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link MultilingualString }
     *     
     */
    public void setShortName(MultilingualString value) {
        this.shortName = value;
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
     * Ruft den Wert der image-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getImage() {
        return image;
    }

    /**
     * Legt den Wert der image-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setImage(String value) {
        this.image = value;
    }

    /**
     * Ruft den Wert der url-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUrl() {
        return url;
    }

    /**
     * Legt den Wert der url-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUrl(String value) {
        this.url = value;
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

}
