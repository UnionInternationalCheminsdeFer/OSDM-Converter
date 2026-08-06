//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// �nderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2026.05.22 um 10:24:00 AM CEST 
//


package uk.org.netex.netex;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlList;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Type for a POINT on LINE SECTION.
 * 
 * <p>Java-Klasse f�r PointOnLineSection_VersionedChildStructure complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="PointOnLineSection_VersionedChildStructure">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.netex.org.uk/netex}PointOnSection_VersionedChildStructure">
 *       &lt;sequence>
 *         &lt;group ref="{http://www.netex.org.uk/netex}PointOnLineSectionGroup"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PointOnLineSection_VersionedChildStructure", propOrder = {
    "lineSectionPointType",
    "showAsAccessible",
    "connectingVehicleModes"
})
@XmlSeeAlso({
    LineSectionPointMember.class,
    PointOnLineSection.class
})
public class PointOnLineSectionVersionedChildStructure
    extends PointOnSectionVersionedChildStructure
{

    @XmlElement(name = "LineSectionPointType")
    @XmlSchemaType(name = "normalizedString")
    protected LineSectionPointTypeEnumeration lineSectionPointType;
    @XmlElement(name = "ShowAsAccessible", defaultValue = "true")
    protected Boolean showAsAccessible;
    @XmlList
    @XmlElement(name = "ConnectingVehicleModes")
    protected List<AllPublicTransportModesEnumeration> connectingVehicleModes;

    /**
     * Ruft den Wert der lineSectionPointType-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link LineSectionPointTypeEnumeration }
     *     
     */
    public LineSectionPointTypeEnumeration getLineSectionPointType() {
        return lineSectionPointType;
    }

    /**
     * Legt den Wert der lineSectionPointType-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link LineSectionPointTypeEnumeration }
     *     
     */
    public void setLineSectionPointType(LineSectionPointTypeEnumeration value) {
        this.lineSectionPointType = value;
    }

    /**
     * Ruft den Wert der showAsAccessible-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isShowAsAccessible() {
        return showAsAccessible;
    }

    /**
     * Legt den Wert der showAsAccessible-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setShowAsAccessible(Boolean value) {
        this.showAsAccessible = value;
    }

    /**
     * Gets the value of the connectingVehicleModes property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the connectingVehicleModes property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getConnectingVehicleModes().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AllPublicTransportModesEnumeration }
     * 
     * 
     */
    public List<AllPublicTransportModesEnumeration> getConnectingVehicleModes() {
        if (connectingVehicleModes == null) {
            connectingVehicleModes = new ArrayList<AllPublicTransportModesEnumeration>();
        }
        return this.connectingVehicleModes;
    }

}
