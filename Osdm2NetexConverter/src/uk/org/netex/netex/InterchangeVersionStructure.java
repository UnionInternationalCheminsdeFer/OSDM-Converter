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
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlList;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;
import javax.xml.datatype.Duration;


/**
 * Type for INTERCHANGE.
 * 
 * <p>Java-Klasse f�r Interchange_VersionStructure complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="Interchange_VersionStructure">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.netex.org.uk/netex}DataManagedObjectStructure">
 *       &lt;sequence>
 *         &lt;group ref="{http://www.netex.org.uk/netex}InterchangeGroup"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Interchange_VersionStructure", propOrder = {
    "name",
    "description",
    "privateCode",
    "externalInterchangeRef",
    "connectionRef",
    "priority",
    "staySeated",
    "crossBorder",
    "planned",
    "guaranteed",
    "advertised",
    "controlled",
    "connectionCertainty",
    "standardWaitTime",
    "maximumWaitTime",
    "maximumAutomaticWaitTime",
    "standardTransferTime",
    "minimumTransferTime",
    "maximumTransferTime",
    "controlCentreNotifyThreshold",
    "transferModes",
    "noticeAssignments"
})
@XmlSeeAlso({
    Interchange.class,
    InterchangeRuleVersionStructure.class,
    ServiceJourneyInterchangeVersionStructure.class,
    ServiceJourneyPatternInterchangeVersionStructure.class
})
public abstract class InterchangeVersionStructure
    extends DataManagedObjectStructure
{

    @XmlElement(name = "Name")
    protected MultilingualString name;
    @XmlElement(name = "Description")
    protected MultilingualString description;
    @XmlElement(name = "PrivateCode")
    protected PrivateCodeStructure privateCode;
    @XmlElement(name = "ExternalInterchangeRef")
    protected ExternalObjectRefStructure externalInterchangeRef;
    @XmlElement(name = "ConnectionRef")
    protected ConnectionRefStructure connectionRef;
    @XmlElement(name = "Priority")
    protected BigInteger priority;
    @XmlElement(name = "StaySeated", defaultValue = "false")
    protected Boolean staySeated;
    @XmlElement(name = "CrossBorder", defaultValue = "false")
    protected Boolean crossBorder;
    @XmlElement(name = "Planned", defaultValue = "true")
    protected Boolean planned;
    @XmlElement(name = "Guaranteed", defaultValue = "false")
    protected Boolean guaranteed;
    @XmlElement(name = "Advertised", defaultValue = "true")
    protected Boolean advertised;
    @XmlElement(name = "Controlled", defaultValue = "true")
    protected Boolean controlled;
    @XmlElement(name = "ConnectionCertainty")
    @XmlSchemaType(name = "NMTOKEN")
    protected ConnectionCertaintyEnumeration connectionCertainty;
    @XmlElement(name = "StandardWaitTime")
    protected Duration standardWaitTime;
    @XmlElement(name = "MaximumWaitTime")
    protected Duration maximumWaitTime;
    @XmlElement(name = "MaximumAutomaticWaitTime")
    protected Duration maximumAutomaticWaitTime;
    @XmlElement(name = "StandardTransferTime")
    protected Duration standardTransferTime;
    @XmlElement(name = "MinimumTransferTime")
    protected Duration minimumTransferTime;
    @XmlElement(name = "MaximumTransferTime")
    protected Duration maximumTransferTime;
    @XmlElement(name = "ControlCentreNotifyThreshold")
    protected Duration controlCentreNotifyThreshold;
    @XmlList
    protected List<AccessModeEnumeration> transferModes;
    protected InterchangeVersionStructure.NoticeAssignments noticeAssignments;

    /**
     * Ruft den Wert der name-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link MultilingualString }
     *     
     */
    public MultilingualString getName() {
        return name;
    }

    /**
     * Legt den Wert der name-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link MultilingualString }
     *     
     */
    public void setName(MultilingualString value) {
        this.name = value;
    }

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
     * DEPRECATED - use privateCodes. -v2.0
     * 
     * @return
     *     possible object is
     *     {@link PrivateCodeStructure }
     *     
     */
    public PrivateCodeStructure getPrivateCode() {
        return privateCode;
    }

    /**
     * Legt den Wert der privateCode-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link PrivateCodeStructure }
     *     
     */
    public void setPrivateCode(PrivateCodeStructure value) {
        this.privateCode = value;
    }

    /**
     * Ruft den Wert der externalInterchangeRef-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ExternalObjectRefStructure }
     *     
     */
    public ExternalObjectRefStructure getExternalInterchangeRef() {
        return externalInterchangeRef;
    }

    /**
     * Legt den Wert der externalInterchangeRef-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ExternalObjectRefStructure }
     *     
     */
    public void setExternalInterchangeRef(ExternalObjectRefStructure value) {
        this.externalInterchangeRef = value;
    }

    /**
     * Ruft den Wert der connectionRef-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ConnectionRefStructure }
     *     
     */
    public ConnectionRefStructure getConnectionRef() {
        return connectionRef;
    }

    /**
     * Legt den Wert der connectionRef-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ConnectionRefStructure }
     *     
     */
    public void setConnectionRef(ConnectionRefStructure value) {
        this.connectionRef = value;
    }

    /**
     * Ruft den Wert der priority-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getPriority() {
        return priority;
    }

    /**
     * Legt den Wert der priority-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setPriority(BigInteger value) {
        this.priority = value;
    }

    /**
     * Ruft den Wert der staySeated-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isStaySeated() {
        return staySeated;
    }

    /**
     * Legt den Wert der staySeated-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setStaySeated(Boolean value) {
        this.staySeated = value;
    }

    /**
     * Ruft den Wert der crossBorder-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCrossBorder() {
        return crossBorder;
    }

    /**
     * Legt den Wert der crossBorder-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCrossBorder(Boolean value) {
        this.crossBorder = value;
    }

    /**
     * Ruft den Wert der planned-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPlanned() {
        return planned;
    }

    /**
     * Legt den Wert der planned-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPlanned(Boolean value) {
        this.planned = value;
    }

    /**
     * Ruft den Wert der guaranteed-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isGuaranteed() {
        return guaranteed;
    }

    /**
     * Legt den Wert der guaranteed-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setGuaranteed(Boolean value) {
        this.guaranteed = value;
    }

    /**
     * Ruft den Wert der advertised-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAdvertised() {
        return advertised;
    }

    /**
     * Legt den Wert der advertised-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAdvertised(Boolean value) {
        this.advertised = value;
    }

    /**
     * Ruft den Wert der controlled-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isControlled() {
        return controlled;
    }

    /**
     * Legt den Wert der controlled-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setControlled(Boolean value) {
        this.controlled = value;
    }

    /**
     * Ruft den Wert der connectionCertainty-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ConnectionCertaintyEnumeration }
     *     
     */
    public ConnectionCertaintyEnumeration getConnectionCertainty() {
        return connectionCertainty;
    }

    /**
     * Legt den Wert der connectionCertainty-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ConnectionCertaintyEnumeration }
     *     
     */
    public void setConnectionCertainty(ConnectionCertaintyEnumeration value) {
        this.connectionCertainty = value;
    }

    /**
     * Ruft den Wert der standardWaitTime-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Duration }
     *     
     */
    public Duration getStandardWaitTime() {
        return standardWaitTime;
    }

    /**
     * Legt den Wert der standardWaitTime-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Duration }
     *     
     */
    public void setStandardWaitTime(Duration value) {
        this.standardWaitTime = value;
    }

    /**
     * Ruft den Wert der maximumWaitTime-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Duration }
     *     
     */
    public Duration getMaximumWaitTime() {
        return maximumWaitTime;
    }

    /**
     * Legt den Wert der maximumWaitTime-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Duration }
     *     
     */
    public void setMaximumWaitTime(Duration value) {
        this.maximumWaitTime = value;
    }

    /**
     * Ruft den Wert der maximumAutomaticWaitTime-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Duration }
     *     
     */
    public Duration getMaximumAutomaticWaitTime() {
        return maximumAutomaticWaitTime;
    }

    /**
     * Legt den Wert der maximumAutomaticWaitTime-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Duration }
     *     
     */
    public void setMaximumAutomaticWaitTime(Duration value) {
        this.maximumAutomaticWaitTime = value;
    }

    /**
     * Ruft den Wert der standardTransferTime-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Duration }
     *     
     */
    public Duration getStandardTransferTime() {
        return standardTransferTime;
    }

    /**
     * Legt den Wert der standardTransferTime-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Duration }
     *     
     */
    public void setStandardTransferTime(Duration value) {
        this.standardTransferTime = value;
    }

    /**
     * Ruft den Wert der minimumTransferTime-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Duration }
     *     
     */
    public Duration getMinimumTransferTime() {
        return minimumTransferTime;
    }

    /**
     * Legt den Wert der minimumTransferTime-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Duration }
     *     
     */
    public void setMinimumTransferTime(Duration value) {
        this.minimumTransferTime = value;
    }

    /**
     * Ruft den Wert der maximumTransferTime-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Duration }
     *     
     */
    public Duration getMaximumTransferTime() {
        return maximumTransferTime;
    }

    /**
     * Legt den Wert der maximumTransferTime-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Duration }
     *     
     */
    public void setMaximumTransferTime(Duration value) {
        this.maximumTransferTime = value;
    }

    /**
     * Ruft den Wert der controlCentreNotifyThreshold-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Duration }
     *     
     */
    public Duration getControlCentreNotifyThreshold() {
        return controlCentreNotifyThreshold;
    }

    /**
     * Legt den Wert der controlCentreNotifyThreshold-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Duration }
     *     
     */
    public void setControlCentreNotifyThreshold(Duration value) {
        this.controlCentreNotifyThreshold = value;
    }

    /**
     * Gets the value of the transferModes property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the transferModes property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTransferModes().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AccessModeEnumeration }
     * 
     * 
     */
    public List<AccessModeEnumeration> getTransferModes() {
        if (transferModes == null) {
            transferModes = new ArrayList<AccessModeEnumeration>();
        }
        return this.transferModes;
    }

    /**
     * Ruft den Wert der noticeAssignments-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link InterchangeVersionStructure.NoticeAssignments }
     *     
     */
    public InterchangeVersionStructure.NoticeAssignments getNoticeAssignments() {
        return noticeAssignments;
    }

    /**
     * Legt den Wert der noticeAssignments-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link InterchangeVersionStructure.NoticeAssignments }
     *     
     */
    public void setNoticeAssignments(InterchangeVersionStructure.NoticeAssignments value) {
        this.noticeAssignments = value;
    }


    /**
     * <p>Java-Klasse f�r anonymous complex type.
     * 
     * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;extension base="{http://www.netex.org.uk/netex}noticeAssignments_RelStructure">
     *     &lt;/extension>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class NoticeAssignments
        extends NoticeAssignmentsRelStructure
    {


    }

}
