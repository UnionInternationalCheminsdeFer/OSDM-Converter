//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// �nderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2026.05.22 um 10:24:00 AM CEST 
//


package uk.org.netex.netex;

import java.math.BigDecimal;
import java.math.BigInteger;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Type for ROUTE a POINT.
 * 
 * <p>Java-Klasse f�r RouteInstruction_VersionStructure complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="RouteInstruction_VersionStructure">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.netex.org.uk/netex}DataManagedObjectStructure">
 *       &lt;sequence>
 *         &lt;group ref="{http://www.netex.org.uk/netex}RouteInstructionGroup"/>
 *       &lt;/sequence>
 *       &lt;attribute name="order" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RouteInstruction_VersionStructure", propOrder = {
    "pointOnRouteRef",
    "instruction",
    "pathHeading",
    "heading",
    "bearing",
    "distance",
    "transition",
    "roadName",
    "simpleFeatureRef"
})
@XmlSeeAlso({
    RouteInstruction.class
})
public class RouteInstructionVersionStructure
    extends DataManagedObjectStructure
{

    @XmlElement(name = "PointOnRouteRef")
    protected PointOnRouteRefStructure pointOnRouteRef;
    @XmlElement(name = "Instruction", defaultValue = "false")
    protected MultilingualString instruction;
    @XmlElement(name = "PathHeading")
    @XmlSchemaType(name = "NMTOKEN")
    protected PathHeadingEnumeration pathHeading;
    @XmlElement(name = "Heading")
    @XmlSchemaType(name = "string")
    protected CompassBearing16Enumeration heading;
    @XmlElement(name = "Bearing")
    protected Float bearing;
    @XmlElement(name = "Distance")
    protected BigDecimal distance;
    @XmlElement(name = "Transition")
    @XmlSchemaType(name = "NMTOKEN")
    protected TransitionEnumeration transition;
    @XmlElement(name = "RoadName", defaultValue = "false")
    protected MultilingualString roadName;
    @XmlElement(name = "SimpleFeatureRef")
    protected SimpleFeatureRefStructure simpleFeatureRef;
    @XmlAttribute(name = "order")
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger order;

    /**
     * Ruft den Wert der pointOnRouteRef-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link PointOnRouteRefStructure }
     *     
     */
    public PointOnRouteRefStructure getPointOnRouteRef() {
        return pointOnRouteRef;
    }

    /**
     * Legt den Wert der pointOnRouteRef-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link PointOnRouteRefStructure }
     *     
     */
    public void setPointOnRouteRef(PointOnRouteRefStructure value) {
        this.pointOnRouteRef = value;
    }

    /**
     * Ruft den Wert der instruction-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link MultilingualString }
     *     
     */
    public MultilingualString getInstruction() {
        return instruction;
    }

    /**
     * Legt den Wert der instruction-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link MultilingualString }
     *     
     */
    public void setInstruction(MultilingualString value) {
        this.instruction = value;
    }

    /**
     * Ruft den Wert der pathHeading-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link PathHeadingEnumeration }
     *     
     */
    public PathHeadingEnumeration getPathHeading() {
        return pathHeading;
    }

    /**
     * Legt den Wert der pathHeading-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link PathHeadingEnumeration }
     *     
     */
    public void setPathHeading(PathHeadingEnumeration value) {
        this.pathHeading = value;
    }

    /**
     * Ruft den Wert der heading-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link CompassBearing16Enumeration }
     *     
     */
    public CompassBearing16Enumeration getHeading() {
        return heading;
    }

    /**
     * Legt den Wert der heading-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link CompassBearing16Enumeration }
     *     
     */
    public void setHeading(CompassBearing16Enumeration value) {
        this.heading = value;
    }

    /**
     * Ruft den Wert der bearing-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getBearing() {
        return bearing;
    }

    /**
     * Legt den Wert der bearing-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setBearing(Float value) {
        this.bearing = value;
    }

    /**
     * Ruft den Wert der distance-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getDistance() {
        return distance;
    }

    /**
     * Legt den Wert der distance-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setDistance(BigDecimal value) {
        this.distance = value;
    }

    /**
     * Ruft den Wert der transition-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link TransitionEnumeration }
     *     
     */
    public TransitionEnumeration getTransition() {
        return transition;
    }

    /**
     * Legt den Wert der transition-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link TransitionEnumeration }
     *     
     */
    public void setTransition(TransitionEnumeration value) {
        this.transition = value;
    }

    /**
     * Ruft den Wert der roadName-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link MultilingualString }
     *     
     */
    public MultilingualString getRoadName() {
        return roadName;
    }

    /**
     * Legt den Wert der roadName-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link MultilingualString }
     *     
     */
    public void setRoadName(MultilingualString value) {
        this.roadName = value;
    }

    /**
     * Ruft den Wert der simpleFeatureRef-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link SimpleFeatureRefStructure }
     *     
     */
    public SimpleFeatureRefStructure getSimpleFeatureRef() {
        return simpleFeatureRef;
    }

    /**
     * Legt den Wert der simpleFeatureRef-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link SimpleFeatureRefStructure }
     *     
     */
    public void setSimpleFeatureRef(SimpleFeatureRefStructure value) {
        this.simpleFeatureRef = value;
    }

    /**
     * Ruft den Wert der order-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getOrder() {
        return order;
    }

    /**
     * Legt den Wert der order-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setOrder(BigInteger value) {
        this.order = value;
    }

}
