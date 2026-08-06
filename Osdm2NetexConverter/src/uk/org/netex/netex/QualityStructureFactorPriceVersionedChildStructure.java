//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// �nderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2026.05.22 um 10:24:00 AM CEST 
//


package uk.org.netex.netex;

import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElementRef;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Type for a QUALITY STRUCTURE FACTOR PRICEs.
 * 
 * <p>Java-Klasse f�r QualityStructureFactorPrice_VersionedChildStructure complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="QualityStructureFactorPrice_VersionedChildStructure">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.netex.org.uk/netex}FarePrice_VersionedChildStructure">
 *       &lt;sequence>
 *         &lt;group ref="{http://www.netex.org.uk/netex}QualityStructureFactorPriceGroup"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "QualityStructureFactorPrice_VersionedChildStructure", propOrder = {
    "qualityStructureFactorRef"
})
@XmlSeeAlso({
    QualityStructureFactorPrice.class
})
public class QualityStructureFactorPriceVersionedChildStructure
    extends FarePriceVersionedChildStructure
{

    @XmlElementRef(name = "QualityStructureFactorRef", namespace = "http://www.netex.org.uk/netex", type = JAXBElement.class, required = false)
    protected JAXBElement<? extends QualityStructureFactorRefStructure> qualityStructureFactorRef;

    /**
     * Ruft den Wert der qualityStructureFactorRef-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link FareDemandFactorRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link FareQuotaFactorRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link QualityStructureFactorRefStructure }{@code >}
     *     
     */
    public JAXBElement<? extends QualityStructureFactorRefStructure> getQualityStructureFactorRef() {
        return qualityStructureFactorRef;
    }

    /**
     * Legt den Wert der qualityStructureFactorRef-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link FareDemandFactorRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link FareQuotaFactorRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link QualityStructureFactorRefStructure }{@code >}
     *     
     */
    public void setQualityStructureFactorRef(JAXBElement<? extends QualityStructureFactorRefStructure> value) {
        this.qualityStructureFactorRef = value;
    }

}
