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
 * Type for a NETWORK LINK RESTRICTION.
 * 
 * <p>Java-Klasse f�r InfrastructureLinkRestriction_VersionStructure complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="InfrastructureLinkRestriction_VersionStructure">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.netex.org.uk/netex}NetworkRestriction_VersionStructure">
 *       &lt;group ref="{http://www.netex.org.uk/netex}InfrastructureLinkRestrictionGroup"/>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InfrastructureLinkRestriction_VersionStructure", propOrder = {
    "fromLinkRef",
    "toLinkRef"
})
@XmlSeeAlso({
    InfrastructureLinkRestriction.class,
    RestrictedManoeuvreVersionStructure.class,
    MeetingRestrictionVersionStructure.class
})
public abstract class InfrastructureLinkRestrictionVersionStructure
    extends NetworkRestrictionVersionStructure
{

    @XmlElement(name = "FromLinkRef", required = true)
    protected LinkRefStructure fromLinkRef;
    @XmlElement(name = "ToLinkRef", required = true)
    protected LinkRefStructure toLinkRef;

    /**
     * Ruft den Wert der fromLinkRef-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link LinkRefStructure }
     *     
     */
    public LinkRefStructure getFromLinkRef() {
        return fromLinkRef;
    }

    /**
     * Legt den Wert der fromLinkRef-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link LinkRefStructure }
     *     
     */
    public void setFromLinkRef(LinkRefStructure value) {
        this.fromLinkRef = value;
    }

    /**
     * Ruft den Wert der toLinkRef-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link LinkRefStructure }
     *     
     */
    public LinkRefStructure getToLinkRef() {
        return toLinkRef;
    }

    /**
     * Legt den Wert der toLinkRef-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link LinkRefStructure }
     *     
     */
    public void setToLinkRef(LinkRefStructure value) {
        this.toLinkRef = value;
    }

}
