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
 * Type for a list of JOURNEYs.
 * 
 * <p>Java-Klasse f�r journeyRefs_RelStructure complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="journeyRefs_RelStructure">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.netex.org.uk/netex}oneToManyRelationshipStructure">
 *       &lt;choice maxOccurs="unbounded">
 *         &lt;element ref="{http://www.netex.org.uk/netex}JourneyRef"/>
 *         &lt;element ref="{http://www.netex.org.uk/netex}JourneyDesignator"/>
 *         &lt;element ref="{http://www.netex.org.uk/netex}ServiceDesignator"/>
 *       &lt;/choice>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "journeyRefs_RelStructure", propOrder = {
    "journeyRefOrJourneyDesignatorOrServiceDesignator"
})
public class JourneyRefsRelStructure
    extends OneToManyRelationshipStructure
{

    @XmlElementRefs({
        @XmlElementRef(name = "JourneyRef", namespace = "http://www.netex.org.uk/netex", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "ServiceDesignator", namespace = "http://www.netex.org.uk/netex", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "JourneyDesignator", namespace = "http://www.netex.org.uk/netex", type = JAXBElement.class, required = false)
    })
    protected List<JAXBElement<?>> journeyRefOrJourneyDesignatorOrServiceDesignator;

    /**
     * Gets the value of the journeyRefOrJourneyDesignatorOrServiceDesignator property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the journeyRefOrJourneyDesignatorOrServiceDesignator property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getJourneyRefOrJourneyDesignatorOrServiceDesignator().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JAXBElement }{@code <}{@link DatedSpecialServiceRefStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link VehicleJourneyRefStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link JourneyRefStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link ServiceDesignatorStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link DeadRunRefStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link SpecialServiceRefStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link VehicleJourneyRefStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link SingleJourneyRefStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link VehicleJourneyRefStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link JourneyDesignatorStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link ServiceJourneyRefStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link TemplateServiceJourneyRefStructure }{@code >}
     * 
     * 
     */
    public List<JAXBElement<?>> getJourneyRefOrJourneyDesignatorOrServiceDesignator() {
        if (journeyRefOrJourneyDesignatorOrServiceDesignator == null) {
            journeyRefOrJourneyDesignatorOrServiceDesignator = new ArrayList<JAXBElement<?>>();
        }
        return this.journeyRefOrJourneyDesignatorOrServiceDesignator;
    }

}
