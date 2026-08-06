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
 * Type for USER PROFILE ELIGIBILITY.
 * 
 * <p>Java-Klasse f�r UserProfileEligibility_VersionedChildStructure complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="UserProfileEligibility_VersionedChildStructure">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.netex.org.uk/netex}CustomerEligibility_VersionedChildStructure">
 *       &lt;sequence>
 *         &lt;group ref="{http://www.netex.org.uk/netex}UserProfileEligibilityGroup"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UserProfileEligibility_VersionedChildStructure", propOrder = {
    "userProfileRef"
})
@XmlSeeAlso({
    UserProfileEligibility.class
})
public class UserProfileEligibilityVersionedChildStructure
    extends CustomerEligibilityVersionedChildStructure
{

    @XmlElementRef(name = "UserProfileRef", namespace = "http://www.netex.org.uk/netex", type = JAXBElement.class, required = false)
    protected JAXBElement<? extends UserProfileRefStructure> userProfileRef;

    /**
     * Ruft den Wert der userProfileRef-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CompanionProfileRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link VehiclePoolerProfileRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link UserProfileRefStructure }{@code >}
     *     
     */
    public JAXBElement<? extends UserProfileRefStructure> getUserProfileRef() {
        return userProfileRef;
    }

    /**
     * Legt den Wert der userProfileRef-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CompanionProfileRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link VehiclePoolerProfileRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link UserProfileRefStructure }{@code >}
     *     
     */
    public void setUserProfileRef(JAXBElement<? extends UserProfileRefStructure> value) {
        this.userProfileRef = value;
    }

}
