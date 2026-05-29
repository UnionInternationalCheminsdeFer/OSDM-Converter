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
 * Type for containment in frame of VEHICLE TYPEs.
 * 
 * <p>Java-Klasse f�r vehicleTypesInFrame_RelStructure complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="vehicleTypesInFrame_RelStructure">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.netex.org.uk/netex}containmentAggregationStructure">
 *       &lt;choice minOccurs="0">
 *         &lt;element ref="{http://www.netex.org.uk/netex}TransportType_Dummy" maxOccurs="unbounded"/>
 *       &lt;/choice>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "vehicleTypesInFrame_RelStructure", propOrder = {
    "transportTypeDummy"
})
public class VehicleTypesInFrameRelStructure
    extends ContainmentAggregationStructure
{

    @XmlElementRef(name = "TransportType_Dummy", namespace = "http://www.netex.org.uk/netex", type = JAXBElement.class, required = false)
    protected List<JAXBElement<? extends DataManagedObjectStructure>> transportTypeDummy;

    /**
     * Gets the value of the transportTypeDummy property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the transportTypeDummy property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTransportTypeDummy().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JAXBElement }{@code <}{@link VehicleType }{@code >}
     * {@link JAXBElement }{@code <}{@link CompoundTrain }{@code >}
     * {@link JAXBElement }{@code <}{@link SimpleVehicleType }{@code >}
     * {@link JAXBElement }{@code <}{@link DataManagedObjectStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link UnpoweredTrain }{@code >}
     * {@link JAXBElement }{@code <}{@link Train }{@code >}
     * {@link JAXBElement }{@code <}{@link PoweredTrain }{@code >}
     * {@link JAXBElement }{@code <}{@link TransportType }{@code >}
     * {@link JAXBElement }{@code <}{@link DataManagedObjectStructure }{@code >}
     * 
     * 
     */
    public List<JAXBElement<? extends DataManagedObjectStructure>> getTransportTypeDummy() {
        if (transportTypeDummy == null) {
            transportTypeDummy = new ArrayList<JAXBElement<? extends DataManagedObjectStructure>>();
        }
        return this.transportTypeDummy;
    }

}
