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
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.CollapsedStringAdapter;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * Type for CLASS IN FRAME.
 * 
 * <p>Java-Klasse f�r ClassInFrameStructure complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="ClassInFrameStructure">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;group ref="{http://www.netex.org.uk/netex}ClassInFrameGroup"/>
 *       &lt;/sequence>
 *       &lt;attribute name="nameOfClass" type="{http://www.netex.org.uk/netex}NameOfClass" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ClassInFrameStructure", propOrder = {
    "classRefType",
    "typeOfFrameRef",
    "mandatory",
    "attributes",
    "relationships"
})
public class ClassInFrameStructure {

    @XmlElement(name = "ClassRefType", defaultValue = "members")
    @XmlSchemaType(name = "normalizedString")
    protected ClassRefTypeEnumeration classRefType;
    @XmlElement(name = "TypeOfFrameRef")
    protected TypeOfFrameRefStructure typeOfFrameRef;
    @XmlElement(name = "Mandatory", defaultValue = "optional")
    @XmlSchemaType(name = "normalizedString")
    protected MandatoryEnumeration mandatory;
    protected ClassInFrameStructure.Attributes attributes;
    protected ClassInFrameStructure.Relationships relationships;
    @XmlAttribute(name = "nameOfClass")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String nameOfClass;

    /**
     * Ruft den Wert der classRefType-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ClassRefTypeEnumeration }
     *     
     */
    public ClassRefTypeEnumeration getClassRefType() {
        return classRefType;
    }

    /**
     * Legt den Wert der classRefType-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ClassRefTypeEnumeration }
     *     
     */
    public void setClassRefType(ClassRefTypeEnumeration value) {
        this.classRefType = value;
    }

    /**
     * Type of Frame containing Class.
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
     * Ruft den Wert der mandatory-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link MandatoryEnumeration }
     *     
     */
    public MandatoryEnumeration getMandatory() {
        return mandatory;
    }

    /**
     * Legt den Wert der mandatory-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link MandatoryEnumeration }
     *     
     */
    public void setMandatory(MandatoryEnumeration value) {
        this.mandatory = value;
    }

    /**
     * Ruft den Wert der attributes-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ClassInFrameStructure.Attributes }
     *     
     */
    public ClassInFrameStructure.Attributes getAttributes() {
        return attributes;
    }

    /**
     * Legt den Wert der attributes-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ClassInFrameStructure.Attributes }
     *     
     */
    public void setAttributes(ClassInFrameStructure.Attributes value) {
        this.attributes = value;
    }

    /**
     * Ruft den Wert der relationships-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ClassInFrameStructure.Relationships }
     *     
     */
    public ClassInFrameStructure.Relationships getRelationships() {
        return relationships;
    }

    /**
     * Legt den Wert der relationships-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ClassInFrameStructure.Relationships }
     *     
     */
    public void setRelationships(ClassInFrameStructure.Relationships value) {
        this.relationships = value;
    }

    /**
     * Ruft den Wert der nameOfClass-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNameOfClass() {
        return nameOfClass;
    }

    /**
     * Legt den Wert der nameOfClass-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNameOfClass(String value) {
        this.nameOfClass = value;
    }


    /**
     * <p>Java-Klasse f�r anonymous complex type.
     * 
     * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element ref="{http://www.netex.org.uk/netex}ClassAttributeInFrame" maxOccurs="unbounded"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "classAttributeInFrame"
    })
    public static class Attributes {

        @XmlElement(name = "ClassAttributeInFrame", required = true)
        protected List<ClassAttributeInFrame> classAttributeInFrame;

        /**
         * Attribute of Class of ENTITY. This is a metaclass that allows services to specify whether an attribute for a class must be present in a given frame.Gets the value of the classAttributeInFrame property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the classAttributeInFrame property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getClassAttributeInFrame().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link ClassAttributeInFrame }
         * 
         * 
         */
        public List<ClassAttributeInFrame> getClassAttributeInFrame() {
            if (classAttributeInFrame == null) {
                classAttributeInFrame = new ArrayList<ClassAttributeInFrame>();
            }
            return this.classAttributeInFrame;
        }

    }


    /**
     * <p>Java-Klasse f�r anonymous complex type.
     * 
     * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element ref="{http://www.netex.org.uk/netex}ClassRelationshipInFrame" maxOccurs="unbounded"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "classRelationshipInFrame"
    })
    public static class Relationships {

        @XmlElement(name = "ClassRelationshipInFrame", required = true)
        protected List<ClassRelationshipInFrameStructure> classRelationshipInFrame;

        /**
         * Attribute of Class of ENTITY. This is a metaclass that allows services to specify whether an attribute for a class must be present in a given frame.Gets the value of the classRelationshipInFrame property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the classRelationshipInFrame property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getClassRelationshipInFrame().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link ClassRelationshipInFrameStructure }
         * 
         * 
         */
        public List<ClassRelationshipInFrameStructure> getClassRelationshipInFrame() {
            if (classRelationshipInFrame == null) {
                classRelationshipInFrame = new ArrayList<ClassRelationshipInFrameStructure>();
            }
            return this.classRelationshipInFrame;
        }

    }

}
