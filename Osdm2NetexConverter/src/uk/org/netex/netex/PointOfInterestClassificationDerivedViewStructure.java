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
 * Type for POINT OF INTEREST CLASSIFICATION VIEW.
 * 
 * <p>Java-Klasse f�r PointOfInterestClassification_DerivedViewStructure complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="PointOfInterestClassification_DerivedViewStructure">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.netex.org.uk/netex}DerivedViewStructure">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.netex.org.uk/netex}PointOfInterestClassificationRef" minOccurs="0"/>
 *         &lt;element name="Name" type="{http://www.netex.org.uk/netex}MultilingualString" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PointOfInterestClassification_DerivedViewStructure", propOrder = {
    "pointOfInterestClassificationRef",
    "name"
})
public class PointOfInterestClassificationDerivedViewStructure
    extends DerivedViewStructure
{

    @XmlElement(name = "PointOfInterestClassificationRef")
    protected PointOfInterestClassificationRefStructure pointOfInterestClassificationRef;
    @XmlElement(name = "Name")
    protected MultilingualString name;

    /**
     * Ruft den Wert der pointOfInterestClassificationRef-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link PointOfInterestClassificationRefStructure }
     *     
     */
    public PointOfInterestClassificationRefStructure getPointOfInterestClassificationRef() {
        return pointOfInterestClassificationRef;
    }

    /**
     * Legt den Wert der pointOfInterestClassificationRef-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link PointOfInterestClassificationRefStructure }
     *     
     */
    public void setPointOfInterestClassificationRef(PointOfInterestClassificationRefStructure value) {
        this.pointOfInterestClassificationRef = value;
    }

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

}
