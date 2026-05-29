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
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;
import javax.xml.datatype.Duration;


/**
 * Type for DUTY.
 * 
 * <p>Java-Klasse f�r Duty_VersionStructure complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="Duty_VersionStructure">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.netex.org.uk/netex}DataManagedObjectStructure">
 *       &lt;sequence>
 *         &lt;group ref="{http://www.netex.org.uk/netex}DutyGroup"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Duty_VersionStructure", propOrder = {
    "description",
    "finishingDuration",
    "preparationDuration",
    "timetableFrameRef",
    "dutyParts"
})
@XmlSeeAlso({
    Duty.class
})
public class DutyVersionStructure
    extends DataManagedObjectStructure
{

    @XmlElement(name = "Description")
    protected MultilingualString description;
    @XmlElement(name = "FinishingDuration")
    protected Duration finishingDuration;
    @XmlElement(name = "PreparationDuration")
    protected Duration preparationDuration;
    @XmlElement(name = "TimetableFrameRef")
    protected TimetableFrameRefStructure timetableFrameRef;
    protected DutyPartsRelStructure dutyParts;

    /**
     * Ruft den Wert der description-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link MultilingualString }
     *     
     */
    public MultilingualString getDescription() {
        return description;
    }

    /**
     * Legt den Wert der description-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link MultilingualString }
     *     
     */
    public void setDescription(MultilingualString value) {
        this.description = value;
    }

    /**
     * Ruft den Wert der finishingDuration-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Duration }
     *     
     */
    public Duration getFinishingDuration() {
        return finishingDuration;
    }

    /**
     * Legt den Wert der finishingDuration-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Duration }
     *     
     */
    public void setFinishingDuration(Duration value) {
        this.finishingDuration = value;
    }

    /**
     * Ruft den Wert der preparationDuration-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Duration }
     *     
     */
    public Duration getPreparationDuration() {
        return preparationDuration;
    }

    /**
     * Legt den Wert der preparationDuration-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Duration }
     *     
     */
    public void setPreparationDuration(Duration value) {
        this.preparationDuration = value;
    }

    /**
     * Ruft den Wert der timetableFrameRef-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link TimetableFrameRefStructure }
     *     
     */
    public TimetableFrameRefStructure getTimetableFrameRef() {
        return timetableFrameRef;
    }

    /**
     * Legt den Wert der timetableFrameRef-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link TimetableFrameRefStructure }
     *     
     */
    public void setTimetableFrameRef(TimetableFrameRefStructure value) {
        this.timetableFrameRef = value;
    }

    /**
     * Ruft den Wert der dutyParts-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link DutyPartsRelStructure }
     *     
     */
    public DutyPartsRelStructure getDutyParts() {
        return dutyParts;
    }

    /**
     * Legt den Wert der dutyParts-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link DutyPartsRelStructure }
     *     
     */
    public void setDutyParts(DutyPartsRelStructure value) {
        this.dutyParts = value;
    }

}
