//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// �nderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2026.05.22 um 10:24:00 AM CEST 
//


package uk.org.netex.netex;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Type for a list of CUSTOMER PAYMENT MEANS.
 * 
 * <p>Java-Klasse f�r customerPaymentMeanRefs_RelStructure complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="customerPaymentMeanRefs_RelStructure">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.netex.org.uk/netex}oneToManyRelationshipStructure">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.netex.org.uk/netex}CustomerPaymentMeansRef" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "customerPaymentMeanRefs_RelStructure", propOrder = {
    "customerPaymentMeansRef"
})
public class CustomerPaymentMeanRefsRelStructure
    extends OneToManyRelationshipStructure
{

    @XmlElement(name = "CustomerPaymentMeansRef", required = true)
    protected List<CustomerPaymentMeansRefStructure> customerPaymentMeansRef;

    /**
     * Gets the value of the customerPaymentMeansRef property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the customerPaymentMeansRef property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCustomerPaymentMeansRef().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CustomerPaymentMeansRefStructure }
     * 
     * 
     */
    public List<CustomerPaymentMeansRefStructure> getCustomerPaymentMeansRef() {
        if (customerPaymentMeansRef == null) {
            customerPaymentMeansRef = new ArrayList<CustomerPaymentMeansRefStructure>();
        }
        return this.customerPaymentMeansRef;
    }

}
