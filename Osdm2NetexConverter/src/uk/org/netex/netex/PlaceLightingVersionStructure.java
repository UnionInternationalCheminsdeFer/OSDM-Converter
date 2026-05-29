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


/**
 * Type for a PLACE LIGHTING EQUIPMENT.
 * 
 * <p>Java-Klasse f�r PlaceLighting_VersionStructure complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="PlaceLighting_VersionStructure">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.netex.org.uk/netex}AccessEquipment_VersionStructure">
 *       &lt;sequence>
 *         &lt;group ref="{http://www.netex.org.uk/netex}PlaceLightingGroup"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PlaceLighting_VersionStructure", propOrder = {
    "lighting",
    "alwaysLit",
    "lightingOnMethod"
})
@XmlSeeAlso({
    PlaceLighting.class
})
public class PlaceLightingVersionStructure
    extends AccessEquipmentVersionStructure
{

    @XmlElement(name = "Lighting")
    @XmlSchemaType(name = "normalizedString")
    protected LightingEnumeration lighting;
    @XmlElement(name = "AlwaysLit")
    protected Boolean alwaysLit;
    @XmlElement(name = "LightingOnMethod")
    @XmlSchemaType(name = "string")
    protected LightingOnMethodEnumeration lightingOnMethod;

    /**
     * Ruft den Wert der lighting-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link LightingEnumeration }
     *     
     */
    public LightingEnumeration getLighting() {
        return lighting;
    }

    /**
     * Legt den Wert der lighting-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link LightingEnumeration }
     *     
     */
    public void setLighting(LightingEnumeration value) {
        this.lighting = value;
    }

    /**
     * Ruft den Wert der alwaysLit-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAlwaysLit() {
        return alwaysLit;
    }

    /**
     * Legt den Wert der alwaysLit-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAlwaysLit(Boolean value) {
        this.alwaysLit = value;
    }

    /**
     * Ruft den Wert der lightingOnMethod-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link LightingOnMethodEnumeration }
     *     
     */
    public LightingOnMethodEnumeration getLightingOnMethod() {
        return lightingOnMethod;
    }

    /**
     * Legt den Wert der lightingOnMethod-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link LightingOnMethodEnumeration }
     *     
     */
    public void setLightingOnMethod(LightingOnMethodEnumeration value) {
        this.lightingOnMethod = value;
    }

}
