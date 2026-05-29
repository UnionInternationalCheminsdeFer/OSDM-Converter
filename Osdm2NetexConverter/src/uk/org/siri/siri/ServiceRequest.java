//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// �nderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2026.05.22 um 10:24:00 AM CEST 
//


package uk.org.siri.siri;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElementRef;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;
import uk.org.netex.netex.DataObjectRequestStructure;


/**
 * <p>Java-Klasse f�r anonymous complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.siri.org.uk/siri}ServiceRequestStructure">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.siri.org.uk/siri}AbstractFunctionalServiceRequest" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "abstractFunctionalServiceRequest"
})
@XmlRootElement(name = "ServiceRequest")
public class ServiceRequest
    extends ServiceRequestStructure
{

    @XmlElementRef(name = "AbstractFunctionalServiceRequest", namespace = "http://www.siri.org.uk/siri", type = JAXBElement.class)
    protected List<JAXBElement<? extends AbstractFunctionalServiceRequestStructure>> abstractFunctionalServiceRequest;

    /**
     * Gets the value of the abstractFunctionalServiceRequest property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the abstractFunctionalServiceRequest property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAbstractFunctionalServiceRequest().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JAXBElement }{@code <}{@link DataObjectRequestStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link AbstractFunctionalServiceRequestStructure }{@code >}
     * 
     * 
     */
    public List<JAXBElement<? extends AbstractFunctionalServiceRequestStructure>> getAbstractFunctionalServiceRequest() {
        if (abstractFunctionalServiceRequest == null) {
            abstractFunctionalServiceRequest = new ArrayList<JAXBElement<? extends AbstractFunctionalServiceRequestStructure>>();
        }
        return this.abstractFunctionalServiceRequest;
    }

}
