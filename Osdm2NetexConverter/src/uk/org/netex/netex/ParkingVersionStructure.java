//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// �nderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2026.05.22 um 10:24:00 AM CEST 
//


package uk.org.netex.netex;

import java.math.BigDecimal;
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
import jakarta.xml.bind.annotation.adapters.CollapsedStringAdapter;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * Type for a PARKING.
 * 
 * <p>Java-Klasse f�r Parking_VersionStructure complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="Parking_VersionStructure">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.netex.org.uk/netex}Site_VersionStructure">
 *       &lt;sequence>
 *         &lt;group ref="{http://www.netex.org.uk/netex}ParkingGroup"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Parking_VersionStructure", propOrder = {
    "pathLinks",
    "pathJunctions",
    "accesses",
    "navigationPaths",
    "publicCode",
    "label",
    "parkingType",
    "typeOfParkingRef",
    "parkingVehicleTypes",
    "vehicleTypes",
    "parkingLayout",
    "numberOfParkingLevels",
    "principalCapacity",
    "totalCapacity",
    "overnightParkingPermitted",
    "prohibitedForHazardousMaterials",
    "rechargingAvailable",
    "maximumPowerAvailable",
    "secure",
    "realTimeOccupancyAvailable",
    "parkingPaymentProcess",
    "paymentMethods",
    "typesOfPaymentMethod",
    "defaultCurrency",
    "currenciesAccepted",
    "cardsAccepted",
    "parkingReservation",
    "bookingUrl",
    "paymentByMobile",
    "freeParkingOutOfHours",
    "parkingProperties",
    "parkingAreas",
    "vehicleEntrances"
})
@XmlSeeAlso({
    Parking.class,
    RechargingStationVersionStructure.class
})
public class ParkingVersionStructure
    extends SiteVersionStructure
{

    protected SitePathLinksRelStructure pathLinks;
    protected SitePathJunctionsRelStructure pathJunctions;
    protected AccessesRelStructure accesses;
    protected NavigationPathsRelStructure navigationPaths;
    @XmlElement(name = "PublicCode")
    protected PublicCodeStructure publicCode;
    @XmlElement(name = "Label")
    protected MultilingualString label;
    @XmlElement(name = "ParkingType")
    @XmlSchemaType(name = "string")
    protected ParkingTypeEnumeration parkingType;
    @XmlElement(name = "TypeOfParkingRef")
    protected TypeOfParkingRefStructure typeOfParkingRef;
    @XmlList
    @XmlElement(name = "ParkingVehicleTypes")
    protected List<ParkingVehicleEnumeration> parkingVehicleTypes;
    protected TransportTypeRefsRelStructure vehicleTypes;
    @XmlElement(name = "ParkingLayout")
    @XmlSchemaType(name = "string")
    protected ParkingLayoutEnumeration parkingLayout;
    @XmlElement(name = "NumberOfParkingLevels")
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger numberOfParkingLevels;
    @XmlElement(name = "PrincipalCapacity")
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger principalCapacity;
    @XmlElement(name = "TotalCapacity")
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger totalCapacity;
    @XmlElement(name = "OvernightParkingPermitted")
    protected Boolean overnightParkingPermitted;
    @XmlElement(name = "ProhibitedForHazardousMaterials", defaultValue = "true")
    protected Boolean prohibitedForHazardousMaterials;
    @XmlElement(name = "RechargingAvailable")
    protected Boolean rechargingAvailable;
    @XmlElement(name = "MaximumPowerAvailable")
    protected BigDecimal maximumPowerAvailable;
    @XmlElement(name = "Secure")
    protected Boolean secure;
    @XmlElement(name = "RealTimeOccupancyAvailable")
    protected Boolean realTimeOccupancyAvailable;
    @XmlList
    @XmlElement(name = "ParkingPaymentProcess")
    protected List<ParkingPaymentProcessEnumeration> parkingPaymentProcess;
    @XmlList
    @XmlElement(name = "PaymentMethods")
    protected List<PaymentMethodEnumeration> paymentMethods;
    protected TypeOfPaymentMethodRefsRelStructure typesOfPaymentMethod;
    @XmlElement(name = "DefaultCurrency")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NMTOKEN")
    protected String defaultCurrency;
    @XmlList
    @XmlElement(name = "CurrenciesAccepted")
    protected List<String> currenciesAccepted;
    @XmlList
    @XmlElement(name = "CardsAccepted")
    @XmlSchemaType(name = "NMTOKENS")
    protected List<String> cardsAccepted;
    @XmlElement(name = "ParkingReservation")
    @XmlSchemaType(name = "string")
    protected ParkingReservationEnumeration parkingReservation;
    @XmlElement(name = "BookingUrl")
    @XmlSchemaType(name = "anyURI")
    protected String bookingUrl;
    @XmlElement(name = "PaymentByMobile")
    protected PaymentByMobileStructure paymentByMobile;
    @XmlElement(name = "FreeParkingOutOfHours", defaultValue = "true")
    protected Boolean freeParkingOutOfHours;
    protected ParkingPropertiesRelStructure parkingProperties;
    protected ParkingAreasRelStructure parkingAreas;
    protected ParkingEntrancesForVehiclesRelStructure vehicleEntrances;

    /**
     * Ruft den Wert der pathLinks-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link SitePathLinksRelStructure }
     *     
     */
    public SitePathLinksRelStructure getPathLinks() {
        return pathLinks;
    }

    /**
     * Legt den Wert der pathLinks-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link SitePathLinksRelStructure }
     *     
     */
    public void setPathLinks(SitePathLinksRelStructure value) {
        this.pathLinks = value;
    }

    /**
     * Ruft den Wert der pathJunctions-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link SitePathJunctionsRelStructure }
     *     
     */
    public SitePathJunctionsRelStructure getPathJunctions() {
        return pathJunctions;
    }

    /**
     * Legt den Wert der pathJunctions-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link SitePathJunctionsRelStructure }
     *     
     */
    public void setPathJunctions(SitePathJunctionsRelStructure value) {
        this.pathJunctions = value;
    }

    /**
     * Ruft den Wert der accesses-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link AccessesRelStructure }
     *     
     */
    public AccessesRelStructure getAccesses() {
        return accesses;
    }

    /**
     * Legt den Wert der accesses-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link AccessesRelStructure }
     *     
     */
    public void setAccesses(AccessesRelStructure value) {
        this.accesses = value;
    }

    /**
     * Ruft den Wert der navigationPaths-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link NavigationPathsRelStructure }
     *     
     */
    public NavigationPathsRelStructure getNavigationPaths() {
        return navigationPaths;
    }

    /**
     * Legt den Wert der navigationPaths-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link NavigationPathsRelStructure }
     *     
     */
    public void setNavigationPaths(NavigationPathsRelStructure value) {
        this.navigationPaths = value;
    }

    /**
     * Ruft den Wert der publicCode-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link PublicCodeStructure }
     *     
     */
    public PublicCodeStructure getPublicCode() {
        return publicCode;
    }

    /**
     * Legt den Wert der publicCode-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link PublicCodeStructure }
     *     
     */
    public void setPublicCode(PublicCodeStructure value) {
        this.publicCode = value;
    }

    /**
     * Ruft den Wert der label-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link MultilingualString }
     *     
     */
    public MultilingualString getLabel() {
        return label;
    }

    /**
     * Legt den Wert der label-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link MultilingualString }
     *     
     */
    public void setLabel(MultilingualString value) {
        this.label = value;
    }

    /**
     * Ruft den Wert der parkingType-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ParkingTypeEnumeration }
     *     
     */
    public ParkingTypeEnumeration getParkingType() {
        return parkingType;
    }

    /**
     * Legt den Wert der parkingType-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ParkingTypeEnumeration }
     *     
     */
    public void setParkingType(ParkingTypeEnumeration value) {
        this.parkingType = value;
    }

    /**
     * Reference to a TYPE OF PARKING. +v1.2.2
     * 
     * @return
     *     possible object is
     *     {@link TypeOfParkingRefStructure }
     *     
     */
    public TypeOfParkingRefStructure getTypeOfParkingRef() {
        return typeOfParkingRef;
    }

    /**
     * Legt den Wert der typeOfParkingRef-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeOfParkingRefStructure }
     *     
     */
    public void setTypeOfParkingRef(TypeOfParkingRefStructure value) {
        this.typeOfParkingRef = value;
    }

    /**
     * Gets the value of the parkingVehicleTypes property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the parkingVehicleTypes property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getParkingVehicleTypes().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ParkingVehicleEnumeration }
     * 
     * 
     */
    public List<ParkingVehicleEnumeration> getParkingVehicleTypes() {
        if (parkingVehicleTypes == null) {
            parkingVehicleTypes = new ArrayList<ParkingVehicleEnumeration>();
        }
        return this.parkingVehicleTypes;
    }

    /**
     * Ruft den Wert der vehicleTypes-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link TransportTypeRefsRelStructure }
     *     
     */
    public TransportTypeRefsRelStructure getVehicleTypes() {
        return vehicleTypes;
    }

    /**
     * Legt den Wert der vehicleTypes-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link TransportTypeRefsRelStructure }
     *     
     */
    public void setVehicleTypes(TransportTypeRefsRelStructure value) {
        this.vehicleTypes = value;
    }

    /**
     * Ruft den Wert der parkingLayout-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ParkingLayoutEnumeration }
     *     
     */
    public ParkingLayoutEnumeration getParkingLayout() {
        return parkingLayout;
    }

    /**
     * Legt den Wert der parkingLayout-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ParkingLayoutEnumeration }
     *     
     */
    public void setParkingLayout(ParkingLayoutEnumeration value) {
        this.parkingLayout = value;
    }

    /**
     * Ruft den Wert der numberOfParkingLevels-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getNumberOfParkingLevels() {
        return numberOfParkingLevels;
    }

    /**
     * Legt den Wert der numberOfParkingLevels-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setNumberOfParkingLevels(BigInteger value) {
        this.numberOfParkingLevels = value;
    }

    /**
     * Ruft den Wert der principalCapacity-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getPrincipalCapacity() {
        return principalCapacity;
    }

    /**
     * Legt den Wert der principalCapacity-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setPrincipalCapacity(BigInteger value) {
        this.principalCapacity = value;
    }

    /**
     * Ruft den Wert der totalCapacity-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getTotalCapacity() {
        return totalCapacity;
    }

    /**
     * Legt den Wert der totalCapacity-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setTotalCapacity(BigInteger value) {
        this.totalCapacity = value;
    }

    /**
     * Ruft den Wert der overnightParkingPermitted-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isOvernightParkingPermitted() {
        return overnightParkingPermitted;
    }

    /**
     * Legt den Wert der overnightParkingPermitted-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setOvernightParkingPermitted(Boolean value) {
        this.overnightParkingPermitted = value;
    }

    /**
     * Ruft den Wert der prohibitedForHazardousMaterials-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isProhibitedForHazardousMaterials() {
        return prohibitedForHazardousMaterials;
    }

    /**
     * Legt den Wert der prohibitedForHazardousMaterials-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setProhibitedForHazardousMaterials(Boolean value) {
        this.prohibitedForHazardousMaterials = value;
    }

    /**
     * Ruft den Wert der rechargingAvailable-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isRechargingAvailable() {
        return rechargingAvailable;
    }

    /**
     * Legt den Wert der rechargingAvailable-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setRechargingAvailable(Boolean value) {
        this.rechargingAvailable = value;
    }

    /**
     * Ruft den Wert der maximumPowerAvailable-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMaximumPowerAvailable() {
        return maximumPowerAvailable;
    }

    /**
     * Legt den Wert der maximumPowerAvailable-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMaximumPowerAvailable(BigDecimal value) {
        this.maximumPowerAvailable = value;
    }

    /**
     * Ruft den Wert der secure-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSecure() {
        return secure;
    }

    /**
     * Legt den Wert der secure-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSecure(Boolean value) {
        this.secure = value;
    }

    /**
     * Ruft den Wert der realTimeOccupancyAvailable-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isRealTimeOccupancyAvailable() {
        return realTimeOccupancyAvailable;
    }

    /**
     * Legt den Wert der realTimeOccupancyAvailable-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setRealTimeOccupancyAvailable(Boolean value) {
        this.realTimeOccupancyAvailable = value;
    }

    /**
     * Gets the value of the parkingPaymentProcess property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the parkingPaymentProcess property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getParkingPaymentProcess().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ParkingPaymentProcessEnumeration }
     * 
     * 
     */
    public List<ParkingPaymentProcessEnumeration> getParkingPaymentProcess() {
        if (parkingPaymentProcess == null) {
            parkingPaymentProcess = new ArrayList<ParkingPaymentProcessEnumeration>();
        }
        return this.parkingPaymentProcess;
    }

    /**
     * Gets the value of the paymentMethods property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the paymentMethods property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPaymentMethods().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PaymentMethodEnumeration }
     * 
     * 
     */
    public List<PaymentMethodEnumeration> getPaymentMethods() {
        if (paymentMethods == null) {
            paymentMethods = new ArrayList<PaymentMethodEnumeration>();
        }
        return this.paymentMethods;
    }

    /**
     * Ruft den Wert der typesOfPaymentMethod-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link TypeOfPaymentMethodRefsRelStructure }
     *     
     */
    public TypeOfPaymentMethodRefsRelStructure getTypesOfPaymentMethod() {
        return typesOfPaymentMethod;
    }

    /**
     * Legt den Wert der typesOfPaymentMethod-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeOfPaymentMethodRefsRelStructure }
     *     
     */
    public void setTypesOfPaymentMethod(TypeOfPaymentMethodRefsRelStructure value) {
        this.typesOfPaymentMethod = value;
    }

    /**
     * Ruft den Wert der defaultCurrency-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDefaultCurrency() {
        return defaultCurrency;
    }

    /**
     * Legt den Wert der defaultCurrency-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDefaultCurrency(String value) {
        this.defaultCurrency = value;
    }

    /**
     * Gets the value of the currenciesAccepted property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the currenciesAccepted property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCurrenciesAccepted().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getCurrenciesAccepted() {
        if (currenciesAccepted == null) {
            currenciesAccepted = new ArrayList<String>();
        }
        return this.currenciesAccepted;
    }

    /**
     * Gets the value of the cardsAccepted property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the cardsAccepted property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCardsAccepted().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getCardsAccepted() {
        if (cardsAccepted == null) {
            cardsAccepted = new ArrayList<String>();
        }
        return this.cardsAccepted;
    }

    /**
     * Ruft den Wert der parkingReservation-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ParkingReservationEnumeration }
     *     
     */
    public ParkingReservationEnumeration getParkingReservation() {
        return parkingReservation;
    }

    /**
     * Legt den Wert der parkingReservation-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ParkingReservationEnumeration }
     *     
     */
    public void setParkingReservation(ParkingReservationEnumeration value) {
        this.parkingReservation = value;
    }

    /**
     * Ruft den Wert der bookingUrl-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBookingUrl() {
        return bookingUrl;
    }

    /**
     * Legt den Wert der bookingUrl-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBookingUrl(String value) {
        this.bookingUrl = value;
    }

    /**
     * Ruft den Wert der paymentByMobile-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link PaymentByMobileStructure }
     *     
     */
    public PaymentByMobileStructure getPaymentByMobile() {
        return paymentByMobile;
    }

    /**
     * Legt den Wert der paymentByMobile-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link PaymentByMobileStructure }
     *     
     */
    public void setPaymentByMobile(PaymentByMobileStructure value) {
        this.paymentByMobile = value;
    }

    /**
     * Ruft den Wert der freeParkingOutOfHours-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isFreeParkingOutOfHours() {
        return freeParkingOutOfHours;
    }

    /**
     * Legt den Wert der freeParkingOutOfHours-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setFreeParkingOutOfHours(Boolean value) {
        this.freeParkingOutOfHours = value;
    }

    /**
     * Ruft den Wert der parkingProperties-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ParkingPropertiesRelStructure }
     *     
     */
    public ParkingPropertiesRelStructure getParkingProperties() {
        return parkingProperties;
    }

    /**
     * Legt den Wert der parkingProperties-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ParkingPropertiesRelStructure }
     *     
     */
    public void setParkingProperties(ParkingPropertiesRelStructure value) {
        this.parkingProperties = value;
    }

    /**
     * Ruft den Wert der parkingAreas-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ParkingAreasRelStructure }
     *     
     */
    public ParkingAreasRelStructure getParkingAreas() {
        return parkingAreas;
    }

    /**
     * Legt den Wert der parkingAreas-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ParkingAreasRelStructure }
     *     
     */
    public void setParkingAreas(ParkingAreasRelStructure value) {
        this.parkingAreas = value;
    }

    /**
     * Ruft den Wert der vehicleEntrances-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ParkingEntrancesForVehiclesRelStructure }
     *     
     */
    public ParkingEntrancesForVehiclesRelStructure getVehicleEntrances() {
        return vehicleEntrances;
    }

    /**
     * Legt den Wert der vehicleEntrances-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ParkingEntrancesForVehiclesRelStructure }
     *     
     */
    public void setVehicleEntrances(ParkingEntrancesForVehiclesRelStructure value) {
        this.vehicleEntrances = value;
    }

}
