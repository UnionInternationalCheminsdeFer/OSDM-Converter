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


/**
 * Type for SERVICE JOURNEY PATTERN INTERCHANGE.
 * 
 * <p>Java-Klasse f�r ServiceJourneyPatternInterchange_VersionStructure complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="ServiceJourneyPatternInterchange_VersionStructure">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.netex.org.uk/netex}Interchange_VersionStructure">
 *       &lt;group ref="{http://www.netex.org.uk/netex}ServiceJourneyPatternInterchangeGroup"/>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ServiceJourneyPatternInterchange_VersionStructure", propOrder = {
    "fromPointRef",
    "fromVisitNumber",
    "toPointRef",
    "toVisitNumber",
    "fromJourneyPatternRef",
    "toJourneyPatternRef",
    "fromServiceJourneyPatternRef",
    "toServiceJourneyPatternRef"
})
@XmlSeeAlso({
    ServiceJourneyPatternInterchange.class
})
public class ServiceJourneyPatternInterchangeVersionStructure
    extends InterchangeVersionStructure
{

    @XmlElement(name = "FromPointRef", required = true)
    protected ScheduledStopPointRefStructure fromPointRef;
    @XmlElement(name = "FromVisitNumber", defaultValue = "1")
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger fromVisitNumber;
    @XmlElement(name = "ToPointRef", required = true)
    protected ScheduledStopPointRefStructure toPointRef;
    @XmlElement(name = "ToVisitNumber", defaultValue = "1")
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger toVisitNumber;
    @XmlElement(name = "FromJourneyPatternRef")
    protected JourneyPatternRefStructure fromJourneyPatternRef;
    @XmlElement(name = "ToJourneyPatternRef")
    protected JourneyPatternRefStructure toJourneyPatternRef;
    @XmlElement(name = "FromServiceJourneyPatternRef")
    protected ServiceJourneyPatternRefStructure fromServiceJourneyPatternRef;
    @XmlElement(name = "ToServiceJourneyPatternRef")
    protected ServiceJourneyPatternRefStructure toServiceJourneyPatternRef;

    /**
     * Ruft den Wert der fromPointRef-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ScheduledStopPointRefStructure }
     *     
     */
    public ScheduledStopPointRefStructure getFromPointRef() {
        return fromPointRef;
    }

    /**
     * Legt den Wert der fromPointRef-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ScheduledStopPointRefStructure }
     *     
     */
    public void setFromPointRef(ScheduledStopPointRefStructure value) {
        this.fromPointRef = value;
    }

    /**
     * Ruft den Wert der fromVisitNumber-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getFromVisitNumber() {
        return fromVisitNumber;
    }

    /**
     * Legt den Wert der fromVisitNumber-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setFromVisitNumber(BigInteger value) {
        this.fromVisitNumber = value;
    }

    /**
     * Ruft den Wert der toPointRef-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ScheduledStopPointRefStructure }
     *     
     */
    public ScheduledStopPointRefStructure getToPointRef() {
        return toPointRef;
    }

    /**
     * Legt den Wert der toPointRef-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ScheduledStopPointRefStructure }
     *     
     */
    public void setToPointRef(ScheduledStopPointRefStructure value) {
        this.toPointRef = value;
    }

    /**
     * Ruft den Wert der toVisitNumber-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getToVisitNumber() {
        return toVisitNumber;
    }

    /**
     * Legt den Wert der toVisitNumber-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setToVisitNumber(BigInteger value) {
        this.toVisitNumber = value;
    }

    /**
     * Ruft den Wert der fromJourneyPatternRef-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JourneyPatternRefStructure }
     *     
     */
    public JourneyPatternRefStructure getFromJourneyPatternRef() {
        return fromJourneyPatternRef;
    }

    /**
     * Legt den Wert der fromJourneyPatternRef-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JourneyPatternRefStructure }
     *     
     */
    public void setFromJourneyPatternRef(JourneyPatternRefStructure value) {
        this.fromJourneyPatternRef = value;
    }

    /**
     * Ruft den Wert der toJourneyPatternRef-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JourneyPatternRefStructure }
     *     
     */
    public JourneyPatternRefStructure getToJourneyPatternRef() {
        return toJourneyPatternRef;
    }

    /**
     * Legt den Wert der toJourneyPatternRef-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JourneyPatternRefStructure }
     *     
     */
    public void setToJourneyPatternRef(JourneyPatternRefStructure value) {
        this.toJourneyPatternRef = value;
    }

    /**
     * Ruft den Wert der fromServiceJourneyPatternRef-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ServiceJourneyPatternRefStructure }
     *     
     */
    public ServiceJourneyPatternRefStructure getFromServiceJourneyPatternRef() {
        return fromServiceJourneyPatternRef;
    }

    /**
     * Legt den Wert der fromServiceJourneyPatternRef-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ServiceJourneyPatternRefStructure }
     *     
     */
    public void setFromServiceJourneyPatternRef(ServiceJourneyPatternRefStructure value) {
        this.fromServiceJourneyPatternRef = value;
    }

    /**
     * Ruft den Wert der toServiceJourneyPatternRef-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ServiceJourneyPatternRefStructure }
     *     
     */
    public ServiceJourneyPatternRefStructure getToServiceJourneyPatternRef() {
        return toServiceJourneyPatternRef;
    }

    /**
     * Legt den Wert der toServiceJourneyPatternRef-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ServiceJourneyPatternRefStructure }
     *     
     */
    public void setToServiceJourneyPatternRef(ServiceJourneyPatternRefStructure value) {
        this.toServiceJourneyPatternRef = value;
    }

}
