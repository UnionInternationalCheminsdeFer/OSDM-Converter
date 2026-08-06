//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// �nderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2026.05.22 um 10:24:00 AM CEST 
//


package uk.org.netex.netex;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Type for GENERAL SECTION. +v1.1.
 * 
 * <p>Java-Klasse f�r GeneralSection_VersionStructure complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="GeneralSection_VersionStructure">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.netex.org.uk/netex}Section_VersionStructure">
 *       &lt;sequence>
 *         &lt;group ref="{http://www.netex.org.uk/netex}GeneralSectionGroup"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GeneralSection_VersionStructure", propOrder = {
    "pointsOnSection",
    "linksOnSection"
})
@XmlSeeAlso({
    GeneralSection.class,
    FareSectionVersionStructure.class
})
public class GeneralSectionVersionStructure
    extends SectionVersionStructure
{

    protected PointsOnSectionRelStructure pointsOnSection;
    protected LinksOnSectionRelStructure linksOnSection;

    /**
     * Ruft den Wert der pointsOnSection-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link PointsOnSectionRelStructure }
     *     
     */
    public PointsOnSectionRelStructure getPointsOnSection() {
        return pointsOnSection;
    }

    /**
     * Legt den Wert der pointsOnSection-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link PointsOnSectionRelStructure }
     *     
     */
    public void setPointsOnSection(PointsOnSectionRelStructure value) {
        this.pointsOnSection = value;
    }

    /**
     * Ruft den Wert der linksOnSection-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link LinksOnSectionRelStructure }
     *     
     */
    public LinksOnSectionRelStructure getLinksOnSection() {
        return linksOnSection;
    }

    /**
     * Legt den Wert der linksOnSection-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link LinksOnSectionRelStructure }
     *     
     */
    public void setLinksOnSection(LinksOnSectionRelStructure value) {
        this.linksOnSection = value;
    }

}
