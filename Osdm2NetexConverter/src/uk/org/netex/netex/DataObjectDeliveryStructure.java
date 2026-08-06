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
import jakarta.xml.bind.annotation.XmlType;
import uk.org.siri.siri.AbstractServiceDeliveryStructure;


/**
 * Data type for Delivery for Service containing one or more NeTEx Data Objects,.
 * 
 * <p>Java-Klasse f�r DataObjectDeliveryStructure complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="DataObjectDeliveryStructure">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.siri.org.uk/siri}AbstractServiceDeliveryStructure">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.netex.org.uk/netex}DataObjectRequest" minOccurs="0"/>
 *         &lt;group ref="{http://www.netex.org.uk/netex}PayloadGroup"/>
 *         &lt;element ref="{http://www.netex.org.uk/netex}Extensions" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DataObjectDeliveryStructure", propOrder = {
    "dataObjectRequest",
    "dataObjects",
    "extensions"
})
public class DataObjectDeliveryStructure
    extends AbstractServiceDeliveryStructure
{

    @XmlElement(name = "DataObjectRequest")
    protected DataObjectRequestStructure dataObjectRequest;
    protected DataObjects dataObjects;
    @XmlElement(name = "Extensions")
    protected ExtensionsStructure extensions;

    /**
     * Ruft den Wert der dataObjectRequest-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link DataObjectRequestStructure }
     *     
     */
    public DataObjectRequestStructure getDataObjectRequest() {
        return dataObjectRequest;
    }

    /**
     * Legt den Wert der dataObjectRequest-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link DataObjectRequestStructure }
     *     
     */
    public void setDataObjectRequest(DataObjectRequestStructure value) {
        this.dataObjectRequest = value;
    }

    /**
     * Ruft den Wert der dataObjects-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link DataObjectDeliveryStructure.DataObjects }
     *     
     */
    public DataObjects getDataObjects() {
        return dataObjects;
    }

    /**
     * Legt den Wert der dataObjects-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link DataObjectDeliveryStructure.DataObjects }
     *     
     */
    public void setDataObjects(DataObjects value) {
        this.dataObjects = value;
    }

    /**
     * Ruft den Wert der extensions-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ExtensionsStructure }
     *     
     */
    public ExtensionsStructure getExtensions() {
        return extensions;
    }

    /**
     * Legt den Wert der extensions-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtensionsStructure }
     *     
     */
    public void setExtensions(ExtensionsStructure value) {
        this.extensions = value;
    }

}
