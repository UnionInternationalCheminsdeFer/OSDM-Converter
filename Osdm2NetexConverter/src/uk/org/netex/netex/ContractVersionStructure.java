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


/**
 * Type for an Contract.
 * 
 * <p>Java-Klasse f�r Contract_VersionStructure complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="Contract_VersionStructure">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.netex.org.uk/netex}DataManagedObjectStructure">
 *       &lt;sequence>
 *         &lt;group ref="{http://www.netex.org.uk/netex}ContractGroup"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Contract_VersionStructure", propOrder = {
    "name",
    "description",
    "contractType",
    "legalStatus",
    "contractGoverningLaw",
    "contractees",
    "contractors",
    "contractDocuments"
})
@XmlSeeAlso({
    Contract.class
})
public abstract class ContractVersionStructure
    extends DataManagedObjectStructure
{

    @XmlElement(name = "Name")
    protected MultilingualString name;
    @XmlElement(name = "Description")
    protected MultilingualString description;
    @XmlElement(name = "ContractType")
    @XmlSchemaType(name = "NMTOKEN")
    protected ContractTypeEnumeration contractType;
    @XmlElement(name = "LegalStatus")
    @XmlSchemaType(name = "NMTOKEN")
    protected LegalStatusEnumeration legalStatus;
    @XmlElement(name = "ContractGoverningLaw")
    protected MultilingualString contractGoverningLaw;
    protected ContractVersionStructure.Contractees contractees;
    @XmlElement(required = true)
    protected OrganisationRefsRelStructure contractors;
    protected ContractVersionStructure.ContractDocuments contractDocuments;

    /**
     * Ruft den Wert der name-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link MultilingualString }
     *     
     */
    public MultilingualString getName() {
        return name;
    }

    /**
     * Legt den Wert der name-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link MultilingualString }
     *     
     */
    public void setName(MultilingualString value) {
        this.name = value;
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
     * Ruft den Wert der contractType-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ContractTypeEnumeration }
     *     
     */
    public ContractTypeEnumeration getContractType() {
        return contractType;
    }

    /**
     * Legt den Wert der contractType-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ContractTypeEnumeration }
     *     
     */
    public void setContractType(ContractTypeEnumeration value) {
        this.contractType = value;
    }

    /**
     * Ruft den Wert der legalStatus-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link LegalStatusEnumeration }
     *     
     */
    public LegalStatusEnumeration getLegalStatus() {
        return legalStatus;
    }

    /**
     * Legt den Wert der legalStatus-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link LegalStatusEnumeration }
     *     
     */
    public void setLegalStatus(LegalStatusEnumeration value) {
        this.legalStatus = value;
    }

    /**
     * Ruft den Wert der contractGoverningLaw-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link MultilingualString }
     *     
     */
    public MultilingualString getContractGoverningLaw() {
        return contractGoverningLaw;
    }

    /**
     * Legt den Wert der contractGoverningLaw-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link MultilingualString }
     *     
     */
    public void setContractGoverningLaw(MultilingualString value) {
        this.contractGoverningLaw = value;
    }

    /**
     * Ruft den Wert der contractees-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ContractVersionStructure.Contractees }
     *     
     */
    public ContractVersionStructure.Contractees getContractees() {
        return contractees;
    }

    /**
     * Legt den Wert der contractees-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ContractVersionStructure.Contractees }
     *     
     */
    public void setContractees(ContractVersionStructure.Contractees value) {
        this.contractees = value;
    }

    /**
     * Ruft den Wert der contractors-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link OrganisationRefsRelStructure }
     *     
     */
    public OrganisationRefsRelStructure getContractors() {
        return contractors;
    }

    /**
     * Legt den Wert der contractors-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link OrganisationRefsRelStructure }
     *     
     */
    public void setContractors(OrganisationRefsRelStructure value) {
        this.contractors = value;
    }

    /**
     * Ruft den Wert der contractDocuments-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ContractVersionStructure.ContractDocuments }
     *     
     */
    public ContractVersionStructure.ContractDocuments getContractDocuments() {
        return contractDocuments;
    }

    /**
     * Legt den Wert der contractDocuments-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ContractVersionStructure.ContractDocuments }
     *     
     */
    public void setContractDocuments(ContractVersionStructure.ContractDocuments value) {
        this.contractDocuments = value;
    }


    /**
     * <p>Java-Klasse f�r anonymous complex type.
     * 
     * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;extension base="{http://www.netex.org.uk/netex}infoLinks_RelStructure">
     *     &lt;/extension>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class ContractDocuments
        extends InfoLinksRelStructure
    {


    }


    /**
     * <p>Java-Klasse f�r anonymous complex type.
     * 
     * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;extension base="{http://www.netex.org.uk/netex}organisationRefs_RelStructure">
     *     &lt;/extension>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class Contractees
        extends OrganisationRefsRelStructure
    {


    }

}
