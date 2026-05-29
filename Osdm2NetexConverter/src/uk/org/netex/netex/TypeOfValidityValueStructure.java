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
import javax.xml.datatype.Duration;


/**
 * Type for a TYPE OF VALIDITY.
 * 
 * <p>Java-Klasse f�r TypeOfValidity_ValueStructure complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="TypeOfValidity_ValueStructure">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.netex.org.uk/netex}TypeOfValue_VersionStructure">
 *       &lt;group ref="{http://www.netex.org.uk/netex}TypeOfValidityGroup"/>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TypeOfValidity_ValueStructure", propOrder = {
    "periodicity",
    "nature",
    "classes"
})
@XmlSeeAlso({
    TypeOfValidity.class
})
public class TypeOfValidityValueStructure
    extends TypeOfValueVersionStructure
{

    @XmlElement(name = "Periodicity")
    protected Duration periodicity;
    @XmlElement(name = "Nature")
    @XmlSchemaType(name = "normalizedString")
    protected FrameNatureEnumeration nature;
    protected ClassRefsRelStructure classes;

    /**
     * Ruft den Wert der periodicity-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Duration }
     *     
     */
    public Duration getPeriodicity() {
        return periodicity;
    }

    /**
     * Legt den Wert der periodicity-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Duration }
     *     
     */
    public void setPeriodicity(Duration value) {
        this.periodicity = value;
    }

    /**
     * Ruft den Wert der nature-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FrameNatureEnumeration }
     *     
     */
    public FrameNatureEnumeration getNature() {
        return nature;
    }

    /**
     * Legt den Wert der nature-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FrameNatureEnumeration }
     *     
     */
    public void setNature(FrameNatureEnumeration value) {
        this.nature = value;
    }

    /**
     * Ruft den Wert der classes-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ClassRefsRelStructure }
     *     
     */
    public ClassRefsRelStructure getClasses() {
        return classes;
    }

    /**
     * Legt den Wert der classes-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ClassRefsRelStructure }
     *     
     */
    public void setClasses(ClassRefsRelStructure value) {
        this.classes = value;
    }

}
