//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// �nderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2026.05.22 um 10:24:00 AM CEST 
//


package uk.org.netex.netex;

import java.math.BigInteger;
import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlElementRef;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Type for a PARKING CAPACITY.
 * 
 * <p>Java-Klasse f�r ParkingCapacity_VersionedChildStructure complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="ParkingCapacity_VersionedChildStructure">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.netex.org.uk/netex}VersionedChildStructure">
 *       &lt;sequence>
 *         &lt;group ref="{http://www.netex.org.uk/netex}ParkingCapacityGroup"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ParkingCapacity_VersionedChildStructure", propOrder = {
    "parkingRef",
    "parentRef",
    "parkingPropertiesRef",
    "parkingUserType",
    "parkingVehicleType",
    "transportTypeRef",
    "parkingStayType",
    "numberOfSpaces",
    "numberOfSpacesWithRechargePoint"
})
@XmlSeeAlso({
    ParkingCapacity.class
})
public class ParkingCapacityVersionedChildStructure
    extends VersionedChildStructure
{

    @XmlElementRef(name = "ParkingRef", namespace = "http://www.netex.org.uk/netex", type = JAXBElement.class, required = false)
    protected JAXBElement<? extends ParkingRefStructure> parkingRef;
    @XmlElement(name = "ParentRef")
    protected ParkingPropertiesRefStructure parentRef;
    @XmlElement(name = "ParkingPropertiesRef")
    protected ParkingPropertiesRefStructure parkingPropertiesRef;
    @XmlElement(name = "ParkingUserType")
    @XmlSchemaType(name = "string")
    protected ParkingUserEnumeration parkingUserType;
    @XmlElement(name = "ParkingVehicleType")
    @XmlSchemaType(name = "string")
    protected ParkingVehicleEnumeration parkingVehicleType;
    @XmlElementRef(name = "TransportTypeRef", namespace = "http://www.netex.org.uk/netex", type = JAXBElement.class, required = false)
    protected JAXBElement<? extends TransportTypeRefStructure> transportTypeRef;
    @XmlElement(name = "ParkingStayType")
    @XmlSchemaType(name = "string")
    protected ParkingStayEnumeration parkingStayType;
    @XmlElement(name = "NumberOfSpaces")
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger numberOfSpaces;
    @XmlElement(name = "NumberOfSpacesWithRechargePoint")
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger numberOfSpacesWithRechargePoint;

    /**
     * Ruft den Wert der parkingRef-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link RechargingStationRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link ParkingRefStructure }{@code >}
     *     
     */
    public JAXBElement<? extends ParkingRefStructure> getParkingRef() {
        return parkingRef;
    }

    /**
     * Legt den Wert der parkingRef-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link RechargingStationRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link ParkingRefStructure }{@code >}
     *     
     */
    public void setParkingRef(JAXBElement<? extends ParkingRefStructure> value) {
        this.parkingRef = value;
    }

    /**
     * Ruft den Wert der parentRef-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ParkingPropertiesRefStructure }
     *     
     */
    public ParkingPropertiesRefStructure getParentRef() {
        return parentRef;
    }

    /**
     * Legt den Wert der parentRef-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ParkingPropertiesRefStructure }
     *     
     */
    public void setParentRef(ParkingPropertiesRefStructure value) {
        this.parentRef = value;
    }

    /**
     * Ruft den Wert der parkingPropertiesRef-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ParkingPropertiesRefStructure }
     *     
     */
    public ParkingPropertiesRefStructure getParkingPropertiesRef() {
        return parkingPropertiesRef;
    }

    /**
     * Legt den Wert der parkingPropertiesRef-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ParkingPropertiesRefStructure }
     *     
     */
    public void setParkingPropertiesRef(ParkingPropertiesRefStructure value) {
        this.parkingPropertiesRef = value;
    }

    /**
     * Ruft den Wert der parkingUserType-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ParkingUserEnumeration }
     *     
     */
    public ParkingUserEnumeration getParkingUserType() {
        return parkingUserType;
    }

    /**
     * Legt den Wert der parkingUserType-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ParkingUserEnumeration }
     *     
     */
    public void setParkingUserType(ParkingUserEnumeration value) {
        this.parkingUserType = value;
    }

    /**
     * Ruft den Wert der parkingVehicleType-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ParkingVehicleEnumeration }
     *     
     */
    public ParkingVehicleEnumeration getParkingVehicleType() {
        return parkingVehicleType;
    }

    /**
     * Legt den Wert der parkingVehicleType-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ParkingVehicleEnumeration }
     *     
     */
    public void setParkingVehicleType(ParkingVehicleEnumeration value) {
        this.parkingVehicleType = value;
    }

    /**
     * Reference to a TRANSPORT TYPE. +v1.2.2
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link TrainRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link CompoundTrainRef }{@code >}
     *     {@link JAXBElement }{@code <}{@link TransportTypeRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link PoweredTrainRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link VehicleTypeRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link SimpleVehicleTypeRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link UnpoweredTrainRefStructure }{@code >}
     *     
     */
    public JAXBElement<? extends TransportTypeRefStructure> getTransportTypeRef() {
        return transportTypeRef;
    }

    /**
     * Legt den Wert der transportTypeRef-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link TrainRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link CompoundTrainRef }{@code >}
     *     {@link JAXBElement }{@code <}{@link TransportTypeRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link PoweredTrainRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link VehicleTypeRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link SimpleVehicleTypeRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link UnpoweredTrainRefStructure }{@code >}
     *     
     */
    public void setTransportTypeRef(JAXBElement<? extends TransportTypeRefStructure> value) {
        this.transportTypeRef = value;
    }

    /**
     * Ruft den Wert der parkingStayType-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ParkingStayEnumeration }
     *     
     */
    public ParkingStayEnumeration getParkingStayType() {
        return parkingStayType;
    }

    /**
     * Legt den Wert der parkingStayType-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ParkingStayEnumeration }
     *     
     */
    public void setParkingStayType(ParkingStayEnumeration value) {
        this.parkingStayType = value;
    }

    /**
     * Ruft den Wert der numberOfSpaces-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getNumberOfSpaces() {
        return numberOfSpaces;
    }

    /**
     * Legt den Wert der numberOfSpaces-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setNumberOfSpaces(BigInteger value) {
        this.numberOfSpaces = value;
    }

    /**
     * Ruft den Wert der numberOfSpacesWithRechargePoint-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getNumberOfSpacesWithRechargePoint() {
        return numberOfSpacesWithRechargePoint;
    }

    /**
     * Legt den Wert der numberOfSpacesWithRechargePoint-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setNumberOfSpacesWithRechargePoint(BigInteger value) {
        this.numberOfSpacesWithRechargePoint = value;
    }

}
