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
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlElementRef;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Type for MODE RESTRICTION ASSESSMENT.
 * 
 * <p>Java-Klasse f�r ModeRestrictionAssessment_VersionStructure complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="ModeRestrictionAssessment_VersionStructure">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.netex.org.uk/netex}DataManagedObject_ViewStructure">
 *       &lt;sequence>
 *         &lt;group ref="{http://www.netex.org.uk/netex}ModeRestrictionAssessmentGroup"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ModeRestrictionAssessment_VersionStructure", propOrder = {
    "exclude",
    "transportModes",
    "modeOfOperationRef",
    "minimumNumberOfPassengers"
})
@XmlSeeAlso({
    ModeRestrictionAssessment.class
})
public class ModeRestrictionAssessmentVersionStructure
    extends DataManagedObjectViewStructure
{

    @XmlElement(name = "Exclude", defaultValue = "true")
    protected Boolean exclude;
    protected TransportModesRelStructure transportModes;
    @XmlElementRef(name = "ModeOfOperationRef", namespace = "http://www.netex.org.uk/netex", type = JAXBElement.class, required = false)
    protected JAXBElement<? extends ModeOfOperationRefStructure> modeOfOperationRef;
    @XmlElement(name = "MinimumNumberOfPassengers")
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger minimumNumberOfPassengers;

    /**
     * Ruft den Wert der exclude-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isExclude() {
        return exclude;
    }

    /**
     * Legt den Wert der exclude-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setExclude(Boolean value) {
        this.exclude = value;
    }

    /**
     * Ruft den Wert der transportModes-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link TransportModesRelStructure }
     *     
     */
    public TransportModesRelStructure getTransportModes() {
        return transportModes;
    }

    /**
     * Legt den Wert der transportModes-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link TransportModesRelStructure }
     *     
     */
    public void setTransportModes(TransportModesRelStructure value) {
        this.transportModes = value;
    }

    /**
     * Ruft den Wert der modeOfOperationRef-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ModeOfOperationRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link AlternativeModeOfOperationRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link VehiclePoolingModeOfOperationRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link VehicleSharingModeOfOperationRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link ConventionalModeOfOperationRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link PersonalModeOfOperationRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link VehicleRentalModeOfOperationRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link FlexibleModeOfOperationRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link ScheduledModeOfOperationRefStructure }{@code >}
     *     
     */
    public JAXBElement<? extends ModeOfOperationRefStructure> getModeOfOperationRef() {
        return modeOfOperationRef;
    }

    /**
     * Legt den Wert der modeOfOperationRef-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ModeOfOperationRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link AlternativeModeOfOperationRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link VehiclePoolingModeOfOperationRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link VehicleSharingModeOfOperationRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link ConventionalModeOfOperationRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link PersonalModeOfOperationRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link VehicleRentalModeOfOperationRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link FlexibleModeOfOperationRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link ScheduledModeOfOperationRefStructure }{@code >}
     *     
     */
    public void setModeOfOperationRef(JAXBElement<? extends ModeOfOperationRefStructure> value) {
        this.modeOfOperationRef = value;
    }

    /**
     * Ruft den Wert der minimumNumberOfPassengers-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getMinimumNumberOfPassengers() {
        return minimumNumberOfPassengers;
    }

    /**
     * Legt den Wert der minimumNumberOfPassengers-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setMinimumNumberOfPassengers(BigInteger value) {
        this.minimumNumberOfPassengers = value;
    }

}
