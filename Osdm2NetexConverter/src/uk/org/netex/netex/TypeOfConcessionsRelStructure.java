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
import jakarta.xml.bind.annotation.XmlElements;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Type for a list of TYPE OF CONCESSIONs.
 * 
 * <p>Java-Klasse f�r typeOfConcessions_RelStructure complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="typeOfConcessions_RelStructure">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.netex.org.uk/netex}containmentAggregationStructure">
 *       &lt;choice maxOccurs="unbounded">
 *         &lt;element ref="{http://www.netex.org.uk/netex}TypeOfConcessionRef"/>
 *         &lt;element ref="{http://www.netex.org.uk/netex}TypeOfConcession"/>
 *       &lt;/choice>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "typeOfConcessions_RelStructure", propOrder = {
    "typeOfConcessionRefOrTypeOfConcession"
})
public class TypeOfConcessionsRelStructure
    extends ContainmentAggregationStructure
{

    @XmlElements({
        @XmlElement(name = "TypeOfConcessionRef", type = TypeOfConcessionRefStructure.class),
        @XmlElement(name = "TypeOfConcession", type = TypeOfConcession.class)
    })
    protected List<Object> typeOfConcessionRefOrTypeOfConcession;

    /**
     * Gets the value of the typeOfConcessionRefOrTypeOfConcession property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the typeOfConcessionRefOrTypeOfConcession property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTypeOfConcessionRefOrTypeOfConcession().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TypeOfConcessionRefStructure }
     * {@link TypeOfConcession }
     * 
     * 
     */
    public List<Object> getTypeOfConcessionRefOrTypeOfConcession() {
        if (typeOfConcessionRefOrTypeOfConcession == null) {
            typeOfConcessionRefOrTypeOfConcession = new ArrayList<Object>();
        }
        return this.typeOfConcessionRefOrTypeOfConcession;
    }

}
