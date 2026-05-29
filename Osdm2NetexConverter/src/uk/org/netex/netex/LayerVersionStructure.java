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
 * Type for LAYER.
 * 
 * <p>Java-Klasse f�r Layer_VersionStructure complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="Layer_VersionStructure">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.netex.org.uk/netex}GroupOfEntities_VersionStructure">
 *       &lt;group ref="{http://www.netex.org.uk/netex}LayerGroup"/>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Layer_VersionStructure", propOrder = {
    "locationSystem",
    "versionFrames",
    "members"
})
@XmlSeeAlso({
    Layer.class
})
public abstract class LayerVersionStructure
    extends GroupOfEntitiesVersionStructure
{

    @XmlElement(name = "LocationSystem")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String locationSystem;
    protected VersionFrameRefsRelStructure versionFrames;
    protected ObjectRefsRelStructure members;

    /**
     * Ruft den Wert der locationSystem-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLocationSystem() {
        return locationSystem;
    }

    /**
     * Legt den Wert der locationSystem-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLocationSystem(String value) {
        this.locationSystem = value;
    }

    /**
     * Ruft den Wert der versionFrames-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link VersionFrameRefsRelStructure }
     *     
     */
    public VersionFrameRefsRelStructure getVersionFrames() {
        return versionFrames;
    }

    /**
     * Legt den Wert der versionFrames-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link VersionFrameRefsRelStructure }
     *     
     */
    public void setVersionFrames(VersionFrameRefsRelStructure value) {
        this.versionFrames = value;
    }

    /**
     * Ruft den Wert der members-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ObjectRefsRelStructure }
     *     
     */
    public ObjectRefsRelStructure getMembers() {
        return members;
    }

    /**
     * Legt den Wert der members-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ObjectRefsRelStructure }
     *     
     */
    public void setMembers(ObjectRefsRelStructure value) {
        this.members = value;
    }

}
