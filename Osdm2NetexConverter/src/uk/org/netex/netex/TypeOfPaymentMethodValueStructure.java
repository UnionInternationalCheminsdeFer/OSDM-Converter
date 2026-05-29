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
 * Type for a TYPE OF TYPE OF PAYMENT METHOD.
 * 
 * <p>Java-Klasse f�r TypeOfPaymentMethod_ValueStructure complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="TypeOfPaymentMethod_ValueStructure">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.netex.org.uk/netex}TypeOfValue_VersionStructure">
 *       &lt;sequence>
 *         &lt;group ref="{http://www.netex.org.uk/netex}TypeOfPaymentMethodGroup"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TypeOfPaymentMethod_ValueStructure", propOrder = {
    "paymentMethod",
    "automatedUse"
})
@XmlSeeAlso({
    TypeOfPaymentMethod.class
})
public class TypeOfPaymentMethodValueStructure
    extends TypeOfValueVersionStructure
{

    @XmlElement(name = "PaymentMethod")
    @XmlSchemaType(name = "normalizedString")
    protected PaymentMethodEnumeration paymentMethod;
    @XmlElement(name = "AutomatedUse")
    protected Boolean automatedUse;

    /**
     * Ruft den Wert der paymentMethod-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link PaymentMethodEnumeration }
     *     
     */
    public PaymentMethodEnumeration getPaymentMethod() {
        return paymentMethod;
    }

    /**
     * Legt den Wert der paymentMethod-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link PaymentMethodEnumeration }
     *     
     */
    public void setPaymentMethod(PaymentMethodEnumeration value) {
        this.paymentMethod = value;
    }

    /**
     * Ruft den Wert der automatedUse-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAutomatedUse() {
        return automatedUse;
    }

    /**
     * Legt den Wert der automatedUse-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAutomatedUse(Boolean value) {
        this.automatedUse = value;
    }

}
