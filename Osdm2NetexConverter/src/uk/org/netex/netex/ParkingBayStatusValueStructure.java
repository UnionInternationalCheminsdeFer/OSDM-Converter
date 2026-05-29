//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// �nderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2026.05.22 um 10:24:00 AM CEST 
//


package uk.org.netex.netex;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElementRef;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Type for a PARKING BAY STATUS.
 * 
 * <p>Java-Klasse f�r ParkingBayStatus_ValueStructure complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="ParkingBayStatus_ValueStructure">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.netex.org.uk/netex}TypeOfValue_VersionStructure">
 *       &lt;group ref="{http://www.netex.org.uk/netex}ParkingBayStatusGroup"/>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ParkingBayStatus_ValueStructure", propOrder = {
    "rest"
})
@XmlSeeAlso({
    ParkingBayStatus.class
})
public class ParkingBayStatusValueStructure
    extends TypeOfValueVersionStructure
{

    @XmlElementRef(name = "Status", namespace = "http://www.netex.org.uk/netex", type = JAXBElement.class, required = false)
    protected List<JAXBElement<ParkingBayStatusEnumeration>> rest;

    /**
     * Ruft das restliche Contentmodell ab. 
     * 
     * <p>
     * Sie rufen diese "catch-all"-Eigenschaft aus folgendem Grund ab: 
     * Der Feldname "Status" wird von zwei verschiedenen Teilen eines Schemas verwendet. Siehe: 
     * Zeile 238 von file:/D:/eclipse-wsp3/NeTex/schema/xsd/netex_part_5/part5_nd/netex_nm_vehicleParkingAreaInformation_version.xsd
     * Zeile 192 von file:/D:/eclipse-wsp3/NeTex/schema/xsd/netex_framework/netex_responsibility/netex_version_support.xsd
     * <p>
     * Um diese Eigenschaft zu entfernen, wenden Sie eine Eigenschaftenanpassung f�r eine
     * der beiden folgenden Deklarationen an, um deren Namen zu �ndern: 
     * Gets the value of the rest property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the rest property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRest().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JAXBElement }{@code <}{@link ParkingBayStatusEnumeration }{@code >}
     * 
     * 
     */
    public List<JAXBElement<ParkingBayStatusEnumeration>> getRest() {
        if (rest == null) {
            rest = new ArrayList<JAXBElement<ParkingBayStatusEnumeration>>();
        }
        return this.rest;
    }

}
