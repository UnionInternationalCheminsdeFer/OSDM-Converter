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
 * Type for a PERSONAL MODE OF OPERATION.
 * 
 * <p>Java-Klasse f�r PersonalModeOfOperation_ValueStructure complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="PersonalModeOfOperation_ValueStructure">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.netex.org.uk/netex}ModeOfOperation_ValueStructure">
 *       &lt;group ref="{http://www.netex.org.uk/netex}PersonalModeOfOperationGroup"/>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PersonalModeOfOperation_ValueStructure", propOrder = {
    "personalOperationType"
})
@XmlSeeAlso({
    PersonalModeOfOperation.class
})
public class PersonalModeOfOperationValueStructure
    extends ModeOfOperationValueStructure
{

    @XmlElement(name = "PersonalOperationType")
    @XmlSchemaType(name = "NMTOKEN")
    protected PersonalOperationTypeEnumeration personalOperationType;

    /**
     * Ruft den Wert der personalOperationType-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link PersonalOperationTypeEnumeration }
     *     
     */
    public PersonalOperationTypeEnumeration getPersonalOperationType() {
        return personalOperationType;
    }

    /**
     * Legt den Wert der personalOperationType-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link PersonalOperationTypeEnumeration }
     *     
     */
    public void setPersonalOperationType(PersonalOperationTypeEnumeration value) {
        this.personalOperationType = value;
    }

}
