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
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Type for TIME DEMAND TYPE.
 * 
 * <p>Java-Klasse f�r TimeDemandType_VersionStructure complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="TimeDemandType_VersionStructure">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.netex.org.uk/netex}DataManagedObjectStructure">
 *       &lt;sequence>
 *         &lt;group ref="{http://www.netex.org.uk/netex}TimeDemandTypeGroup"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TimeDemandType_VersionStructure", propOrder = {
    "name",
    "description",
    "privateCode",
    "typeOfTimeDemandTypeRef",
    "presentation",
    "runTimes",
    "waitTimes",
    "layovers",
    "headways",
    "vehiclePreferences"
})
@XmlSeeAlso({
    TimeDemandType.class
})
public class TimeDemandTypeVersionStructure
    extends DataManagedObjectStructure
{

    @XmlElement(name = "Name")
    protected MultilingualString name;
    @XmlElement(name = "Description")
    protected MultilingualString description;
    @XmlElement(name = "PrivateCode")
    protected PrivateCodeStructure privateCode;
    @XmlElement(name = "TypeOfTimeDemandTypeRef")
    protected TypeOfTimeDemandTypeRefStructure typeOfTimeDemandTypeRef;
    @XmlElement(name = "Presentation")
    protected PresentationStructure presentation;
    protected JourneyRunTimesRelStructure runTimes;
    protected JourneyWaitTimesRelStructure waitTimes;
    protected JourneyLayoversRelStructure layovers;
    protected JourneyHeadwaysRelStructure headways;
    protected VehicleTypePreferencesRelStructure vehiclePreferences;

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
     * DEPRECATED - use privateCodes. -v2.0
     * 
     * @return
     *     possible object is
     *     {@link PrivateCodeStructure }
     *     
     */
    public PrivateCodeStructure getPrivateCode() {
        return privateCode;
    }

    /**
     * Legt den Wert der privateCode-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link PrivateCodeStructure }
     *     
     */
    public void setPrivateCode(PrivateCodeStructure value) {
        this.privateCode = value;
    }

    /**
     * Ruft den Wert der typeOfTimeDemandTypeRef-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link TypeOfTimeDemandTypeRefStructure }
     *     
     */
    public TypeOfTimeDemandTypeRefStructure getTypeOfTimeDemandTypeRef() {
        return typeOfTimeDemandTypeRef;
    }

    /**
     * Legt den Wert der typeOfTimeDemandTypeRef-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeOfTimeDemandTypeRefStructure }
     *     
     */
    public void setTypeOfTimeDemandTypeRef(TypeOfTimeDemandTypeRefStructure value) {
        this.typeOfTimeDemandTypeRef = value;
    }

    /**
     * Ruft den Wert der presentation-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link PresentationStructure }
     *     
     */
    public PresentationStructure getPresentation() {
        return presentation;
    }

    /**
     * Legt den Wert der presentation-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link PresentationStructure }
     *     
     */
    public void setPresentation(PresentationStructure value) {
        this.presentation = value;
    }

    /**
     * Ruft den Wert der runTimes-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JourneyRunTimesRelStructure }
     *     
     */
    public JourneyRunTimesRelStructure getRunTimes() {
        return runTimes;
    }

    /**
     * Legt den Wert der runTimes-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JourneyRunTimesRelStructure }
     *     
     */
    public void setRunTimes(JourneyRunTimesRelStructure value) {
        this.runTimes = value;
    }

    /**
     * Ruft den Wert der waitTimes-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JourneyWaitTimesRelStructure }
     *     
     */
    public JourneyWaitTimesRelStructure getWaitTimes() {
        return waitTimes;
    }

    /**
     * Legt den Wert der waitTimes-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JourneyWaitTimesRelStructure }
     *     
     */
    public void setWaitTimes(JourneyWaitTimesRelStructure value) {
        this.waitTimes = value;
    }

    /**
     * Ruft den Wert der layovers-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JourneyLayoversRelStructure }
     *     
     */
    public JourneyLayoversRelStructure getLayovers() {
        return layovers;
    }

    /**
     * Legt den Wert der layovers-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JourneyLayoversRelStructure }
     *     
     */
    public void setLayovers(JourneyLayoversRelStructure value) {
        this.layovers = value;
    }

    /**
     * Ruft den Wert der headways-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JourneyHeadwaysRelStructure }
     *     
     */
    public JourneyHeadwaysRelStructure getHeadways() {
        return headways;
    }

    /**
     * Legt den Wert der headways-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JourneyHeadwaysRelStructure }
     *     
     */
    public void setHeadways(JourneyHeadwaysRelStructure value) {
        this.headways = value;
    }

    /**
     * Ruft den Wert der vehiclePreferences-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link VehicleTypePreferencesRelStructure }
     *     
     */
    public VehicleTypePreferencesRelStructure getVehiclePreferences() {
        return vehiclePreferences;
    }

    /**
     * Legt den Wert der vehiclePreferences-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link VehicleTypePreferencesRelStructure }
     *     
     */
    public void setVehiclePreferences(VehicleTypePreferencesRelStructure value) {
        this.vehiclePreferences = value;
    }

}
