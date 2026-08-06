//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// �nderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2026.05.22 um 10:24:00 AM CEST 
//


package uk.org.netex.netex;

import java.math.BigDecimal;
import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlElementRef;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Type for ROUTING CONSTRAINT ZONE.
 * 
 * <p>Java-Klasse f�r RoutingConstraintZone_VersionStructure complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="RoutingConstraintZone_VersionStructure">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.netex.org.uk/netex}Zone_VersionStructure">
 *       &lt;sequence>
 *         &lt;group ref="{http://www.netex.org.uk/netex}RoutingConstraintZoneGroup"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RoutingConstraintZone_VersionStructure", propOrder = {
    "zoneUse",
    "maximumSpeed",
    "pointsInPattern",
    "lineDirections",
    "lines",
    "groupOfLinesRef"
})
@XmlSeeAlso({
    RoutingConstraintZone.class
})
public class RoutingConstraintZoneVersionStructure
    extends ZoneVersionStructure
{

    @XmlElement(name = "ZoneUse")
    @XmlSchemaType(name = "string")
    protected ZoneUseEnumeration zoneUse;
    @XmlElement(name = "MaximumSpeed")
    protected BigDecimal maximumSpeed;
    protected PointsInJourneyPatternRelStructure pointsInPattern;
    protected LinesInDirectionRefsRelStructure lineDirections;
    protected LineRefsRelStructure lines;
    @XmlElementRef(name = "GroupOfLinesRef", namespace = "http://www.netex.org.uk/netex", type = JAXBElement.class, required = false)
    protected JAXBElement<? extends GroupOfLinesRefStructure> groupOfLinesRef;

    /**
     * Ruft den Wert der zoneUse-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ZoneUseEnumeration }
     *     
     */
    public ZoneUseEnumeration getZoneUse() {
        return zoneUse;
    }

    /**
     * Legt den Wert der zoneUse-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ZoneUseEnumeration }
     *     
     */
    public void setZoneUse(ZoneUseEnumeration value) {
        this.zoneUse = value;
    }

    /**
     * Ruft den Wert der maximumSpeed-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMaximumSpeed() {
        return maximumSpeed;
    }

    /**
     * Legt den Wert der maximumSpeed-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMaximumSpeed(BigDecimal value) {
        this.maximumSpeed = value;
    }

    /**
     * Ruft den Wert der pointsInPattern-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link PointsInJourneyPatternRelStructure }
     *     
     */
    public PointsInJourneyPatternRelStructure getPointsInPattern() {
        return pointsInPattern;
    }

    /**
     * Legt den Wert der pointsInPattern-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link PointsInJourneyPatternRelStructure }
     *     
     */
    public void setPointsInPattern(PointsInJourneyPatternRelStructure value) {
        this.pointsInPattern = value;
    }

    /**
     * Ruft den Wert der lineDirections-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link LinesInDirectionRefsRelStructure }
     *     
     */
    public LinesInDirectionRefsRelStructure getLineDirections() {
        return lineDirections;
    }

    /**
     * Legt den Wert der lineDirections-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link LinesInDirectionRefsRelStructure }
     *     
     */
    public void setLineDirections(LinesInDirectionRefsRelStructure value) {
        this.lineDirections = value;
    }

    /**
     * Ruft den Wert der lines-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link LineRefsRelStructure }
     *     
     */
    public LineRefsRelStructure getLines() {
        return lines;
    }

    /**
     * Legt den Wert der lines-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link LineRefsRelStructure }
     *     
     */
    public void setLines(LineRefsRelStructure value) {
        this.lines = value;
    }

    /**
     * Ruft den Wert der groupOfLinesRef-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link NetworkRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link GroupOfLinesRefStructure }{@code >}
     *     
     */
    public JAXBElement<? extends GroupOfLinesRefStructure> getGroupOfLinesRef() {
        return groupOfLinesRef;
    }

    /**
     * Legt den Wert der groupOfLinesRef-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link NetworkRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link GroupOfLinesRefStructure }{@code >}
     *     
     */
    public void setGroupOfLinesRef(JAXBElement<? extends GroupOfLinesRefStructure> value) {
        this.groupOfLinesRef = value;
    }

}
