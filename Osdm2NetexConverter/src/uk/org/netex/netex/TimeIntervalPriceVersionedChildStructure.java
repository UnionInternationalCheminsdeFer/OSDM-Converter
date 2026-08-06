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
 * Type for a TIME INTERVAL PRICEs.
 * 
 * <p>Java-Klasse f�r TimeIntervalPrice_VersionedChildStructure complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="TimeIntervalPrice_VersionedChildStructure">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.netex.org.uk/netex}FarePrice_VersionedChildStructure">
 *       &lt;sequence>
 *         &lt;group ref="{http://www.netex.org.uk/netex}TimeIntervalPriceGroup"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TimeIntervalPrice_VersionedChildStructure", propOrder = {
    "timeIntervalRef"
})
@XmlSeeAlso({
    TimeIntervalPrice.class
})
public class TimeIntervalPriceVersionedChildStructure
    extends FarePriceVersionedChildStructure
{

    @XmlElement(name = "TimeIntervalRef")
    protected TimeIntervalRefStructure timeIntervalRef;

    /**
     * Ruft den Wert der timeIntervalRef-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link TimeIntervalRefStructure }
     *     
     */
    public TimeIntervalRefStructure getTimeIntervalRef() {
        return timeIntervalRef;
    }

    /**
     * Legt den Wert der timeIntervalRef-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link TimeIntervalRefStructure }
     *     
     */
    public void setTimeIntervalRef(TimeIntervalRefStructure value) {
        this.timeIntervalRef = value;
    }

}
