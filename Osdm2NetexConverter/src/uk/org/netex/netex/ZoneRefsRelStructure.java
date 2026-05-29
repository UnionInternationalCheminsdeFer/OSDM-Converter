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
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse f�r zoneRefs_RelStructure complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="zoneRefs_RelStructure">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.netex.org.uk/netex}oneToManyRelationshipStructure">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.netex.org.uk/netex}ZoneRef"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "zoneRefs_RelStructure", propOrder = {
    "zoneRef"
})
public class ZoneRefsRelStructure
    extends OneToManyRelationshipStructure
{

    @XmlElementRef(name = "ZoneRef", namespace = "http://www.netex.org.uk/netex", type = JAXBElement.class)
    protected JAXBElement<? extends ZoneRefStructure> zoneRef;

    /**
     * Ruft den Wert der zoneRef-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link AccessZoneRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link AdministrativeZoneRef }{@code >}
     *     {@link JAXBElement }{@code <}{@link MobilityServiceConstraintZoneRef }{@code >}
     *     {@link JAXBElement }{@code <}{@link StopAreaRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link TariffZoneRef }{@code >}
     *     {@link JAXBElement }{@code <}{@link FareZoneRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link TransportAdministrativeZoneRef }{@code >}
     *     {@link JAXBElement }{@code <}{@link ZoneRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link ZoneRefStructure }{@code >}
     *     
     */
    public JAXBElement<? extends ZoneRefStructure> getZoneRef() {
        return zoneRef;
    }

    /**
     * Legt den Wert der zoneRef-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link AccessZoneRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link AdministrativeZoneRef }{@code >}
     *     {@link JAXBElement }{@code <}{@link MobilityServiceConstraintZoneRef }{@code >}
     *     {@link JAXBElement }{@code <}{@link StopAreaRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link TariffZoneRef }{@code >}
     *     {@link JAXBElement }{@code <}{@link FareZoneRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link TransportAdministrativeZoneRef }{@code >}
     *     {@link JAXBElement }{@code <}{@link ZoneRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link ZoneRefStructure }{@code >}
     *     
     */
    public void setZoneRef(JAXBElement<? extends ZoneRefStructure> value) {
        this.zoneRef = value;
    }

}
