//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// �nderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2026.05.22 um 10:24:00 AM CEST 
//


package uk.org.netex.netex;

import java.math.BigDecimal;
import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlElementRef;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * Type for a STANDARD FARE TABLE PRICE GROUP.
 * 
 * <p>Java-Klasse f�r StandardFareTable_VersionStructure complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="StandardFareTable_VersionStructure">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.netex.org.uk/netex}GroupOfEntities_VersionStructure">
 *       &lt;group ref="{http://www.netex.org.uk/netex}StandardFareTableGroup"/>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StandardFareTable_VersionStructure", propOrder = {
    "startDate",
    "endDate",
    "roundingRef",
    "typeOfFareTableRef",
    "pricesFor",
    "usedIn",
    "organisationRefDummy",
    "firstClassSingle",
    "secondClassSingle",
    "firstClassReturn",
    "secondClassReturn"
})
@XmlSeeAlso({
    StandardFareTable.class
})
public class StandardFareTableVersionStructure
    extends GroupOfEntitiesVersionStructure
{

    @XmlElement(name = "StartDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar startDate;
    @XmlElement(name = "EndDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar endDate;
    @XmlElement(name = "RoundingRef")
    protected RoundingRefStructure roundingRef;
    @XmlElement(name = "TypeOfFareTableRef")
    protected TypeOfFareTableRefStructure typeOfFareTableRef;
    protected PriceableObjectRefsRelStructure pricesFor;
    protected UsedInRefsRelStructure usedIn;
    @XmlElementRef(name = "OrganisationRef_Dummy", namespace = "http://www.netex.org.uk/netex", type = JAXBElement.class, required = false)
    protected JAXBElement<? extends OrganisationRefStructure> organisationRefDummy;
    @XmlElement(name = "FirstClassSingle")
    protected BigDecimal firstClassSingle;
    @XmlElement(name = "SecondClassSingle", required = true)
    protected BigDecimal secondClassSingle;
    @XmlElement(name = "FirstClassReturn")
    protected BigDecimal firstClassReturn;
    @XmlElement(name = "SecondClassReturn")
    protected BigDecimal secondClassReturn;

    /**
     * Ruft den Wert der startDate-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getStartDate() {
        return startDate;
    }

    /**
     * Legt den Wert der startDate-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setStartDate(XMLGregorianCalendar value) {
        this.startDate = value;
    }

    /**
     * Ruft den Wert der endDate-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getEndDate() {
        return endDate;
    }

    /**
     * Legt den Wert der endDate-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setEndDate(XMLGregorianCalendar value) {
        this.endDate = value;
    }

    /**
     * Ruft den Wert der roundingRef-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link RoundingRefStructure }
     *     
     */
    public RoundingRefStructure getRoundingRef() {
        return roundingRef;
    }

    /**
     * Legt den Wert der roundingRef-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link RoundingRefStructure }
     *     
     */
    public void setRoundingRef(RoundingRefStructure value) {
        this.roundingRef = value;
    }

    /**
     * Ruft den Wert der typeOfFareTableRef-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link TypeOfFareTableRefStructure }
     *     
     */
    public TypeOfFareTableRefStructure getTypeOfFareTableRef() {
        return typeOfFareTableRef;
    }

    /**
     * Legt den Wert der typeOfFareTableRef-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeOfFareTableRefStructure }
     *     
     */
    public void setTypeOfFareTableRef(TypeOfFareTableRefStructure value) {
        this.typeOfFareTableRef = value;
    }

    /**
     * Ruft den Wert der pricesFor-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link PriceableObjectRefsRelStructure }
     *     
     */
    public PriceableObjectRefsRelStructure getPricesFor() {
        return pricesFor;
    }

    /**
     * Legt den Wert der pricesFor-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link PriceableObjectRefsRelStructure }
     *     
     */
    public void setPricesFor(PriceableObjectRefsRelStructure value) {
        this.pricesFor = value;
    }

    /**
     * Ruft den Wert der usedIn-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link UsedInRefsRelStructure }
     *     
     */
    public UsedInRefsRelStructure getUsedIn() {
        return usedIn;
    }

    /**
     * Legt den Wert der usedIn-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link UsedInRefsRelStructure }
     *     
     */
    public void setUsedIn(UsedInRefsRelStructure value) {
        this.usedIn = value;
    }

    /**
     * Ruft den Wert der organisationRefDummy-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link TransportOrganisationRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link ServicedOrganisationRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link OrganisationRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link TravelAgentRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link AuthorityRef }{@code >}
     *     {@link JAXBElement }{@code <}{@link OrganisationRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link OperatorRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link OnlineServiceOperatorRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link OtherOrganisationRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link GeneralOrganisationRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link ManagementAgentRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link RetailConsortiumRefStructure }{@code >}
     *     
     */
    public JAXBElement<? extends OrganisationRefStructure> getOrganisationRefDummy() {
        return organisationRefDummy;
    }

    /**
     * Legt den Wert der organisationRefDummy-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link TransportOrganisationRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link ServicedOrganisationRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link OrganisationRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link TravelAgentRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link AuthorityRef }{@code >}
     *     {@link JAXBElement }{@code <}{@link OrganisationRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link OperatorRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link OnlineServiceOperatorRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link OtherOrganisationRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link GeneralOrganisationRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link ManagementAgentRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link RetailConsortiumRefStructure }{@code >}
     *     
     */
    public void setOrganisationRefDummy(JAXBElement<? extends OrganisationRefStructure> value) {
        this.organisationRefDummy = value;
    }

    /**
     * Ruft den Wert der firstClassSingle-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getFirstClassSingle() {
        return firstClassSingle;
    }

    /**
     * Legt den Wert der firstClassSingle-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setFirstClassSingle(BigDecimal value) {
        this.firstClassSingle = value;
    }

    /**
     * Ruft den Wert der secondClassSingle-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getSecondClassSingle() {
        return secondClassSingle;
    }

    /**
     * Legt den Wert der secondClassSingle-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setSecondClassSingle(BigDecimal value) {
        this.secondClassSingle = value;
    }

    /**
     * Ruft den Wert der firstClassReturn-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getFirstClassReturn() {
        return firstClassReturn;
    }

    /**
     * Legt den Wert der firstClassReturn-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setFirstClassReturn(BigDecimal value) {
        this.firstClassReturn = value;
    }

    /**
     * Ruft den Wert der secondClassReturn-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getSecondClassReturn() {
        return secondClassReturn;
    }

    /**
     * Legt den Wert der secondClassReturn-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setSecondClassReturn(BigDecimal value) {
        this.secondClassReturn = value;
    }

}
