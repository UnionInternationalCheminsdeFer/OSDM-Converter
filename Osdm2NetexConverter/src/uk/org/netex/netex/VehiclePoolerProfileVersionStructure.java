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
 * Type for VEHICLE POOLER PROFILE.
 * 
 * <p>Java-Klasse f�r VehiclePoolerProfile_VersionStructure complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="VehiclePoolerProfile_VersionStructure">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.netex.org.uk/netex}UserProfile_VersionStructure">
 *       &lt;sequence>
 *         &lt;group ref="{http://www.netex.org.uk/netex}VehiclePoolerProfileGroup"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VehiclePoolerProfile_VersionStructure", propOrder = {
    "hostUserProfileRef",
    "smokingAllowed",
    "petsAllowed",
    "luggageAllowed",
    "detourAccepted"
})
@XmlSeeAlso({
    VehiclePoolerProfile.class
})
public class VehiclePoolerProfileVersionStructure
    extends UserProfileVersionStructure
{

    @XmlElement(name = "HostUserProfileRef")
    protected UserProfileRefStructure hostUserProfileRef;
    @XmlElement(name = "SmokingAllowed", defaultValue = "false")
    protected Boolean smokingAllowed;
    @XmlElement(name = "PetsAllowed", defaultValue = "false")
    protected Boolean petsAllowed;
    @XmlElement(name = "LuggageAllowed", defaultValue = "false")
    protected Boolean luggageAllowed;
    @XmlElement(name = "DetourAccepted", defaultValue = "false")
    protected Boolean detourAccepted;

    /**
     * Ruft den Wert der hostUserProfileRef-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link UserProfileRefStructure }
     *     
     */
    public UserProfileRefStructure getHostUserProfileRef() {
        return hostUserProfileRef;
    }

    /**
     * Legt den Wert der hostUserProfileRef-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link UserProfileRefStructure }
     *     
     */
    public void setHostUserProfileRef(UserProfileRefStructure value) {
        this.hostUserProfileRef = value;
    }

    /**
     * Ruft den Wert der smokingAllowed-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSmokingAllowed() {
        return smokingAllowed;
    }

    /**
     * Legt den Wert der smokingAllowed-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSmokingAllowed(Boolean value) {
        this.smokingAllowed = value;
    }

    /**
     * Ruft den Wert der petsAllowed-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPetsAllowed() {
        return petsAllowed;
    }

    /**
     * Legt den Wert der petsAllowed-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPetsAllowed(Boolean value) {
        this.petsAllowed = value;
    }

    /**
     * Ruft den Wert der luggageAllowed-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isLuggageAllowed() {
        return luggageAllowed;
    }

    /**
     * Legt den Wert der luggageAllowed-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setLuggageAllowed(Boolean value) {
        this.luggageAllowed = value;
    }

    /**
     * Ruft den Wert der detourAccepted-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDetourAccepted() {
        return detourAccepted;
    }

    /**
     * Legt den Wert der detourAccepted-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDetourAccepted(Boolean value) {
        this.detourAccepted = value;
    }

}
