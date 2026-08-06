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
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * Type for PASSENGER AT STOP TIME.
 * 
 * <p>Java-Klasse f�r PassengerAtStopTime_VersionedChildStructure complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="PassengerAtStopTime_VersionedChildStructure">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.netex.org.uk/netex}PassingTime_VersionedChildStructure">
 *       &lt;sequence>
 *         &lt;group ref="{http://www.netex.org.uk/netex}PassengerAtStopTimeGroup"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PassengerAtStopTime_VersionedChildStructure", propOrder = {
    "description",
    "earliestTime",
    "earliestDayOffset",
    "latestTime",
    "latestDayOffset",
    "checkConstraintRef",
    "checkConstraintProcess"
})
@XmlSeeAlso({
    PassengerAtStopTime.class
})
public class PassengerAtStopTimeVersionedChildStructure
    extends PassingTimeVersionedChildStructure
{

    @XmlElement(name = "Description")
    protected MultilingualString description;
    @XmlElement(name = "EarliestTime")
    @XmlSchemaType(name = "time")
    protected XMLGregorianCalendar earliestTime;
    @XmlElement(name = "EarliestDayOffset", defaultValue = "0")
    protected BigInteger earliestDayOffset;
    @XmlElement(name = "LatestTime")
    @XmlSchemaType(name = "time")
    protected XMLGregorianCalendar latestTime;
    @XmlElement(name = "LatestDayOffset", defaultValue = "0")
    protected BigInteger latestDayOffset;
    @XmlElement(name = "CheckConstraintRef")
    protected CheckConstraintRefStructure checkConstraintRef;
    @XmlElement(name = "CheckConstraintProcess")
    @XmlSchemaType(name = "string")
    protected CheckProcessTypeEnumeration checkConstraintProcess;

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
     * Ruft den Wert der earliestTime-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getEarliestTime() {
        return earliestTime;
    }

    /**
     * Legt den Wert der earliestTime-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setEarliestTime(XMLGregorianCalendar value) {
        this.earliestTime = value;
    }

    /**
     * Ruft den Wert der earliestDayOffset-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getEarliestDayOffset() {
        return earliestDayOffset;
    }

    /**
     * Legt den Wert der earliestDayOffset-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setEarliestDayOffset(BigInteger value) {
        this.earliestDayOffset = value;
    }

    /**
     * Ruft den Wert der latestTime-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getLatestTime() {
        return latestTime;
    }

    /**
     * Legt den Wert der latestTime-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setLatestTime(XMLGregorianCalendar value) {
        this.latestTime = value;
    }

    /**
     * Ruft den Wert der latestDayOffset-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getLatestDayOffset() {
        return latestDayOffset;
    }

    /**
     * Legt den Wert der latestDayOffset-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setLatestDayOffset(BigInteger value) {
        this.latestDayOffset = value;
    }

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
     * Ruft den Wert der checkConstraintProcess-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link CheckProcessTypeEnumeration }
     *     
     */
    public CheckProcessTypeEnumeration getCheckConstraintProcess() {
        return checkConstraintProcess;
    }

    /**
     * Legt den Wert der checkConstraintProcess-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link CheckProcessTypeEnumeration }
     *     
     */
    public void setCheckConstraintProcess(CheckProcessTypeEnumeration value) {
        this.checkConstraintProcess = value;
    }

}
