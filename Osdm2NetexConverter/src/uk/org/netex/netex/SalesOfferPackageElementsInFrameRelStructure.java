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
 * Type for containment in frame of SALES OFFER PACKAGE Element.
 * 
 * <p>Java-Klasse f�r salesOfferPackageElementsInFrame_RelStructure complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="salesOfferPackageElementsInFrame_RelStructure">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.netex.org.uk/netex}frameContainmentStructure">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.netex.org.uk/netex}SalesOfferPackageElement" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "salesOfferPackageElementsInFrame_RelStructure", propOrder = {
    "salesOfferPackageElement"
})
public class SalesOfferPackageElementsInFrameRelStructure
    extends FrameContainmentStructure
{

    @XmlElement(name = "SalesOfferPackageElement", required = true)
    protected List<SalesOfferPackageElement> salesOfferPackageElement;

    /**
     * Gets the value of the salesOfferPackageElement property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the salesOfferPackageElement property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSalesOfferPackageElement().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SalesOfferPackageElement }
     * 
     * 
     */
    public List<SalesOfferPackageElement> getSalesOfferPackageElement() {
        if (salesOfferPackageElement == null) {
            salesOfferPackageElement = new ArrayList<SalesOfferPackageElement>();
        }
        return this.salesOfferPackageElement;
    }

}
