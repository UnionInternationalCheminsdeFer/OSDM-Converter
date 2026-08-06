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
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.CollapsedStringAdapter;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import uk.org.siri.siri.AbstractServiceCapabilitiesResponseStructure;


/**
 * Type for Delivery for DATA OBJECT Service.
 * 
 * <p>Java-Klasse f�r DataObjectCapabilitiesResponseStructure complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="DataObjectCapabilitiesResponseStructure">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.siri.org.uk/siri}AbstractServiceCapabilitiesResponseStructure">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.netex.org.uk/netex}DataObjectServiceCapabilities" minOccurs="0"/>
 *         &lt;element ref="{http://www.netex.org.uk/netex}DataObjectPermissions" minOccurs="0"/>
 *         &lt;element ref="{http://www.netex.org.uk/netex}Extensions" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="version" type="{http://www.siri.org.uk/siri}VersionString" default="2.0" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DataObjectCapabilitiesResponseStructure", propOrder = {
    "dataObjectServiceCapabilities",
    "dataObjectPermissions",
    "extensions"
})
public class DataObjectCapabilitiesResponseStructure
    extends AbstractServiceCapabilitiesResponseStructure
{

    @XmlElement(name = "DataObjectServiceCapabilities")
    protected DataObjectServiceCapabilitiesStructure dataObjectServiceCapabilities;
    @XmlElement(name = "DataObjectPermissions")
    protected DataObjectPermissions dataObjectPermissions;
    @XmlElement(name = "Extensions")
    protected ExtensionsStructure extensions;
    @XmlAttribute(name = "version")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String version;

    /**
     * Ruft den Wert der dataObjectServiceCapabilities-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link DataObjectServiceCapabilitiesStructure }
     *     
     */
    public DataObjectServiceCapabilitiesStructure getDataObjectServiceCapabilities() {
        return dataObjectServiceCapabilities;
    }

    /**
     * Legt den Wert der dataObjectServiceCapabilities-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link DataObjectServiceCapabilitiesStructure }
     *     
     */
    public void setDataObjectServiceCapabilities(DataObjectServiceCapabilitiesStructure value) {
        this.dataObjectServiceCapabilities = value;
    }

    /**
     * Ruft den Wert der dataObjectPermissions-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link DataObjectPermissions }
     *     
     */
    public DataObjectPermissions getDataObjectPermissions() {
        return dataObjectPermissions;
    }

    /**
     * Legt den Wert der dataObjectPermissions-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link DataObjectPermissions }
     *     
     */
    public void setDataObjectPermissions(DataObjectPermissions value) {
        this.dataObjectPermissions = value;
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
            return "2.0";
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
