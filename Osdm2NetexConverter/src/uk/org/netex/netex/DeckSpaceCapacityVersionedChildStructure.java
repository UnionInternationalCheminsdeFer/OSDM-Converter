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
 * Type for a DECK SPACE CAPACITY.
 * 
 * <p>Java-Klasse f�r DeckSpaceCapacity_VersionedChildStructure complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="DeckSpaceCapacity_VersionedChildStructure">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.netex.org.uk/netex}VersionedChildStructure">
 *       &lt;sequence>
 *         &lt;group ref="{http://www.netex.org.uk/netex}DeckSpaceCapacityGroup"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DeckSpaceCapacity_VersionedChildStructure", propOrder = {
    "name",
    "locatableSpotType",
    "typeOfLocatableSpotRef",
    "capacity"
})
@XmlSeeAlso({
    DeckSpaceCapacity.class
})
public class DeckSpaceCapacityVersionedChildStructure
    extends VersionedChildStructure
{

    @XmlElement(name = "Name")
    protected MultilingualString name;
    @XmlElement(name = "LocatableSpotType")
    @XmlSchemaType(name = "normalizedString")
    protected TypeOfLocatableSpotEnumeration locatableSpotType;
    @XmlElement(name = "TypeOfLocatableSpotRef")
    protected TypeOfLocatableSpotRefStructure typeOfLocatableSpotRef;
    @XmlElement(name = "Capacity")
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger capacity;

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
     * Ruft den Wert der locatableSpotType-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link TypeOfLocatableSpotEnumeration }
     *     
     */
    public TypeOfLocatableSpotEnumeration getLocatableSpotType() {
        return locatableSpotType;
    }

    /**
     * Legt den Wert der locatableSpotType-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeOfLocatableSpotEnumeration }
     *     
     */
    public void setLocatableSpotType(TypeOfLocatableSpotEnumeration value) {
        this.locatableSpotType = value;
    }

    /**
     * Ruft den Wert der typeOfLocatableSpotRef-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link TypeOfLocatableSpotRefStructure }
     *     
     */
    public TypeOfLocatableSpotRefStructure getTypeOfLocatableSpotRef() {
        return typeOfLocatableSpotRef;
    }

    /**
     * Legt den Wert der typeOfLocatableSpotRef-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeOfLocatableSpotRefStructure }
     *     
     */
    public void setTypeOfLocatableSpotRef(TypeOfLocatableSpotRefStructure value) {
        this.typeOfLocatableSpotRef = value;
    }

    /**
     * Ruft den Wert der capacity-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getCapacity() {
        return capacity;
    }

    /**
     * Legt den Wert der capacity-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setCapacity(BigInteger value) {
        this.capacity = value;
    }

}
