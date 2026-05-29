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
 * Type for JOURNEY.
 * 
 * <p>Java-Klasse f�r Journey_VersionStructure complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="Journey_VersionStructure">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.netex.org.uk/netex}LinkSequence_VersionStructure">
 *       &lt;group ref="{http://www.netex.org.uk/netex}JourneyGroup"/>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Journey_VersionStructure", propOrder = {
    "transportMode",
    "transportSubmode",
    "externalVehicleJourneyRef",
    "typeOfProductCategoryRef",
    "typeOfServiceRef",
    "linkSequenceProjectionRef",
    "linkSequenceProjection",
    "monitored",
    "accessibilityAssessment",
    "journeyAccountings",
    "noticeAssignments",
    "occupancies"
})
@XmlSeeAlso({
    Journey.class,
    TemplateVehicleJourneyVersionStructure.class,
    SingleJourneyVersionStructure.class,
    VehicleJourneyVersionStructure.class,
    ServiceJourneyVersionStructure.class,
    SpecialServiceVersionStructure.class
})
public class JourneyVersionStructure
    extends LinkSequenceVersionStructure
{

    @XmlElement(name = "TransportMode")
    @XmlSchemaType(name = "NMTOKEN")
    protected AllPublicTransportModesEnumeration transportMode;
    @XmlElement(name = "TransportSubmode")
    protected TransportSubmodeStructure transportSubmode;
    @XmlElement(name = "ExternalVehicleJourneyRef")
    protected ExternalObjectRefStructure externalVehicleJourneyRef;
    @XmlElement(name = "TypeOfProductCategoryRef")
    protected TypeOfProductCategoryRefStructure typeOfProductCategoryRef;
    @XmlElement(name = "TypeOfServiceRef")
    protected TypeOfServiceRefStructure typeOfServiceRef;
    @XmlElement(name = "LinkSequenceProjectionRef")
    protected LinkSequenceProjectionRefStructure linkSequenceProjectionRef;
    @XmlElement(name = "LinkSequenceProjection")
    protected LinkSequenceProjection linkSequenceProjection;
    @XmlElement(name = "Monitored")
    protected Boolean monitored;
    @XmlElement(name = "AccessibilityAssessment")
    protected AccessibilityAssessment accessibilityAssessment;
    protected JourneyAccountingsRelStructure journeyAccountings;
    protected NoticeAssignmentsRelStructure noticeAssignments;
    protected OccupancyViewRelStructure occupancies;

    /**
     * Ruft den Wert der transportMode-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link AllPublicTransportModesEnumeration }
     *     
     */
    public AllPublicTransportModesEnumeration getTransportMode() {
        return transportMode;
    }

    /**
     * Legt den Wert der transportMode-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link AllPublicTransportModesEnumeration }
     *     
     */
    public void setTransportMode(AllPublicTransportModesEnumeration value) {
        this.transportMode = value;
    }

    /**
     * Ruft den Wert der transportSubmode-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link TransportSubmodeStructure }
     *     
     */
    public TransportSubmodeStructure getTransportSubmode() {
        return transportSubmode;
    }

    /**
     * Legt den Wert der transportSubmode-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link TransportSubmodeStructure }
     *     
     */
    public void setTransportSubmode(TransportSubmodeStructure value) {
        this.transportSubmode = value;
    }

    /**
     * Ruft den Wert der externalVehicleJourneyRef-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ExternalObjectRefStructure }
     *     
     */
    public ExternalObjectRefStructure getExternalVehicleJourneyRef() {
        return externalVehicleJourneyRef;
    }

    /**
     * Legt den Wert der externalVehicleJourneyRef-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ExternalObjectRefStructure }
     *     
     */
    public void setExternalVehicleJourneyRef(ExternalObjectRefStructure value) {
        this.externalVehicleJourneyRef = value;
    }

    /**
     * Ruft den Wert der typeOfProductCategoryRef-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link TypeOfProductCategoryRefStructure }
     *     
     */
    public TypeOfProductCategoryRefStructure getTypeOfProductCategoryRef() {
        return typeOfProductCategoryRef;
    }

    /**
     * Legt den Wert der typeOfProductCategoryRef-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeOfProductCategoryRefStructure }
     *     
     */
    public void setTypeOfProductCategoryRef(TypeOfProductCategoryRefStructure value) {
        this.typeOfProductCategoryRef = value;
    }

    /**
     * Ruft den Wert der typeOfServiceRef-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link TypeOfServiceRefStructure }
     *     
     */
    public TypeOfServiceRefStructure getTypeOfServiceRef() {
        return typeOfServiceRef;
    }

    /**
     * Legt den Wert der typeOfServiceRef-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeOfServiceRefStructure }
     *     
     */
    public void setTypeOfServiceRef(TypeOfServiceRefStructure value) {
        this.typeOfServiceRef = value;
    }

    /**
     * Ruft den Wert der linkSequenceProjectionRef-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link LinkSequenceProjectionRefStructure }
     *     
     */
    public LinkSequenceProjectionRefStructure getLinkSequenceProjectionRef() {
        return linkSequenceProjectionRef;
    }

    /**
     * Legt den Wert der linkSequenceProjectionRef-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link LinkSequenceProjectionRefStructure }
     *     
     */
    public void setLinkSequenceProjectionRef(LinkSequenceProjectionRefStructure value) {
        this.linkSequenceProjectionRef = value;
    }

    /**
     * Ruft den Wert der linkSequenceProjection-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link LinkSequenceProjection }
     *     
     */
    public LinkSequenceProjection getLinkSequenceProjection() {
        return linkSequenceProjection;
    }

    /**
     * Legt den Wert der linkSequenceProjection-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link LinkSequenceProjection }
     *     
     */
    public void setLinkSequenceProjection(LinkSequenceProjection value) {
        this.linkSequenceProjection = value;
    }

    /**
     * Ruft den Wert der monitored-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMonitored() {
        return monitored;
    }

    /**
     * Legt den Wert der monitored-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMonitored(Boolean value) {
        this.monitored = value;
    }

    /**
     * Ruft den Wert der accessibilityAssessment-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link AccessibilityAssessment }
     *     
     */
    public AccessibilityAssessment getAccessibilityAssessment() {
        return accessibilityAssessment;
    }

    /**
     * Legt den Wert der accessibilityAssessment-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link AccessibilityAssessment }
     *     
     */
    public void setAccessibilityAssessment(AccessibilityAssessment value) {
        this.accessibilityAssessment = value;
    }

    /**
     * Ruft den Wert der journeyAccountings-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JourneyAccountingsRelStructure }
     *     
     */
    public JourneyAccountingsRelStructure getJourneyAccountings() {
        return journeyAccountings;
    }

    /**
     * Legt den Wert der journeyAccountings-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JourneyAccountingsRelStructure }
     *     
     */
    public void setJourneyAccountings(JourneyAccountingsRelStructure value) {
        this.journeyAccountings = value;
    }

    /**
     * Ruft den Wert der noticeAssignments-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link NoticeAssignmentsRelStructure }
     *     
     */
    public NoticeAssignmentsRelStructure getNoticeAssignments() {
        return noticeAssignments;
    }

    /**
     * Legt den Wert der noticeAssignments-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link NoticeAssignmentsRelStructure }
     *     
     */
    public void setNoticeAssignments(NoticeAssignmentsRelStructure value) {
        this.noticeAssignments = value;
    }

    /**
     * Ruft den Wert der occupancies-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link OccupancyViewRelStructure }
     *     
     */
    public OccupancyViewRelStructure getOccupancies() {
        return occupancies;
    }

    /**
     * Legt den Wert der occupancies-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link OccupancyViewRelStructure }
     *     
     */
    public void setOccupancies(OccupancyViewRelStructure value) {
        this.occupancies = value;
    }

}
