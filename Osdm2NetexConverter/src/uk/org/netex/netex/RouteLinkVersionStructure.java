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
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Type for ROUTE LINK.
 * 
 * <p>Java-Klasse f�r RouteLink_VersionStructure complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="RouteLink_VersionStructure">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.netex.org.uk/netex}Link_VersionStructure">
 *       &lt;group ref="{http://www.netex.org.uk/netex}RouteLinkGroup"/>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RouteLink_VersionStructure", propOrder = {
    "fromPointRef",
    "toPointRef",
    "operationalContextRef",
    "modeRestrictionAssessments"
})
@XmlSeeAlso({
    RouteLink.class
})
public class RouteLinkVersionStructure
    extends LinkVersionStructure
{

    @XmlElement(name = "FromPointRef", required = true)
    protected RoutePointRefStructure fromPointRef;
    @XmlElement(name = "ToPointRef", required = true)
    protected RoutePointRefStructure toPointRef;
    @XmlElement(name = "OperationalContextRef")
    protected OperationalContextRefStructure operationalContextRef;
    protected ModeRestrictionAssessmentsRelStructure modeRestrictionAssessments;

    /**
     * Ruft den Wert der fromPointRef-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link RoutePointRefStructure }
     *     
     */
    public RoutePointRefStructure getFromPointRef() {
        return fromPointRef;
    }

    /**
     * Legt den Wert der fromPointRef-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link RoutePointRefStructure }
     *     
     */
    public void setFromPointRef(RoutePointRefStructure value) {
        this.fromPointRef = value;
    }

    /**
     * Ruft den Wert der toPointRef-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link RoutePointRefStructure }
     *     
     */
    public RoutePointRefStructure getToPointRef() {
        return toPointRef;
    }

    /**
     * Legt den Wert der toPointRef-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link RoutePointRefStructure }
     *     
     */
    public void setToPointRef(RoutePointRefStructure value) {
        this.toPointRef = value;
    }

    /**
     * Ruft den Wert der operationalContextRef-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link OperationalContextRefStructure }
     *     
     */
    public OperationalContextRefStructure getOperationalContextRef() {
        return operationalContextRef;
    }

    /**
     * Legt den Wert der operationalContextRef-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link OperationalContextRefStructure }
     *     
     */
    public void setOperationalContextRef(OperationalContextRefStructure value) {
        this.operationalContextRef = value;
    }

    /**
     * Ruft den Wert der modeRestrictionAssessments-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ModeRestrictionAssessmentsRelStructure }
     *     
     */
    public ModeRestrictionAssessmentsRelStructure getModeRestrictionAssessments() {
        return modeRestrictionAssessments;
    }

    /**
     * Legt den Wert der modeRestrictionAssessments-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ModeRestrictionAssessmentsRelStructure }
     *     
     */
    public void setModeRestrictionAssessments(ModeRestrictionAssessmentsRelStructure value) {
        this.modeRestrictionAssessments = value;
    }

}
