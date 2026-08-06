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
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Type for an ESCALATOR EQUIPMENT.
 * 
 * <p>Java-Klasse f�r EscalatorEquipment_VersionStructure complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="EscalatorEquipment_VersionStructure">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.netex.org.uk/netex}StairEquipment_VersionStructure">
 *       &lt;sequence>
 *         &lt;group ref="{http://www.netex.org.uk/netex}EscalatorGroup"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EscalatorEquipment_VersionStructure", propOrder = {
    "tactileActuators",
    "energySaving",
    "dogsMustBeCarried",
    "escalatorWithLanding",
    "monitoringRemoteControl"
})
@XmlSeeAlso({
    EscalatorEquipment.class
})
public class EscalatorEquipmentVersionStructure
    extends StairEquipmentVersionStructure
{

    @XmlElement(name = "TactileActuators")
    protected Boolean tactileActuators;
    @XmlElement(name = "EnergySaving")
    protected Boolean energySaving;
    @XmlElement(name = "DogsMustBeCarried")
    protected Boolean dogsMustBeCarried;
    @XmlElement(name = "EscalatorWithLanding")
    protected Boolean escalatorWithLanding;
    @XmlElement(name = "MonitoringRemoteControl")
    protected Boolean monitoringRemoteControl;

    /**
     * Ruft den Wert der tactileActuators-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isTactileActuators() {
        return tactileActuators;
    }

    /**
     * Legt den Wert der tactileActuators-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setTactileActuators(Boolean value) {
        this.tactileActuators = value;
    }

    /**
     * Ruft den Wert der energySaving-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isEnergySaving() {
        return energySaving;
    }

    /**
     * Legt den Wert der energySaving-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setEnergySaving(Boolean value) {
        this.energySaving = value;
    }

    /**
     * Ruft den Wert der dogsMustBeCarried-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDogsMustBeCarried() {
        return dogsMustBeCarried;
    }

    /**
     * Legt den Wert der dogsMustBeCarried-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDogsMustBeCarried(Boolean value) {
        this.dogsMustBeCarried = value;
    }

    /**
     * Ruft den Wert der escalatorWithLanding-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isEscalatorWithLanding() {
        return escalatorWithLanding;
    }

    /**
     * Legt den Wert der escalatorWithLanding-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setEscalatorWithLanding(Boolean value) {
        this.escalatorWithLanding = value;
    }

    /**
     * Ruft den Wert der monitoringRemoteControl-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMonitoringRemoteControl() {
        return monitoringRemoteControl;
    }

    /**
     * Legt den Wert der monitoringRemoteControl-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMonitoringRemoteControl(Boolean value) {
        this.monitoringRemoteControl = value;
    }

}
