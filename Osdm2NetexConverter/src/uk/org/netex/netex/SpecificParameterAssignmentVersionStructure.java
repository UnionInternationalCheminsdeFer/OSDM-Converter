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


/**
 * Type for SPECIFIC PARAMETER ASSIGNMENT.
 * 
 * <p>Java-Klasse f�r SpecificParameterAssignment_VersionStructure complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="SpecificParameterAssignment_VersionStructure">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.netex.org.uk/netex}ValidityParameterAssignment_VersionStructure">
 *       &lt;sequence>
 *         &lt;group ref="{http://www.netex.org.uk/netex}SpecificParameterAssignmentGroup"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SpecificParameterAssignment_VersionStructure", propOrder = {
    "accessNumber",
    "includesGroupingType",
    "includes",
    "distributionAssignmentRef",
    "retailingOrganizationRef",
    "collectionPointRef"
})
@XmlSeeAlso({
    SpecificParameterAssignment.class
})
public class SpecificParameterAssignmentVersionStructure
    extends ValidityParameterAssignmentVersionStructure
{

    @XmlElement(name = "AccessNumber")
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger accessNumber;
    @XmlElement(name = "IncludesGroupingType", defaultValue = "OR")
    @XmlSchemaType(name = "NMTOKEN")
    protected LogicalOperationEnumeration includesGroupingType;
    protected SpecificParameterAssignmentsRelStructure includes;
    @XmlElement(name = "DistributionAssignmentRef")
    protected DistributionAssignmentRefStructure distributionAssignmentRef;
    @XmlElement(name = "RetailingOrganizationRef")
    protected OrganisationRefStructure retailingOrganizationRef;
    @XmlElement(name = "CollectionPointRef")
    protected PointRefStructure collectionPointRef;

    /**
     * Ruft den Wert der accessNumber-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getAccessNumber() {
        return accessNumber;
    }

    /**
     * Legt den Wert der accessNumber-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setAccessNumber(BigInteger value) {
        this.accessNumber = value;
    }

    /**
     * Ruft den Wert der includesGroupingType-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link LogicalOperationEnumeration }
     *     
     */
    public LogicalOperationEnumeration getIncludesGroupingType() {
        return includesGroupingType;
    }

    /**
     * Legt den Wert der includesGroupingType-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link LogicalOperationEnumeration }
     *     
     */
    public void setIncludesGroupingType(LogicalOperationEnumeration value) {
        this.includesGroupingType = value;
    }

    /**
     * Ruft den Wert der includes-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link SpecificParameterAssignmentsRelStructure }
     *     
     */
    public SpecificParameterAssignmentsRelStructure getIncludes() {
        return includes;
    }

    /**
     * Legt den Wert der includes-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link SpecificParameterAssignmentsRelStructure }
     *     
     */
    public void setIncludes(SpecificParameterAssignmentsRelStructure value) {
        this.includes = value;
    }

    /**
     * Ruft den Wert der distributionAssignmentRef-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link DistributionAssignmentRefStructure }
     *     
     */
    public DistributionAssignmentRefStructure getDistributionAssignmentRef() {
        return distributionAssignmentRef;
    }

    /**
     * Legt den Wert der distributionAssignmentRef-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link DistributionAssignmentRefStructure }
     *     
     */
    public void setDistributionAssignmentRef(DistributionAssignmentRefStructure value) {
        this.distributionAssignmentRef = value;
    }

    /**
     * Ruft den Wert der retailingOrganizationRef-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link OrganisationRefStructure }
     *     
     */
    public OrganisationRefStructure getRetailingOrganizationRef() {
        return retailingOrganizationRef;
    }

    /**
     * Legt den Wert der retailingOrganizationRef-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link OrganisationRefStructure }
     *     
     */
    public void setRetailingOrganizationRef(OrganisationRefStructure value) {
        this.retailingOrganizationRef = value;
    }

    /**
     * Ruft den Wert der collectionPointRef-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link PointRefStructure }
     *     
     */
    public PointRefStructure getCollectionPointRef() {
        return collectionPointRef;
    }

    /**
     * Legt den Wert der collectionPointRef-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link PointRefStructure }
     *     
     */
    public void setCollectionPointRef(PointRefStructure value) {
        this.collectionPointRef = value;
    }

}
