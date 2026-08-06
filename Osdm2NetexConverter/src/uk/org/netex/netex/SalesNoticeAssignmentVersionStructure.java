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
 * Type for SALES NOTICE ASSIGNMENT.
 * 
 * <p>Java-Klasse f�r SalesNoticeAssignment_VersionStructure complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="SalesNoticeAssignment_VersionStructure">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.netex.org.uk/netex}NoticeAssignment_VersionStructure">
 *       &lt;sequence>
 *         &lt;group ref="{http://www.netex.org.uk/netex}SalesNoticeAssignmentGroup"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SalesNoticeAssignment_VersionStructure", propOrder = {
    "countryRef",
    "salesOfferPackageRef",
    "groupOfSalesOfferPackagesRef"
})
@XmlSeeAlso({
    SalesNoticeAssignment.class
})
public class SalesNoticeAssignmentVersionStructure
    extends NoticeAssignmentVersionStructure
{

    @XmlElement(name = "CountryRef")
    protected CountryRef countryRef;
    @XmlElement(name = "SalesOfferPackageRef")
    protected SalesOfferPackageRefStructure salesOfferPackageRef;
    @XmlElement(name = "GroupOfSalesOfferPackagesRef")
    protected GroupOfSalesOfferPackagesRefStructure groupOfSalesOfferPackagesRef;

    /**
     * Ruft den Wert der countryRef-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link CountryRef }
     *     
     */
    public CountryRef getCountryRef() {
        return countryRef;
    }

    /**
     * Legt den Wert der countryRef-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link CountryRef }
     *     
     */
    public void setCountryRef(CountryRef value) {
        this.countryRef = value;
    }

    /**
     * Ruft den Wert der salesOfferPackageRef-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link SalesOfferPackageRefStructure }
     *     
     */
    public SalesOfferPackageRefStructure getSalesOfferPackageRef() {
        return salesOfferPackageRef;
    }

    /**
     * Legt den Wert der salesOfferPackageRef-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link SalesOfferPackageRefStructure }
     *     
     */
    public void setSalesOfferPackageRef(SalesOfferPackageRefStructure value) {
        this.salesOfferPackageRef = value;
    }

    /**
     * Ruft den Wert der groupOfSalesOfferPackagesRef-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link GroupOfSalesOfferPackagesRefStructure }
     *     
     */
    public GroupOfSalesOfferPackagesRefStructure getGroupOfSalesOfferPackagesRef() {
        return groupOfSalesOfferPackagesRef;
    }

    /**
     * Legt den Wert der groupOfSalesOfferPackagesRef-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link GroupOfSalesOfferPackagesRefStructure }
     *     
     */
    public void setGroupOfSalesOfferPackagesRef(GroupOfSalesOfferPackagesRefStructure value) {
        this.groupOfSalesOfferPackagesRef = value;
    }

}
