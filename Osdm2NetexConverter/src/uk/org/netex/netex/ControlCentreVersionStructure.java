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
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Type for CONTROL CENTRE.
 * 
 * <p>Java-Klasse f�r ControlCentre_VersionStructure complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="ControlCentre_VersionStructure">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.netex.org.uk/netex}OrganisationPart_VersionStructure">
 *       &lt;sequence>
 *         &lt;group ref="{http://www.netex.org.uk/netex}ControlCentreGroup"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ControlCentre_VersionStructure", propOrder = {
    "number",
    "controlCentreCode",
    "departmentRef"
})
@XmlSeeAlso({
    ControlCentre.class
})
public class ControlCentreVersionStructure
    extends OrganisationPartVersionStructure
{

    @XmlElement(name = "Number")
    protected BigInteger number;
    @XmlElement(name = "ControlCentreCode")
    protected MultilingualString controlCentreCode;
    @XmlElement(name = "DepartmentRef")
    protected DepartmentRefStructure departmentRef;

    /**
     * Ruft den Wert der number-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getNumber() {
        return number;
    }

    /**
     * Legt den Wert der number-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setNumber(BigInteger value) {
        this.number = value;
    }

    /**
     * Ruft den Wert der controlCentreCode-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link MultilingualString }
     *     
     */
    public MultilingualString getControlCentreCode() {
        return controlCentreCode;
    }

    /**
     * Legt den Wert der controlCentreCode-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link MultilingualString }
     *     
     */
    public void setControlCentreCode(MultilingualString value) {
        this.controlCentreCode = value;
    }

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
