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
 * Type for FARE STRUCTURE FACTOR.
 * 
 * <p>Java-Klasse f�r FareStructureFactor_VersionStructure complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="FareStructureFactor_VersionStructure">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.netex.org.uk/netex}PriceableObject_VersionStructure">
 *       &lt;group ref="{http://www.netex.org.uk/netex}FareStructureFactorGroup"/>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FareStructureFactor_VersionStructure", propOrder = {
    "privateCode",
    "typeOfFareStructureFactorRef",
    "factor"
})
@XmlSeeAlso({
    FareStructureFactor.class,
    TimeStructureFactorVersionStructure.class,
    GeographicalStructureFactorVersionStructure.class,
    QualityStructureFactorVersionStructure.class
})
public class FareStructureFactorVersionStructure
    extends PriceableObjectVersionStructure
{

    @XmlElement(name = "PrivateCode")
    protected PrivateCodeStructure privateCode;
    @XmlElement(name = "TypeOfFareStructureFactorRef")
    protected TypeOfFareStructureFactorRefStructure typeOfFareStructureFactorRef;
    @XmlElement(name = "Factor")
    protected Object factor;

    /**
     * DEPRECATED - use privateCodes. -v2.0
     * 
     * @return
     *     possible object is
     *     {@link PrivateCodeStructure }
     *     
     */
    public PrivateCodeStructure getPrivateCode() {
        return privateCode;
    }

    /**
     * Legt den Wert der privateCode-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link PrivateCodeStructure }
     *     
     */
    public void setPrivateCode(PrivateCodeStructure value) {
        this.privateCode = value;
    }

    /**
     * Ruft den Wert der typeOfFareStructureFactorRef-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link TypeOfFareStructureFactorRefStructure }
     *     
     */
    public TypeOfFareStructureFactorRefStructure getTypeOfFareStructureFactorRef() {
        return typeOfFareStructureFactorRef;
    }

    /**
     * Legt den Wert der typeOfFareStructureFactorRef-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeOfFareStructureFactorRefStructure }
     *     
     */
    public void setTypeOfFareStructureFactorRef(TypeOfFareStructureFactorRefStructure value) {
        this.typeOfFareStructureFactorRef = value;
    }

    /**
     * Ruft den Wert der factor-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getFactor() {
        return factor;
    }

    /**
     * Legt den Wert der factor-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setFactor(Object value) {
        this.factor = value;
    }

}
