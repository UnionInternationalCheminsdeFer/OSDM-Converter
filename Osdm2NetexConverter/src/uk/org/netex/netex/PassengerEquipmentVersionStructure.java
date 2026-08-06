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
 * Type for a PASSENGER EQUIPMENT.
 * 
 * <p>Java-Klasse f�r PassengerEquipment_VersionStructure complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="PassengerEquipment_VersionStructure">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.netex.org.uk/netex}InstalledEquipment_VersionStructure">
 *       &lt;group ref="{http://www.netex.org.uk/netex}PassengerEquipmentGroup"/>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PassengerEquipment_VersionStructure", propOrder = {
    "fixed"
})
@XmlSeeAlso({
    RubbishDisposalEquipmentVersionStructure.class,
    ActualVehicleEquipmentVersionStructure.class,
    SanitaryEquipmentVersionStructure.class,
    PassengerBeaconEquipmentVersionStructure.class,
    HelpPointEquipmentVersionStructure.class,
    TicketingEquipmentVersionStructure.class,
    PassengerSafetyEquipmentVersionStructure.class,
    TicketValidatorEquipmentVersionStructure.class,
    PassengerInformationEquipmentVersionStructure.class
})
public abstract class PassengerEquipmentVersionStructure
    extends InstalledEquipmentVersionStructure
{

    @XmlElement(name = "Fixed")
    protected Boolean fixed;

    /**
     * Ruft den Wert der fixed-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isFixed() {
        return fixed;
    }

    /**
     * Legt den Wert der fixed-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setFixed(Boolean value) {
        this.fixed = value;
    }

}
