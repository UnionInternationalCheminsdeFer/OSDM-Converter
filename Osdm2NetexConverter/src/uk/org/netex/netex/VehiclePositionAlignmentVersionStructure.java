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
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Type for a VEHICLE POSTION ALIGNMENT.
 * 
 * <p>Java-Klasse f�r VehiclePositionAlignment_VersionStructure complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="VehiclePositionAlignment_VersionStructure">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.netex.org.uk/netex}VersionedChildStructure">
 *       &lt;sequence>
 *         &lt;group ref="{http://www.netex.org.uk/netex}VehiclePositionAlignmentGroup"/>
 *       &lt;/sequence>
 *       &lt;attribute name="order" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VehiclePositionAlignment_VersionStructure", propOrder = {
    "vehicleStoppingPositionRef",
    "boardingPositionRef",
    "stopPlaceEntranceRef"
})
@XmlSeeAlso({
    VehiclePositionAlignment.class
})
public class VehiclePositionAlignmentVersionStructure
    extends VersionedChildStructure
{

    @XmlElement(name = "VehicleStoppingPositionRef")
    protected VehicleStoppingPositionRefStructure vehicleStoppingPositionRef;
    @XmlElement(name = "BoardingPositionRef")
    protected BoardingPositionRefStructure boardingPositionRef;
    @XmlElement(name = "StopPlaceEntranceRef")
    protected StopPlaceEntranceRefStructure stopPlaceEntranceRef;
    @XmlAttribute(name = "order")
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger order;

    /**
     * Ruft den Wert der vehicleStoppingPositionRef-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link VehicleStoppingPositionRefStructure }
     *     
     */
    public VehicleStoppingPositionRefStructure getVehicleStoppingPositionRef() {
        return vehicleStoppingPositionRef;
    }

    /**
     * Legt den Wert der vehicleStoppingPositionRef-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link VehicleStoppingPositionRefStructure }
     *     
     */
    public void setVehicleStoppingPositionRef(VehicleStoppingPositionRefStructure value) {
        this.vehicleStoppingPositionRef = value;
    }

    /**
     * Ruft den Wert der boardingPositionRef-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BoardingPositionRefStructure }
     *     
     */
    public BoardingPositionRefStructure getBoardingPositionRef() {
        return boardingPositionRef;
    }

    /**
     * Legt den Wert der boardingPositionRef-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BoardingPositionRefStructure }
     *     
     */
    public void setBoardingPositionRef(BoardingPositionRefStructure value) {
        this.boardingPositionRef = value;
    }

    /**
     * Ruft den Wert der stopPlaceEntranceRef-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link StopPlaceEntranceRefStructure }
     *     
     */
    public StopPlaceEntranceRefStructure getStopPlaceEntranceRef() {
        return stopPlaceEntranceRef;
    }

    /**
     * Legt den Wert der stopPlaceEntranceRef-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link StopPlaceEntranceRefStructure }
     *     
     */
    public void setStopPlaceEntranceRef(StopPlaceEntranceRefStructure value) {
        this.stopPlaceEntranceRef = value;
    }

    /**
     * Ruft den Wert der order-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getOrder() {
        return order;
    }

    /**
     * Legt den Wert der order-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setOrder(BigInteger value) {
        this.order = value;
    }

}
