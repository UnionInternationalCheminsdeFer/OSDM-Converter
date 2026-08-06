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
 * Type for a list of references to a VERSION FRAME.
 * 
 * <p>Java-Klasse f�r versionFrameRefs_RelStructure complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="versionFrameRefs_RelStructure">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.netex.org.uk/netex}oneToManyRelationshipStructure">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.netex.org.uk/netex}VersionFrameRef" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "versionFrameRefs_RelStructure", propOrder = {
    "versionFrameRef"
})
public class VersionFrameRefsRelStructure
    extends OneToManyRelationshipStructure
{

    @XmlElementRef(name = "VersionFrameRef", namespace = "http://www.netex.org.uk/netex", type = JAXBElement.class)
    protected List<JAXBElement<? extends VersionFrameRefStructure>> versionFrameRef;

    /**
     * Gets the value of the versionFrameRef property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the versionFrameRef property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getVersionFrameRef().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JAXBElement }{@code <}{@link TimetableFrameRefStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link ServiceCalendarFrameRef }{@code >}
     * {@link JAXBElement }{@code <}{@link DriverScheduleFrameRefStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link FareFrameRefStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link GeneralFrameRefStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link VehicleScheduleFrameRefStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link FarePriceFrameRefStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link MobilityJourneyFrameRefStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link InfrastructureFrameRefStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link SalesTransactionFrameRefStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link MobilityServiceFrameRefStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link ServiceFrameRefStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link ResourceFrameRefStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link VersionFrameRefStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link CompositeFrameRefStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link SiteFrameRefStructure }{@code >}
     * 
     * 
     */
    public List<JAXBElement<? extends VersionFrameRefStructure>> getVersionFrameRef() {
        if (versionFrameRef == null) {
            versionFrameRef = new ArrayList<JAXBElement<? extends VersionFrameRefStructure>>();
        }
        return this.versionFrameRef;
    }

}
