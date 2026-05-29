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
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * Type for a FARE TABLE.
 * 
 * <p>Java-Klasse f�r FareTable_VersionStructure complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="FareTable_VersionStructure">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.netex.org.uk/netex}GroupOfEntities_VersionStructure">
 *       &lt;group ref="{http://www.netex.org.uk/netex}FareTableGroup"/>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FareTable_VersionStructure", propOrder = {
    "startDate",
    "endDate",
    "roundingRef",
    "typeOfFareTableRef",
    "pricesFor",
    "usedIn",
    "organisationRefDummy",
    "limitations",
    "specifics",
    "columns",
    "rows",
    "includes",
    "embargoUntil",
    "prices",
    "cells",
    "noticeAssignments"
})
@XmlSeeAlso({
    FareTable.class,
    FareTableInContext.class
})
public class FareTableVersionStructure
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
    protected UsageParameterRefsRelStructure limitations;
    protected FareTableVersionStructure.Specifics specifics;
    protected FareTableColumnsRelStructure columns;
    protected FareTableRowsRelStructure rows;
    protected FareTablesRelStructure includes;
    @XmlElement(name = "EmbargoUntil")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar embargoUntil;
    protected FarePricesRelStructure prices;
    protected CellsRelStructure cells;
    protected NoticeAssignmentsRelStructure noticeAssignments;

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
     * Ruft den Wert der limitations-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link UsageParameterRefsRelStructure }
     *     
     */
    public UsageParameterRefsRelStructure getLimitations() {
        return limitations;
    }

    /**
     * Legt den Wert der limitations-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link UsageParameterRefsRelStructure }
     *     
     */
    public void setLimitations(UsageParameterRefsRelStructure value) {
        this.limitations = value;
    }

    /**
     * Ruft den Wert der specifics-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FareTableVersionStructure.Specifics }
     *     
     */
    public FareTableVersionStructure.Specifics getSpecifics() {
        return specifics;
    }

    /**
     * Legt den Wert der specifics-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FareTableVersionStructure.Specifics }
     *     
     */
    public void setSpecifics(FareTableVersionStructure.Specifics value) {
        this.specifics = value;
    }

    /**
     * Ruft den Wert der columns-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FareTableColumnsRelStructure }
     *     
     */
    public FareTableColumnsRelStructure getColumns() {
        return columns;
    }

    /**
     * Legt den Wert der columns-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FareTableColumnsRelStructure }
     *     
     */
    public void setColumns(FareTableColumnsRelStructure value) {
        this.columns = value;
    }

    /**
     * Ruft den Wert der rows-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FareTableRowsRelStructure }
     *     
     */
    public FareTableRowsRelStructure getRows() {
        return rows;
    }

    /**
     * Legt den Wert der rows-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FareTableRowsRelStructure }
     *     
     */
    public void setRows(FareTableRowsRelStructure value) {
        this.rows = value;
    }

    /**
     * Ruft den Wert der includes-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FareTablesRelStructure }
     *     
     */
    public FareTablesRelStructure getIncludes() {
        return includes;
    }

    /**
     * Legt den Wert der includes-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FareTablesRelStructure }
     *     
     */
    public void setIncludes(FareTablesRelStructure value) {
        this.includes = value;
    }

    /**
     * Ruft den Wert der embargoUntil-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getEmbargoUntil() {
        return embargoUntil;
    }

    /**
     * Legt den Wert der embargoUntil-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setEmbargoUntil(XMLGregorianCalendar value) {
        this.embargoUntil = value;
    }

    /**
     * Ruft den Wert der prices-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FarePricesRelStructure }
     *     
     */
    public FarePricesRelStructure getPrices() {
        return prices;
    }

    /**
     * Legt den Wert der prices-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FarePricesRelStructure }
     *     
     */
    public void setPrices(FarePricesRelStructure value) {
        this.prices = value;
    }

    /**
     * Ruft den Wert der cells-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link CellsRelStructure }
     *     
     */
    public CellsRelStructure getCells() {
        return cells;
    }

    /**
     * Legt den Wert der cells-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link CellsRelStructure }
     *     
     */
    public void setCells(CellsRelStructure value) {
        this.cells = value;
    }

    /**
     * Ruft den Wert der noticeAssignments-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link NoticeAssignmentsRelStructure }
     *     
     */
    public NoticeAssignmentsRelStructure getNoticeAssignments() {
        return noticeAssignments;
    }

    /**
     * Legt den Wert der noticeAssignments-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link NoticeAssignmentsRelStructure }
     *     
     */
    public void setNoticeAssignments(NoticeAssignmentsRelStructure value) {
        this.noticeAssignments = value;
    }


    /**
     * <p>Java-Klasse f�r anonymous complex type.
     * 
     * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;extension base="{http://www.netex.org.uk/netex}FareTableSpecificsStructure">
     *     &lt;/extension>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class Specifics
        extends FareTableSpecificsStructure
    {


    }

}
