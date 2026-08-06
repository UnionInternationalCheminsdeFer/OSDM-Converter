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
 * Types describing common presentation properties for Print.
 * 
 * <p>Java-Klasse f�r PrintPresentationStructure complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="PrintPresentationStructure">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Colour" type="{http://www.netex.org.uk/netex}PrintColourValueType" minOccurs="0"/>
 *         &lt;element name="ColourName" type="{http://www.w3.org/2001/XMLSchema}normalizedString" minOccurs="0"/>
 *         &lt;element name="ColourSystem" type="{http://www.w3.org/2001/XMLSchema}normalizedString" minOccurs="0"/>
 *         &lt;element name="BackgroundColour" type="{http://www.netex.org.uk/netex}PrintColourValueType" minOccurs="0"/>
 *         &lt;element name="BackgroundColourName" type="{http://www.w3.org/2001/XMLSchema}normalizedString" minOccurs="0"/>
 *         &lt;element name="TextColour" type="{http://www.netex.org.uk/netex}PrintColourValueType" minOccurs="0"/>
 *         &lt;element name="TextColourName" type="{http://www.w3.org/2001/XMLSchema}normalizedString" minOccurs="0"/>
 *         &lt;element name="TextFont" type="{http://www.w3.org/2001/XMLSchema}normalizedString" minOccurs="0"/>
 *         &lt;element name="TextFontName" type="{http://www.w3.org/2001/XMLSchema}normalizedString" minOccurs="0"/>
 *         &lt;element name="TextLanguage" type="{http://www.w3.org/2001/XMLSchema}language" minOccurs="0"/>
 *         &lt;element name="FontSize" type="{http://www.netex.org.uk/netex}FontSizeEnumeration" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PrintPresentationStructure", propOrder = {
    "colour",
    "colourName",
    "colourSystem",
    "backgroundColour",
    "backgroundColourName",
    "textColour",
    "textColourName",
    "textFont",
    "textFontName",
    "textLanguage",
    "fontSize"
})
public class PrintPresentationStructure {

    @XmlElement(name = "Colour")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String colour;
    @XmlElement(name = "ColourName")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String colourName;
    @XmlElement(name = "ColourSystem")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String colourSystem;
    @XmlElement(name = "BackgroundColour")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String backgroundColour;
    @XmlElement(name = "BackgroundColourName")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String backgroundColourName;
    @XmlElement(name = "TextColour")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String textColour;
    @XmlElement(name = "TextColourName")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String textColourName;
    @XmlElement(name = "TextFont")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String textFont;
    @XmlElement(name = "TextFontName")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String textFontName;
    @XmlElement(name = "TextLanguage")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "language")
    protected String textLanguage;
    @XmlElement(name = "FontSize")
    @XmlSchemaType(name = "string")
    protected FontSizeEnumeration fontSize;

    /**
     * Ruft den Wert der colour-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getColour() {
        return colour;
    }

    /**
     * Legt den Wert der colour-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setColour(String value) {
        this.colour = value;
    }

    /**
     * Ruft den Wert der colourName-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getColourName() {
        return colourName;
    }

    /**
     * Legt den Wert der colourName-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setColourName(String value) {
        this.colourName = value;
    }

    /**
     * Ruft den Wert der colourSystem-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getColourSystem() {
        return colourSystem;
    }

    /**
     * Legt den Wert der colourSystem-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setColourSystem(String value) {
        this.colourSystem = value;
    }

    /**
     * Ruft den Wert der backgroundColour-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBackgroundColour() {
        return backgroundColour;
    }

    /**
     * Legt den Wert der backgroundColour-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBackgroundColour(String value) {
        this.backgroundColour = value;
    }

    /**
     * Ruft den Wert der backgroundColourName-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBackgroundColourName() {
        return backgroundColourName;
    }

    /**
     * Legt den Wert der backgroundColourName-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBackgroundColourName(String value) {
        this.backgroundColourName = value;
    }

    /**
     * Ruft den Wert der textColour-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTextColour() {
        return textColour;
    }

    /**
     * Legt den Wert der textColour-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTextColour(String value) {
        this.textColour = value;
    }

    /**
     * Ruft den Wert der textColourName-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTextColourName() {
        return textColourName;
    }

    /**
     * Legt den Wert der textColourName-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTextColourName(String value) {
        this.textColourName = value;
    }

    /**
     * Ruft den Wert der textFont-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTextFont() {
        return textFont;
    }

    /**
     * Legt den Wert der textFont-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTextFont(String value) {
        this.textFont = value;
    }

    /**
     * Ruft den Wert der textFontName-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTextFontName() {
        return textFontName;
    }

    /**
     * Legt den Wert der textFontName-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTextFontName(String value) {
        this.textFontName = value;
    }

    /**
     * Ruft den Wert der textLanguage-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTextLanguage() {
        return textLanguage;
    }

    /**
     * Legt den Wert der textLanguage-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTextLanguage(String value) {
        this.textLanguage = value;
    }

    /**
     * Ruft den Wert der fontSize-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FontSizeEnumeration }
     *     
     */
    public FontSizeEnumeration getFontSize() {
        return fontSize;
    }

    /**
     * Legt den Wert der fontSize-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FontSizeEnumeration }
     *     
     */
    public void setFontSize(FontSizeEnumeration value) {
        this.fontSize = value;
    }

}
