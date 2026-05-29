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
import jakarta.xml.bind.annotation.XmlType;


/**
 * Type for a TOPOGRAPHIC PLACE DESCRIPTOR.
 * 
 * <p>Java-Klasse f�r TopographicPlaceDescriptor_VersionedChildStructure complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="TopographicPlaceDescriptor_VersionedChildStructure">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.netex.org.uk/netex}VersionedChildStructure">
 *       &lt;sequence>
 *         &lt;element name="Name" type="{http://www.netex.org.uk/netex}MultilingualString"/>
 *         &lt;element name="ShortName" type="{http://www.netex.org.uk/netex}MultilingualString" minOccurs="0"/>
 *         &lt;element name="Qualify" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="QualifierName" type="{http://www.netex.org.uk/netex}MultilingualString"/>
 *                   &lt;element ref="{http://www.netex.org.uk/netex}TopographicPlaceRef" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TopographicPlaceDescriptor_VersionedChildStructure", propOrder = {
    "name",
    "shortName",
    "qualify"
})
public class TopographicPlaceDescriptorVersionedChildStructure
    extends VersionedChildStructure
{

    @XmlElement(name = "Name", required = true)
    protected MultilingualString name;
    @XmlElement(name = "ShortName")
    protected MultilingualString shortName;
    @XmlElement(name = "Qualify")
    protected TopographicPlaceDescriptorVersionedChildStructure.Qualify qualify;

    /**
     * Ruft den Wert der name-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link MultilingualString }
     *     
     */
    public MultilingualString getName() {
        return name;
    }

    /**
     * Legt den Wert der name-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link MultilingualString }
     *     
     */
    public void setName(MultilingualString value) {
        this.name = value;
    }

    /**
     * Ruft den Wert der shortName-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link MultilingualString }
     *     
     */
    public MultilingualString getShortName() {
        return shortName;
    }

    /**
     * Legt den Wert der shortName-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link MultilingualString }
     *     
     */
    public void setShortName(MultilingualString value) {
        this.shortName = value;
    }

    /**
     * Ruft den Wert der qualify-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link TopographicPlaceDescriptorVersionedChildStructure.Qualify }
     *     
     */
    public TopographicPlaceDescriptorVersionedChildStructure.Qualify getQualify() {
        return qualify;
    }

    /**
     * Legt den Wert der qualify-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link TopographicPlaceDescriptorVersionedChildStructure.Qualify }
     *     
     */
    public void setQualify(TopographicPlaceDescriptorVersionedChildStructure.Qualify value) {
        this.qualify = value;
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
     *         &lt;element name="QualifierName" type="{http://www.netex.org.uk/netex}MultilingualString"/>
     *         &lt;element ref="{http://www.netex.org.uk/netex}TopographicPlaceRef" minOccurs="0"/>
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
        "qualifierName",
        "topographicPlaceRef"
    })
    public static class Qualify {

        @XmlElement(name = "QualifierName", required = true)
        protected MultilingualString qualifierName;
        @XmlElement(name = "TopographicPlaceRef")
        protected TopographicPlaceRefStructure topographicPlaceRef;

        /**
         * Ruft den Wert der qualifierName-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link MultilingualString }
         *     
         */
        public MultilingualString getQualifierName() {
            return qualifierName;
        }

        /**
         * Legt den Wert der qualifierName-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link MultilingualString }
         *     
         */
        public void setQualifierName(MultilingualString value) {
            this.qualifierName = value;
        }

        /**
         * Ruft den Wert der topographicPlaceRef-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link TopographicPlaceRefStructure }
         *     
         */
        public TopographicPlaceRefStructure getTopographicPlaceRef() {
            return topographicPlaceRef;
        }

        /**
         * Legt den Wert der topographicPlaceRef-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link TopographicPlaceRefStructure }
         *     
         */
        public void setTopographicPlaceRef(TopographicPlaceRefStructure value) {
            this.topographicPlaceRef = value;
        }

    }

}
