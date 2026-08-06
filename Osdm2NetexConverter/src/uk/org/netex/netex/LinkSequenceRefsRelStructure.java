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
 * Type for a list of LINK SEQUENCEs.
 * 
 * <p>Java-Klasse f�r linkSequenceRefs_RelStructure complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="linkSequenceRefs_RelStructure">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.netex.org.uk/netex}oneToManyRelationshipStructure">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.netex.org.uk/netex}LinkSequenceRef" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "linkSequenceRefs_RelStructure", propOrder = {
    "linkSequenceRef"
})
public class LinkSequenceRefsRelStructure
    extends OneToManyRelationshipStructure
{

    @XmlElementRef(name = "LinkSequenceRef", namespace = "http://www.netex.org.uk/netex", type = JAXBElement.class)
    protected List<JAXBElement<? extends LinkSequenceRefStructure>> linkSequenceRef;

    /**
     * Reference to a LINK SEQUENCE.Gets the value of the linkSequenceRef property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the linkSequenceRef property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLinkSequenceRef().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JAXBElement }{@code <}{@link TimingPatternRefStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link SingleJourneyPathRefStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link LinkSequenceRefStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link RouteRefStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link DeadRunRefStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link SpecialServiceRefStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link TripRefStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link SiteNavigationPathRefStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link DeadRunJourneyPatternRefStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link VehicleJourneyRefStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link DeckNavigationPathRefStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link VehicleJourneyRefStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link DatedSpecialServiceRefStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link GenericNavigationPathRefStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link ServicePatternRefStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link JourneyPatternRefStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link TripPatternRefStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link VehicleJourneyRefStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link JourneyRefStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link SiteNavigationPathRefStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link ServiceJourneyPatternRefStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link SingleJourneyRefStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link ServiceJourneyRefStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link TemplateServiceJourneyRefStructure }{@code >}
     * 
     * 
     */
    public List<JAXBElement<? extends LinkSequenceRefStructure>> getLinkSequenceRef() {
        if (linkSequenceRef == null) {
            linkSequenceRef = new ArrayList<JAXBElement<? extends LinkSequenceRefStructure>>();
        }
        return this.linkSequenceRef;
    }

}
