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
import jakarta.xml.bind.annotation.adapters.CollapsedStringAdapter;
import jakarta.xml.bind.annotation.adapters.NormalizedStringAdapter;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * Type for a reference to a LINK.
 * 
 * <p>Java-Klasse f�r ModalLinkRefByValue2Structure complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="ModalLinkRefByValue2Structure">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="FromPointRef" type="{http://www.netex.org.uk/netex}PointRefStructure"/>
 *         &lt;element name="ToPointRef" type="{http://www.netex.org.uk/netex}PointRefStructure"/>
 *         &lt;element ref="{http://www.netex.org.uk/netex}TypeOfLinkRef" minOccurs="0"/>
 *         &lt;sequence>
 *           &lt;element ref="{http://www.netex.org.uk/netex}VehicleMode" minOccurs="0"/>
 *         &lt;/sequence>
 *       &lt;/sequence>
 *       &lt;attGroup ref="{http://www.netex.org.uk/netex}ReferenceModificationDetailsGroup"/>
 *       &lt;attribute name="nameOfClass" type="{http://www.netex.org.uk/netex}NameOfClass" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ModalLinkRefByValue2Structure", propOrder = {
    "fromPointRef",
    "toPointRef",
    "typeOfLinkRef",
    "vehicleMode"
})
public class ModalLinkRefByValue2Structure {

    @XmlElement(name = "FromPointRef", required = true)
    protected PointRefStructure fromPointRef;
    @XmlElement(name = "ToPointRef", required = true)
    protected PointRefStructure toPointRef;
    @XmlElement(name = "TypeOfLinkRef")
    protected TypeOfLinkRefStructure typeOfLinkRef;
    @XmlElement(name = "VehicleMode")
    @XmlSchemaType(name = "NMTOKEN")
    protected AllPublicTransportModesEnumeration vehicleMode;
    @XmlAttribute(name = "nameOfClass")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String nameOfClass;
    @XmlAttribute(name = "created")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar created;
    @XmlAttribute(name = "changed")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar changed;
    @XmlAttribute(name = "version")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String version;

    /**
     * Ruft den Wert der fromPointRef-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link PointRefStructure }
     *     
     */
    public PointRefStructure getFromPointRef() {
        return fromPointRef;
    }

    /**
     * Legt den Wert der fromPointRef-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link PointRefStructure }
     *     
     */
    public void setFromPointRef(PointRefStructure value) {
        this.fromPointRef = value;
    }

    /**
     * Ruft den Wert der toPointRef-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link PointRefStructure }
     *     
     */
    public PointRefStructure getToPointRef() {
        return toPointRef;
    }

    /**
     * Legt den Wert der toPointRef-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link PointRefStructure }
     *     
     */
    public void setToPointRef(PointRefStructure value) {
        this.toPointRef = value;
    }

    /**
     * Ruft den Wert der typeOfLinkRef-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link TypeOfLinkRefStructure }
     *     
     */
    public TypeOfLinkRefStructure getTypeOfLinkRef() {
        return typeOfLinkRef;
    }

    /**
     * Legt den Wert der typeOfLinkRef-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeOfLinkRefStructure }
     *     
     */
    public void setTypeOfLinkRef(TypeOfLinkRefStructure value) {
        this.typeOfLinkRef = value;
    }

    /**
     * Ruft den Wert der vehicleMode-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link AllPublicTransportModesEnumeration }
     *     
     */
    public AllPublicTransportModesEnumeration getVehicleMode() {
        return vehicleMode;
    }

    /**
     * Legt den Wert der vehicleMode-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link AllPublicTransportModesEnumeration }
     *     
     */
    public void setVehicleMode(AllPublicTransportModesEnumeration value) {
        this.vehicleMode = value;
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
     * Ruft den Wert der changed-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getChanged() {
        return changed;
    }

    /**
     * Legt den Wert der changed-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setChanged(XMLGregorianCalendar value) {
        this.changed = value;
    }

    /**
     * Ruft den Wert der version-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVersion() {
        return version;
    }

    /**
     * Legt den Wert der version-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVersion(String value) {
        this.version = value;
    }

}
