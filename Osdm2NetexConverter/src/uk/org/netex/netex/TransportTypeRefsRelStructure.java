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
 * Type for a list of TRANSPORT TYPEs.
 * 
 * <p>Java-Klasse f�r transportTypeRefs_RelStructure complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="transportTypeRefs_RelStructure">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.netex.org.uk/netex}oneToManyRelationshipStructure">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.netex.org.uk/netex}TransportTypeRef" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "transportTypeRefs_RelStructure", propOrder = {
    "transportTypeRef"
})
public class TransportTypeRefsRelStructure
    extends OneToManyRelationshipStructure
{

    @XmlElementRef(name = "TransportTypeRef", namespace = "http://www.netex.org.uk/netex", type = JAXBElement.class)
    protected List<JAXBElement<? extends TransportTypeRefStructure>> transportTypeRef;

    /**
     * Gets the value of the transportTypeRef property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the transportTypeRef property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTransportTypeRef().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JAXBElement }{@code <}{@link TrainRefStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link CompoundTrainRef }{@code >}
     * {@link JAXBElement }{@code <}{@link TransportTypeRefStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link PoweredTrainRefStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link VehicleTypeRefStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link SimpleVehicleTypeRefStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link UnpoweredTrainRefStructure }{@code >}
     * 
     * 
     */
    public List<JAXBElement<? extends TransportTypeRefStructure>> getTransportTypeRef() {
        if (transportTypeRef == null) {
            transportTypeRef = new ArrayList<JAXBElement<? extends TransportTypeRefStructure>>();
        }
        return this.transportTypeRef;
    }

}
