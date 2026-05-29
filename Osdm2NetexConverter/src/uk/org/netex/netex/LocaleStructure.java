//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// �nderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2026.05.22 um 10:24:00 AM CEST 
//


package uk.org.netex.netex;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.CollapsedStringAdapter;
import jakarta.xml.bind.annotation.adapters.NormalizedStringAdapter;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * Type describing common locale dependent properties.
 * 
 * <p>Java-Klasse f�r LocaleStructure complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="LocaleStructure">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="TimeZoneOffset" type="{http://www.netex.org.uk/netex}TimeZoneOffsetType" minOccurs="0"/>
 *         &lt;element name="TimeZone" type="{http://www.w3.org/2001/XMLSchema}normalizedString" minOccurs="0"/>
 *         &lt;element name="SummerTimeZoneOffset" type="{http://www.netex.org.uk/netex}TimeZoneOffsetType" minOccurs="0"/>
 *         &lt;element name="SummerTimeZone" type="{http://www.w3.org/2001/XMLSchema}normalizedString" minOccurs="0"/>
 *         &lt;element name="DefaultLanguage" type="{http://www.w3.org/2001/XMLSchema}language" minOccurs="0"/>
 *         &lt;element name="languages" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="LanguageUsage" type="{http://www.netex.org.uk/netex}LanguageUsageStructure" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LocaleStructure", propOrder = {
    "timeZoneOffset",
    "timeZone",
    "summerTimeZoneOffset",
    "summerTimeZone",
    "defaultLanguage",
    "languages"
})
public class LocaleStructure {

    @XmlElement(name = "TimeZoneOffset")
    protected BigDecimal timeZoneOffset;
    @XmlElement(name = "TimeZone")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String timeZone;
    @XmlElement(name = "SummerTimeZoneOffset")
    protected BigDecimal summerTimeZoneOffset;
    @XmlElement(name = "SummerTimeZone")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String summerTimeZone;
    @XmlElement(name = "DefaultLanguage")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "language")
    protected String defaultLanguage;
    protected LocaleStructure.Languages languages;

    /**
     * Ruft den Wert der timeZoneOffset-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTimeZoneOffset() {
        return timeZoneOffset;
    }

    /**
     * Legt den Wert der timeZoneOffset-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTimeZoneOffset(BigDecimal value) {
        this.timeZoneOffset = value;
    }

    /**
     * Ruft den Wert der timeZone-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTimeZone() {
        return timeZone;
    }

    /**
     * Legt den Wert der timeZone-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTimeZone(String value) {
        this.timeZone = value;
    }

    /**
     * Ruft den Wert der summerTimeZoneOffset-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getSummerTimeZoneOffset() {
        return summerTimeZoneOffset;
    }

    /**
     * Legt den Wert der summerTimeZoneOffset-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setSummerTimeZoneOffset(BigDecimal value) {
        this.summerTimeZoneOffset = value;
    }

    /**
     * Ruft den Wert der summerTimeZone-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSummerTimeZone() {
        return summerTimeZone;
    }

    /**
     * Legt den Wert der summerTimeZone-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSummerTimeZone(String value) {
        this.summerTimeZone = value;
    }

    /**
     * Ruft den Wert der defaultLanguage-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDefaultLanguage() {
        return defaultLanguage;
    }

    /**
     * Legt den Wert der defaultLanguage-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDefaultLanguage(String value) {
        this.defaultLanguage = value;
    }

    /**
     * Ruft den Wert der languages-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link LocaleStructure.Languages }
     *     
     */
    public LocaleStructure.Languages getLanguages() {
        return languages;
    }

    /**
     * Legt den Wert der languages-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link LocaleStructure.Languages }
     *     
     */
    public void setLanguages(LocaleStructure.Languages value) {
        this.languages = value;
    }


    /**
     * <p>Java-Klasse f�r anonymous complex type.
     * 
     * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="LanguageUsage" type="{http://www.netex.org.uk/netex}LanguageUsageStructure" maxOccurs="unbounded" minOccurs="0"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "languageUsage"
    })
    public static class Languages {

        @XmlElement(name = "LanguageUsage")
        protected List<LanguageUsageStructure> languageUsage;

        /**
         * Gets the value of the languageUsage property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the languageUsage property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getLanguageUsage().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link LanguageUsageStructure }
         * 
         * 
         */
        public List<LanguageUsageStructure> getLanguageUsage() {
            if (languageUsage == null) {
                languageUsage = new ArrayList<LanguageUsageStructure>();
            }
            return this.languageUsage;
        }

    }

}
