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
 *  Type for RESPONSIBILITY ROLE ASSIGNMENT.
 * 
 * <p>Java-Klasse f�r ResponsibilityRoleAssignment_VersionedChildStructure complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="ResponsibilityRoleAssignment_VersionedChildStructure">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.netex.org.uk/netex}VersionedChildStructure">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.netex.org.uk/netex}ResponsibilitySetRef" minOccurs="0"/>
 *         &lt;element name="Description" type="{http://www.netex.org.uk/netex}MultilingualString" minOccurs="0"/>
 *         &lt;group ref="{http://www.netex.org.uk/netex}ResponsibilityRolesGroup"/>
 *         &lt;group ref="{http://www.netex.org.uk/netex}ResponsiblePartiesGroup"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ResponsibilityRoleAssignment_VersionedChildStructure", propOrder = {
    "responsibilitySetRef",
    "description",
    "dataRoleType",
    "stakeholderRoleType",
    "typeOfResponsibilityRoleRef",
    "responsibilityRoleRef",
    "responsibleOrganisationRef",
    "responsiblePartRef",
    "responsibleAreaRef",
    "associatedContract"
})
@XmlSeeAlso({
    ResponsibilityRoleAssignment.class
})
public class ResponsibilityRoleAssignmentVersionedChildStructure
    extends VersionedChildStructure
{

    @XmlElement(name = "ResponsibilitySetRef")
    protected ResponsibilitySetRefStructure responsibilitySetRef;
    @XmlElement(name = "Description")
    protected MultilingualString description;
    @XmlList
    @XmlElement(name = "DataRoleType")
    protected List<DataRoleTypeEnumeration> dataRoleType;
    @XmlList
    @XmlElement(name = "StakeholderRoleType")
    protected List<String> stakeholderRoleType;
    @XmlElement(name = "TypeOfResponsibilityRoleRef")
    protected TypeOfResponsibilityRoleRefStructure typeOfResponsibilityRoleRef;
    @XmlElement(name = "ResponsibilityRoleRef")
    protected ResponsibilityRoleRefStructure responsibilityRoleRef;
    @XmlElement(name = "ResponsibleOrganisationRef")
    protected OrganisationRefStructure responsibleOrganisationRef;
    @XmlElement(name = "ResponsiblePartRef")
    protected OrganisationPartRefStructure responsiblePartRef;
    @XmlElement(name = "ResponsibleAreaRef")
    protected AdministrativeZoneRefStructure responsibleAreaRef;
    @XmlElement(name = "AssociatedContract")
    protected ContractRefRelStructure associatedContract;

    /**
     * Ruft den Wert der responsibilitySetRef-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ResponsibilitySetRefStructure }
     *     
     */
    public ResponsibilitySetRefStructure getResponsibilitySetRef() {
        return responsibilitySetRef;
    }

    /**
     * Legt den Wert der responsibilitySetRef-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ResponsibilitySetRefStructure }
     *     
     */
    public void setResponsibilitySetRef(ResponsibilitySetRefStructure value) {
        this.responsibilitySetRef = value;
    }

    /**
     * Ruft den Wert der description-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link MultilingualString }
     *     
     */
    public MultilingualString getDescription() {
        return description;
    }

    /**
     * Legt den Wert der description-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link MultilingualString }
     *     
     */
    public void setDescription(MultilingualString value) {
        this.description = value;
    }

    /**
     * Gets the value of the dataRoleType property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the dataRoleType property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDataRoleType().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DataRoleTypeEnumeration }
     * 
     * 
     */
    public List<DataRoleTypeEnumeration> getDataRoleType() {
        if (dataRoleType == null) {
            dataRoleType = new ArrayList<DataRoleTypeEnumeration>();
        }
        return this.dataRoleType;
    }

    /**
     * Gets the value of the stakeholderRoleType property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the stakeholderRoleType property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getStakeholderRoleType().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getStakeholderRoleType() {
        if (stakeholderRoleType == null) {
            stakeholderRoleType = new ArrayList<String>();
        }
        return this.stakeholderRoleType;
    }

    /**
     * Ruft den Wert der typeOfResponsibilityRoleRef-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link TypeOfResponsibilityRoleRefStructure }
     *     
     */
    public TypeOfResponsibilityRoleRefStructure getTypeOfResponsibilityRoleRef() {
        return typeOfResponsibilityRoleRef;
    }

    /**
     * Legt den Wert der typeOfResponsibilityRoleRef-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeOfResponsibilityRoleRefStructure }
     *     
     */
    public void setTypeOfResponsibilityRoleRef(TypeOfResponsibilityRoleRefStructure value) {
        this.typeOfResponsibilityRoleRef = value;
    }

    /**
     * Ruft den Wert der responsibilityRoleRef-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ResponsibilityRoleRefStructure }
     *     
     */
    public ResponsibilityRoleRefStructure getResponsibilityRoleRef() {
        return responsibilityRoleRef;
    }

    /**
     * Legt den Wert der responsibilityRoleRef-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ResponsibilityRoleRefStructure }
     *     
     */
    public void setResponsibilityRoleRef(ResponsibilityRoleRefStructure value) {
        this.responsibilityRoleRef = value;
    }

    /**
     * Ruft den Wert der responsibleOrganisationRef-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link OrganisationRefStructure }
     *     
     */
    public OrganisationRefStructure getResponsibleOrganisationRef() {
        return responsibleOrganisationRef;
    }

    /**
     * Legt den Wert der responsibleOrganisationRef-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link OrganisationRefStructure }
     *     
     */
    public void setResponsibleOrganisationRef(OrganisationRefStructure value) {
        this.responsibleOrganisationRef = value;
    }

    /**
     * Ruft den Wert der responsiblePartRef-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link OrganisationPartRefStructure }
     *     
     */
    public OrganisationPartRefStructure getResponsiblePartRef() {
        return responsiblePartRef;
    }

    /**
     * Legt den Wert der responsiblePartRef-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link OrganisationPartRefStructure }
     *     
     */
    public void setResponsiblePartRef(OrganisationPartRefStructure value) {
        this.responsiblePartRef = value;
    }

    /**
     * Ruft den Wert der responsibleAreaRef-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link AdministrativeZoneRefStructure }
     *     
     */
    public AdministrativeZoneRefStructure getResponsibleAreaRef() {
        return responsibleAreaRef;
    }

    /**
     * Legt den Wert der responsibleAreaRef-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link AdministrativeZoneRefStructure }
     *     
     */
    public void setResponsibleAreaRef(AdministrativeZoneRefStructure value) {
        this.responsibleAreaRef = value;
    }

    /**
     * Ruft den Wert der associatedContract-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ContractRefRelStructure }
     *     
     */
    public ContractRefRelStructure getAssociatedContract() {
        return associatedContract;
    }

    /**
     * Legt den Wert der associatedContract-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ContractRefRelStructure }
     *     
     */
    public void setAssociatedContract(ContractRefRelStructure value) {
        this.associatedContract = value;
    }

}
