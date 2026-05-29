//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// �nderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2026.05.22 um 10:24:00 AM CEST 
//


package uk.org.netex.netex;

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
 * Type for TYPE OF TRAVEL DOCUMENT.
 * 
 * <p>Java-Klasse f�r TypeOfTravelDocument_VersionStructure complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="TypeOfTravelDocument_VersionStructure">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.netex.org.uk/netex}TypeOfEntity_VersionStructure">
 *       &lt;group ref="{http://www.netex.org.uk/netex}TypeOfTravelDocumentGroup"/>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TypeOfTravelDocument_VersionStructure", propOrder = {
    "isCard",
    "isSmartCard",
    "hasPhoto",
    "mediaType",
    "machineReadable",
    "typesOfMachineReadabilities",
    "alternativeNames"
})
@XmlSeeAlso({
    TypeOfTravelDocument.class
})
public class TypeOfTravelDocumentVersionStructure
    extends TypeOfEntityVersionStructure
{

    @XmlElement(name = "IsCard")
    protected Boolean isCard;
    @XmlElement(name = "IsSmartCard")
    protected Boolean isSmartCard;
    @XmlElement(name = "HasPhoto")
    protected Boolean hasPhoto;
    @XmlElement(name = "MediaType")
    @XmlSchemaType(name = "normalizedString")
    protected MediaTypeEnumeration mediaType;
    @XmlList
    @XmlElement(name = "MachineReadable")
    protected List<MachineReadableEnumeration> machineReadable;
    protected TypesOfMachineReadabilitiesRelStructure typesOfMachineReadabilities;
    protected AlternativeNamesRelStructure alternativeNames;

    /**
     * Ruft den Wert der isCard-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsCard() {
        return isCard;
    }

    /**
     * Legt den Wert der isCard-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsCard(Boolean value) {
        this.isCard = value;
    }

    /**
     * Ruft den Wert der isSmartCard-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsSmartCard() {
        return isSmartCard;
    }

    /**
     * Legt den Wert der isSmartCard-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsSmartCard(Boolean value) {
        this.isSmartCard = value;
    }

    /**
     * Ruft den Wert der hasPhoto-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isHasPhoto() {
        return hasPhoto;
    }

    /**
     * Legt den Wert der hasPhoto-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setHasPhoto(Boolean value) {
        this.hasPhoto = value;
    }

    /**
     * Ruft den Wert der mediaType-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link MediaTypeEnumeration }
     *     
     */
    public MediaTypeEnumeration getMediaType() {
        return mediaType;
    }

    /**
     * Legt den Wert der mediaType-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link MediaTypeEnumeration }
     *     
     */
    public void setMediaType(MediaTypeEnumeration value) {
        this.mediaType = value;
    }

    /**
     * Gets the value of the machineReadable property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the machineReadable property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMachineReadable().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MachineReadableEnumeration }
     * 
     * 
     */
    public List<MachineReadableEnumeration> getMachineReadable() {
        if (machineReadable == null) {
            machineReadable = new ArrayList<MachineReadableEnumeration>();
        }
        return this.machineReadable;
    }

    /**
     * Ruft den Wert der typesOfMachineReadabilities-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link TypesOfMachineReadabilitiesRelStructure }
     *     
     */
    public TypesOfMachineReadabilitiesRelStructure getTypesOfMachineReadabilities() {
        return typesOfMachineReadabilities;
    }

    /**
     * Legt den Wert der typesOfMachineReadabilities-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link TypesOfMachineReadabilitiesRelStructure }
     *     
     */
    public void setTypesOfMachineReadabilities(TypesOfMachineReadabilitiesRelStructure value) {
        this.typesOfMachineReadabilities = value;
    }

    /**
     * Ruft den Wert der alternativeNames-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link AlternativeNamesRelStructure }
     *     
     */
    public AlternativeNamesRelStructure getAlternativeNames() {
        return alternativeNames;
    }

    /**
     * Legt den Wert der alternativeNames-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link AlternativeNamesRelStructure }
     *     
     */
    public void setAlternativeNames(AlternativeNamesRelStructure value) {
        this.alternativeNames = value;
    }

}
