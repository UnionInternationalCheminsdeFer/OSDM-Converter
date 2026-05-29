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
 * Type for a DEPARTMENT.
 * 
 * <p>Java-Klasse f�r Department_VersionStructure complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="Department_VersionStructure">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.netex.org.uk/netex}OrganisationPart_VersionStructure">
 *       &lt;sequence>
 *         &lt;group ref="{http://www.netex.org.uk/netex}DepartmentGroup"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Department_VersionStructure", propOrder = {
    "typeOfOperationRef",
    "units"
})
@XmlSeeAlso({
    Department.class,
    OperatingDepartmentVersionStructure.class
})
public class DepartmentVersionStructure
    extends OrganisationPartVersionStructure
{

    @XmlElement(name = "TypeOfOperationRef")
    protected TypeOfOperationRefStructure typeOfOperationRef;
    protected OrganisationalUnitRefsRelStructure units;

    /**
     * Ruft den Wert der typeOfOperationRef-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link TypeOfOperationRefStructure }
     *     
     */
    public TypeOfOperationRefStructure getTypeOfOperationRef() {
        return typeOfOperationRef;
    }

    /**
     * Legt den Wert der typeOfOperationRef-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeOfOperationRefStructure }
     *     
     */
    public void setTypeOfOperationRef(TypeOfOperationRefStructure value) {
        this.typeOfOperationRef = value;
    }

    /**
     * Ruft den Wert der units-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link OrganisationalUnitRefsRelStructure }
     *     
     */
    public OrganisationalUnitRefsRelStructure getUnits() {
        return units;
    }

    /**
     * Legt den Wert der units-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link OrganisationalUnitRefsRelStructure }
     *     
     */
    public void setUnits(OrganisationalUnitRefsRelStructure value) {
        this.units = value;
    }

}
