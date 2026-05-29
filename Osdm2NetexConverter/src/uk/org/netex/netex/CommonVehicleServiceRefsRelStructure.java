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
 * Type for a list of COMMON VEHICLE SERVICEs.
 * 
 * <p>Java-Klasse f�r commonVehicleServiceRefs_RelStructure complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="commonVehicleServiceRefs_RelStructure">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.netex.org.uk/netex}oneToManyRelationshipStructure">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.netex.org.uk/netex}CommonVehicleServiceRef" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "commonVehicleServiceRefs_RelStructure", propOrder = {
    "commonVehicleServiceRef"
})
public class CommonVehicleServiceRefsRelStructure
    extends OneToManyRelationshipStructure
{

    @XmlElementRef(name = "CommonVehicleServiceRef", namespace = "http://www.netex.org.uk/netex", type = JAXBElement.class)
    protected List<JAXBElement<? extends CommonVehicleServiceRefStructure>> commonVehicleServiceRef;

    /**
     * Gets the value of the commonVehicleServiceRef property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the commonVehicleServiceRef property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCommonVehicleServiceRef().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JAXBElement }{@code <}{@link VehicleSharingServiceRefStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link ChauffeuredVehicleServiceRefStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link VehicleRentalServiceRefStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link CarPoolingServiceRefStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link CommonVehicleServiceRefStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link VehiclePoolingServiceRefStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link TaxiServiceRefStructure }{@code >}
     * 
     * 
     */
    public List<JAXBElement<? extends CommonVehicleServiceRefStructure>> getCommonVehicleServiceRef() {
        if (commonVehicleServiceRef == null) {
            commonVehicleServiceRef = new ArrayList<JAXBElement<? extends CommonVehicleServiceRefStructure>>();
        }
        return this.commonVehicleServiceRef;
    }

}
