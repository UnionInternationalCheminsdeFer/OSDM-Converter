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
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Type for a list of ORGANISATION PARTs.
 * 
 * <p>Java-Klasse f�r organisationParts_RelStructure complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="organisationParts_RelStructure">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.netex.org.uk/netex}containmentAggregationStructure">
 *       &lt;choice maxOccurs="unbounded">
 *         &lt;element ref="{http://www.netex.org.uk/netex}OrganisationPartRef"/>
 *         &lt;element ref="{http://www.netex.org.uk/netex}OrganisationPart_Dummy"/>
 *       &lt;/choice>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "organisationParts_RelStructure", propOrder = {
    "organisationPartRefOrOrganisationPartDummy"
})
@XmlSeeAlso({
    uk.org.netex.netex.OrganisationVersionStructure.Parts.class
})
public class OrganisationPartsRelStructure
    extends ContainmentAggregationStructure
{

    @XmlElementRefs({
        @XmlElementRef(name = "OrganisationPart_Dummy", namespace = "http://www.netex.org.uk/netex", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "OrganisationPartRef", namespace = "http://www.netex.org.uk/netex", type = JAXBElement.class, required = false)
    })
    protected List<JAXBElement<?>> organisationPartRefOrOrganisationPartDummy;

    /**
     * Gets the value of the organisationPartRefOrOrganisationPartDummy property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the organisationPartRefOrOrganisationPartDummy property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOrganisationPartRefOrOrganisationPartDummy().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JAXBElement }{@code <}{@link OrganisationPart }{@code >}
     * {@link JAXBElement }{@code <}{@link ControlCentre }{@code >}
     * {@link JAXBElement }{@code <}{@link DataManagedObjectStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link DepartmentRefStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link OrganisationalUnit }{@code >}
     * {@link JAXBElement }{@code <}{@link ControlCentreRefStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link Department }{@code >}
     * {@link JAXBElement }{@code <}{@link OrganisationPartRefStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link OperatingDepartment }{@code >}
     * {@link JAXBElement }{@code <}{@link OrganisationalUnitRefStructure }{@code >}
     * 
     * 
     */
    public List<JAXBElement<?>> getOrganisationPartRefOrOrganisationPartDummy() {
        if (organisationPartRefOrOrganisationPartDummy == null) {
            organisationPartRefOrOrganisationPartDummy = new ArrayList<JAXBElement<?>>();
        }
        return this.organisationPartRefOrOrganisationPartDummy;
    }

}
