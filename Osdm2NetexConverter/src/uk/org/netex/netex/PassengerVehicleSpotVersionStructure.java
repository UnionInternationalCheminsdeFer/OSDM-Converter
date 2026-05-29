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
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Type for a PASSENGER VEHICLE SPOT.
 * 
 * <p>Java-Klasse f�r PassengerVehicleSpot_VersionStructure complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="PassengerVehicleSpot_VersionStructure">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.netex.org.uk/netex}LocatableSpot_VersionStructure">
 *       &lt;sequence>
 *         &lt;group ref="{http://www.netex.org.uk/netex}PassengerVehicleSpotGroup"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PassengerVehicleSpot_VersionStructure", propOrder = {
    "vehicleCategories",
    "transportTypes"
})
@XmlSeeAlso({
    PassengerVehicleSpot.class
})
public class PassengerVehicleSpotVersionStructure
    extends LocatableSpotVersionStructure
{

    @XmlList
    @XmlElement(name = "VehicleCategories")
    protected List<String> vehicleCategories;
    protected TransportTypeRefsRelStructure transportTypes;

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
     * Ruft den Wert der transportTypes-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link TransportTypeRefsRelStructure }
     *     
     */
    public TransportTypeRefsRelStructure getTransportTypes() {
        return transportTypes;
    }

    /**
     * Legt den Wert der transportTypes-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link TransportTypeRefsRelStructure }
     *     
     */
    public void setTransportTypes(TransportTypeRefsRelStructure value) {
        this.transportTypes = value;
    }

}
