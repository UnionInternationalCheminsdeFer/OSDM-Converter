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
 * Type for DIRECTION.
 * 
 * <p>Java-Klasse f�r Direction_ValueStructure complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="Direction_ValueStructure">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.netex.org.uk/netex}TypeOfValue_VersionStructure">
 *       &lt;sequence>
 *         &lt;group ref="{http://www.netex.org.uk/netex}DirectionGroup"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Direction_ValueStructure", propOrder = {
    "externalDirectionRef",
    "directionType",
    "oppositeDirectionRef"
})
@XmlSeeAlso({
    Direction.class
})
public class DirectionValueStructure
    extends TypeOfValueVersionStructure
{

    @XmlElement(name = "ExternalDirectionRef")
    protected ExternalObjectRefStructure externalDirectionRef;
    @XmlElement(name = "DirectionType", defaultValue = "outbound")
    @XmlSchemaType(name = "normalizedString")
    protected DirectionTypeEnumeration directionType;
    @XmlElement(name = "OppositeDirectionRef")
    protected DirectionRefStructure oppositeDirectionRef;

    /**
     * Ruft den Wert der externalDirectionRef-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ExternalObjectRefStructure }
     *     
     */
    public ExternalObjectRefStructure getExternalDirectionRef() {
        return externalDirectionRef;
    }

    /**
     * Legt den Wert der externalDirectionRef-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ExternalObjectRefStructure }
     *     
     */
    public void setExternalDirectionRef(ExternalObjectRefStructure value) {
        this.externalDirectionRef = value;
    }

    /**
     * Ruft den Wert der directionType-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link DirectionTypeEnumeration }
     *     
     */
    public DirectionTypeEnumeration getDirectionType() {
        return directionType;
    }

    /**
     * Legt den Wert der directionType-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link DirectionTypeEnumeration }
     *     
     */
    public void setDirectionType(DirectionTypeEnumeration value) {
        this.directionType = value;
    }

    /**
     * Ruft den Wert der oppositeDirectionRef-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link DirectionRefStructure }
     *     
     */
    public DirectionRefStructure getOppositeDirectionRef() {
        return oppositeDirectionRef;
    }

    /**
     * Legt den Wert der oppositeDirectionRef-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link DirectionRefStructure }
     *     
     */
    public void setOppositeDirectionRef(DirectionRefStructure value) {
        this.oppositeDirectionRef = value;
    }

}
