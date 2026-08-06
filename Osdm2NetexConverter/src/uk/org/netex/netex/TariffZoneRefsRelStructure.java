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
 * Type for a list of TARIFF ZONEs.
 * 
 * <p>Java-Klasse f�r tariffZoneRefs_RelStructure complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="tariffZoneRefs_RelStructure">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.netex.org.uk/netex}oneToManyRelationshipStructure">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.netex.org.uk/netex}TariffZoneRef_Dummy" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tariffZoneRefs_RelStructure", propOrder = {
    "tariffZoneRefDummy"
})
public class TariffZoneRefsRelStructure
    extends OneToManyRelationshipStructure
{

    @XmlElementRef(name = "TariffZoneRef_Dummy", namespace = "http://www.netex.org.uk/netex", type = JAXBElement.class)
    protected List<JAXBElement<? extends ZoneRefStructure>> tariffZoneRefDummy;

    /**
     * Gets the value of the tariffZoneRefDummy property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the tariffZoneRefDummy property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTariffZoneRefDummy().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JAXBElement }{@code <}{@link TariffZoneRef }{@code >}
     * {@link JAXBElement }{@code <}{@link FareZoneRefStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link ZoneRefStructure }{@code >}
     * 
     * 
     */
    public List<JAXBElement<? extends ZoneRefStructure>> getTariffZoneRefDummy() {
        if (tariffZoneRefDummy == null) {
            tariffZoneRefDummy = new ArrayList<JAXBElement<? extends ZoneRefStructure>>();
        }
        return this.tariffZoneRefDummy;
    }

}
