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
 * Type for a BORDER POINT.
 * 
 * <p>Java-Klasse f�r BorderPoint_ValueStructure complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="BorderPoint_ValueStructure">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.netex.org.uk/netex}TimingPoint_VersionStructure">
 *       &lt;group ref="{http://www.netex.org.uk/netex}BorderPointGroup"/>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BorderPoint_ValueStructure", propOrder = {
    "shortName",
    "description",
    "groupOfOperatorsRef",
    "groupOfOperators"
})
@XmlSeeAlso({
    BorderPoint.class
})
public class BorderPointValueStructure
    extends TimingPointVersionStructure
{

    @XmlElement(name = "ShortName")
    protected MultilingualString shortName;
    @XmlElement(name = "Description")
    protected MultilingualString description;
    @XmlElement(name = "GroupOfOperatorsRef")
    protected GroupOfOperatorsRefStructure groupOfOperatorsRef;
    @XmlElement(name = "GroupOfOperators")
    protected GroupOfOperators groupOfOperators;

    /**
     * Ruft den Wert der shortName-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link MultilingualString }
     *     
     */
    public MultilingualString getShortName() {
        return shortName;
    }

    /**
     * Legt den Wert der shortName-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link MultilingualString }
     *     
     */
    public void setShortName(MultilingualString value) {
        this.shortName = value;
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
     * Ruft den Wert der groupOfOperatorsRef-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link GroupOfOperatorsRefStructure }
     *     
     */
    public GroupOfOperatorsRefStructure getGroupOfOperatorsRef() {
        return groupOfOperatorsRef;
    }

    /**
     * Legt den Wert der groupOfOperatorsRef-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link GroupOfOperatorsRefStructure }
     *     
     */
    public void setGroupOfOperatorsRef(GroupOfOperatorsRefStructure value) {
        this.groupOfOperatorsRef = value;
    }

    /**
     * Ruft den Wert der groupOfOperators-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link GroupOfOperators }
     *     
     */
    public GroupOfOperators getGroupOfOperators() {
        return groupOfOperators;
    }

    /**
     * Legt den Wert der groupOfOperators-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link GroupOfOperators }
     *     
     */
    public void setGroupOfOperators(GroupOfOperators value) {
        this.groupOfOperators = value;
    }

}
