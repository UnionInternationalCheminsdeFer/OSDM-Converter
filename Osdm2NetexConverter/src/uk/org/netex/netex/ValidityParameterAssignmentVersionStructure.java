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
 * Type for VALIDITY PARAMETER ASSIGNMENT.
 * 
 * <p>Java-Klasse f�r ValidityParameterAssignment_VersionStructure complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="ValidityParameterAssignment_VersionStructure">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.netex.org.uk/netex}AccessRightParameterAssignment_VersionStructure">
 *       &lt;sequence>
 *         &lt;group ref="{http://www.netex.org.uk/netex}ValidityParameterAssignmentGroup"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ValidityParameterAssignment_VersionStructure", propOrder = {
    "timeIntervalRef",
    "timeStructureFactorRef",
    "geographicalIntervalRef",
    "geographicalStructureFactorRef",
    "qualityStructureFactorRef"
})
@XmlSeeAlso({
    ValidityParameterAssignment.class,
    CustomerPurchaseParameterAssignmentVersionStructure.class,
    GenericParameterAssignmentVersionStructure.class,
    SpecificParameterAssignmentVersionStructure.class
})
public class ValidityParameterAssignmentVersionStructure
    extends AccessRightParameterAssignmentVersionStructure
{

    @XmlElement(name = "TimeIntervalRef")
    protected TimeIntervalRefStructure timeIntervalRef;
    @XmlElementRef(name = "TimeStructureFactorRef", namespace = "http://www.netex.org.uk/netex", type = JAXBElement.class, required = false)
    protected JAXBElement<? extends TimeStructureFactorRefStructure> timeStructureFactorRef;
    @XmlElement(name = "GeographicalIntervalRef")
    protected GeographicalIntervalRefStructure geographicalIntervalRef;
    @XmlElement(name = "GeographicalStructureFactorRef")
    protected GeographicalStructureFactorRefStructure geographicalStructureFactorRef;
    @XmlElementRef(name = "QualityStructureFactorRef", namespace = "http://www.netex.org.uk/netex", type = JAXBElement.class, required = false)
    protected JAXBElement<? extends QualityStructureFactorRefStructure> qualityStructureFactorRef;

    /**
     * Ruft den Wert der timeIntervalRef-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link TimeIntervalRefStructure }
     *     
     */
    public TimeIntervalRefStructure getTimeIntervalRef() {
        return timeIntervalRef;
    }

    /**
     * Legt den Wert der timeIntervalRef-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link TimeIntervalRefStructure }
     *     
     */
    public void setTimeIntervalRef(TimeIntervalRefStructure value) {
        this.timeIntervalRef = value;
    }

    /**
     * Ruft den Wert der timeStructureFactorRef-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link TimeStructureFactorRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link ParkingChargeBandRefStructure }{@code >}
     *     
     */
    public JAXBElement<? extends TimeStructureFactorRefStructure> getTimeStructureFactorRef() {
        return timeStructureFactorRef;
    }

    /**
     * Legt den Wert der timeStructureFactorRef-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link TimeStructureFactorRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link ParkingChargeBandRefStructure }{@code >}
     *     
     */
    public void setTimeStructureFactorRef(JAXBElement<? extends TimeStructureFactorRefStructure> value) {
        this.timeStructureFactorRef = value;
    }

    /**
     * Ruft den Wert der geographicalIntervalRef-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link GeographicalIntervalRefStructure }
     *     
     */
    public GeographicalIntervalRefStructure getGeographicalIntervalRef() {
        return geographicalIntervalRef;
    }

    /**
     * Legt den Wert der geographicalIntervalRef-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link GeographicalIntervalRefStructure }
     *     
     */
    public void setGeographicalIntervalRef(GeographicalIntervalRefStructure value) {
        this.geographicalIntervalRef = value;
    }

    /**
     * Ruft den Wert der geographicalStructureFactorRef-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link GeographicalStructureFactorRefStructure }
     *     
     */
    public GeographicalStructureFactorRefStructure getGeographicalStructureFactorRef() {
        return geographicalStructureFactorRef;
    }

    /**
     * Legt den Wert der geographicalStructureFactorRef-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link GeographicalStructureFactorRefStructure }
     *     
     */
    public void setGeographicalStructureFactorRef(GeographicalStructureFactorRefStructure value) {
        this.geographicalStructureFactorRef = value;
    }

    /**
     * Ruft den Wert der qualityStructureFactorRef-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link FareDemandFactorRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link FareQuotaFactorRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link QualityStructureFactorRefStructure }{@code >}
     *     
     */
    public JAXBElement<? extends QualityStructureFactorRefStructure> getQualityStructureFactorRef() {
        return qualityStructureFactorRef;
    }

    /**
     * Legt den Wert der qualityStructureFactorRef-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link FareDemandFactorRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link FareQuotaFactorRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link QualityStructureFactorRefStructure }{@code >}
     *     
     */
    public void setQualityStructureFactorRef(JAXBElement<? extends QualityStructureFactorRefStructure> value) {
        this.qualityStructureFactorRef = value;
    }

}
