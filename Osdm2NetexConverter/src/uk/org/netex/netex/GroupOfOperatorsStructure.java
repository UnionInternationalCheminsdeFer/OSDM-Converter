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
 * Type for a GROUP OF OPERATORs.
 * 
 * <p>Java-Klasse f�r GroupOfOperatorsStructure complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="GroupOfOperatorsStructure">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.netex.org.uk/netex}GroupOfEntities_VersionStructure">
 *       &lt;sequence>
 *         &lt;group ref="{http://www.netex.org.uk/netex}GroupOfOperatorsGroup"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GroupOfOperatorsStructure", propOrder = {
    "useToExclude",
    "members"
})
@XmlSeeAlso({
    GroupOfOperators.class
})
public class GroupOfOperatorsStructure
    extends GroupOfEntitiesVersionStructure
{

    @XmlElement(name = "UseToExclude", defaultValue = "false")
    protected Boolean useToExclude;
    protected TransportOrganisationRefsRelStructure members;

    /**
     * Ruft den Wert der useToExclude-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isUseToExclude() {
        return useToExclude;
    }

    /**
     * Legt den Wert der useToExclude-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setUseToExclude(Boolean value) {
        this.useToExclude = value;
    }

    /**
     * Ruft den Wert der members-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link TransportOrganisationRefsRelStructure }
     *     
     */
    public TransportOrganisationRefsRelStructure getMembers() {
        return members;
    }

    /**
     * Legt den Wert der members-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link TransportOrganisationRefsRelStructure }
     *     
     */
    public void setMembers(TransportOrganisationRefsRelStructure value) {
        this.members = value;
    }

}
