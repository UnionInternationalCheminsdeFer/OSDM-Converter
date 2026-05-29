//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// �nderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2026.05.22 um 10:24:00 AM CEST 
//


package uk.org.netex.netex;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElementRef;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Type for a list of USER PROFILE ELIGIBILITies.
 * 
 * <p>Java-Klasse f�r customerEligibilityRefs_RelStructure complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="customerEligibilityRefs_RelStructure">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.netex.org.uk/netex}oneToManyRelationshipStructure">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.netex.org.uk/netex}CustomerEligibilityRef" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "customerEligibilityRefs_RelStructure", propOrder = {
    "customerEligibilityRef"
})
public class CustomerEligibilityRefsRelStructure
    extends OneToManyRelationshipStructure
{

    @XmlElementRef(name = "CustomerEligibilityRef", namespace = "http://www.netex.org.uk/netex", type = JAXBElement.class)
    protected List<JAXBElement<? extends CustomerEligibilityRefStructure>> customerEligibilityRef;

    /**
     * Gets the value of the customerEligibilityRef property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the customerEligibilityRef property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCustomerEligibilityRef().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JAXBElement }{@code <}{@link UserProfileEligibilityRefStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link ResidentialQualificationEligibilityRefStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link CommercialProfileEligibilityRefStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link CustomerEligibilityRefStructure }{@code >}
     * 
     * 
     */
    public List<JAXBElement<? extends CustomerEligibilityRefStructure>> getCustomerEligibilityRef() {
        if (customerEligibilityRef == null) {
            customerEligibilityRef = new ArrayList<JAXBElement<? extends CustomerEligibilityRefStructure>>();
        }
        return this.customerEligibilityRef;
    }

}
