//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// �nderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2026.05.22 um 10:24:00 AM CEST 
//


package uk.org.netex.netex;

import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlElementRef;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Type for a restricted SERVICE FACILITY.
 * 
 * <p>Java-Klasse f�r RestrictedServiceFacilitySet_VersionStructure complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="RestrictedServiceFacilitySet_VersionStructure">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.netex.org.uk/netex}ServiceFacilitySet_VersionStructure">
 *       &lt;sequence>
 *         &lt;group ref="{http://www.netex.org.uk/netex}RestrictedServiceFacilitySetGroup"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RestrictedServiceFacilitySet_VersionStructure", propOrder = {
    "serviceFacilitySetRef",
    "fromCall",
    "toCall",
    "fromStopPointInJourneyPattern",
    "toStopPointInJourneyPattern",
    "availabilityConditionRef"
})
@XmlSeeAlso({
    RestrictedServiceFacilitySet.class
})
public class RestrictedServiceFacilitySetVersionStructure
    extends ServiceFacilitySetVersionStructure
{

    @XmlElementRef(name = "ServiceFacilitySetRef", namespace = "http://www.netex.org.uk/netex", type = JAXBElement.class)
    protected JAXBElement<? extends ServiceFacilitySetRefStructure> serviceFacilitySetRef;
    @XmlElement(name = "FromCall")
    protected CallRefStructure fromCall;
    @XmlElement(name = "ToCall")
    protected CallRefStructure toCall;
    @XmlElement(name = "FromStopPointInJourneyPattern")
    protected StopPointInJourneyPatternRefStructure fromStopPointInJourneyPattern;
    @XmlElement(name = "ToStopPointInJourneyPattern")
    protected StopPointInJourneyPatternRefStructure toStopPointInJourneyPattern;
    @XmlElement(name = "AvailabilityConditionRef")
    protected AvailabilityConditionRefStructure availabilityConditionRef;

    /**
     * Ruft den Wert der serviceFacilitySetRef-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link RestrictedServiceFacilitySetRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link ServiceFacilitySetRefStructure }{@code >}
     *     
     */
    public JAXBElement<? extends ServiceFacilitySetRefStructure> getServiceFacilitySetRef() {
        return serviceFacilitySetRef;
    }

    /**
     * Legt den Wert der serviceFacilitySetRef-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link RestrictedServiceFacilitySetRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link ServiceFacilitySetRefStructure }{@code >}
     *     
     */
    public void setServiceFacilitySetRef(JAXBElement<? extends ServiceFacilitySetRefStructure> value) {
        this.serviceFacilitySetRef = value;
    }

    /**
     * Ruft den Wert der fromCall-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link CallRefStructure }
     *     
     */
    public CallRefStructure getFromCall() {
        return fromCall;
    }

    /**
     * Legt den Wert der fromCall-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link CallRefStructure }
     *     
     */
    public void setFromCall(CallRefStructure value) {
        this.fromCall = value;
    }

    /**
     * Ruft den Wert der toCall-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link CallRefStructure }
     *     
     */
    public CallRefStructure getToCall() {
        return toCall;
    }

    /**
     * Legt den Wert der toCall-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link CallRefStructure }
     *     
     */
    public void setToCall(CallRefStructure value) {
        this.toCall = value;
    }

    /**
     * Ruft den Wert der fromStopPointInJourneyPattern-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link StopPointInJourneyPatternRefStructure }
     *     
     */
    public StopPointInJourneyPatternRefStructure getFromStopPointInJourneyPattern() {
        return fromStopPointInJourneyPattern;
    }

    /**
     * Legt den Wert der fromStopPointInJourneyPattern-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link StopPointInJourneyPatternRefStructure }
     *     
     */
    public void setFromStopPointInJourneyPattern(StopPointInJourneyPatternRefStructure value) {
        this.fromStopPointInJourneyPattern = value;
    }

    /**
     * Ruft den Wert der toStopPointInJourneyPattern-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link StopPointInJourneyPatternRefStructure }
     *     
     */
    public StopPointInJourneyPatternRefStructure getToStopPointInJourneyPattern() {
        return toStopPointInJourneyPattern;
    }

    /**
     * Legt den Wert der toStopPointInJourneyPattern-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link StopPointInJourneyPatternRefStructure }
     *     
     */
    public void setToStopPointInJourneyPattern(StopPointInJourneyPatternRefStructure value) {
        this.toStopPointInJourneyPattern = value;
    }

    /**
     * AVAILABILITY CONDITION (further) restricting the applicabillity.
     * 
     * @return
     *     possible object is
     *     {@link AvailabilityConditionRefStructure }
     *     
     */
    public AvailabilityConditionRefStructure getAvailabilityConditionRef() {
        return availabilityConditionRef;
    }

    /**
     * Legt den Wert der availabilityConditionRef-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link AvailabilityConditionRefStructure }
     *     
     */
    public void setAvailabilityConditionRef(AvailabilityConditionRefStructure value) {
        this.availabilityConditionRef = value;
    }

}
