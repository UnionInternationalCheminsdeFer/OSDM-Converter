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
import jakarta.xml.bind.annotation.XmlType;


/**
 * Type for a reference to a MODE and SUBMODE.
 * 
 * <p>Java-Klasse f�r ModeRefStructure complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="ModeRefStructure">
 *   &lt;simpleContent>
 *     &lt;extension base="&lt;http://www.netex.org.uk/netex>SubmodeRefStructure">
 *       &lt;attribute name="mode" use="required" type="{http://www.netex.org.uk/netex}AllPublicTransportModesEnumeration" />
 *     &lt;/extension>
 *   &lt;/simpleContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ModeRefStructure")
public class ModeRefStructure
    extends SubmodeRefStructure
{

    @XmlAttribute(name = "mode", required = true)
    protected AllPublicTransportModesEnumeration mode;

    /**
     * Ruft den Wert der mode-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link AllPublicTransportModesEnumeration }
     *     
     */
    public AllPublicTransportModesEnumeration getMode() {
        return mode;
    }

    /**
     * Legt den Wert der mode-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link AllPublicTransportModesEnumeration }
     *     
     */
    public void setMode(AllPublicTransportModesEnumeration value) {
        this.mode = value;
    }

}
