//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// �nderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2026.05.22 um 10:24:00 AM CEST 
//


package uk.org.netex.netex;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlElements;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Type for a FLEXIBLE STOP PLACE.
 * 
 * <p>Java-Klasse f�r FlexibleStopPlace_VersionStructure complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="FlexibleStopPlace_VersionStructure">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.netex.org.uk/netex}Place_VersionStructure">
 *       &lt;sequence>
 *         &lt;group ref="{http://www.netex.org.uk/netex}SiteElementNamesGroup"/>
 *         &lt;element name="TransportMode" type="{http://www.netex.org.uk/netex}AllPublicTransportModesEnumeration" minOccurs="0"/>
 *         &lt;group ref="{http://www.netex.org.uk/netex}FlexibleStopPlaceGroup"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FlexibleStopPlace_VersionStructure", propOrder = {
    "nameSuffix",
    "alternativeNames",
    "transportMode",
    "publicCode",
    "areas",
    "lines"
})
@XmlSeeAlso({
    FlexibleStopPlace.class
})
public class FlexibleStopPlaceVersionStructure
    extends PlaceVersionStructure
{

    @XmlElement(name = "NameSuffix")
    protected MultilingualString nameSuffix;
    protected AlternativeNamesRelStructure alternativeNames;
    @XmlElement(name = "TransportMode")
    @XmlSchemaType(name = "NMTOKEN")
    protected AllPublicTransportModesEnumeration transportMode;
    @XmlElement(name = "PublicCode")
    protected PublicCodeStructure publicCode;
    protected FlexibleStopPlaceVersionStructure.Areas areas;
    protected LineRefsRelStructure lines;

    /**
     * Ruft den Wert der nameSuffix-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link MultilingualString }
     *     
     */
    public MultilingualString getNameSuffix() {
        return nameSuffix;
    }

    /**
     * Legt den Wert der nameSuffix-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link MultilingualString }
     *     
     */
    public void setNameSuffix(MultilingualString value) {
        this.nameSuffix = value;
    }

    /**
     * Ruft den Wert der alternativeNames-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link AlternativeNamesRelStructure }
     *     
     */
    public AlternativeNamesRelStructure getAlternativeNames() {
        return alternativeNames;
    }

    /**
     * Legt den Wert der alternativeNames-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link AlternativeNamesRelStructure }
     *     
     */
    public void setAlternativeNames(AlternativeNamesRelStructure value) {
        this.alternativeNames = value;
    }

    /**
     * Ruft den Wert der transportMode-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link AllPublicTransportModesEnumeration }
     *     
     */
    public AllPublicTransportModesEnumeration getTransportMode() {
        return transportMode;
    }

    /**
     * Legt den Wert der transportMode-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link AllPublicTransportModesEnumeration }
     *     
     */
    public void setTransportMode(AllPublicTransportModesEnumeration value) {
        this.transportMode = value;
    }

    /**
     * Ruft den Wert der publicCode-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link PublicCodeStructure }
     *     
     */
    public PublicCodeStructure getPublicCode() {
        return publicCode;
    }

    /**
     * Legt den Wert der publicCode-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link PublicCodeStructure }
     *     
     */
    public void setPublicCode(PublicCodeStructure value) {
        this.publicCode = value;
    }

    /**
     * Ruft den Wert der areas-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FlexibleStopPlaceVersionStructure.Areas }
     *     
     */
    public FlexibleStopPlaceVersionStructure.Areas getAreas() {
        return areas;
    }

    /**
     * Legt den Wert der areas-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FlexibleStopPlaceVersionStructure.Areas }
     *     
     */
    public void setAreas(FlexibleStopPlaceVersionStructure.Areas value) {
        this.areas = value;
    }

    /**
     * Ruft den Wert der lines-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link LineRefsRelStructure }
     *     
     */
    public LineRefsRelStructure getLines() {
        return lines;
    }

    /**
     * Legt den Wert der lines-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link LineRefsRelStructure }
     *     
     */
    public void setLines(LineRefsRelStructure value) {
        this.lines = value;
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
     *       &lt;choice maxOccurs="unbounded">
     *         &lt;element ref="{http://www.netex.org.uk/netex}FlexibleArea"/>
     *         &lt;element ref="{http://www.netex.org.uk/netex}FlexibleAreaRef"/>
     *         &lt;element ref="{http://www.netex.org.uk/netex}HailAndRideArea"/>
     *         &lt;element ref="{http://www.netex.org.uk/netex}HailAndRideAreaRef"/>
     *       &lt;/choice>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "flexibleAreaOrFlexibleAreaRefOrHailAndRideArea"
    })
    public static class Areas {

        @XmlElements({
            @XmlElement(name = "FlexibleArea", type = FlexibleArea.class),
            @XmlElement(name = "FlexibleAreaRef", type = FlexibleAreaRefStructure.class),
            @XmlElement(name = "HailAndRideArea", type = HailAndRideArea.class),
            @XmlElement(name = "HailAndRideAreaRef", type = HailAndRideAreaRefStructure.class)
        })
        protected List<Object> flexibleAreaOrFlexibleAreaRefOrHailAndRideArea;

        /**
         * Gets the value of the flexibleAreaOrFlexibleAreaRefOrHailAndRideArea property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the flexibleAreaOrFlexibleAreaRefOrHailAndRideArea property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getFlexibleAreaOrFlexibleAreaRefOrHailAndRideArea().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link FlexibleArea }
         * {@link FlexibleAreaRefStructure }
         * {@link HailAndRideArea }
         * {@link HailAndRideAreaRefStructure }
         * 
         * 
         */
        public List<Object> getFlexibleAreaOrFlexibleAreaRefOrHailAndRideArea() {
            if (flexibleAreaOrFlexibleAreaRefOrHailAndRideArea == null) {
                flexibleAreaOrFlexibleAreaRefOrHailAndRideArea = new ArrayList<Object>();
            }
            return this.flexibleAreaOrFlexibleAreaRefOrHailAndRideArea;
        }

    }

}
