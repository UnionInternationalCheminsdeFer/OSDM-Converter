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
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Type for a BATTERY EQUIPMENT.
 * 
 * <p>Java-Klasse f�r BatteryEquipment_VersionStructure complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="BatteryEquipment_VersionStructure">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.netex.org.uk/netex}PlaceEquipment_VersionStructure">
 *       &lt;sequence>
 *         &lt;group ref="{http://www.netex.org.uk/netex}BatteryEquipmentGroup"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BatteryEquipment_VersionStructure", propOrder = {
    "batteryCapacity",
    "batteryUsableCapacity",
    "nominalVoltage",
    "maximumChargingPower",
    "typeOfBatteryChemistryRef"
})
@XmlSeeAlso({
    BatteryEquipment.class
})
public class BatteryEquipmentVersionStructure
    extends PlaceEquipmentVersionStructure
{

    @XmlElement(name = "BatteryCapacity")
    protected BigDecimal batteryCapacity;
    @XmlElement(name = "BatteryUsableCapacity")
    protected BigDecimal batteryUsableCapacity;
    @XmlElement(name = "NominalVoltage")
    protected BigDecimal nominalVoltage;
    @XmlElement(name = "MaximumChargingPower")
    protected BigDecimal maximumChargingPower;
    @XmlElement(name = "TypeOfBatteryChemistryRef")
    protected TypeOfBatteryChemistryRefStructure typeOfBatteryChemistryRef;

    /**
     * Ruft den Wert der batteryCapacity-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getBatteryCapacity() {
        return batteryCapacity;
    }

    /**
     * Legt den Wert der batteryCapacity-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setBatteryCapacity(BigDecimal value) {
        this.batteryCapacity = value;
    }

    /**
     * Ruft den Wert der batteryUsableCapacity-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getBatteryUsableCapacity() {
        return batteryUsableCapacity;
    }

    /**
     * Legt den Wert der batteryUsableCapacity-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setBatteryUsableCapacity(BigDecimal value) {
        this.batteryUsableCapacity = value;
    }

    /**
     * Ruft den Wert der nominalVoltage-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getNominalVoltage() {
        return nominalVoltage;
    }

    /**
     * Legt den Wert der nominalVoltage-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setNominalVoltage(BigDecimal value) {
        this.nominalVoltage = value;
    }

    /**
     * Ruft den Wert der maximumChargingPower-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMaximumChargingPower() {
        return maximumChargingPower;
    }

    /**
     * Legt den Wert der maximumChargingPower-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMaximumChargingPower(BigDecimal value) {
        this.maximumChargingPower = value;
    }

    /**
     * Ruft den Wert der typeOfBatteryChemistryRef-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link TypeOfBatteryChemistryRefStructure }
     *     
     */
    public TypeOfBatteryChemistryRefStructure getTypeOfBatteryChemistryRef() {
        return typeOfBatteryChemistryRef;
    }

    /**
     * Legt den Wert der typeOfBatteryChemistryRef-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeOfBatteryChemistryRefStructure }
     *     
     */
    public void setTypeOfBatteryChemistryRef(TypeOfBatteryChemistryRefStructure value) {
        this.typeOfBatteryChemistryRef = value;
    }

}
