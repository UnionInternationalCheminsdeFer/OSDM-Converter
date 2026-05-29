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
import jakarta.xml.bind.annotation.XmlType;


/**
 * Used to specify that a travel group has booked a section of the vehicle for a part of the journey, and if so under what name. (since SIRI 2.1)
 * 
 * <p>Java-Klasse f�r GroupReservationStructure complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="GroupReservationStructure">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="NameOfGroup" type="{http://www.netex.org.uk/netex}MultilingualString"/>
 *         &lt;element name="NumberOfReservedSeats" type="{http://www.netex.org.uk/netex}NumberOfPassengers"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GroupReservationStructure", propOrder = {
    "nameOfGroup",
    "numberOfReservedSeats"
})
public class GroupReservationStructure {

    @XmlElement(name = "NameOfGroup", required = true)
    protected MultilingualString nameOfGroup;
    @XmlElement(name = "NumberOfReservedSeats", required = true)
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger numberOfReservedSeats;

    /**
     * Ruft den Wert der nameOfGroup-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link MultilingualString }
     *     
     */
    public MultilingualString getNameOfGroup() {
        return nameOfGroup;
    }

    /**
     * Legt den Wert der nameOfGroup-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link MultilingualString }
     *     
     */
    public void setNameOfGroup(MultilingualString value) {
        this.nameOfGroup = value;
    }

    /**
     * Ruft den Wert der numberOfReservedSeats-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getNumberOfReservedSeats() {
        return numberOfReservedSeats;
    }

    /**
     * Legt den Wert der numberOfReservedSeats-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setNumberOfReservedSeats(BigInteger value) {
        this.numberOfReservedSeats = value;
    }

}
