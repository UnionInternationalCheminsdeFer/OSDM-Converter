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
 * Type for a MOBILITY JOURNEY FRAME.
 * 
 * <p>Java-Klasse f�r MobilityJourney_VersionFrameStructure complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="MobilityJourney_VersionFrameStructure">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.netex.org.uk/netex}Common_VersionFrameStructure">
 *       &lt;sequence>
 *         &lt;group ref="{http://www.netex.org.uk/netex}MobilityJourneyFrameGroup"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MobilityJourney_VersionFrameStructure", propOrder = {
    "singleJourneyPaths",
    "groupsOfSingleJourneys",
    "singleJourneys",
    "individualTravellers",
    "vehicleAccessCredentials",
    "parkingLogEntries"
})
@XmlSeeAlso({
    MobilityJourneyFrame.class
})
public class MobilityJourneyVersionFrameStructure
    extends CommonVersionFrameStructure
{

    protected SingleJourneyPathsRelStructure singleJourneyPaths;
    protected GroupsOfSingleJourneysRelStructure groupsOfSingleJourneys;
    protected SingleJourneysRelStructure singleJourneys;
    protected IndividualTravellersInFrameRelStructure individualTravellers;
    protected VehicleAccessCredentialAssignmentsRelStructure vehicleAccessCredentials;
    protected ParkingLogEntriesInFrameRelStructure parkingLogEntries;

    /**
     * Ruft den Wert der singleJourneyPaths-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link SingleJourneyPathsRelStructure }
     *     
     */
    public SingleJourneyPathsRelStructure getSingleJourneyPaths() {
        return singleJourneyPaths;
    }

    /**
     * Legt den Wert der singleJourneyPaths-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link SingleJourneyPathsRelStructure }
     *     
     */
    public void setSingleJourneyPaths(SingleJourneyPathsRelStructure value) {
        this.singleJourneyPaths = value;
    }

    /**
     * Ruft den Wert der groupsOfSingleJourneys-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link GroupsOfSingleJourneysRelStructure }
     *     
     */
    public GroupsOfSingleJourneysRelStructure getGroupsOfSingleJourneys() {
        return groupsOfSingleJourneys;
    }

    /**
     * Legt den Wert der groupsOfSingleJourneys-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link GroupsOfSingleJourneysRelStructure }
     *     
     */
    public void setGroupsOfSingleJourneys(GroupsOfSingleJourneysRelStructure value) {
        this.groupsOfSingleJourneys = value;
    }

    /**
     * Ruft den Wert der singleJourneys-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link SingleJourneysRelStructure }
     *     
     */
    public SingleJourneysRelStructure getSingleJourneys() {
        return singleJourneys;
    }

    /**
     * Legt den Wert der singleJourneys-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link SingleJourneysRelStructure }
     *     
     */
    public void setSingleJourneys(SingleJourneysRelStructure value) {
        this.singleJourneys = value;
    }

    /**
     * Ruft den Wert der individualTravellers-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link IndividualTravellersInFrameRelStructure }
     *     
     */
    public IndividualTravellersInFrameRelStructure getIndividualTravellers() {
        return individualTravellers;
    }

    /**
     * Legt den Wert der individualTravellers-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link IndividualTravellersInFrameRelStructure }
     *     
     */
    public void setIndividualTravellers(IndividualTravellersInFrameRelStructure value) {
        this.individualTravellers = value;
    }

    /**
     * Ruft den Wert der vehicleAccessCredentials-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link VehicleAccessCredentialAssignmentsRelStructure }
     *     
     */
    public VehicleAccessCredentialAssignmentsRelStructure getVehicleAccessCredentials() {
        return vehicleAccessCredentials;
    }

    /**
     * Legt den Wert der vehicleAccessCredentials-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link VehicleAccessCredentialAssignmentsRelStructure }
     *     
     */
    public void setVehicleAccessCredentials(VehicleAccessCredentialAssignmentsRelStructure value) {
        this.vehicleAccessCredentials = value;
    }

    /**
     * Ruft den Wert der parkingLogEntries-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ParkingLogEntriesInFrameRelStructure }
     *     
     */
    public ParkingLogEntriesInFrameRelStructure getParkingLogEntries() {
        return parkingLogEntries;
    }

    /**
     * Legt den Wert der parkingLogEntries-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ParkingLogEntriesInFrameRelStructure }
     *     
     */
    public void setParkingLogEntries(ParkingLogEntriesInFrameRelStructure value) {
        this.parkingLogEntries = value;
    }

}
