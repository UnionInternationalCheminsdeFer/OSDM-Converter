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
 * Type for INTERCHANGE RULE.
 * 
 * <p>Java-Klasse f�r InterchangeRule_VersionStructure complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="InterchangeRule_VersionStructure">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.netex.org.uk/netex}Interchange_VersionStructure">
 *       &lt;sequence>
 *         &lt;group ref="{http://www.netex.org.uk/netex}InterchangeRuleGroup"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InterchangeRule_VersionStructure", propOrder = {
    "connectionZoneRef",
    "controlCentreRef",
    "exclude",
    "timings",
    "feederFilter",
    "distributorFilter"
})
@XmlSeeAlso({
    InterchangeRule.class
})
public class InterchangeRuleVersionStructure
    extends InterchangeVersionStructure
{

    @XmlElement(name = "ConnectionZoneRef")
    protected ZoneRefStructure connectionZoneRef;
    @XmlElement(name = "ControlCentreRef")
    protected ControlCentreRefStructure controlCentreRef;
    @XmlElement(name = "Exclude", defaultValue = "false")
    protected Boolean exclude;
    protected InterchangeRuleTimingsRelStructure timings;
    @XmlElement(name = "FeederFilter")
    protected InterchangeRuleParameterStructure feederFilter;
    @XmlElement(name = "DistributorFilter")
    protected InterchangeRuleParameterStructure distributorFilter;

    /**
     * Ruft den Wert der connectionZoneRef-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ZoneRefStructure }
     *     
     */
    public ZoneRefStructure getConnectionZoneRef() {
        return connectionZoneRef;
    }

    /**
     * Legt den Wert der connectionZoneRef-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ZoneRefStructure }
     *     
     */
    public void setConnectionZoneRef(ZoneRefStructure value) {
        this.connectionZoneRef = value;
    }

    /**
     * Ruft den Wert der controlCentreRef-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ControlCentreRefStructure }
     *     
     */
    public ControlCentreRefStructure getControlCentreRef() {
        return controlCentreRef;
    }

    /**
     * Legt den Wert der controlCentreRef-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ControlCentreRefStructure }
     *     
     */
    public void setControlCentreRef(ControlCentreRefStructure value) {
        this.controlCentreRef = value;
    }

    /**
     * Ruft den Wert der exclude-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isExclude() {
        return exclude;
    }

    /**
     * Legt den Wert der exclude-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setExclude(Boolean value) {
        this.exclude = value;
    }

    /**
     * Ruft den Wert der timings-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link InterchangeRuleTimingsRelStructure }
     *     
     */
    public InterchangeRuleTimingsRelStructure getTimings() {
        return timings;
    }

    /**
     * Legt den Wert der timings-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link InterchangeRuleTimingsRelStructure }
     *     
     */
    public void setTimings(InterchangeRuleTimingsRelStructure value) {
        this.timings = value;
    }

    /**
     * Ruft den Wert der feederFilter-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link InterchangeRuleParameterStructure }
     *     
     */
    public InterchangeRuleParameterStructure getFeederFilter() {
        return feederFilter;
    }

    /**
     * Legt den Wert der feederFilter-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link InterchangeRuleParameterStructure }
     *     
     */
    public void setFeederFilter(InterchangeRuleParameterStructure value) {
        this.feederFilter = value;
    }

    /**
     * Ruft den Wert der distributorFilter-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link InterchangeRuleParameterStructure }
     *     
     */
    public InterchangeRuleParameterStructure getDistributorFilter() {
        return distributorFilter;
    }

    /**
     * Legt den Wert der distributorFilter-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link InterchangeRuleParameterStructure }
     *     
     */
    public void setDistributorFilter(InterchangeRuleParameterStructure value) {
        this.distributorFilter = value;
    }

}
