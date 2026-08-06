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
import jakarta.xml.bind.annotation.adapters.NormalizedStringAdapter;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * Type for a POINT.
 * 
 * <p>Java-Klasse f�r Point_VersionStructure complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="Point_VersionStructure">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.netex.org.uk/netex}DataManagedObjectStructure">
 *       &lt;sequence>
 *         &lt;group ref="{http://www.netex.org.uk/netex}PointGroup"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Point_VersionStructure", propOrder = {
    "name",
    "location",
    "pointNumber",
    "types",
    "projections",
    "groupMemberships"
})
@XmlSeeAlso({
    RoutePointVersionStructure.class,
    VehicleMeetingPointVersionStructure.class,
    TimingPointVersionStructure.class,
    ActivationPointVersionStructure.class,
    InfrastructurePointVersionStructure.class,
    TrafficControlPointVersionStructure.class,
    GenericPathJunctionVersionStructure.class
})
public class PointVersionStructure
    extends DataManagedObjectStructure
{

    @XmlElement(name = "Name")
    protected MultilingualString name;
    @XmlElement(name = "Location")
    protected LocationStructure location;
    @XmlElement(name = "PointNumber")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String pointNumber;
    protected TypeOfPointRefsRelStructure types;
    protected ProjectionsRelStructure projections;
    protected GroupMembershipRefsRelStructure groupMemberships;

    /**
     * Ruft den Wert der name-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link MultilingualString }
     *     
     */
    public MultilingualString getName() {
        return name;
    }

    /**
     * Legt den Wert der name-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link MultilingualString }
     *     
     */
    public void setName(MultilingualString value) {
        this.name = value;
    }

    /**
     * Ruft den Wert der location-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link LocationStructure }
     *     
     */
    public LocationStructure getLocation() {
        return location;
    }

    /**
     * Legt den Wert der location-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link LocationStructure }
     *     
     */
    public void setLocation(LocationStructure value) {
        this.location = value;
    }

    /**
     * Ruft den Wert der pointNumber-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPointNumber() {
        return pointNumber;
    }

    /**
     * Legt den Wert der pointNumber-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPointNumber(String value) {
        this.pointNumber = value;
    }

    /**
     * Ruft den Wert der types-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link TypeOfPointRefsRelStructure }
     *     
     */
    public TypeOfPointRefsRelStructure getTypes() {
        return types;
    }

    /**
     * Legt den Wert der types-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeOfPointRefsRelStructure }
     *     
     */
    public void setTypes(TypeOfPointRefsRelStructure value) {
        this.types = value;
    }

    /**
     * Ruft den Wert der projections-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ProjectionsRelStructure }
     *     
     */
    public ProjectionsRelStructure getProjections() {
        return projections;
    }

    /**
     * Legt den Wert der projections-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ProjectionsRelStructure }
     *     
     */
    public void setProjections(ProjectionsRelStructure value) {
        this.projections = value;
    }

    /**
     * Ruft den Wert der groupMemberships-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link GroupMembershipRefsRelStructure }
     *     
     */
    public GroupMembershipRefsRelStructure getGroupMemberships() {
        return groupMemberships;
    }

    /**
     * Legt den Wert der groupMemberships-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link GroupMembershipRefsRelStructure }
     *     
     */
    public void setGroupMemberships(GroupMembershipRefsRelStructure value) {
        this.groupMemberships = value;
    }

}
