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
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.CollapsedStringAdapter;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * Type for LOG.
 * 
 * <p>Java-Klasse f�r Log_VersionStructure complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="Log_VersionStructure">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.netex.org.uk/netex}GroupOfEntities_VersionStructure">
 *       &lt;sequence>
 *         &lt;group ref="{http://www.netex.org.uk/netex}LogGroup"/>
 *       &lt;/sequence>
 *       &lt;attribute name="nameOfLogEntryClass" type="{http://www.netex.org.uk/netex}NameOfClass" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Log_VersionStructure", propOrder = {
    "logEntries"
})
@XmlSeeAlso({
    Log.class
})
public abstract class LogVersionStructure
    extends GroupOfEntitiesVersionStructure
{

    protected LogEntriesRelStructure logEntries;
    @XmlAttribute(name = "nameOfLogEntryClass")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String nameOfLogEntryClass;

    /**
     * Ruft den Wert der logEntries-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link LogEntriesRelStructure }
     *     
     */
    public LogEntriesRelStructure getLogEntries() {
        return logEntries;
    }

    /**
     * Legt den Wert der logEntries-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link LogEntriesRelStructure }
     *     
     */
    public void setLogEntries(LogEntriesRelStructure value) {
        this.logEntries = value;
    }

    /**
     * Ruft den Wert der nameOfLogEntryClass-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNameOfLogEntryClass() {
        return nameOfLogEntryClass;
    }

    /**
     * Legt den Wert der nameOfLogEntryClass-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNameOfLogEntryClass(String value) {
        this.nameOfLogEntryClass = value;
    }

}
