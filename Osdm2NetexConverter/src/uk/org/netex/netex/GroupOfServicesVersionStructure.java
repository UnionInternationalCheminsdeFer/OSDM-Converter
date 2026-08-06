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
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Type for a GROUP OF SERVICEs.
 * 
 * <p>Java-Klasse f�r GroupOfServices_VersionStructure complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="GroupOfServices_VersionStructure">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.netex.org.uk/netex}GroupOfEntities_VersionStructure">
 *       &lt;sequence>
 *         &lt;group ref="{http://www.netex.org.uk/netex}GroupOfServicesGroup"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GroupOfServices_VersionStructure", propOrder = {
    "dayTypes",
    "directionType",
    "directionRef",
    "directionView",
    "origin",
    "destination",
    "destinationDisplays",
    "members",
    "noticeAssignments"
})
@XmlSeeAlso({
    GroupOfServices.class
})
public class GroupOfServicesVersionStructure
    extends GroupOfEntitiesVersionStructure
{

    protected GroupOfServicesVersionStructure.DayTypes dayTypes;
    @XmlElement(name = "DirectionType", defaultValue = "outbound")
    @XmlSchemaType(name = "normalizedString")
    protected DirectionTypeEnumeration directionType;
    @XmlElement(name = "DirectionRef")
    protected DirectionRefStructure directionRef;
    @XmlElement(name = "DirectionView")
    protected DirectionView directionView;
    @XmlElement(name = "Origin")
    protected GroupOfServicesEndPointDerivedViewStructure origin;
    @XmlElement(name = "Destination")
    protected GroupOfServicesEndPointDerivedViewStructure destination;
    protected DestinationDisplayRefsRelStructure destinationDisplays;
    protected GroupOfServicesMembersRelStructure members;
    protected NoticeAssignmentsRelStructure noticeAssignments;

    /**
     * Ruft den Wert der dayTypes-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link GroupOfServicesVersionStructure.DayTypes }
     *     
     */
    public GroupOfServicesVersionStructure.DayTypes getDayTypes() {
        return dayTypes;
    }

    /**
     * Legt den Wert der dayTypes-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link GroupOfServicesVersionStructure.DayTypes }
     *     
     */
    public void setDayTypes(GroupOfServicesVersionStructure.DayTypes value) {
        this.dayTypes = value;
    }

    /**
     * Ruft den Wert der directionType-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link DirectionTypeEnumeration }
     *     
     */
    public DirectionTypeEnumeration getDirectionType() {
        return directionType;
    }

    /**
     * Legt den Wert der directionType-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link DirectionTypeEnumeration }
     *     
     */
    public void setDirectionType(DirectionTypeEnumeration value) {
        this.directionType = value;
    }

    /**
     * Ruft den Wert der directionRef-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link DirectionRefStructure }
     *     
     */
    public DirectionRefStructure getDirectionRef() {
        return directionRef;
    }

    /**
     * Legt den Wert der directionRef-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link DirectionRefStructure }
     *     
     */
    public void setDirectionRef(DirectionRefStructure value) {
        this.directionRef = value;
    }

    /**
     * Ruft den Wert der directionView-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link DirectionView }
     *     
     */
    public DirectionView getDirectionView() {
        return directionView;
    }

    /**
     * Legt den Wert der directionView-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link DirectionView }
     *     
     */
    public void setDirectionView(DirectionView value) {
        this.directionView = value;
    }

    /**
     * Ruft den Wert der origin-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link GroupOfServicesEndPointDerivedViewStructure }
     *     
     */
    public GroupOfServicesEndPointDerivedViewStructure getOrigin() {
        return origin;
    }

    /**
     * Legt den Wert der origin-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link GroupOfServicesEndPointDerivedViewStructure }
     *     
     */
    public void setOrigin(GroupOfServicesEndPointDerivedViewStructure value) {
        this.origin = value;
    }

    /**
     * Ruft den Wert der destination-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link GroupOfServicesEndPointDerivedViewStructure }
     *     
     */
    public GroupOfServicesEndPointDerivedViewStructure getDestination() {
        return destination;
    }

    /**
     * Legt den Wert der destination-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link GroupOfServicesEndPointDerivedViewStructure }
     *     
     */
    public void setDestination(GroupOfServicesEndPointDerivedViewStructure value) {
        this.destination = value;
    }

    /**
     * Ruft den Wert der destinationDisplays-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link DestinationDisplayRefsRelStructure }
     *     
     */
    public DestinationDisplayRefsRelStructure getDestinationDisplays() {
        return destinationDisplays;
    }

    /**
     * Legt den Wert der destinationDisplays-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link DestinationDisplayRefsRelStructure }
     *     
     */
    public void setDestinationDisplays(DestinationDisplayRefsRelStructure value) {
        this.destinationDisplays = value;
    }

    /**
     * Ruft den Wert der members-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link GroupOfServicesMembersRelStructure }
     *     
     */
    public GroupOfServicesMembersRelStructure getMembers() {
        return members;
    }

    /**
     * Legt den Wert der members-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link GroupOfServicesMembersRelStructure }
     *     
     */
    public void setMembers(GroupOfServicesMembersRelStructure value) {
        this.members = value;
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
     * <p>Java-Klasse f�r anonymous complex type.
     * 
     * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="DayTypeRef" type="{http://www.netex.org.uk/netex}DayTypeRefStructure" maxOccurs="unbounded"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "dayTypeRef"
    })
    public static class DayTypes {

        @XmlElement(name = "DayTypeRef", required = true)
        protected List<DayTypeRefStructure> dayTypeRef;

        /**
         * Gets the value of the dayTypeRef property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the dayTypeRef property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getDayTypeRef().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link DayTypeRefStructure }
         * 
         * 
         */
        public List<DayTypeRefStructure> getDayTypeRef() {
            if (dayTypeRef == null) {
                dayTypeRef = new ArrayList<DayTypeRefStructure>();
            }
            return this.dayTypeRef;
        }

    }

}
