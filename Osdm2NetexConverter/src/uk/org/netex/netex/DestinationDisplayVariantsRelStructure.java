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
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Type for a list of DESTINATION DISPLAY VARIANTs.
 * 
 * <p>Java-Klasse f�r destinationDisplayVariants_RelStructure complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="destinationDisplayVariants_RelStructure">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.netex.org.uk/netex}strictContainmentAggregationStructure">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.netex.org.uk/netex}DestinationDisplayVariant" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "destinationDisplayVariants_RelStructure", propOrder = {
    "destinationDisplayVariant"
})
@XmlSeeAlso({
    uk.org.netex.netex.DestinationDisplayVersionStructure.Variants.class
})
public class DestinationDisplayVariantsRelStructure
    extends StrictContainmentAggregationStructure
{

    @XmlElement(name = "DestinationDisplayVariant", required = true)
    protected List<DestinationDisplayVariant> destinationDisplayVariant;

    /**
     * Gets the value of the destinationDisplayVariant property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the destinationDisplayVariant property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDestinationDisplayVariant().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DestinationDisplayVariant }
     * 
     * 
     */
    public List<DestinationDisplayVariant> getDestinationDisplayVariant() {
        if (destinationDisplayVariant == null) {
            destinationDisplayVariant = new ArrayList<DestinationDisplayVariant>();
        }
        return this.destinationDisplayVariant;
    }

}
