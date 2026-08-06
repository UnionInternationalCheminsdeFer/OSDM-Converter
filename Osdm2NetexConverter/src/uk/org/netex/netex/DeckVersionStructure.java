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
 * Type for a DECK.
 * 
 * <p>Java-Klasse f�r Deck_VersionStructure complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="Deck_VersionStructure">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.netex.org.uk/netex}Zone_VersionStructure">
 *       &lt;group ref="{http://www.netex.org.uk/netex}DeckGroup"/>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Deck_VersionStructure", propOrder = {
    "label",
    "deckLevelRef",
    "deckSpaces",
    "spotRows",
    "spotColumns",
    "deckPathJunctions",
    "deckPathLinks",
    "deckNavigationPaths"
})
@XmlSeeAlso({
    Deck.class
})
public class DeckVersionStructure
    extends ZoneVersionStructure
{

    @XmlElement(name = "Label")
    protected MultilingualString label;
    @XmlElement(name = "DeckLevelRef")
    protected DeckLevelRefStructure deckLevelRef;
    protected DeckSpacesRelStructure deckSpaces;
    protected SpotRowsRelStructure spotRows;
    protected SpotColumnsRelStructure spotColumns;
    protected DeckPathJunctionRefsRelStructure deckPathJunctions;
    protected DeckPathLinkRefsRelStructure deckPathLinks;
    protected DeckNavigationPathsRelStructure deckNavigationPaths;

    /**
     * Ruft den Wert der label-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link MultilingualString }
     *     
     */
    public MultilingualString getLabel() {
        return label;
    }

    /**
     * Legt den Wert der label-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link MultilingualString }
     *     
     */
    public void setLabel(MultilingualString value) {
        this.label = value;
    }

    /**
     * Ruft den Wert der deckLevelRef-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link DeckLevelRefStructure }
     *     
     */
    public DeckLevelRefStructure getDeckLevelRef() {
        return deckLevelRef;
    }

    /**
     * Legt den Wert der deckLevelRef-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link DeckLevelRefStructure }
     *     
     */
    public void setDeckLevelRef(DeckLevelRefStructure value) {
        this.deckLevelRef = value;
    }

    /**
     * Ruft den Wert der deckSpaces-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link DeckSpacesRelStructure }
     *     
     */
    public DeckSpacesRelStructure getDeckSpaces() {
        return deckSpaces;
    }

    /**
     * Legt den Wert der deckSpaces-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link DeckSpacesRelStructure }
     *     
     */
    public void setDeckSpaces(DeckSpacesRelStructure value) {
        this.deckSpaces = value;
    }

    /**
     * Ruft den Wert der spotRows-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link SpotRowsRelStructure }
     *     
     */
    public SpotRowsRelStructure getSpotRows() {
        return spotRows;
    }

    /**
     * Legt den Wert der spotRows-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link SpotRowsRelStructure }
     *     
     */
    public void setSpotRows(SpotRowsRelStructure value) {
        this.spotRows = value;
    }

    /**
     * Ruft den Wert der spotColumns-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link SpotColumnsRelStructure }
     *     
     */
    public SpotColumnsRelStructure getSpotColumns() {
        return spotColumns;
    }

    /**
     * Legt den Wert der spotColumns-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link SpotColumnsRelStructure }
     *     
     */
    public void setSpotColumns(SpotColumnsRelStructure value) {
        this.spotColumns = value;
    }

    /**
     * Ruft den Wert der deckPathJunctions-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link DeckPathJunctionRefsRelStructure }
     *     
     */
    public DeckPathJunctionRefsRelStructure getDeckPathJunctions() {
        return deckPathJunctions;
    }

    /**
     * Legt den Wert der deckPathJunctions-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link DeckPathJunctionRefsRelStructure }
     *     
     */
    public void setDeckPathJunctions(DeckPathJunctionRefsRelStructure value) {
        this.deckPathJunctions = value;
    }

    /**
     * Ruft den Wert der deckPathLinks-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link DeckPathLinkRefsRelStructure }
     *     
     */
    public DeckPathLinkRefsRelStructure getDeckPathLinks() {
        return deckPathLinks;
    }

    /**
     * Legt den Wert der deckPathLinks-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link DeckPathLinkRefsRelStructure }
     *     
     */
    public void setDeckPathLinks(DeckPathLinkRefsRelStructure value) {
        this.deckPathLinks = value;
    }

    /**
     * Ruft den Wert der deckNavigationPaths-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link DeckNavigationPathsRelStructure }
     *     
     */
    public DeckNavigationPathsRelStructure getDeckNavigationPaths() {
        return deckNavigationPaths;
    }

    /**
     * Legt den Wert der deckNavigationPaths-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link DeckNavigationPathsRelStructure }
     *     
     */
    public void setDeckNavigationPaths(DeckNavigationPathsRelStructure value) {
        this.deckNavigationPaths = value;
    }

}
