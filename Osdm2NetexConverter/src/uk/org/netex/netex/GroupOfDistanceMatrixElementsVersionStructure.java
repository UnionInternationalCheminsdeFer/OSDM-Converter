//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// �nderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2026.05.22 um 10:24:00 AM CEST 
//


package uk.org.netex.netex;

import java.math.BigDecimal;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Type for GROUP OF DISTANCE MATRIX ELEMENTs.
 * 
 * <p>Java-Klasse f�r GroupOfDistanceMatrixElements_VersionStructure complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="GroupOfDistanceMatrixElements_VersionStructure">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.netex.org.uk/netex}GroupOfEntities_VersionStructure">
 *       &lt;sequence>
 *         &lt;group ref="{http://www.netex.org.uk/netex}GroupOfDistanceMatrixElementsGroup"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GroupOfDistanceMatrixElements_VersionStructure", propOrder = {
    "useToExclude",
    "priceGroups",
    "fareTables",
    "distance",
    "structureFactors",
    "noticeAssignments",
    "members",
    "prices"
})
@XmlSeeAlso({
    GroupOfDistanceMatrixElements.class
})
public class GroupOfDistanceMatrixElementsVersionStructure
    extends GroupOfEntitiesVersionStructure
{

    @XmlElement(name = "UseToExclude", defaultValue = "false")
    protected Boolean useToExclude;
    protected PriceGroupsRelStructure priceGroups;
    protected FareTablesRelStructure fareTables;
    @XmlElement(name = "Distance")
    protected BigDecimal distance;
    protected GeographicalStructureFactorsRelStructure structureFactors;
    protected NoticeAssignmentsRelStructure noticeAssignments;
    protected DistanceMatrixElementsRelStructure members;
    protected GroupOfDistanceMatrixElementsVersionStructure.Prices prices;

    /**
     * Ruft den Wert der useToExclude-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isUseToExclude() {
        return useToExclude;
    }

    /**
     * Legt den Wert der useToExclude-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setUseToExclude(Boolean value) {
        this.useToExclude = value;
    }

    /**
     * Ruft den Wert der priceGroups-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link PriceGroupsRelStructure }
     *     
     */
    public PriceGroupsRelStructure getPriceGroups() {
        return priceGroups;
    }

    /**
     * Legt den Wert der priceGroups-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link PriceGroupsRelStructure }
     *     
     */
    public void setPriceGroups(PriceGroupsRelStructure value) {
        this.priceGroups = value;
    }

    /**
     * Ruft den Wert der fareTables-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FareTablesRelStructure }
     *     
     */
    public FareTablesRelStructure getFareTables() {
        return fareTables;
    }

    /**
     * Legt den Wert der fareTables-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FareTablesRelStructure }
     *     
     */
    public void setFareTables(FareTablesRelStructure value) {
        this.fareTables = value;
    }

    /**
     * Ruft den Wert der distance-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getDistance() {
        return distance;
    }

    /**
     * Legt den Wert der distance-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setDistance(BigDecimal value) {
        this.distance = value;
    }

    /**
     * Ruft den Wert der structureFactors-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link GeographicalStructureFactorsRelStructure }
     *     
     */
    public GeographicalStructureFactorsRelStructure getStructureFactors() {
        return structureFactors;
    }

    /**
     * Legt den Wert der structureFactors-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link GeographicalStructureFactorsRelStructure }
     *     
     */
    public void setStructureFactors(GeographicalStructureFactorsRelStructure value) {
        this.structureFactors = value;
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
     * Ruft den Wert der members-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link DistanceMatrixElementsRelStructure }
     *     
     */
    public DistanceMatrixElementsRelStructure getMembers() {
        return members;
    }

    /**
     * Legt den Wert der members-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link DistanceMatrixElementsRelStructure }
     *     
     */
    public void setMembers(DistanceMatrixElementsRelStructure value) {
        this.members = value;
    }

    /**
     * Ruft den Wert der prices-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link GroupOfDistanceMatrixElementsVersionStructure.Prices }
     *     
     */
    public GroupOfDistanceMatrixElementsVersionStructure.Prices getPrices() {
        return prices;
    }

    /**
     * Legt den Wert der prices-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link GroupOfDistanceMatrixElementsVersionStructure.Prices }
     *     
     */
    public void setPrices(GroupOfDistanceMatrixElementsVersionStructure.Prices value) {
        this.prices = value;
    }


    /**
     * <p>Java-Klasse f�r anonymous complex type.
     * 
     * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;extension base="{http://www.netex.org.uk/netex}distanceMatrixElementPrices_RelStructure">
     *     &lt;/extension>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class Prices
        extends DistanceMatrixElementPricesRelStructure
    {


    }

}
