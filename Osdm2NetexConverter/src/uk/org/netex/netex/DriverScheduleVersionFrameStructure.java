//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// �nderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2026.05.22 um 10:24:00 AM CEST 
//


package uk.org.netex.netex;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Type for a DRIVER SCHEDULE FRAME.
 * 
 * <p>Java-Klasse f�r DriverSchedule_VersionFrameStructure complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="DriverSchedule_VersionFrameStructure">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.netex.org.uk/netex}Common_VersionFrameStructure">
 *       &lt;sequence>
 *         &lt;group ref="{http://www.netex.org.uk/netex}DriverScheduleFrameGroup"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DriverSchedule_VersionFrameStructure", propOrder = {
    "duties",
    "dutyParts",
    "driverTrips"
})
@XmlSeeAlso({
    DriverScheduleFrame.class
})
public class DriverScheduleVersionFrameStructure
    extends CommonVersionFrameStructure
{

    protected DutiesInFrameRelStructure duties;
    protected DriverScheduleVersionFrameStructure.DutyParts dutyParts;
    protected DriverTripsInFrameRelStructure driverTrips;

    /**
     * Ruft den Wert der duties-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link DutiesInFrameRelStructure }
     *     
     */
    public DutiesInFrameRelStructure getDuties() {
        return duties;
    }

    /**
     * Legt den Wert der duties-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link DutiesInFrameRelStructure }
     *     
     */
    public void setDuties(DutiesInFrameRelStructure value) {
        this.duties = value;
    }

    /**
     * Ruft den Wert der dutyParts-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link DriverScheduleVersionFrameStructure.DutyParts }
     *     
     */
    public DriverScheduleVersionFrameStructure.DutyParts getDutyParts() {
        return dutyParts;
    }

    /**
     * Legt den Wert der dutyParts-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link DriverScheduleVersionFrameStructure.DutyParts }
     *     
     */
    public void setDutyParts(DriverScheduleVersionFrameStructure.DutyParts value) {
        this.dutyParts = value;
    }

    /**
     * Ruft den Wert der driverTrips-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link DriverTripsInFrameRelStructure }
     *     
     */
    public DriverTripsInFrameRelStructure getDriverTrips() {
        return driverTrips;
    }

    /**
     * Legt den Wert der driverTrips-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link DriverTripsInFrameRelStructure }
     *     
     */
    public void setDriverTrips(DriverTripsInFrameRelStructure value) {
        this.driverTrips = value;
    }


    /**
     * <p>Java-Klasse f�r anonymous complex type.
     * 
     * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;extension base="{http://www.netex.org.uk/netex}dutyPartsInFrame_RelStructure">
     *     &lt;/extension>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class DutyParts
        extends DutyPartsInFrameRelStructure
    {


    }

}
