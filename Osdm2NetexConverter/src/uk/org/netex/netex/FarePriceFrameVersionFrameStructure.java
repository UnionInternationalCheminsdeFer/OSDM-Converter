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
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlElementRef;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Type for a FARE PRICE FRAME.
 * 
 * <p>Java-Klasse f�r FarePriceFrame_VersionFrameStructure complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="FarePriceFrame_VersionFrameStructure">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.netex.org.uk/netex}Common_VersionFrameStructure">
 *       &lt;sequence>
 *         &lt;group ref="{http://www.netex.org.uk/netex}FarePriceFrameGroup"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FarePriceFrame_VersionFrameStructure", propOrder = {
    "mode",
    "transportOrganisationRef",
    "pricingParameterSet",
    "notices",
    "noticeAssignments",
    "priceGroups",
    "fareTables"
})
@XmlSeeAlso({
    FarePriceFrame.class
})
public class FarePriceFrameVersionFrameStructure
    extends CommonVersionFrameStructure
{

    @XmlElement(name = "Mode")
    @XmlSchemaType(name = "NMTOKEN")
    protected AllPublicTransportModesEnumeration mode;
    @XmlElementRef(name = "TransportOrganisationRef", namespace = "http://www.netex.org.uk/netex", type = JAXBElement.class, required = false)
    protected JAXBElement<? extends TransportOrganisationRefStructure> transportOrganisationRef;
    @XmlElement(name = "PricingParameterSet")
    protected PricingParameterSet pricingParameterSet;
    protected NoticesInFrameRelStructure notices;
    protected NoticeAssignmentsInFrameRelStructure noticeAssignments;
    protected FarePricesInFrameRelStructure priceGroups;
    protected FareTablesInFrameRelStructure fareTables;

    /**
     * Ruft den Wert der mode-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link AllPublicTransportModesEnumeration }
     *     
     */
    public AllPublicTransportModesEnumeration getMode() {
        return mode;
    }

    /**
     * Legt den Wert der mode-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link AllPublicTransportModesEnumeration }
     *     
     */
    public void setMode(AllPublicTransportModesEnumeration value) {
        this.mode = value;
    }

    /**
     * Ruft den Wert der transportOrganisationRef-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link AuthorityRef }{@code >}
     *     {@link JAXBElement }{@code <}{@link TransportOrganisationRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link OperatorRefStructure }{@code >}
     *     
     */
    public JAXBElement<? extends TransportOrganisationRefStructure> getTransportOrganisationRef() {
        return transportOrganisationRef;
    }

    /**
     * Legt den Wert der transportOrganisationRef-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link AuthorityRef }{@code >}
     *     {@link JAXBElement }{@code <}{@link TransportOrganisationRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link OperatorRefStructure }{@code >}
     *     
     */
    public void setTransportOrganisationRef(JAXBElement<? extends TransportOrganisationRefStructure> value) {
        this.transportOrganisationRef = value;
    }

    /**
     * Ruft den Wert der pricingParameterSet-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link PricingParameterSet }
     *     
     */
    public PricingParameterSet getPricingParameterSet() {
        return pricingParameterSet;
    }

    /**
     * Legt den Wert der pricingParameterSet-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link PricingParameterSet }
     *     
     */
    public void setPricingParameterSet(PricingParameterSet value) {
        this.pricingParameterSet = value;
    }

    /**
     * Ruft den Wert der notices-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link NoticesInFrameRelStructure }
     *     
     */
    public NoticesInFrameRelStructure getNotices() {
        return notices;
    }

    /**
     * Legt den Wert der notices-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link NoticesInFrameRelStructure }
     *     
     */
    public void setNotices(NoticesInFrameRelStructure value) {
        this.notices = value;
    }

    /**
     * Ruft den Wert der noticeAssignments-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link NoticeAssignmentsInFrameRelStructure }
     *     
     */
    public NoticeAssignmentsInFrameRelStructure getNoticeAssignments() {
        return noticeAssignments;
    }

    /**
     * Legt den Wert der noticeAssignments-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link NoticeAssignmentsInFrameRelStructure }
     *     
     */
    public void setNoticeAssignments(NoticeAssignmentsInFrameRelStructure value) {
        this.noticeAssignments = value;
    }

    /**
     * Ruft den Wert der priceGroups-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FarePricesInFrameRelStructure }
     *     
     */
    public FarePricesInFrameRelStructure getPriceGroups() {
        return priceGroups;
    }

    /**
     * Legt den Wert der priceGroups-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FarePricesInFrameRelStructure }
     *     
     */
    public void setPriceGroups(FarePricesInFrameRelStructure value) {
        this.priceGroups = value;
    }

    /**
     * Ruft den Wert der fareTables-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FareTablesInFrameRelStructure }
     *     
     */
    public FareTablesInFrameRelStructure getFareTables() {
        return fareTables;
    }

    /**
     * Legt den Wert der fareTables-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FareTablesInFrameRelStructure }
     *     
     */
    public void setFareTables(FareTablesInFrameRelStructure value) {
        this.fareTables = value;
    }

}
