//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// �nderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2026.05.22 um 10:24:00 AM CEST 
//


package uk.org.netex.netex;

import java.math.BigDecimal;
import java.math.BigInteger;
import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlElementRef;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * Type for VEHICLE POOLING DRIVER INFO.
 * 
 * <p>Java-Klasse f�r VehiclePoolingDriverInfo_VersionStructure complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="VehiclePoolingDriverInfo_VersionStructure">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.netex.org.uk/netex}DataManagedObjectStructure">
 *       &lt;sequence>
 *         &lt;group ref="{http://www.netex.org.uk/netex}VehiclePoolingDriverInfoGroup"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VehiclePoolingDriverInfo_VersionStructure", propOrder = {
    "individualTravellerRef",
    "ranking",
    "lastTripDate",
    "commentsAbout",
    "travellingWithPet",
    "drivingLicenceVerified",
    "insuranceVerified",
    "drivingStyle",
    "numberOfProposedTrips",
    "numberOfTravellersCarried",
    "vehicleRef",
    "reviews"
})
@XmlSeeAlso({
    VehiclePoolingDriverInfo.class
})
public class VehiclePoolingDriverInfoVersionStructure
    extends DataManagedObjectStructure
{

    @XmlElement(name = "IndividualTravellerRef")
    protected IndividualTravellerRefStructure individualTravellerRef;
    @XmlElement(name = "Ranking")
    protected BigDecimal ranking;
    @XmlElement(name = "LastTripDate")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar lastTripDate;
    @XmlElement(name = "CommentsAbout")
    protected MultilingualString commentsAbout;
    @XmlElement(name = "TravellingWithPet")
    protected Boolean travellingWithPet;
    @XmlElement(name = "DrivingLicenceVerified")
    protected Boolean drivingLicenceVerified;
    @XmlElement(name = "InsuranceVerified")
    protected Boolean insuranceVerified;
    @XmlElement(name = "DrivingStyle")
    @XmlSchemaType(name = "normalizedString")
    protected DrivingStyleEnumeration drivingStyle;
    @XmlElement(name = "NumberOfProposedTrips")
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger numberOfProposedTrips;
    @XmlElement(name = "NumberOfTravellersCarried")
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger numberOfTravellersCarried;
    @XmlElementRef(name = "VehicleRef", namespace = "http://www.netex.org.uk/netex", type = JAXBElement.class, required = false)
    protected JAXBElement<? extends VehicleRefStructure> vehicleRef;
    protected ReviewsRelStructure reviews;

    /**
     * Ruft den Wert der individualTravellerRef-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link IndividualTravellerRefStructure }
     *     
     */
    public IndividualTravellerRefStructure getIndividualTravellerRef() {
        return individualTravellerRef;
    }

    /**
     * Legt den Wert der individualTravellerRef-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link IndividualTravellerRefStructure }
     *     
     */
    public void setIndividualTravellerRef(IndividualTravellerRefStructure value) {
        this.individualTravellerRef = value;
    }

    /**
     * Ruft den Wert der ranking-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getRanking() {
        return ranking;
    }

    /**
     * Legt den Wert der ranking-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setRanking(BigDecimal value) {
        this.ranking = value;
    }

    /**
     * Ruft den Wert der lastTripDate-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getLastTripDate() {
        return lastTripDate;
    }

    /**
     * Legt den Wert der lastTripDate-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setLastTripDate(XMLGregorianCalendar value) {
        this.lastTripDate = value;
    }

    /**
     * Ruft den Wert der commentsAbout-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link MultilingualString }
     *     
     */
    public MultilingualString getCommentsAbout() {
        return commentsAbout;
    }

    /**
     * Legt den Wert der commentsAbout-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link MultilingualString }
     *     
     */
    public void setCommentsAbout(MultilingualString value) {
        this.commentsAbout = value;
    }

    /**
     * Ruft den Wert der travellingWithPet-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isTravellingWithPet() {
        return travellingWithPet;
    }

    /**
     * Legt den Wert der travellingWithPet-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setTravellingWithPet(Boolean value) {
        this.travellingWithPet = value;
    }

    /**
     * Ruft den Wert der drivingLicenceVerified-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDrivingLicenceVerified() {
        return drivingLicenceVerified;
    }

    /**
     * Legt den Wert der drivingLicenceVerified-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDrivingLicenceVerified(Boolean value) {
        this.drivingLicenceVerified = value;
    }

    /**
     * Ruft den Wert der insuranceVerified-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isInsuranceVerified() {
        return insuranceVerified;
    }

    /**
     * Legt den Wert der insuranceVerified-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setInsuranceVerified(Boolean value) {
        this.insuranceVerified = value;
    }

    /**
     * Ruft den Wert der drivingStyle-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link DrivingStyleEnumeration }
     *     
     */
    public DrivingStyleEnumeration getDrivingStyle() {
        return drivingStyle;
    }

    /**
     * Legt den Wert der drivingStyle-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link DrivingStyleEnumeration }
     *     
     */
    public void setDrivingStyle(DrivingStyleEnumeration value) {
        this.drivingStyle = value;
    }

    /**
     * Ruft den Wert der numberOfProposedTrips-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getNumberOfProposedTrips() {
        return numberOfProposedTrips;
    }

    /**
     * Legt den Wert der numberOfProposedTrips-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setNumberOfProposedTrips(BigInteger value) {
        this.numberOfProposedTrips = value;
    }

    /**
     * Ruft den Wert der numberOfTravellersCarried-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getNumberOfTravellersCarried() {
        return numberOfTravellersCarried;
    }

    /**
     * Legt den Wert der numberOfTravellersCarried-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setNumberOfTravellersCarried(BigInteger value) {
        this.numberOfTravellersCarried = value;
    }

    /**
     * Ruft den Wert der vehicleRef-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link TractiveRollingStockItemRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link VehicleRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link TrailingRollingStockItemRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link RollingStockItemRefStructure }{@code >}
     *     
     */
    public JAXBElement<? extends VehicleRefStructure> getVehicleRef() {
        return vehicleRef;
    }

    /**
     * Legt den Wert der vehicleRef-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link TractiveRollingStockItemRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link VehicleRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link TrailingRollingStockItemRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link RollingStockItemRefStructure }{@code >}
     *     
     */
    public void setVehicleRef(JAXBElement<? extends VehicleRefStructure> value) {
        this.vehicleRef = value;
    }

    /**
     * Ruft den Wert der reviews-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ReviewsRelStructure }
     *     
     */
    public ReviewsRelStructure getReviews() {
        return reviews;
    }

    /**
     * Legt den Wert der reviews-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ReviewsRelStructure }
     *     
     */
    public void setReviews(ReviewsRelStructure value) {
        this.reviews = value;
    }

}
