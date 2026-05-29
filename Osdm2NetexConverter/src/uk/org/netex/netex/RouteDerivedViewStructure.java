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
 * Type for ROUTE VIEW.
 * 
 * <p>Java-Klasse f�r Route_DerivedViewStructure complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="Route_DerivedViewStructure">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.netex.org.uk/netex}DerivedViewStructure">
 *       &lt;sequence>
 *         &lt;group ref="{http://www.netex.org.uk/netex}RouteViewGroup"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Route_DerivedViewStructure", propOrder = {
    "routeRef",
    "vehicleMode",
    "name",
    "lineRef",
    "lineView",
    "directionView",
    "linkSequenceProjectionRef"
})
@XmlSeeAlso({
    RouteView.class
})
public class RouteDerivedViewStructure
    extends DerivedViewStructure
{

    @XmlElement(name = "RouteRef")
    protected RouteRefStructure routeRef;
    @XmlElement(name = "VehicleMode")
    @XmlSchemaType(name = "NMTOKEN")
    protected AllPublicTransportModesEnumeration vehicleMode;
    @XmlElement(name = "Name")
    protected MultilingualString name;
    @XmlElementRef(name = "LineRef", namespace = "http://www.netex.org.uk/netex", type = JAXBElement.class, required = false)
    protected JAXBElement<? extends LineRefStructure> lineRef;
    @XmlElement(name = "LineView")
    protected LineView lineView;
    @XmlElement(name = "DirectionView")
    protected DirectionView directionView;
    @XmlElement(name = "LinkSequenceProjectionRef")
    protected LinkSequenceProjectionRefStructure linkSequenceProjectionRef;

    /**
     * Ruft den Wert der routeRef-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link RouteRefStructure }
     *     
     */
    public RouteRefStructure getRouteRef() {
        return routeRef;
    }

    /**
     * Legt den Wert der routeRef-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link RouteRefStructure }
     *     
     */
    public void setRouteRef(RouteRefStructure value) {
        this.routeRef = value;
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
     * Ruft den Wert der lineRef-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link LineRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link FlexibleLineRefStructure }{@code >}
     *     
     */
    public JAXBElement<? extends LineRefStructure> getLineRef() {
        return lineRef;
    }

    /**
     * Legt den Wert der lineRef-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link LineRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link FlexibleLineRefStructure }{@code >}
     *     
     */
    public void setLineRef(JAXBElement<? extends LineRefStructure> value) {
        this.lineRef = value;
    }

    /**
     * Ruft den Wert der lineView-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link LineView }
     *     
     */
    public LineView getLineView() {
        return lineView;
    }

    /**
     * Legt den Wert der lineView-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link LineView }
     *     
     */
    public void setLineView(LineView value) {
        this.lineView = value;
    }

    /**
     * Ruft den Wert der directionView-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link DirectionView }
     *     
     */
    public DirectionView getDirectionView() {
        return directionView;
    }

    /**
     * Legt den Wert der directionView-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link DirectionView }
     *     
     */
    public void setDirectionView(DirectionView value) {
        this.directionView = value;
    }

    /**
     * Ruft den Wert der linkSequenceProjectionRef-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link LinkSequenceProjectionRefStructure }
     *     
     */
    public LinkSequenceProjectionRefStructure getLinkSequenceProjectionRef() {
        return linkSequenceProjectionRef;
    }

    /**
     * Legt den Wert der linkSequenceProjectionRef-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link LinkSequenceProjectionRefStructure }
     *     
     */
    public void setLinkSequenceProjectionRef(LinkSequenceProjectionRefStructure value) {
        this.linkSequenceProjectionRef = value;
    }

}
