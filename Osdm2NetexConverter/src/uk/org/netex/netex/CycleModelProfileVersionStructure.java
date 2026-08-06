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
 * Type for a CYCLE MODEL PROFILE.
 * 
 * <p>Java-Klasse f�r CycleModelProfile_VersionStructure complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="CycleModelProfile_VersionStructure">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.netex.org.uk/netex}VehicleModelProfile_VersionStructure">
 *       &lt;sequence>
 *         &lt;group ref="{http://www.netex.org.uk/netex}CycleModelProfileGroup"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CycleModelProfile_VersionStructure", propOrder = {
    "gearTypeDescriotion",
    "battery",
    "lamps",
    "helmet",
    "pump",
    "locker",
    "basket",
    "lock"
})
@XmlSeeAlso({
    CycleModelProfile.class
})
public class CycleModelProfileVersionStructure
    extends VehicleModelProfileVersionStructure
{

    @XmlElement(name = "GearTypeDescriotion")
    protected MultilingualString gearTypeDescriotion;
    @XmlElement(name = "Battery")
    protected Boolean battery;
    @XmlElement(name = "Lamps")
    protected Boolean lamps;
    @XmlElement(name = "Helmet")
    protected Boolean helmet;
    @XmlElement(name = "Pump")
    protected Boolean pump;
    @XmlElement(name = "Locker")
    protected Boolean locker;
    @XmlElement(name = "Basket")
    protected Boolean basket;
    @XmlElement(name = "Lock")
    protected Boolean lock;

    /**
     * Ruft den Wert der gearTypeDescriotion-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link MultilingualString }
     *     
     */
    public MultilingualString getGearTypeDescriotion() {
        return gearTypeDescriotion;
    }

    /**
     * Legt den Wert der gearTypeDescriotion-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link MultilingualString }
     *     
     */
    public void setGearTypeDescriotion(MultilingualString value) {
        this.gearTypeDescriotion = value;
    }

    /**
     * Ruft den Wert der battery-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isBattery() {
        return battery;
    }

    /**
     * Legt den Wert der battery-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setBattery(Boolean value) {
        this.battery = value;
    }

    /**
     * Ruft den Wert der lamps-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isLamps() {
        return lamps;
    }

    /**
     * Legt den Wert der lamps-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setLamps(Boolean value) {
        this.lamps = value;
    }

    /**
     * Ruft den Wert der helmet-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isHelmet() {
        return helmet;
    }

    /**
     * Legt den Wert der helmet-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setHelmet(Boolean value) {
        this.helmet = value;
    }

    /**
     * Ruft den Wert der pump-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPump() {
        return pump;
    }

    /**
     * Legt den Wert der pump-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPump(Boolean value) {
        this.pump = value;
    }

    /**
     * Ruft den Wert der locker-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isLocker() {
        return locker;
    }

    /**
     * Legt den Wert der locker-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setLocker(Boolean value) {
        this.locker = value;
    }

    /**
     * Ruft den Wert der basket-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isBasket() {
        return basket;
    }

    /**
     * Legt den Wert der basket-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setBasket(Boolean value) {
        this.basket = value;
    }

    /**
     * Ruft den Wert der lock-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isLock() {
        return lock;
    }

    /**
     * Legt den Wert der lock-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setLock(Boolean value) {
        this.lock = value;
    }

}
