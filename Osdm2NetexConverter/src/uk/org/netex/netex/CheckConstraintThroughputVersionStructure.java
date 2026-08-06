//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// �nderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2026.05.22 um 10:24:00 AM CEST 
//


package uk.org.netex.netex;

import java.math.BigInteger;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;
import javax.xml.datatype.Duration;


/**
 * Type for a CHECK CONSTRAINT THROUGHPUT.
 * 
 * <p>Java-Klasse f�r CheckConstraintThroughput_VersionStructure complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="CheckConstraintThroughput_VersionStructure">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.netex.org.uk/netex}Assignment_VersionStructure">
 *       &lt;sequence>
 *         &lt;group ref="{http://www.netex.org.uk/netex}CheckConstraintThroughputGroup"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CheckConstraintThroughput_VersionStructure", propOrder = {
    "checkConstraintRef",
    "period",
    "maximumPassengers",
    "averagePassengers",
    "wheelchairPassengers"
})
@XmlSeeAlso({
    CheckConstraintThroughput.class
})
public class CheckConstraintThroughputVersionStructure
    extends AssignmentVersionStructure
{

    @XmlElement(name = "CheckConstraintRef")
    protected CheckConstraintRefStructure checkConstraintRef;
    @XmlElement(name = "Period")
    protected Duration period;
    @XmlElement(name = "MaximumPassengers")
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger maximumPassengers;
    @XmlElement(name = "AveragePassengers")
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger averagePassengers;
    @XmlElement(name = "WheelchairPassengers")
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger wheelchairPassengers;

    /**
     * Ruft den Wert der checkConstraintRef-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link CheckConstraintRefStructure }
     *     
     */
    public CheckConstraintRefStructure getCheckConstraintRef() {
        return checkConstraintRef;
    }

    /**
     * Legt den Wert der checkConstraintRef-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link CheckConstraintRefStructure }
     *     
     */
    public void setCheckConstraintRef(CheckConstraintRefStructure value) {
        this.checkConstraintRef = value;
    }

    /**
     * Ruft den Wert der period-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Duration }
     *     
     */
    public Duration getPeriod() {
        return period;
    }

    /**
     * Legt den Wert der period-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Duration }
     *     
     */
    public void setPeriod(Duration value) {
        this.period = value;
    }

    /**
     * Ruft den Wert der maximumPassengers-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getMaximumPassengers() {
        return maximumPassengers;
    }

    /**
     * Legt den Wert der maximumPassengers-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setMaximumPassengers(BigInteger value) {
        this.maximumPassengers = value;
    }

    /**
     * Ruft den Wert der averagePassengers-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getAveragePassengers() {
        return averagePassengers;
    }

    /**
     * Legt den Wert der averagePassengers-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setAveragePassengers(BigInteger value) {
        this.averagePassengers = value;
    }

    /**
     * Ruft den Wert der wheelchairPassengers-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getWheelchairPassengers() {
        return wheelchairPassengers;
    }

    /**
     * Legt den Wert der wheelchairPassengers-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setWheelchairPassengers(BigInteger value) {
        this.wheelchairPassengers = value;
    }

}
