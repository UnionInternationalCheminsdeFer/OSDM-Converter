//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// �nderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2026.05.22 um 10:24:00 AM CEST 
//


package uk.org.netex.netex;

import java.math.BigInteger;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Type for a CYCLE STORAGE EQUIPMENT.
 * 
 * <p>Java-Klasse f�r CycleStorageEquipment_VersionStructure complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="CycleStorageEquipment_VersionStructure">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.netex.org.uk/netex}PlaceEquipment_VersionStructure">
 *       &lt;sequence>
 *         &lt;group ref="{http://www.netex.org.uk/netex}CycleStorageEquipmentGroup"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CycleStorageEquipment_VersionStructure", propOrder = {
    "numberOfSpaces",
    "cycleStorageType",
    "cage",
    "covered"
})
@XmlSeeAlso({
    CycleStorageEquipment.class
})
public class CycleStorageEquipmentVersionStructure
    extends PlaceEquipmentVersionStructure
{

    @XmlElement(name = "NumberOfSpaces")
    protected BigInteger numberOfSpaces;
    @XmlElement(name = "CycleStorageType")
    @XmlSchemaType(name = "normalizedString")
    protected CycleStorageEnumeration cycleStorageType;
    @XmlElement(name = "Cage")
    protected Boolean cage;
    @XmlElement(name = "Covered")
    @XmlSchemaType(name = "string")
    protected CoveredEnumeration covered;

    /**
     * Ruft den Wert der numberOfSpaces-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getNumberOfSpaces() {
        return numberOfSpaces;
    }

    /**
     * Legt den Wert der numberOfSpaces-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setNumberOfSpaces(BigInteger value) {
        this.numberOfSpaces = value;
    }

    /**
     * Ruft den Wert der cycleStorageType-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link CycleStorageEnumeration }
     *     
     */
    public CycleStorageEnumeration getCycleStorageType() {
        return cycleStorageType;
    }

    /**
     * Legt den Wert der cycleStorageType-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link CycleStorageEnumeration }
     *     
     */
    public void setCycleStorageType(CycleStorageEnumeration value) {
        this.cycleStorageType = value;
    }

    /**
     * Ruft den Wert der cage-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCage() {
        return cage;
    }

    /**
     * Legt den Wert der cage-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCage(Boolean value) {
        this.cage = value;
    }

    /**
     * Ruft den Wert der covered-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link CoveredEnumeration }
     *     
     */
    public CoveredEnumeration getCovered() {
        return covered;
    }

    /**
     * Legt den Wert der covered-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link CoveredEnumeration }
     *     
     */
    public void setCovered(CoveredEnumeration value) {
        this.covered = value;
    }

}
