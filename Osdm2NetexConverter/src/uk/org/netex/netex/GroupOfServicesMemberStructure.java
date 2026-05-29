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
import jakarta.xml.bind.annotation.XmlType;


/**
 * Type for a Member of GROUP OF SERVICE Member.
 * 
 * <p>Java-Klasse f�r GroupOfServicesMemberStructure complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="GroupOfServicesMemberStructure">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.netex.org.uk/netex}AbstractGroupMember_VersionedChildStructure">
 *       &lt;sequence>
 *         &lt;element name="GroupOfServicesRef" type="{http://www.netex.org.uk/netex}GroupOfServicesRefStructure" minOccurs="0"/>
 *         &lt;choice>
 *           &lt;element ref="{http://www.netex.org.uk/netex}JourneyRef"/>
 *           &lt;element ref="{http://www.netex.org.uk/netex}TrainNumberRef"/>
 *           &lt;element ref="{http://www.netex.org.uk/netex}JourneyDesignator"/>
 *           &lt;element ref="{http://www.netex.org.uk/netex}ServiceDesignator"/>
 *         &lt;/choice>
 *         &lt;element name="noticeAssignments" type="{http://www.netex.org.uk/netex}noticeAssignmentViews_RelStructure" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GroupOfServicesMemberStructure", propOrder = {
    "groupOfServicesRef",
    "journeyRef",
    "trainNumberRef",
    "journeyDesignator",
    "serviceDesignator",
    "noticeAssignments"
})
public class GroupOfServicesMemberStructure
    extends AbstractGroupMemberVersionedChildStructure
{

    @XmlElement(name = "GroupOfServicesRef")
    protected GroupOfServicesRefStructure groupOfServicesRef;
    @XmlElementRef(name = "JourneyRef", namespace = "http://www.netex.org.uk/netex", type = JAXBElement.class, required = false)
    protected JAXBElement<? extends JourneyRefStructure> journeyRef;
    @XmlElement(name = "TrainNumberRef")
    protected TrainNumberRefStructure trainNumberRef;
    @XmlElement(name = "JourneyDesignator")
    protected JourneyDesignatorStructure journeyDesignator;
    @XmlElement(name = "ServiceDesignator")
    protected ServiceDesignatorStructure serviceDesignator;
    protected NoticeAssignmentViewsRelStructure noticeAssignments;

    /**
     * Ruft den Wert der groupOfServicesRef-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link GroupOfServicesRefStructure }
     *     
     */
    public GroupOfServicesRefStructure getGroupOfServicesRef() {
        return groupOfServicesRef;
    }

    /**
     * Legt den Wert der groupOfServicesRef-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link GroupOfServicesRefStructure }
     *     
     */
    public void setGroupOfServicesRef(GroupOfServicesRefStructure value) {
        this.groupOfServicesRef = value;
    }

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
     * Ruft den Wert der trainNumberRef-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link TrainNumberRefStructure }
     *     
     */
    public TrainNumberRefStructure getTrainNumberRef() {
        return trainNumberRef;
    }

    /**
     * Legt den Wert der trainNumberRef-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link TrainNumberRefStructure }
     *     
     */
    public void setTrainNumberRef(TrainNumberRefStructure value) {
        this.trainNumberRef = value;
    }

    /**
     * Ruft den Wert der journeyDesignator-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JourneyDesignatorStructure }
     *     
     */
    public JourneyDesignatorStructure getJourneyDesignator() {
        return journeyDesignator;
    }

    /**
     * Legt den Wert der journeyDesignator-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JourneyDesignatorStructure }
     *     
     */
    public void setJourneyDesignator(JourneyDesignatorStructure value) {
        this.journeyDesignator = value;
    }

    /**
     * Ruft den Wert der serviceDesignator-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ServiceDesignatorStructure }
     *     
     */
    public ServiceDesignatorStructure getServiceDesignator() {
        return serviceDesignator;
    }

    /**
     * Legt den Wert der serviceDesignator-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ServiceDesignatorStructure }
     *     
     */
    public void setServiceDesignator(ServiceDesignatorStructure value) {
        this.serviceDesignator = value;
    }

    /**
     * Ruft den Wert der noticeAssignments-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link NoticeAssignmentViewsRelStructure }
     *     
     */
    public NoticeAssignmentViewsRelStructure getNoticeAssignments() {
        return noticeAssignments;
    }

    /**
     * Legt den Wert der noticeAssignments-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link NoticeAssignmentViewsRelStructure }
     *     
     */
    public void setNoticeAssignments(NoticeAssignmentViewsRelStructure value) {
        this.noticeAssignments = value;
    }

}
