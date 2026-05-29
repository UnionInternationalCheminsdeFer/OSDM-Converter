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
 * Type for a POSTAL ADDRESS.
 * 
 * <p>Java-Klasse f�r PostalAddress_VersionStructure complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="PostalAddress_VersionStructure">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.netex.org.uk/netex}Address_VersionStructure">
 *       &lt;sequence>
 *         &lt;group ref="{http://www.netex.org.uk/netex}PostalAddressGroup"/>
 *         &lt;element name="RoadAddressRef" type="{http://www.netex.org.uk/netex}AddressRefStructure" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PostalAddress_VersionStructure", propOrder = {
    "houseNumber",
    "buildingName",
    "addressLine1",
    "addressLine2",
    "street",
    "town",
    "suburb",
    "postCode",
    "postCodeExtension",
    "postalRegion",
    "province",
    "roadAddressRef"
})
@XmlSeeAlso({
    PostalAddress.class
})
public class PostalAddressVersionStructure
    extends AddressVersionStructure
{

    @XmlElement(name = "HouseNumber")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String houseNumber;
    @XmlElement(name = "BuildingName")
    protected MultilingualString buildingName;
    @XmlElement(name = "AddressLine1")
    protected MultilingualString addressLine1;
    @XmlElement(name = "AddressLine2")
    protected MultilingualString addressLine2;
    @XmlElement(name = "Street")
    protected MultilingualString street;
    @XmlElement(name = "Town")
    protected MultilingualString town;
    @XmlElement(name = "Suburb")
    protected MultilingualString suburb;
    @XmlElement(name = "PostCode")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String postCode;
    @XmlElement(name = "PostCodeExtension")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String postCodeExtension;
    @XmlElement(name = "PostalRegion")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String postalRegion;
    @XmlElement(name = "Province")
    protected MultilingualString province;
    @XmlElement(name = "RoadAddressRef")
    protected AddressRefStructure roadAddressRef;

    /**
     * Ruft den Wert der houseNumber-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHouseNumber() {
        return houseNumber;
    }

    /**
     * Legt den Wert der houseNumber-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHouseNumber(String value) {
        this.houseNumber = value;
    }

    /**
     * Ruft den Wert der buildingName-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link MultilingualString }
     *     
     */
    public MultilingualString getBuildingName() {
        return buildingName;
    }

    /**
     * Legt den Wert der buildingName-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link MultilingualString }
     *     
     */
    public void setBuildingName(MultilingualString value) {
        this.buildingName = value;
    }

    /**
     * Ruft den Wert der addressLine1-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link MultilingualString }
     *     
     */
    public MultilingualString getAddressLine1() {
        return addressLine1;
    }

    /**
     * Legt den Wert der addressLine1-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link MultilingualString }
     *     
     */
    public void setAddressLine1(MultilingualString value) {
        this.addressLine1 = value;
    }

    /**
     * Ruft den Wert der addressLine2-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link MultilingualString }
     *     
     */
    public MultilingualString getAddressLine2() {
        return addressLine2;
    }

    /**
     * Legt den Wert der addressLine2-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link MultilingualString }
     *     
     */
    public void setAddressLine2(MultilingualString value) {
        this.addressLine2 = value;
    }

    /**
     * Ruft den Wert der street-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link MultilingualString }
     *     
     */
    public MultilingualString getStreet() {
        return street;
    }

    /**
     * Legt den Wert der street-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link MultilingualString }
     *     
     */
    public void setStreet(MultilingualString value) {
        this.street = value;
    }

    /**
     * Ruft den Wert der town-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link MultilingualString }
     *     
     */
    public MultilingualString getTown() {
        return town;
    }

    /**
     * Legt den Wert der town-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link MultilingualString }
     *     
     */
    public void setTown(MultilingualString value) {
        this.town = value;
    }

    /**
     * Ruft den Wert der suburb-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link MultilingualString }
     *     
     */
    public MultilingualString getSuburb() {
        return suburb;
    }

    /**
     * Legt den Wert der suburb-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link MultilingualString }
     *     
     */
    public void setSuburb(MultilingualString value) {
        this.suburb = value;
    }

    /**
     * Ruft den Wert der postCode-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPostCode() {
        return postCode;
    }

    /**
     * Legt den Wert der postCode-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPostCode(String value) {
        this.postCode = value;
    }

    /**
     * Ruft den Wert der postCodeExtension-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPostCodeExtension() {
        return postCodeExtension;
    }

    /**
     * Legt den Wert der postCodeExtension-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPostCodeExtension(String value) {
        this.postCodeExtension = value;
    }

    /**
     * Ruft den Wert der postalRegion-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPostalRegion() {
        return postalRegion;
    }

    /**
     * Legt den Wert der postalRegion-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPostalRegion(String value) {
        this.postalRegion = value;
    }

    /**
     * Ruft den Wert der province-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link MultilingualString }
     *     
     */
    public MultilingualString getProvince() {
        return province;
    }

    /**
     * Legt den Wert der province-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link MultilingualString }
     *     
     */
    public void setProvince(MultilingualString value) {
        this.province = value;
    }

    /**
     * Ruft den Wert der roadAddressRef-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link AddressRefStructure }
     *     
     */
    public AddressRefStructure getRoadAddressRef() {
        return roadAddressRef;
    }

    /**
     * Legt den Wert der roadAddressRef-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link AddressRefStructure }
     *     
     */
    public void setRoadAddressRef(AddressRefStructure value) {
        this.roadAddressRef = value;
    }

}
