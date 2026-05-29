//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// �nderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2026.05.22 um 10:24:00 AM CEST 
//


package uk.org.netex.netex;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Type for reference to a PARKING ENTRANCE.
 * 
 * <p>Java-Klasse f�r ParkingEntranceRefStructure complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="ParkingEntranceRefStructure">
 *   &lt;simpleContent>
 *     &lt;restriction base="&lt;http://www.netex.org.uk/netex>EntranceRefStructure">
 *       &lt;attGroup ref="{http://www.netex.org.uk/netex}ReferenceModificationDetailsGroup"/>
 *       &lt;attribute name="ref" use="required" type="{http://www.netex.org.uk/netex}ParkingEntranceIdType" />
 *       &lt;attribute name="nameOfRefClass" type="{http://www.netex.org.uk/netex}NameOfClassEntranceRefStructureType" />
 *       &lt;attribute name="modification" type="{http://www.netex.org.uk/netex}ModificationEnumeration" />
 *       &lt;attribute name="versionRef" type="{http://www.netex.org.uk/netex}VersionIdType" />
 *       &lt;attribute name="uri" type="{http://www.w3.org/2001/XMLSchema}anyURI" />
 *     &lt;/restriction>
 *   &lt;/simpleContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ParkingEntranceRefStructure")
@XmlSeeAlso({
    ParkingEntranceForVehiclesRefStructure.class,
    ParkingPassengerEntranceRefStructure.class
})
public class ParkingEntranceRefStructure
    extends EntranceRefStructure
{


}
