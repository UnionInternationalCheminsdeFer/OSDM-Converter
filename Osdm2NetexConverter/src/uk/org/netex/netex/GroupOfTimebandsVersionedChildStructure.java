//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// �nderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2026.05.22 um 10:24:00 AM CEST 
//


package uk.org.netex.netex;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Type for a GROUP OF TIMEBANDS.
 * 
 * <p>Java-Klasse f�r GroupOfTimebands_VersionedChildStructure complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="GroupOfTimebands_VersionedChildStructure">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.netex.org.uk/netex}GroupOfEntities_VersionStructure">
 *       &lt;group ref="{http://www.netex.org.uk/netex}GroupOfTimebandsGroup"/>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GroupOfTimebands_VersionedChildStructure", propOrder = {
    "timebands"
})
@XmlSeeAlso({
    GroupOfTimebands.class
})
public class GroupOfTimebandsVersionedChildStructure
    extends GroupOfEntitiesVersionStructure
{

    protected TimebandRefsRelStructure timebands;

    /**
     * Ruft den Wert der timebands-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link TimebandRefsRelStructure }
     *     
     */
    public TimebandRefsRelStructure getTimebands() {
        return timebands;
    }

    /**
     * Legt den Wert der timebands-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link TimebandRefsRelStructure }
     *     
     */
    public void setTimebands(TimebandRefsRelStructure value) {
        this.timebands = value;
    }

}
