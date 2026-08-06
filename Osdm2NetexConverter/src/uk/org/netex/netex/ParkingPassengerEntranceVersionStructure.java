//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// �nderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2026.05.22 um 10:24:00 AM CEST 
//


package uk.org.netex.netex;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Type for a PARKING PASSENGER ENTRANCe.
 * 
 * <p>Java-Klasse f�r ParkingPassengerEntrance_VersionStructure complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="ParkingPassengerEntrance_VersionStructure">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.netex.org.uk/netex}SiteEntrance_VersionStructure">
 *       &lt;group ref="{http://www.netex.org.uk/netex}ParkingPassengerEntranceGroup"/>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ParkingPassengerEntrance_VersionStructure", propOrder = {
    "areas"
})
@XmlSeeAlso({
    ParkingPassengerEntrance.class
})
public class ParkingPassengerEntranceVersionStructure
    extends SiteEntranceVersionStructure
{

    protected ParkingAreaRefsRelStructure areas;

    /**
     * Ruft den Wert der areas-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ParkingAreaRefsRelStructure }
     *     
     */
    public ParkingAreaRefsRelStructure getAreas() {
        return areas;
    }

    /**
     * Legt den Wert der areas-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ParkingAreaRefsRelStructure }
     *     
     */
    public void setAreas(ParkingAreaRefsRelStructure value) {
        this.areas = value;
    }

}
