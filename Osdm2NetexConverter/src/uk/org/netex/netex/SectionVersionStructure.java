//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// �nderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2026.05.22 um 10:24:00 AM CEST 
//


package uk.org.netex.netex;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.CollapsedStringAdapter;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * Type for SECTION. +v1.1.
 * 
 * <p>Java-Klasse f�r Section_VersionStructure complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="Section_VersionStructure">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.netex.org.uk/netex}LinkSequence_VersionStructure">
 *       &lt;sequence>
 *         &lt;group ref="{http://www.netex.org.uk/netex}SectionGroup"/>
 *       &lt;/sequence>
 *       &lt;attribute name="nameOfLinkClass" type="{http://www.netex.org.uk/netex}NameOfClass" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Section_VersionStructure", propOrder = {
    "purposeOfGroupingRef",
    "usedIn"
})
@XmlSeeAlso({
    Section.class,
    LineSectionVersionStructure.class,
    GeneralSectionVersionStructure.class,
    CommonSectionVersionStructure.class
})
public abstract class SectionVersionStructure
    extends LinkSequenceVersionStructure
{

    @XmlElement(name = "PurposeOfGroupingRef")
    protected PurposeOfGroupingRefStructure purposeOfGroupingRef;
    protected LinkSequenceRefsRelStructure usedIn;
    @XmlAttribute(name = "nameOfLinkClass")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String nameOfLinkClass;

    /**
     * Reference to a PURPOSE OF GROUPING.
     * 
     * @return
     *     possible object is
     *     {@link PurposeOfGroupingRefStructure }
     *     
     */
    public PurposeOfGroupingRefStructure getPurposeOfGroupingRef() {
        return purposeOfGroupingRef;
    }

    /**
     * Legt den Wert der purposeOfGroupingRef-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link PurposeOfGroupingRefStructure }
     *     
     */
    public void setPurposeOfGroupingRef(PurposeOfGroupingRefStructure value) {
        this.purposeOfGroupingRef = value;
    }

    /**
     * Ruft den Wert der usedIn-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link LinkSequenceRefsRelStructure }
     *     
     */
    public LinkSequenceRefsRelStructure getUsedIn() {
        return usedIn;
    }

    /**
     * Legt den Wert der usedIn-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link LinkSequenceRefsRelStructure }
     *     
     */
    public void setUsedIn(LinkSequenceRefsRelStructure value) {
        this.usedIn = value;
    }

    /**
     * Ruft den Wert der nameOfLinkClass-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNameOfLinkClass() {
        return nameOfLinkClass;
    }

    /**
     * Legt den Wert der nameOfLinkClass-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNameOfLinkClass(String value) {
        this.nameOfLinkClass = value;
    }

}
