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
 * Type for a SERVICE FACILITY.
 * 
 * <p>Java-Klasse f�r ServiceFacilitySet_VersionStructure complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="ServiceFacilitySet_VersionStructure">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.netex.org.uk/netex}FacilitySet_VersionStructure">
 *       &lt;sequence>
 *         &lt;group ref="{http://www.netex.org.uk/netex}ServiceFacilitySetGroup"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ServiceFacilitySet_VersionStructure", propOrder = {
    "vehicleAccessFacilityList",
    "accommodationAccessList",
    "accommodationFacilityList",
    "boardingPermission",
    "bookingProcessFacilityList",
    "couchetteFacilityList",
    "groupBookingFacility",
    "luggageCarriageFacilityList",
    "serviceReservationFacilityList",
    "uicProductCharacteristicList",
    "uicTrainRate",
    "accommodations",
    "onboardStays"
})
@XmlSeeAlso({
    ServiceFacilitySet.class,
    RestrictedServiceFacilitySetVersionStructure.class
})
public class ServiceFacilitySetVersionStructure
    extends FacilitySetVersionStructure
{

    @XmlList
    @XmlElement(name = "VehicleAccessFacilityList", defaultValue = "unknown")
    protected List<VehicleAccessFacilityEnumeration> vehicleAccessFacilityList;
    @XmlList
    @XmlElement(name = "AccommodationAccessList")
    protected List<AccommodationAccessEnumeration> accommodationAccessList;
    @XmlList
    @XmlElement(name = "AccommodationFacilityList", defaultValue = "unknown")
    protected List<AccommodationFacilityEnumeration> accommodationFacilityList;
    @XmlElement(name = "BoardingPermission")
    @XmlSchemaType(name = "NMTOKEN")
    protected BoardingPermissionEnumeration boardingPermission;
    @XmlList
    @XmlElement(name = "BookingProcessFacilityList")
    protected List<BookingProcessEnumeration> bookingProcessFacilityList;
    @XmlList
    @XmlElement(name = "CouchetteFacilityList", defaultValue = "unknown")
    protected List<CouchetteFacilityEnumeration> couchetteFacilityList;
    @XmlElement(name = "GroupBookingFacility", defaultValue = "unknown")
    @XmlSchemaType(name = "normalizedString")
    protected GroupBookingEnumeration groupBookingFacility;
    @XmlList
    @XmlElement(name = "LuggageCarriageFacilityList")
    protected List<LuggageCarriageEnumeration> luggageCarriageFacilityList;
    @XmlList
    @XmlElement(name = "ServiceReservationFacilityList")
    protected List<ReservationEnumeration> serviceReservationFacilityList;
    @XmlList
    @XmlElement(name = "UicProductCharacteristicList")
    protected List<UicProductCharacteristicEnumeration> uicProductCharacteristicList;
    @XmlElement(name = "UicTrainRate")
    @XmlSchemaType(name = "normalizedString")
    protected UicRateTypeEnumeration uicTrainRate;
    protected AccommodationsRelStructure accommodations;
    protected OnboardStaysRelStructure onboardStays;

    /**
     * List of Vehicle Access FACILITies. +v1.1 Gets the value of the vehicleAccessFacilityList property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the vehicleAccessFacilityList property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getVehicleAccessFacilityList().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link VehicleAccessFacilityEnumeration }
     * 
     * 
     */
    public List<VehicleAccessFacilityEnumeration> getVehicleAccessFacilityList() {
        if (vehicleAccessFacilityList == null) {
            vehicleAccessFacilityList = new ArrayList<VehicleAccessFacilityEnumeration>();
        }
        return this.vehicleAccessFacilityList;
    }

    /**
     * List of ACCOMMODATION Access rights.Gets the value of the accommodationAccessList property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the accommodationAccessList property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAccommodationAccessList().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AccommodationAccessEnumeration }
     * 
     * 
     */
    public List<AccommodationAccessEnumeration> getAccommodationAccessList() {
        if (accommodationAccessList == null) {
            accommodationAccessList = new ArrayList<AccommodationAccessEnumeration>();
        }
        return this.accommodationAccessList;
    }

    /**
     * List of Accommodation FACILITies.Gets the value of the accommodationFacilityList property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the accommodationFacilityList property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAccommodationFacilityList().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AccommodationFacilityEnumeration }
     * 
     * 
     */
    public List<AccommodationFacilityEnumeration> getAccommodationFacilityList() {
        if (accommodationFacilityList == null) {
            accommodationFacilityList = new ArrayList<AccommodationFacilityEnumeration>();
        }
        return this.accommodationFacilityList;
    }

    /**
     * Ruft den Wert der boardingPermission-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BoardingPermissionEnumeration }
     *     
     */
    public BoardingPermissionEnumeration getBoardingPermission() {
        return boardingPermission;
    }

    /**
     * Legt den Wert der boardingPermission-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BoardingPermissionEnumeration }
     *     
     */
    public void setBoardingPermission(BoardingPermissionEnumeration value) {
        this.boardingPermission = value;
    }

    /**
     * Gets the value of the bookingProcessFacilityList property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the bookingProcessFacilityList property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBookingProcessFacilityList().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BookingProcessEnumeration }
     * 
     * 
     */
    public List<BookingProcessEnumeration> getBookingProcessFacilityList() {
        if (bookingProcessFacilityList == null) {
            bookingProcessFacilityList = new ArrayList<BookingProcessEnumeration>();
        }
        return this.bookingProcessFacilityList;
    }

    /**
     * Gets the value of the couchetteFacilityList property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the couchetteFacilityList property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCouchetteFacilityList().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CouchetteFacilityEnumeration }
     * 
     * 
     */
    public List<CouchetteFacilityEnumeration> getCouchetteFacilityList() {
        if (couchetteFacilityList == null) {
            couchetteFacilityList = new ArrayList<CouchetteFacilityEnumeration>();
        }
        return this.couchetteFacilityList;
    }

    /**
     * Ruft den Wert der groupBookingFacility-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link GroupBookingEnumeration }
     *     
     */
    public GroupBookingEnumeration getGroupBookingFacility() {
        return groupBookingFacility;
    }

    /**
     * Legt den Wert der groupBookingFacility-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link GroupBookingEnumeration }
     *     
     */
    public void setGroupBookingFacility(GroupBookingEnumeration value) {
        this.groupBookingFacility = value;
    }

    /**
     * Gets the value of the luggageCarriageFacilityList property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the luggageCarriageFacilityList property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLuggageCarriageFacilityList().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LuggageCarriageEnumeration }
     * 
     * 
     */
    public List<LuggageCarriageEnumeration> getLuggageCarriageFacilityList() {
        if (luggageCarriageFacilityList == null) {
            luggageCarriageFacilityList = new ArrayList<LuggageCarriageEnumeration>();
        }
        return this.luggageCarriageFacilityList;
    }

    /**
     * Gets the value of the serviceReservationFacilityList property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the serviceReservationFacilityList property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getServiceReservationFacilityList().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ReservationEnumeration }
     * 
     * 
     */
    public List<ReservationEnumeration> getServiceReservationFacilityList() {
        if (serviceReservationFacilityList == null) {
            serviceReservationFacilityList = new ArrayList<ReservationEnumeration>();
        }
        return this.serviceReservationFacilityList;
    }

    /**
     * Gets the value of the uicProductCharacteristicList property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the uicProductCharacteristicList property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getUicProductCharacteristicList().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link UicProductCharacteristicEnumeration }
     * 
     * 
     */
    public List<UicProductCharacteristicEnumeration> getUicProductCharacteristicList() {
        if (uicProductCharacteristicList == null) {
            uicProductCharacteristicList = new ArrayList<UicProductCharacteristicEnumeration>();
        }
        return this.uicProductCharacteristicList;
    }

    /**
     * Ruft den Wert der uicTrainRate-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link UicRateTypeEnumeration }
     *     
     */
    public UicRateTypeEnumeration getUicTrainRate() {
        return uicTrainRate;
    }

    /**
     * Legt den Wert der uicTrainRate-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link UicRateTypeEnumeration }
     *     
     */
    public void setUicTrainRate(UicRateTypeEnumeration value) {
        this.uicTrainRate = value;
    }

    /**
     * Ruft den Wert der accommodations-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link AccommodationsRelStructure }
     *     
     */
    public AccommodationsRelStructure getAccommodations() {
        return accommodations;
    }

    /**
     * Legt den Wert der accommodations-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link AccommodationsRelStructure }
     *     
     */
    public void setAccommodations(AccommodationsRelStructure value) {
        this.accommodations = value;
    }

    /**
     * Ruft den Wert der onboardStays-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link OnboardStaysRelStructure }
     *     
     */
    public OnboardStaysRelStructure getOnboardStays() {
        return onboardStays;
    }

    /**
     * Legt den Wert der onboardStays-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link OnboardStaysRelStructure }
     *     
     */
    public void setOnboardStays(OnboardStaysRelStructure value) {
        this.onboardStays = value;
    }

}
