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
 * Type for a TARIFF ZONE.
 * 
 * <p>Java-Klasse f�r TariffZone_VersionStructure complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="TariffZone_VersionStructure">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.netex.org.uk/netex}Zone_VersionStructure">
 *       &lt;sequence>
 *         &lt;group ref="{http://www.netex.org.uk/netex}TariffZoneGroup"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TariffZone_VersionStructure", propOrder = {
    "presentation",
    "printedPresentation",
    "publicCode"
})
@XmlSeeAlso({
    TariffZone.class,
    FareZoneVersionStructure.class
})
public class TariffZoneVersionStructure
    extends ZoneVersionStructure
{

    @XmlElement(name = "Presentation")
    protected PresentationStructure presentation;
    @XmlElement(name = "PrintedPresentation")
    protected PrintPresentationStructure printedPresentation;
    @XmlElement(name = "PublicCode")
    protected PublicCodeStructure publicCode;

    /**
     * Ruft den Wert der presentation-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link PresentationStructure }
     *     
     */
    public PresentationStructure getPresentation() {
        return presentation;
    }

    /**
     * Legt den Wert der presentation-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link PresentationStructure }
     *     
     */
    public void setPresentation(PresentationStructure value) {
        this.presentation = value;
    }

    /**
     * Ruft den Wert der printedPresentation-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link PrintPresentationStructure }
     *     
     */
    public PrintPresentationStructure getPrintedPresentation() {
        return printedPresentation;
    }

    /**
     * Legt den Wert der printedPresentation-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link PrintPresentationStructure }
     *     
     */
    public void setPrintedPresentation(PrintPresentationStructure value) {
        this.printedPresentation = value;
    }

    /**
     * Ruft den Wert der publicCode-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link PublicCodeStructure }
     *     
     */
    public PublicCodeStructure getPublicCode() {
        return publicCode;
    }

    /**
     * Legt den Wert der publicCode-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link PublicCodeStructure }
     *     
     */
    public void setPublicCode(PublicCodeStructure value) {
        this.publicCode = value;
    }

}
