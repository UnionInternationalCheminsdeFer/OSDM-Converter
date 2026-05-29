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
 * Type for an ORGANISATION. DAY TYPE.
 * 
 * <p>Java-Klasse f�r OrganisationDayType_VersionStructure complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="OrganisationDayType_VersionStructure">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.netex.org.uk/netex}DayType_VersionStructure">
 *       &lt;group ref="{http://www.netex.org.uk/netex}OrganisationDayTypeGroup"/>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OrganisationDayType_VersionStructure", propOrder = {
    "isServiceDay",
    "servicedOrganisationRef"
})
@XmlSeeAlso({
    OrganisationDayType.class
})
public class OrganisationDayTypeVersionStructure
    extends DayTypeVersionStructure
{

    @XmlElement(name = "IsServiceDay")
    protected Boolean isServiceDay;
    @XmlElement(name = "ServicedOrganisationRef")
    protected ServicedOrganisationRefStructure servicedOrganisationRef;

    /**
     * Ruft den Wert der isServiceDay-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsServiceDay() {
        return isServiceDay;
    }

    /**
     * Legt den Wert der isServiceDay-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsServiceDay(Boolean value) {
        this.isServiceDay = value;
    }

    /**
     * Ruft den Wert der servicedOrganisationRef-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ServicedOrganisationRefStructure }
     *     
     */
    public ServicedOrganisationRefStructure getServicedOrganisationRef() {
        return servicedOrganisationRef;
    }

    /**
     * Legt den Wert der servicedOrganisationRef-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ServicedOrganisationRefStructure }
     *     
     */
    public void setServicedOrganisationRef(ServicedOrganisationRefStructure value) {
        this.servicedOrganisationRef = value;
    }

}
