//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// �nderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2026.05.22 um 10:24:00 AM CEST 
//


package uk.org.siri.siri;

import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElementRef;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.CollapsedStringAdapter;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * Type for Requests for capabilities of the current system.
 * 
 * <p>Java-Klasse f�r CapabilitiesRequestStructure complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="CapabilitiesRequestStructure">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.siri.org.uk/siri}RequestStructure">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.siri.org.uk/siri}AbstractFunctionalServiceCapabilitiesRequest"/>
 *       &lt;/sequence>
 *       &lt;attribute name="version" type="{http://www.siri.org.uk/siri}VersionString" default="2.0" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CapabilitiesRequestStructure", propOrder = {
    "abstractFunctionalServiceCapabilitiesRequest"
})
public class CapabilitiesRequestStructure
    extends RequestStructure
{

    @XmlElementRef(name = "AbstractFunctionalServiceCapabilitiesRequest", namespace = "http://www.siri.org.uk/siri", type = JAXBElement.class)
    protected JAXBElement<? extends AbstractServiceRequestStructure> abstractFunctionalServiceCapabilitiesRequest;
    @XmlAttribute(name = "version")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String version;

    /**
     * Ruft den Wert der abstractFunctionalServiceCapabilitiesRequest-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ServiceCapabilitiesRequestStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link AbstractServiceRequestStructure }{@code >}
     *     
     */
    public JAXBElement<? extends AbstractServiceRequestStructure> getAbstractFunctionalServiceCapabilitiesRequest() {
        return abstractFunctionalServiceCapabilitiesRequest;
    }

    /**
     * Legt den Wert der abstractFunctionalServiceCapabilitiesRequest-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ServiceCapabilitiesRequestStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link AbstractServiceRequestStructure }{@code >}
     *     
     */
    public void setAbstractFunctionalServiceCapabilitiesRequest(JAXBElement<? extends AbstractServiceRequestStructure> value) {
        this.abstractFunctionalServiceCapabilitiesRequest = value;
    }

    /**
     * Ruft den Wert der version-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVersion() {
        if (version == null) {
            return "2.0";
        } else {
            return version;
        }
    }

    /**
     * Legt den Wert der version-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVersion(String value) {
        this.version = value;
    }

}
