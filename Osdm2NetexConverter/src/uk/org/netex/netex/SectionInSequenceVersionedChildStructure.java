//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// �nderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2026.05.22 um 10:24:00 AM CEST 
//


package uk.org.netex.netex;

import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElementRef;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Type for a SECTION IN SEQUENCE
 * 
 * <p>Java-Klasse f�r SectionInSequence_VersionedChildStructure complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="SectionInSequence_VersionedChildStructure">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.netex.org.uk/netex}LinkInLinkSequence_VersionedChildStructure">
 *       &lt;sequence>
 *         &lt;group ref="{http://www.netex.org.uk/netex}SectionInSequenceGroup"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SectionInSequence_VersionedChildStructure", propOrder = {
    "sectionRef",
    "sectionDummy"
})
@XmlSeeAlso({
    SectionInSequence.class
})
public class SectionInSequenceVersionedChildStructure
    extends LinkInLinkSequenceVersionedChildStructure
{

    @XmlElementRef(name = "SectionRef", namespace = "http://www.netex.org.uk/netex", type = JAXBElement.class, required = false)
    protected JAXBElement<? extends SectionRefStructure> sectionRef;
    @XmlElementRef(name = "Section_Dummy", namespace = "http://www.netex.org.uk/netex", type = JAXBElement.class, required = false)
    protected JAXBElement<? extends LinkSequenceVersionStructure> sectionDummy;

    /**
     * Reference to a LINK SEQUENCE.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link SectionRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link CommonSectionRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link FareSectionRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link GeneralSectionRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link CommonSectionRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link LineSectionRefStructure }{@code >}
     *     
     */
    public JAXBElement<? extends SectionRefStructure> getSectionRef() {
        return sectionRef;
    }

    /**
     * Legt den Wert der sectionRef-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link SectionRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link CommonSectionRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link FareSectionRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link GeneralSectionRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link CommonSectionRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link LineSectionRefStructure }{@code >}
     *     
     */
    public void setSectionRef(JAXBElement<? extends SectionRefStructure> value) {
        this.sectionRef = value;
    }

    /**
     * Ruft den Wert der sectionDummy-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link LinkSequenceVersionStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link LineSection }{@code >}
     *     {@link JAXBElement }{@code <}{@link FareSection }{@code >}
     *     {@link JAXBElement }{@code <}{@link CommonSection }{@code >}
     *     {@link JAXBElement }{@code <}{@link Section }{@code >}
     *     {@link JAXBElement }{@code <}{@link GeneralSection }{@code >}
     *     
     */
    public JAXBElement<? extends LinkSequenceVersionStructure> getSectionDummy() {
        return sectionDummy;
    }

    /**
     * Legt den Wert der sectionDummy-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link LinkSequenceVersionStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link LineSection }{@code >}
     *     {@link JAXBElement }{@code <}{@link FareSection }{@code >}
     *     {@link JAXBElement }{@code <}{@link CommonSection }{@code >}
     *     {@link JAXBElement }{@code <}{@link Section }{@code >}
     *     {@link JAXBElement }{@code <}{@link GeneralSection }{@code >}
     *     
     */
    public void setSectionDummy(JAXBElement<? extends LinkSequenceVersionStructure> value) {
        this.sectionDummy = value;
    }

}
