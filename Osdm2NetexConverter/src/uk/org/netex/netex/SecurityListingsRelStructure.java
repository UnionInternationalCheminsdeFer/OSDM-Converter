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
 * Type for a list of SECURITY LISTINGs.
 * 
 * <p>Java-Klasse f�r securityListings_RelStructure complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="securityListings_RelStructure">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.netex.org.uk/netex}containmentAggregationStructure">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.netex.org.uk/netex}SecurityListing_Dummy" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "securityListings_RelStructure", propOrder = {
    "securityListingDummy"
})
public class SecurityListingsRelStructure
    extends ContainmentAggregationStructure
{

    @XmlElementRef(name = "SecurityListing_Dummy", namespace = "http://www.netex.org.uk/netex", type = JAXBElement.class)
    protected List<JAXBElement<? extends VersionedChildStructure>> securityListingDummy;

    /**
     * Gets the value of the securityListingDummy property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the securityListingDummy property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSecurityListingDummy().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JAXBElement }{@code <}{@link RetailDeviceSecurityListing }{@code >}
     * {@link JAXBElement }{@code <}{@link MediumAccessDeviceSecurityListing }{@code >}
     * {@link JAXBElement }{@code <}{@link VersionedChildStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link SecurityListing }{@code >}
     * {@link JAXBElement }{@code <}{@link CustomerSecurityListing }{@code >}
     * {@link JAXBElement }{@code <}{@link CustomerAccountSecurityListing }{@code >}
     * {@link JAXBElement }{@code <}{@link FareContractSecurityListing }{@code >}
     * {@link JAXBElement }{@code <}{@link TravelDocumentSecurityListing }{@code >}
     * 
     * 
     */
    public List<JAXBElement<? extends VersionedChildStructure>> getSecurityListingDummy() {
        if (securityListingDummy == null) {
            securityListingDummy = new ArrayList<JAXBElement<? extends VersionedChildStructure>>();
        }
        return this.securityListingDummy;
    }

}
