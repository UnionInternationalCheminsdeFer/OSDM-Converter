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
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;
import uk.org.netex.netex.DataObjectSubscriptionStructure;


/**
 * Type for SIRI Subscription Request.
 * 
 * <p>Java-Klasse f�r SubscriptionRequestStructure complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="SubscriptionRequestStructure">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.siri.org.uk/siri}AbstractSubscriptionRequestStructure">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.siri.org.uk/siri}AbstractFunctionalServiceSubscriptionRequest" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SubscriptionRequestStructure", propOrder = {
    "abstractFunctionalServiceSubscriptionRequest"
})
@XmlSeeAlso({
    SubscriptionRequest.class
})
public class SubscriptionRequestStructure
    extends AbstractSubscriptionRequestStructure
{

    @XmlElementRef(name = "AbstractFunctionalServiceSubscriptionRequest", namespace = "http://www.siri.org.uk/siri", type = JAXBElement.class)
    protected List<JAXBElement<? extends AbstractSubscriptionStructure>> abstractFunctionalServiceSubscriptionRequest;

    /**
     * Gets the value of the abstractFunctionalServiceSubscriptionRequest property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the abstractFunctionalServiceSubscriptionRequest property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAbstractFunctionalServiceSubscriptionRequest().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JAXBElement }{@code <}{@link DataObjectSubscriptionStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link AbstractSubscriptionStructure }{@code >}
     * 
     * 
     */
    public List<JAXBElement<? extends AbstractSubscriptionStructure>> getAbstractFunctionalServiceSubscriptionRequest() {
        if (abstractFunctionalServiceSubscriptionRequest == null) {
            abstractFunctionalServiceSubscriptionRequest = new ArrayList<JAXBElement<? extends AbstractSubscriptionStructure>>();
        }
        return this.abstractFunctionalServiceSubscriptionRequest;
    }

}
