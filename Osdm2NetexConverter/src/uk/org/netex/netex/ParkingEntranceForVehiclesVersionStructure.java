//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// �nderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2026.05.22 um 10:24:00 AM CEST 
//


package uk.org.netex.netex;

import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElementRef;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Type for PARKING ENTRANCE.
 * 
 * <p>Java-Klasse f�r ParkingEntranceForVehicles__VersionStructure complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="ParkingEntranceForVehicles__VersionStructure">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.netex.org.uk/netex}SiteEntrance_VersionStructure">
 *       &lt;sequence>
 *         &lt;group ref="{http://www.netex.org.uk/netex}ParkingEntranceForVehiclesGroup"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ParkingEntranceForVehicles__VersionStructure", propOrder = {
    "modeOfOperationRef",
    "areas"
})
@XmlSeeAlso({
    ParkingEntranceForVehicles.class
})
public class ParkingEntranceForVehiclesVersionStructure
    extends SiteEntranceVersionStructure
{

    @XmlElementRef(name = "ModeOfOperationRef", namespace = "http://www.netex.org.uk/netex", type = JAXBElement.class, required = false)
    protected JAXBElement<? extends ModeOfOperationRefStructure> modeOfOperationRef;
    protected ParkingAreaRefsRelStructure areas;

    /**
     * Reference to MODE of OPERATION. +v1.2.2
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ModeOfOperationRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link AlternativeModeOfOperationRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link VehiclePoolingModeOfOperationRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link VehicleSharingModeOfOperationRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link ConventionalModeOfOperationRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link PersonalModeOfOperationRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link VehicleRentalModeOfOperationRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link FlexibleModeOfOperationRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link ScheduledModeOfOperationRefStructure }{@code >}
     *     
     */
    public JAXBElement<? extends ModeOfOperationRefStructure> getModeOfOperationRef() {
        return modeOfOperationRef;
    }

    /**
     * Legt den Wert der modeOfOperationRef-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ModeOfOperationRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link AlternativeModeOfOperationRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link VehiclePoolingModeOfOperationRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link VehicleSharingModeOfOperationRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link ConventionalModeOfOperationRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link PersonalModeOfOperationRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link VehicleRentalModeOfOperationRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link FlexibleModeOfOperationRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link ScheduledModeOfOperationRefStructure }{@code >}
     *     
     */
    public void setModeOfOperationRef(JAXBElement<? extends ModeOfOperationRefStructure> value) {
        this.modeOfOperationRef = value;
    }

    /**
     * Ruft den Wert der areas-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ParkingAreaRefsRelStructure }
     *     
     */
    public ParkingAreaRefsRelStructure getAreas() {
        return areas;
    }

    /**
     * Legt den Wert der areas-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ParkingAreaRefsRelStructure }
     *     
     */
    public void setAreas(ParkingAreaRefsRelStructure value) {
        this.areas = value;
    }

}
