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
import javax.xml.datatype.Duration;


/**
 * Type for RECHARGING PLAN.
 * 
 * <p>Java-Klasse f�r RechargingPlan_VersionStructure complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="RechargingPlan_VersionStructure">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.netex.org.uk/netex}DataManagedObjectStructure">
 *       &lt;sequence>
 *         &lt;group ref="{http://www.netex.org.uk/netex}RechargingPlanGroup"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RechargingPlan_VersionStructure", propOrder = {
    "name",
    "description",
    "rechargingProcessType",
    "totalChargeEnergy",
    "chargingDuration",
    "rechargingSteps",
    "blockRefs"
})
@XmlSeeAlso({
    RechargingPlan.class
})
public class RechargingPlanVersionStructure
    extends DataManagedObjectStructure
{

    @XmlElement(name = "Name")
    protected MultilingualString name;
    @XmlElement(name = "Description")
    protected MultilingualString description;
    @XmlElement(name = "RechargingProcessType")
    @XmlSchemaType(name = "normalizedString")
    protected RechargingProcessEnumeration rechargingProcessType;
    @XmlElement(name = "TotalChargeEnergy")
    protected BigDecimal totalChargeEnergy;
    @XmlElement(name = "ChargingDuration")
    protected Duration chargingDuration;
    protected RechargingStepsRelStructure rechargingSteps;
    protected BlockRefsRelStructure blockRefs;

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
     * Ruft den Wert der rechargingProcessType-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link RechargingProcessEnumeration }
     *     
     */
    public RechargingProcessEnumeration getRechargingProcessType() {
        return rechargingProcessType;
    }

    /**
     * Legt den Wert der rechargingProcessType-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link RechargingProcessEnumeration }
     *     
     */
    public void setRechargingProcessType(RechargingProcessEnumeration value) {
        this.rechargingProcessType = value;
    }

    /**
     * Ruft den Wert der totalChargeEnergy-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTotalChargeEnergy() {
        return totalChargeEnergy;
    }

    /**
     * Legt den Wert der totalChargeEnergy-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTotalChargeEnergy(BigDecimal value) {
        this.totalChargeEnergy = value;
    }

    /**
     * Ruft den Wert der chargingDuration-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Duration }
     *     
     */
    public Duration getChargingDuration() {
        return chargingDuration;
    }

    /**
     * Legt den Wert der chargingDuration-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Duration }
     *     
     */
    public void setChargingDuration(Duration value) {
        this.chargingDuration = value;
    }

    /**
     * Ruft den Wert der rechargingSteps-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link RechargingStepsRelStructure }
     *     
     */
    public RechargingStepsRelStructure getRechargingSteps() {
        return rechargingSteps;
    }

    /**
     * Legt den Wert der rechargingSteps-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link RechargingStepsRelStructure }
     *     
     */
    public void setRechargingSteps(RechargingStepsRelStructure value) {
        this.rechargingSteps = value;
    }

    /**
     * Ruft den Wert der blockRefs-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BlockRefsRelStructure }
     *     
     */
    public BlockRefsRelStructure getBlockRefs() {
        return blockRefs;
    }

    /**
     * Legt den Wert der blockRefs-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BlockRefsRelStructure }
     *     
     */
    public void setBlockRefs(BlockRefsRelStructure value) {
        this.blockRefs = value;
    }

}
