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
 * Type for a TIME UNIT PRICEs.
 * 
 * <p>Java-Klasse f�r TimeUnitPrice_VersionedChildStructure complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="TimeUnitPrice_VersionedChildStructure">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.netex.org.uk/netex}FarePrice_VersionedChildStructure">
 *       &lt;sequence>
 *         &lt;group ref="{http://www.netex.org.uk/netex}TimeUnitPriceGroup"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TimeUnitPrice_VersionedChildStructure", propOrder = {
    "timeUnitRef"
})
@XmlSeeAlso({
    TimeUnitPrice.class
})
public class TimeUnitPriceVersionedChildStructure
    extends FarePriceVersionedChildStructure
{

    @XmlElement(name = "TimeUnitRef")
    protected TimeUnitRefStructure timeUnitRef;

    /**
     * Ruft den Wert der timeUnitRef-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link TimeUnitRefStructure }
     *     
     */
    public TimeUnitRefStructure getTimeUnitRef() {
        return timeUnitRef;
    }

    /**
     * Legt den Wert der timeUnitRef-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link TimeUnitRefStructure }
     *     
     */
    public void setTimeUnitRef(TimeUnitRefStructure value) {
        this.timeUnitRef = value;
    }

}
