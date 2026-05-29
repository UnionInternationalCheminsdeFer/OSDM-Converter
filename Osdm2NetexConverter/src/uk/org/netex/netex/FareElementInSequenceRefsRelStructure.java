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
import jakarta.xml.bind.annotation.XmlType;


/**
 * Type for a collection of one or more references to a FARE STRUCTURE ELEMENT IN SEQUENCE.
 * 
 * <p>Java-Klasse f�r fareElementInSequenceRefs_RelStructure complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="fareElementInSequenceRefs_RelStructure">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.netex.org.uk/netex}oneToManyRelationshipStructure">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.netex.org.uk/netex}FareElementInSequenceRef" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "fareElementInSequenceRefs_RelStructure", propOrder = {
    "fareElementInSequenceRef"
})
public class FareElementInSequenceRefsRelStructure
    extends OneToManyRelationshipStructure
{

    @XmlElementRef(name = "FareElementInSequenceRef", namespace = "http://www.netex.org.uk/netex", type = JAXBElement.class)
    protected List<JAXBElement<? extends FareElementInSequenceRefStructure>> fareElementInSequenceRef;

    /**
     * Gets the value of the fareElementInSequenceRef property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the fareElementInSequenceRef property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFareElementInSequenceRef().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JAXBElement }{@code <}{@link FareStructureElementInSequenceRefStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link ControllableElementInSequenceRefStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link FareElementInSequenceRefStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link AccessRightInProductRefStructure }{@code >}
     * 
     * 
     */
    public List<JAXBElement<? extends FareElementInSequenceRefStructure>> getFareElementInSequenceRef() {
        if (fareElementInSequenceRef == null) {
            fareElementInSequenceRef = new ArrayList<JAXBElement<? extends FareElementInSequenceRefStructure>>();
        }
        return this.fareElementInSequenceRef;
    }

}
