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
 * Type for GROUP OF TARIFF ZONEs.
 * 
 * <p>Java-Klasse f�r GroupOfTariffZones_VersionStructure complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="GroupOfTariffZones_VersionStructure">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.netex.org.uk/netex}GroupOfEntities_VersionStructure">
 *       &lt;sequence>
 *         &lt;group ref="{http://www.netex.org.uk/netex}GroupOfTariffZonesGroup"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GroupOfTariffZones_VersionStructure", propOrder = {
    "members"
})
@XmlSeeAlso({
    GroupOfTariffZones.class
})
public class GroupOfTariffZonesVersionStructure
    extends GroupOfEntitiesVersionStructure
{

    protected TariffZoneRefsRelStructure members;

    /**
     * Ruft den Wert der members-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link TariffZoneRefsRelStructure }
     *     
     */
    public TariffZoneRefsRelStructure getMembers() {
        return members;
    }

    /**
     * Legt den Wert der members-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link TariffZoneRefsRelStructure }
     *     
     */
    public void setMembers(TariffZoneRefsRelStructure value) {
        this.members = value;
    }

}
