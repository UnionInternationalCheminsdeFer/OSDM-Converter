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
 * Extending Type for a reference to a GROUP OF ENTITies.
 * 
 * <p>Java-Klasse f�r GroupOfEntitiesRefStructure_Dummy complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="GroupOfEntitiesRefStructure_Dummy">
 *   &lt;simpleContent>
 *     &lt;extension base="&lt;http://www.netex.org.uk/netex>VersionOfObjectRefStructure">
 *       &lt;attribute name="nameOfMemberClass" type="{http://www.netex.org.uk/netex}NameOfClass" />
 *     &lt;/extension>
 *   &lt;/simpleContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GroupOfEntitiesRefStructure_Dummy")
@XmlSeeAlso({
    GroupOfEntitiesRefStructure.class
})
public abstract class GroupOfEntitiesRefStructureDummy
    extends VersionOfObjectRefStructure
{

    @XmlAttribute(name = "nameOfMemberClass")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String nameOfMemberClass;

    /**
     * Ruft den Wert der nameOfMemberClass-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNameOfMemberClass() {
        return nameOfMemberClass;
    }

    /**
     * Legt den Wert der nameOfMemberClass-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNameOfMemberClass(String value) {
        this.nameOfMemberClass = value;
    }

}
