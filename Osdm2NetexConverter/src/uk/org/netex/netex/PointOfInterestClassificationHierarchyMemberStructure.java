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
import jakarta.xml.bind.annotation.XmlType;


/**
 * Type for POINT OF INTEREST CLASSIFICATION HIERARCHY MEMBER.
 * 
 * <p>Java-Klasse f�r PointOfInterestClassificationHierarchyMemberStructure complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="PointOfInterestClassificationHierarchyMemberStructure">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.netex.org.uk/netex}VersionedChildStructure">
 *       &lt;sequence>
 *         &lt;group ref="{http://www.netex.org.uk/netex}PointOfInterestClassificationHierarchyMemberGroup"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PointOfInterestClassificationHierarchyMemberStructure", propOrder = {
    "pointOfInterestHierarchyRef",
    "parentClassificationRef",
    "pointOfInterestClassificationRef"
})
public class PointOfInterestClassificationHierarchyMemberStructure
    extends VersionedChildStructure
{

    @XmlElement(name = "PointOfInterestHierarchyRef")
    protected PointOfInterestHierarchyRefStructure pointOfInterestHierarchyRef;
    @XmlElement(name = "ParentClassificationRef", required = true)
    protected PointOfInterestClassificationRefStructure parentClassificationRef;
    @XmlElement(name = "PointOfInterestClassificationRef", required = true)
    protected PointOfInterestClassificationRefStructure pointOfInterestClassificationRef;

    /**
     * Ruft den Wert der pointOfInterestHierarchyRef-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link PointOfInterestHierarchyRefStructure }
     *     
     */
    public PointOfInterestHierarchyRefStructure getPointOfInterestHierarchyRef() {
        return pointOfInterestHierarchyRef;
    }

    /**
     * Legt den Wert der pointOfInterestHierarchyRef-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link PointOfInterestHierarchyRefStructure }
     *     
     */
    public void setPointOfInterestHierarchyRef(PointOfInterestHierarchyRefStructure value) {
        this.pointOfInterestHierarchyRef = value;
    }

    /**
     * Ruft den Wert der parentClassificationRef-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link PointOfInterestClassificationRefStructure }
     *     
     */
    public PointOfInterestClassificationRefStructure getParentClassificationRef() {
        return parentClassificationRef;
    }

    /**
     * Legt den Wert der parentClassificationRef-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link PointOfInterestClassificationRefStructure }
     *     
     */
    public void setParentClassificationRef(PointOfInterestClassificationRefStructure value) {
        this.parentClassificationRef = value;
    }

    /**
     * Ruft den Wert der pointOfInterestClassificationRef-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link PointOfInterestClassificationRefStructure }
     *     
     */
    public PointOfInterestClassificationRefStructure getPointOfInterestClassificationRef() {
        return pointOfInterestClassificationRef;
    }

    /**
     * Legt den Wert der pointOfInterestClassificationRef-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link PointOfInterestClassificationRefStructure }
     *     
     */
    public void setPointOfInterestClassificationRef(PointOfInterestClassificationRefStructure value) {
        this.pointOfInterestClassificationRef = value;
    }

}
