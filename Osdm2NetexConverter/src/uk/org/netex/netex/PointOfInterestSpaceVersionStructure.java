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


/**
 * Type for a POINT OF INTEREST SPACE.
 * 
 * <p>Java-Klasse f�r PointOfInterestSpace_VersionStructure complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="PointOfInterestSpace_VersionStructure">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.netex.org.uk/netex}PointOfInterestComponent_VersionStructure">
 *       &lt;sequence>
 *         &lt;group ref="{http://www.netex.org.uk/netex}PointOfInterestSpaceGroup"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PointOfInterestSpace_VersionStructure", propOrder = {
    "accessSpaceType",
    "pointOfInterestSpaceType",
    "passageType",
    "parentPointOfInterestSpaceRef",
    "entrances"
})
@XmlSeeAlso({
    PointOfInterestSpace.class
})
public class PointOfInterestSpaceVersionStructure
    extends PointOfInterestComponentVersionStructure
{

    @XmlElement(name = "AccessSpaceType")
    protected AccessSpaceTypeEnumeration accessSpaceType;
    @XmlElement(name = "PointOfInterestSpaceType")
    @XmlSchemaType(name = "string")
    protected PointOfInterestSpaceTypeEnumeration pointOfInterestSpaceType;
    @XmlElement(name = "PassageType")
    @XmlSchemaType(name = "string")
    protected PassageTypeEnumeration passageType;
    @XmlElement(name = "ParentPointOfInterestSpaceRef")
    protected PointOfInterestSpaceRefStructure parentPointOfInterestSpaceRef;
    protected PointOfInterestEntrancesRelStructure entrances;

    /**
     * Ruft den Wert der accessSpaceType-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link AccessSpaceTypeEnumeration }
     *     
     */
    public AccessSpaceTypeEnumeration getAccessSpaceType() {
        return accessSpaceType;
    }

    /**
     * Legt den Wert der accessSpaceType-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link AccessSpaceTypeEnumeration }
     *     
     */
    public void setAccessSpaceType(AccessSpaceTypeEnumeration value) {
        this.accessSpaceType = value;
    }

    /**
     * Ruft den Wert der pointOfInterestSpaceType-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link PointOfInterestSpaceTypeEnumeration }
     *     
     */
    public PointOfInterestSpaceTypeEnumeration getPointOfInterestSpaceType() {
        return pointOfInterestSpaceType;
    }

    /**
     * Legt den Wert der pointOfInterestSpaceType-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link PointOfInterestSpaceTypeEnumeration }
     *     
     */
    public void setPointOfInterestSpaceType(PointOfInterestSpaceTypeEnumeration value) {
        this.pointOfInterestSpaceType = value;
    }

    /**
     * Ruft den Wert der passageType-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link PassageTypeEnumeration }
     *     
     */
    public PassageTypeEnumeration getPassageType() {
        return passageType;
    }

    /**
     * Legt den Wert der passageType-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link PassageTypeEnumeration }
     *     
     */
    public void setPassageType(PassageTypeEnumeration value) {
        this.passageType = value;
    }

    /**
     * Ruft den Wert der parentPointOfInterestSpaceRef-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link PointOfInterestSpaceRefStructure }
     *     
     */
    public PointOfInterestSpaceRefStructure getParentPointOfInterestSpaceRef() {
        return parentPointOfInterestSpaceRef;
    }

    /**
     * Legt den Wert der parentPointOfInterestSpaceRef-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link PointOfInterestSpaceRefStructure }
     *     
     */
    public void setParentPointOfInterestSpaceRef(PointOfInterestSpaceRefStructure value) {
        this.parentPointOfInterestSpaceRef = value;
    }

    /**
     * Ruft den Wert der entrances-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link PointOfInterestEntrancesRelStructure }
     *     
     */
    public PointOfInterestEntrancesRelStructure getEntrances() {
        return entrances;
    }

    /**
     * Legt den Wert der entrances-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link PointOfInterestEntrancesRelStructure }
     *     
     */
    public void setEntrances(PointOfInterestEntrancesRelStructure value) {
        this.entrances = value;
    }

}
