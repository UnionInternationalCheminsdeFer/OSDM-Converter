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
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.NormalizedStringAdapter;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * Type for ENTITY IN VERSION.
 * 
 * <p>Java-Klasse f�r EntityInVersionStructure complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="EntityInVersionStructure">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.netex.org.uk/netex}EntityStructure">
 *       &lt;sequence>
 *         &lt;group ref="{http://www.netex.org.uk/netex}EntityInVersionGroup" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attGroup ref="{http://www.netex.org.uk/netex}BasicModificationDetailsGroup"/>
 *       &lt;attribute name="dataSourceRef" type="{http://www.netex.org.uk/netex}DataSourceIdType" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EntityInVersionStructure", propOrder = {
    "validityConditions",
    "validBetween",
    "alternativeTexts"
})
@XmlSeeAlso({
    SimplePointVersionStructure.class,
    VersionedChildStructure.class,
    DataManagedObjectStructure.class
})
public class EntityInVersionStructure
    extends EntityStructure
{

    protected ValidityConditionsRelStructure validityConditions;
    @XmlElement(name = "ValidBetween")
    protected List<ValidBetween> validBetween;
    protected AlternativeTextsRelStructure alternativeTexts;
    @XmlAttribute(name = "dataSourceRef")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String dataSourceRef;
    @XmlAttribute(name = "created")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar created;
    @XmlAttribute(name = "changed")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar changed;
    @XmlAttribute(name = "modification")
    protected ModificationEnumeration modification;
    @XmlAttribute(name = "version")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String version;
    @XmlAttribute(name = "status")
    protected StatusEnumeration status;
    @XmlAttribute(name = "derivedFromVersionRef")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String derivedFromVersionRef;
    @XmlAttribute(name = "compatibleWithVersionFrameVersionRef")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String compatibleWithVersionFrameVersionRef;
    @XmlAttribute(name = "derivedFromObjectRef")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String derivedFromObjectRef;

    /**
     * Ruft den Wert der validityConditions-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ValidityConditionsRelStructure }
     *     
     */
    public ValidityConditionsRelStructure getValidityConditions() {
        return validityConditions;
    }

    /**
     * Legt den Wert der validityConditions-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ValidityConditionsRelStructure }
     *     
     */
    public void setValidityConditions(ValidityConditionsRelStructure value) {
        this.validityConditions = value;
    }

    /**
     * Gets the value of the validBetween property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the validBetween property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getValidBetween().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ValidBetween }
     * 
     * 
     */
    public List<ValidBetween> getValidBetween() {
        if (validBetween == null) {
            validBetween = new ArrayList<ValidBetween>();
        }
        return this.validBetween;
    }

    /**
     * Ruft den Wert der alternativeTexts-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link AlternativeTextsRelStructure }
     *     
     */
    public AlternativeTextsRelStructure getAlternativeTexts() {
        return alternativeTexts;
    }

    /**
     * Legt den Wert der alternativeTexts-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link AlternativeTextsRelStructure }
     *     
     */
    public void setAlternativeTexts(AlternativeTextsRelStructure value) {
        this.alternativeTexts = value;
    }

    /**
     * Ruft den Wert der dataSourceRef-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDataSourceRef() {
        return dataSourceRef;
    }

    /**
     * Legt den Wert der dataSourceRef-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDataSourceRef(String value) {
        this.dataSourceRef = value;
    }

    /**
     * Ruft den Wert der created-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCreated() {
        return created;
    }

    /**
     * Legt den Wert der created-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCreated(XMLGregorianCalendar value) {
        this.created = value;
    }

    /**
     * Ruft den Wert der changed-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getChanged() {
        return changed;
    }

    /**
     * Legt den Wert der changed-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setChanged(XMLGregorianCalendar value) {
        this.changed = value;
    }

    /**
     * Ruft den Wert der modification-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ModificationEnumeration }
     *     
     */
    public ModificationEnumeration getModification() {
        if (modification == null) {
            return ModificationEnumeration.NEW;
        } else {
            return modification;
        }
    }

    /**
     * Legt den Wert der modification-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ModificationEnumeration }
     *     
     */
    public void setModification(ModificationEnumeration value) {
        this.modification = value;
    }

    /**
     * Ruft den Wert der version-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVersion() {
        return version;
    }

    /**
     * Legt den Wert der version-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVersion(String value) {
        this.version = value;
    }

    /**
     * Ruft den Wert der status-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link StatusEnumeration }
     *     
     */
    public StatusEnumeration getStatus() {
        if (status == null) {
            return StatusEnumeration.ACTIVE;
        } else {
            return status;
        }
    }

    /**
     * Legt den Wert der status-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link StatusEnumeration }
     *     
     */
    public void setStatus(StatusEnumeration value) {
        this.status = value;
    }

    /**
     * Ruft den Wert der derivedFromVersionRef-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDerivedFromVersionRef() {
        return derivedFromVersionRef;
    }

    /**
     * Legt den Wert der derivedFromVersionRef-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDerivedFromVersionRef(String value) {
        this.derivedFromVersionRef = value;
    }

    /**
     * Ruft den Wert der compatibleWithVersionFrameVersionRef-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCompatibleWithVersionFrameVersionRef() {
        return compatibleWithVersionFrameVersionRef;
    }

    /**
     * Legt den Wert der compatibleWithVersionFrameVersionRef-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCompatibleWithVersionFrameVersionRef(String value) {
        this.compatibleWithVersionFrameVersionRef = value;
    }

    /**
     * Ruft den Wert der derivedFromObjectRef-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDerivedFromObjectRef() {
        return derivedFromObjectRef;
    }

    /**
     * Legt den Wert der derivedFromObjectRef-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDerivedFromObjectRef(String value) {
        this.derivedFromObjectRef = value;
    }

}
