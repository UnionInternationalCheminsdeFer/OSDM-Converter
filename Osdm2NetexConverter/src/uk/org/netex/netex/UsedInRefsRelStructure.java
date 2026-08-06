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
import jakarta.xml.bind.annotation.XmlElementRefs;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Type for use of fare table.
 * 
 * <p>Java-Klasse f�r usedInRefs_RelStructure complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="usedInRefs_RelStructure">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.netex.org.uk/netex}oneToManyRelationshipStructure">
 *       &lt;choice maxOccurs="unbounded">
 *         &lt;element ref="{http://www.netex.org.uk/netex}TariffRef" minOccurs="0"/>
 *         &lt;element ref="{http://www.netex.org.uk/netex}GroupOfDistanceMatrixElementsRef" minOccurs="0"/>
 *         &lt;element ref="{http://www.netex.org.uk/netex}GroupOfSalesOfferPackagesRef" minOccurs="0"/>
 *       &lt;/choice>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "usedInRefs_RelStructure", propOrder = {
    "tariffRefOrGroupOfDistanceMatrixElementsRefOrGroupOfSalesOfferPackagesRef"
})
public class UsedInRefsRelStructure
    extends OneToManyRelationshipStructure
{

    @XmlElementRefs({
        @XmlElementRef(name = "GroupOfSalesOfferPackagesRef", namespace = "http://www.netex.org.uk/netex", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "GroupOfDistanceMatrixElementsRef", namespace = "http://www.netex.org.uk/netex", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "TariffRef", namespace = "http://www.netex.org.uk/netex", type = JAXBElement.class, required = false)
    })
    protected List<JAXBElement<? extends VersionOfObjectRefStructure>> tariffRefOrGroupOfDistanceMatrixElementsRefOrGroupOfSalesOfferPackagesRef;

    /**
     * Gets the value of the tariffRefOrGroupOfDistanceMatrixElementsRefOrGroupOfSalesOfferPackagesRef property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the tariffRefOrGroupOfDistanceMatrixElementsRefOrGroupOfSalesOfferPackagesRef property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTariffRefOrGroupOfDistanceMatrixElementsRefOrGroupOfSalesOfferPackagesRef().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JAXBElement }{@code <}{@link GroupOfSalesOfferPackagesRefStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link TariffRefStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link GroupOfDistanceMatrixElementsRefStructureElement }{@code >}
     * {@link JAXBElement }{@code <}{@link ParkingTariffRefStructure }{@code >}
     * 
     * 
     */
    public List<JAXBElement<? extends VersionOfObjectRefStructure>> getTariffRefOrGroupOfDistanceMatrixElementsRefOrGroupOfSalesOfferPackagesRef() {
        if (tariffRefOrGroupOfDistanceMatrixElementsRefOrGroupOfSalesOfferPackagesRef == null) {
            tariffRefOrGroupOfDistanceMatrixElementsRefOrGroupOfSalesOfferPackagesRef = new ArrayList<JAXBElement<? extends VersionOfObjectRefStructure>>();
        }
        return this.tariffRefOrGroupOfDistanceMatrixElementsRefOrGroupOfSalesOfferPackagesRef;
    }

}
