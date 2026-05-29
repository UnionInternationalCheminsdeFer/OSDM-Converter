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
 * Type for a ROLLING STOCK ITEM.
 * 
 * <p>Java-Klasse f�r RollingStockItem_VersionStructure complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="RollingStockItem_VersionStructure">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.netex.org.uk/netex}Vehicle_VersionStructure">
 *       &lt;sequence>
 *         &lt;group ref="{http://www.netex.org.uk/netex}RollingStockItemGroup"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RollingStockItem_VersionStructure", propOrder = {
    "rollingStockType",
    "typeOfRollingStockRef",
    "facilities"
})
@XmlSeeAlso({
    RollingStockItem.class,
    TrailingRollingStockItemVersionStructure.class,
    TractiveRollingStockItemVersionStructure.class
})
public abstract class RollingStockItemVersionStructure
    extends VehicleVersionStructure
{

    @XmlElement(name = "RollingStockType")
    @XmlSchemaType(name = "NMTOKEN")
    protected TrainElementTypeTypeEnumeration rollingStockType;
    @XmlElement(name = "TypeOfRollingStockRef")
    protected TypeOfRollingStockRefStructure typeOfRollingStockRef;
    protected ServiceFacilitySetVersionStructure facilities;

    /**
     * Ruft den Wert der rollingStockType-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link TrainElementTypeTypeEnumeration }
     *     
     */
    public TrainElementTypeTypeEnumeration getRollingStockType() {
        return rollingStockType;
    }

    /**
     * Legt den Wert der rollingStockType-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link TrainElementTypeTypeEnumeration }
     *     
     */
    public void setRollingStockType(TrainElementTypeTypeEnumeration value) {
        this.rollingStockType = value;
    }

    /**
     * Ruft den Wert der typeOfRollingStockRef-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link TypeOfRollingStockRefStructure }
     *     
     */
    public TypeOfRollingStockRefStructure getTypeOfRollingStockRef() {
        return typeOfRollingStockRef;
    }

    /**
     * Legt den Wert der typeOfRollingStockRef-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeOfRollingStockRefStructure }
     *     
     */
    public void setTypeOfRollingStockRef(TypeOfRollingStockRefStructure value) {
        this.typeOfRollingStockRef = value;
    }

    /**
     * Ruft den Wert der facilities-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ServiceFacilitySetVersionStructure }
     *     
     */
    public ServiceFacilitySetVersionStructure getFacilities() {
        return facilities;
    }

    /**
     * Legt den Wert der facilities-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ServiceFacilitySetVersionStructure }
     *     
     */
    public void setFacilities(ServiceFacilitySetVersionStructure value) {
        this.facilities = value;
    }

}
