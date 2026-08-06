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
 * Type for a VEHICLE RENTAL MODE OF OPERATION.
 * 
 * <p>Java-Klasse f�r VehicleRentalModeOfOperation_ValueStructure complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="VehicleRentalModeOfOperation_ValueStructure">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.netex.org.uk/netex}AlternativeModeOfOperation_ValueStructure">
 *       &lt;group ref="{http://www.netex.org.uk/netex}VehicleRentalModeOfOperationGroup"/>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VehicleRentalModeOfOperation_ValueStructure", propOrder = {
    "vehicleRentalType"
})
@XmlSeeAlso({
    VehicleRental.class
})
public class VehicleRentalModeOfOperationValueStructure
    extends AlternativeModeOfOperationValueStructure
{

    @XmlElement(name = "VehicleRentalType")
    @XmlSchemaType(name = "NMTOKEN")
    protected VehicleRentalTypeEnumeration vehicleRentalType;

    /**
     * Ruft den Wert der vehicleRentalType-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link VehicleRentalTypeEnumeration }
     *     
     */
    public VehicleRentalTypeEnumeration getVehicleRentalType() {
        return vehicleRentalType;
    }

    /**
     * Legt den Wert der vehicleRentalType-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link VehicleRentalTypeEnumeration }
     *     
     */
    public void setVehicleRentalType(VehicleRentalTypeEnumeration value) {
        this.vehicleRentalType = value;
    }

}
