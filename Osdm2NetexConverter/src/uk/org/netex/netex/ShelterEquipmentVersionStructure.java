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
 * Type for a SHELTER EQUIPMENT.
 * 
 * <p>Java-Klasse f�r ShelterEquipment_VersionStructure complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="ShelterEquipment_VersionStructure">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.netex.org.uk/netex}WaitingEquipment_VersionStructure">
 *       &lt;sequence>
 *         &lt;group ref="{http://www.netex.org.uk/netex}ShelterEquipmentGroup"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ShelterEquipment_VersionStructure", propOrder = {
    "enclosed",
    "distanceFromNearestKerb"
})
@XmlSeeAlso({
    ShelterEquipment.class
})
public class ShelterEquipmentVersionStructure
    extends WaitingEquipmentVersionStructure
{

    @XmlElement(name = "Enclosed", defaultValue = "false")
    protected Boolean enclosed;
    @XmlElement(name = "DistanceFromNearestKerb")
    protected BigDecimal distanceFromNearestKerb;

    /**
     * Ruft den Wert der enclosed-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isEnclosed() {
        return enclosed;
    }

    /**
     * Legt den Wert der enclosed-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setEnclosed(Boolean value) {
        this.enclosed = value;
    }

    /**
     * Ruft den Wert der distanceFromNearestKerb-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getDistanceFromNearestKerb() {
        return distanceFromNearestKerb;
    }

    /**
     * Legt den Wert der distanceFromNearestKerb-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setDistanceFromNearestKerb(BigDecimal value) {
        this.distanceFromNearestKerb = value;
    }

}
