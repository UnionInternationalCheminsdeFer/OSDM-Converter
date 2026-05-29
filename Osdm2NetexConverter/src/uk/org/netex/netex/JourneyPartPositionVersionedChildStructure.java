//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// �nderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2026.05.22 um 10:24:00 AM CEST 
//


package uk.org.netex.netex;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlElementRef;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Type for JOURNEY PART POSITION.
 * 
 * <p>Java-Klasse f�r JourneyPartPosition_VersionedChildStructure complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="JourneyPartPosition_VersionedChildStructure">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.netex.org.uk/netex}VersionedChildStructure">
 *       &lt;sequence>
 *         &lt;group ref="{http://www.netex.org.uk/netex}JourneyPartPositionGroup"/>
 *       &lt;/sequence>
 *       &lt;attribute name="order" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "JourneyPartPosition_VersionedChildStructure", propOrder = {
    "parentJourneyPartRef",
    "scheduledStopPointRef",
    "positionInTrain"
})
@XmlSeeAlso({
    JourneyPartPosition.class
})
public class JourneyPartPositionVersionedChildStructure
    extends VersionedChildStructure
{

    @XmlElement(name = "ParentJourneyPartRef")
    protected JourneyPartRefStructure parentJourneyPartRef;
    @XmlElementRef(name = "ScheduledStopPointRef", namespace = "http://www.netex.org.uk/netex", type = JAXBElement.class)
    protected List<JAXBElement<? extends ScheduledStopPointRefStructure>> scheduledStopPointRef;
    @XmlElement(name = "PositionInTrain", required = true)
    protected BigInteger positionInTrain;
    @XmlAttribute(name = "order")
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger order;

    /**
     * Ruft den Wert der parentJourneyPartRef-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JourneyPartRefStructure }
     *     
     */
    public JourneyPartRefStructure getParentJourneyPartRef() {
        return parentJourneyPartRef;
    }

    /**
     * Legt den Wert der parentJourneyPartRef-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JourneyPartRefStructure }
     *     
     */
    public void setParentJourneyPartRef(JourneyPartRefStructure value) {
        this.parentJourneyPartRef = value;
    }

    /**
     * Gets the value of the scheduledStopPointRef property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the scheduledStopPointRef property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getScheduledStopPointRef().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JAXBElement }{@code <}{@link FareScheduledStopPointRefStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link ScheduledStopPointRefStructure }{@code >}
     * 
     * 
     */
    public List<JAXBElement<? extends ScheduledStopPointRefStructure>> getScheduledStopPointRef() {
        if (scheduledStopPointRef == null) {
            scheduledStopPointRef = new ArrayList<JAXBElement<? extends ScheduledStopPointRefStructure>>();
        }
        return this.scheduledStopPointRef;
    }

    /**
     * Ruft den Wert der positionInTrain-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getPositionInTrain() {
        return positionInTrain;
    }

    /**
     * Legt den Wert der positionInTrain-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setPositionInTrain(BigInteger value) {
        this.positionInTrain = value;
    }

    /**
     * Ruft den Wert der order-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getOrder() {
        return order;
    }

    /**
     * Legt den Wert der order-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setOrder(BigInteger value) {
        this.order = value;
    }

}
