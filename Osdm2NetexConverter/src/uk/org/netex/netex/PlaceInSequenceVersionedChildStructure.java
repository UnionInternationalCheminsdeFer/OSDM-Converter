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
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.CollapsedStringAdapter;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * Type for a PLACE in SEQUENCE.
 * 
 * <p>Java-Klasse f�r PlaceInSequence_VersionedChildStructure complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="PlaceInSequence_VersionedChildStructure">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.netex.org.uk/netex}PointInLinkSequence_VersionedChildStructure">
 *       &lt;sequence>
 *         &lt;group ref="{http://www.netex.org.uk/netex}PlaceInSequenceGroup"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PlaceInSequence_VersionedChildStructure", propOrder = {
    "placeRef",
    "branchLevel",
    "onwardLinks"
})
@XmlSeeAlso({
    PlaceInSequence.class
})
public class PlaceInSequenceVersionedChildStructure
    extends PointInLinkSequenceVersionedChildStructure
{

    @XmlElement(name = "PlaceRef")
    protected PlaceRefStructure placeRef;
    @XmlElement(name = "BranchLevel")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NMTOKEN")
    protected String branchLevel;
    protected PlaceInSequenceVersionedChildStructure.OnwardLinks onwardLinks;

    /**
     * Ruft den Wert der placeRef-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link PlaceRefStructure }
     *     
     */
    public PlaceRefStructure getPlaceRef() {
        return placeRef;
    }

    /**
     * Legt den Wert der placeRef-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link PlaceRefStructure }
     *     
     */
    public void setPlaceRef(PlaceRefStructure value) {
        this.placeRef = value;
    }

    /**
     * Ruft den Wert der branchLevel-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBranchLevel() {
        return branchLevel;
    }

    /**
     * Legt den Wert der branchLevel-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBranchLevel(String value) {
        this.branchLevel = value;
    }

    /**
     * Ruft den Wert der onwardLinks-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link PlaceInSequenceVersionedChildStructure.OnwardLinks }
     *     
     */
    public PlaceInSequenceVersionedChildStructure.OnwardLinks getOnwardLinks() {
        return onwardLinks;
    }

    /**
     * Legt den Wert der onwardLinks-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link PlaceInSequenceVersionedChildStructure.OnwardLinks }
     *     
     */
    public void setOnwardLinks(PlaceInSequenceVersionedChildStructure.OnwardLinks value) {
        this.onwardLinks = value;
    }


    /**
     * <p>Java-Klasse f�r anonymous complex type.
     * 
     * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;extension base="{http://www.netex.org.uk/netex}pathLinksInSequence_RelStructure">
     *     &lt;/extension>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class OnwardLinks
        extends PathLinksInSequenceRelStructure
    {


    }

}
