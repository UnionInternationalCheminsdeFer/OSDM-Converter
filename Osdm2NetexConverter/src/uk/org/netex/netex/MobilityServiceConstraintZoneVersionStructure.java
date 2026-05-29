//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// �nderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2026.05.22 um 10:24:00 AM CEST 
//


package uk.org.netex.netex;

import java.math.BigDecimal;
import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlElementRef;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Type for MOBILITY SERVICE CONSTRAINT ZONE restricts id.
 * 
 * <p>Java-Klasse f�r MobilityServiceConstraintZone_VersionStructure complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="MobilityServiceConstraintZone_VersionStructure">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.netex.org.uk/netex}Zone_VersionStructure">
 *       &lt;sequence>
 *         &lt;group ref="{http://www.netex.org.uk/netex}MobilityServiceConstraintZoneGroup"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MobilityServiceConstraintZone_VersionStructure", propOrder = {
    "ruleApplicability",
    "zoneUse",
    "maximumSpeed",
    "mobilityServiceRef",
    "vehicleRestrictions"
})
@XmlSeeAlso({
    MobilityServiceConstraintZone.class
})
public class MobilityServiceConstraintZoneVersionStructure
    extends ZoneVersionStructure
{

    @XmlElement(name = "RuleApplicability", defaultValue = "inside")
    @XmlSchemaType(name = "string")
    protected ZoneRuleApplicabilityEnumeration ruleApplicability;
    @XmlElement(name = "ZoneUse")
    @XmlSchemaType(name = "string")
    protected TransportZoneUseEnumeration zoneUse;
    @XmlElement(name = "MaximumSpeed")
    protected BigDecimal maximumSpeed;
    @XmlElementRef(name = "MobilityServiceRef", namespace = "http://www.netex.org.uk/netex", type = JAXBElement.class, required = false)
    protected JAXBElement<? extends MobilityServiceRefStructure> mobilityServiceRef;
    protected VehicleTypeZoneRestrictionsRelStructure vehicleRestrictions;

    /**
     * Ruft den Wert der ruleApplicability-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ZoneRuleApplicabilityEnumeration }
     *     
     */
    public ZoneRuleApplicabilityEnumeration getRuleApplicability() {
        return ruleApplicability;
    }

    /**
     * Legt den Wert der ruleApplicability-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ZoneRuleApplicabilityEnumeration }
     *     
     */
    public void setRuleApplicability(ZoneRuleApplicabilityEnumeration value) {
        this.ruleApplicability = value;
    }

    /**
     * Ruft den Wert der zoneUse-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link TransportZoneUseEnumeration }
     *     
     */
    public TransportZoneUseEnumeration getZoneUse() {
        return zoneUse;
    }

    /**
     * Legt den Wert der zoneUse-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link TransportZoneUseEnumeration }
     *     
     */
    public void setZoneUse(TransportZoneUseEnumeration value) {
        this.zoneUse = value;
    }

    /**
     * Ruft den Wert der maximumSpeed-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMaximumSpeed() {
        return maximumSpeed;
    }

    /**
     * Legt den Wert der maximumSpeed-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMaximumSpeed(BigDecimal value) {
        this.maximumSpeed = value;
    }

    /**
     * Ruft den Wert der mobilityServiceRef-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MobilityServiceRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link VehicleSharingServiceRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link OnlineServiceRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link ChauffeuredVehicleServiceRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link VehicleRentalServiceRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link CarPoolingServiceRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link CommonVehicleServiceRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link VehiclePoolingServiceRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link TaxiServiceRefStructure }{@code >}
     *     
     */
    public JAXBElement<? extends MobilityServiceRefStructure> getMobilityServiceRef() {
        return mobilityServiceRef;
    }

    /**
     * Legt den Wert der mobilityServiceRef-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MobilityServiceRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link VehicleSharingServiceRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link OnlineServiceRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link ChauffeuredVehicleServiceRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link VehicleRentalServiceRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link CarPoolingServiceRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link CommonVehicleServiceRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link VehiclePoolingServiceRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link TaxiServiceRefStructure }{@code >}
     *     
     */
    public void setMobilityServiceRef(JAXBElement<? extends MobilityServiceRefStructure> value) {
        this.mobilityServiceRef = value;
    }

    /**
     * Ruft den Wert der vehicleRestrictions-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link VehicleTypeZoneRestrictionsRelStructure }
     *     
     */
    public VehicleTypeZoneRestrictionsRelStructure getVehicleRestrictions() {
        return vehicleRestrictions;
    }

    /**
     * Legt den Wert der vehicleRestrictions-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link VehicleTypeZoneRestrictionsRelStructure }
     *     
     */
    public void setVehicleRestrictions(VehicleTypeZoneRestrictionsRelStructure value) {
        this.vehicleRestrictions = value;
    }

}
