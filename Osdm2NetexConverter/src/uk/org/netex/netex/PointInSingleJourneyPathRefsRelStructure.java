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
import jakarta.xml.bind.annotation.XmlType;


/**
 * Type for a list of POINT IN SINGLE JOURNEY PATHs.
 * 
 * <p>Java-Klasse f�r PointInSingleJourneyPathRefs_RelStructure complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="PointInSingleJourneyPathRefs_RelStructure">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.netex.org.uk/netex}oneToManyRelationshipStructure">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.netex.org.uk/netex}PointInSingleJourneyPathRef"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PointInSingleJourneyPathRefs_RelStructure", propOrder = {
    "pointInSingleJourneyPathRef"
})
public class PointInSingleJourneyPathRefsRelStructure
    extends OneToManyRelationshipStructure
{

    @XmlElement(name = "PointInSingleJourneyPathRef", required = true)
    protected PointInSingleJourneyPathRefStructure pointInSingleJourneyPathRef;

    /**
     * Ruft den Wert der pointInSingleJourneyPathRef-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link PointInSingleJourneyPathRefStructure }
     *     
     */
    public PointInSingleJourneyPathRefStructure getPointInSingleJourneyPathRef() {
        return pointInSingleJourneyPathRef;
    }

    /**
     * Legt den Wert der pointInSingleJourneyPathRef-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link PointInSingleJourneyPathRefStructure }
     *     
     */
    public void setPointInSingleJourneyPathRef(PointInSingleJourneyPathRefStructure value) {
        this.pointInSingleJourneyPathRef = value;
    }

}
