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
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Data type for Planned VEHICLE JOURNEY (Production Timetable Service).
 * 
 * <p>Java-Klasse f�r DatedServiceJourney_VersionStructure complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="DatedServiceJourney_VersionStructure">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.netex.org.uk/netex}ServiceJourney_VersionStructure">
 *       &lt;sequence>
 *         &lt;group ref="{http://www.netex.org.uk/netex}DatedServiceJourneyGroup"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DatedServiceJourney_VersionStructure", propOrder = {
    "journeyRef",
    "replacedJourneys",
    "operatingDayRef",
    "operatingDayView",
    "uicOperatingPeriod",
    "externalDatedVehicleJourneyRef",
    "datedJourneyPatternRef",
    "driverRef"
})
@XmlSeeAlso({
    DatedServiceJourney.class
})
public class DatedServiceJourneyVersionStructure
    extends ServiceJourneyVersionStructure
{

    @XmlElementRef(name = "JourneyRef", namespace = "http://www.netex.org.uk/netex", type = JAXBElement.class, required = false)
    protected JAXBElement<? extends JourneyRefStructure> journeyRef;
    protected ReplacedJourneysRelStructure replacedJourneys;
    @XmlElement(name = "OperatingDayRef")
    protected OperatingDayRefStructure operatingDayRef;
    @XmlElement(name = "OperatingDayView")
    protected OperatingDayView operatingDayView;
    @XmlElement(name = "UicOperatingPeriod")
    protected UicOperatingPeriod uicOperatingPeriod;
    @XmlElement(name = "ExternalDatedVehicleJourneyRef")
    protected ExternalObjectRefStructure externalDatedVehicleJourneyRef;
    @XmlElement(name = "DatedJourneyPatternRef")
    protected JourneyPatternRefStructure datedJourneyPatternRef;
    @XmlElement(name = "DriverRef")
    protected DriverRefStructure driverRef;

    /**
     * Ruft den Wert der journeyRef-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link DatedSpecialServiceRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link VehicleJourneyRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link JourneyRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link DeadRunRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link SpecialServiceRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link VehicleJourneyRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link SingleJourneyRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link VehicleJourneyRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link ServiceJourneyRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link TemplateServiceJourneyRefStructure }{@code >}
     *     
     */
    public JAXBElement<? extends JourneyRefStructure> getJourneyRef() {
        return journeyRef;
    }

    /**
     * Legt den Wert der journeyRef-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link DatedSpecialServiceRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link VehicleJourneyRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link JourneyRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link DeadRunRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link SpecialServiceRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link VehicleJourneyRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link SingleJourneyRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link VehicleJourneyRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link ServiceJourneyRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link TemplateServiceJourneyRefStructure }{@code >}
     *     
     */
    public void setJourneyRef(JAXBElement<? extends JourneyRefStructure> value) {
        this.journeyRef = value;
    }

    /**
     * Ruft den Wert der replacedJourneys-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ReplacedJourneysRelStructure }
     *     
     */
    public ReplacedJourneysRelStructure getReplacedJourneys() {
        return replacedJourneys;
    }

    /**
     * Legt den Wert der replacedJourneys-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ReplacedJourneysRelStructure }
     *     
     */
    public void setReplacedJourneys(ReplacedJourneysRelStructure value) {
        this.replacedJourneys = value;
    }

    /**
     * EXPECTED TO BE MANDATORY - left with minOccurs="0" only to avoid breaking compatibility with old rail datasets and also in the case when OperatingDayView is used. +v2.0
     * 
     * @return
     *     possible object is
     *     {@link OperatingDayRefStructure }
     *     
     */
    public OperatingDayRefStructure getOperatingDayRef() {
        return operatingDayRef;
    }

    /**
     * Legt den Wert der operatingDayRef-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link OperatingDayRefStructure }
     *     
     */
    public void setOperatingDayRef(OperatingDayRefStructure value) {
        this.operatingDayRef = value;
    }

    /**
     * Used in some cases, when no OperatingDayRef is used. At least the OPERATING DAY must be provided as date. +v2.0
     * 
     * @return
     *     possible object is
     *     {@link OperatingDayView }
     *     
     */
    public OperatingDayView getOperatingDayView() {
        return operatingDayView;
    }

    /**
     * Legt den Wert der operatingDayView-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link OperatingDayView }
     *     
     */
    public void setOperatingDayView(OperatingDayView value) {
        this.operatingDayView = value;
    }

    /**
     * ** DEPRECATED ** not to be used - left available only to avoid breaking compatibility with old rail datasets -v2.0
     * 
     * @return
     *     possible object is
     *     {@link UicOperatingPeriod }
     *     
     */
    public UicOperatingPeriod getUicOperatingPeriod() {
        return uicOperatingPeriod;
    }

    /**
     * Legt den Wert der uicOperatingPeriod-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link UicOperatingPeriod }
     *     
     */
    public void setUicOperatingPeriod(UicOperatingPeriod value) {
        this.uicOperatingPeriod = value;
    }

    /**
     * Ruft den Wert der externalDatedVehicleJourneyRef-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ExternalObjectRefStructure }
     *     
     */
    public ExternalObjectRefStructure getExternalDatedVehicleJourneyRef() {
        return externalDatedVehicleJourneyRef;
    }

    /**
     * Legt den Wert der externalDatedVehicleJourneyRef-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ExternalObjectRefStructure }
     *     
     */
    public void setExternalDatedVehicleJourneyRef(ExternalObjectRefStructure value) {
        this.externalDatedVehicleJourneyRef = value;
    }

    /**
     * Ruft den Wert der datedJourneyPatternRef-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JourneyPatternRefStructure }
     *     
     */
    public JourneyPatternRefStructure getDatedJourneyPatternRef() {
        return datedJourneyPatternRef;
    }

    /**
     * Legt den Wert der datedJourneyPatternRef-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JourneyPatternRefStructure }
     *     
     */
    public void setDatedJourneyPatternRef(JourneyPatternRefStructure value) {
        this.datedJourneyPatternRef = value;
    }

    /**
     * ** DEPRECATED ** not to be used - It is expected that the driver's DUTY refer the DatedJourneyPattern, not the way arround ! -v2.0
     * 
     * @return
     *     possible object is
     *     {@link DriverRefStructure }
     *     
     */
    public DriverRefStructure getDriverRef() {
        return driverRef;
    }

    /**
     * Legt den Wert der driverRef-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link DriverRefStructure }
     *     
     */
    public void setDriverRef(DriverRefStructure value) {
        this.driverRef = value;
    }

}
