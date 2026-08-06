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
 * Type for a DECK ENTRANCE COUPLE.
 * 
 * <p>Java-Klasse f�r DeckEntranceCouple_VersionedChildStructure complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="DeckEntranceCouple_VersionedChildStructure">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.netex.org.uk/netex}VersionedChildStructure">
 *       &lt;group ref="{http://www.netex.org.uk/netex}DeckEntranceCoupleGroup"/>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DeckEntranceCouple_VersionedChildStructure", propOrder = {
    "name",
    "fromDeckEntranceRef",
    "toDeckEntranceRef"
})
@XmlSeeAlso({
    DeckEntranceCouple.class
})
public class DeckEntranceCoupleVersionedChildStructure
    extends VersionedChildStructure
{

    @XmlElement(name = "Name")
    protected MultilingualString name;
    @XmlElement(name = "FromDeckEntranceRef", required = true)
    protected DeckEntranceRefStructure fromDeckEntranceRef;
    @XmlElement(name = "ToDeckEntranceRef", required = true)
    protected DeckEntranceRefStructure toDeckEntranceRef;

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
     * Ruft den Wert der fromDeckEntranceRef-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link DeckEntranceRefStructure }
     *     
     */
    public DeckEntranceRefStructure getFromDeckEntranceRef() {
        return fromDeckEntranceRef;
    }

    /**
     * Legt den Wert der fromDeckEntranceRef-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link DeckEntranceRefStructure }
     *     
     */
    public void setFromDeckEntranceRef(DeckEntranceRefStructure value) {
        this.fromDeckEntranceRef = value;
    }

    /**
     * Ruft den Wert der toDeckEntranceRef-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link DeckEntranceRefStructure }
     *     
     */
    public DeckEntranceRefStructure getToDeckEntranceRef() {
        return toDeckEntranceRef;
    }

    /**
     * Legt den Wert der toDeckEntranceRef-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link DeckEntranceRefStructure }
     *     
     */
    public void setToDeckEntranceRef(DeckEntranceRefStructure value) {
        this.toDeckEntranceRef = value;
    }

}
