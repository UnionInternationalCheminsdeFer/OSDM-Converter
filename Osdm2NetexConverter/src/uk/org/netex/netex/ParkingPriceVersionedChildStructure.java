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
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Type for a PARKING TARIFF PRICEs.
 * 
 * <p>Java-Klasse f�r ParkingPrice_VersionedChildStructure complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="ParkingPrice_VersionedChildStructure">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.netex.org.uk/netex}FarePrice_VersionedChildStructure">
 *       &lt;sequence>
 *         &lt;group ref="{http://www.netex.org.uk/netex}ParkingPriceGroup"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ParkingPrice_VersionedChildStructure", propOrder = {
    "parkingTariffRef",
    "parkingChargeBand"
})
@XmlSeeAlso({
    ParkingPrice.class
})
public class ParkingPriceVersionedChildStructure
    extends FarePriceVersionedChildStructure
{

    @XmlElement(name = "ParkingTariffRef")
    protected ParkingTariffRefStructure parkingTariffRef;
    @XmlElement(name = "ParkingChargeBand")
    protected ParkingChargeBand parkingChargeBand;

    /**
     * Ruft den Wert der parkingTariffRef-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ParkingTariffRefStructure }
     *     
     */
    public ParkingTariffRefStructure getParkingTariffRef() {
        return parkingTariffRef;
    }

    /**
     * Legt den Wert der parkingTariffRef-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ParkingTariffRefStructure }
     *     
     */
    public void setParkingTariffRef(ParkingTariffRefStructure value) {
        this.parkingTariffRef = value;
    }

    /**
     * Ruft den Wert der parkingChargeBand-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ParkingChargeBand }
     *     
     */
    public ParkingChargeBand getParkingChargeBand() {
        return parkingChargeBand;
    }

    /**
     * Legt den Wert der parkingChargeBand-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ParkingChargeBand }
     *     
     */
    public void setParkingChargeBand(ParkingChargeBand value) {
        this.parkingChargeBand = value;
    }

}
