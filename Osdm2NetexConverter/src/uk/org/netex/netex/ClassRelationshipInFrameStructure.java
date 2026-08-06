//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// �nderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2026.05.22 um 10:24:00 AM CEST 
//


package uk.org.netex.netex;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import javax.xml.namespace.QName;


/**
 * Type for Relationship of Class of Entity.
 * 
 * <p>Java-Klasse f�r ClassRelationshipInFrameStructure complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="ClassRelationshipInFrameStructure">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.netex.org.uk/netex}RelationshipRef"/>
 *         &lt;element name="Mandatory" type="{http://www.netex.org.uk/netex}MandatoryEnumeration" minOccurs="0"/>
 *         &lt;element name="Containment" type="{http://www.netex.org.uk/netex}ContainmentEnumeration" minOccurs="0"/>
 *         &lt;element name="ModificationSet" type="{http://www.netex.org.uk/netex}ModificationSetEnumeration" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="name" type="{http://www.w3.org/2001/XMLSchema}QName" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ClassRelationshipInFrameStructure", propOrder = {
    "relationshipRef",
    "mandatory",
    "containment",
    "modificationSet"
})
public class ClassRelationshipInFrameStructure {

    @XmlElement(name = "RelationshipRef", required = true)
    protected RelationshipRefStructure relationshipRef;
    @XmlElement(name = "Mandatory", defaultValue = "optional")
    @XmlSchemaType(name = "normalizedString")
    protected MandatoryEnumeration mandatory;
    @XmlElement(name = "Containment", defaultValue = "both")
    @XmlSchemaType(name = "NMTOKEN")
    protected ContainmentEnumeration containment;
    @XmlElement(name = "ModificationSet")
    @XmlSchemaType(name = "NMTOKEN")
    protected ModificationSetEnumeration modificationSet;
    @XmlAttribute(name = "name")
    protected QName name;

    /**
     * Ruft den Wert der relationshipRef-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link RelationshipRefStructure }
     *     
     */
    public RelationshipRefStructure getRelationshipRef() {
        return relationshipRef;
    }

    /**
     * Legt den Wert der relationshipRef-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link RelationshipRefStructure }
     *     
     */
    public void setRelationshipRef(RelationshipRefStructure value) {
        this.relationshipRef = value;
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
     * Ruft den Wert der containment-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ContainmentEnumeration }
     *     
     */
    public ContainmentEnumeration getContainment() {
        return containment;
    }

    /**
     * Legt den Wert der containment-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ContainmentEnumeration }
     *     
     */
    public void setContainment(ContainmentEnumeration value) {
        this.containment = value;
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
     * Ruft den Wert der name-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link QName }
     *     
     */
    public QName getName() {
        return name;
    }

    /**
     * Legt den Wert der name-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link QName }
     *     
     */
    public void setName(QName value) {
        this.name = value;
    }

}
