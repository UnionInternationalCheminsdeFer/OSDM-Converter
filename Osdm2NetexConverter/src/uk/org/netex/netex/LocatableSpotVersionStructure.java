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
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Type for a LOCATABLE SPOT.
 * 
 * <p>Java-Klasse f�r LocatableSpot_VersionStructure complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="LocatableSpot_VersionStructure">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.netex.org.uk/netex}OnboardSpace_VersionStructure">
 *       &lt;sequence>
 *         &lt;group ref="{http://www.netex.org.uk/netex}LocatableSpotGroup"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LocatableSpot_VersionStructure", propOrder = {
    "locatableSpotType",
    "typeOfLocatableSpotRef",
    "spotRowRef",
    "spotColumnRef",
    "sensorsInSpot"
})
@XmlSeeAlso({
    PassengerSpotVersionStructure.class,
    LuggageSpotVersionStructure.class,
    PassengerVehicleSpotVersionStructure.class
})
public abstract class LocatableSpotVersionStructure
    extends OnboardSpaceVersionStructure
{

    @XmlElement(name = "LocatableSpotType")
    @XmlSchemaType(name = "normalizedString")
    protected TypeOfLocatableSpotEnumeration locatableSpotType;
    @XmlElement(name = "TypeOfLocatableSpotRef")
    protected TypeOfLocatableSpotRefStructure typeOfLocatableSpotRef;
    @XmlElement(name = "SpotRowRef")
    protected SpotRowRefStructure spotRowRef;
    @XmlElement(name = "SpotColumnRef")
    protected SpotColumnRefStructure spotColumnRef;
    protected SensorsInSpotRelStructure sensorsInSpot;

    /**
     * Ruft den Wert der locatableSpotType-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link TypeOfLocatableSpotEnumeration }
     *     
     */
    public TypeOfLocatableSpotEnumeration getLocatableSpotType() {
        return locatableSpotType;
    }

    /**
     * Legt den Wert der locatableSpotType-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeOfLocatableSpotEnumeration }
     *     
     */
    public void setLocatableSpotType(TypeOfLocatableSpotEnumeration value) {
        this.locatableSpotType = value;
    }

    /**
     * Ruft den Wert der typeOfLocatableSpotRef-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link TypeOfLocatableSpotRefStructure }
     *     
     */
    public TypeOfLocatableSpotRefStructure getTypeOfLocatableSpotRef() {
        return typeOfLocatableSpotRef;
    }

    /**
     * Legt den Wert der typeOfLocatableSpotRef-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeOfLocatableSpotRefStructure }
     *     
     */
    public void setTypeOfLocatableSpotRef(TypeOfLocatableSpotRefStructure value) {
        this.typeOfLocatableSpotRef = value;
    }

    /**
     * Ruft den Wert der spotRowRef-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link SpotRowRefStructure }
     *     
     */
    public SpotRowRefStructure getSpotRowRef() {
        return spotRowRef;
    }

    /**
     * Legt den Wert der spotRowRef-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link SpotRowRefStructure }
     *     
     */
    public void setSpotRowRef(SpotRowRefStructure value) {
        this.spotRowRef = value;
    }

    /**
     * Ruft den Wert der spotColumnRef-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link SpotColumnRefStructure }
     *     
     */
    public SpotColumnRefStructure getSpotColumnRef() {
        return spotColumnRef;
    }

    /**
     * Legt den Wert der spotColumnRef-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link SpotColumnRefStructure }
     *     
     */
    public void setSpotColumnRef(SpotColumnRefStructure value) {
        this.spotColumnRef = value;
    }

    /**
     * Ruft den Wert der sensorsInSpot-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link SensorsInSpotRelStructure }
     *     
     */
    public SensorsInSpotRelStructure getSensorsInSpot() {
        return sensorsInSpot;
    }

    /**
     * Legt den Wert der sensorsInSpot-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link SensorsInSpotRelStructure }
     *     
     */
    public void setSensorsInSpot(SensorsInSpotRelStructure value) {
        this.sensorsInSpot = value;
    }

}
