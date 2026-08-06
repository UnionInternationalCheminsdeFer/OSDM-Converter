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
 * Type for a FLEXIBLE MODE OF OPERATION.
 * 
 * <p>Java-Klasse f�r FlexibleModeOfOperation_ValueStructure complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="FlexibleModeOfOperation_ValueStructure">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.netex.org.uk/netex}ConventionalModeOfOperation_ValueStructure">
 *       &lt;group ref="{http://www.netex.org.uk/netex}FlexibleModeOfOperationGroup"/>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FlexibleModeOfOperation_ValueStructure", propOrder = {
    "flexibleOperationType"
})
@XmlSeeAlso({
    FlexibleOperation.class
})
public class FlexibleModeOfOperationValueStructure
    extends ConventionalModeOfOperationValueStructure
{

    @XmlElement(name = "FlexibleOperationType")
    @XmlSchemaType(name = "NMTOKEN")
    protected FlexibleOperationTypeEnumeration flexibleOperationType;

    /**
     * Ruft den Wert der flexibleOperationType-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FlexibleOperationTypeEnumeration }
     *     
     */
    public FlexibleOperationTypeEnumeration getFlexibleOperationType() {
        return flexibleOperationType;
    }

    /**
     * Legt den Wert der flexibleOperationType-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FlexibleOperationTypeEnumeration }
     *     
     */
    public void setFlexibleOperationType(FlexibleOperationTypeEnumeration value) {
        this.flexibleOperationType = value;
    }

}
