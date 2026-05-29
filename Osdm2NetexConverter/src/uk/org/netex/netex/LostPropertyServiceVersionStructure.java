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
import javax.xml.datatype.Duration;


/**
 * Type for a LOST PROPERTY SERVICE.
 * 
 * <p>Java-Klasse f�r LostPropertyService_VersionStructure complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="LostPropertyService_VersionStructure">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.netex.org.uk/netex}CustomerService_VersionStructure">
 *       &lt;group ref="{http://www.netex.org.uk/netex}LostPropertyServiceGroup"/>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LostPropertyService_VersionStructure", propOrder = {
    "propertyKeptForDuration"
})
@XmlSeeAlso({
    LostPropertyService.class
})
public class LostPropertyServiceVersionStructure
    extends CustomerServiceVersionStructure
{

    @XmlElement(name = "PropertyKeptForDuration")
    protected Duration propertyKeptForDuration;

    /**
     * Ruft den Wert der propertyKeptForDuration-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Duration }
     *     
     */
    public Duration getPropertyKeptForDuration() {
        return propertyKeptForDuration;
    }

    /**
     * Legt den Wert der propertyKeptForDuration-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Duration }
     *     
     */
    public void setPropertyKeptForDuration(Duration value) {
        this.propertyKeptForDuration = value;
    }

}
