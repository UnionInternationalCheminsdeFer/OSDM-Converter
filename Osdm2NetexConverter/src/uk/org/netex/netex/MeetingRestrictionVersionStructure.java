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
 * Type for MEETING RESTRICTION.
 * 
 * <p>Java-Klasse f�r MeetingRestriction_VersionStructure complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="MeetingRestriction_VersionStructure">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.netex.org.uk/netex}InfrastructureLinkRestriction_VersionStructure">
 *       &lt;group ref="{http://www.netex.org.uk/netex}MeetingRestrictionGroup"/>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MeetingRestriction_VersionStructure", propOrder = {
    "forVehicleTypeRef",
    "againstVehicleTypeRef"
})
@XmlSeeAlso({
    MeetingRestriction.class
})
public class MeetingRestrictionVersionStructure
    extends InfrastructureLinkRestrictionVersionStructure
{

    @XmlElement(name = "ForVehicleTypeRef")
    protected VehicleTypeRefStructure forVehicleTypeRef;
    @XmlElement(name = "AgainstVehicleTypeRef")
    protected TransportTypeRefStructure againstVehicleTypeRef;

    /**
     * Ruft den Wert der forVehicleTypeRef-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link VehicleTypeRefStructure }
     *     
     */
    public VehicleTypeRefStructure getForVehicleTypeRef() {
        return forVehicleTypeRef;
    }

    /**
     * Legt den Wert der forVehicleTypeRef-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link VehicleTypeRefStructure }
     *     
     */
    public void setForVehicleTypeRef(VehicleTypeRefStructure value) {
        this.forVehicleTypeRef = value;
    }

    /**
     * Ruft den Wert der againstVehicleTypeRef-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link TransportTypeRefStructure }
     *     
     */
    public TransportTypeRefStructure getAgainstVehicleTypeRef() {
        return againstVehicleTypeRef;
    }

    /**
     * Legt den Wert der againstVehicleTypeRef-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link TransportTypeRefStructure }
     *     
     */
    public void setAgainstVehicleTypeRef(TransportTypeRefStructure value) {
        this.againstVehicleTypeRef = value;
    }

}
