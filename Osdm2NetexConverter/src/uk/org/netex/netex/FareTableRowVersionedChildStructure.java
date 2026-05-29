//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// �nderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2026.05.22 um 10:24:00 AM CEST 
//


package uk.org.netex.netex;

import java.math.BigInteger;
import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlElementRef;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Type for a FARE TABLE ROW .
 * 
 * <p>Java-Klasse f�r FareTableRow_VersionedChildStructure complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="FareTableRow_VersionedChildStructure">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.netex.org.uk/netex}VersionedChildStructure">
 *       &lt;sequence>
 *         &lt;group ref="{http://www.netex.org.uk/netex}FareTableRowGroup"/>
 *       &lt;/sequence>
 *       &lt;attribute name="order" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FareTableRow_VersionedChildStructure", propOrder = {
    "name",
    "label",
    "fareTableRef",
    "noticeAssignments",
    "representing",
    "rows"
})
@XmlSeeAlso({
    FareTableRow.class
})
public class FareTableRowVersionedChildStructure
    extends VersionedChildStructure
{

    @XmlElement(name = "Name")
    protected MultilingualString name;
    @XmlElement(name = "Label")
    protected MultilingualString label;
    @XmlElementRef(name = "FareTableRef", namespace = "http://www.netex.org.uk/netex", type = JAXBElement.class, required = false)
    protected JAXBElement<? extends FareTableRefStructure> fareTableRef;
    protected NoticeAssignmentsRelStructure noticeAssignments;
    protected ObjectRefsRelStructure representing;
    protected FareTableRowsRelStructure rows;
    @XmlAttribute(name = "order")
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger order;

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
     * Ruft den Wert der label-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link MultilingualString }
     *     
     */
    public MultilingualString getLabel() {
        return label;
    }

    /**
     * Legt den Wert der label-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link MultilingualString }
     *     
     */
    public void setLabel(MultilingualString value) {
        this.label = value;
    }

    /**
     * Ruft den Wert der fareTableRef-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link FareTableRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link StandardFareTableRefStructure }{@code >}
     *     
     */
    public JAXBElement<? extends FareTableRefStructure> getFareTableRef() {
        return fareTableRef;
    }

    /**
     * Legt den Wert der fareTableRef-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link FareTableRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link StandardFareTableRefStructure }{@code >}
     *     
     */
    public void setFareTableRef(JAXBElement<? extends FareTableRefStructure> value) {
        this.fareTableRef = value;
    }

    /**
     * Ruft den Wert der noticeAssignments-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link NoticeAssignmentsRelStructure }
     *     
     */
    public NoticeAssignmentsRelStructure getNoticeAssignments() {
        return noticeAssignments;
    }

    /**
     * Legt den Wert der noticeAssignments-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link NoticeAssignmentsRelStructure }
     *     
     */
    public void setNoticeAssignments(NoticeAssignmentsRelStructure value) {
        this.noticeAssignments = value;
    }

    /**
     * Ruft den Wert der representing-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ObjectRefsRelStructure }
     *     
     */
    public ObjectRefsRelStructure getRepresenting() {
        return representing;
    }

    /**
     * Legt den Wert der representing-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ObjectRefsRelStructure }
     *     
     */
    public void setRepresenting(ObjectRefsRelStructure value) {
        this.representing = value;
    }

    /**
     * Ruft den Wert der rows-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FareTableRowsRelStructure }
     *     
     */
    public FareTableRowsRelStructure getRows() {
        return rows;
    }

    /**
     * Legt den Wert der rows-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FareTableRowsRelStructure }
     *     
     */
    public void setRows(FareTableRowsRelStructure value) {
        this.rows = value;
    }

    /**
     * Ruft den Wert der order-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getOrder() {
        return order;
    }

    /**
     * Legt den Wert der order-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setOrder(BigInteger value) {
        this.order = value;
    }

}
