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
 * Data type for Onward CALL.
 * 
 * <p>Java-Klasse f�r OnwardCall_VersionedChildStructure complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="OnwardCall_VersionedChildStructure">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.netex.org.uk/netex}Call_VersionedChildStructure">
 *       &lt;sequence>
 *         &lt;group ref="{http://www.netex.org.uk/netex}OnwardCallGroup"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OnwardCall_VersionedChildStructure", propOrder = {
    "targetPassingTimeView",
    "estimatedPassingTimeView"
})
@XmlSeeAlso({
    OnwardCall.class
})
public class OnwardCallVersionedChildStructure
    extends CallVersionedChildStructure
{

    @XmlElement(name = "TargetPassingTimeView")
    protected TargetPassingTimeView targetPassingTimeView;
    @XmlElement(name = "EstimatedPassingTimeView")
    protected EstimatedPassingTimeViewStructure estimatedPassingTimeView;

    /**
     * Ruft den Wert der targetPassingTimeView-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link TargetPassingTimeView }
     *     
     */
    public TargetPassingTimeView getTargetPassingTimeView() {
        return targetPassingTimeView;
    }

    /**
     * Legt den Wert der targetPassingTimeView-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link TargetPassingTimeView }
     *     
     */
    public void setTargetPassingTimeView(TargetPassingTimeView value) {
        this.targetPassingTimeView = value;
    }

    /**
     * Ruft den Wert der estimatedPassingTimeView-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link EstimatedPassingTimeViewStructure }
     *     
     */
    public EstimatedPassingTimeViewStructure getEstimatedPassingTimeView() {
        return estimatedPassingTimeView;
    }

    /**
     * Legt den Wert der estimatedPassingTimeView-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link EstimatedPassingTimeViewStructure }
     *     
     */
    public void setEstimatedPassingTimeView(EstimatedPassingTimeViewStructure value) {
        this.estimatedPassingTimeView = value;
    }

}
