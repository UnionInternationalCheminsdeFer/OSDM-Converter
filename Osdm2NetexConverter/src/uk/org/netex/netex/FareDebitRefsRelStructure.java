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
 * Type for a collection of one or more references to a FARE DEBIT.
 * 
 * <p>Java-Klasse f�r fareDebitRefs_RelStructure complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="fareDebitRefs_RelStructure">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.netex.org.uk/netex}oneToManyRelationshipStructure">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.netex.org.uk/netex}FareDebitRef" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "fareDebitRefs_RelStructure", propOrder = {
    "fareDebitRef"
})
public class FareDebitRefsRelStructure
    extends OneToManyRelationshipStructure
{

    @XmlElementRef(name = "FareDebitRef", namespace = "http://www.netex.org.uk/netex", type = JAXBElement.class)
    protected List<JAXBElement<? extends FareDebitRefStructure>> fareDebitRef;

    /**
     * Gets the value of the fareDebitRef property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the fareDebitRef property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFareDebitRef().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JAXBElement }{@code <}{@link TripDebitRefStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link BookingDebitRefStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link OffenceDebitRefStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link OtherDebitRefStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link FareProductSaleDebitRefStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link FareDebitRefStructure }{@code >}
     * 
     * 
     */
    public List<JAXBElement<? extends FareDebitRefStructure>> getFareDebitRef() {
        if (fareDebitRef == null) {
            fareDebitRef = new ArrayList<JAXBElement<? extends FareDebitRefStructure>>();
        }
        return this.fareDebitRef;
    }

}
