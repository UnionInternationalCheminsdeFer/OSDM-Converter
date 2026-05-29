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
 * <p>Java-Klasse f�r anonymous complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.netex.org.uk/netex}DisplayAssignment_VersionStructure">
 *       &lt;sequence>
 *         &lt;sequence>
 *           &lt;sequence>
 *             &lt;group ref="{http://www.netex.org.uk/netex}EntityInVersionGroup" minOccurs="0"/>
 *           &lt;/sequence>
 *           &lt;sequence>
 *             &lt;group ref="{http://www.netex.org.uk/netex}DataManagedObjectGroup"/>
 *           &lt;/sequence>
 *           &lt;sequence>
 *             &lt;group ref="{http://www.netex.org.uk/netex}AssignmentGroup"/>
 *           &lt;/sequence>
 *         &lt;/sequence>
 *         &lt;sequence>
 *           &lt;group ref="{http://www.netex.org.uk/netex}DisplayAssignmentGroup"/>
 *         &lt;/sequence>
 *       &lt;/sequence>
 *       &lt;attribute name="nameOfClass" type="{http://www.netex.org.uk/netex}NameOfClass" />
 *       &lt;attribute name="dataSourceRef" type="{http://www.netex.org.uk/netex}DataSourceIdType" />
 *       &lt;attribute name="created" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
 *       &lt;attribute name="changed" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
 *       &lt;attribute name="modification" type="{http://www.netex.org.uk/netex}ModificationEnumeration" default="new" />
 *       &lt;attribute name="version" type="{http://www.netex.org.uk/netex}VersionIdType" />
 *       &lt;attribute name="status" type="{http://www.netex.org.uk/netex}StatusEnumeration" default="active" />
 *       &lt;attribute name="derivedFromVersionRef" type="{http://www.netex.org.uk/netex}VersionIdType" />
 *       &lt;attribute name="compatibleWithVersionFrameVersionRef" type="{http://www.netex.org.uk/netex}VersionIdType" />
 *       &lt;attribute name="derivedFromObjectRef" type="{http://www.netex.org.uk/netex}ObjectIdType" />
 *       &lt;attribute name="responsibilitySetRef" type="{http://www.netex.org.uk/netex}ResponsibilitySetIdType" />
 *       &lt;attribute name="order" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" />
 *       &lt;attribute name="id" use="required" type="{http://www.netex.org.uk/netex}DisplayAssignmentIdType" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "")
public class DisplayAssignment
    extends DisplayAssignmentVersionStructure
{


}
