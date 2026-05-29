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
 * Type for SERVICE JOURNEY PATTERN.
 * 
 * <p>Java-Klasse f�r ServiceJourneyPattern_VersionStructure complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="ServiceJourneyPattern_VersionStructure">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.netex.org.uk/netex}JourneyPattern_VersionStructure">
 *       &lt;sequence>
 *         &lt;group ref="{http://www.netex.org.uk/netex}ServiceJourneyPatternGroup"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ServiceJourneyPattern_VersionStructure", propOrder = {
    "serviceJourneyPatternType"
})
@XmlSeeAlso({
    ServiceJourneyPattern.class
})
public class ServiceJourneyPatternVersionStructure
    extends JourneyPatternVersionStructure
{

    @XmlElement(name = "ServiceJourneyPatternType")
    @XmlSchemaType(name = "NMTOKEN")
    protected ServiceJourneyPatternTypeEnumeration serviceJourneyPatternType;

    /**
     * Ruft den Wert der serviceJourneyPatternType-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ServiceJourneyPatternTypeEnumeration }
     *     
     */
    public ServiceJourneyPatternTypeEnumeration getServiceJourneyPatternType() {
        return serviceJourneyPatternType;
    }

    /**
     * Legt den Wert der serviceJourneyPatternType-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ServiceJourneyPatternTypeEnumeration }
     *     
     */
    public void setServiceJourneyPatternType(ServiceJourneyPatternTypeEnumeration value) {
        this.serviceJourneyPatternType = value;
    }

}
