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
 * Type for FARE DEMAND FACTOR.
 * 
 * <p>Java-Klasse f�r FareDemandFactor_VersionStructure complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="FareDemandFactor_VersionStructure">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.netex.org.uk/netex}QualityStructureFactor_VersionStructure">
 *       &lt;sequence>
 *         &lt;group ref="{http://www.netex.org.uk/netex}FareDemandFactorGroup"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FareDemandFactor_VersionStructure", propOrder = {
    "fareDemandType",
    "timeDemandTypeRef",
    "stopUseConstraint",
    "startTimesAtStopPoints"
})
@XmlSeeAlso({
    FareDemandFactor.class
})
public class FareDemandFactorVersionStructure
    extends QualityStructureFactorVersionStructure
{

    @XmlElement(name = "FareDemandType")
    @XmlSchemaType(name = "normalizedString")
    protected FareDemandTypeEnumeration fareDemandType;
    @XmlElement(name = "TimeDemandTypeRef")
    protected TimeDemandTypeRefStructure timeDemandTypeRef;
    @XmlElement(name = "StopUseConstraint")
    @XmlSchemaType(name = "normalizedString")
    protected StopUseConstraintEnumeration stopUseConstraint;
    protected StartTimeAtStopPointsRelStructure startTimesAtStopPoints;

    /**
     * Ruft den Wert der fareDemandType-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FareDemandTypeEnumeration }
     *     
     */
    public FareDemandTypeEnumeration getFareDemandType() {
        return fareDemandType;
    }

    /**
     * Legt den Wert der fareDemandType-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FareDemandTypeEnumeration }
     *     
     */
    public void setFareDemandType(FareDemandTypeEnumeration value) {
        this.fareDemandType = value;
    }

    /**
     * Ruft den Wert der timeDemandTypeRef-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link TimeDemandTypeRefStructure }
     *     
     */
    public TimeDemandTypeRefStructure getTimeDemandTypeRef() {
        return timeDemandTypeRef;
    }

    /**
     * Legt den Wert der timeDemandTypeRef-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link TimeDemandTypeRefStructure }
     *     
     */
    public void setTimeDemandTypeRef(TimeDemandTypeRefStructure value) {
        this.timeDemandTypeRef = value;
    }

    /**
     * Ruft den Wert der stopUseConstraint-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link StopUseConstraintEnumeration }
     *     
     */
    public StopUseConstraintEnumeration getStopUseConstraint() {
        return stopUseConstraint;
    }

    /**
     * Legt den Wert der stopUseConstraint-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link StopUseConstraintEnumeration }
     *     
     */
    public void setStopUseConstraint(StopUseConstraintEnumeration value) {
        this.stopUseConstraint = value;
    }

    /**
     * Ruft den Wert der startTimesAtStopPoints-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link StartTimeAtStopPointsRelStructure }
     *     
     */
    public StartTimeAtStopPointsRelStructure getStartTimesAtStopPoints() {
        return startTimesAtStopPoints;
    }

    /**
     * Legt den Wert der startTimesAtStopPoints-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link StartTimeAtStopPointsRelStructure }
     *     
     */
    public void setStartTimesAtStopPoints(StartTimeAtStopPointsRelStructure value) {
        this.startTimesAtStopPoints = value;
    }

}
