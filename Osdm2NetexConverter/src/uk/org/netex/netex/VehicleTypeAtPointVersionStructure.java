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
 * Type for a VEHICLE TYPE AT POINT.
 * 
 * <p>Java-Klasse f�r VehicleTypeAtPoint_VersionStructure complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="VehicleTypeAtPoint_VersionStructure">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.netex.org.uk/netex}NetworkRestriction_VersionStructure">
 *       &lt;group ref="{http://www.netex.org.uk/netex}VehicleTypeAtPointGroup"/>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VehicleTypeAtPoint_VersionStructure", propOrder = {
    "forVehicleTypeRef",
    "capacity"
})
@XmlSeeAlso({
    VehicleTypeAtPoint.class
})
public class VehicleTypeAtPointVersionStructure
    extends NetworkRestrictionVersionStructure
{

    @XmlElement(name = "ForVehicleTypeRef", required = true)
    protected TransportTypeRefStructure forVehicleTypeRef;
    @XmlElement(name = "Capacity")
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger capacity;

    /**
     * Ruft den Wert der forVehicleTypeRef-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link TransportTypeRefStructure }
     *     
     */
    public TransportTypeRefStructure getForVehicleTypeRef() {
        return forVehicleTypeRef;
    }

    /**
     * Legt den Wert der forVehicleTypeRef-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link TransportTypeRefStructure }
     *     
     */
    public void setForVehicleTypeRef(TransportTypeRefStructure value) {
        this.forVehicleTypeRef = value;
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
