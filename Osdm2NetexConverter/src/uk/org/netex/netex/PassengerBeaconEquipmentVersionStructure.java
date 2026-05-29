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
 * Type for a BEACON EQUIPMENT.
 * 
 * <p>Java-Klasse f�r PassengerBeaconEquipment_VersionStructure complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="PassengerBeaconEquipment_VersionStructure">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.netex.org.uk/netex}PassengerEquipment_VersionStructure">
 *       &lt;sequence>
 *         &lt;group ref="{http://www.netex.org.uk/netex}PassengerBeaconEquipmentGroup"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PassengerBeaconEquipment_VersionStructure", propOrder = {
    "accessibilityAssessment",
    "beaconType",
    "beaconDirection",
    "beaconProtocol",
    "beaconBackendUrl"
})
@XmlSeeAlso({
    PassengerBeaconEquipment.class
})
public class PassengerBeaconEquipmentVersionStructure
    extends PassengerEquipmentVersionStructure
{

    @XmlElement(name = "AccessibilityAssessment")
    protected AccessibilityAssessment accessibilityAssessment;
    @XmlElement(name = "BeaconType")
    @XmlSchemaType(name = "NMTOKEN")
    protected BeaconTypeEnumeration beaconType;
    @XmlElement(name = "BeaconDirection")
    @XmlSchemaType(name = "NMTOKEN")
    protected BeaconDirectionEnumeration beaconDirection;
    @XmlElement(name = "BeaconProtocol")
    @XmlSchemaType(name = "NMTOKEN")
    protected BeaconProtocolEnumeration beaconProtocol;
    @XmlElement(name = "BeaconBackendUrl")
    @XmlSchemaType(name = "anyURI")
    protected String beaconBackendUrl;

    /**
     * Ruft den Wert der accessibilityAssessment-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link AccessibilityAssessment }
     *     
     */
    public AccessibilityAssessment getAccessibilityAssessment() {
        return accessibilityAssessment;
    }

    /**
     * Legt den Wert der accessibilityAssessment-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link AccessibilityAssessment }
     *     
     */
    public void setAccessibilityAssessment(AccessibilityAssessment value) {
        this.accessibilityAssessment = value;
    }

    /**
     * Ruft den Wert der beaconType-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BeaconTypeEnumeration }
     *     
     */
    public BeaconTypeEnumeration getBeaconType() {
        return beaconType;
    }

    /**
     * Legt den Wert der beaconType-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BeaconTypeEnumeration }
     *     
     */
    public void setBeaconType(BeaconTypeEnumeration value) {
        this.beaconType = value;
    }

    /**
     * Ruft den Wert der beaconDirection-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BeaconDirectionEnumeration }
     *     
     */
    public BeaconDirectionEnumeration getBeaconDirection() {
        return beaconDirection;
    }

    /**
     * Legt den Wert der beaconDirection-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BeaconDirectionEnumeration }
     *     
     */
    public void setBeaconDirection(BeaconDirectionEnumeration value) {
        this.beaconDirection = value;
    }

    /**
     * Ruft den Wert der beaconProtocol-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BeaconProtocolEnumeration }
     *     
     */
    public BeaconProtocolEnumeration getBeaconProtocol() {
        return beaconProtocol;
    }

    /**
     * Legt den Wert der beaconProtocol-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BeaconProtocolEnumeration }
     *     
     */
    public void setBeaconProtocol(BeaconProtocolEnumeration value) {
        this.beaconProtocol = value;
    }

    /**
     * Ruft den Wert der beaconBackendUrl-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBeaconBackendUrl() {
        return beaconBackendUrl;
    }

    /**
     * Legt den Wert der beaconBackendUrl-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBeaconBackendUrl(String value) {
        this.beaconBackendUrl = value;
    }

}
