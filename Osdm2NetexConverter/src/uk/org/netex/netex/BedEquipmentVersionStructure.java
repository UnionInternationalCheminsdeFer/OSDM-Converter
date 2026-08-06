//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// �nderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2026.05.22 um 10:24:00 AM CEST 
//


package uk.org.netex.netex;

import java.math.BigDecimal;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Type for a BED EQUIPMENT.
 * 
 * <p>Java-Klasse f�r BedEquipment_VersionStructure complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="BedEquipment_VersionStructure">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.netex.org.uk/netex}SpotEquipment_VersionStructure">
 *       &lt;sequence>
 *         &lt;group ref="{http://www.netex.org.uk/netex}BedEquipmentGroup"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BedEquipment_VersionStructure", propOrder = {
    "bedType",
    "isStowable",
    "headroom",
    "bedLength"
})
@XmlSeeAlso({
    BedEquipment.class
})
public class BedEquipmentVersionStructure
    extends SpotEquipmentVersionStructure
{

    @XmlElement(name = "BedType")
    @XmlSchemaType(name = "normalizedString")
    protected BedTypeEnumeration bedType;
    @XmlElement(name = "IsStowable")
    protected Boolean isStowable;
    @XmlElement(name = "Headroom")
    protected BigDecimal headroom;
    @XmlElement(name = "BedLength")
    protected BigDecimal bedLength;

    /**
     * Ruft den Wert der bedType-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BedTypeEnumeration }
     *     
     */
    public BedTypeEnumeration getBedType() {
        return bedType;
    }

    /**
     * Legt den Wert der bedType-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BedTypeEnumeration }
     *     
     */
    public void setBedType(BedTypeEnumeration value) {
        this.bedType = value;
    }

    /**
     * Ruft den Wert der isStowable-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsStowable() {
        return isStowable;
    }

    /**
     * Legt den Wert der isStowable-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsStowable(Boolean value) {
        this.isStowable = value;
    }

    /**
     * Ruft den Wert der headroom-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getHeadroom() {
        return headroom;
    }

    /**
     * Legt den Wert der headroom-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setHeadroom(BigDecimal value) {
        this.headroom = value;
    }

    /**
     * Ruft den Wert der bedLength-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getBedLength() {
        return bedLength;
    }

    /**
     * Legt den Wert der bedLength-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setBedLength(BigDecimal value) {
        this.bedLength = value;
    }

}
