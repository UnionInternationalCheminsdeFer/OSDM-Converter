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
 * SUBMODEs associated with entity.
 * 
 * <p>Java-Klasse f�r modesOfOperationRelStructure complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="modesOfOperationRelStructure">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.netex.org.uk/netex}containmentAggregationStructure">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.netex.org.uk/netex}ModeOfOperation_Dummy" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "modesOfOperationRelStructure", propOrder = {
    "modeOfOperationDummy"
})
public class ModesOfOperationRelStructure
    extends ContainmentAggregationStructure
{

    @XmlElementRef(name = "ModeOfOperation_Dummy", namespace = "http://www.netex.org.uk/netex", type = JAXBElement.class)
    protected List<JAXBElement<? extends DataManagedObjectStructure>> modeOfOperationDummy;

    /**
     * Gets the value of the modeOfOperationDummy property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the modeOfOperationDummy property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getModeOfOperationDummy().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JAXBElement }{@code <}{@link AlternativeModeOfOperation }{@code >}
     * {@link JAXBElement }{@code <}{@link VehiclePooling }{@code >}
     * {@link JAXBElement }{@code <}{@link DataManagedObjectStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link VehicleRental }{@code >}
     * {@link JAXBElement }{@code <}{@link ModeOfOperation }{@code >}
     * {@link JAXBElement }{@code <}{@link VehicleSharing }{@code >}
     * {@link JAXBElement }{@code <}{@link ConventionalModeOfOperation }{@code >}
     * {@link JAXBElement }{@code <}{@link PersonalModeOfOperation }{@code >}
     * {@link JAXBElement }{@code <}{@link DataManagedObjectStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link DataManagedObjectStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link ScheduledOperation }{@code >}
     * {@link JAXBElement }{@code <}{@link FlexibleOperation }{@code >}
     * 
     * 
     */
    public List<JAXBElement<? extends DataManagedObjectStructure>> getModeOfOperationDummy() {
        if (modeOfOperationDummy == null) {
            modeOfOperationDummy = new ArrayList<JAXBElement<? extends DataManagedObjectStructure>>();
        }
        return this.modeOfOperationDummy;
    }

}
