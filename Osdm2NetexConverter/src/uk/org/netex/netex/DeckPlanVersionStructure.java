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
 * Type for a DECK PLAN.
 * 
 * <p>Java-Klasse f�r DeckPlan_VersionStructure complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="DeckPlan_VersionStructure">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.netex.org.uk/netex}DataManagedObjectStructure">
 *       &lt;sequence>
 *         &lt;group ref="{http://www.netex.org.uk/netex}DeckPlanGroup"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DeckPlan_VersionStructure", propOrder = {
    "name",
    "description",
    "orientation",
    "configurationConditions",
    "deckLevels",
    "decks"
})
@XmlSeeAlso({
    DeckPlan.class
})
public class DeckPlanVersionStructure
    extends DataManagedObjectStructure
{

    @XmlElement(name = "Name")
    protected MultilingualString name;
    @XmlElement(name = "Description")
    protected MultilingualString description;
    @XmlElement(name = "Orientation")
    @XmlSchemaType(name = "normalizedString")
    protected VehicleOrientationEnumeration orientation;
    protected ValidityConditionsRelStructure configurationConditions;
    protected DeckLevelsRelStructure deckLevels;
    protected DecksRelStructure decks;

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
     * Ruft den Wert der orientation-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link VehicleOrientationEnumeration }
     *     
     */
    public VehicleOrientationEnumeration getOrientation() {
        return orientation;
    }

    /**
     * Legt den Wert der orientation-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link VehicleOrientationEnumeration }
     *     
     */
    public void setOrientation(VehicleOrientationEnumeration value) {
        this.orientation = value;
    }

    /**
     * Ruft den Wert der configurationConditions-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ValidityConditionsRelStructure }
     *     
     */
    public ValidityConditionsRelStructure getConfigurationConditions() {
        return configurationConditions;
    }

    /**
     * Legt den Wert der configurationConditions-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ValidityConditionsRelStructure }
     *     
     */
    public void setConfigurationConditions(ValidityConditionsRelStructure value) {
        this.configurationConditions = value;
    }

    /**
     * Ruft den Wert der deckLevels-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link DeckLevelsRelStructure }
     *     
     */
    public DeckLevelsRelStructure getDeckLevels() {
        return deckLevels;
    }

    /**
     * Legt den Wert der deckLevels-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link DeckLevelsRelStructure }
     *     
     */
    public void setDeckLevels(DeckLevelsRelStructure value) {
        this.deckLevels = value;
    }

    /**
     * Ruft den Wert der decks-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link DecksRelStructure }
     *     
     */
    public DecksRelStructure getDecks() {
        return decks;
    }

    /**
     * Legt den Wert der decks-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link DecksRelStructure }
     *     
     */
    public void setDecks(DecksRelStructure value) {
        this.decks = value;
    }

}
