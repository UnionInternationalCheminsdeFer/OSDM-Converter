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


/**
 * Type for NOTICE ASSIGNMENT.
 * 
 * <p>Java-Klasse f�r NoticeAssignment_VersionStructure complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="NoticeAssignment_VersionStructure">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.netex.org.uk/netex}Assignment_VersionStructure">
 *       &lt;sequence>
 *         &lt;group ref="{http://www.netex.org.uk/netex}NoticeAssignmentGroup"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NoticeAssignment_VersionStructure", propOrder = {
    "noticeRef",
    "groupOfNoticesRef",
    "notice",
    "noticedObjectRef",
    "linkSequenceRef",
    "sectionRef",
    "startPointInPatternRef",
    "endPointInPatternRef",
    "mark",
    "markUrl",
    "publicityChannel",
    "advertised"
})
@XmlSeeAlso({
    NoticeAssignment.class,
    SalesNoticeAssignmentVersionStructure.class
})
public class NoticeAssignmentVersionStructure
    extends AssignmentVersionStructure
{

    @XmlElement(name = "NoticeRef")
    protected NoticeRefStructure noticeRef;
    @XmlElement(name = "GroupOfNoticesRef")
    protected GeneralGroupOfEntitiesRefStructure groupOfNoticesRef;
    @XmlElement(name = "Notice")
    protected Notice notice;
    @XmlElement(name = "NoticedObjectRef")
    protected VersionOfObjectRefStructure noticedObjectRef;
    @XmlElementRef(name = "LinkSequenceRef", namespace = "http://www.netex.org.uk/netex", type = JAXBElement.class, required = false)
    protected JAXBElement<? extends LinkSequenceRefStructure> linkSequenceRef;
    @XmlElementRef(name = "SectionRef", namespace = "http://www.netex.org.uk/netex", type = JAXBElement.class, required = false)
    protected JAXBElement<? extends SectionRefStructure> sectionRef;
    @XmlElement(name = "StartPointInPatternRef")
    protected PointInSequenceRefStructure startPointInPatternRef;
    @XmlElement(name = "EndPointInPatternRef")
    protected PointInSequenceRefStructure endPointInPatternRef;
    @XmlElement(name = "Mark")
    protected String mark;
    @XmlElement(name = "MarkUrl")
    @XmlSchemaType(name = "anyURI")
    protected String markUrl;
    @XmlElement(name = "PublicityChannel", defaultValue = "all")
    @XmlSchemaType(name = "NMTOKEN")
    protected PublicityChannelEnumeration publicityChannel;
    @XmlElement(name = "Advertised")
    protected Boolean advertised;

    /**
     * Ruft den Wert der noticeRef-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link NoticeRefStructure }
     *     
     */
    public NoticeRefStructure getNoticeRef() {
        return noticeRef;
    }

    /**
     * Legt den Wert der noticeRef-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link NoticeRefStructure }
     *     
     */
    public void setNoticeRef(NoticeRefStructure value) {
        this.noticeRef = value;
    }

    /**
     * Ruft den Wert der groupOfNoticesRef-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link GeneralGroupOfEntitiesRefStructure }
     *     
     */
    public GeneralGroupOfEntitiesRefStructure getGroupOfNoticesRef() {
        return groupOfNoticesRef;
    }

    /**
     * Legt den Wert der groupOfNoticesRef-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link GeneralGroupOfEntitiesRefStructure }
     *     
     */
    public void setGroupOfNoticesRef(GeneralGroupOfEntitiesRefStructure value) {
        this.groupOfNoticesRef = value;
    }

    /**
     * Ruft den Wert der notice-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Notice }
     *     
     */
    public Notice getNotice() {
        return notice;
    }

    /**
     * Legt den Wert der notice-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Notice }
     *     
     */
    public void setNotice(Notice value) {
        this.notice = value;
    }

    /**
     * Ruft den Wert der noticedObjectRef-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link VersionOfObjectRefStructure }
     *     
     */
    public VersionOfObjectRefStructure getNoticedObjectRef() {
        return noticedObjectRef;
    }

    /**
     * Legt den Wert der noticedObjectRef-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link VersionOfObjectRefStructure }
     *     
     */
    public void setNoticedObjectRef(VersionOfObjectRefStructure value) {
        this.noticedObjectRef = value;
    }

    /**
     * Ruft den Wert der linkSequenceRef-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link TimingPatternRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link SingleJourneyPathRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link LinkSequenceRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link RouteRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link DeadRunRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link SpecialServiceRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link TripRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link SiteNavigationPathRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link DeadRunJourneyPatternRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link VehicleJourneyRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link DeckNavigationPathRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link VehicleJourneyRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link DatedSpecialServiceRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link GenericNavigationPathRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link ServicePatternRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link JourneyPatternRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link TripPatternRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link VehicleJourneyRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link JourneyRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link SiteNavigationPathRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link ServiceJourneyPatternRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link SingleJourneyRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link ServiceJourneyRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link TemplateServiceJourneyRefStructure }{@code >}
     *     
     */
    public JAXBElement<? extends LinkSequenceRefStructure> getLinkSequenceRef() {
        return linkSequenceRef;
    }

    /**
     * Legt den Wert der linkSequenceRef-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link TimingPatternRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link SingleJourneyPathRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link LinkSequenceRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link RouteRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link DeadRunRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link SpecialServiceRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link TripRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link SiteNavigationPathRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link DeadRunJourneyPatternRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link VehicleJourneyRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link DeckNavigationPathRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link VehicleJourneyRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link DatedSpecialServiceRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link GenericNavigationPathRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link ServicePatternRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link JourneyPatternRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link TripPatternRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link VehicleJourneyRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link JourneyRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link SiteNavigationPathRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link ServiceJourneyPatternRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link SingleJourneyRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link ServiceJourneyRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link TemplateServiceJourneyRefStructure }{@code >}
     *     
     */
    public void setLinkSequenceRef(JAXBElement<? extends LinkSequenceRefStructure> value) {
        this.linkSequenceRef = value;
    }

    /**
     * Ruft den Wert der sectionRef-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link SectionRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link CommonSectionRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link FareSectionRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link GeneralSectionRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link CommonSectionRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link LineSectionRefStructure }{@code >}
     *     
     */
    public JAXBElement<? extends SectionRefStructure> getSectionRef() {
        return sectionRef;
    }

    /**
     * Legt den Wert der sectionRef-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link SectionRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link CommonSectionRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link FareSectionRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link GeneralSectionRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link CommonSectionRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link LineSectionRefStructure }{@code >}
     *     
     */
    public void setSectionRef(JAXBElement<? extends SectionRefStructure> value) {
        this.sectionRef = value;
    }

    /**
     * Ruft den Wert der startPointInPatternRef-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link PointInSequenceRefStructure }
     *     
     */
    public PointInSequenceRefStructure getStartPointInPatternRef() {
        return startPointInPatternRef;
    }

    /**
     * Legt den Wert der startPointInPatternRef-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link PointInSequenceRefStructure }
     *     
     */
    public void setStartPointInPatternRef(PointInSequenceRefStructure value) {
        this.startPointInPatternRef = value;
    }

    /**
     * Ruft den Wert der endPointInPatternRef-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link PointInSequenceRefStructure }
     *     
     */
    public PointInSequenceRefStructure getEndPointInPatternRef() {
        return endPointInPatternRef;
    }

    /**
     * Legt den Wert der endPointInPatternRef-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link PointInSequenceRefStructure }
     *     
     */
    public void setEndPointInPatternRef(PointInSequenceRefStructure value) {
        this.endPointInPatternRef = value;
    }

    /**
     * Ruft den Wert der mark-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMark() {
        return mark;
    }

    /**
     * Legt den Wert der mark-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMark(String value) {
        this.mark = value;
    }

    /**
     * Ruft den Wert der markUrl-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMarkUrl() {
        return markUrl;
    }

    /**
     * Legt den Wert der markUrl-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMarkUrl(String value) {
        this.markUrl = value;
    }

    /**
     * Ruft den Wert der publicityChannel-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link PublicityChannelEnumeration }
     *     
     */
    public PublicityChannelEnumeration getPublicityChannel() {
        return publicityChannel;
    }

    /**
     * Legt den Wert der publicityChannel-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link PublicityChannelEnumeration }
     *     
     */
    public void setPublicityChannel(PublicityChannelEnumeration value) {
        this.publicityChannel = value;
    }

    /**
     * Ruft den Wert der advertised-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAdvertised() {
        return advertised;
    }

    /**
     * Legt den Wert der advertised-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAdvertised(Boolean value) {
        this.advertised = value;
    }

}
