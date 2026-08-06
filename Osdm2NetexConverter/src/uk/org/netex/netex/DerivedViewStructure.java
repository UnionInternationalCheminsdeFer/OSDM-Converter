//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// �nderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2026.05.22 um 10:24:00 AM CEST 
//


package uk.org.netex.netex;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.NormalizedStringAdapter;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * Type for MANAGED OBJECT VIEW.
 * 
 * <p>Java-Klasse f�r DerivedViewStructure complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="DerivedViewStructure">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;group ref="{http://www.netex.org.uk/netex}DerivedViewGroup"/>
 *       &lt;/sequence>
 *       &lt;attribute name="id" type="{http://www.netex.org.uk/netex}ObjectIdType" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DerivedViewStructure", propOrder = {
    "brandingRef"
})
@XmlSeeAlso({
    JourneyMeetingDerivedViewStructure.class,
    ConnectingServiceJourneyDerivedViewStructure.class,
    DistanceMatrixElementDerivedViewStructure.class,
    StopPointInJourneyPatternDerivedViewStructure.class,
    ZoneDerivedViewStructure.class,
    ScheduledStopPointDerivedViewStructure.class,
    PointOfInterestClassificationDerivedViewStructure.class,
    PointOfInterestDerivedViewStructure.class,
    ServiceJourneyInterchangeDerivedViewStructure.class,
    JourneyPatternDerivedViewStructure.class,
    NoticeAssignmentDerivedViewStructure.class,
    PassengerStopAssignmentDerivedViewStructure.class,
    TopographicPlaceDerivedViewStructure.class,
    RouteDerivedViewStructure.class,
    OperatorDerivedViewStructure.class,
    DestinationDisplayDerivedViewStructure.class,
    OnwardServiceLinkDerivedViewStructure.class,
    TrainComponentDerivedViewStructure.class,
    DirectionDerivedViewStructure.class,
    GenericPathLinkDerivedViewStructure.class,
    OrganisationDerivedViewStructure.class,
    PassengerCarryingPassengerCarryingViewStructure.class,
    StopPlaceDerivedViewStructure.class,
    OnwardTimingLinkDerivedViewStructure.class,
    OperatingDayDerivedViewStructure.class,
    LineDerivedViewStructure.class,
    NetworkDerivedViewStructure.class,
    GroupOfServicesEndPointDerivedViewStructure.class
})
public abstract class DerivedViewStructure {

    @XmlElement(name = "BrandingRef")
    protected BrandingRefStructure brandingRef;
    @XmlAttribute(name = "id")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String id;

    /**
     * Ruft den Wert der brandingRef-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BrandingRefStructure }
     *     
     */
    public BrandingRefStructure getBrandingRef() {
        return brandingRef;
    }

    /**
     * Legt den Wert der brandingRef-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BrandingRefStructure }
     *     
     */
    public void setBrandingRef(BrandingRefStructure value) {
        this.brandingRef = value;
    }

    /**
     * Ruft den Wert der id-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getId() {
        return id;
    }

    /**
     * Legt den Wert der id-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setId(String value) {
        this.id = value;
    }

}
