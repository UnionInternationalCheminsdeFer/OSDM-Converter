//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// �nderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2026.05.22 um 10:24:00 AM CEST 
//


package uk.org.netex.netex;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Type for Classification of a POINT OF INTEREST.
 * 
 * <p>Java-Klasse f�r PointOfInterestClassification_VersionStructure complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="PointOfInterestClassification_VersionStructure">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.netex.org.uk/netex}TypeOfValue_VersionStructure">
 *       &lt;sequence>
 *         &lt;group ref="{http://www.netex.org.uk/netex}PointOfInterestClassificationGroup"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PointOfInterestClassification_VersionStructure", propOrder = {
    "alternativeDescriptors"
})
@XmlSeeAlso({
    PointOfInterestClassification.class
})
public class PointOfInterestClassificationVersionStructure
    extends TypeOfValueVersionStructure
{

    protected ClassificationDescriptorsRelStructure alternativeDescriptors;

    /**
     * Ruft den Wert der alternativeDescriptors-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ClassificationDescriptorsRelStructure }
     *     
     */
    public ClassificationDescriptorsRelStructure getAlternativeDescriptors() {
        return alternativeDescriptors;
    }

    /**
     * Legt den Wert der alternativeDescriptors-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ClassificationDescriptorsRelStructure }
     *     
     */
    public void setAlternativeDescriptors(ClassificationDescriptorsRelStructure value) {
        this.alternativeDescriptors = value;
    }

}
