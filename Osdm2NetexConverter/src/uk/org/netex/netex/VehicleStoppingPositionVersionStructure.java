//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// �nderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2026.05.22 um 10:24:00 AM CEST 
//


package uk.org.netex.netex;

import java.math.BigInteger;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Type for a VEHICLE STOPPING POSITION.
 * 
 * <p>Java-Klasse f�r VehicleStoppingPosition_VersionStructure complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="VehicleStoppingPosition_VersionStructure">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.netex.org.uk/netex}StopPlaceComponent_VersionStructure">
 *       &lt;sequence>
 *         &lt;group ref="{http://www.netex.org.uk/netex}VehicleStoppingPositionGroup"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VehicleStoppingPosition_VersionStructure", propOrder = {
    "vehicleStoppingPlaceRef",
    "label",
    "relationToVehicle",
    "bearing",
    "vehiclePositionAlignments"
})
@XmlSeeAlso({
    VehicleStoppingPosition.class
})
public class VehicleStoppingPositionVersionStructure
    extends StopPlaceComponentVersionStructure
{

    @XmlElement(name = "VehicleStoppingPlaceRef")
    protected VehicleStoppingPlaceRefStructure vehicleStoppingPlaceRef;
    @XmlElement(name = "Label")
    protected MultilingualString label;
    @XmlElement(name = "RelationToVehicle")
    @XmlSchemaType(name = "string")
    protected RelationToVehicleEnumeration relationToVehicle;
    @XmlElement(name = "Bearing")
    protected BigInteger bearing;
    protected VehiclePositionAlignmentsRelStructure vehiclePositionAlignments;

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
     * Ruft den Wert der label-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link MultilingualString }
     *     
     */
    public MultilingualString getLabel() {
        return label;
    }

    /**
     * Legt den Wert der label-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link MultilingualString }
     *     
     */
    public void setLabel(MultilingualString value) {
        this.label = value;
    }

    /**
     * Ruft den Wert der relationToVehicle-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link RelationToVehicleEnumeration }
     *     
     */
    public RelationToVehicleEnumeration getRelationToVehicle() {
        return relationToVehicle;
    }

    /**
     * Legt den Wert der relationToVehicle-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link RelationToVehicleEnumeration }
     *     
     */
    public void setRelationToVehicle(RelationToVehicleEnumeration value) {
        this.relationToVehicle = value;
    }

    /**
     * Ruft den Wert der bearing-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getBearing() {
        return bearing;
    }

    /**
     * Legt den Wert der bearing-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setBearing(BigInteger value) {
        this.bearing = value;
    }

    /**
     * Ruft den Wert der vehiclePositionAlignments-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link VehiclePositionAlignmentsRelStructure }
     *     
     */
    public VehiclePositionAlignmentsRelStructure getVehiclePositionAlignments() {
        return vehiclePositionAlignments;
    }

    /**
     * Legt den Wert der vehiclePositionAlignments-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link VehiclePositionAlignmentsRelStructure }
     *     
     */
    public void setVehiclePositionAlignments(VehiclePositionAlignmentsRelStructure value) {
        this.vehiclePositionAlignments = value;
    }

}
