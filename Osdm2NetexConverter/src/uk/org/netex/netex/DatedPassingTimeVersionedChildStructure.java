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
 * Type for DATED PASSING TIME.
 * 
 * <p>Java-Klasse f�r DatedPassingTime_VersionedChildStructure complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="DatedPassingTime_VersionedChildStructure">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.netex.org.uk/netex}PassingTime_VersionedChildStructure">
 *       &lt;sequence>
 *         &lt;group ref="{http://www.netex.org.uk/netex}DatedPassingTimeGroup"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DatedPassingTime_VersionedChildStructure", propOrder = {
    "datedJourneyRef"
})
@XmlSeeAlso({
    ObservedPassingTimeVersionedChildStructure.class,
    EstimatedPassingTimeVersionedChildStructure.class,
    TargetPassingTimeVersionedChildStructure.class
})
public abstract class DatedPassingTimeVersionedChildStructure
    extends PassingTimeVersionedChildStructure
{

    @XmlElement(name = "DatedJourneyRef")
    protected JourneyRefStructure datedJourneyRef;

    /**
     * Ruft den Wert der datedJourneyRef-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JourneyRefStructure }
     *     
     */
    public JourneyRefStructure getDatedJourneyRef() {
        return datedJourneyRef;
    }

    /**
     * Legt den Wert der datedJourneyRef-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JourneyRefStructure }
     *     
     */
    public void setDatedJourneyRef(JourneyRefStructure value) {
        this.datedJourneyRef = value;
    }

}
