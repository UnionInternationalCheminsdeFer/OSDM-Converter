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
import jakarta.xml.bind.annotation.XmlElements;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Type for containment in frame of TSPATIAL FEATURe.
 * 
 * <p>Java-Klasse f�r spatialFeaturesInFrame_RelStructure complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="spatialFeaturesInFrame_RelStructure">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.netex.org.uk/netex}containmentAggregationStructure">
 *       &lt;choice maxOccurs="unbounded">
 *         &lt;element ref="{http://www.netex.org.uk/netex}SimpleFeature"/>
 *         &lt;element ref="{http://www.netex.org.uk/netex}ComplexFeature"/>
 *       &lt;/choice>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "spatialFeaturesInFrame_RelStructure", propOrder = {
    "simpleFeatureOrComplexFeature"
})
public class SpatialFeaturesInFrameRelStructure
    extends ContainmentAggregationStructure
{

    @XmlElements({
        @XmlElement(name = "SimpleFeature", type = SimpleFeature.class),
        @XmlElement(name = "ComplexFeature", type = ComplexFeature.class)
    })
    protected List<GroupOfPointsVersionStructure> simpleFeatureOrComplexFeature;

    /**
     * Gets the value of the simpleFeatureOrComplexFeature property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the simpleFeatureOrComplexFeature property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSimpleFeatureOrComplexFeature().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SimpleFeature }
     * {@link ComplexFeature }
     * 
     * 
     */
    public List<GroupOfPointsVersionStructure> getSimpleFeatureOrComplexFeature() {
        if (simpleFeatureOrComplexFeature == null) {
            simpleFeatureOrComplexFeature = new ArrayList<GroupOfPointsVersionStructure>();
        }
        return this.simpleFeatureOrComplexFeature;
    }

}
