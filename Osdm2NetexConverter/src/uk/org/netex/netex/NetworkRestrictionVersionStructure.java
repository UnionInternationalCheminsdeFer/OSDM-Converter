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
 * Type for a NETWORK RESTRICTION.
 * 
 * <p>Java-Klasse f�r NetworkRestriction_VersionStructure complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="NetworkRestriction_VersionStructure">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.netex.org.uk/netex}Assignment_VersionStructure">
 *       &lt;sequence>
 *         &lt;group ref="{http://www.netex.org.uk/netex}NetworkRestrictionGroup"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NetworkRestriction_VersionStructure", propOrder = {
    "restricted"
})
@XmlSeeAlso({
    InfrastructureLinkRestrictionVersionStructure.class,
    OvertakingPossibilityVersionStructure.class,
    VehicleTypeAtPointVersionStructure.class
})
public abstract class NetworkRestrictionVersionStructure
    extends AssignmentVersionStructure
{

    @XmlElement(name = "Restricted", defaultValue = "true")
    protected boolean restricted;

    /**
     * Ruft den Wert der restricted-Eigenschaft ab.
     * 
     */
    public boolean isRestricted() {
        return restricted;
    }

    /**
     * Legt den Wert der restricted-Eigenschaft fest.
     * 
     */
    public void setRestricted(boolean value) {
        this.restricted = value;
    }

}
