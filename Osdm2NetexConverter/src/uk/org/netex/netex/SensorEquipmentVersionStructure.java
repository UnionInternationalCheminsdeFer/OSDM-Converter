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
 * Type for a SENSOR EQUIPMENT.
 * 
 * <p>Java-Klasse f�r SensorEquipment_VersionStructure complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="SensorEquipment_VersionStructure">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.netex.org.uk/netex}InstalledEquipment_VersionStructure">
 *       &lt;sequence>
 *         &lt;group ref="{http://www.netex.org.uk/netex}SensorEquipmentGroup"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SensorEquipment_VersionStructure", propOrder = {
    "communicationMethod"
})
@XmlSeeAlso({
    SensorEquipment.class,
    SpotSensorVersionStructure.class,
    EntranceSensorVersionStructure.class
})
public class SensorEquipmentVersionStructure
    extends InstalledEquipmentVersionStructure
{

    @XmlElement(name = "CommunicationMethod")
    @XmlSchemaType(name = "normalizedString")
    protected SensorCommunicationsEnumeration communicationMethod;

    /**
     * Ruft den Wert der communicationMethod-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link SensorCommunicationsEnumeration }
     *     
     */
    public SensorCommunicationsEnumeration getCommunicationMethod() {
        return communicationMethod;
    }

    /**
     * Legt den Wert der communicationMethod-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link SensorCommunicationsEnumeration }
     *     
     */
    public void setCommunicationMethod(SensorCommunicationsEnumeration value) {
        this.communicationMethod = value;
    }

}
