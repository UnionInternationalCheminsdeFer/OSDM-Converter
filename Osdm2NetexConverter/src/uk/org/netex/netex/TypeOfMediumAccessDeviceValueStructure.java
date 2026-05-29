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
 * Type for a TYPE OF MEDIUM ACCESS DEVICE.
 * 
 * <p>Java-Klasse f�r TypeOfMediumAccessDevice_ValueStructure complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="TypeOfMediumAccessDevice_ValueStructure">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.netex.org.uk/netex}TypeOfValue_VersionStructure">
 *       &lt;sequence>
 *         &lt;group ref="{http://www.netex.org.uk/netex}TypeOfMediumAccessDeviceGroup"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TypeOfMediumAccessDevice_ValueStructure", propOrder = {
    "typeOfMachineReadabilityRef"
})
@XmlSeeAlso({
    TypeOfMediumAccessDevice.class
})
public class TypeOfMediumAccessDeviceValueStructure
    extends TypeOfValueVersionStructure
{

    @XmlElement(name = "TypeOfMachineReadabilityRef")
    protected TypeOfMachineReadabilityRefStructure typeOfMachineReadabilityRef;

    /**
     * Ruft den Wert der typeOfMachineReadabilityRef-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link TypeOfMachineReadabilityRefStructure }
     *     
     */
    public TypeOfMachineReadabilityRefStructure getTypeOfMachineReadabilityRef() {
        return typeOfMachineReadabilityRef;
    }

    /**
     * Legt den Wert der typeOfMachineReadabilityRef-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeOfMachineReadabilityRefStructure }
     *     
     */
    public void setTypeOfMachineReadabilityRef(TypeOfMachineReadabilityRefStructure value) {
        this.typeOfMachineReadabilityRef = value;
    }

}
