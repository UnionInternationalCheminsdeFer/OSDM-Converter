//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// �nderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2026.05.22 um 10:24:00 AM CEST 
//


package uk.org.netex.netex;

import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElementRef;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Type for TRAVEL DOCUMENT SECURITY LISTING.
 * 
 * <p>Java-Klasse f�r TravelDocumentSecurityListing_VersionedChildStructure complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="TravelDocumentSecurityListing_VersionedChildStructure">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.netex.org.uk/netex}SecurityListing_VersionedChildStructure">
 *       &lt;sequence>
 *         &lt;group ref="{http://www.netex.org.uk/netex}TravelDocumentSecurityListingGroup"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TravelDocumentSecurityListing_VersionedChildStructure", propOrder = {
    "travelDocumentRef"
})
@XmlSeeAlso({
    TravelDocumentSecurityListing.class
})
public class TravelDocumentSecurityListingVersionedChildStructure
    extends SecurityListingVersionedChildStructure
{

    @XmlElementRef(name = "TravelDocumentRef", namespace = "http://www.netex.org.uk/netex", type = JAXBElement.class, required = false)
    protected JAXBElement<? extends TravelDocumentRefStructure> travelDocumentRef;

    /**
     * Ruft den Wert der travelDocumentRef-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ServiceAccessCodeRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link TravelDocumentRefStructure }{@code >}
     *     
     */
    public JAXBElement<? extends TravelDocumentRefStructure> getTravelDocumentRef() {
        return travelDocumentRef;
    }

    /**
     * Legt den Wert der travelDocumentRef-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ServiceAccessCodeRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link TravelDocumentRefStructure }{@code >}
     *     
     */
    public void setTravelDocumentRef(JAXBElement<? extends TravelDocumentRefStructure> value) {
        this.travelDocumentRef = value;
    }

}
