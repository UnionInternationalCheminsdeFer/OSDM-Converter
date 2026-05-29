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
 * Type for a list of SINGLE JOURNEYs.
 * 
 * <p>Java-Klasse f�r singleJourneyRefs_RelStructure complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="singleJourneyRefs_RelStructure">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.netex.org.uk/netex}oneToManyRelationshipStructure">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.netex.org.uk/netex}SingleJourneyRef"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "singleJourneyRefs_RelStructure", propOrder = {
    "singleJourneyRef"
})
public class SingleJourneyRefsRelStructure
    extends OneToManyRelationshipStructure
{

    @XmlElement(name = "SingleJourneyRef", required = true)
    protected SingleJourneyRefStructure singleJourneyRef;

    /**
     * Ruft den Wert der singleJourneyRef-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link SingleJourneyRefStructure }
     *     
     */
    public SingleJourneyRefStructure getSingleJourneyRef() {
        return singleJourneyRef;
    }

    /**
     * Legt den Wert der singleJourneyRef-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link SingleJourneyRefStructure }
     *     
     */
    public void setSingleJourneyRef(SingleJourneyRefStructure value) {
        this.singleJourneyRef = value;
    }

}
