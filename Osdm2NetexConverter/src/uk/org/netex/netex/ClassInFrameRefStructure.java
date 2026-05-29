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
 * Type for a reference to the Class of a ENTITY for use in filters.
 * 
 * <p>Java-Klasse f�r ClassInFrameRefStructure complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="ClassInFrameRefStructure">
 *   &lt;simpleContent>
 *     &lt;extension base="&lt;http://www.netex.org.uk/netex>ClassRefStructure">
 *       &lt;attribute name="classRefType" type="{http://www.netex.org.uk/netex}ClassRefTypeEnumeration" default="members" />
 *     &lt;/extension>
 *   &lt;/simpleContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ClassInFrameRefStructure")
public class ClassInFrameRefStructure
    extends ClassRefStructure
{

    @XmlAttribute(name = "classRefType")
    protected ClassRefTypeEnumeration classRefType;

    /**
     * Ruft den Wert der classRefType-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ClassRefTypeEnumeration }
     *     
     */
    public ClassRefTypeEnumeration getClassRefType() {
        if (classRefType == null) {
            return ClassRefTypeEnumeration.MEMBERS;
        } else {
            return classRefType;
        }
    }

    /**
     * Legt den Wert der classRefType-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ClassRefTypeEnumeration }
     *     
     */
    public void setClassRefType(ClassRefTypeEnumeration value) {
        this.classRefType = value;
    }

}
