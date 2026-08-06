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


/**
 * Type for a VEHICLE CHARGING EQUIPMENT.
 * 
 * <p>Java-Klasse f�r VehicleChargingEquipment_VersionStructure complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="VehicleChargingEquipment_VersionStructure">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.netex.org.uk/netex}PlaceEquipment_VersionStructure">
 *       &lt;sequence>
 *         &lt;group ref="{http://www.netex.org.uk/netex}VehicleChargingEquipmentGroup"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VehicleChargingEquipment_VersionStructure", propOrder = {
    "freeRecharging",
    "reservationRequired",
    "reservationUrl",
    "plugType",
    "typeOfPlugRef",
    "maximumPower",
    "gridVoltage",
    "currentType",
    "powerCouplingType"
})
@XmlSeeAlso({
    VehicleChargingEquipment.class
})
public class VehicleChargingEquipmentVersionStructure
    extends PlaceEquipmentVersionStructure
{

    @XmlElement(name = "FreeRecharging")
    protected Boolean freeRecharging;
    @XmlElement(name = "ReservationRequired")
    protected Boolean reservationRequired;
    @XmlElement(name = "ReservationUrl")
    @XmlSchemaType(name = "anyURI")
    protected String reservationUrl;
    @XmlElement(name = "PlugType")
    @XmlSchemaType(name = "NMTOKEN")
    protected PlugTypeEnumeration plugType;
    @XmlElement(name = "TypeOfPlugRef")
    protected TypeOfPlugRefStructure typeOfPlugRef;
    @XmlElement(name = "MaximumPower")
    protected BigDecimal maximumPower;
    @XmlElement(name = "GridVoltage")
    protected BigDecimal gridVoltage;
    @XmlElement(name = "CurrentType")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NMTOKEN")
    protected String currentType;
    @XmlElement(name = "PowerCouplingType")
    @XmlSchemaType(name = "NMTOKEN")
    protected PowerCouplingTypeEnumeration powerCouplingType;

    /**
     * Ruft den Wert der freeRecharging-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isFreeRecharging() {
        return freeRecharging;
    }

    /**
     * Legt den Wert der freeRecharging-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setFreeRecharging(Boolean value) {
        this.freeRecharging = value;
    }

    /**
     * Ruft den Wert der reservationRequired-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isReservationRequired() {
        return reservationRequired;
    }

    /**
     * Legt den Wert der reservationRequired-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setReservationRequired(Boolean value) {
        this.reservationRequired = value;
    }

    /**
     * Ruft den Wert der reservationUrl-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReservationUrl() {
        return reservationUrl;
    }

    /**
     * Legt den Wert der reservationUrl-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReservationUrl(String value) {
        this.reservationUrl = value;
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
     * Ruft den Wert der maximumPower-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMaximumPower() {
        return maximumPower;
    }

    /**
     * Legt den Wert der maximumPower-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMaximumPower(BigDecimal value) {
        this.maximumPower = value;
    }

    /**
     * Ruft den Wert der gridVoltage-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getGridVoltage() {
        return gridVoltage;
    }

    /**
     * Legt den Wert der gridVoltage-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setGridVoltage(BigDecimal value) {
        this.gridVoltage = value;
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

}
