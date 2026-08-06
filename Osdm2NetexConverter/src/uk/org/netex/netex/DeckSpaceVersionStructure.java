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
 * Type for a DECK SPACE.
 * 
 * <p>Java-Klasse f�r DeckSpace_VersionStructure complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="DeckSpace_VersionStructure">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.netex.org.uk/netex}DeckComponent_VersionStructure">
 *       &lt;sequence>
 *         &lt;group ref="{http://www.netex.org.uk/netex}DeckSpaceGroup"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DeckSpace_VersionStructure", propOrder = {
    "covered",
    "airConditioned",
    "smokingAllowed",
    "typeOfDeckSpaceRef",
    "parentDeckSpaceRef",
    "deckEntrances",
    "deckEntranceCouples",
    "deckEntranceUsages",
    "deckWindows",
    "totalCapacity",
    "deckSpaceCapacities"
})
@XmlSeeAlso({
    DeckSpace.class,
    OtherDeckSpaceVersionStructure.class,
    PassengerSpaceVersionStructure.class
})
public abstract class DeckSpaceVersionStructure
    extends DeckComponentVersionStructure
{

    @XmlElement(name = "Covered", defaultValue = "true")
    @XmlSchemaType(name = "string")
    protected CoveredEnumeration covered;
    @XmlElement(name = "AirConditioned")
    protected Boolean airConditioned;
    @XmlElement(name = "SmokingAllowed", defaultValue = "false")
    protected Boolean smokingAllowed;
    @XmlElement(name = "TypeOfDeckSpaceRef")
    protected TypeOfDeckSpaceProfileRefStructure typeOfDeckSpaceRef;
    @XmlElement(name = "ParentDeckSpaceRef")
    protected DeckSpaceRefStructure parentDeckSpaceRef;
    protected DeckEntrancesRelStructure deckEntrances;
    protected DeckEntranceCouplesRelStructure deckEntranceCouples;
    protected DeckEntranceUsagesRelStructure deckEntranceUsages;
    protected DeckWindowsRelStructure deckWindows;
    @XmlElement(name = "TotalCapacity")
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger totalCapacity;
    protected DeckSpaceCapacitiesRelStructure deckSpaceCapacities;

    /**
     * Ruft den Wert der covered-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link CoveredEnumeration }
     *     
     */
    public CoveredEnumeration getCovered() {
        return covered;
    }

    /**
     * Legt den Wert der covered-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link CoveredEnumeration }
     *     
     */
    public void setCovered(CoveredEnumeration value) {
        this.covered = value;
    }

    /**
     * Ruft den Wert der airConditioned-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAirConditioned() {
        return airConditioned;
    }

    /**
     * Legt den Wert der airConditioned-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAirConditioned(Boolean value) {
        this.airConditioned = value;
    }

    /**
     * Ruft den Wert der smokingAllowed-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSmokingAllowed() {
        return smokingAllowed;
    }

    /**
     * Legt den Wert der smokingAllowed-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSmokingAllowed(Boolean value) {
        this.smokingAllowed = value;
    }

    /**
     * Ruft den Wert der typeOfDeckSpaceRef-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link TypeOfDeckSpaceProfileRefStructure }
     *     
     */
    public TypeOfDeckSpaceProfileRefStructure getTypeOfDeckSpaceRef() {
        return typeOfDeckSpaceRef;
    }

    /**
     * Legt den Wert der typeOfDeckSpaceRef-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeOfDeckSpaceProfileRefStructure }
     *     
     */
    public void setTypeOfDeckSpaceRef(TypeOfDeckSpaceProfileRefStructure value) {
        this.typeOfDeckSpaceRef = value;
    }

    /**
     * Ruft den Wert der parentDeckSpaceRef-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link DeckSpaceRefStructure }
     *     
     */
    public DeckSpaceRefStructure getParentDeckSpaceRef() {
        return parentDeckSpaceRef;
    }

    /**
     * Legt den Wert der parentDeckSpaceRef-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link DeckSpaceRefStructure }
     *     
     */
    public void setParentDeckSpaceRef(DeckSpaceRefStructure value) {
        this.parentDeckSpaceRef = value;
    }

    /**
     * Ruft den Wert der deckEntrances-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link DeckEntrancesRelStructure }
     *     
     */
    public DeckEntrancesRelStructure getDeckEntrances() {
        return deckEntrances;
    }

    /**
     * Legt den Wert der deckEntrances-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link DeckEntrancesRelStructure }
     *     
     */
    public void setDeckEntrances(DeckEntrancesRelStructure value) {
        this.deckEntrances = value;
    }

    /**
     * Ruft den Wert der deckEntranceCouples-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link DeckEntranceCouplesRelStructure }
     *     
     */
    public DeckEntranceCouplesRelStructure getDeckEntranceCouples() {
        return deckEntranceCouples;
    }

    /**
     * Legt den Wert der deckEntranceCouples-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link DeckEntranceCouplesRelStructure }
     *     
     */
    public void setDeckEntranceCouples(DeckEntranceCouplesRelStructure value) {
        this.deckEntranceCouples = value;
    }

    /**
     * Ruft den Wert der deckEntranceUsages-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link DeckEntranceUsagesRelStructure }
     *     
     */
    public DeckEntranceUsagesRelStructure getDeckEntranceUsages() {
        return deckEntranceUsages;
    }

    /**
     * Legt den Wert der deckEntranceUsages-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link DeckEntranceUsagesRelStructure }
     *     
     */
    public void setDeckEntranceUsages(DeckEntranceUsagesRelStructure value) {
        this.deckEntranceUsages = value;
    }

    /**
     * Ruft den Wert der deckWindows-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link DeckWindowsRelStructure }
     *     
     */
    public DeckWindowsRelStructure getDeckWindows() {
        return deckWindows;
    }

    /**
     * Legt den Wert der deckWindows-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link DeckWindowsRelStructure }
     *     
     */
    public void setDeckWindows(DeckWindowsRelStructure value) {
        this.deckWindows = value;
    }

    /**
     * Ruft den Wert der totalCapacity-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getTotalCapacity() {
        return totalCapacity;
    }

    /**
     * Legt den Wert der totalCapacity-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setTotalCapacity(BigInteger value) {
        this.totalCapacity = value;
    }

    /**
     * Ruft den Wert der deckSpaceCapacities-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link DeckSpaceCapacitiesRelStructure }
     *     
     */
    public DeckSpaceCapacitiesRelStructure getDeckSpaceCapacities() {
        return deckSpaceCapacities;
    }

    /**
     * Legt den Wert der deckSpaceCapacities-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link DeckSpaceCapacitiesRelStructure }
     *     
     */
    public void setDeckSpaceCapacities(DeckSpaceCapacitiesRelStructure value) {
        this.deckSpaceCapacities = value;
    }

}
