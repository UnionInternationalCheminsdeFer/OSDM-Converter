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
 * Type for a VEHICLE SCHEDULE FRAME.
 * 
 * <p>Java-Klasse f�r VehicleSchedule_VersionFrameStructure complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="VehicleSchedule_VersionFrameStructure">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.netex.org.uk/netex}Common_VersionFrameStructure">
 *       &lt;sequence>
 *         &lt;group ref="{http://www.netex.org.uk/netex}VehicleScheduleFrameGroup"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VehicleSchedule_VersionFrameStructure", propOrder = {
    "serviceCalendarFrameRef",
    "blocks",
    "coursesOfJourneys",
    "vehicleServices",
    "reliefOpportunities",
    "rechargingPlans"
})
@XmlSeeAlso({
    VehicleScheduleFrame.class
})
public class VehicleScheduleVersionFrameStructure
    extends CommonVersionFrameStructure
{

    @XmlElement(name = "ServiceCalendarFrameRef")
    protected ServiceCalendarFrameRef serviceCalendarFrameRef;
    protected BlocksInFrameRelStructure blocks;
    protected CoursesOfJourneysInFrameRelStructure coursesOfJourneys;
    protected VehicleServicesInFrameRelStructure vehicleServices;
    protected ReliefOpportunitiesInFrameRelStructure reliefOpportunities;
    protected RechargingPlansRelStructure rechargingPlans;

    /**
     * Ruft den Wert der serviceCalendarFrameRef-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ServiceCalendarFrameRef }
     *     
     */
    public ServiceCalendarFrameRef getServiceCalendarFrameRef() {
        return serviceCalendarFrameRef;
    }

    /**
     * Legt den Wert der serviceCalendarFrameRef-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ServiceCalendarFrameRef }
     *     
     */
    public void setServiceCalendarFrameRef(ServiceCalendarFrameRef value) {
        this.serviceCalendarFrameRef = value;
    }

    /**
     * Ruft den Wert der blocks-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BlocksInFrameRelStructure }
     *     
     */
    public BlocksInFrameRelStructure getBlocks() {
        return blocks;
    }

    /**
     * Legt den Wert der blocks-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BlocksInFrameRelStructure }
     *     
     */
    public void setBlocks(BlocksInFrameRelStructure value) {
        this.blocks = value;
    }

    /**
     * Ruft den Wert der coursesOfJourneys-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link CoursesOfJourneysInFrameRelStructure }
     *     
     */
    public CoursesOfJourneysInFrameRelStructure getCoursesOfJourneys() {
        return coursesOfJourneys;
    }

    /**
     * Legt den Wert der coursesOfJourneys-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link CoursesOfJourneysInFrameRelStructure }
     *     
     */
    public void setCoursesOfJourneys(CoursesOfJourneysInFrameRelStructure value) {
        this.coursesOfJourneys = value;
    }

    /**
     * Ruft den Wert der vehicleServices-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link VehicleServicesInFrameRelStructure }
     *     
     */
    public VehicleServicesInFrameRelStructure getVehicleServices() {
        return vehicleServices;
    }

    /**
     * Legt den Wert der vehicleServices-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link VehicleServicesInFrameRelStructure }
     *     
     */
    public void setVehicleServices(VehicleServicesInFrameRelStructure value) {
        this.vehicleServices = value;
    }

    /**
     * Ruft den Wert der reliefOpportunities-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ReliefOpportunitiesInFrameRelStructure }
     *     
     */
    public ReliefOpportunitiesInFrameRelStructure getReliefOpportunities() {
        return reliefOpportunities;
    }

    /**
     * Legt den Wert der reliefOpportunities-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ReliefOpportunitiesInFrameRelStructure }
     *     
     */
    public void setReliefOpportunities(ReliefOpportunitiesInFrameRelStructure value) {
        this.reliefOpportunities = value;
    }

    /**
     * Ruft den Wert der rechargingPlans-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link RechargingPlansRelStructure }
     *     
     */
    public RechargingPlansRelStructure getRechargingPlans() {
        return rechargingPlans;
    }

    /**
     * Legt den Wert der rechargingPlans-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link RechargingPlansRelStructure }
     *     
     */
    public void setRechargingPlans(RechargingPlansRelStructure value) {
        this.rechargingPlans = value;
    }

}
