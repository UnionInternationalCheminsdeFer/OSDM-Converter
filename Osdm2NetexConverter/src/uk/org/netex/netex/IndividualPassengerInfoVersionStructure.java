//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// �nderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2026.05.22 um 10:24:00 AM CEST 
//


package uk.org.netex.netex;

import java.math.BigDecimal;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * Type for INDIVIDUAL PASSENGER INFO.
 * 
 * <p>Java-Klasse f�r IndividualPassengerInfo_VersionStructure complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="IndividualPassengerInfo_VersionStructure">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.netex.org.uk/netex}DataManagedObjectStructure">
 *       &lt;sequence>
 *         &lt;group ref="{http://www.netex.org.uk/netex}IndividualPassengerInfoGroup"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "IndividualPassengerInfo_VersionStructure", propOrder = {
    "individualTravellerRef",
    "ranking",
    "lastTripDate",
    "commentsAbout",
    "travellingWithPet",
    "reviews"
})
@XmlSeeAlso({
    IndividualPassengerInfo.class
})
public class IndividualPassengerInfoVersionStructure
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
