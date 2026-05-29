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
 * Type for VEHICLE JOURNEY SPOT ALLOCATION.
 * 
 * <p>Java-Klasse f�r VehicleJourneySpotAllocation_VersionStructure complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="VehicleJourneySpotAllocation_VersionStructure">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.netex.org.uk/netex}DataManagedObjectStructure">
 *       &lt;sequence>
 *         &lt;group ref="{http://www.netex.org.uk/netex}VehicleJourneySpotGroup"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VehicleJourneySpotAllocation_VersionStructure", propOrder = {
    "datedVehicleJourneyRef",
    "seatAllocationMethod",
    "spotAllocationMethodRef",
    "passengerSpotAllocations"
})
@XmlSeeAlso({
    VehicleJourneySpotAllocation.class
})
public class VehicleJourneySpotAllocationVersionStructure
    extends DataManagedObjectStructure
{

    @XmlElement(name = "DatedVehicleJourneyRef")
    protected VehicleJourneyRefStructure datedVehicleJourneyRef;
    @XmlElement(name = "SeatAllocationMethod", defaultValue = "autoAssigned")
    @XmlSchemaType(name = "normalizedString")
    protected SeatAllocationMethodEnumeration seatAllocationMethod;
    @XmlElement(name = "SpotAllocationMethodRef")
    protected SpotAllocationMethodRefStructure spotAllocationMethodRef;
    protected PassengerSpotAllocationsRelStructure passengerSpotAllocations;

    /**
     * Ruft den Wert der datedVehicleJourneyRef-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link VehicleJourneyRefStructure }
     *     
     */
    public VehicleJourneyRefStructure getDatedVehicleJourneyRef() {
        return datedVehicleJourneyRef;
    }

    /**
     * Legt den Wert der datedVehicleJourneyRef-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link VehicleJourneyRefStructure }
     *     
     */
    public void setDatedVehicleJourneyRef(VehicleJourneyRefStructure value) {
        this.datedVehicleJourneyRef = value;
    }

    /**
     * Ruft den Wert der seatAllocationMethod-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link SeatAllocationMethodEnumeration }
     *     
     */
    public SeatAllocationMethodEnumeration getSeatAllocationMethod() {
        return seatAllocationMethod;
    }

    /**
     * Legt den Wert der seatAllocationMethod-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link SeatAllocationMethodEnumeration }
     *     
     */
    public void setSeatAllocationMethod(SeatAllocationMethodEnumeration value) {
        this.seatAllocationMethod = value;
    }

    /**
     * Ruft den Wert der spotAllocationMethodRef-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link SpotAllocationMethodRefStructure }
     *     
     */
    public SpotAllocationMethodRefStructure getSpotAllocationMethodRef() {
        return spotAllocationMethodRef;
    }

    /**
     * Legt den Wert der spotAllocationMethodRef-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link SpotAllocationMethodRefStructure }
     *     
     */
    public void setSpotAllocationMethodRef(SpotAllocationMethodRefStructure value) {
        this.spotAllocationMethodRef = value;
    }

    /**
     * Ruft den Wert der passengerSpotAllocations-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link PassengerSpotAllocationsRelStructure }
     *     
     */
    public PassengerSpotAllocationsRelStructure getPassengerSpotAllocations() {
        return passengerSpotAllocations;
    }

    /**
     * Legt den Wert der passengerSpotAllocations-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link PassengerSpotAllocationsRelStructure }
     *     
     */
    public void setPassengerSpotAllocations(PassengerSpotAllocationsRelStructure value) {
        this.passengerSpotAllocations = value;
    }

}
