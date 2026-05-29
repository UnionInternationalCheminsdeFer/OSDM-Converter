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
import jakarta.xml.bind.annotation.XmlType;


/**
 * Type for a list of VEHICLE POOLING DRIVER INFOs.
 * 
 * <p>Java-Klasse f�r vehiclePoolingDriverInfoRefs_RelStructure complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="vehiclePoolingDriverInfoRefs_RelStructure">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.netex.org.uk/netex}oneToManyRelationshipStructure">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.netex.org.uk/netex}VehiclePoolingDriverInfoRef"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "vehiclePoolingDriverInfoRefs_RelStructure", propOrder = {
    "vehiclePoolingDriverInfoRef"
})
public class VehiclePoolingDriverInfoRefsRelStructure
    extends OneToManyRelationshipStructure
{

    @XmlElement(name = "VehiclePoolingDriverInfoRef", required = true)
    protected VehiclePoolingDriverInfoRefStructure vehiclePoolingDriverInfoRef;

    /**
     * Ruft den Wert der vehiclePoolingDriverInfoRef-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link VehiclePoolingDriverInfoRefStructure }
     *     
     */
    public VehiclePoolingDriverInfoRefStructure getVehiclePoolingDriverInfoRef() {
        return vehiclePoolingDriverInfoRef;
    }

    /**
     * Legt den Wert der vehiclePoolingDriverInfoRef-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link VehiclePoolingDriverInfoRefStructure }
     *     
     */
    public void setVehiclePoolingDriverInfoRef(VehiclePoolingDriverInfoRefStructure value) {
        this.vehiclePoolingDriverInfoRef = value;
    }

}
