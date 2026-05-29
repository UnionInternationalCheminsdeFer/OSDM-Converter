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
 * Type for a PASSENGER SPACE.
 * 
 * <p>Java-Klasse f�r PassengerSpace_VersionStructure complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="PassengerSpace_VersionStructure">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.netex.org.uk/netex}DeckSpace_VersionStructure">
 *       &lt;sequence>
 *         &lt;group ref="{http://www.netex.org.uk/netex}PassengerSpaceGroup"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PassengerSpace_VersionStructure", propOrder = {
    "passengerSpaceType",
    "standingAllowed",
    "passengerSpots",
    "luggageSpots",
    "passengerVehicleSpots",
    "spotAffinities"
})
@XmlSeeAlso({
    PassengerSpace.class
})
public class PassengerSpaceVersionStructure
    extends DeckSpaceVersionStructure
{

    @XmlElement(name = "PassengerSpaceType")
    @XmlSchemaType(name = "normalizedString")
    protected PassengerSpaceTypeEnumeration passengerSpaceType;
    @XmlElement(name = "StandingAllowed")
    protected Boolean standingAllowed;
    protected PassengerSpotsRelStructure passengerSpots;
    protected LuggageSpotsRelStructure luggageSpots;
    protected PassengerVehicleSpotsRelStructure passengerVehicleSpots;
    protected SpotAffinitiesRelStructure spotAffinities;

    /**
     * Ruft den Wert der passengerSpaceType-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link PassengerSpaceTypeEnumeration }
     *     
     */
    public PassengerSpaceTypeEnumeration getPassengerSpaceType() {
        return passengerSpaceType;
    }

    /**
     * Legt den Wert der passengerSpaceType-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link PassengerSpaceTypeEnumeration }
     *     
     */
    public void setPassengerSpaceType(PassengerSpaceTypeEnumeration value) {
        this.passengerSpaceType = value;
    }

    /**
     * Ruft den Wert der standingAllowed-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isStandingAllowed() {
        return standingAllowed;
    }

    /**
     * Legt den Wert der standingAllowed-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setStandingAllowed(Boolean value) {
        this.standingAllowed = value;
    }

    /**
     * Ruft den Wert der passengerSpots-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link PassengerSpotsRelStructure }
     *     
     */
    public PassengerSpotsRelStructure getPassengerSpots() {
        return passengerSpots;
    }

    /**
     * Legt den Wert der passengerSpots-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link PassengerSpotsRelStructure }
     *     
     */
    public void setPassengerSpots(PassengerSpotsRelStructure value) {
        this.passengerSpots = value;
    }

    /**
     * Ruft den Wert der luggageSpots-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link LuggageSpotsRelStructure }
     *     
     */
    public LuggageSpotsRelStructure getLuggageSpots() {
        return luggageSpots;
    }

    /**
     * Legt den Wert der luggageSpots-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link LuggageSpotsRelStructure }
     *     
     */
    public void setLuggageSpots(LuggageSpotsRelStructure value) {
        this.luggageSpots = value;
    }

    /**
     * Ruft den Wert der passengerVehicleSpots-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link PassengerVehicleSpotsRelStructure }
     *     
     */
    public PassengerVehicleSpotsRelStructure getPassengerVehicleSpots() {
        return passengerVehicleSpots;
    }

    /**
     * Legt den Wert der passengerVehicleSpots-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link PassengerVehicleSpotsRelStructure }
     *     
     */
    public void setPassengerVehicleSpots(PassengerVehicleSpotsRelStructure value) {
        this.passengerVehicleSpots = value;
    }

    /**
     * Ruft den Wert der spotAffinities-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link SpotAffinitiesRelStructure }
     *     
     */
    public SpotAffinitiesRelStructure getSpotAffinities() {
        return spotAffinities;
    }

    /**
     * Legt den Wert der spotAffinities-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link SpotAffinitiesRelStructure }
     *     
     */
    public void setSpotAffinities(SpotAffinitiesRelStructure value) {
        this.spotAffinities = value;
    }

}
