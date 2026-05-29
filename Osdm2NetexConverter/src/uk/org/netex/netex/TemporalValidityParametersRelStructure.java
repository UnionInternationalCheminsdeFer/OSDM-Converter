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
 * One to many Relationship for temporal validity parameters.
 * 
 * <p>Java-Klasse f�r temporalValidityParameters_RelStructure complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="temporalValidityParameters_RelStructure">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.netex.org.uk/netex}oneToManyRelationshipStructure">
 *       &lt;sequence maxOccurs="unbounded">
 *         &lt;group ref="{http://www.netex.org.uk/netex}TemporalValidityParametersGroup"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "temporalValidityParameters_RelStructure", propOrder = {
    "dayTypeRefAndTimebandRefAndGroupOfTimebandsRef"
})
public class TemporalValidityParametersRelStructure
    extends OneToManyRelationshipStructure
{

    @XmlElementRefs({
        @XmlElementRef(name = "OperatingPeriodRef", namespace = "http://www.netex.org.uk/netex", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "OperatingDayRef", namespace = "http://www.netex.org.uk/netex", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "TimebandRef", namespace = "http://www.netex.org.uk/netex", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "GroupOfTimebandsRef", namespace = "http://www.netex.org.uk/netex", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "ValidityConditionRef", namespace = "http://www.netex.org.uk/netex", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "ServiceCalendarRef", namespace = "http://www.netex.org.uk/netex", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "DayTypeRef", namespace = "http://www.netex.org.uk/netex", type = JAXBElement.class, required = false)
    })
    protected List<JAXBElement<? extends VersionOfObjectRefStructure>> dayTypeRefAndTimebandRefAndGroupOfTimebandsRef;

    /**
     * Gets the value of the dayTypeRefAndTimebandRefAndGroupOfTimebandsRef property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the dayTypeRefAndTimebandRefAndGroupOfTimebandsRef property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDayTypeRefAndTimebandRefAndGroupOfTimebandsRef().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JAXBElement }{@code <}{@link OperatingPeriodRefStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link ValidityTriggerRefStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link OperatingDayRefStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link AvailabilityConditionRefStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link TimebandRefStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link FareDayTypeRefStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link GroupOfTimebandsRefStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link OperatingPeriodRefStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link ValidityConditionRefStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link ServiceCalendarRefStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link ValidityRuleParameterRefStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link DayTypeRefStructure }{@code >}
     * 
     * 
     */
    public List<JAXBElement<? extends VersionOfObjectRefStructure>> getDayTypeRefAndTimebandRefAndGroupOfTimebandsRef() {
        if (dayTypeRefAndTimebandRefAndGroupOfTimebandsRef == null) {
            dayTypeRefAndTimebandRefAndGroupOfTimebandsRef = new ArrayList<JAXBElement<? extends VersionOfObjectRefStructure>>();
        }
        return this.dayTypeRefAndTimebandRefAndGroupOfTimebandsRef;
    }

}
