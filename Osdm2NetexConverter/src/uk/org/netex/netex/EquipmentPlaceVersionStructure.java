//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// �nderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2026.05.22 um 10:24:00 AM CEST 
//


package uk.org.netex.netex;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Type for an EQUIPMENT PLACE.
 * 
 * <p>Java-Klasse f�r EquipmentPlace_VersionStructure complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="EquipmentPlace_VersionStructure">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.netex.org.uk/netex}SiteElement_VersionStructure">
 *       &lt;sequence>
 *         &lt;group ref="{http://www.netex.org.uk/netex}EquipmentPlaceGroup"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EquipmentPlace_VersionStructure", propOrder = {
    "equipmentPositions",
    "placeEquipments"
})
@XmlSeeAlso({
    EquipmentPlace.class
})
public class EquipmentPlaceVersionStructure
    extends SiteElementVersionStructure
{

    protected EquipmentPositionsRelStructure equipmentPositions;
    protected EquipmentsRelStructure placeEquipments;

    /**
     * Ruft den Wert der equipmentPositions-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link EquipmentPositionsRelStructure }
     *     
     */
    public EquipmentPositionsRelStructure getEquipmentPositions() {
        return equipmentPositions;
    }

    /**
     * Legt den Wert der equipmentPositions-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link EquipmentPositionsRelStructure }
     *     
     */
    public void setEquipmentPositions(EquipmentPositionsRelStructure value) {
        this.equipmentPositions = value;
    }

    /**
     * Ruft den Wert der placeEquipments-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link EquipmentsRelStructure }
     *     
     */
    public EquipmentsRelStructure getPlaceEquipments() {
        return placeEquipments;
    }

    /**
     * Legt den Wert der placeEquipments-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link EquipmentsRelStructure }
     *     
     */
    public void setPlaceEquipments(EquipmentsRelStructure value) {
        this.placeEquipments = value;
    }

}
