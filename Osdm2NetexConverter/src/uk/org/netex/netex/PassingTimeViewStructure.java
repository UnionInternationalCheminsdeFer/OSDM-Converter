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
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Type for Simplified TARGET PASSING TIME.
 * 
 * <p>Java-Klasse f�r PassingTime_ViewStructure complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="PassingTime_ViewStructure">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.netex.org.uk/netex}DataManagedObject_ViewStructure">
 *       &lt;sequence>
 *         &lt;element name="DayOffset" type="{http://www.netex.org.uk/netex}DayOffsetType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PassingTime_ViewStructure", propOrder = {
    "dayOffset"
})
@XmlSeeAlso({
    PassingTimeView.class,
    TimetabledPassingTimeViewStructure.class,
    ObservedPassingTimeViewStructure.class,
    EstimatedPassingTimeViewStructure.class,
    TargetPassingTimeViewStructure.class
})
public class PassingTimeViewStructure
    extends DataManagedObjectViewStructure
{

    @XmlElement(name = "DayOffset", defaultValue = "0")
    protected BigInteger dayOffset;

    /**
     * Ruft den Wert der dayOffset-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getDayOffset() {
        return dayOffset;
    }

    /**
     * Legt den Wert der dayOffset-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setDayOffset(BigInteger value) {
        this.dayOffset = value;
    }

}
