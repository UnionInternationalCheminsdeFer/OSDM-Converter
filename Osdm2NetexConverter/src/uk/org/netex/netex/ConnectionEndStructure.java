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
import jakarta.xml.bind.annotation.XmlType;


/**
 * Type for a CONNECTION END.
 * 
 * <p>Java-Klasse f�r ConnectionEndStructure complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="ConnectionEndStructure">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="TransportMode" type="{http://www.netex.org.uk/netex}AllModesEnumeration" minOccurs="0"/>
 *         &lt;element ref="{http://www.netex.org.uk/netex}Submode" minOccurs="0"/>
 *         &lt;element ref="{http://www.netex.org.uk/netex}TransportOrganisationRef" minOccurs="0"/>
 *         &lt;choice>
 *           &lt;element name="ScheduledStopPointRef" type="{http://www.netex.org.uk/netex}ScheduledStopPointRefStructure" minOccurs="0"/>
 *           &lt;element name="VehicleMeetingPointRef" type="{http://www.netex.org.uk/netex}PointRefStructure" minOccurs="0"/>
 *         &lt;/choice>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ConnectionEndStructure", propOrder = {
    "transportMode",
    "submode",
    "transportOrganisationRef",
    "scheduledStopPointRef",
    "vehicleMeetingPointRef"
})
public class ConnectionEndStructure {

    @XmlElement(name = "TransportMode")
    @XmlSchemaType(name = "NMTOKEN")
    protected AllModesEnumeration transportMode;
    @XmlElement(name = "Submode")
    protected Submode submode;
    @XmlElementRef(name = "TransportOrganisationRef", namespace = "http://www.netex.org.uk/netex", type = JAXBElement.class, required = false)
    protected JAXBElement<? extends TransportOrganisationRefStructure> transportOrganisationRef;
    @XmlElement(name = "ScheduledStopPointRef")
    protected ScheduledStopPointRefStructure scheduledStopPointRef;
    @XmlElement(name = "VehicleMeetingPointRef")
    protected PointRefStructure vehicleMeetingPointRef;

    /**
     * Ruft den Wert der transportMode-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link AllModesEnumeration }
     *     
     */
    public AllModesEnumeration getTransportMode() {
        return transportMode;
    }

    /**
     * Legt den Wert der transportMode-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link AllModesEnumeration }
     *     
     */
    public void setTransportMode(AllModesEnumeration value) {
        this.transportMode = value;
    }

    /**
     * SUBMODE of end Point of CONNECTION. SUBMODE of SCHEDULED STOP POINT can be derived. +v1.2.3
     * 
     * @return
     *     possible object is
     *     {@link Submode }
     *     
     */
    public Submode getSubmode() {
        return submode;
    }

    /**
     * Legt den Wert der submode-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Submode }
     *     
     */
    public void setSubmode(Submode value) {
        this.submode = value;
    }

    /**
     * TransportOrganisation to which the end of CONNECTION applies. +v1.2.3
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
     * Ruft den Wert der scheduledStopPointRef-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ScheduledStopPointRefStructure }
     *     
     */
    public ScheduledStopPointRefStructure getScheduledStopPointRef() {
        return scheduledStopPointRef;
    }

    /**
     * Legt den Wert der scheduledStopPointRef-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ScheduledStopPointRefStructure }
     *     
     */
    public void setScheduledStopPointRef(ScheduledStopPointRefStructure value) {
        this.scheduledStopPointRef = value;
    }

    /**
     * Ruft den Wert der vehicleMeetingPointRef-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link PointRefStructure }
     *     
     */
    public PointRefStructure getVehicleMeetingPointRef() {
        return vehicleMeetingPointRef;
    }

    /**
     * Legt den Wert der vehicleMeetingPointRef-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link PointRefStructure }
     *     
     */
    public void setVehicleMeetingPointRef(PointRefStructure value) {
        this.vehicleMeetingPointRef = value;
    }

}
