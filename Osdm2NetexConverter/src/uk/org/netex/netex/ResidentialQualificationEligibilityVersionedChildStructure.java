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
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * Type for RESIDENTIAL QUALIFICATION ELIGIBILITY.
 * 
 * <p>Java-Klasse f�r ResidentialQualificationEligibility_VersionedChildStructure complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="ResidentialQualificationEligibility_VersionedChildStructure">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.netex.org.uk/netex}CustomerEligibility_VersionedChildStructure">
 *       &lt;sequence>
 *         &lt;group ref="{http://www.netex.org.uk/netex}ResidentialQualificationEligibilityGroup"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ResidentialQualificationEligibility_VersionedChildStructure", propOrder = {
    "residentialQualificationRef",
    "residencyType",
    "startDate",
    "endDate"
})
@XmlSeeAlso({
    ResidentialQualificationEligibility.class
})
public class ResidentialQualificationEligibilityVersionedChildStructure
    extends CustomerEligibilityVersionedChildStructure
{

    @XmlElement(name = "ResidentialQualificationRef")
    protected ResidentialQualificationRefStructure residentialQualificationRef;
    @XmlElement(name = "ResidencyType")
    @XmlSchemaType(name = "normalizedString")
    protected ResidenceTypeEnumeration residencyType;
    @XmlElement(name = "StartDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar startDate;
    @XmlElement(name = "EndDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar endDate;

    /**
     * Ruft den Wert der residentialQualificationRef-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ResidentialQualificationRefStructure }
     *     
     */
    public ResidentialQualificationRefStructure getResidentialQualificationRef() {
        return residentialQualificationRef;
    }

    /**
     * Legt den Wert der residentialQualificationRef-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ResidentialQualificationRefStructure }
     *     
     */
    public void setResidentialQualificationRef(ResidentialQualificationRefStructure value) {
        this.residentialQualificationRef = value;
    }

    /**
     * Ruft den Wert der residencyType-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ResidenceTypeEnumeration }
     *     
     */
    public ResidenceTypeEnumeration getResidencyType() {
        return residencyType;
    }

    /**
     * Legt den Wert der residencyType-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ResidenceTypeEnumeration }
     *     
     */
    public void setResidencyType(ResidenceTypeEnumeration value) {
        this.residencyType = value;
    }

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

}
