//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// �nderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2026.05.22 um 10:24:00 AM CEST 
//


package uk.org.netex.netex;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlList;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Type for a REFUELLING EQUIPMENT.
 * 
 * <p>Java-Klasse f�r RefuellingEquipment_VersionStructure complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="RefuellingEquipment_VersionStructure">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.netex.org.uk/netex}PlaceEquipment_VersionStructure">
 *       &lt;sequence>
 *         &lt;group ref="{http://www.netex.org.uk/netex}RefuellingEquipmentGroup"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RefuellingEquipment_VersionStructure", propOrder = {
    "fuelTypes",
    "fuelType"
})
@XmlSeeAlso({
    RefuellingEquipment.class
})
public class RefuellingEquipmentVersionStructure
    extends PlaceEquipmentVersionStructure
{

    @XmlList
    @XmlElement(name = "FuelTypes")
    protected List<FuelTypeEnumeration> fuelTypes;
    @XmlElement(name = "FuelType")
    @XmlSchemaType(name = "normalizedString")
    protected FuelTypeEnumeration fuelType;

    /**
     * Gets the value of the fuelTypes property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the fuelTypes property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFuelTypes().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FuelTypeEnumeration }
     * 
     * 
     */
    public List<FuelTypeEnumeration> getFuelTypes() {
        if (fuelTypes == null) {
            fuelTypes = new ArrayList<FuelTypeEnumeration>();
        }
        return this.fuelTypes;
    }

    /**
     * Ruft den Wert der fuelType-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FuelTypeEnumeration }
     *     
     */
    public FuelTypeEnumeration getFuelType() {
        return fuelType;
    }

    /**
     * Legt den Wert der fuelType-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FuelTypeEnumeration }
     *     
     */
    public void setFuelType(FuelTypeEnumeration value) {
        this.fuelType = value;
    }

}
