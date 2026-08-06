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
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlElementRef;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Type for a PATH LINK IN SEQUENCE.
 * 
 * <p>Java-Klasse f�r PathLinkInSequence_VersionedChildStructure complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="PathLinkInSequence_VersionedChildStructure">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.netex.org.uk/netex}LinkInLinkSequence_VersionedChildStructure">
 *       &lt;sequence>
 *         &lt;group ref="{http://www.netex.org.uk/netex}PathLinkInSequenceGroup"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PathLinkInSequence_VersionedChildStructure", propOrder = {
    "genericPathLinkRef",
    "reverse",
    "heading",
    "transition",
    "instruction",
    "label",
    "views"
})
@XmlSeeAlso({
    PathLinkInSequence.class
})
public class PathLinkInSequenceVersionedChildStructure
    extends LinkInLinkSequenceVersionedChildStructure
{

    @XmlElementRef(name = "GenericPathLinkRef", namespace = "http://www.netex.org.uk/netex", type = JAXBElement.class)
    protected JAXBElement<? extends GenericPathLinkRefStructure> genericPathLinkRef;
    @XmlElement(name = "Reverse")
    protected Boolean reverse;
    @XmlElement(name = "Heading")
    @XmlSchemaType(name = "NMTOKEN")
    protected PathHeadingEnumeration heading;
    @XmlElement(name = "Transition")
    @XmlSchemaType(name = "NMTOKEN")
    protected TransitionEnumeration transition;
    @XmlElement(name = "Instruction")
    protected MultilingualString instruction;
    @XmlElement(name = "Label")
    protected MultilingualString label;
    protected PathLinkInSequenceVersionedChildStructure.Views views;

    /**
     * Ruft den Wert der genericPathLinkRef-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link DeckPathLinkRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link SitePathLinkRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link GenericPathLinkRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link OffSitePathLinkRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link SitePathLinkRefStructure }{@code >}
     *     
     */
    public JAXBElement<? extends GenericPathLinkRefStructure> getGenericPathLinkRef() {
        return genericPathLinkRef;
    }

    /**
     * Legt den Wert der genericPathLinkRef-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link DeckPathLinkRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link SitePathLinkRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link GenericPathLinkRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link OffSitePathLinkRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link SitePathLinkRefStructure }{@code >}
     *     
     */
    public void setGenericPathLinkRef(JAXBElement<? extends GenericPathLinkRefStructure> value) {
        this.genericPathLinkRef = value;
    }

    /**
     * Ruft den Wert der reverse-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isReverse() {
        return reverse;
    }

    /**
     * Legt den Wert der reverse-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setReverse(Boolean value) {
        this.reverse = value;
    }

    /**
     * Ruft den Wert der heading-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link PathHeadingEnumeration }
     *     
     */
    public PathHeadingEnumeration getHeading() {
        return heading;
    }

    /**
     * Legt den Wert der heading-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link PathHeadingEnumeration }
     *     
     */
    public void setHeading(PathHeadingEnumeration value) {
        this.heading = value;
    }

    /**
     * Ruft den Wert der transition-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link TransitionEnumeration }
     *     
     */
    public TransitionEnumeration getTransition() {
        return transition;
    }

    /**
     * Legt den Wert der transition-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link TransitionEnumeration }
     *     
     */
    public void setTransition(TransitionEnumeration value) {
        this.transition = value;
    }

    /**
     * Ruft den Wert der instruction-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link MultilingualString }
     *     
     */
    public MultilingualString getInstruction() {
        return instruction;
    }

    /**
     * Legt den Wert der instruction-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link MultilingualString }
     *     
     */
    public void setInstruction(MultilingualString value) {
        this.instruction = value;
    }

    /**
     * Ruft den Wert der label-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link MultilingualString }
     *     
     */
    public MultilingualString getLabel() {
        return label;
    }

    /**
     * Legt den Wert der label-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link MultilingualString }
     *     
     */
    public void setLabel(MultilingualString value) {
        this.label = value;
    }

    /**
     * Ruft den Wert der views-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link PathLinkInSequenceVersionedChildStructure.Views }
     *     
     */
    public PathLinkInSequenceVersionedChildStructure.Views getViews() {
        return views;
    }

    /**
     * Legt den Wert der views-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link PathLinkInSequenceVersionedChildStructure.Views }
     *     
     */
    public void setViews(PathLinkInSequenceVersionedChildStructure.Views value) {
        this.views = value;
    }


    /**
     * <p>Java-Klasse f�r anonymous complex type.
     * 
     * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element ref="{http://www.netex.org.uk/netex}PathLinkView"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "pathLinkView"
    })
    public static class Views {

        @XmlElement(name = "PathLinkView", required = true)
        protected PathLinkView pathLinkView;

        /**
         * Ruft den Wert der pathLinkView-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link PathLinkView }
         *     
         */
        public PathLinkView getPathLinkView() {
            return pathLinkView;
        }

        /**
         * Legt den Wert der pathLinkView-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link PathLinkView }
         *     
         */
        public void setPathLinkView(PathLinkView value) {
            this.pathLinkView = value;
        }

    }

}
