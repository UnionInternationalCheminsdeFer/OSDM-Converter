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
import jakarta.xml.bind.annotation.XmlElementRef;
import jakarta.xml.bind.annotation.XmlType;
import uk.org.netex.netex.DataObjectCapabilitiesResponseStructure;


/**
 * Type for the capabilities of an implementation.
 * 
 * <p>Java-Klasse f�r CapabilitiesResponseStructure complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="CapabilitiesResponseStructure">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.siri.org.uk/siri}ProducerResponseStructure">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.siri.org.uk/siri}AbstractFunctionalServiceCapabilitiesResponse"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CapabilitiesResponseStructure", propOrder = {
    "abstractFunctionalServiceCapabilitiesResponse"
})
public class CapabilitiesResponseStructure
    extends ProducerResponseStructure
{

    @XmlElementRef(name = "AbstractFunctionalServiceCapabilitiesResponse", namespace = "http://www.siri.org.uk/siri", type = JAXBElement.class)
    protected JAXBElement<? extends AbstractServiceCapabilitiesResponseStructure> abstractFunctionalServiceCapabilitiesResponse;

    /**
     * Ruft den Wert der abstractFunctionalServiceCapabilitiesResponse-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link DataObjectCapabilitiesResponseStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link AbstractServiceCapabilitiesResponseStructure }{@code >}
     *     
     */
    public JAXBElement<? extends AbstractServiceCapabilitiesResponseStructure> getAbstractFunctionalServiceCapabilitiesResponse() {
        return abstractFunctionalServiceCapabilitiesResponse;
    }

    /**
     * Legt den Wert der abstractFunctionalServiceCapabilitiesResponse-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link DataObjectCapabilitiesResponseStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link AbstractServiceCapabilitiesResponseStructure }{@code >}
     *     
     */
    public void setAbstractFunctionalServiceCapabilitiesResponse(JAXBElement<? extends AbstractServiceCapabilitiesResponseStructure> value) {
        this.abstractFunctionalServiceCapabilitiesResponse = value;
    }

}
