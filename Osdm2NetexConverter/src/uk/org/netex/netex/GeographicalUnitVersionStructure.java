//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// �nderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2026.05.22 um 10:24:00 AM CEST 
//


package uk.org.netex.netex;

import java.math.BigDecimal;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Type for GEOGRAPHICAL UNIT.
 * 
 * <p>Java-Klasse f�r GeographicalUnit_VersionStructure complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="GeographicalUnit_VersionStructure">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.netex.org.uk/netex}FareUnit_VersionStructure">
 *       &lt;sequence>
 *         &lt;element name="Distance" type="{http://www.netex.org.uk/netex}DistanceType" minOccurs="0"/>
 *         &lt;group ref="{http://www.netex.org.uk/netex}GeographicalUnitGroup"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GeographicalUnit_VersionStructure", propOrder = {
    "distance",
    "prices"
})
@XmlSeeAlso({
    GeographicalUnit.class
})
public class GeographicalUnitVersionStructure
    extends FareUnitVersionStructure
{

    @XmlElement(name = "Distance")
    protected BigDecimal distance;
    protected GeographicalUnitPricesRelStructure prices;

    /**
     * Ruft den Wert der distance-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getDistance() {
        return distance;
    }

    /**
     * Legt den Wert der distance-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setDistance(BigDecimal value) {
        this.distance = value;
    }

    /**
     * Ruft den Wert der prices-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link GeographicalUnitPricesRelStructure }
     *     
     */
    public GeographicalUnitPricesRelStructure getPrices() {
        return prices;
    }

    /**
     * Legt den Wert der prices-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link GeographicalUnitPricesRelStructure }
     *     
     */
    public void setPrices(GeographicalUnitPricesRelStructure value) {
        this.prices = value;
    }

}
