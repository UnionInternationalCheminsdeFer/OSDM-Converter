//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// �nderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2026.05.22 um 10:24:00 AM CEST 
//


package uk.org.netex.netex;

import java.math.BigInteger;
import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlElementRef;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Type for a ZONE IN SERIES.
 * 
 * <p>Java-Klasse f�r ZoneInSeries_VersionedChildStructure complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="ZoneInSeries_VersionedChildStructure">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.netex.org.uk/netex}VersionedChildStructure">
 *       &lt;sequence>
 *         &lt;group ref="{http://www.netex.org.uk/netex}ZoneInSeriesGroup"/>
 *       &lt;/sequence>
 *       &lt;attribute name="order" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ZoneInSeries_VersionedChildStructure", propOrder = {
    "tariffZoneRefDummy",
    "interchangeAllowed"
})
@XmlSeeAlso({
    ZoneInSeries.class
})
public class ZoneInSeriesVersionedChildStructure
    extends VersionedChildStructure
{

    @XmlElementRef(name = "TariffZoneRef_Dummy", namespace = "http://www.netex.org.uk/netex", type = JAXBElement.class)
    protected JAXBElement<? extends ZoneRefStructure> tariffZoneRefDummy;
    @XmlElement(name = "InterchangeAllowed", defaultValue = "true")
    protected Boolean interchangeAllowed;
    @XmlAttribute(name = "order")
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger order;

    /**
     * Ruft den Wert der tariffZoneRefDummy-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link TariffZoneRef }{@code >}
     *     {@link JAXBElement }{@code <}{@link FareZoneRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link ZoneRefStructure }{@code >}
     *     
     */
    public JAXBElement<? extends ZoneRefStructure> getTariffZoneRefDummy() {
        return tariffZoneRefDummy;
    }

    /**
     * Legt den Wert der tariffZoneRefDummy-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link TariffZoneRef }{@code >}
     *     {@link JAXBElement }{@code <}{@link FareZoneRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link ZoneRefStructure }{@code >}
     *     
     */
    public void setTariffZoneRefDummy(JAXBElement<? extends ZoneRefStructure> value) {
        this.tariffZoneRefDummy = value;
    }

    /**
     * Ruft den Wert der interchangeAllowed-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isInterchangeAllowed() {
        return interchangeAllowed;
    }

    /**
     * Legt den Wert der interchangeAllowed-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setInterchangeAllowed(Boolean value) {
        this.interchangeAllowed = value;
    }

    /**
     * Ruft den Wert der order-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getOrder() {
        return order;
    }

    /**
     * Legt den Wert der order-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setOrder(BigInteger value) {
        this.order = value;
    }

}
