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
 * Type for a list of refernces to MOBILITY SERVICEs.
 * 
 * <p>Java-Klasse f�r mobilityServiceRefs_RelStructure complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="mobilityServiceRefs_RelStructure">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.netex.org.uk/netex}containmentAggregationStructure">
 *       &lt;choice minOccurs="0">
 *         &lt;element ref="{http://www.netex.org.uk/netex}MobilityServiceRef" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/choice>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "mobilityServiceRefs_RelStructure", propOrder = {
    "mobilityServiceRef"
})
public class MobilityServiceRefsRelStructure
    extends ContainmentAggregationStructure
{

    @XmlElementRef(name = "MobilityServiceRef", namespace = "http://www.netex.org.uk/netex", type = JAXBElement.class, required = false)
    protected List<JAXBElement<? extends MobilityServiceRefStructure>> mobilityServiceRef;

    /**
     * Gets the value of the mobilityServiceRef property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the mobilityServiceRef property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMobilityServiceRef().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JAXBElement }{@code <}{@link MobilityServiceRefStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link VehicleSharingServiceRefStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link OnlineServiceRefStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link ChauffeuredVehicleServiceRefStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link VehicleRentalServiceRefStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link CarPoolingServiceRefStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link CommonVehicleServiceRefStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link VehiclePoolingServiceRefStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link TaxiServiceRefStructure }{@code >}
     * 
     * 
     */
    public List<JAXBElement<? extends MobilityServiceRefStructure>> getMobilityServiceRef() {
        if (mobilityServiceRef == null) {
            mobilityServiceRef = new ArrayList<JAXBElement<? extends MobilityServiceRefStructure>>();
        }
        return this.mobilityServiceRef;
    }

}
