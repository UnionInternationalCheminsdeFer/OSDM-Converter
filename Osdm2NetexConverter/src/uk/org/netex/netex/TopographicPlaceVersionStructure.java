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
import jakarta.xml.bind.annotation.adapters.NormalizedStringAdapter;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * Type for a TOPOGRAPHIC PLACE.
 * 
 * <p>Java-Klasse f�r TopographicPlace_VersionStructure complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="TopographicPlace_VersionStructure">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.netex.org.uk/netex}Place_VersionStructure">
 *       &lt;sequence>
 *         &lt;group ref="{http://www.netex.org.uk/netex}TopographicDescriptiveGroup"/>
 *         &lt;group ref="{http://www.netex.org.uk/netex}TopographicRelationGroup"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TopographicPlace_VersionStructure", propOrder = {
    "isoCode",
    "descriptor",
    "alternativeDescriptors",
    "topographicPlaceType",
    "placeCentre",
    "postCode",
    "countryRef",
    "otherCountries",
    "parentTopographicPlaceRef",
    "adjacentPlaces",
    "containedIn",
    "accesses"
})
@XmlSeeAlso({
    TopographicPlace.class
})
public class TopographicPlaceVersionStructure
    extends PlaceVersionStructure
{

    @XmlElement(name = "IsoCode")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String isoCode;
    @XmlElement(name = "Descriptor", required = true)
    protected TopographicPlaceDescriptorVersionedChildStructure descriptor;
    protected TopographicPlaceVersionStructure.AlternativeDescriptors alternativeDescriptors;
    @XmlElement(name = "TopographicPlaceType")
    @XmlSchemaType(name = "NMTOKEN")
    protected TopographicPlaceTypeEnumeration topographicPlaceType;
    @XmlElement(name = "PlaceCentre", defaultValue = "false")
    protected Boolean placeCentre;
    @XmlElement(name = "PostCode")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String postCode;
    @XmlElement(name = "CountryRef")
    protected CountryRef countryRef;
    protected CountryRefsRelStructure otherCountries;
    @XmlElement(name = "ParentTopographicPlaceRef")
    protected TopographicPlaceRefStructure parentTopographicPlaceRef;
    protected TopographicPlaceRefsRelStructure adjacentPlaces;
    protected TopographicPlaceRefsRelStructure containedIn;
    protected AccessesRelStructure accesses;

    /**
     * Ruft den Wert der isoCode-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIsoCode() {
        return isoCode;
    }

    /**
     * Legt den Wert der isoCode-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIsoCode(String value) {
        this.isoCode = value;
    }

    /**
     * Ruft den Wert der descriptor-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link TopographicPlaceDescriptorVersionedChildStructure }
     *     
     */
    public TopographicPlaceDescriptorVersionedChildStructure getDescriptor() {
        return descriptor;
    }

    /**
     * Legt den Wert der descriptor-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link TopographicPlaceDescriptorVersionedChildStructure }
     *     
     */
    public void setDescriptor(TopographicPlaceDescriptorVersionedChildStructure value) {
        this.descriptor = value;
    }

    /**
     * Ruft den Wert der alternativeDescriptors-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link TopographicPlaceVersionStructure.AlternativeDescriptors }
     *     
     */
    public TopographicPlaceVersionStructure.AlternativeDescriptors getAlternativeDescriptors() {
        return alternativeDescriptors;
    }

    /**
     * Legt den Wert der alternativeDescriptors-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link TopographicPlaceVersionStructure.AlternativeDescriptors }
     *     
     */
    public void setAlternativeDescriptors(TopographicPlaceVersionStructure.AlternativeDescriptors value) {
        this.alternativeDescriptors = value;
    }

    /**
     * Ruft den Wert der topographicPlaceType-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link TopographicPlaceTypeEnumeration }
     *     
     */
    public TopographicPlaceTypeEnumeration getTopographicPlaceType() {
        return topographicPlaceType;
    }

    /**
     * Legt den Wert der topographicPlaceType-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link TopographicPlaceTypeEnumeration }
     *     
     */
    public void setTopographicPlaceType(TopographicPlaceTypeEnumeration value) {
        this.topographicPlaceType = value;
    }

    /**
     * Ruft den Wert der placeCentre-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPlaceCentre() {
        return placeCentre;
    }

    /**
     * Legt den Wert der placeCentre-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPlaceCentre(Boolean value) {
        this.placeCentre = value;
    }

    /**
     * Ruft den Wert der postCode-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPostCode() {
        return postCode;
    }

    /**
     * Legt den Wert der postCode-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPostCode(String value) {
        this.postCode = value;
    }

    /**
     * Ruft den Wert der countryRef-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link CountryRef }
     *     
     */
    public CountryRef getCountryRef() {
        return countryRef;
    }

    /**
     * Legt den Wert der countryRef-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link CountryRef }
     *     
     */
    public void setCountryRef(CountryRef value) {
        this.countryRef = value;
    }

    /**
     * Ruft den Wert der otherCountries-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link CountryRefsRelStructure }
     *     
     */
    public CountryRefsRelStructure getOtherCountries() {
        return otherCountries;
    }

    /**
     * Legt den Wert der otherCountries-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link CountryRefsRelStructure }
     *     
     */
    public void setOtherCountries(CountryRefsRelStructure value) {
        this.otherCountries = value;
    }

    /**
     * Ruft den Wert der parentTopographicPlaceRef-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link TopographicPlaceRefStructure }
     *     
     */
    public TopographicPlaceRefStructure getParentTopographicPlaceRef() {
        return parentTopographicPlaceRef;
    }

    /**
     * Legt den Wert der parentTopographicPlaceRef-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link TopographicPlaceRefStructure }
     *     
     */
    public void setParentTopographicPlaceRef(TopographicPlaceRefStructure value) {
        this.parentTopographicPlaceRef = value;
    }

    /**
     * Ruft den Wert der adjacentPlaces-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link TopographicPlaceRefsRelStructure }
     *     
     */
    public TopographicPlaceRefsRelStructure getAdjacentPlaces() {
        return adjacentPlaces;
    }

    /**
     * Legt den Wert der adjacentPlaces-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link TopographicPlaceRefsRelStructure }
     *     
     */
    public void setAdjacentPlaces(TopographicPlaceRefsRelStructure value) {
        this.adjacentPlaces = value;
    }

    /**
     * Ruft den Wert der containedIn-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link TopographicPlaceRefsRelStructure }
     *     
     */
    public TopographicPlaceRefsRelStructure getContainedIn() {
        return containedIn;
    }

    /**
     * Legt den Wert der containedIn-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link TopographicPlaceRefsRelStructure }
     *     
     */
    public void setContainedIn(TopographicPlaceRefsRelStructure value) {
        this.containedIn = value;
    }

    /**
     * Ruft den Wert der accesses-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link AccessesRelStructure }
     *     
     */
    public AccessesRelStructure getAccesses() {
        return accesses;
    }

    /**
     * Legt den Wert der accesses-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link AccessesRelStructure }
     *     
     */
    public void setAccesses(AccessesRelStructure value) {
        this.accesses = value;
    }


    /**
     * <p>Java-Klasse f�r anonymous complex type.
     * 
     * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;extension base="{http://www.netex.org.uk/netex}topographicPlaceDescriptors_RelStructure">
     *     &lt;/extension>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class AlternativeDescriptors
        extends TopographicPlaceDescriptorsRelStructure
    {


    }

}
