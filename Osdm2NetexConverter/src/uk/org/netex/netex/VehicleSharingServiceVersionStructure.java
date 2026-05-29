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
import javax.xml.datatype.Duration;


/**
 * Type for VEHICLE SHARING SERVICE.
 * 
 * <p>Java-Klasse f�r VehicleSharingService_VersionStructure complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="VehicleSharingService_VersionStructure">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.netex.org.uk/netex}CommonVehicleService_VersionStructure">
 *       &lt;sequence>
 *         &lt;group ref="{http://www.netex.org.uk/netex}VehicleSharingServiceGroup"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VehicleSharingService_VersionStructure", propOrder = {
    "vehicleSharingRef",
    "sharingPolicyUrl",
    "minimumSharingPeriod",
    "maximumSharingPeriod",
    "floatingVehicles",
    "fleets"
})
@XmlSeeAlso({
    VehicleSharingService.class
})
public class VehicleSharingServiceVersionStructure
    extends CommonVehicleServiceVersionStructure
{

    @XmlElement(name = "VehicleSharingRef", required = true)
    protected VehicleSharingModeOfOperationRefStructure vehicleSharingRef;
    @XmlElement(name = "SharingPolicyUrl")
    @XmlSchemaType(name = "anyURI")
    protected String sharingPolicyUrl;
    @XmlElement(name = "MinimumSharingPeriod")
    protected Duration minimumSharingPeriod;
    @XmlElement(name = "MaximumSharingPeriod")
    protected Duration maximumSharingPeriod;
    @XmlElement(name = "FloatingVehicles", defaultValue = "false")
    protected Boolean floatingVehicles;
    protected FleetRefsRelStructure fleets;

    /**
     * Ruft den Wert der vehicleSharingRef-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link VehicleSharingModeOfOperationRefStructure }
     *     
     */
    public VehicleSharingModeOfOperationRefStructure getVehicleSharingRef() {
        return vehicleSharingRef;
    }

    /**
     * Legt den Wert der vehicleSharingRef-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link VehicleSharingModeOfOperationRefStructure }
     *     
     */
    public void setVehicleSharingRef(VehicleSharingModeOfOperationRefStructure value) {
        this.vehicleSharingRef = value;
    }

    /**
     * Ruft den Wert der sharingPolicyUrl-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSharingPolicyUrl() {
        return sharingPolicyUrl;
    }

    /**
     * Legt den Wert der sharingPolicyUrl-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSharingPolicyUrl(String value) {
        this.sharingPolicyUrl = value;
    }

    /**
     * Ruft den Wert der minimumSharingPeriod-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Duration }
     *     
     */
    public Duration getMinimumSharingPeriod() {
        return minimumSharingPeriod;
    }

    /**
     * Legt den Wert der minimumSharingPeriod-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Duration }
     *     
     */
    public void setMinimumSharingPeriod(Duration value) {
        this.minimumSharingPeriod = value;
    }

    /**
     * Ruft den Wert der maximumSharingPeriod-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Duration }
     *     
     */
    public Duration getMaximumSharingPeriod() {
        return maximumSharingPeriod;
    }

    /**
     * Legt den Wert der maximumSharingPeriod-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Duration }
     *     
     */
    public void setMaximumSharingPeriod(Duration value) {
        this.maximumSharingPeriod = value;
    }

    /**
     * Ruft den Wert der floatingVehicles-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isFloatingVehicles() {
        return floatingVehicles;
    }

    /**
     * Legt den Wert der floatingVehicles-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setFloatingVehicles(Boolean value) {
        this.floatingVehicles = value;
    }

    /**
     * Ruft den Wert der fleets-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FleetRefsRelStructure }
     *     
     */
    public FleetRefsRelStructure getFleets() {
        return fleets;
    }

    /**
     * Legt den Wert der fleets-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FleetRefsRelStructure }
     *     
     */
    public void setFleets(FleetRefsRelStructure value) {
        this.fleets = value;
    }

}
