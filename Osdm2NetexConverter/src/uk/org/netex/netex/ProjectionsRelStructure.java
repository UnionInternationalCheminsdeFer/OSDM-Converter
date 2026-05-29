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
import jakarta.xml.bind.annotation.XmlElementRef;
import jakarta.xml.bind.annotation.XmlElementRefs;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Type for a list of PROJECTIONS.
 * 
 * <p>Java-Klasse f�r projections_RelStructure complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="projections_RelStructure">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.netex.org.uk/netex}containmentAggregationStructure">
 *       &lt;choice maxOccurs="unbounded">
 *         &lt;element ref="{http://www.netex.org.uk/netex}ProjectionRef"/>
 *         &lt;element ref="{http://www.netex.org.uk/netex}Projection"/>
 *       &lt;/choice>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "projections_RelStructure", propOrder = {
    "projectionRefOrProjection"
})
public class ProjectionsRelStructure
    extends ContainmentAggregationStructure
{

    @XmlElementRefs({
        @XmlElementRef(name = "Projection", namespace = "http://www.netex.org.uk/netex", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "ProjectionRef", namespace = "http://www.netex.org.uk/netex", type = JAXBElement.class, required = false)
    })
    protected List<JAXBElement<?>> projectionRefOrProjection;

    /**
     * Gets the value of the projectionRefOrProjection property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the projectionRefOrProjection property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getProjectionRefOrProjection().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JAXBElement }{@code <}{@link ComplexFeatureProjection }{@code >}
     * {@link JAXBElement }{@code <}{@link ZoneProjectionRefStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link PointProjectionRefStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link PointProjection }{@code >}
     * {@link JAXBElement }{@code <}{@link LinkProjectionRefStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link LinkSequenceProjection }{@code >}
     * {@link JAXBElement }{@code <}{@link TopographicProjectionRefStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link TopographicProjection }{@code >}
     * {@link JAXBElement }{@code <}{@link ZoneProjection }{@code >}
     * {@link JAXBElement }{@code <}{@link LinkSequenceProjectionRefStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link ComplexFeatureProjectionRefStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link ProjectionVersionStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link LinkProjection }{@code >}
     * {@link JAXBElement }{@code <}{@link ProjectionRefStructure }{@code >}
     * 
     * 
     */
    public List<JAXBElement<?>> getProjectionRefOrProjection() {
        if (projectionRefOrProjection == null) {
            projectionRefOrProjection = new ArrayList<JAXBElement<?>>();
        }
        return this.projectionRefOrProjection;
    }

}
