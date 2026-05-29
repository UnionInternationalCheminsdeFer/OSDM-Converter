//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// �nderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2026.05.22 um 10:24:00 AM CEST 
//


package uk.org.netex.netex;

import java.math.BigInteger;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Type for EXCHANGING.
 * 
 * <p>Java-Klasse f�r Exchanging_VersionStructure complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="Exchanging_VersionStructure">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.netex.org.uk/netex}Reselling_VersionStructure">
 *       &lt;sequence>
 *         &lt;group ref="{http://www.netex.org.uk/netex}ExchangingGroup"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Exchanging_VersionStructure", propOrder = {
    "numberOfExchangesAllowed",
    "toFareClass",
    "toClassOfUseRef",
    "exchangableTo"
})
@XmlSeeAlso({
    Exchanging.class
})
public class ExchangingVersionStructure
    extends ResellingVersionStructure
{

    @XmlElement(name = "NumberOfExchangesAllowed")
    protected BigInteger numberOfExchangesAllowed;
    @XmlElement(name = "ToFareClass", defaultValue = "any")
    @XmlSchemaType(name = "NMTOKEN")
    protected FareClassEnumeration toFareClass;
    @XmlElement(name = "ToClassOfUseRef")
    protected ClassOfUseRefStructure toClassOfUseRef;
    @XmlElement(name = "ExchangableTo", defaultValue = "anyProduct")
    @XmlSchemaType(name = "normalizedString")
    protected ExchangableToEnumeration exchangableTo;

    /**
     * Ruft den Wert der numberOfExchangesAllowed-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getNumberOfExchangesAllowed() {
        return numberOfExchangesAllowed;
    }

    /**
     * Legt den Wert der numberOfExchangesAllowed-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setNumberOfExchangesAllowed(BigInteger value) {
        this.numberOfExchangesAllowed = value;
    }

    /**
     * Ruft den Wert der toFareClass-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FareClassEnumeration }
     *     
     */
    public FareClassEnumeration getToFareClass() {
        return toFareClass;
    }

    /**
     * Legt den Wert der toFareClass-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FareClassEnumeration }
     *     
     */
    public void setToFareClass(FareClassEnumeration value) {
        this.toFareClass = value;
    }

    /**
     * Ruft den Wert der toClassOfUseRef-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ClassOfUseRefStructure }
     *     
     */
    public ClassOfUseRefStructure getToClassOfUseRef() {
        return toClassOfUseRef;
    }

    /**
     * Legt den Wert der toClassOfUseRef-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ClassOfUseRefStructure }
     *     
     */
    public void setToClassOfUseRef(ClassOfUseRefStructure value) {
        this.toClassOfUseRef = value;
    }

    /**
     * Ruft den Wert der exchangableTo-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ExchangableToEnumeration }
     *     
     */
    public ExchangableToEnumeration getExchangableTo() {
        return exchangableTo;
    }

    /**
     * Legt den Wert der exchangableTo-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ExchangableToEnumeration }
     *     
     */
    public void setExchangableTo(ExchangableToEnumeration value) {
        this.exchangableTo = value;
    }

}
