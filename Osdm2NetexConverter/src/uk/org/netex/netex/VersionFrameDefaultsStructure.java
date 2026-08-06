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
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.CollapsedStringAdapter;
import jakarta.xml.bind.annotation.adapters.NormalizedStringAdapter;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * Type for frame defaults.
 * 
 * <p>Java-Klasse f�r VersionFrameDefaultsStructure complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="VersionFrameDefaultsStructure">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="DefaultCodespaceRef" type="{http://www.netex.org.uk/netex}CodespaceRefStructure" minOccurs="0"/>
 *         &lt;element name="DefaultDataSourceRef" type="{http://www.netex.org.uk/netex}DataSourceRefStructure" minOccurs="0"/>
 *         &lt;element name="DefaultResponsibilitySetRef" type="{http://www.netex.org.uk/netex}ResponsibilitySetRefStructure" minOccurs="0"/>
 *         &lt;element name="DefaultLocale" type="{http://www.netex.org.uk/netex}LocaleStructure" minOccurs="0"/>
 *         &lt;element name="DefaultLocationSystem" type="{http://www.w3.org/2001/XMLSchema}normalizedString" minOccurs="0"/>
 *         &lt;element name="DefaultSystemOfUnits" type="{http://www.netex.org.uk/netex}SystemOfUnits" minOccurs="0"/>
 *         &lt;element name="DefaultCurrency" type="{http://www.netex.org.uk/netex}CurrencyType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VersionFrameDefaultsStructure", propOrder = {
    "defaultCodespaceRef",
    "defaultDataSourceRef",
    "defaultResponsibilitySetRef",
    "defaultLocale",
    "defaultLocationSystem",
    "defaultSystemOfUnits",
    "defaultCurrency"
})
public class VersionFrameDefaultsStructure {

    @XmlElement(name = "DefaultCodespaceRef")
    protected CodespaceRefStructure defaultCodespaceRef;
    @XmlElement(name = "DefaultDataSourceRef")
    protected DataSourceRefStructure defaultDataSourceRef;
    @XmlElement(name = "DefaultResponsibilitySetRef")
    protected ResponsibilitySetRefStructure defaultResponsibilitySetRef;
    @XmlElement(name = "DefaultLocale")
    protected LocaleStructure defaultLocale;
    @XmlElement(name = "DefaultLocationSystem")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String defaultLocationSystem;
    @XmlElement(name = "DefaultSystemOfUnits", defaultValue = "SiMetres")
    @XmlSchemaType(name = "normalizedString")
    protected SystemOfUnits defaultSystemOfUnits;
    @XmlElement(name = "DefaultCurrency")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NMTOKEN")
    protected String defaultCurrency;

    /**
     * Ruft den Wert der defaultCodespaceRef-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link CodespaceRefStructure }
     *     
     */
    public CodespaceRefStructure getDefaultCodespaceRef() {
        return defaultCodespaceRef;
    }

    /**
     * Legt den Wert der defaultCodespaceRef-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link CodespaceRefStructure }
     *     
     */
    public void setDefaultCodespaceRef(CodespaceRefStructure value) {
        this.defaultCodespaceRef = value;
    }

    /**
     * Ruft den Wert der defaultDataSourceRef-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link DataSourceRefStructure }
     *     
     */
    public DataSourceRefStructure getDefaultDataSourceRef() {
        return defaultDataSourceRef;
    }

    /**
     * Legt den Wert der defaultDataSourceRef-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link DataSourceRefStructure }
     *     
     */
    public void setDefaultDataSourceRef(DataSourceRefStructure value) {
        this.defaultDataSourceRef = value;
    }

    /**
     * Ruft den Wert der defaultResponsibilitySetRef-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ResponsibilitySetRefStructure }
     *     
     */
    public ResponsibilitySetRefStructure getDefaultResponsibilitySetRef() {
        return defaultResponsibilitySetRef;
    }

    /**
     * Legt den Wert der defaultResponsibilitySetRef-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ResponsibilitySetRefStructure }
     *     
     */
    public void setDefaultResponsibilitySetRef(ResponsibilitySetRefStructure value) {
        this.defaultResponsibilitySetRef = value;
    }

    /**
     * Ruft den Wert der defaultLocale-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link LocaleStructure }
     *     
     */
    public LocaleStructure getDefaultLocale() {
        return defaultLocale;
    }

    /**
     * Legt den Wert der defaultLocale-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link LocaleStructure }
     *     
     */
    public void setDefaultLocale(LocaleStructure value) {
        this.defaultLocale = value;
    }

    /**
     * Ruft den Wert der defaultLocationSystem-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDefaultLocationSystem() {
        return defaultLocationSystem;
    }

    /**
     * Legt den Wert der defaultLocationSystem-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDefaultLocationSystem(String value) {
        this.defaultLocationSystem = value;
    }

    /**
     * Ruft den Wert der defaultSystemOfUnits-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link SystemOfUnits }
     *     
     */
    public SystemOfUnits getDefaultSystemOfUnits() {
        return defaultSystemOfUnits;
    }

    /**
     * Legt den Wert der defaultSystemOfUnits-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link SystemOfUnits }
     *     
     */
    public void setDefaultSystemOfUnits(SystemOfUnits value) {
        this.defaultSystemOfUnits = value;
    }

    /**
     * Ruft den Wert der defaultCurrency-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDefaultCurrency() {
        return defaultCurrency;
    }

    /**
     * Legt den Wert der defaultCurrency-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDefaultCurrency(String value) {
        this.defaultCurrency = value;
    }

}
