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
 * Type for an ACTIVATION LINK.
 * 
 * <p>Java-Klasse f�r ActivationLink_VersionStructure complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="ActivationLink_VersionStructure">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.netex.org.uk/netex}Link_VersionStructure">
 *       &lt;sequence>
 *         &lt;group ref="{http://www.netex.org.uk/netex}ActivationLinkGroup"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ActivationLink_VersionStructure", propOrder = {
    "typeOfActivationRef",
    "fromPointRef",
    "toPointRef"
})
@XmlSeeAlso({
    ActivationLink.class
})
public class ActivationLinkVersionStructure
    extends LinkVersionStructure
{

    @XmlElement(name = "TypeOfActivationRef")
    protected TypeOfActivationRefStructure typeOfActivationRef;
    @XmlElement(name = "FromPointRef", required = true)
    protected ActivationPointRefStructure fromPointRef;
    @XmlElement(name = "ToPointRef", required = true)
    protected ActivationPointRefStructure toPointRef;

    /**
     * Ruft den Wert der typeOfActivationRef-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link TypeOfActivationRefStructure }
     *     
     */
    public TypeOfActivationRefStructure getTypeOfActivationRef() {
        return typeOfActivationRef;
    }

    /**
     * Legt den Wert der typeOfActivationRef-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeOfActivationRefStructure }
     *     
     */
    public void setTypeOfActivationRef(TypeOfActivationRefStructure value) {
        this.typeOfActivationRef = value;
    }

    /**
     * Ruft den Wert der fromPointRef-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ActivationPointRefStructure }
     *     
     */
    public ActivationPointRefStructure getFromPointRef() {
        return fromPointRef;
    }

    /**
     * Legt den Wert der fromPointRef-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ActivationPointRefStructure }
     *     
     */
    public void setFromPointRef(ActivationPointRefStructure value) {
        this.fromPointRef = value;
    }

    /**
     * Ruft den Wert der toPointRef-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ActivationPointRefStructure }
     *     
     */
    public ActivationPointRefStructure getToPointRef() {
        return toPointRef;
    }

    /**
     * Legt den Wert der toPointRef-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ActivationPointRefStructure }
     *     
     */
    public void setToPointRef(ActivationPointRefStructure value) {
        this.toPointRef = value;
    }

}
