//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// �nderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2026.05.22 um 10:24:00 AM CEST 
//


package uk.org.netex.netex;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse f�r anonymous complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.netex.org.uk/netex}AlternativeQuayDescriptor_VersionedChildStructure">
 *       &lt;sequence>
 *         &lt;sequence>
 *           &lt;group ref="{http://www.netex.org.uk/netex}VersionedChildGroup"/>
 *         &lt;/sequence>
 *         &lt;sequence>
 *           &lt;element name="NamedObjectRef" type="{http://www.netex.org.uk/netex}VersionOfObjectRefStructure" minOccurs="0"/>
 *           &lt;element name="Lang" type="{http://www.w3.org/2001/XMLSchema}language" minOccurs="0"/>
 *           &lt;element name="NameType" type="{http://www.netex.org.uk/netex}NameTypeEnumeration" minOccurs="0"/>
 *           &lt;element name="TypeOfName" type="{http://www.w3.org/2001/XMLSchema}normalizedString" minOccurs="0"/>
 *           &lt;element name="Name" type="{http://www.netex.org.uk/netex}MultilingualString"/>
 *           &lt;element name="ShortName" type="{http://www.netex.org.uk/netex}MultilingualString" minOccurs="0"/>
 *           &lt;element name="Abbreviation" type="{http://www.netex.org.uk/netex}MultilingualString" minOccurs="0"/>
 *           &lt;element name="QualifierName" type="{http://www.netex.org.uk/netex}MultilingualString" minOccurs="0"/>
 *         &lt;/sequence>
 *         &lt;sequence>
 *           &lt;group ref="{http://www.netex.org.uk/netex}RelativeLocationGroup"/>
 *         &lt;/sequence>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "")
@XmlRootElement(name = "AlternativeQuayDescriptor")
public class AlternativeQuayDescriptor
    extends AlternativeQuayDescriptorVersionedChildStructure
{


}
