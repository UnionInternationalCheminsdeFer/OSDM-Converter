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
 * <p>Java-Klasse f�r NameOfClassRetailConsortiumRefStructureType.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="NameOfClassRetailConsortiumRefStructureType">
 *   &lt;restriction base="{http://www.netex.org.uk/netex}NameOfClassOrganisationRefStructureType">
 *     &lt;enumeration value="RetailConsortium"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "NameOfClassRetailConsortiumRefStructureType")
@XmlEnum(NameOfClassOrganisationRefStructureType.class)
public enum NameOfClassRetailConsortiumRefStructureType {

    @XmlEnumValue("RetailConsortium")
    RETAIL_CONSORTIUM(NameOfClassOrganisationRefStructureType.RETAIL_CONSORTIUM);
    private final NameOfClassOrganisationRefStructureType value;

    NameOfClassRetailConsortiumRefStructureType(NameOfClassOrganisationRefStructureType v) {
        value = v;
    }

    public NameOfClassOrganisationRefStructureType value() {
        return value;
    }

    public static NameOfClassRetailConsortiumRefStructureType fromValue(NameOfClassOrganisationRefStructureType v) {
        for (NameOfClassRetailConsortiumRefStructureType c: NameOfClassRetailConsortiumRefStructureType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v.toString());
    }

}
