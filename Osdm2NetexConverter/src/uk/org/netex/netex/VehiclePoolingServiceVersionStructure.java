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
 * Type for VEHICLE POOLING SERVICE.
 * 
 * <p>Java-Klasse f�r VehiclePoolingService_VersionStructure complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="VehiclePoolingService_VersionStructure">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.netex.org.uk/netex}CommonVehicleService_VersionStructure">
 *       &lt;sequence>
 *         &lt;group ref="{http://www.netex.org.uk/netex}VehiclePoolingServiceGroup"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VehiclePoolingService_VersionStructure", propOrder = {
    "vehiclePoolingRef",
    "poolingPolicyUrl"
})
@XmlSeeAlso({
    VehiclePoolingService.class,
    TaxiServiceVersionStructure.class,
    ChauffeuredVehicleServiceVersionStructure.class,
    CarPoolingServiceVersionStructure.class
})
public class VehiclePoolingServiceVersionStructure
    extends CommonVehicleServiceVersionStructure
{

    @XmlElement(name = "VehiclePoolingRef", required = true)
    protected VehiclePoolingModeOfOperationRefStructure vehiclePoolingRef;
    @XmlElement(name = "PoolingPolicyUrl")
    @XmlSchemaType(name = "anyURI")
    protected String poolingPolicyUrl;

    /**
     * Ruft den Wert der vehiclePoolingRef-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link VehiclePoolingModeOfOperationRefStructure }
     *     
     */
    public VehiclePoolingModeOfOperationRefStructure getVehiclePoolingRef() {
        return vehiclePoolingRef;
    }

    /**
     * Legt den Wert der vehiclePoolingRef-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link VehiclePoolingModeOfOperationRefStructure }
     *     
     */
    public void setVehiclePoolingRef(VehiclePoolingModeOfOperationRefStructure value) {
        this.vehiclePoolingRef = value;
    }

    /**
     * Ruft den Wert der poolingPolicyUrl-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPoolingPolicyUrl() {
        return poolingPolicyUrl;
    }

    /**
     * Legt den Wert der poolingPolicyUrl-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPoolingPolicyUrl(String value) {
        this.poolingPolicyUrl = value;
    }

}
