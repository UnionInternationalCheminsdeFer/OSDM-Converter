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
 * Type for a LINE SECTION.
 * 
 * <p>Java-Klasse f�r LineSection_VersionStructure complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="LineSection_VersionStructure">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.netex.org.uk/netex}Section_VersionStructure">
 *       &lt;sequence>
 *         &lt;group ref="{http://www.netex.org.uk/netex}LineSectionGroup"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LineSection_VersionStructure", propOrder = {
    "pointsOnSection",
    "members",
    "reversePointsOnSection",
    "reverseMembers",
    "sectionType",
    "lineRef",
    "transportOrganisationRef"
})
@XmlSeeAlso({
    LineSection.class
})
public class LineSectionVersionStructure
    extends SectionVersionStructure
{

    protected PointOnLineSectionsRelStructure pointsOnSection;
    protected CommonSectionPointMembersRelStructure members;
    protected PointOnLineSectionsRelStructure reversePointsOnSection;
    protected CommonSectionPointMembersRelStructure reverseMembers;
    @XmlElement(name = "SectionType", defaultValue = "trunk")
    @XmlSchemaType(name = "normalizedString")
    protected SectionTypeEnumeration sectionType;
    @XmlElementRef(name = "LineRef", namespace = "http://www.netex.org.uk/netex", type = JAXBElement.class, required = false)
    protected JAXBElement<? extends LineRefStructure> lineRef;
    @XmlElementRef(name = "TransportOrganisationRef", namespace = "http://www.netex.org.uk/netex", type = JAXBElement.class, required = false)
    protected JAXBElement<? extends TransportOrganisationRefStructure> transportOrganisationRef;

    /**
     * Ruft den Wert der pointsOnSection-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link PointOnLineSectionsRelStructure }
     *     
     */
    public PointOnLineSectionsRelStructure getPointsOnSection() {
        return pointsOnSection;
    }

    /**
     * Legt den Wert der pointsOnSection-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link PointOnLineSectionsRelStructure }
     *     
     */
    public void setPointsOnSection(PointOnLineSectionsRelStructure value) {
        this.pointsOnSection = value;
    }

    /**
     * Ruft den Wert der members-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link CommonSectionPointMembersRelStructure }
     *     
     */
    public CommonSectionPointMembersRelStructure getMembers() {
        return members;
    }

    /**
     * Legt den Wert der members-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link CommonSectionPointMembersRelStructure }
     *     
     */
    public void setMembers(CommonSectionPointMembersRelStructure value) {
        this.members = value;
    }

    /**
     * Ruft den Wert der reversePointsOnSection-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link PointOnLineSectionsRelStructure }
     *     
     */
    public PointOnLineSectionsRelStructure getReversePointsOnSection() {
        return reversePointsOnSection;
    }

    /**
     * Legt den Wert der reversePointsOnSection-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link PointOnLineSectionsRelStructure }
     *     
     */
    public void setReversePointsOnSection(PointOnLineSectionsRelStructure value) {
        this.reversePointsOnSection = value;
    }

    /**
     * Ruft den Wert der reverseMembers-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link CommonSectionPointMembersRelStructure }
     *     
     */
    public CommonSectionPointMembersRelStructure getReverseMembers() {
        return reverseMembers;
    }

    /**
     * Legt den Wert der reverseMembers-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link CommonSectionPointMembersRelStructure }
     *     
     */
    public void setReverseMembers(CommonSectionPointMembersRelStructure value) {
        this.reverseMembers = value;
    }

    /**
     * Ruft den Wert der sectionType-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link SectionTypeEnumeration }
     *     
     */
    public SectionTypeEnumeration getSectionType() {
        return sectionType;
    }

    /**
     * Legt den Wert der sectionType-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link SectionTypeEnumeration }
     *     
     */
    public void setSectionType(SectionTypeEnumeration value) {
        this.sectionType = value;
    }

    /**
     * Ruft den Wert der lineRef-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link LineRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link FlexibleLineRefStructure }{@code >}
     *     
     */
    public JAXBElement<? extends LineRefStructure> getLineRef() {
        return lineRef;
    }

    /**
     * Legt den Wert der lineRef-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link LineRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link FlexibleLineRefStructure }{@code >}
     *     
     */
    public void setLineRef(JAXBElement<? extends LineRefStructure> value) {
        this.lineRef = value;
    }

    /**
     * Ruft den Wert der transportOrganisationRef-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link AuthorityRef }{@code >}
     *     {@link JAXBElement }{@code <}{@link TransportOrganisationRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link OperatorRefStructure }{@code >}
     *     
     */
    public JAXBElement<? extends TransportOrganisationRefStructure> getTransportOrganisationRef() {
        return transportOrganisationRef;
    }

    /**
     * Legt den Wert der transportOrganisationRef-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link AuthorityRef }{@code >}
     *     {@link JAXBElement }{@code <}{@link TransportOrganisationRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link OperatorRefStructure }{@code >}
     *     
     */
    public void setTransportOrganisationRef(JAXBElement<? extends TransportOrganisationRefStructure> value) {
        this.transportOrganisationRef = value;
    }

}
