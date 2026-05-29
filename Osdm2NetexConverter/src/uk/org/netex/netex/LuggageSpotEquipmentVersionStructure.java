//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// �nderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2026.05.22 um 10:24:00 AM CEST 
//


package uk.org.netex.netex;

import java.math.BigDecimal;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Type for a LUGGAGE SPOT EQUIPMENT.
 * 
 * <p>Java-Klasse f�r LuggageSpotEquipment_VersionStructure complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="LuggageSpotEquipment_VersionStructure">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.netex.org.uk/netex}SpotEquipment_VersionStructure">
 *       &lt;sequence>
 *         &lt;group ref="{http://www.netex.org.uk/netex}LuggageSpotEquipmentGroup"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LuggageSpotEquipment_VersionStructure", propOrder = {
    "luggageSpotType",
    "headroomForLuggage",
    "isLockable",
    "hasDoor"
})
@XmlSeeAlso({
    LuggageSpotEquipment.class
})
public class LuggageSpotEquipmentVersionStructure
    extends SpotEquipmentVersionStructure
{

    @XmlElement(name = "LuggageSpotType")
    @XmlSchemaType(name = "normalizedString")
    protected LuggageSpotTypeEnumeration luggageSpotType;
    @XmlElement(name = "HeadroomForLuggage")
    protected BigDecimal headroomForLuggage;
    @XmlElement(name = "IsLockable")
    protected Boolean isLockable;
    @XmlElement(name = "HasDoor")
    protected Boolean hasDoor;

    /**
     * Ruft den Wert der luggageSpotType-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link LuggageSpotTypeEnumeration }
     *     
     */
    public LuggageSpotTypeEnumeration getLuggageSpotType() {
        return luggageSpotType;
    }

    /**
     * Legt den Wert der luggageSpotType-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link LuggageSpotTypeEnumeration }
     *     
     */
    public void setLuggageSpotType(LuggageSpotTypeEnumeration value) {
        this.luggageSpotType = value;
    }

    /**
     * Ruft den Wert der headroomForLuggage-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getHeadroomForLuggage() {
        return headroomForLuggage;
    }

    /**
     * Legt den Wert der headroomForLuggage-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setHeadroomForLuggage(BigDecimal value) {
        this.headroomForLuggage = value;
    }

    /**
     * Ruft den Wert der isLockable-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsLockable() {
        return isLockable;
    }

    /**
     * Legt den Wert der isLockable-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsLockable(Boolean value) {
        this.isLockable = value;
    }

    /**
     * Ruft den Wert der hasDoor-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isHasDoor() {
        return hasDoor;
    }

    /**
     * Legt den Wert der hasDoor-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setHasDoor(Boolean value) {
        this.hasDoor = value;
    }

}
