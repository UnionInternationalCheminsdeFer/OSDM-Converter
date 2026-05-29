//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// �nderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2026.05.22 um 10:24:00 AM CEST 
//


package uk.org.netex.netex;

import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlElementRef;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;
import javax.xml.datatype.Duration;


/**
 * Type for a PARKING TARIFF CHARGE BAND.
 * 
 * <p>Java-Klasse f�r ParkingChargeBand_VersionStructure complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="ParkingChargeBand_VersionStructure">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.netex.org.uk/netex}TimeStructureFactor_VersionStructure">
 *       &lt;sequence>
 *         &lt;group ref="{http://www.netex.org.uk/netex}ParkingChargeBandGroup"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ParkingChargeBand_VersionStructure", propOrder = {
    "parkingPropertiesRef",
    "parkingVehicleType",
    "transportTypeRef",
    "maximumStay",
    "prices"
})
@XmlSeeAlso({
    ParkingChargeBand.class
})
public class ParkingChargeBandVersionStructure
    extends TimeStructureFactorVersionStructure
{

    @XmlElement(name = "ParkingPropertiesRef")
    protected ParkingPropertiesRefStructure parkingPropertiesRef;
    @XmlElement(name = "ParkingVehicleType")
    @XmlSchemaType(name = "string")
    protected ParkingVehicleEnumeration parkingVehicleType;
    @XmlElementRef(name = "TransportTypeRef", namespace = "http://www.netex.org.uk/netex", type = JAXBElement.class, required = false)
    protected JAXBElement<? extends TransportTypeRefStructure> transportTypeRef;
    @XmlElement(name = "MaximumStay")
    protected Duration maximumStay;
    protected FarePricesRelStructure prices;

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
     * Ruft den Wert der transportTypeRef-Eigenschaft ab.
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
     * Ruft den Wert der maximumStay-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Duration }
     *     
     */
    public Duration getMaximumStay() {
        return maximumStay;
    }

    /**
     * Legt den Wert der maximumStay-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Duration }
     *     
     */
    public void setMaximumStay(Duration value) {
        this.maximumStay = value;
    }

    /**
     * Ruft den Wert der prices-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FarePricesRelStructure }
     *     
     */
    public FarePricesRelStructure getPrices() {
        return prices;
    }

    /**
     * Legt den Wert der prices-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FarePricesRelStructure }
     *     
     */
    public void setPrices(FarePricesRelStructure value) {
        this.prices = value;
    }

}
