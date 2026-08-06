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
 * Type for of a USER NEED.
 * 
 * <p>Java-Klasse f�r UserNeed_VersionedChildStructure complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="UserNeed_VersionedChildStructure">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.netex.org.uk/netex}VersionedChildStructure">
 *       &lt;sequence>
 *         &lt;group ref="{http://www.netex.org.uk/netex}UserNeedGroup"/>
 *         &lt;element name="Excluded" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="NeedRanking" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UserNeed_VersionedChildStructure", propOrder = {
    "mobilityNeed",
    "psychosensoryNeed",
    "medicalNeed",
    "encumbranceNeed",
    "excluded",
    "needRanking"
})
@XmlSeeAlso({
    SuitabilityVersionedChildStructure.class,
    UserNeed.class
})
public class UserNeedVersionedChildStructure
    extends VersionedChildStructure
{

    @XmlElement(name = "MobilityNeed")
    @XmlSchemaType(name = "NMTOKEN")
    protected MobilityEnumeration mobilityNeed;
    @XmlElement(name = "PsychosensoryNeed")
    @XmlSchemaType(name = "NMTOKEN")
    protected PsychosensoryNeedEnumeration psychosensoryNeed;
    @XmlElement(name = "MedicalNeed")
    protected MedicalNeedEnumeration medicalNeed;
    @XmlElement(name = "EncumbranceNeed")
    @XmlSchemaType(name = "NMTOKEN")
    protected EncumbranceEnumeration encumbranceNeed;
    @XmlElement(name = "Excluded")
    protected Boolean excluded;
    @XmlElement(name = "NeedRanking")
    protected BigInteger needRanking;

    /**
     * Ruft den Wert der mobilityNeed-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link MobilityEnumeration }
     *     
     */
    public MobilityEnumeration getMobilityNeed() {
        return mobilityNeed;
    }

    /**
     * Legt den Wert der mobilityNeed-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link MobilityEnumeration }
     *     
     */
    public void setMobilityNeed(MobilityEnumeration value) {
        this.mobilityNeed = value;
    }

    /**
     * Ruft den Wert der psychosensoryNeed-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link PsychosensoryNeedEnumeration }
     *     
     */
    public PsychosensoryNeedEnumeration getPsychosensoryNeed() {
        return psychosensoryNeed;
    }

    /**
     * Legt den Wert der psychosensoryNeed-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link PsychosensoryNeedEnumeration }
     *     
     */
    public void setPsychosensoryNeed(PsychosensoryNeedEnumeration value) {
        this.psychosensoryNeed = value;
    }

    /**
     * Ruft den Wert der medicalNeed-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link MedicalNeedEnumeration }
     *     
     */
    public MedicalNeedEnumeration getMedicalNeed() {
        return medicalNeed;
    }

    /**
     * Legt den Wert der medicalNeed-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link MedicalNeedEnumeration }
     *     
     */
    public void setMedicalNeed(MedicalNeedEnumeration value) {
        this.medicalNeed = value;
    }

    /**
     * Ruft den Wert der encumbranceNeed-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link EncumbranceEnumeration }
     *     
     */
    public EncumbranceEnumeration getEncumbranceNeed() {
        return encumbranceNeed;
    }

    /**
     * Legt den Wert der encumbranceNeed-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link EncumbranceEnumeration }
     *     
     */
    public void setEncumbranceNeed(EncumbranceEnumeration value) {
        this.encumbranceNeed = value;
    }

    /**
     * Ruft den Wert der excluded-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isExcluded() {
        return excluded;
    }

    /**
     * Legt den Wert der excluded-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setExcluded(Boolean value) {
        this.excluded = value;
    }

    /**
     * Ruft den Wert der needRanking-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getNeedRanking() {
        return needRanking;
    }

    /**
     * Legt den Wert der needRanking-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setNeedRanking(BigInteger value) {
        this.needRanking = value;
    }

}
