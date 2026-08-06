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
 * Type for ONLINE SERVICE.
 * 
 * <p>Java-Klasse f�r OnlineService_VersionStructure complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="OnlineService_VersionStructure">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.netex.org.uk/netex}MobilityService_VersionStructure">
 *       &lt;sequence>
 *         &lt;group ref="{http://www.netex.org.uk/netex}OnlineServiceGroup"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OnlineService_VersionStructure", propOrder = {
    "logInRequired",
    "proposingServices"
})
@XmlSeeAlso({
    OnlineService.class
})
public class OnlineServiceVersionStructure
    extends MobilityServiceVersionStructure
{

    @XmlElement(name = "LogInRequired")
    protected Boolean logInRequired;
    protected MobilityServiceRefsRelStructure proposingServices;

    /**
     * Ruft den Wert der logInRequired-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isLogInRequired() {
        return logInRequired;
    }

    /**
     * Legt den Wert der logInRequired-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setLogInRequired(Boolean value) {
        this.logInRequired = value;
    }

    /**
     * Ruft den Wert der proposingServices-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link MobilityServiceRefsRelStructure }
     *     
     */
    public MobilityServiceRefsRelStructure getProposingServices() {
        return proposingServices;
    }

    /**
     * Legt den Wert der proposingServices-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link MobilityServiceRefsRelStructure }
     *     
     */
    public void setProposingServices(MobilityServiceRefsRelStructure value) {
        this.proposingServices = value;
    }

}
