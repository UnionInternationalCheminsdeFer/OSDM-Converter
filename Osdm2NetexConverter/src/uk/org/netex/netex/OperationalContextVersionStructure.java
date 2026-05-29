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
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Type for an OPERATIONAL CONTEXT.
 * 
 * <p>Java-Klasse f�r OperationalContext_VersionStructure complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="OperationalContext_VersionStructure">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.netex.org.uk/netex}DataManagedObjectStructure">
 *       &lt;sequence>
 *         &lt;group ref="{http://www.netex.org.uk/netex}OperationalContextGroup"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OperationalContext_VersionStructure", propOrder = {
    "name",
    "shortName",
    "privateCode",
    "organisationPartRef",
    "vehicleMode",
    "transportSubmode"
})
@XmlSeeAlso({
    OperationalContext.class
})
public class OperationalContextVersionStructure
    extends DataManagedObjectStructure
{

    @XmlElement(name = "Name")
    protected MultilingualString name;
    @XmlElement(name = "ShortName")
    protected MultilingualString shortName;
    @XmlElement(name = "PrivateCode")
    protected PrivateCodeStructure privateCode;
    @XmlElementRef(name = "OrganisationPartRef", namespace = "http://www.netex.org.uk/netex", type = JAXBElement.class, required = false)
    protected JAXBElement<? extends OrganisationPartRefStructure> organisationPartRef;
    @XmlElement(name = "VehicleMode")
    @XmlSchemaType(name = "NMTOKEN")
    protected AllPublicTransportModesEnumeration vehicleMode;
    @XmlElement(name = "TransportSubmode")
    protected TransportSubmodeStructure transportSubmode;

    /**
     * Ruft den Wert der name-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link MultilingualString }
     *     
     */
    public MultilingualString getName() {
        return name;
    }

    /**
     * Legt den Wert der name-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link MultilingualString }
     *     
     */
    public void setName(MultilingualString value) {
        this.name = value;
    }

    /**
     * Ruft den Wert der shortName-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link MultilingualString }
     *     
     */
    public MultilingualString getShortName() {
        return shortName;
    }

    /**
     * Legt den Wert der shortName-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link MultilingualString }
     *     
     */
    public void setShortName(MultilingualString value) {
        this.shortName = value;
    }

    /**
     * DEPRECATED - use privateCodes. -v2.0
     * 
     * @return
     *     possible object is
     *     {@link PrivateCodeStructure }
     *     
     */
    public PrivateCodeStructure getPrivateCode() {
        return privateCode;
    }

    /**
     * Legt den Wert der privateCode-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link PrivateCodeStructure }
     *     
     */
    public void setPrivateCode(PrivateCodeStructure value) {
        this.privateCode = value;
    }

    /**
     * Ruft den Wert der organisationPartRef-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link DepartmentRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link ControlCentreRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link OrganisationPartRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link OrganisationalUnitRefStructure }{@code >}
     *     
     */
    public JAXBElement<? extends OrganisationPartRefStructure> getOrganisationPartRef() {
        return organisationPartRef;
    }

    /**
     * Legt den Wert der organisationPartRef-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link DepartmentRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link ControlCentreRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link OrganisationPartRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link OrganisationalUnitRefStructure }{@code >}
     *     
     */
    public void setOrganisationPartRef(JAXBElement<? extends OrganisationPartRefStructure> value) {
        this.organisationPartRef = value;
    }

    /**
     * Ruft den Wert der vehicleMode-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link AllPublicTransportModesEnumeration }
     *     
     */
    public AllPublicTransportModesEnumeration getVehicleMode() {
        return vehicleMode;
    }

    /**
     * Legt den Wert der vehicleMode-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link AllPublicTransportModesEnumeration }
     *     
     */
    public void setVehicleMode(AllPublicTransportModesEnumeration value) {
        this.vehicleMode = value;
    }

    /**
     * Ruft den Wert der transportSubmode-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link TransportSubmodeStructure }
     *     
     */
    public TransportSubmodeStructure getTransportSubmode() {
        return transportSubmode;
    }

    /**
     * Legt den Wert der transportSubmode-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link TransportSubmodeStructure }
     *     
     */
    public void setTransportSubmode(TransportSubmodeStructure value) {
        this.transportSubmode = value;
    }

}
