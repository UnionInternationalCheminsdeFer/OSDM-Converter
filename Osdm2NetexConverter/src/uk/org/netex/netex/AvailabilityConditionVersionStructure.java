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
import jakarta.xml.bind.annotation.adapters.NormalizedStringAdapter;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * Type for an AVAILABILITY CONDITION.
 * 
 * <p>Java-Klasse f�r AvailabilityCondition_VersionStructure complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="AvailabilityCondition_VersionStructure">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.netex.org.uk/netex}ValidBetween_VersionStructure">
 *       &lt;sequence>
 *         &lt;group ref="{http://www.netex.org.uk/netex}AvailabilityConditionGroup"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AvailabilityCondition_VersionStructure", propOrder = {
    "isAvailable",
    "dayTypes",
    "validDayBits",
    "timebands",
    "operatingDays"
})
@XmlSeeAlso({
    AvailabilityCondition.class
})
public class AvailabilityConditionVersionStructure
    extends ValidBetweenVersionStructure
{

    @XmlElement(name = "IsAvailable", defaultValue = "true")
    protected Boolean isAvailable;
    protected DayTypesRelStructure dayTypes;
    @XmlElement(name = "ValidDayBits")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String validDayBits;
    protected TimebandsRelStructure timebands;
    protected OperatingDaysRelStructure operatingDays;

    /**
     * Ruft den Wert der isAvailable-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsAvailable() {
        return isAvailable;
    }

    /**
     * Legt den Wert der isAvailable-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsAvailable(Boolean value) {
        this.isAvailable = value;
    }

    /**
     * Ruft den Wert der dayTypes-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link DayTypesRelStructure }
     *     
     */
    public DayTypesRelStructure getDayTypes() {
        return dayTypes;
    }

    /**
     * Legt den Wert der dayTypes-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link DayTypesRelStructure }
     *     
     */
    public void setDayTypes(DayTypesRelStructure value) {
        this.dayTypes = value;
    }

    /**
     * Ruft den Wert der validDayBits-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValidDayBits() {
        return validDayBits;
    }

    /**
     * Legt den Wert der validDayBits-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValidDayBits(String value) {
        this.validDayBits = value;
    }

    /**
     * Ruft den Wert der timebands-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link TimebandsRelStructure }
     *     
     */
    public TimebandsRelStructure getTimebands() {
        return timebands;
    }

    /**
     * Legt den Wert der timebands-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link TimebandsRelStructure }
     *     
     */
    public void setTimebands(TimebandsRelStructure value) {
        this.timebands = value;
    }

    /**
     * Ruft den Wert der operatingDays-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link OperatingDaysRelStructure }
     *     
     */
    public OperatingDaysRelStructure getOperatingDays() {
        return operatingDays;
    }

    /**
     * Legt den Wert der operatingDays-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link OperatingDaysRelStructure }
     *     
     */
    public void setOperatingDays(OperatingDaysRelStructure value) {
        this.operatingDays = value;
    }

}
