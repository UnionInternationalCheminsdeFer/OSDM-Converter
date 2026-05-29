//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// �nderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2026.05.22 um 10:24:00 AM CEST 
//


package uk.org.netex.netex;

import java.math.BigInteger;
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
 * Type for a PASSENGER VEHICLE CAPACITY.
 * 
 * <p>Java-Klasse f�r PassengerVehicleCapacityStructure complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="PassengerVehicleCapacityStructure">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.netex.org.uk/netex}DataManagedObjectStructure">
 *       &lt;sequence>
 *         &lt;group ref="{http://www.netex.org.uk/netex}PassengerVehicleCapacityGroup"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PassengerVehicleCapacityStructure", propOrder = {
    "vehicleCategories",
    "vehicleCapacity"
})
@XmlSeeAlso({
    PassengerVehicleCapacity.class
})
public class PassengerVehicleCapacityStructure
    extends DataManagedObjectStructure
{

    @XmlList
    @XmlElement(name = "VehicleCategories", defaultValue = "allPassengerVehicles")
    protected List<String> vehicleCategories;
    @XmlElement(name = "VehicleCapacity")
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger vehicleCapacity;

    /**
     * Gets the value of the vehicleCategories property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the vehicleCategories property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getVehicleCategories().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getVehicleCategories() {
        if (vehicleCategories == null) {
            vehicleCategories = new ArrayList<String>();
        }
        return this.vehicleCategories;
    }

    /**
     * Ruft den Wert der vehicleCapacity-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getVehicleCapacity() {
        return vehicleCapacity;
    }

    /**
     * Legt den Wert der vehicleCapacity-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setVehicleCapacity(BigInteger value) {
        this.vehicleCapacity = value;
    }

}
