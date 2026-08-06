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
 * Type for SERVICE JOURNEY INTERCHANGE.
 * 
 * <p>Java-Klasse f�r ServiceJourneyInterchange_VersionStructure complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="ServiceJourneyInterchange_VersionStructure">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.netex.org.uk/netex}Interchange_VersionStructure">
 *       &lt;sequence>
 *         &lt;group ref="{http://www.netex.org.uk/netex}ServiceJourneyInterchangeGroup"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ServiceJourneyInterchange_VersionStructure", propOrder = {
    "fromPointRef",
    "fromVisitNumber",
    "toPointRef",
    "toVisitNumber",
    "fromJourneyRef",
    "toJourneyRef",
    "fromServiceJourneyRef",
    "toServiceJourneyRef",
    "serviceJourneyPatternInterchangeRef"
})
@XmlSeeAlso({
    ServiceJourneyInterchange.class
})
public class ServiceJourneyInterchangeVersionStructure
    extends InterchangeVersionStructure
{

    @XmlElement(name = "FromPointRef")
    protected ScheduledStopPointRefStructure fromPointRef;
    @XmlElement(name = "FromVisitNumber", defaultValue = "1")
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger fromVisitNumber;
    @XmlElement(name = "ToPointRef")
    protected ScheduledStopPointRefStructure toPointRef;
    @XmlElement(name = "ToVisitNumber", defaultValue = "1")
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger toVisitNumber;
    @XmlElement(name = "FromJourneyRef")
    protected JourneyRefStructure fromJourneyRef;
    @XmlElement(name = "ToJourneyRef")
    protected JourneyRefStructure toJourneyRef;
    @XmlElement(name = "FromServiceJourneyRef")
    protected ServiceJourneyRefStructure fromServiceJourneyRef;
    @XmlElement(name = "ToServiceJourneyRef")
    protected ServiceJourneyRefStructure toServiceJourneyRef;
    @XmlElement(name = "ServiceJourneyPatternInterchangeRef")
    protected ServiceJourneyPatternInterchangeRefStructure serviceJourneyPatternInterchangeRef;

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
     * Ruft den Wert der fromJourneyRef-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JourneyRefStructure }
     *     
     */
    public JourneyRefStructure getFromJourneyRef() {
        return fromJourneyRef;
    }

    /**
     * Legt den Wert der fromJourneyRef-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JourneyRefStructure }
     *     
     */
    public void setFromJourneyRef(JourneyRefStructure value) {
        this.fromJourneyRef = value;
    }

    /**
     * Ruft den Wert der toJourneyRef-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JourneyRefStructure }
     *     
     */
    public JourneyRefStructure getToJourneyRef() {
        return toJourneyRef;
    }

    /**
     * Legt den Wert der toJourneyRef-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JourneyRefStructure }
     *     
     */
    public void setToJourneyRef(JourneyRefStructure value) {
        this.toJourneyRef = value;
    }

    /**
     * Ruft den Wert der fromServiceJourneyRef-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ServiceJourneyRefStructure }
     *     
     */
    public ServiceJourneyRefStructure getFromServiceJourneyRef() {
        return fromServiceJourneyRef;
    }

    /**
     * Legt den Wert der fromServiceJourneyRef-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ServiceJourneyRefStructure }
     *     
     */
    public void setFromServiceJourneyRef(ServiceJourneyRefStructure value) {
        this.fromServiceJourneyRef = value;
    }

    /**
     * Ruft den Wert der toServiceJourneyRef-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ServiceJourneyRefStructure }
     *     
     */
    public ServiceJourneyRefStructure getToServiceJourneyRef() {
        return toServiceJourneyRef;
    }

    /**
     * Legt den Wert der toServiceJourneyRef-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ServiceJourneyRefStructure }
     *     
     */
    public void setToServiceJourneyRef(ServiceJourneyRefStructure value) {
        this.toServiceJourneyRef = value;
    }

    /**
     * Ruft den Wert der serviceJourneyPatternInterchangeRef-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ServiceJourneyPatternInterchangeRefStructure }
     *     
     */
    public ServiceJourneyPatternInterchangeRefStructure getServiceJourneyPatternInterchangeRef() {
        return serviceJourneyPatternInterchangeRef;
    }

    /**
     * Legt den Wert der serviceJourneyPatternInterchangeRef-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ServiceJourneyPatternInterchangeRefStructure }
     *     
     */
    public void setServiceJourneyPatternInterchangeRef(ServiceJourneyPatternInterchangeRefStructure value) {
        this.serviceJourneyPatternInterchangeRef = value;
    }

}
