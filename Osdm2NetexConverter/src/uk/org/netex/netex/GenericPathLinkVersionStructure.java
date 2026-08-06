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
 * Type for a GENERIC PATH LINK.
 * 
 * <p>Java-Klasse f�r GenericPathLink_VersionStructure complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="GenericPathLink_VersionStructure">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.netex.org.uk/netex}Link_VersionStructure">
 *       &lt;sequence>
 *         &lt;group ref="{http://www.netex.org.uk/netex}GenericPathLinkGroup"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GenericPathLink_VersionStructure", propOrder = {
    "pathInstructions"
})
@XmlSeeAlso({
    GenericPathLink.class,
    DeckPathLinkVersionStructure.class,
    OffSitePathLinkVersionStructure.class,
    SitePathLinkVersionStructure.class
})
public abstract class GenericPathLinkVersionStructure
    extends LinkVersionStructure
{

    protected PathInstructionsRelStructure pathInstructions;

    /**
     * Ruft den Wert der pathInstructions-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link PathInstructionsRelStructure }
     *     
     */
    public PathInstructionsRelStructure getPathInstructions() {
        return pathInstructions;
    }

    /**
     * Legt den Wert der pathInstructions-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link PathInstructionsRelStructure }
     *     
     */
    public void setPathInstructions(PathInstructionsRelStructure value) {
        this.pathInstructions = value;
    }

}
