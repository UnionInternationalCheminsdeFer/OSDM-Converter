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
 * Type for a VEHICLE RELEASE EQUIPMENT.
 * 
 * <p>Java-Klasse f�r VehicleReleaseEquipment_VersionStructure complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="VehicleReleaseEquipment_VersionStructure">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.netex.org.uk/netex}InstalledEquipment_VersionStructure">
 *       &lt;sequence>
 *         &lt;group ref="{http://www.netex.org.uk/netex}VehicleReleaseEquipmentGroup"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VehicleReleaseEquipment_VersionStructure", propOrder = {
    "remoteControl",
    "localControl",
    "lockingMechanism"
})
@XmlSeeAlso({
    VehicleReleaseEquipment.class
})
public class VehicleReleaseEquipmentVersionStructure
    extends InstalledEquipmentVersionStructure
{

    @XmlElement(name = "RemoteControl")
    protected Boolean remoteControl;
    @XmlElement(name = "LocalControl")
    protected Boolean localControl;
    @XmlElement(name = "LockingMechanism")
    @XmlSchemaType(name = "normalizedString")
    protected LockingMechanismEnumeration lockingMechanism;

    /**
     * Ruft den Wert der remoteControl-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isRemoteControl() {
        return remoteControl;
    }

    /**
     * Legt den Wert der remoteControl-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setRemoteControl(Boolean value) {
        this.remoteControl = value;
    }

    /**
     * Ruft den Wert der localControl-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isLocalControl() {
        return localControl;
    }

    /**
     * Legt den Wert der localControl-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setLocalControl(Boolean value) {
        this.localControl = value;
    }

    /**
     * Ruft den Wert der lockingMechanism-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link LockingMechanismEnumeration }
     *     
     */
    public LockingMechanismEnumeration getLockingMechanism() {
        return lockingMechanism;
    }

    /**
     * Legt den Wert der lockingMechanism-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link LockingMechanismEnumeration }
     *     
     */
    public void setLockingMechanism(LockingMechanismEnumeration value) {
        this.lockingMechanism = value;
    }

}
