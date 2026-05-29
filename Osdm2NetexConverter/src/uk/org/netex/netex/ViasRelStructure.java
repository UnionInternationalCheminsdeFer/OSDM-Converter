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
import jakarta.xml.bind.annotation.XmlType;


/**
 * Type for a list of VIA Names.
 * 
 * <p>Java-Klasse f�r vias_RelStructure complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="vias_RelStructure">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.netex.org.uk/netex}strictContainmentAggregationStructure">
 *       &lt;choice>
 *         &lt;element name="None" type="{http://www.netex.org.uk/netex}EmptyType"/>
 *         &lt;sequence>
 *           &lt;element name="Via" type="{http://www.netex.org.uk/netex}Via_VersionedChildStructure" maxOccurs="unbounded"/>
 *         &lt;/sequence>
 *       &lt;/choice>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "vias_RelStructure", propOrder = {
    "none",
    "via"
})
public class ViasRelStructure
    extends StrictContainmentAggregationStructure
{

    @XmlElement(name = "None")
    protected String none;
    @XmlElement(name = "Via")
    protected List<ViaVersionedChildStructure> via;

    /**
     * Ruft den Wert der none-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNone() {
        return none;
    }

    /**
     * Legt den Wert der none-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNone(String value) {
        this.none = value;
    }

    /**
     * Gets the value of the via property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the via property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getVia().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ViaVersionedChildStructure }
     * 
     * 
     */
    public List<ViaVersionedChildStructure> getVia() {
        if (via == null) {
            via = new ArrayList<ViaVersionedChildStructure>();
        }
        return this.via;
    }

}
