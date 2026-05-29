//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// �nderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2026.05.22 um 10:24:00 AM CEST 
//


package uk.org.netex.netex;

import java.math.BigInteger;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;
import javax.xml.datatype.Duration;


/**
 * Type for INTERCHANGING.
 * 
 * <p>Java-Klasse f�r Interchanging_VersionStructure complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="Interchanging_VersionStructure">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.netex.org.uk/netex}UsageParameter_VersionStructure">
 *       &lt;sequence>
 *         &lt;group ref="{http://www.netex.org.uk/netex}InterchangingGroup"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Interchanging_VersionStructure", propOrder = {
    "canInterchange",
    "fromMode",
    "toMode",
    "maximumNumberOfInterchanges",
    "maximumTimeToMakeATransfer",
    "canBreakJourney",
    "crossBorder",
    "registerBreakOfJourney"
})
@XmlSeeAlso({
    Interchanging.class
})
public class InterchangingVersionStructure
    extends UsageParameterVersionStructure
{

    @XmlElement(name = "CanInterchange")
    protected Boolean canInterchange;
    @XmlElement(name = "FromMode")
    @XmlSchemaType(name = "NMTOKEN")
    protected AllPublicTransportModesEnumeration fromMode;
    @XmlElement(name = "ToMode")
    @XmlSchemaType(name = "NMTOKEN")
    protected AllPublicTransportModesEnumeration toMode;
    @XmlElement(name = "MaximumNumberOfInterchanges")
    protected BigInteger maximumNumberOfInterchanges;
    @XmlElement(name = "MaximumTimeToMakeATransfer")
    protected Duration maximumTimeToMakeATransfer;
    @XmlElement(name = "CanBreakJourney")
    protected Boolean canBreakJourney;
    @XmlElement(name = "CrossBorder")
    protected Boolean crossBorder;
    @XmlElement(name = "RegisterBreakOfJourney")
    @XmlSchemaType(name = "normalizedString")
    protected RegisterBreakOfJourneyEnumeration registerBreakOfJourney;

    /**
     * Ruft den Wert der canInterchange-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCanInterchange() {
        return canInterchange;
    }

    /**
     * Legt den Wert der canInterchange-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCanInterchange(Boolean value) {
        this.canInterchange = value;
    }

    /**
     * Ruft den Wert der fromMode-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link AllPublicTransportModesEnumeration }
     *     
     */
    public AllPublicTransportModesEnumeration getFromMode() {
        return fromMode;
    }

    /**
     * Legt den Wert der fromMode-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link AllPublicTransportModesEnumeration }
     *     
     */
    public void setFromMode(AllPublicTransportModesEnumeration value) {
        this.fromMode = value;
    }

    /**
     * Ruft den Wert der toMode-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link AllPublicTransportModesEnumeration }
     *     
     */
    public AllPublicTransportModesEnumeration getToMode() {
        return toMode;
    }

    /**
     * Legt den Wert der toMode-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link AllPublicTransportModesEnumeration }
     *     
     */
    public void setToMode(AllPublicTransportModesEnumeration value) {
        this.toMode = value;
    }

    /**
     * Ruft den Wert der maximumNumberOfInterchanges-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getMaximumNumberOfInterchanges() {
        return maximumNumberOfInterchanges;
    }

    /**
     * Legt den Wert der maximumNumberOfInterchanges-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setMaximumNumberOfInterchanges(BigInteger value) {
        this.maximumNumberOfInterchanges = value;
    }

    /**
     * Ruft den Wert der maximumTimeToMakeATransfer-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Duration }
     *     
     */
    public Duration getMaximumTimeToMakeATransfer() {
        return maximumTimeToMakeATransfer;
    }

    /**
     * Legt den Wert der maximumTimeToMakeATransfer-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Duration }
     *     
     */
    public void setMaximumTimeToMakeATransfer(Duration value) {
        this.maximumTimeToMakeATransfer = value;
    }

    /**
     * Ruft den Wert der canBreakJourney-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCanBreakJourney() {
        return canBreakJourney;
    }

    /**
     * Legt den Wert der canBreakJourney-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCanBreakJourney(Boolean value) {
        this.canBreakJourney = value;
    }

    /**
     * Ruft den Wert der crossBorder-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCrossBorder() {
        return crossBorder;
    }

    /**
     * Legt den Wert der crossBorder-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCrossBorder(Boolean value) {
        this.crossBorder = value;
    }

    /**
     * Ruft den Wert der registerBreakOfJourney-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link RegisterBreakOfJourneyEnumeration }
     *     
     */
    public RegisterBreakOfJourneyEnumeration getRegisterBreakOfJourney() {
        return registerBreakOfJourney;
    }

    /**
     * Legt den Wert der registerBreakOfJourney-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link RegisterBreakOfJourneyEnumeration }
     *     
     */
    public void setRegisterBreakOfJourney(RegisterBreakOfJourneyEnumeration value) {
        this.registerBreakOfJourney = value;
    }

}
