//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// �nderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2026.05.22 um 10:24:00 AM CEST 
//


package uk.org.netex.netex;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Type for a reference to a ROUTE LINK BY VALUE.
 * 
 * <p>Java-Klasse f�r RouteLinkRefByValueStructure complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="RouteLinkRefByValueStructure">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.netex.org.uk/netex}LinkRefByValueStructure">
 *       &lt;attribute name="fromPointRef" use="required" type="{http://www.netex.org.uk/netex}RoutePointIdType" />
 *       &lt;attribute name="toPointRef" use="required" type="{http://www.netex.org.uk/netex}RoutePointIdType" />
 *       &lt;attribute name="nameOfPointRefClass" type="{http://www.netex.org.uk/netex}NameOfClass" fixed="RoutePoint" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RouteLinkRefByValueStructure")
public class RouteLinkRefByValueStructure
    extends LinkRefByValueStructure
{


}
