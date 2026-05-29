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
 * Type for RELIEF POINT.
 * 
 * <p>Java-Klasse f�r ReliefPoint_VersionStructure complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="ReliefPoint_VersionStructure">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.netex.org.uk/netex}TimingPoint_VersionStructure">
 *       &lt;sequence>
 *         &lt;group ref="{http://www.netex.org.uk/netex}ReliefPointGroup"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ReliefPoint_VersionStructure", propOrder = {
    "crewBaseRef"
})
@XmlSeeAlso({
    ReliefPoint.class,
    ParkingPointVersionStructure.class
})
public class ReliefPointVersionStructure
    extends TimingPointVersionStructure
{

    @XmlElement(name = "CrewBaseRef")
    protected CrewBaseRefStructure crewBaseRef;

    /**
     * Ruft den Wert der crewBaseRef-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link CrewBaseRefStructure }
     *     
     */
    public CrewBaseRefStructure getCrewBaseRef() {
        return crewBaseRef;
    }

    /**
     * Legt den Wert der crewBaseRef-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link CrewBaseRefStructure }
     *     
     */
    public void setCrewBaseRef(CrewBaseRefStructure value) {
        this.crewBaseRef = value;
    }

}
