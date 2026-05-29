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
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Type for a SCHEDULED MODE OF OPERATION.
 * 
 * <p>Java-Klasse f�r ScheduledModeOfOperation_ValueStructure complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="ScheduledModeOfOperation_ValueStructure">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.netex.org.uk/netex}ConventionalModeOfOperation_ValueStructure">
 *       &lt;group ref="{http://www.netex.org.uk/netex}ScheduledModeOfOperationGroup"/>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ScheduledModeOfOperation_ValueStructure", propOrder = {
    "scheduledOperationType"
})
@XmlSeeAlso({
    ScheduledOperation.class
})
public class ScheduledModeOfOperationValueStructure
    extends ConventionalModeOfOperationValueStructure
{

    @XmlElement(name = "ScheduledOperationType")
    @XmlSchemaType(name = "NMTOKEN")
    protected ScheduledOperationTypeEnumeration scheduledOperationType;

    /**
     * Ruft den Wert der scheduledOperationType-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ScheduledOperationTypeEnumeration }
     *     
     */
    public ScheduledOperationTypeEnumeration getScheduledOperationType() {
        return scheduledOperationType;
    }

    /**
     * Legt den Wert der scheduledOperationType-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ScheduledOperationTypeEnumeration }
     *     
     */
    public void setScheduledOperationType(ScheduledOperationTypeEnumeration value) {
        this.scheduledOperationType = value;
    }

}
