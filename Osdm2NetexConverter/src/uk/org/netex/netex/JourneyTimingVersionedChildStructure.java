//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// �nderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2026.05.22 um 10:24:00 AM CEST 
//


package uk.org.netex.netex;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Type for JOURNEY TIMING.
 * 
 * <p>Java-Klasse f�r JourneyTiming_VersionedChildStructure complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="JourneyTiming_VersionedChildStructure">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.netex.org.uk/netex}VersionedChildStructure">
 *       &lt;sequence>
 *         &lt;group ref="{http://www.netex.org.uk/netex}JourneyTimingGroup"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "JourneyTiming_VersionedChildStructure", propOrder = {
    "name",
    "timeDemandTypeRef",
    "timebandRef",
    "vehicleMode",
    "operationalContextRef"
})
@XmlSeeAlso({
    DefaultServiceJourneyRunTimeVersionedChildStructure.class,
    InterchangeRuleTimingVersionStructure.class,
    VehicleTypePreferenceVersionedChildStructure.class,
    TurnaroundTimeLimitTimeVersionedChildStructure.class,
    DefaultDeadRunRunTimeVersionedChildStructure.class,
    JourneyRunTimeVersionedChildStructure.class,
    JourneyHeadwayVersionedChildStructure.class,
    JourneyWaitTimeVersionedChildStructure.class,
    JourneyLayoverStructure.class
})
public abstract class JourneyTimingVersionedChildStructure
    extends VersionedChildStructure
{

    @XmlElement(name = "Name")
    protected MultilingualString name;
    @XmlElement(name = "TimeDemandTypeRef")
    protected TimeDemandTypeRefStructure timeDemandTypeRef;
    @XmlElement(name = "TimebandRef")
    protected TimebandRefStructure timebandRef;
    @XmlElement(name = "VehicleMode")
    @XmlSchemaType(name = "NMTOKEN")
    protected AllPublicTransportModesEnumeration vehicleMode;
    @XmlElement(name = "OperationalContextRef")
    protected OperationalContextRefStructure operationalContextRef;

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
     * Ruft den Wert der timeDemandTypeRef-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link TimeDemandTypeRefStructure }
     *     
     */
    public TimeDemandTypeRefStructure getTimeDemandTypeRef() {
        return timeDemandTypeRef;
    }

    /**
     * Legt den Wert der timeDemandTypeRef-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link TimeDemandTypeRefStructure }
     *     
     */
    public void setTimeDemandTypeRef(TimeDemandTypeRefStructure value) {
        this.timeDemandTypeRef = value;
    }

    /**
     * Ruft den Wert der timebandRef-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link TimebandRefStructure }
     *     
     */
    public TimebandRefStructure getTimebandRef() {
        return timebandRef;
    }

    /**
     * Legt den Wert der timebandRef-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link TimebandRefStructure }
     *     
     */
    public void setTimebandRef(TimebandRefStructure value) {
        this.timebandRef = value;
    }

    /**
     * Ruft den Wert der vehicleMode-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link AllPublicTransportModesEnumeration }
     *     
     */
    public AllPublicTransportModesEnumeration getVehicleMode() {
        return vehicleMode;
    }

    /**
     * Legt den Wert der vehicleMode-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link AllPublicTransportModesEnumeration }
     *     
     */
    public void setVehicleMode(AllPublicTransportModesEnumeration value) {
        this.vehicleMode = value;
    }

    /**
     * Ruft den Wert der operationalContextRef-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link OperationalContextRefStructure }
     *     
     */
    public OperationalContextRefStructure getOperationalContextRef() {
        return operationalContextRef;
    }

    /**
     * Legt den Wert der operationalContextRef-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link OperationalContextRefStructure }
     *     
     */
    public void setOperationalContextRef(OperationalContextRefStructure value) {
        this.operationalContextRef = value;
    }

}
