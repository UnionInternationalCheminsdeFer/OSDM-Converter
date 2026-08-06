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
import jakarta.xml.bind.annotation.XmlType;


/**
 * Type for a list of references to COMPLEX FEATUREs.
 * 
 * <p>Java-Klasse f�r complexFeatureRefs_RelStructure complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="complexFeatureRefs_RelStructure">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.netex.org.uk/netex}oneToManyRelationshipStructure">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.netex.org.uk/netex}ComplexFeatureRef"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "complexFeatureRefs_RelStructure", propOrder = {
    "complexFeatureRef"
})
public class ComplexFeatureRefsRelStructure
    extends OneToManyRelationshipStructure
{

    @XmlElement(name = "ComplexFeatureRef", required = true)
    protected ComplexFeatureRefStructure complexFeatureRef;

    /**
     * Ruft den Wert der complexFeatureRef-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ComplexFeatureRefStructure }
     *     
     */
    public ComplexFeatureRefStructure getComplexFeatureRef() {
        return complexFeatureRef;
    }

    /**
     * Legt den Wert der complexFeatureRef-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ComplexFeatureRefStructure }
     *     
     */
    public void setComplexFeatureRef(ComplexFeatureRefStructure value) {
        this.complexFeatureRef = value;
    }

}
