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
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Type for a Waiting Room EQUIPMENT.
 * 
 * <p>Java-Klasse f�r WaitingRoomEquipment_VersionStructure complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="WaitingRoomEquipment_VersionStructure">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.netex.org.uk/netex}WaitingEquipment_VersionStructure">
 *       &lt;sequence>
 *         &lt;group ref="{http://www.netex.org.uk/netex}WaitingRoomGroup"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WaitingRoomEquipment_VersionStructure", propOrder = {
    "fareClass",
    "womenOnly",
    "sanitary",
    "classOfUseRef"
})
@XmlSeeAlso({
    WaitingRoomEquipment.class
})
public class WaitingRoomEquipmentVersionStructure
    extends WaitingEquipmentVersionStructure
{

    @XmlList
    @XmlElement(name = "FareClass")
    protected List<FareClassEnumeration> fareClass;
    @XmlElement(name = "WomenOnly")
    protected Boolean womenOnly;
    @XmlList
    @XmlElement(name = "Sanitary")
    protected List<SanitaryFacilityEnumeration> sanitary;
    @XmlElement(name = "ClassOfUseRef")
    protected ClassOfUseRef classOfUseRef;

    /**
     * Gets the value of the fareClass property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the fareClass property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFareClass().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FareClassEnumeration }
     * 
     * 
     */
    public List<FareClassEnumeration> getFareClass() {
        if (fareClass == null) {
            fareClass = new ArrayList<FareClassEnumeration>();
        }
        return this.fareClass;
    }

    /**
     * Ruft den Wert der womenOnly-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isWomenOnly() {
        return womenOnly;
    }

    /**
     * Legt den Wert der womenOnly-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setWomenOnly(Boolean value) {
        this.womenOnly = value;
    }

    /**
     * Gets the value of the sanitary property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the sanitary property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSanitary().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SanitaryFacilityEnumeration }
     * 
     * 
     */
    public List<SanitaryFacilityEnumeration> getSanitary() {
        if (sanitary == null) {
            sanitary = new ArrayList<SanitaryFacilityEnumeration>();
        }
        return this.sanitary;
    }

    /**
     * Ruft den Wert der classOfUseRef-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ClassOfUseRef }
     *     
     */
    public ClassOfUseRef getClassOfUseRef() {
        return classOfUseRef;
    }

    /**
     * Legt den Wert der classOfUseRef-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ClassOfUseRef }
     *     
     */
    public void setClassOfUseRef(ClassOfUseRef value) {
        this.classOfUseRef = value;
    }

}
