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
 * Type for a TYPE OF VERSION FRAME.
 * 
 * <p>Java-Klasse f�r TypeOfFrame_ValueStructure complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="TypeOfFrame_ValueStructure">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.netex.org.uk/netex}TypeOfEntity_VersionStructure">
 *       &lt;group ref="{http://www.netex.org.uk/netex}TypeOfFrameGroup"/>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TypeOfFrame_ValueStructure", propOrder = {
    "typeOfValidityRef",
    "frameClassRef",
    "classes",
    "typesOfEntity",
    "includes",
    "locatingSystemRef",
    "modificationSet",
    "layerRef"
})
@XmlSeeAlso({
    TypeOfFrame.class
})
public class TypeOfFrameValueStructure
    extends TypeOfEntityVersionStructure
{

    @XmlElement(name = "TypeOfValidityRef")
    protected TypeOfValidityRefStructure typeOfValidityRef;
    @XmlElement(name = "FrameClassRef")
    protected ClassRefStructure frameClassRef;
    protected ClassesInRepositoryRelStructure classes;
    protected TypeOfEntityRefsRelStructure typesOfEntity;
    protected TypesOfFrameRelStructure includes;
    @XmlElement(name = "LocatingSystemRef")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String locatingSystemRef;
    @XmlElement(name = "ModificationSet")
    @XmlSchemaType(name = "NMTOKEN")
    protected ModificationSetEnumeration modificationSet;
    @XmlElement(name = "LayerRef")
    protected LayerRefStructure layerRef;

    /**
     * Ruft den Wert der typeOfValidityRef-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link TypeOfValidityRefStructure }
     *     
     */
    public TypeOfValidityRefStructure getTypeOfValidityRef() {
        return typeOfValidityRef;
    }

    /**
     * Legt den Wert der typeOfValidityRef-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeOfValidityRefStructure }
     *     
     */
    public void setTypeOfValidityRef(TypeOfValidityRefStructure value) {
        this.typeOfValidityRef = value;
    }

    /**
     * Ruft den Wert der frameClassRef-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ClassRefStructure }
     *     
     */
    public ClassRefStructure getFrameClassRef() {
        return frameClassRef;
    }

    /**
     * Legt den Wert der frameClassRef-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ClassRefStructure }
     *     
     */
    public void setFrameClassRef(ClassRefStructure value) {
        this.frameClassRef = value;
    }

    /**
     * Ruft den Wert der classes-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ClassesInRepositoryRelStructure }
     *     
     */
    public ClassesInRepositoryRelStructure getClasses() {
        return classes;
    }

    /**
     * Legt den Wert der classes-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ClassesInRepositoryRelStructure }
     *     
     */
    public void setClasses(ClassesInRepositoryRelStructure value) {
        this.classes = value;
    }

    /**
     * Ruft den Wert der typesOfEntity-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link TypeOfEntityRefsRelStructure }
     *     
     */
    public TypeOfEntityRefsRelStructure getTypesOfEntity() {
        return typesOfEntity;
    }

    /**
     * Legt den Wert der typesOfEntity-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeOfEntityRefsRelStructure }
     *     
     */
    public void setTypesOfEntity(TypeOfEntityRefsRelStructure value) {
        this.typesOfEntity = value;
    }

    /**
     * Ruft den Wert der includes-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link TypesOfFrameRelStructure }
     *     
     */
    public TypesOfFrameRelStructure getIncludes() {
        return includes;
    }

    /**
     * Legt den Wert der includes-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link TypesOfFrameRelStructure }
     *     
     */
    public void setIncludes(TypesOfFrameRelStructure value) {
        this.includes = value;
    }

    /**
     * Ruft den Wert der locatingSystemRef-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLocatingSystemRef() {
        return locatingSystemRef;
    }

    /**
     * Legt den Wert der locatingSystemRef-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLocatingSystemRef(String value) {
        this.locatingSystemRef = value;
    }

    /**
     * Ruft den Wert der modificationSet-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ModificationSetEnumeration }
     *     
     */
    public ModificationSetEnumeration getModificationSet() {
        return modificationSet;
    }

    /**
     * Legt den Wert der modificationSet-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ModificationSetEnumeration }
     *     
     */
    public void setModificationSet(ModificationSetEnumeration value) {
        this.modificationSet = value;
    }

    /**
     * Ruft den Wert der layerRef-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link LayerRefStructure }
     *     
     */
    public LayerRefStructure getLayerRef() {
        return layerRef;
    }

    /**
     * Legt den Wert der layerRef-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link LayerRefStructure }
     *     
     */
    public void setLayerRef(LayerRefStructure value) {
        this.layerRef = value;
    }

}
