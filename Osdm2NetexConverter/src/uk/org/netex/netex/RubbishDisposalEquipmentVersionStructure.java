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
 * Type for RUBBISH DISPOSAL EQUIPMENT.
 * 
 * <p>Java-Klasse f�r RubbishDisposalEquipment_VersionStructure complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="RubbishDisposalEquipment_VersionStructure">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.netex.org.uk/netex}PassengerEquipment_VersionStructure">
 *       &lt;sequence>
 *         &lt;group ref="{http://www.netex.org.uk/netex}RubbishDisposalEquipmentGroup"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RubbishDisposalEquipment_VersionStructure", propOrder = {
    "sharpsDisposal",
    "recycling"
})
@XmlSeeAlso({
    RubbishDisposalEquipment.class
})
public class RubbishDisposalEquipmentVersionStructure
    extends PassengerEquipmentVersionStructure
{

    @XmlElement(name = "SharpsDisposal")
    protected Boolean sharpsDisposal;
    @XmlElement(name = "Recycling")
    protected Boolean recycling;

    /**
     * Ruft den Wert der sharpsDisposal-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSharpsDisposal() {
        return sharpsDisposal;
    }

    /**
     * Legt den Wert der sharpsDisposal-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSharpsDisposal(Boolean value) {
        this.sharpsDisposal = value;
    }

    /**
     * Ruft den Wert der recycling-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isRecycling() {
        return recycling;
    }

    /**
     * Legt den Wert der recycling-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setRecycling(Boolean value) {
        this.recycling = value;
    }

}
