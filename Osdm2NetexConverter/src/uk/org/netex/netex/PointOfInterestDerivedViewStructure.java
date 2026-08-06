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
 * Type for POINT OF INTEREST VIEW.
 * 
 * <p>Java-Klasse f�r PointOfInterest_DerivedViewStructure complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="PointOfInterest_DerivedViewStructure">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.netex.org.uk/netex}DerivedViewStructure">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.netex.org.uk/netex}PointOfInterestRef" minOccurs="0"/>
 *         &lt;element name="Name" type="{http://www.netex.org.uk/netex}MultilingualString" minOccurs="0"/>
 *         &lt;element name="placeTypes" type="{http://www.netex.org.uk/netex}typeOfPlaceRefs_RelStructure" minOccurs="0"/>
 *         &lt;element name="ShortName" type="{http://www.netex.org.uk/netex}MultilingualString" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PointOfInterest_DerivedViewStructure", propOrder = {
    "pointOfInterestRef",
    "name",
    "placeTypes",
    "shortName"
})
public class PointOfInterestDerivedViewStructure
    extends DerivedViewStructure
{

    @XmlElement(name = "PointOfInterestRef")
    protected PointOfInterestRefStructure pointOfInterestRef;
    @XmlElement(name = "Name")
    protected MultilingualString name;
    protected TypeOfPlaceRefsRelStructure placeTypes;
    @XmlElement(name = "ShortName")
    protected MultilingualString shortName;

    /**
     * Ruft den Wert der pointOfInterestRef-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link PointOfInterestRefStructure }
     *     
     */
    public PointOfInterestRefStructure getPointOfInterestRef() {
        return pointOfInterestRef;
    }

    /**
     * Legt den Wert der pointOfInterestRef-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link PointOfInterestRefStructure }
     *     
     */
    public void setPointOfInterestRef(PointOfInterestRefStructure value) {
        this.pointOfInterestRef = value;
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

    /**
     * Ruft den Wert der placeTypes-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link TypeOfPlaceRefsRelStructure }
     *     
     */
    public TypeOfPlaceRefsRelStructure getPlaceTypes() {
        return placeTypes;
    }

    /**
     * Legt den Wert der placeTypes-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeOfPlaceRefsRelStructure }
     *     
     */
    public void setPlaceTypes(TypeOfPlaceRefsRelStructure value) {
        this.placeTypes = value;
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

}
