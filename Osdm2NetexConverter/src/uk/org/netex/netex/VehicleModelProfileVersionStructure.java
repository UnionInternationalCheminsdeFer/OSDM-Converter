//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// �nderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2026.05.22 um 10:24:00 AM CEST 
//


package uk.org.netex.netex;

import java.math.BigDecimal;
import java.math.BigInteger;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Type for a VEHICLE MODEL PROFILE.
 * 
 * <p>Java-Klasse f�r VehicleModelProfile_VersionStructure complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="VehicleModelProfile_VersionStructure">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.netex.org.uk/netex}DataManagedObjectStructure">
 *       &lt;sequence>
 *         &lt;group ref="{http://www.netex.org.uk/netex}VehicleModelProfileGroup"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VehicleModelProfile_VersionStructure", propOrder = {
    "name",
    "numberOfGears",
    "childSeat",
    "rangeBetweenRefuelling",
    "isPortable"
})
@XmlSeeAlso({
    VehicleModelProfile.class,
    CarModelProfileVersionStructure.class,
    CycleModelProfileVersionStructure.class
})
public abstract class VehicleModelProfileVersionStructure
    extends DataManagedObjectStructure
{

    @XmlElement(name = "Name")
    protected MultilingualString name;
    @XmlElement(name = "NumberOfGears")
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger numberOfGears;
    @XmlElement(name = "ChildSeat")
    @XmlSchemaType(name = "normalizedString")
    protected ChildSeatEnumeration childSeat;
    @XmlElement(name = "RangeBetweenRefuelling")
    protected BigDecimal rangeBetweenRefuelling;
    @XmlElement(name = "IsPortable")
    protected Boolean isPortable;

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
     * Ruft den Wert der numberOfGears-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getNumberOfGears() {
        return numberOfGears;
    }

    /**
     * Legt den Wert der numberOfGears-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setNumberOfGears(BigInteger value) {
        this.numberOfGears = value;
    }

    /**
     * Ruft den Wert der childSeat-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ChildSeatEnumeration }
     *     
     */
    public ChildSeatEnumeration getChildSeat() {
        return childSeat;
    }

    /**
     * Legt den Wert der childSeat-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ChildSeatEnumeration }
     *     
     */
    public void setChildSeat(ChildSeatEnumeration value) {
        this.childSeat = value;
    }

    /**
     * Ruft den Wert der rangeBetweenRefuelling-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getRangeBetweenRefuelling() {
        return rangeBetweenRefuelling;
    }

    /**
     * Legt den Wert der rangeBetweenRefuelling-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setRangeBetweenRefuelling(BigDecimal value) {
        this.rangeBetweenRefuelling = value;
    }

    /**
     * Ruft den Wert der isPortable-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsPortable() {
        return isPortable;
    }

    /**
     * Legt den Wert der isPortable-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsPortable(Boolean value) {
        this.isPortable = value;
    }

}
