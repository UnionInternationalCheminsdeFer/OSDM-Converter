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


/**
 * Type for an ACTIVATED EQUIPMENT.
 * 
 * <p>Java-Klasse f�r ActivatedEquipment_VersionStructure complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="ActivatedEquipment_VersionStructure">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.netex.org.uk/netex}Equipment_VersionStructure">
 *       &lt;sequence>
 *         &lt;group ref="{http://www.netex.org.uk/netex}ActivatedEquipmentGroup"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ActivatedEquipment_VersionStructure", propOrder = {
    "trafficControlPointRef",
    "typeOfActivationRef",
    "assignments"
})
@XmlSeeAlso({
    ActivatedEquipment.class
})
public class ActivatedEquipmentVersionStructure
    extends EquipmentVersionStructure
{

    @XmlElement(name = "TrafficControlPointRef")
    protected TrafficControlPointRefStructure trafficControlPointRef;
    @XmlElement(name = "TypeOfActivationRef")
    protected TypeOfActivationRefStructure typeOfActivationRef;
    protected ActivationAssignmentsRelStructure assignments;

    /**
     * Ruft den Wert der trafficControlPointRef-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link TrafficControlPointRefStructure }
     *     
     */
    public TrafficControlPointRefStructure getTrafficControlPointRef() {
        return trafficControlPointRef;
    }

    /**
     * Legt den Wert der trafficControlPointRef-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link TrafficControlPointRefStructure }
     *     
     */
    public void setTrafficControlPointRef(TrafficControlPointRefStructure value) {
        this.trafficControlPointRef = value;
    }

    /**
     * Ruft den Wert der typeOfActivationRef-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link TypeOfActivationRefStructure }
     *     
     */
    public TypeOfActivationRefStructure getTypeOfActivationRef() {
        return typeOfActivationRef;
    }

    /**
     * Legt den Wert der typeOfActivationRef-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeOfActivationRefStructure }
     *     
     */
    public void setTypeOfActivationRef(TypeOfActivationRefStructure value) {
        this.typeOfActivationRef = value;
    }

    /**
     * Ruft den Wert der assignments-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ActivationAssignmentsRelStructure }
     *     
     */
    public ActivationAssignmentsRelStructure getAssignments() {
        return assignments;
    }

    /**
     * Legt den Wert der assignments-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ActivationAssignmentsRelStructure }
     *     
     */
    public void setAssignments(ActivationAssignmentsRelStructure value) {
        this.assignments = value;
    }

}
