//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// �nderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2026.05.22 um 10:24:00 AM CEST 
//


package uk.org.netex.netex;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Type for a MEETING POINT SERVICE.
 * 
 * <p>Java-Klasse f�r MeetingPointService_VersionStructure complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="MeetingPointService_VersionStructure">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.netex.org.uk/netex}CustomerService_VersionStructure">
 *       &lt;sequence>
 *         &lt;group ref="{http://www.netex.org.uk/netex}MeetingPointServiceGroup"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MeetingPointService_VersionStructure", propOrder = {
    "meetingPointServiceType",
    "label"
})
@XmlSeeAlso({
    MeetingPointService.class
})
public class MeetingPointServiceVersionStructure
    extends CustomerServiceVersionStructure
{

    @XmlElement(name = "MeetingPointServiceType", required = true)
    @XmlSchemaType(name = "NMTOKEN")
    protected MeetingPointEnumeration meetingPointServiceType;
    @XmlElement(name = "Label")
    protected MultilingualString label;

    /**
     * Ruft den Wert der meetingPointServiceType-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link MeetingPointEnumeration }
     *     
     */
    public MeetingPointEnumeration getMeetingPointServiceType() {
        return meetingPointServiceType;
    }

    /**
     * Legt den Wert der meetingPointServiceType-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link MeetingPointEnumeration }
     *     
     */
    public void setMeetingPointServiceType(MeetingPointEnumeration value) {
        this.meetingPointServiceType = value;
    }

    /**
     * Ruft den Wert der label-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link MultilingualString }
     *     
     */
    public MultilingualString getLabel() {
        return label;
    }

    /**
     * Legt den Wert der label-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link MultilingualString }
     *     
     */
    public void setLabel(MultilingualString value) {
        this.label = value;
    }

}
