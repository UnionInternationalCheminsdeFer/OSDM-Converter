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
 * Type for a ROUGH SURFACE.
 * 
 * <p>Java-Klasse f�r RoughSurfaceStructure complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="RoughSurfaceStructure">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.netex.org.uk/netex}AccessEquipment_VersionStructure">
 *       &lt;sequence>
 *         &lt;group ref="{http://www.netex.org.uk/netex}RoughSurfaceGroup"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RoughSurfaceStructure", propOrder = {
    "surfaceType",
    "visualContrast",
    "suitableForCycles"
})
@XmlSeeAlso({
    RoughSurface.class
})
public class RoughSurfaceStructure
    extends AccessEquipmentVersionStructure
{

    @XmlElement(name = "SurfaceType", required = true)
    @XmlSchemaType(name = "normalizedString")
    protected SurfaceTypeEnumeration surfaceType;
    @XmlElement(name = "VisualContrast")
    protected Boolean visualContrast;
    @XmlElement(name = "SuitableForCycles")
    protected Boolean suitableForCycles;

    /**
     * Ruft den Wert der surfaceType-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link SurfaceTypeEnumeration }
     *     
     */
    public SurfaceTypeEnumeration getSurfaceType() {
        return surfaceType;
    }

    /**
     * Legt den Wert der surfaceType-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link SurfaceTypeEnumeration }
     *     
     */
    public void setSurfaceType(SurfaceTypeEnumeration value) {
        this.surfaceType = value;
    }

    /**
     * Ruft den Wert der visualContrast-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isVisualContrast() {
        return visualContrast;
    }

    /**
     * Legt den Wert der visualContrast-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setVisualContrast(Boolean value) {
        this.visualContrast = value;
    }

    /**
     * Ruft den Wert der suitableForCycles-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSuitableForCycles() {
        return suitableForCycles;
    }

    /**
     * Legt den Wert der suitableForCycles-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSuitableForCycles(Boolean value) {
        this.suitableForCycles = value;
    }

}
