//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// �nderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2026.05.22 um 10:24:00 AM CEST 
//


package uk.org.netex.netex;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlList;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Type for a SITEFACILITY.
 * 
 * <p>Java-Klasse f�r SiteFacilitySetStructure complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="SiteFacilitySetStructure">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.netex.org.uk/netex}FacilitySet_VersionStructure">
 *       &lt;sequence>
 *         &lt;group ref="{http://www.netex.org.uk/netex}SiteFacilitySetGroup"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SiteFacilitySetStructure", propOrder = {
    "accessFacilityList",
    "emergencyServiceList",
    "hireFacilityList",
    "luggageLockerFacilityList",
    "luggageServiceFacilityList",
    "moneyFacilityList",
    "parkingFacilityList",
    "staffing"
})
@XmlSeeAlso({
    SiteFacilitySet.class
})
public class SiteFacilitySetStructure
    extends FacilitySetVersionStructure
{

    @XmlList
    @XmlElement(name = "AccessFacilityList", defaultValue = "unknown")
    protected List<AccessFacilityEnumeration> accessFacilityList;
    @XmlList
    @XmlElement(name = "EmergencyServiceList")
    protected List<EmergencyServiceEnumeration> emergencyServiceList;
    @XmlList
    @XmlElement(name = "HireFacilityList")
    protected List<HireFacilityEnumeration> hireFacilityList;
    @XmlList
    @XmlElement(name = "LuggageLockerFacilityList")
    protected List<LuggageLockerFacilityEnumeration> luggageLockerFacilityList;
    @XmlList
    @XmlElement(name = "LuggageServiceFacilityList")
    protected List<LuggageServiceFacilityEnumeration> luggageServiceFacilityList;
    @XmlList
    @XmlElement(name = "MoneyFacilityList")
    protected List<MoneyFacilityEnumeration> moneyFacilityList;
    @XmlList
    @XmlElement(name = "ParkingFacilityList")
    protected List<ParkingFacilityEnumeration> parkingFacilityList;
    @XmlElement(name = "Staffing")
    @XmlSchemaType(name = "normalizedString")
    protected StaffingEnumeration staffing;

    /**
     * List of ACCESS FACILITies. + v1.1 Gets the value of the accessFacilityList property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the accessFacilityList property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAccessFacilityList().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AccessFacilityEnumeration }
     * 
     * 
     */
    public List<AccessFacilityEnumeration> getAccessFacilityList() {
        if (accessFacilityList == null) {
            accessFacilityList = new ArrayList<AccessFacilityEnumeration>();
        }
        return this.accessFacilityList;
    }

    /**
     * List of EMERGENCY SERVICE FACILITies.Gets the value of the emergencyServiceList property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the emergencyServiceList property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEmergencyServiceList().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EmergencyServiceEnumeration }
     * 
     * 
     */
    public List<EmergencyServiceEnumeration> getEmergencyServiceList() {
        if (emergencyServiceList == null) {
            emergencyServiceList = new ArrayList<EmergencyServiceEnumeration>();
        }
        return this.emergencyServiceList;
    }

    /**
     * List of HIRE FACILITies.Gets the value of the hireFacilityList property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the hireFacilityList property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getHireFacilityList().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link HireFacilityEnumeration }
     * 
     * 
     */
    public List<HireFacilityEnumeration> getHireFacilityList() {
        if (hireFacilityList == null) {
            hireFacilityList = new ArrayList<HireFacilityEnumeration>();
        }
        return this.hireFacilityList;
    }

    /**
     * List of LUGGAGE LOCKER FACILITies.Gets the value of the luggageLockerFacilityList property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the luggageLockerFacilityList property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLuggageLockerFacilityList().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LuggageLockerFacilityEnumeration }
     * 
     * 
     */
    public List<LuggageLockerFacilityEnumeration> getLuggageLockerFacilityList() {
        if (luggageLockerFacilityList == null) {
            luggageLockerFacilityList = new ArrayList<LuggageLockerFacilityEnumeration>();
        }
        return this.luggageLockerFacilityList;
    }

    /**
     * List of LUGGAGE SERVICE FACILITies.Gets the value of the luggageServiceFacilityList property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the luggageServiceFacilityList property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLuggageServiceFacilityList().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LuggageServiceFacilityEnumeration }
     * 
     * 
     */
    public List<LuggageServiceFacilityEnumeration> getLuggageServiceFacilityList() {
        if (luggageServiceFacilityList == null) {
            luggageServiceFacilityList = new ArrayList<LuggageServiceFacilityEnumeration>();
        }
        return this.luggageServiceFacilityList;
    }

    /**
     * List of MONEY FACILITies.Gets the value of the moneyFacilityList property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the moneyFacilityList property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMoneyFacilityList().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MoneyFacilityEnumeration }
     * 
     * 
     */
    public List<MoneyFacilityEnumeration> getMoneyFacilityList() {
        if (moneyFacilityList == null) {
            moneyFacilityList = new ArrayList<MoneyFacilityEnumeration>();
        }
        return this.moneyFacilityList;
    }

    /**
     * List of PARKING FACILITies.Gets the value of the parkingFacilityList property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the parkingFacilityList property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getParkingFacilityList().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ParkingFacilityEnumeration }
     * 
     * 
     */
    public List<ParkingFacilityEnumeration> getParkingFacilityList() {
        if (parkingFacilityList == null) {
            parkingFacilityList = new ArrayList<ParkingFacilityEnumeration>();
        }
        return this.parkingFacilityList;
    }

    /**
     * Classification of STAFFING.
     * 
     * @return
     *     possible object is
     *     {@link StaffingEnumeration }
     *     
     */
    public StaffingEnumeration getStaffing() {
        return staffing;
    }

    /**
     * Legt den Wert der staffing-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link StaffingEnumeration }
     *     
     */
    public void setStaffing(StaffingEnumeration value) {
        this.staffing = value;
    }

}
