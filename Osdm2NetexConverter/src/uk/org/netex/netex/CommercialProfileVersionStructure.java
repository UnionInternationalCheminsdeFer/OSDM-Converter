//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// �nderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2026.05.22 um 10:24:00 AM CEST 
//


package uk.org.netex.netex;

import java.math.BigDecimal;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Type for COMMERCIAL PROFILE.
 * 
 * <p>Java-Klasse f�r CommercialProfile_VersionStructure complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="CommercialProfile_VersionStructure">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.netex.org.uk/netex}UsageParameter_VersionStructure">
 *       &lt;sequence>
 *         &lt;group ref="{http://www.netex.org.uk/netex}CommercialProfileGroup"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CommercialProfile_VersionStructure", propOrder = {
    "typeOfConcessionRef",
    "consumptionAmount",
    "consumptionUnits",
    "generalGroupOfEntitiesRef"
})
@XmlSeeAlso({
    CommercialProfile.class
})
public class CommercialProfileVersionStructure
    extends UsageParameterVersionStructure
{

    @XmlElement(name = "TypeOfConcessionRef")
    protected TypeOfConcessionRefStructure typeOfConcessionRef;
    @XmlElement(name = "ConsumptionAmount")
    protected BigDecimal consumptionAmount;
    @XmlElement(name = "ConsumptionUnits")
    protected BigDecimal consumptionUnits;
    @XmlElement(name = "GeneralGroupOfEntitiesRef")
    protected GeneralGroupOfEntitiesRefStructure generalGroupOfEntitiesRef;

    /**
     * Ruft den Wert der typeOfConcessionRef-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link TypeOfConcessionRefStructure }
     *     
     */
    public TypeOfConcessionRefStructure getTypeOfConcessionRef() {
        return typeOfConcessionRef;
    }

    /**
     * Legt den Wert der typeOfConcessionRef-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeOfConcessionRefStructure }
     *     
     */
    public void setTypeOfConcessionRef(TypeOfConcessionRefStructure value) {
        this.typeOfConcessionRef = value;
    }

    /**
     * Ruft den Wert der consumptionAmount-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getConsumptionAmount() {
        return consumptionAmount;
    }

    /**
     * Legt den Wert der consumptionAmount-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setConsumptionAmount(BigDecimal value) {
        this.consumptionAmount = value;
    }

    /**
     * Ruft den Wert der consumptionUnits-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getConsumptionUnits() {
        return consumptionUnits;
    }

    /**
     * Legt den Wert der consumptionUnits-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setConsumptionUnits(BigDecimal value) {
        this.consumptionUnits = value;
    }

    /**
     * Ruft den Wert der generalGroupOfEntitiesRef-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link GeneralGroupOfEntitiesRefStructure }
     *     
     */
    public GeneralGroupOfEntitiesRefStructure getGeneralGroupOfEntitiesRef() {
        return generalGroupOfEntitiesRef;
    }

    /**
     * Legt den Wert der generalGroupOfEntitiesRef-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link GeneralGroupOfEntitiesRefStructure }
     *     
     */
    public void setGeneralGroupOfEntitiesRef(GeneralGroupOfEntitiesRefStructure value) {
        this.generalGroupOfEntitiesRef = value;
    }

}
