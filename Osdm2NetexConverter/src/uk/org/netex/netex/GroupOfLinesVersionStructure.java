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
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlElementRef;
import jakarta.xml.bind.annotation.XmlList;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Type for GROUP OF LINES.
 * 
 * <p>Java-Klasse f�r GroupOfLines_VersionStructure complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="GroupOfLines_VersionStructure">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.netex.org.uk/netex}GroupOfEntities_VersionStructure">
 *       &lt;sequence>
 *         &lt;group ref="{http://www.netex.org.uk/netex}GroupOfLinesGroup"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GroupOfLines_VersionStructure", propOrder = {
    "useToExclude",
    "members",
    "mainLineRef",
    "transportMode",
    "transportSubmode",
    "modeOfOperationRef",
    "groupOfLinesType",
    "paymentMethods",
    "typesOfPaymentMethod",
    "purchaseMoment"
})
@XmlSeeAlso({
    GroupOfLines.class,
    NetworkVersionStructure.class
})
public class GroupOfLinesVersionStructure
    extends GroupOfEntitiesVersionStructure
{

    @XmlElement(name = "UseToExclude", defaultValue = "false")
    protected Boolean useToExclude;
    protected LineRefsRelStructure members;
    @XmlElement(name = "MainLineRef")
    protected LineRefStructure mainLineRef;
    @XmlElement(name = "TransportMode")
    @XmlSchemaType(name = "NMTOKEN")
    protected AllPublicTransportModesEnumeration transportMode;
    @XmlElement(name = "TransportSubmode")
    protected TransportSubmodeStructure transportSubmode;
    @XmlElementRef(name = "ModeOfOperationRef", namespace = "http://www.netex.org.uk/netex", type = JAXBElement.class, required = false)
    protected JAXBElement<? extends ModeOfOperationRefStructure> modeOfOperationRef;
    @XmlElement(name = "GroupOfLinesType")
    @XmlSchemaType(name = "string")
    protected GroupOfLinesTypeEnumeration groupOfLinesType;
    @XmlList
    @XmlElement(name = "PaymentMethods")
    protected List<PaymentMethodEnumeration> paymentMethods;
    protected TypeOfPaymentMethodValueStructure typesOfPaymentMethod;
    @XmlList
    @XmlElement(name = "PurchaseMoment")
    protected List<PurchaseMomentEnumeration> purchaseMoment;

    /**
     * Ruft den Wert der useToExclude-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isUseToExclude() {
        return useToExclude;
    }

    /**
     * Legt den Wert der useToExclude-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setUseToExclude(Boolean value) {
        this.useToExclude = value;
    }

    /**
     * Ruft den Wert der members-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link LineRefsRelStructure }
     *     
     */
    public LineRefsRelStructure getMembers() {
        return members;
    }

    /**
     * Legt den Wert der members-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link LineRefsRelStructure }
     *     
     */
    public void setMembers(LineRefsRelStructure value) {
        this.members = value;
    }

    /**
     * Ruft den Wert der mainLineRef-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link LineRefStructure }
     *     
     */
    public LineRefStructure getMainLineRef() {
        return mainLineRef;
    }

    /**
     * Legt den Wert der mainLineRef-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link LineRefStructure }
     *     
     */
    public void setMainLineRef(LineRefStructure value) {
        this.mainLineRef = value;
    }

    /**
     * Ruft den Wert der transportMode-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link AllPublicTransportModesEnumeration }
     *     
     */
    public AllPublicTransportModesEnumeration getTransportMode() {
        return transportMode;
    }

    /**
     * Legt den Wert der transportMode-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link AllPublicTransportModesEnumeration }
     *     
     */
    public void setTransportMode(AllPublicTransportModesEnumeration value) {
        this.transportMode = value;
    }

    /**
     * Ruft den Wert der transportSubmode-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link TransportSubmodeStructure }
     *     
     */
    public TransportSubmodeStructure getTransportSubmode() {
        return transportSubmode;
    }

    /**
     * Legt den Wert der transportSubmode-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link TransportSubmodeStructure }
     *     
     */
    public void setTransportSubmode(TransportSubmodeStructure value) {
        this.transportSubmode = value;
    }

    /**
     * +v1.2.2
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ModeOfOperationRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link AlternativeModeOfOperationRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link VehiclePoolingModeOfOperationRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link VehicleSharingModeOfOperationRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link ConventionalModeOfOperationRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link PersonalModeOfOperationRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link VehicleRentalModeOfOperationRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link FlexibleModeOfOperationRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link ScheduledModeOfOperationRefStructure }{@code >}
     *     
     */
    public JAXBElement<? extends ModeOfOperationRefStructure> getModeOfOperationRef() {
        return modeOfOperationRef;
    }

    /**
     * Legt den Wert der modeOfOperationRef-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ModeOfOperationRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link AlternativeModeOfOperationRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link VehiclePoolingModeOfOperationRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link VehicleSharingModeOfOperationRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link ConventionalModeOfOperationRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link PersonalModeOfOperationRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link VehicleRentalModeOfOperationRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link FlexibleModeOfOperationRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link ScheduledModeOfOperationRefStructure }{@code >}
     *     
     */
    public void setModeOfOperationRef(JAXBElement<? extends ModeOfOperationRefStructure> value) {
        this.modeOfOperationRef = value;
    }

    /**
     * Ruft den Wert der groupOfLinesType-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link GroupOfLinesTypeEnumeration }
     *     
     */
    public GroupOfLinesTypeEnumeration getGroupOfLinesType() {
        return groupOfLinesType;
    }

    /**
     * Legt den Wert der groupOfLinesType-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link GroupOfLinesTypeEnumeration }
     *     
     */
    public void setGroupOfLinesType(GroupOfLinesTypeEnumeration value) {
        this.groupOfLinesType = value;
    }

    /**
     * Gets the value of the paymentMethods property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the paymentMethods property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPaymentMethods().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PaymentMethodEnumeration }
     * 
     * 
     */
    public List<PaymentMethodEnumeration> getPaymentMethods() {
        if (paymentMethods == null) {
            paymentMethods = new ArrayList<PaymentMethodEnumeration>();
        }
        return this.paymentMethods;
    }

    /**
     * Ruft den Wert der typesOfPaymentMethod-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link TypeOfPaymentMethodValueStructure }
     *     
     */
    public TypeOfPaymentMethodValueStructure getTypesOfPaymentMethod() {
        return typesOfPaymentMethod;
    }

    /**
     * Legt den Wert der typesOfPaymentMethod-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeOfPaymentMethodValueStructure }
     *     
     */
    public void setTypesOfPaymentMethod(TypeOfPaymentMethodValueStructure value) {
        this.typesOfPaymentMethod = value;
    }

    /**
     * Gets the value of the purchaseMoment property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the purchaseMoment property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPurchaseMoment().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PurchaseMomentEnumeration }
     * 
     * 
     */
    public List<PurchaseMomentEnumeration> getPurchaseMoment() {
        if (purchaseMoment == null) {
            purchaseMoment = new ArrayList<PurchaseMomentEnumeration>();
        }
        return this.purchaseMoment;
    }

}
