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
 * Type for a ORGANISATIONAL UNIT.
 * 
 * <p>Java-Klasse f�r OrganisationalUnit_VersionStructure complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="OrganisationalUnit_VersionStructure">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.netex.org.uk/netex}OrganisationPart_VersionStructure">
 *       &lt;sequence>
 *         &lt;group ref="{http://www.netex.org.uk/netex}OrganisationalUnitGroup"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OrganisationalUnit_VersionStructure", propOrder = {
    "departmentRef"
})
@XmlSeeAlso({
    OrganisationalUnit.class
})
public class OrganisationalUnitVersionStructure
    extends OrganisationPartVersionStructure
{

    @XmlElement(name = "DepartmentRef")
    protected DepartmentRefStructure departmentRef;

    /**
     * Ruft den Wert der departmentRef-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link DepartmentRefStructure }
     *     
     */
    public DepartmentRefStructure getDepartmentRef() {
        return departmentRef;
    }

    /**
     * Legt den Wert der departmentRef-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link DepartmentRefStructure }
     *     
     */
    public void setDepartmentRef(DepartmentRefStructure value) {
        this.departmentRef = value;
    }

}
