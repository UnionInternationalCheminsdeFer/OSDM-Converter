//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// �nderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2026.05.22 um 10:24:00 AM CEST 
//


package uk.org.netex.netex;

import java.math.BigInteger;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.NormalizedStringAdapter;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * Type for NOTICE ASSIGNMENT View.
 * 
 * <p>Java-Klasse f�r NoticeAssignment_DerivedViewStructure complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="NoticeAssignment_DerivedViewStructure">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.netex.org.uk/netex}DerivedViewStructure">
 *       &lt;sequence>
 *         &lt;element name="Name" type="{http://www.netex.org.uk/netex}MultilingualString" minOccurs="0"/>
 *         &lt;element ref="{http://www.netex.org.uk/netex}NoticeRef" minOccurs="0"/>
 *         &lt;group ref="{http://www.netex.org.uk/netex}NoticeAssignmentPropertiesGroup"/>
 *         &lt;group ref="{http://www.netex.org.uk/netex}NoticePropertiesGroup"/>
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
@XmlType(name = "NoticeAssignment_DerivedViewStructure", propOrder = {
    "name",
    "noticeRef",
    "mark",
    "markUrl",
    "publicityChannel",
    "advertised",
    "text",
    "publicCode",
    "shortCode",
    "privateCode",
    "typeOfNoticeRef",
    "canBeAdvertised"
})
@XmlSeeAlso({
    NoticeAssignmentView.class
})
public class NoticeAssignmentDerivedViewStructure
    extends DerivedViewStructure
{

    @XmlElement(name = "Name")
    protected MultilingualString name;
    @XmlElement(name = "NoticeRef")
    protected NoticeRefStructure noticeRef;
    @XmlElement(name = "Mark")
    protected String mark;
    @XmlElement(name = "MarkUrl")
    @XmlSchemaType(name = "anyURI")
    protected String markUrl;
    @XmlElement(name = "PublicityChannel", defaultValue = "all")
    @XmlSchemaType(name = "NMTOKEN")
    protected PublicityChannelEnumeration publicityChannel;
    @XmlElement(name = "Advertised")
    protected Boolean advertised;
    @XmlElement(name = "Text")
    protected MultilingualString text;
    @XmlElement(name = "PublicCode")
    protected PublicCodeStructure publicCode;
    @XmlElement(name = "ShortCode")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String shortCode;
    @XmlElement(name = "PrivateCode")
    protected PrivateCodeStructure privateCode;
    @XmlElement(name = "TypeOfNoticeRef")
    protected TypeOfNoticeRefStructure typeOfNoticeRef;
    @XmlElement(name = "CanBeAdvertised")
    protected Boolean canBeAdvertised;
    @XmlAttribute(name = "order")
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger order;

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
     * Ruft den Wert der noticeRef-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link NoticeRefStructure }
     *     
     */
    public NoticeRefStructure getNoticeRef() {
        return noticeRef;
    }

    /**
     * Legt den Wert der noticeRef-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link NoticeRefStructure }
     *     
     */
    public void setNoticeRef(NoticeRefStructure value) {
        this.noticeRef = value;
    }

    /**
     * Ruft den Wert der mark-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMark() {
        return mark;
    }

    /**
     * Legt den Wert der mark-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMark(String value) {
        this.mark = value;
    }

    /**
     * Ruft den Wert der markUrl-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMarkUrl() {
        return markUrl;
    }

    /**
     * Legt den Wert der markUrl-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMarkUrl(String value) {
        this.markUrl = value;
    }

    /**
     * Ruft den Wert der publicityChannel-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link PublicityChannelEnumeration }
     *     
     */
    public PublicityChannelEnumeration getPublicityChannel() {
        return publicityChannel;
    }

    /**
     * Legt den Wert der publicityChannel-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link PublicityChannelEnumeration }
     *     
     */
    public void setPublicityChannel(PublicityChannelEnumeration value) {
        this.publicityChannel = value;
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
     * Ruft den Wert der text-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link MultilingualString }
     *     
     */
    public MultilingualString getText() {
        return text;
    }

    /**
     * Legt den Wert der text-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link MultilingualString }
     *     
     */
    public void setText(MultilingualString value) {
        this.text = value;
    }

    /**
     * Ruft den Wert der publicCode-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link PublicCodeStructure }
     *     
     */
    public PublicCodeStructure getPublicCode() {
        return publicCode;
    }

    /**
     * Legt den Wert der publicCode-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link PublicCodeStructure }
     *     
     */
    public void setPublicCode(PublicCodeStructure value) {
        this.publicCode = value;
    }

    /**
     * Ruft den Wert der shortCode-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShortCode() {
        return shortCode;
    }

    /**
     * Legt den Wert der shortCode-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShortCode(String value) {
        this.shortCode = value;
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
     * Ruft den Wert der typeOfNoticeRef-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link TypeOfNoticeRefStructure }
     *     
     */
    public TypeOfNoticeRefStructure getTypeOfNoticeRef() {
        return typeOfNoticeRef;
    }

    /**
     * Legt den Wert der typeOfNoticeRef-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeOfNoticeRefStructure }
     *     
     */
    public void setTypeOfNoticeRef(TypeOfNoticeRefStructure value) {
        this.typeOfNoticeRef = value;
    }

    /**
     * Ruft den Wert der canBeAdvertised-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCanBeAdvertised() {
        return canBeAdvertised;
    }

    /**
     * Legt den Wert der canBeAdvertised-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCanBeAdvertised(Boolean value) {
        this.canBeAdvertised = value;
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
