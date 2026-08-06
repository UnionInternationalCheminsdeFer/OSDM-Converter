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
import jakarta.xml.bind.annotation.adapters.NormalizedStringAdapter;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * Type for a DELTA.
 * 
 * <p>Java-Klasse f�r DeltaStructure complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="DeltaStructure">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;group ref="{http://www.netex.org.uk/netex}DeltaGroup"/>
 *       &lt;attribute name="id" type="{http://www.netex.org.uk/netex}DeltaIdType" />
 *       &lt;attribute name="created" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DeltaStructure", propOrder = {
    "simpleObjectRef",
    "fromVersionRef",
    "toVersionRef",
    "modification",
    "deltaValues"
})
public class DeltaStructure {

    @XmlElement(name = "SimpleObjectRef")
    protected SimpleObjectRefStructure simpleObjectRef;
    @XmlElement(name = "FromVersionRef")
    protected DeltaStructure.FromVersionRef fromVersionRef;
    @XmlElement(name = "ToVersionRef", required = true)
    protected DeltaStructure.ToVersionRef toVersionRef;
    @XmlElement(name = "Modification", defaultValue = "revise")
    @XmlSchemaType(name = "NMTOKEN")
    protected ModificationEnumeration modification;
    protected DeltaValuesRelStructure deltaValues;
    @XmlAttribute(name = "id")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String id;
    @XmlAttribute(name = "created")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar created;

    /**
     * Ruft den Wert der simpleObjectRef-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link SimpleObjectRefStructure }
     *     
     */
    public SimpleObjectRefStructure getSimpleObjectRef() {
        return simpleObjectRef;
    }

    /**
     * Legt den Wert der simpleObjectRef-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link SimpleObjectRefStructure }
     *     
     */
    public void setSimpleObjectRef(SimpleObjectRefStructure value) {
        this.simpleObjectRef = value;
    }

    /**
     * Ruft den Wert der fromVersionRef-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link DeltaStructure.FromVersionRef }
     *     
     */
    public DeltaStructure.FromVersionRef getFromVersionRef() {
        return fromVersionRef;
    }

    /**
     * Legt den Wert der fromVersionRef-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link DeltaStructure.FromVersionRef }
     *     
     */
    public void setFromVersionRef(DeltaStructure.FromVersionRef value) {
        this.fromVersionRef = value;
    }

    /**
     * Ruft den Wert der toVersionRef-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link DeltaStructure.ToVersionRef }
     *     
     */
    public DeltaStructure.ToVersionRef getToVersionRef() {
        return toVersionRef;
    }

    /**
     * Legt den Wert der toVersionRef-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link DeltaStructure.ToVersionRef }
     *     
     */
    public void setToVersionRef(DeltaStructure.ToVersionRef value) {
        this.toVersionRef = value;
    }

    /**
     * Ruft den Wert der modification-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ModificationEnumeration }
     *     
     */
    public ModificationEnumeration getModification() {
        return modification;
    }

    /**
     * Legt den Wert der modification-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ModificationEnumeration }
     *     
     */
    public void setModification(ModificationEnumeration value) {
        this.modification = value;
    }

    /**
     * Ruft den Wert der deltaValues-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link DeltaValuesRelStructure }
     *     
     */
    public DeltaValuesRelStructure getDeltaValues() {
        return deltaValues;
    }

    /**
     * Legt den Wert der deltaValues-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link DeltaValuesRelStructure }
     *     
     */
    public void setDeltaValues(DeltaValuesRelStructure value) {
        this.deltaValues = value;
    }

    /**
     * Ruft den Wert der id-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getId() {
        return id;
    }

    /**
     * Legt den Wert der id-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setId(String value) {
        this.id = value;
    }

    /**
     * Ruft den Wert der created-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCreated() {
        return created;
    }

    /**
     * Legt den Wert der created-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCreated(XMLGregorianCalendar value) {
        this.created = value;
    }


    /**
     * <p>Java-Klasse f�r anonymous complex type.
     * 
     * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;simpleContent>
     *     &lt;restriction base="&lt;http://www.netex.org.uk/netex>SimpleObjectRefStructure">
     *       &lt;attribute name="ref" use="required" type="{http://www.netex.org.uk/netex}VersionIdType" />
     *     &lt;/restriction>
     *   &lt;/simpleContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class FromVersionRef
        extends SimpleObjectRefStructure
    {


    }


    /**
     * <p>Java-Klasse f�r anonymous complex type.
     * 
     * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;simpleContent>
     *     &lt;restriction base="&lt;http://www.netex.org.uk/netex>SimpleObjectRefStructure">
     *       &lt;attribute name="ref" use="required" type="{http://www.netex.org.uk/netex}VersionIdType" />
     *     &lt;/restriction>
     *   &lt;/simpleContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class ToVersionRef
        extends SimpleObjectRefStructure
    {


    }

}
