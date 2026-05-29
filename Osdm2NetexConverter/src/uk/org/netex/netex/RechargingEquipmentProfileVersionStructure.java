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
import jakarta.xml.bind.annotation.adapters.CollapsedStringAdapter;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.datatype.Duration;


/**
 * Type for a RECHARGING EQUIPMENT PROFILE.
 * 
 * <p>Java-Klasse f�r RechargingEquipmentProfile_VersionStructure complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="RechargingEquipmentProfile_VersionStructure">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.netex.org.uk/netex}VehicleEquipmentProfile_VersionStructure">
 *       &lt;sequence>
 *         &lt;group ref="{http://www.netex.org.uk/netex}RechargingEquipmentProfileGroup"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RechargingEquipmentProfile_VersionStructure", propOrder = {
    "powerCouplingType",
    "plugType",
    "typeOfPlugRef",
    "currentType",
    "chargingVoltage",
    "maximumChargingPower",
    "preparationDuration",
    "finalisationDuration",
    "compatibleWith"
})
@XmlSeeAlso({
    RechargingEquipmentProfile.class
})
public class RechargingEquipmentProfileVersionStructure
    extends VehicleEquipmentProfileVersionStructure
{

    @XmlElement(name = "PowerCouplingType")
    @XmlSchemaType(name = "NMTOKEN")
    protected PowerCouplingTypeEnumeration powerCouplingType;
    @XmlElement(name = "PlugType")
    @XmlSchemaType(name = "NMTOKEN")
    protected PlugTypeEnumeration plugType;
    @XmlElement(name = "TypeOfPlugRef")
    protected TypeOfPlugRefStructure typeOfPlugRef;
    @XmlElement(name = "CurrentType")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NMTOKEN")
    protected String currentType;
    @XmlElement(name = "ChargingVoltage")
    protected BigDecimal chargingVoltage;
    @XmlElement(name = "MaximumChargingPower")
    protected BigDecimal maximumChargingPower;
    @XmlElement(name = "PreparationDuration")
    protected Duration preparationDuration;
    @XmlElement(name = "FinalisationDuration")
    protected Duration finalisationDuration;
    protected CompatibleEquipmentRefsRelStructure compatibleWith;

    /**
     * Ruft den Wert der powerCouplingType-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link PowerCouplingTypeEnumeration }
     *     
     */
    public PowerCouplingTypeEnumeration getPowerCouplingType() {
        return powerCouplingType;
    }

    /**
     * Legt den Wert der powerCouplingType-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link PowerCouplingTypeEnumeration }
     *     
     */
    public void setPowerCouplingType(PowerCouplingTypeEnumeration value) {
        this.powerCouplingType = value;
    }

    /**
     * Ruft den Wert der plugType-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link PlugTypeEnumeration }
     *     
     */
    public PlugTypeEnumeration getPlugType() {
        return plugType;
    }

    /**
     * Legt den Wert der plugType-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link PlugTypeEnumeration }
     *     
     */
    public void setPlugType(PlugTypeEnumeration value) {
        this.plugType = value;
    }

    /**
     * Ruft den Wert der typeOfPlugRef-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link TypeOfPlugRefStructure }
     *     
     */
    public TypeOfPlugRefStructure getTypeOfPlugRef() {
        return typeOfPlugRef;
    }

    /**
     * Legt den Wert der typeOfPlugRef-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeOfPlugRefStructure }
     *     
     */
    public void setTypeOfPlugRef(TypeOfPlugRefStructure value) {
        this.typeOfPlugRef = value;
    }

    /**
     * Ruft den Wert der currentType-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCurrentType() {
        return currentType;
    }

    /**
     * Legt den Wert der currentType-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCurrentType(String value) {
        this.currentType = value;
    }

    /**
     * Ruft den Wert der chargingVoltage-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getChargingVoltage() {
        return chargingVoltage;
    }

    /**
     * Legt den Wert der chargingVoltage-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setChargingVoltage(BigDecimal value) {
        this.chargingVoltage = value;
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
     * Ruft den Wert der preparationDuration-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Duration }
     *     
     */
    public Duration getPreparationDuration() {
        return preparationDuration;
    }

    /**
     * Legt den Wert der preparationDuration-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Duration }
     *     
     */
    public void setPreparationDuration(Duration value) {
        this.preparationDuration = value;
    }

    /**
     * Ruft den Wert der finalisationDuration-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Duration }
     *     
     */
    public Duration getFinalisationDuration() {
        return finalisationDuration;
    }

    /**
     * Legt den Wert der finalisationDuration-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Duration }
     *     
     */
    public void setFinalisationDuration(Duration value) {
        this.finalisationDuration = value;
    }

    /**
     * Ruft den Wert der compatibleWith-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link CompatibleEquipmentRefsRelStructure }
     *     
     */
    public CompatibleEquipmentRefsRelStructure getCompatibleWith() {
        return compatibleWith;
    }

    /**
     * Legt den Wert der compatibleWith-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link CompatibleEquipmentRefsRelStructure }
     *     
     */
    public void setCompatibleWith(CompatibleEquipmentRefsRelStructure value) {
        this.compatibleWith = value;
    }

}
