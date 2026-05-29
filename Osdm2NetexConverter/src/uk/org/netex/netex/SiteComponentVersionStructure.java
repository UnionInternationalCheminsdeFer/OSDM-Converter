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
 * A component of a SITE COMPONENT.
 * 
 * <p>Java-Klasse f�r SiteComponent_VersionStructure complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="SiteComponent_VersionStructure">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.netex.org.uk/netex}SiteElement_VersionStructure">
 *       &lt;sequence>
 *         &lt;group ref="{http://www.netex.org.uk/netex}SiteComponentGroup"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SiteComponent_VersionStructure", propOrder = {
    "siteRef",
    "levelRef",
    "classOfUseRef",
    "checkConstraints",
    "equipmentPlaces",
    "placeEquipments",
    "localServices"
})
@XmlSeeAlso({
    PointOfInterestComponentVersionStructure.class,
    ParkingComponentVersionStructure.class,
    SiteEntranceVersionStructure.class,
    StopPlaceComponentVersionStructure.class
})
public abstract class SiteComponentVersionStructure
    extends SiteElementVersionStructure
{

    @XmlElement(name = "SiteRef")
    protected SiteRefStructure siteRef;
    @XmlElement(name = "LevelRef")
    protected LevelRefStructure levelRef;
    @XmlElement(name = "ClassOfUseRef")
    protected ClassOfUseRef classOfUseRef;
    protected CheckConstraintsRelStructure checkConstraints;
    protected EquipmentPlacesRelStructure equipmentPlaces;
    protected PlaceEquipmentsRelStructure placeEquipments;
    protected LocalServicesRelStructure localServices;

    /**
     * Ruft den Wert der siteRef-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link SiteRefStructure }
     *     
     */
    public SiteRefStructure getSiteRef() {
        return siteRef;
    }

    /**
     * Legt den Wert der siteRef-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link SiteRefStructure }
     *     
     */
    public void setSiteRef(SiteRefStructure value) {
        this.siteRef = value;
    }

    /**
     * Ruft den Wert der levelRef-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link LevelRefStructure }
     *     
     */
    public LevelRefStructure getLevelRef() {
        return levelRef;
    }

    /**
     * Legt den Wert der levelRef-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link LevelRefStructure }
     *     
     */
    public void setLevelRef(LevelRefStructure value) {
        this.levelRef = value;
    }

    /**
     * Ruft den Wert der classOfUseRef-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ClassOfUseRef }
     *     
     */
    public ClassOfUseRef getClassOfUseRef() {
        return classOfUseRef;
    }

    /**
     * Legt den Wert der classOfUseRef-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ClassOfUseRef }
     *     
     */
    public void setClassOfUseRef(ClassOfUseRef value) {
        this.classOfUseRef = value;
    }

    /**
     * Ruft den Wert der checkConstraints-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link CheckConstraintsRelStructure }
     *     
     */
    public CheckConstraintsRelStructure getCheckConstraints() {
        return checkConstraints;
    }

    /**
     * Legt den Wert der checkConstraints-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link CheckConstraintsRelStructure }
     *     
     */
    public void setCheckConstraints(CheckConstraintsRelStructure value) {
        this.checkConstraints = value;
    }

    /**
     * Ruft den Wert der equipmentPlaces-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link EquipmentPlacesRelStructure }
     *     
     */
    public EquipmentPlacesRelStructure getEquipmentPlaces() {
        return equipmentPlaces;
    }

    /**
     * Legt den Wert der equipmentPlaces-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link EquipmentPlacesRelStructure }
     *     
     */
    public void setEquipmentPlaces(EquipmentPlacesRelStructure value) {
        this.equipmentPlaces = value;
    }

    /**
     * Ruft den Wert der placeEquipments-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link PlaceEquipmentsRelStructure }
     *     
     */
    public PlaceEquipmentsRelStructure getPlaceEquipments() {
        return placeEquipments;
    }

    /**
     * Legt den Wert der placeEquipments-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link PlaceEquipmentsRelStructure }
     *     
     */
    public void setPlaceEquipments(PlaceEquipmentsRelStructure value) {
        this.placeEquipments = value;
    }

    /**
     * Ruft den Wert der localServices-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link LocalServicesRelStructure }
     *     
     */
    public LocalServicesRelStructure getLocalServices() {
        return localServices;
    }

    /**
     * Legt den Wert der localServices-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link LocalServicesRelStructure }
     *     
     */
    public void setLocalServices(LocalServicesRelStructure value) {
        this.localServices = value;
    }

}
