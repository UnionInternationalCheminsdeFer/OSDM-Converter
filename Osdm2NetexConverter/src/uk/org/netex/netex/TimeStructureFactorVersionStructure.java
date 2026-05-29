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
 * Type for TIME STRUCTURE FACTOR.
 * 
 * <p>Java-Klasse f�r TimeStructureFactor_VersionStructure complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="TimeStructureFactor_VersionStructure">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.netex.org.uk/netex}FareStructureFactor_VersionStructure">
 *       &lt;sequence>
 *         &lt;group ref="{http://www.netex.org.uk/netex}TimeStructureFactorGroup"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TimeStructureFactor_VersionStructure", propOrder = {
    "tariffRef",
    "timeIntervalRef",
    "timeUnitRef",
    "qualityStructureFactorRef"
})
@XmlSeeAlso({
    TimeStructureFactor.class,
    ParkingChargeBandVersionStructure.class
})
public class TimeStructureFactorVersionStructure
    extends FareStructureFactorVersionStructure
{

    @XmlElementRef(name = "TariffRef", namespace = "http://www.netex.org.uk/netex", type = JAXBElement.class, required = false)
    protected JAXBElement<? extends TariffRefStructure> tariffRef;
    @XmlElement(name = "TimeIntervalRef")
    protected TimeIntervalRefStructure timeIntervalRef;
    @XmlElement(name = "TimeUnitRef")
    protected TimeUnitRefStructure timeUnitRef;
    @XmlElementRef(name = "QualityStructureFactorRef", namespace = "http://www.netex.org.uk/netex", type = JAXBElement.class, required = false)
    protected JAXBElement<? extends QualityStructureFactorRefStructure> qualityStructureFactorRef;

    /**
     * Ruft den Wert der tariffRef-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link TariffRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link ParkingTariffRefStructure }{@code >}
     *     
     */
    public JAXBElement<? extends TariffRefStructure> getTariffRef() {
        return tariffRef;
    }

    /**
     * Legt den Wert der tariffRef-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link TariffRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link ParkingTariffRefStructure }{@code >}
     *     
     */
    public void setTariffRef(JAXBElement<? extends TariffRefStructure> value) {
        this.tariffRef = value;
    }

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
     * Ruft den Wert der timeUnitRef-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link TimeUnitRefStructure }
     *     
     */
    public TimeUnitRefStructure getTimeUnitRef() {
        return timeUnitRef;
    }

    /**
     * Legt den Wert der timeUnitRef-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link TimeUnitRefStructure }
     *     
     */
    public void setTimeUnitRef(TimeUnitRefStructure value) {
        this.timeUnitRef = value;
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
