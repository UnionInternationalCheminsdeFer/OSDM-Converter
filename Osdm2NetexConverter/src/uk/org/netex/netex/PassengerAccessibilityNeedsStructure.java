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
 * Type for accessibility needs. Records the requirements of a passenger that may affect choice of facilities.
 * 
 * <p>Java-Klasse f�r PassengerAccessibilityNeedsStructure complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="PassengerAccessibilityNeedsStructure">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AccompaniedByCarer" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="userNeeds" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element ref="{http://www.netex.org.uk/netex}UserNeed" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="suitabilities" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element ref="{http://www.netex.org.uk/netex}Suitability" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PassengerAccessibilityNeedsStructure", propOrder = {
    "accompaniedByCarer",
    "userNeeds",
    "suitabilities"
})
public class PassengerAccessibilityNeedsStructure {

    @XmlElement(name = "AccompaniedByCarer")
    protected Boolean accompaniedByCarer;
    protected PassengerAccessibilityNeedsStructure.UserNeeds userNeeds;
    protected PassengerAccessibilityNeedsStructure.Suitabilities suitabilities;

    /**
     * Ruft den Wert der accompaniedByCarer-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAccompaniedByCarer() {
        return accompaniedByCarer;
    }

    /**
     * Legt den Wert der accompaniedByCarer-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAccompaniedByCarer(Boolean value) {
        this.accompaniedByCarer = value;
    }

    /**
     * Ruft den Wert der userNeeds-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link PassengerAccessibilityNeedsStructure.UserNeeds }
     *     
     */
    public PassengerAccessibilityNeedsStructure.UserNeeds getUserNeeds() {
        return userNeeds;
    }

    /**
     * Legt den Wert der userNeeds-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link PassengerAccessibilityNeedsStructure.UserNeeds }
     *     
     */
    public void setUserNeeds(PassengerAccessibilityNeedsStructure.UserNeeds value) {
        this.userNeeds = value;
    }

    /**
     * Ruft den Wert der suitabilities-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link PassengerAccessibilityNeedsStructure.Suitabilities }
     *     
     */
    public PassengerAccessibilityNeedsStructure.Suitabilities getSuitabilities() {
        return suitabilities;
    }

    /**
     * Legt den Wert der suitabilities-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link PassengerAccessibilityNeedsStructure.Suitabilities }
     *     
     */
    public void setSuitabilities(PassengerAccessibilityNeedsStructure.Suitabilities value) {
        this.suitabilities = value;
    }


    /**
     * <p>Java-Klasse f�r anonymous complex type.
     * 
     * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element ref="{http://www.netex.org.uk/netex}Suitability" maxOccurs="unbounded" minOccurs="0"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "suitability"
    })
    public static class Suitabilities {

        @XmlElement(name = "Suitability")
        protected List<Suitability> suitability;

        /**
         * Gets the value of the suitability property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the suitability property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getSuitability().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Suitability }
         * 
         * 
         */
        public List<Suitability> getSuitability() {
            if (suitability == null) {
                suitability = new ArrayList<Suitability>();
            }
            return this.suitability;
        }

    }


    /**
     * <p>Java-Klasse f�r anonymous complex type.
     * 
     * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element ref="{http://www.netex.org.uk/netex}UserNeed" maxOccurs="unbounded" minOccurs="0"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "userNeed"
    })
    public static class UserNeeds {

        @XmlElement(name = "UserNeed")
        protected List<UserNeed> userNeed;

        /**
         * Gets the value of the userNeed property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the userNeed property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getUserNeed().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link UserNeed }
         * 
         * 
         */
        public List<UserNeed> getUserNeed() {
            if (userNeed == null) {
                userNeed = new ArrayList<UserNeed>();
            }
            return this.userNeed;
        }

    }

}
