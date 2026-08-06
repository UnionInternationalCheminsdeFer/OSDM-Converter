//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// �nderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2026.05.22 um 10:24:00 AM CEST 
//


package uk.org.netex.netex;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.CollapsedStringAdapter;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * Type for FARE INTERVAL.
 * 
 * <p>Java-Klasse f�r FareInterval_VersionStructure complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="FareInterval_VersionStructure">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.netex.org.uk/netex}PriceableObject_VersionStructure">
 *       &lt;attribute name="nameOfClassOfUnit" type="{http://www.netex.org.uk/netex}NameOfClass" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FareInterval_VersionStructure")
@XmlSeeAlso({
    FareInterval.class,
    GeographicalIntervalVersionStructure.class,
    TimeIntervalVersionStructure.class
})
public class FareIntervalVersionStructure
    extends PriceableObjectVersionStructure
{

    @XmlAttribute(name = "nameOfClassOfUnit")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String nameOfClassOfUnit;

    /**
     * Ruft den Wert der nameOfClassOfUnit-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNameOfClassOfUnit() {
        return nameOfClassOfUnit;
    }

    /**
     * Legt den Wert der nameOfClassOfUnit-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNameOfClassOfUnit(String value) {
        this.nameOfClassOfUnit = value;
    }

}
