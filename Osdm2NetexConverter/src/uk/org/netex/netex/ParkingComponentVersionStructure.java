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
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.NormalizedStringAdapter;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * Type for a PARKING COMPONENT.
 * 
 * <p>Java-Klasse f�r ParkingComponent_VersionStructure complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="ParkingComponent_VersionStructure">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.netex.org.uk/netex}SiteComponent_VersionStructure">
 *       &lt;sequence>
 *         &lt;group ref="{http://www.netex.org.uk/netex}ParkingComponentGroup"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ParkingComponent_VersionStructure", propOrder = {
    "parkingPaymentCode",
    "label",
    "maximumLength",
    "maximumWidth",
    "maximumHeight",
    "maximumWeight"
})
@XmlSeeAlso({
    ParkingComponent.class,
    ParkingAreaVersionStructure.class,
    ParkingBayVersionStructure.class
})
public class ParkingComponentVersionStructure
    extends SiteComponentVersionStructure
{

    @XmlElement(name = "ParkingPaymentCode")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String parkingPaymentCode;
    @XmlElement(name = "Label")
    protected MultilingualString label;
    @XmlElement(name = "MaximumLength")
    protected BigDecimal maximumLength;
    @XmlElement(name = "MaximumWidth")
    protected BigDecimal maximumWidth;
    @XmlElement(name = "MaximumHeight")
    protected BigDecimal maximumHeight;
    @XmlElement(name = "MaximumWeight")
    protected BigDecimal maximumWeight;

    /**
     * Ruft den Wert der parkingPaymentCode-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getParkingPaymentCode() {
        return parkingPaymentCode;
    }

    /**
     * Legt den Wert der parkingPaymentCode-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setParkingPaymentCode(String value) {
        this.parkingPaymentCode = value;
    }

    /**
     * Ruft den Wert der label-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link MultilingualString }
     *     
     */
    public MultilingualString getLabel() {
        return label;
    }

    /**
     * Legt den Wert der label-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link MultilingualString }
     *     
     */
    public void setLabel(MultilingualString value) {
        this.label = value;
    }

    /**
     * Ruft den Wert der maximumLength-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMaximumLength() {
        return maximumLength;
    }

    /**
     * Legt den Wert der maximumLength-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMaximumLength(BigDecimal value) {
        this.maximumLength = value;
    }

    /**
     * Ruft den Wert der maximumWidth-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMaximumWidth() {
        return maximumWidth;
    }

    /**
     * Legt den Wert der maximumWidth-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMaximumWidth(BigDecimal value) {
        this.maximumWidth = value;
    }

    /**
     * Ruft den Wert der maximumHeight-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMaximumHeight() {
        return maximumHeight;
    }

    /**
     * Legt den Wert der maximumHeight-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMaximumHeight(BigDecimal value) {
        this.maximumHeight = value;
    }

    /**
     * Ruft den Wert der maximumWeight-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMaximumWeight() {
        return maximumWeight;
    }

    /**
     * Legt den Wert der maximumWeight-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMaximumWeight(BigDecimal value) {
        this.maximumWeight = value;
    }

}
