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
 * Type for TEMPLATE VEHICLE JOURNEY.
 * 
 * <p>Java-Klasse f�r TemplateServiceJourney_VersionStructure complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="TemplateServiceJourney_VersionStructure">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.netex.org.uk/netex}ServiceJourney_VersionStructure">
 *       &lt;sequence>
 *         &lt;group ref="{http://www.netex.org.uk/netex}TemplateVehicleJourneyGroup"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TemplateServiceJourney_VersionStructure", propOrder = {
    "templateVehicleJourneyType",
    "frequencyGroups"
})
@XmlSeeAlso({
    TemplateServiceJourney.class
})
public class TemplateServiceJourneyVersionStructure
    extends ServiceJourneyVersionStructure
{

    @XmlElement(name = "TemplateVehicleJourneyType")
    @XmlSchemaType(name = "NMTOKEN")
    protected TemplateVehicleJourneyTypeEnumeration templateVehicleJourneyType;
    protected FrequencyGroupsRelStructure frequencyGroups;

    /**
     * Ruft den Wert der templateVehicleJourneyType-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link TemplateVehicleJourneyTypeEnumeration }
     *     
     */
    public TemplateVehicleJourneyTypeEnumeration getTemplateVehicleJourneyType() {
        return templateVehicleJourneyType;
    }

    /**
     * Legt den Wert der templateVehicleJourneyType-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link TemplateVehicleJourneyTypeEnumeration }
     *     
     */
    public void setTemplateVehicleJourneyType(TemplateVehicleJourneyTypeEnumeration value) {
        this.templateVehicleJourneyType = value;
    }

    /**
     * Ruft den Wert der frequencyGroups-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FrequencyGroupsRelStructure }
     *     
     */
    public FrequencyGroupsRelStructure getFrequencyGroups() {
        return frequencyGroups;
    }

    /**
     * Legt den Wert der frequencyGroups-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FrequencyGroupsRelStructure }
     *     
     */
    public void setFrequencyGroups(FrequencyGroupsRelStructure value) {
        this.frequencyGroups = value;
    }

}
