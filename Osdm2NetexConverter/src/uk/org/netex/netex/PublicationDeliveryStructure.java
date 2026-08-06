//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// �nderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2026.05.22 um 10:24:00 AM CEST 
//


package uk.org.netex.netex;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.CollapsedStringAdapter;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.datatype.Duration;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * Type for Publication Delivery.
 * 
 * <p>Java-Klasse f�r PublicationDeliveryStructure complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="PublicationDeliveryStructure">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;group ref="{http://www.netex.org.uk/netex}PublicationHeaderGroup"/>
 *         &lt;group ref="{http://www.netex.org.uk/netex}PayloadGroup"/>
 *       &lt;/sequence>
 *       &lt;attribute name="version" type="{http://www.w3.org/2001/XMLSchema}NMTOKEN" default="1.0" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PublicationDeliveryStructure", propOrder = {
    "publicationTimestamp",
    "participantRef",
    "publicationRequest",
    "publicationRefreshInterval",
    "description",
    "dataObjects",
    "version"
})
public class PublicationDeliveryStructure {

    @XmlElement(name = "PublicationTimestamp", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar publicationTimestamp;
    @XmlElement(name = "ParticipantRef", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NMTOKEN")
    protected String participantRef;
    @XmlElement(name = "PublicationRequest")
    protected PublicationRequestStructure publicationRequest;
    @XmlElement(name = "PublicationRefreshInterval")
    protected Duration publicationRefreshInterval;
    @XmlElement(name = "Description")
    protected MultilingualString description;
    @XmlElement(name = "DataObjects")
    protected DataObjectsRelStructure dataObjects;
    @XmlAttribute(name = "version")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NMTOKEN")
    protected String version;

    /**
     * Ruft den Wert der publicationTimestamp-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getPublicationTimestamp() {
        return publicationTimestamp;
    }

    /**
     * Legt den Wert der publicationTimestamp-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setPublicationTimestamp(XMLGregorianCalendar value) {
        this.publicationTimestamp = value;
    }

    /**
     * Ruft den Wert der participantRef-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getParticipantRef() {
        return participantRef;
    }

    /**
     * Legt den Wert der participantRef-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setParticipantRef(String value) {
        this.participantRef = value;
    }

    /**
     * Ruft den Wert der publicationRequest-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link PublicationRequestStructure }
     *     
     */
    public PublicationRequestStructure getPublicationRequest() {
        return publicationRequest;
    }

    /**
     * Legt den Wert der publicationRequest-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link PublicationRequestStructure }
     *     
     */
    public void setPublicationRequest(PublicationRequestStructure value) {
        this.publicationRequest = value;
    }

    /**
     * Ruft den Wert der publicationRefreshInterval-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Duration }
     *     
     */
    public Duration getPublicationRefreshInterval() {
        return publicationRefreshInterval;
    }

    /**
     * Legt den Wert der publicationRefreshInterval-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Duration }
     *     
     */
    public void setPublicationRefreshInterval(Duration value) {
        this.publicationRefreshInterval = value;
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
     * Ruft den Wert der dataObjects-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link uk.org.netex.netex.DataObjectDeliveryStructure.DataObjects }
     *     
     */
    public DataObjectsRelStructure getDataObjects() {
        return dataObjects;
    }

    /**
     * Legt den Wert der dataObjects-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link uk.org.netex.netex.DataObjectDeliveryStructure.DataObjects }
     *     
     */
    public void setDataObjects(DataObjectsRelStructure value) {
        this.dataObjects = value;
    }

    /**
     * Ruft den Wert der version-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVersion() {
        if (version == null) {
            return "1.0";
        } else {
            return version;
        }
    }

    /**
     * Legt den Wert der version-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVersion(String value) {
        this.version = value;
    }

}
