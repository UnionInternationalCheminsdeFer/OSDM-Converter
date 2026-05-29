//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// �nderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2026.05.22 um 10:24:00 AM CEST 
//


package uk.org.netex.netex;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse f�r OutputDetailEnumeration.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="OutputDetailEnumeration">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN">
 *     &lt;enumeration value="All"/>
 *     &lt;enumeration value="Basic"/>
 *     &lt;enumeration value="NoGeometry"/>
 *     &lt;enumeration value="Xref"/>
 *     &lt;enumeration value="AllWithXref"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "OutputDetailEnumeration")
@XmlEnum
public enum OutputDetailEnumeration {

    @XmlEnumValue("All")
    ALL("All"),
    @XmlEnumValue("Basic")
    BASIC("Basic"),
    @XmlEnumValue("NoGeometry")
    NO_GEOMETRY("NoGeometry"),
    @XmlEnumValue("Xref")
    XREF("Xref"),
    @XmlEnumValue("AllWithXref")
    ALL_WITH_XREF("AllWithXref");
    private final String value;

    OutputDetailEnumeration(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static OutputDetailEnumeration fromValue(String v) {
        for (OutputDetailEnumeration c: OutputDetailEnumeration.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
