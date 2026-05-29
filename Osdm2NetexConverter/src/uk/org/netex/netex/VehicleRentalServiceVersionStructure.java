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
 * Type for VEHICLE RENTAL SERVICE.
 * 
 * <p>Java-Klasse f�r VehicleRentalService_VersionStructure complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="VehicleRentalService_VersionStructure">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.netex.org.uk/netex}CommonVehicleService_VersionStructure">
 *       &lt;sequence>
 *         &lt;group ref="{http://www.netex.org.uk/netex}VehicleRentalServiceGroup"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VehicleRentalService_VersionStructure", propOrder = {
    "vehicleRentalRef",
    "maximumRentalPeriod",
    "minimumRentalPeriod",
    "rentalPolicyUrl",
    "fleets"
})
@XmlSeeAlso({
    VehicleRentalService.class
})
public class VehicleRentalServiceVersionStructure
    extends CommonVehicleServiceVersionStructure
{

    @XmlElement(name = "VehicleRentalRef", required = true)
    protected VehicleRentalModeOfOperationRefStructure vehicleRentalRef;
    @XmlElement(name = "MaximumRentalPeriod")
    protected Duration maximumRentalPeriod;
    @XmlElement(name = "MinimumRentalPeriod")
    protected Duration minimumRentalPeriod;
    @XmlElement(name = "RentalPolicyUrl")
    @XmlSchemaType(name = "anyURI")
    protected String rentalPolicyUrl;
    protected FleetRefsRelStructure fleets;

    /**
     * Ruft den Wert der vehicleRentalRef-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link VehicleRentalModeOfOperationRefStructure }
     *     
     */
    public VehicleRentalModeOfOperationRefStructure getVehicleRentalRef() {
        return vehicleRentalRef;
    }

    /**
     * Legt den Wert der vehicleRentalRef-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link VehicleRentalModeOfOperationRefStructure }
     *     
     */
    public void setVehicleRentalRef(VehicleRentalModeOfOperationRefStructure value) {
        this.vehicleRentalRef = value;
    }

    /**
     * Ruft den Wert der maximumRentalPeriod-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Duration }
     *     
     */
    public Duration getMaximumRentalPeriod() {
        return maximumRentalPeriod;
    }

    /**
     * Legt den Wert der maximumRentalPeriod-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Duration }
     *     
     */
    public void setMaximumRentalPeriod(Duration value) {
        this.maximumRentalPeriod = value;
    }

    /**
     * Ruft den Wert der minimumRentalPeriod-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Duration }
     *     
     */
    public Duration getMinimumRentalPeriod() {
        return minimumRentalPeriod;
    }

    /**
     * Legt den Wert der minimumRentalPeriod-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Duration }
     *     
     */
    public void setMinimumRentalPeriod(Duration value) {
        this.minimumRentalPeriod = value;
    }

    /**
     * Ruft den Wert der rentalPolicyUrl-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRentalPolicyUrl() {
        return rentalPolicyUrl;
    }

    /**
     * Legt den Wert der rentalPolicyUrl-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRentalPolicyUrl(String value) {
        this.rentalPolicyUrl = value;
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
