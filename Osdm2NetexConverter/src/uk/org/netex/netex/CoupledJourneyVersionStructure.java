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
 * Type for COUPLED JOURNEY.
 * 
 * <p>Java-Klasse f�r CoupledJourney_VersionStructure complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="CoupledJourney_VersionStructure">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.netex.org.uk/netex}DataManagedObjectStructure">
 *       &lt;sequence>
 *         &lt;group ref="{http://www.netex.org.uk/netex}CoupledJourneyGroup"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CoupledJourney_VersionStructure", propOrder = {
    "name",
    "description",
    "trainBlockRef",
    "journeys"
})
@XmlSeeAlso({
    CoupledJourney.class
})
public class CoupledJourneyVersionStructure
    extends DataManagedObjectStructure
{

    @XmlElement(name = "Name")
    protected MultilingualString name;
    @XmlElement(name = "Description")
    protected MultilingualString description;
    @XmlElement(name = "TrainBlockRef")
    protected TrainBlockRefStructure trainBlockRef;
    protected VehicleJourneyRefsRelStructure journeys;

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
     * Ruft den Wert der trainBlockRef-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link TrainBlockRefStructure }
     *     
     */
    public TrainBlockRefStructure getTrainBlockRef() {
        return trainBlockRef;
    }

    /**
     * Legt den Wert der trainBlockRef-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link TrainBlockRefStructure }
     *     
     */
    public void setTrainBlockRef(TrainBlockRefStructure value) {
        this.trainBlockRef = value;
    }

    /**
     * Ruft den Wert der journeys-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link VehicleJourneyRefsRelStructure }
     *     
     */
    public VehicleJourneyRefsRelStructure getJourneys() {
        return journeys;
    }

    /**
     * Legt den Wert der journeys-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link VehicleJourneyRefsRelStructure }
     *     
     */
    public void setJourneys(VehicleJourneyRefsRelStructure value) {
        this.journeys = value;
    }

}
