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
 * Type for a CONNECTION link restricts id.
 * 
 * <p>Java-Klasse f�r Connection_VersionStructure complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="Connection_VersionStructure">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.netex.org.uk/netex}Transfer_VersionStructure">
 *       &lt;sequence>
 *         &lt;group ref="{http://www.netex.org.uk/netex}ConnectionGroup"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Connection_VersionStructure", propOrder = {
    "externalConnectionLinkRef",
    "from",
    "to",
    "transferOnly"
})
@XmlSeeAlso({
    Connection.class
})
public class ConnectionVersionStructure
    extends TransferVersionStructure
{

    @XmlElement(name = "ExternalConnectionLinkRef")
    protected ExternalObjectRefStructure externalConnectionLinkRef;
    @XmlElement(name = "From")
    protected ConnectionEndStructure from;
    @XmlElement(name = "To")
    protected ConnectionEndStructure to;
    @XmlElement(name = "TransferOnly")
    protected Boolean transferOnly;

    /**
     * Ruft den Wert der externalConnectionLinkRef-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ExternalObjectRefStructure }
     *     
     */
    public ExternalObjectRefStructure getExternalConnectionLinkRef() {
        return externalConnectionLinkRef;
    }

    /**
     * Legt den Wert der externalConnectionLinkRef-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ExternalObjectRefStructure }
     *     
     */
    public void setExternalConnectionLinkRef(ExternalObjectRefStructure value) {
        this.externalConnectionLinkRef = value;
    }

    /**
     * Ruft den Wert der from-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ConnectionEndStructure }
     *     
     */
    public ConnectionEndStructure getFrom() {
        return from;
    }

    /**
     * Legt den Wert der from-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ConnectionEndStructure }
     *     
     */
    public void setFrom(ConnectionEndStructure value) {
        this.from = value;
    }

    /**
     * Ruft den Wert der to-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ConnectionEndStructure }
     *     
     */
    public ConnectionEndStructure getTo() {
        return to;
    }

    /**
     * Legt den Wert der to-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ConnectionEndStructure }
     *     
     */
    public void setTo(ConnectionEndStructure value) {
        this.to = value;
    }

    /**
     * Ruft den Wert der transferOnly-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isTransferOnly() {
        return transferOnly;
    }

    /**
     * Legt den Wert der transferOnly-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setTransferOnly(Boolean value) {
        this.transferOnly = value;
    }

}
