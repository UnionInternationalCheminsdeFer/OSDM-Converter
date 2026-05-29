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
 * Type for EQUIPMENT.
 * 
 * <p>Java-Klasse f�r Equipment_VersionStructure complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="Equipment_VersionStructure">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.netex.org.uk/netex}DataManagedObjectStructure">
 *       &lt;sequence>
 *         &lt;group ref="{http://www.netex.org.uk/netex}EquipmentGroup"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Equipment_VersionStructure", propOrder = {
    "name",
    "privateCode",
    "publicCode",
    "image",
    "typeOfEquipmentRef",
    "description",
    "note",
    "infoLinks",
    "outOfService",
    "monitored"
})
@XmlSeeAlso({
    MobilityServiceVersionStructure.class,
    LocalServiceVersionStructure.class,
    InstalledEquipmentVersionStructure.class,
    ActivatedEquipmentVersionStructure.class
})
public abstract class EquipmentVersionStructure
    extends DataManagedObjectStructure
{

    @XmlElement(name = "Name")
    protected MultilingualString name;
    @XmlElement(name = "PrivateCode")
    protected PrivateCodeStructure privateCode;
    @XmlElement(name = "PublicCode")
    protected PublicCodeStructure publicCode;
    @XmlElement(name = "Image")
    @XmlSchemaType(name = "anyURI")
    protected String image;
    @XmlElement(name = "TypeOfEquipmentRef")
    protected TypeOfEquipmentRefStructure typeOfEquipmentRef;
    @XmlElement(name = "Description")
    protected MultilingualString description;
    @XmlElement(name = "Note", defaultValue = "false.")
    protected MultilingualString note;
    protected InfoLinksRelStructure infoLinks;
    @XmlElement(name = "OutOfService")
    protected Boolean outOfService;
    @XmlElement(name = "Monitored")
    protected Boolean monitored;

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
     * Ruft den Wert der publicCode-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link PublicCodeStructure }
     *     
     */
    public PublicCodeStructure getPublicCode() {
        return publicCode;
    }

    /**
     * Legt den Wert der publicCode-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link PublicCodeStructure }
     *     
     */
    public void setPublicCode(PublicCodeStructure value) {
        this.publicCode = value;
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
     * Ruft den Wert der typeOfEquipmentRef-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link TypeOfEquipmentRefStructure }
     *     
     */
    public TypeOfEquipmentRefStructure getTypeOfEquipmentRef() {
        return typeOfEquipmentRef;
    }

    /**
     * Legt den Wert der typeOfEquipmentRef-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeOfEquipmentRefStructure }
     *     
     */
    public void setTypeOfEquipmentRef(TypeOfEquipmentRefStructure value) {
        this.typeOfEquipmentRef = value;
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
     * Ruft den Wert der note-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link MultilingualString }
     *     
     */
    public MultilingualString getNote() {
        return note;
    }

    /**
     * Legt den Wert der note-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link MultilingualString }
     *     
     */
    public void setNote(MultilingualString value) {
        this.note = value;
    }

    /**
     * Ruft den Wert der infoLinks-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link InfoLinksRelStructure }
     *     
     */
    public InfoLinksRelStructure getInfoLinks() {
        return infoLinks;
    }

    /**
     * Legt den Wert der infoLinks-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link InfoLinksRelStructure }
     *     
     */
    public void setInfoLinks(InfoLinksRelStructure value) {
        this.infoLinks = value;
    }

    /**
     * Ruft den Wert der outOfService-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isOutOfService() {
        return outOfService;
    }

    /**
     * Legt den Wert der outOfService-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setOutOfService(Boolean value) {
        this.outOfService = value;
    }

    /**
     * Ruft den Wert der monitored-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMonitored() {
        return monitored;
    }

    /**
     * Legt den Wert der monitored-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMonitored(Boolean value) {
        this.monitored = value;
    }

}
