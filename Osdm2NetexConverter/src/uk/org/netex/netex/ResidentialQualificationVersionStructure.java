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
import javax.xml.datatype.Duration;


/**
 * Type for RESIDENTIAL QUALIFICATION.
 * 
 * <p>Java-Klasse f�r ResidentialQualification_VersionStructure complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="ResidentialQualification_VersionStructure">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.netex.org.uk/netex}VersionedChildStructure">
 *       &lt;sequence>
 *         &lt;group ref="{http://www.netex.org.uk/netex}ResidentialQualificationGroup"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ResidentialQualification_VersionStructure", propOrder = {
    "name",
    "description",
    "parentRef",
    "mustReside",
    "topographicPlaceRef",
    "residenceType",
    "minimumDuration"
})
@XmlSeeAlso({
    ResidentialQualification.class
})
public class ResidentialQualificationVersionStructure
    extends VersionedChildStructure
{

    @XmlElement(name = "Name")
    protected MultilingualString name;
    @XmlElement(name = "Description")
    protected MultilingualString description;
    @XmlElement(name = "ParentRef")
    protected UsageParameterRefStructure parentRef;
    @XmlElement(name = "MustReside")
    protected Boolean mustReside;
    @XmlElement(name = "TopographicPlaceRef")
    protected TopographicPlaceRefStructure topographicPlaceRef;
    @XmlElement(name = "ResidenceType", defaultValue = "live")
    @XmlSchemaType(name = "normalizedString")
    protected ResidenceTypeEnumeration residenceType;
    @XmlElement(name = "MinimumDuration")
    protected Duration minimumDuration;

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
     * Ruft den Wert der parentRef-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link UsageParameterRefStructure }
     *     
     */
    public UsageParameterRefStructure getParentRef() {
        return parentRef;
    }

    /**
     * Legt den Wert der parentRef-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link UsageParameterRefStructure }
     *     
     */
    public void setParentRef(UsageParameterRefStructure value) {
        this.parentRef = value;
    }

    /**
     * Ruft den Wert der mustReside-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMustReside() {
        return mustReside;
    }

    /**
     * Legt den Wert der mustReside-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMustReside(Boolean value) {
        this.mustReside = value;
    }

    /**
     * Ruft den Wert der topographicPlaceRef-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link TopographicPlaceRefStructure }
     *     
     */
    public TopographicPlaceRefStructure getTopographicPlaceRef() {
        return topographicPlaceRef;
    }

    /**
     * Legt den Wert der topographicPlaceRef-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link TopographicPlaceRefStructure }
     *     
     */
    public void setTopographicPlaceRef(TopographicPlaceRefStructure value) {
        this.topographicPlaceRef = value;
    }

    /**
     * Ruft den Wert der residenceType-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ResidenceTypeEnumeration }
     *     
     */
    public ResidenceTypeEnumeration getResidenceType() {
        return residenceType;
    }

    /**
     * Legt den Wert der residenceType-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ResidenceTypeEnumeration }
     *     
     */
    public void setResidenceType(ResidenceTypeEnumeration value) {
        this.residenceType = value;
    }

    /**
     * Ruft den Wert der minimumDuration-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Duration }
     *     
     */
    public Duration getMinimumDuration() {
        return minimumDuration;
    }

    /**
     * Legt den Wert der minimumDuration-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Duration }
     *     
     */
    public void setMinimumDuration(Duration value) {
        this.minimumDuration = value;
    }

}
