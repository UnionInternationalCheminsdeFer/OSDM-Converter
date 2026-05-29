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
 * Type for GROUP OF DISTRIBUTION CHANNELs.
 * 
 * <p>Java-Klasse f�r GroupOfDistributionChannels_VersionStructure complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="GroupOfDistributionChannels_VersionStructure">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.netex.org.uk/netex}GroupOfEntities_VersionStructure">
 *       &lt;sequence>
 *         &lt;group ref="{http://www.netex.org.uk/netex}GroupOfDistributionChannelsGroup"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GroupOfDistributionChannels_VersionStructure", propOrder = {
    "members"
})
@XmlSeeAlso({
    GroupOfDistributionChannels.class
})
public class GroupOfDistributionChannelsVersionStructure
    extends GroupOfEntitiesVersionStructure
{

    protected DistributionChannelRefsRelStructure members;

    /**
     * Ruft den Wert der members-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link DistributionChannelRefsRelStructure }
     *     
     */
    public DistributionChannelRefsRelStructure getMembers() {
        return members;
    }

    /**
     * Legt den Wert der members-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link DistributionChannelRefsRelStructure }
     *     
     */
    public void setMembers(DistributionChannelRefsRelStructure value) {
        this.members = value;
    }

}
