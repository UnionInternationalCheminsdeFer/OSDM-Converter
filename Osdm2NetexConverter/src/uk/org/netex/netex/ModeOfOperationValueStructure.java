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
 * Type for a MODE OF OPERATION.
 * 
 * <p>Java-Klasse f�r ModeOfOperation_ValueStructure complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="ModeOfOperation_ValueStructure">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.netex.org.uk/netex}TypeOfValue_VersionStructure">
 *       &lt;sequence>
 *         &lt;group ref="{http://www.netex.org.uk/netex}ModeOfOperationGroup"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ModeOfOperation_ValueStructure", propOrder = {
    "typeOfModeOfOperationRef",
    "submodes"
})
@XmlSeeAlso({
    ModeOfOperation.class,
    PersonalModeOfOperationValueStructure.class,
    ConventionalModeOfOperationValueStructure.class,
    AlternativeModeOfOperationValueStructure.class
})
public class ModeOfOperationValueStructure
    extends TypeOfValueVersionStructure
{

    @XmlElement(name = "TypeOfModeOfOperationRef")
    protected TypeOfModeOfOperationRefStructure typeOfModeOfOperationRef;
    protected SubmodesRelStructure submodes;

    /**
     * Ruft den Wert der typeOfModeOfOperationRef-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link TypeOfModeOfOperationRefStructure }
     *     
     */
    public TypeOfModeOfOperationRefStructure getTypeOfModeOfOperationRef() {
        return typeOfModeOfOperationRef;
    }

    /**
     * Legt den Wert der typeOfModeOfOperationRef-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeOfModeOfOperationRefStructure }
     *     
     */
    public void setTypeOfModeOfOperationRef(TypeOfModeOfOperationRefStructure value) {
        this.typeOfModeOfOperationRef = value;
    }

    /**
     * Ruft den Wert der submodes-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link SubmodesRelStructure }
     *     
     */
    public SubmodesRelStructure getSubmodes() {
        return submodes;
    }

    /**
     * Legt den Wert der submodes-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link SubmodesRelStructure }
     *     
     */
    public void setSubmodes(SubmodesRelStructure value) {
        this.submodes = value;
    }

}
