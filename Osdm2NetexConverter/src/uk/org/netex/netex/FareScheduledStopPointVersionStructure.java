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
 * Type for FARE SCHEDULED STOP POINT restricts id.
 * 
 * <p>Java-Klasse f�r FareScheduledStopPoint_VersionStructure complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="FareScheduledStopPoint_VersionStructure">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.netex.org.uk/netex}ScheduledStopPoint_VersionStructure">
 *       &lt;sequence>
 *         &lt;group ref="{http://www.netex.org.uk/netex}FareScheduledStopPointGroup"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FareScheduledStopPoint_VersionStructure", propOrder = {
    "siteFacilitySetRef",
    "siteFacilitySet",
    "nameOnRouting",
    "accountingStopPointRef",
    "borderPointRef"
})
@XmlSeeAlso({
    FareScheduledStopPoint.class
})
public class FareScheduledStopPointVersionStructure
    extends ScheduledStopPointVersionStructure
{

    @XmlElement(name = "SiteFacilitySetRef")
    protected SiteFacilitySetRefStructure siteFacilitySetRef;
    @XmlElement(name = "SiteFacilitySet")
    protected SiteFacilitySet siteFacilitySet;
    @XmlElement(name = "NameOnRouting")
    protected MultilingualString nameOnRouting;
    @XmlElement(name = "AccountingStopPointRef")
    protected FareScheduledStopPointRefStructure accountingStopPointRef;
    @XmlElement(name = "BorderPointRef")
    protected BorderPointRefStructure borderPointRef;

    /**
     * Ruft den Wert der siteFacilitySetRef-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link SiteFacilitySetRefStructure }
     *     
     */
    public SiteFacilitySetRefStructure getSiteFacilitySetRef() {
        return siteFacilitySetRef;
    }

    /**
     * Legt den Wert der siteFacilitySetRef-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link SiteFacilitySetRefStructure }
     *     
     */
    public void setSiteFacilitySetRef(SiteFacilitySetRefStructure value) {
        this.siteFacilitySetRef = value;
    }

    /**
     * Ruft den Wert der siteFacilitySet-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link SiteFacilitySet }
     *     
     */
    public SiteFacilitySet getSiteFacilitySet() {
        return siteFacilitySet;
    }

    /**
     * Legt den Wert der siteFacilitySet-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link SiteFacilitySet }
     *     
     */
    public void setSiteFacilitySet(SiteFacilitySet value) {
        this.siteFacilitySet = value;
    }

    /**
     * Ruft den Wert der nameOnRouting-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link MultilingualString }
     *     
     */
    public MultilingualString getNameOnRouting() {
        return nameOnRouting;
    }

    /**
     * Legt den Wert der nameOnRouting-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link MultilingualString }
     *     
     */
    public void setNameOnRouting(MultilingualString value) {
        this.nameOnRouting = value;
    }

    /**
     * Ruft den Wert der accountingStopPointRef-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FareScheduledStopPointRefStructure }
     *     
     */
    public FareScheduledStopPointRefStructure getAccountingStopPointRef() {
        return accountingStopPointRef;
    }

    /**
     * Legt den Wert der accountingStopPointRef-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FareScheduledStopPointRefStructure }
     *     
     */
    public void setAccountingStopPointRef(FareScheduledStopPointRefStructure value) {
        this.accountingStopPointRef = value;
    }

    /**
     * Ruft den Wert der borderPointRef-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BorderPointRefStructure }
     *     
     */
    public BorderPointRefStructure getBorderPointRef() {
        return borderPointRef;
    }

    /**
     * Legt den Wert der borderPointRef-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BorderPointRefStructure }
     *     
     */
    public void setBorderPointRef(BorderPointRefStructure value) {
        this.borderPointRef = value;
    }

}
