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
 * Type for a VEHICLE QUAY ALIGNMENT.
 * 
 * <p>Java-Klasse f�r VehicleQuayAlignment_VersionStructure complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="VehicleQuayAlignment_VersionStructure">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.netex.org.uk/netex}VersionedChildStructure">
 *       &lt;sequence>
 *         &lt;group ref="{http://www.netex.org.uk/netex}VehicleQuayAlignmentGroup"/>
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
@XmlType(name = "VehicleQuayAlignment_VersionStructure", propOrder = {
    "vehicleStoppingPlaceRef",
    "quayRef"
})
@XmlSeeAlso({
    VehicleQuayAlignment.class
})
public class VehicleQuayAlignmentVersionStructure
    extends VersionedChildStructure
{

    @XmlElement(name = "VehicleStoppingPlaceRef")
    protected VehicleStoppingPlaceRefStructure vehicleStoppingPlaceRef;
    @XmlElementRef(name = "QuayRef", namespace = "http://www.netex.org.uk/netex", type = JAXBElement.class)
    protected JAXBElement<? extends QuayRefStructure> quayRef;
    @XmlAttribute(name = "order")
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger order;

    /**
     * Ruft den Wert der vehicleStoppingPlaceRef-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link VehicleStoppingPlaceRefStructure }
     *     
     */
    public VehicleStoppingPlaceRefStructure getVehicleStoppingPlaceRef() {
        return vehicleStoppingPlaceRef;
    }

    /**
     * Legt den Wert der vehicleStoppingPlaceRef-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link VehicleStoppingPlaceRefStructure }
     *     
     */
    public void setVehicleStoppingPlaceRef(VehicleStoppingPlaceRefStructure value) {
        this.vehicleStoppingPlaceRef = value;
    }

    /**
     * Ruft den Wert der quayRef-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link QuayRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link TaxiStandRefStructure }{@code >}
     *     
     */
    public JAXBElement<? extends QuayRefStructure> getQuayRef() {
        return quayRef;
    }

    /**
     * Legt den Wert der quayRef-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link QuayRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link TaxiStandRefStructure }{@code >}
     *     
     */
    public void setQuayRef(JAXBElement<? extends QuayRefStructure> value) {
        this.quayRef = value;
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
