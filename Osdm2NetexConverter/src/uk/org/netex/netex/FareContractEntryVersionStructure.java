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
 * Type for FARE CONTRACT ENTRY.
 * 
 * <p>Java-Klasse f�r FareContractEntry_VersionStructure complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="FareContractEntry_VersionStructure">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.netex.org.uk/netex}LogEntry_VersionStructure">
 *       &lt;sequence>
 *         &lt;group ref="{http://www.netex.org.uk/netex}FareContractEntryGroup"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FareContractEntry_VersionStructure", propOrder = {
    "isValid",
    "typeOfFareContractEntryRef",
    "fareContractRef"
})
@XmlSeeAlso({
    FareContractEntry.class,
    TravelSpecificationVersionStructure.class,
    SalesTransactionVersionStructure.class
})
public class FareContractEntryVersionStructure
    extends LogEntryVersionStructure
{

    @XmlElement(name = "IsValid")
    protected Boolean isValid;
    @XmlElement(name = "TypeOfFareContractEntryRef")
    protected TypeOfFareContractEntryRefStructure typeOfFareContractEntryRef;
    @XmlElement(name = "FareContractRef")
    protected FareContractRefStructure fareContractRef;

    /**
     * Ruft den Wert der isValid-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsValid() {
        return isValid;
    }

    /**
     * Legt den Wert der isValid-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsValid(Boolean value) {
        this.isValid = value;
    }

    /**
     * A classifiication of FARE CONTRACT ENTRYs.
     * 
     * @return
     *     possible object is
     *     {@link TypeOfFareContractEntryRefStructure }
     *     
     */
    public TypeOfFareContractEntryRefStructure getTypeOfFareContractEntryRef() {
        return typeOfFareContractEntryRef;
    }

    /**
     * Legt den Wert der typeOfFareContractEntryRef-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeOfFareContractEntryRefStructure }
     *     
     */
    public void setTypeOfFareContractEntryRef(TypeOfFareContractEntryRefStructure value) {
        this.typeOfFareContractEntryRef = value;
    }

    /**
     * Ruft den Wert der fareContractRef-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FareContractRefStructure }
     *     
     */
    public FareContractRefStructure getFareContractRef() {
        return fareContractRef;
    }

    /**
     * Legt den Wert der fareContractRef-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FareContractRefStructure }
     *     
     */
    public void setFareContractRef(FareContractRefStructure value) {
        this.fareContractRef = value;
    }

}
