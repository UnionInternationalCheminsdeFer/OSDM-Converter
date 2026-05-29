//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// �nderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2026.05.22 um 10:24:00 AM CEST 
//


package uk.org.netex.netex;

import java.math.BigInteger;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Type for a SPOT AFFINITY.
 * 
 * <p>Java-Klasse f�r SpotAffinity_VersionStructure complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="SpotAffinity_VersionStructure">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.netex.org.uk/netex}DataManagedObjectStructure">
 *       &lt;sequence>
 *         &lt;group ref="{http://www.netex.org.uk/netex}SpotAffinityGroup"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SpotAffinity_VersionStructure", propOrder = {
    "name",
    "description",
    "spotAffinityType",
    "maximumSpots",
    "members"
})
@XmlSeeAlso({
    SpotAffinity.class
})
public class SpotAffinityVersionStructure
    extends DataManagedObjectStructure
{

    @XmlElement(name = "Name")
    protected MultilingualString name;
    @XmlElement(name = "Description")
    protected MultilingualString description;
    @XmlElement(name = "SpotAffinityType")
    @XmlSchemaType(name = "normalizedString")
    protected SpotAffinityTypeEnumeration spotAffinityType;
    @XmlElement(name = "MaximumSpots")
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger maximumSpots;
    protected LocatableSpotRefsRelStructure members;

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
     * Ruft den Wert der description-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link MultilingualString }
     *     
     */
    public MultilingualString getDescription() {
        return description;
    }

    /**
     * Legt den Wert der description-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link MultilingualString }
     *     
     */
    public void setDescription(MultilingualString value) {
        this.description = value;
    }

    /**
     * Ruft den Wert der spotAffinityType-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link SpotAffinityTypeEnumeration }
     *     
     */
    public SpotAffinityTypeEnumeration getSpotAffinityType() {
        return spotAffinityType;
    }

    /**
     * Legt den Wert der spotAffinityType-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link SpotAffinityTypeEnumeration }
     *     
     */
    public void setSpotAffinityType(SpotAffinityTypeEnumeration value) {
        this.spotAffinityType = value;
    }

    /**
     * Ruft den Wert der maximumSpots-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getMaximumSpots() {
        return maximumSpots;
    }

    /**
     * Legt den Wert der maximumSpots-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setMaximumSpots(BigInteger value) {
        this.maximumSpots = value;
    }

    /**
     * Ruft den Wert der members-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link LocatableSpotRefsRelStructure }
     *     
     */
    public LocatableSpotRefsRelStructure getMembers() {
        return members;
    }

    /**
     * Legt den Wert der members-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link LocatableSpotRefsRelStructure }
     *     
     */
    public void setMembers(LocatableSpotRefsRelStructure value) {
        this.members = value;
    }

}
