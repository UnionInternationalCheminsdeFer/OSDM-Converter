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
 * Type for a VERSION FRAME.
 * 
 * <p>Java-Klasse f�r VersionFrame_VersionStructure complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="VersionFrame_VersionStructure">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.netex.org.uk/netex}DataManagedObjectStructure">
 *       &lt;sequence>
 *         &lt;group ref="{http://www.netex.org.uk/netex}VersionFrameGroup"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VersionFrame_VersionStructure", propOrder = {
    "name",
    "description",
    "typeOfFrameRef",
    "baselineVersionFrameRef",
    "codespaces",
    "frameDefaults",
    "versions",
    "prerequisites",
    "traces",
    "contentValidityConditions",
    "layers"
})
@XmlSeeAlso({
    CommonVersionFrameStructure.class
})
public class VersionFrameVersionStructure
    extends DataManagedObjectStructure
{

    @XmlElement(name = "Name")
    protected MultilingualString name;
    @XmlElement(name = "Description")
    protected MultilingualString description;
    @XmlElement(name = "TypeOfFrameRef")
    protected TypeOfFrameRefStructure typeOfFrameRef;
    @XmlElement(name = "BaselineVersionFrameRef")
    protected VersionRefStructure baselineVersionFrameRef;
    protected CodespacesRelStructure codespaces;
    @XmlElement(name = "FrameDefaults")
    protected VersionFrameDefaultsStructure frameDefaults;
    protected VersionsRelStructure versions;
    protected VersionFrameRefsRelStructure prerequisites;
    protected TracesRelStructure traces;
    protected ValidityConditionsRelStructure contentValidityConditions;
    protected LayerRefsRelStructure layers;

    /**
     * Ruft den Wert der name-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link MultilingualString }
     *     
     */
    public MultilingualString getName() {
        return name;
    }

    /**
     * Legt den Wert der name-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link MultilingualString }
     *     
     */
    public void setName(MultilingualString value) {
        this.name = value;
    }

    /**
     * Ruft den Wert der description-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link MultilingualString }
     *     
     */
    public MultilingualString getDescription() {
        return description;
    }

    /**
     * Legt den Wert der description-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link MultilingualString }
     *     
     */
    public void setDescription(MultilingualString value) {
        this.description = value;
    }

    /**
     * Reference to a TYPE OF VERSION FRAME.
     * 
     * @return
     *     possible object is
     *     {@link TypeOfFrameRefStructure }
     *     
     */
    public TypeOfFrameRefStructure getTypeOfFrameRef() {
        return typeOfFrameRef;
    }

    /**
     * Legt den Wert der typeOfFrameRef-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeOfFrameRefStructure }
     *     
     */
    public void setTypeOfFrameRef(TypeOfFrameRefStructure value) {
        this.typeOfFrameRef = value;
    }

    /**
     * Ruft den Wert der baselineVersionFrameRef-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link VersionRefStructure }
     *     
     */
    public VersionRefStructure getBaselineVersionFrameRef() {
        return baselineVersionFrameRef;
    }

    /**
     * Legt den Wert der baselineVersionFrameRef-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link VersionRefStructure }
     *     
     */
    public void setBaselineVersionFrameRef(VersionRefStructure value) {
        this.baselineVersionFrameRef = value;
    }

    /**
     * Ruft den Wert der codespaces-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link CodespacesRelStructure }
     *     
     */
    public CodespacesRelStructure getCodespaces() {
        return codespaces;
    }

    /**
     * Legt den Wert der codespaces-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link CodespacesRelStructure }
     *     
     */
    public void setCodespaces(CodespacesRelStructure value) {
        this.codespaces = value;
    }

    /**
     * Ruft den Wert der frameDefaults-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link VersionFrameDefaultsStructure }
     *     
     */
    public VersionFrameDefaultsStructure getFrameDefaults() {
        return frameDefaults;
    }

    /**
     * Legt den Wert der frameDefaults-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link VersionFrameDefaultsStructure }
     *     
     */
    public void setFrameDefaults(VersionFrameDefaultsStructure value) {
        this.frameDefaults = value;
    }

    /**
     * Ruft den Wert der versions-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link VersionsRelStructure }
     *     
     */
    public VersionsRelStructure getVersions() {
        return versions;
    }

    /**
     * Legt den Wert der versions-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link VersionsRelStructure }
     *     
     */
    public void setVersions(VersionsRelStructure value) {
        this.versions = value;
    }

    /**
     * Ruft den Wert der prerequisites-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link VersionFrameRefsRelStructure }
     *     
     */
    public VersionFrameRefsRelStructure getPrerequisites() {
        return prerequisites;
    }

    /**
     * Legt den Wert der prerequisites-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link VersionFrameRefsRelStructure }
     *     
     */
    public void setPrerequisites(VersionFrameRefsRelStructure value) {
        this.prerequisites = value;
    }

    /**
     * Ruft den Wert der traces-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link TracesRelStructure }
     *     
     */
    public TracesRelStructure getTraces() {
        return traces;
    }

    /**
     * Legt den Wert der traces-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link TracesRelStructure }
     *     
     */
    public void setTraces(TracesRelStructure value) {
        this.traces = value;
    }

    /**
     * Ruft den Wert der contentValidityConditions-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ValidityConditionsRelStructure }
     *     
     */
    public ValidityConditionsRelStructure getContentValidityConditions() {
        return contentValidityConditions;
    }

    /**
     * Legt den Wert der contentValidityConditions-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ValidityConditionsRelStructure }
     *     
     */
    public void setContentValidityConditions(ValidityConditionsRelStructure value) {
        this.contentValidityConditions = value;
    }

    /**
     * Ruft den Wert der layers-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link LayerRefsRelStructure }
     *     
     */
    public LayerRefsRelStructure getLayers() {
        return layers;
    }

    /**
     * Legt den Wert der layers-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link LayerRefsRelStructure }
     *     
     */
    public void setLayers(LayerRefsRelStructure value) {
        this.layers = value;
    }

}
