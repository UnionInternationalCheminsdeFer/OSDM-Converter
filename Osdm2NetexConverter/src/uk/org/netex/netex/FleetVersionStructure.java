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
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlElementRef;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Type for a FLEET.
 * 
 * <p>Java-Klasse f�r Fleet_VersionStructure complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="Fleet_VersionStructure">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.netex.org.uk/netex}GroupOfEntities_VersionStructure">
 *       &lt;sequence>
 *         &lt;group ref="{http://www.netex.org.uk/netex}FleetGroup"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Fleet_VersionStructure", propOrder = {
    "members",
    "transportOrganisationRef",
    "typeOfFleetRef",
    "transportTypes"
})
@XmlSeeAlso({
    Fleet.class
})
public class FleetVersionStructure
    extends GroupOfEntitiesVersionStructure
{

    protected VehiclesRelStructure members;
    @XmlElementRef(name = "TransportOrganisationRef", namespace = "http://www.netex.org.uk/netex", type = JAXBElement.class, required = false)
    protected JAXBElement<? extends TransportOrganisationRefStructure> transportOrganisationRef;
    @XmlElement(name = "TypeOfFleetRef")
    protected TypeOfFleetRefStructure typeOfFleetRef;
    protected TransportTypeRefsRelStructure transportTypes;

    /**
     * Ruft den Wert der members-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link VehiclesRelStructure }
     *     
     */
    public VehiclesRelStructure getMembers() {
        return members;
    }

    /**
     * Legt den Wert der members-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link VehiclesRelStructure }
     *     
     */
    public void setMembers(VehiclesRelStructure value) {
        this.members = value;
    }

    /**
     * Ruft den Wert der transportOrganisationRef-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link AuthorityRef }{@code >}
     *     {@link JAXBElement }{@code <}{@link TransportOrganisationRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link OperatorRefStructure }{@code >}
     *     
     */
    public JAXBElement<? extends TransportOrganisationRefStructure> getTransportOrganisationRef() {
        return transportOrganisationRef;
    }

    /**
     * Legt den Wert der transportOrganisationRef-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link AuthorityRef }{@code >}
     *     {@link JAXBElement }{@code <}{@link TransportOrganisationRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link OperatorRefStructure }{@code >}
     *     
     */
    public void setTransportOrganisationRef(JAXBElement<? extends TransportOrganisationRefStructure> value) {
        this.transportOrganisationRef = value;
    }

    /**
     * Ruft den Wert der typeOfFleetRef-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link TypeOfFleetRefStructure }
     *     
     */
    public TypeOfFleetRefStructure getTypeOfFleetRef() {
        return typeOfFleetRef;
    }

    /**
     * Legt den Wert der typeOfFleetRef-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeOfFleetRefStructure }
     *     
     */
    public void setTypeOfFleetRef(TypeOfFleetRefStructure value) {
        this.typeOfFleetRef = value;
    }

    /**
     * Ruft den Wert der transportTypes-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link TransportTypeRefsRelStructure }
     *     
     */
    public TransportTypeRefsRelStructure getTransportTypes() {
        return transportTypes;
    }

    /**
     * Legt den Wert der transportTypes-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link TransportTypeRefsRelStructure }
     *     
     */
    public void setTransportTypes(TransportTypeRefsRelStructure value) {
        this.transportTypes = value;
    }

}
