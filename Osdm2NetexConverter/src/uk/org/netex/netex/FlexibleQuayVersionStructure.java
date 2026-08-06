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


/**
 * Type for FLEXIBLE QUAY.
 * 
 * <p>Java-Klasse f�r FlexibleQuay_VersionStructure complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="FlexibleQuay_VersionStructure">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.netex.org.uk/netex}Place_VersionStructure">
 *       &lt;sequence>
 *         &lt;group ref="{http://www.netex.org.uk/netex}FlexibleQuayGroup"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FlexibleQuay_VersionStructure", propOrder = {
    "nameSuffix",
    "alternativeNames",
    "flexibleStopPlaceRef",
    "transportMode",
    "boardingUse",
    "alightingUse",
    "publicCode"
})
@XmlSeeAlso({
    FlexibleQuay.class,
    FlexibleAreaVersionStructure.class,
    HailAndRideAreaVersionStructure.class
})
public class FlexibleQuayVersionStructure
    extends PlaceVersionStructure
{

    @XmlElement(name = "NameSuffix")
    protected MultilingualString nameSuffix;
    protected AlternativeNamesRelStructure alternativeNames;
    @XmlElement(name = "FlexibleStopPlaceRef")
    protected FlexibleStopPlaceRefStructure flexibleStopPlaceRef;
    @XmlElement(name = "TransportMode")
    @XmlSchemaType(name = "NMTOKEN")
    protected AllPublicTransportModesEnumeration transportMode;
    @XmlElement(name = "BoardingUse", defaultValue = "true")
    protected Boolean boardingUse;
    @XmlElement(name = "AlightingUse", defaultValue = "true")
    protected Boolean alightingUse;
    @XmlElement(name = "PublicCode")
    protected PublicCodeStructure publicCode;

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
     * Ruft den Wert der flexibleStopPlaceRef-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FlexibleStopPlaceRefStructure }
     *     
     */
    public FlexibleStopPlaceRefStructure getFlexibleStopPlaceRef() {
        return flexibleStopPlaceRef;
    }

    /**
     * Legt den Wert der flexibleStopPlaceRef-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FlexibleStopPlaceRefStructure }
     *     
     */
    public void setFlexibleStopPlaceRef(FlexibleStopPlaceRefStructure value) {
        this.flexibleStopPlaceRef = value;
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
     * Ruft den Wert der boardingUse-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isBoardingUse() {
        return boardingUse;
    }

    /**
     * Legt den Wert der boardingUse-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setBoardingUse(Boolean value) {
        this.boardingUse = value;
    }

    /**
     * Ruft den Wert der alightingUse-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAlightingUse() {
        return alightingUse;
    }

    /**
     * Legt den Wert der alightingUse-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAlightingUse(Boolean value) {
        this.alightingUse = value;
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

}
