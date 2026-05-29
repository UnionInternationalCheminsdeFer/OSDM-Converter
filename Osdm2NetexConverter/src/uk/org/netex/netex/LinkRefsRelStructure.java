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
 * Type for a list of references to a LINK.
 * 
 * <p>Java-Klasse f�r linkRefs_RelStructure complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="linkRefs_RelStructure">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.netex.org.uk/netex}oneToManyRelationshipStructure">
 *       &lt;choice maxOccurs="unbounded">
 *         &lt;element ref="{http://www.netex.org.uk/netex}LinkRef"/>
 *         &lt;element ref="{http://www.netex.org.uk/netex}LinkRefByValue"/>
 *       &lt;/choice>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "linkRefs_RelStructure", propOrder = {
    "linkRefOrLinkRefByValue"
})
public class LinkRefsRelStructure
    extends OneToManyRelationshipStructure
{

    @XmlElementRefs({
        @XmlElementRef(name = "LinkRefByValue", namespace = "http://www.netex.org.uk/netex", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "LinkRef", namespace = "http://www.netex.org.uk/netex", type = JAXBElement.class, required = false)
    })
    protected List<JAXBElement<?>> linkRefOrLinkRefByValue;

    /**
     * Gets the value of the linkRefOrLinkRefByValue property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the linkRefOrLinkRefByValue property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLinkRefOrLinkRefByValue().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JAXBElement }{@code <}{@link RouteLinkRefStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link WireLinkRefStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link DeckPathLinkRefStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link RoadLinkRefByValueStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link RailwayLinkRefByValueStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link OffSitePathLinkRefStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link ActivationLinkRefStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link WireLinkRefByValueStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link ModalLinkRefByValueStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link RoadLinkRefStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link VehicleMeetingLinkRefStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link ActivationLinkRefByValueStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link LineLinkRefStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link VehicleMeetingLinkRefStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link SitePathLinkRefStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link PathLinkRefByValueStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link RouteLinkRefByValueStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link ServiceLinkRefByValueStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link RailwayLinkRefStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link InfrastructureLinkRefStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link GenericPathLinkRefStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link TimingLinkRefStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link ServiceLinkRefStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link LineLinkRefByValueStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link LinkRefByValueStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link LinkRefStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link TimingLinkRefByValueStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link SitePathLinkRefStructure }{@code >}
     * 
     * 
     */
    public List<JAXBElement<?>> getLinkRefOrLinkRefByValue() {
        if (linkRefOrLinkRefByValue == null) {
            linkRefOrLinkRefByValue = new ArrayList<JAXBElement<?>>();
        }
        return this.linkRefOrLinkRefByValue;
    }

}
