//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// �nderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2026.05.22 um 10:24:00 AM CEST 
//


package uk.org.netex.netex;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlElementRef;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Type for a COMPLEX FEATURE PROJECTION.
 * 
 * <p>Java-Klasse f�r ComplexFeatureProjection_VersionStructure complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="ComplexFeatureProjection_VersionStructure">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.netex.org.uk/netex}Projection_VersionStructure">
 *       &lt;sequence>
 *         &lt;group ref="{http://www.netex.org.uk/netex}ComplexFeatureProjectionGroup" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ComplexFeatureProjection_VersionStructure", propOrder = {
    "projectedFeatureRef",
    "ontoFeatureRef",
    "pointRef",
    "features"
})
@XmlSeeAlso({
    ComplexFeatureProjection.class
})
public class ComplexFeatureProjectionVersionStructure
    extends ProjectionVersionStructure
{

    @XmlElement(name = "ProjectedFeatureRef")
    protected ComplexFeatureRefStructure projectedFeatureRef;
    @XmlElement(name = "OntoFeatureRef")
    protected ComplexFeatureRefStructure ontoFeatureRef;
    @XmlElementRef(name = "PointRef", namespace = "http://www.netex.org.uk/netex", type = JAXBElement.class, required = false)
    protected List<JAXBElement<? extends PointRefStructure>> pointRef;
    protected ComplexFeatureRefsRelStructure features;

    /**
     * Ruft den Wert der projectedFeatureRef-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ComplexFeatureRefStructure }
     *     
     */
    public ComplexFeatureRefStructure getProjectedFeatureRef() {
        return projectedFeatureRef;
    }

    /**
     * Legt den Wert der projectedFeatureRef-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ComplexFeatureRefStructure }
     *     
     */
    public void setProjectedFeatureRef(ComplexFeatureRefStructure value) {
        this.projectedFeatureRef = value;
    }

    /**
     * Ruft den Wert der ontoFeatureRef-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ComplexFeatureRefStructure }
     *     
     */
    public ComplexFeatureRefStructure getOntoFeatureRef() {
        return ontoFeatureRef;
    }

    /**
     * Legt den Wert der ontoFeatureRef-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ComplexFeatureRefStructure }
     *     
     */
    public void setOntoFeatureRef(ComplexFeatureRefStructure value) {
        this.ontoFeatureRef = value;
    }

    /**
     * Gets the value of the pointRef property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the pointRef property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPointRef().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JAXBElement }{@code <}{@link VehicleMeetingPointRefStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link TimingPointRefStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link FareScheduledStopPointRefStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link RoadPointRefStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link TrafficControlPointRefStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link ReliefPointRefStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link BeaconPointRefStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link WirePointRefStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link PointRefStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link BorderPointRefStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link RoutePointRefStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link ParkingPointRefStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link ActivationPointRefStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link PointOnLinkRefStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link ScheduledStopPointRefStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link InfrastructurePointRefStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link RailwayPointRefStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link GaragePointRefStructure }{@code >}
     * 
     * 
     */
    public List<JAXBElement<? extends PointRefStructure>> getPointRef() {
        if (pointRef == null) {
            pointRef = new ArrayList<JAXBElement<? extends PointRefStructure>>();
        }
        return this.pointRef;
    }

    /**
     * Ruft den Wert der features-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ComplexFeatureRefsRelStructure }
     *     
     */
    public ComplexFeatureRefsRelStructure getFeatures() {
        return features;
    }

    /**
     * Legt den Wert der features-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ComplexFeatureRefsRelStructure }
     *     
     */
    public void setFeatures(ComplexFeatureRefsRelStructure value) {
        this.features = value;
    }

}
