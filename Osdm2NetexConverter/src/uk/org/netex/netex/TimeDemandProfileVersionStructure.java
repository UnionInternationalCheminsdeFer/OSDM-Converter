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
 * Type for TIME DEMAND PROFILE.
 * 
 * <p>Java-Klasse f�r TimeDemandProfile_VersionStructure complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="TimeDemandProfile_VersionStructure">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.netex.org.uk/netex}DataManagedObjectStructure">
 *       &lt;sequence>
 *         &lt;group ref="{http://www.netex.org.uk/netex}TimeDemandProfileGroup"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TimeDemandProfile_VersionStructure", propOrder = {
    "name",
    "timeDemandTypeRef",
    "timebandRef",
    "journeyPatternRef",
    "vehicleJourneyRef",
    "members"
})
@XmlSeeAlso({
    TimeDemandProfile.class
})
public class TimeDemandProfileVersionStructure
    extends DataManagedObjectStructure
{

    @XmlElement(name = "Name")
    protected MultilingualString name;
    @XmlElement(name = "TimeDemandTypeRef")
    protected TimeDemandTypeRefStructure timeDemandTypeRef;
    @XmlElement(name = "TimebandRef")
    protected TimebandRefStructure timebandRef;
    @XmlElementRef(name = "JourneyPatternRef", namespace = "http://www.netex.org.uk/netex", type = JAXBElement.class, required = false)
    protected JAXBElement<? extends JourneyPatternRefStructure> journeyPatternRef;
    @XmlElementRef(name = "VehicleJourneyRef", namespace = "http://www.netex.org.uk/netex", type = JAXBElement.class, required = false)
    protected JAXBElement<? extends VehicleJourneyRefStructure> vehicleJourneyRef;
    protected TimeDemandProfileMembersRelStructure members;

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
     * Ruft den Wert der journeyPatternRef-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ServicePatternRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link ServiceJourneyPatternRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link DeadRunJourneyPatternRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link JourneyPatternRefStructure }{@code >}
     *     
     */
    public JAXBElement<? extends JourneyPatternRefStructure> getJourneyPatternRef() {
        return journeyPatternRef;
    }

    /**
     * Legt den Wert der journeyPatternRef-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ServicePatternRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link ServiceJourneyPatternRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link DeadRunJourneyPatternRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link JourneyPatternRefStructure }{@code >}
     *     
     */
    public void setJourneyPatternRef(JAXBElement<? extends JourneyPatternRefStructure> value) {
        this.journeyPatternRef = value;
    }

    /**
     * Ruft den Wert der vehicleJourneyRef-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link DeadRunRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link VehicleJourneyRefStructure }{@code >}
     *     
     */
    public JAXBElement<? extends VehicleJourneyRefStructure> getVehicleJourneyRef() {
        return vehicleJourneyRef;
    }

    /**
     * Legt den Wert der vehicleJourneyRef-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link DeadRunRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link VehicleJourneyRefStructure }{@code >}
     *     
     */
    public void setVehicleJourneyRef(JAXBElement<? extends VehicleJourneyRefStructure> value) {
        this.vehicleJourneyRef = value;
    }

    /**
     * Ruft den Wert der members-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link TimeDemandProfileMembersRelStructure }
     *     
     */
    public TimeDemandProfileMembersRelStructure getMembers() {
        return members;
    }

    /**
     * Legt den Wert der members-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link TimeDemandProfileMembersRelStructure }
     *     
     */
    public void setMembers(TimeDemandProfileMembersRelStructure value) {
        this.members = value;
    }

}
