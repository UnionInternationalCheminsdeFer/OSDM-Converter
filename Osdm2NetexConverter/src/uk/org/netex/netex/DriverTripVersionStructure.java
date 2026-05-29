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
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;
import javax.xml.datatype.Duration;


/**
 * Type for DRIVER TRIP.
 * 
 * <p>Java-Klasse f�r DriverTrip_VersionStructure complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="DriverTrip_VersionStructure">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.netex.org.uk/netex}DataManagedObjectStructure">
 *       &lt;sequence>
 *         &lt;group ref="{http://www.netex.org.uk/netex}DriverTripGroup"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DriverTrip_VersionStructure", propOrder = {
    "description",
    "startPointRef",
    "endPointRef",
    "accountingTime",
    "accountingFactor",
    "tripTimes"
})
@XmlSeeAlso({
    DriverTrip.class
})
public class DriverTripVersionStructure
    extends DataManagedObjectStructure
{

    @XmlElement(name = "Description")
    protected MultilingualString description;
    @XmlElement(name = "StartPointRef")
    protected TimingPointRefStructure startPointRef;
    @XmlElement(name = "EndPointRef")
    protected TimingPointRefStructure endPointRef;
    @XmlElement(name = "AccountingTime")
    protected Duration accountingTime;
    @XmlElement(name = "AccountingFactor")
    protected BigDecimal accountingFactor;
    protected DriverTripTimesRelStructure tripTimes;

    /**
     * Ruft den Wert der description-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link MultilingualString }
     *     
     */
    public MultilingualString getDescription() {
        return description;
    }

    /**
     * Legt den Wert der description-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link MultilingualString }
     *     
     */
    public void setDescription(MultilingualString value) {
        this.description = value;
    }

    /**
     * Ruft den Wert der startPointRef-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link TimingPointRefStructure }
     *     
     */
    public TimingPointRefStructure getStartPointRef() {
        return startPointRef;
    }

    /**
     * Legt den Wert der startPointRef-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link TimingPointRefStructure }
     *     
     */
    public void setStartPointRef(TimingPointRefStructure value) {
        this.startPointRef = value;
    }

    /**
     * Ruft den Wert der endPointRef-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link TimingPointRefStructure }
     *     
     */
    public TimingPointRefStructure getEndPointRef() {
        return endPointRef;
    }

    /**
     * Legt den Wert der endPointRef-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link TimingPointRefStructure }
     *     
     */
    public void setEndPointRef(TimingPointRefStructure value) {
        this.endPointRef = value;
    }

    /**
     * Ruft den Wert der accountingTime-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Duration }
     *     
     */
    public Duration getAccountingTime() {
        return accountingTime;
    }

    /**
     * Legt den Wert der accountingTime-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Duration }
     *     
     */
    public void setAccountingTime(Duration value) {
        this.accountingTime = value;
    }

    /**
     * Ruft den Wert der accountingFactor-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getAccountingFactor() {
        return accountingFactor;
    }

    /**
     * Legt den Wert der accountingFactor-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setAccountingFactor(BigDecimal value) {
        this.accountingFactor = value;
    }

    /**
     * Ruft den Wert der tripTimes-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link DriverTripTimesRelStructure }
     *     
     */
    public DriverTripTimesRelStructure getTripTimes() {
        return tripTimes;
    }

    /**
     * Legt den Wert der tripTimes-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link DriverTripTimesRelStructure }
     *     
     */
    public void setTripTimes(DriverTripTimesRelStructure value) {
        this.tripTimes = value;
    }

}
