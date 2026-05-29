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
import jakarta.xml.bind.annotation.XmlType;


/**
 * Type for a CELL.
 * 
 * <p>Java-Klasse f�r CommonCell_VersionedChildStructure complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="CommonCell_VersionedChildStructure">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.netex.org.uk/netex}VersionedChildStructure">
 *       &lt;sequence>
 *         &lt;group ref="{http://www.netex.org.uk/netex}CommonCellGroup"/>
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
@XmlType(name = "CommonCell_VersionedChildStructure", propOrder = {
    "name",
    "description",
    "fareTableRef",
    "columnRef",
    "rowRef"
})
public class CommonCellVersionedChildStructure
    extends VersionedChildStructure
{

    @XmlElement(name = "Name")
    protected MultilingualString name;
    @XmlElement(name = "Description")
    protected MultilingualString description;
    @XmlElementRef(name = "FareTableRef", namespace = "http://www.netex.org.uk/netex", type = JAXBElement.class, required = false)
    protected JAXBElement<? extends FareTableRefStructure> fareTableRef;
    @XmlElement(name = "ColumnRef")
    protected FareTableColumnRefStructure columnRef;
    @XmlElement(name = "RowRef")
    protected FareTableRowRefStructure rowRef;
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
     * Ruft den Wert der columnRef-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FareTableColumnRefStructure }
     *     
     */
    public FareTableColumnRefStructure getColumnRef() {
        return columnRef;
    }

    /**
     * Legt den Wert der columnRef-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FareTableColumnRefStructure }
     *     
     */
    public void setColumnRef(FareTableColumnRefStructure value) {
        this.columnRef = value;
    }

    /**
     * Ruft den Wert der rowRef-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FareTableRowRefStructure }
     *     
     */
    public FareTableRowRefStructure getRowRef() {
        return rowRef;
    }

    /**
     * Legt den Wert der rowRef-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FareTableRowRefStructure }
     *     
     */
    public void setRowRef(FareTableRowRefStructure value) {
        this.rowRef = value;
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
