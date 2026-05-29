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
 *     &lt;restriction base="{http://www.netex.org.uk/netex}FareDemandFactor_VersionStructure">
 *       &lt;sequence>
 *         &lt;sequence>
 *           &lt;group ref="{http://www.netex.org.uk/netex}EntityInVersionGroup" minOccurs="0"/>
 *         &lt;/sequence>
 *         &lt;sequence>
 *           &lt;group ref="{http://www.netex.org.uk/netex}DataManagedObjectGroup"/>
 *         &lt;/sequence>
 *         &lt;sequence>
 *           &lt;group ref="{http://www.netex.org.uk/netex}PriceableObjectGroup"/>
 *         &lt;/sequence>
 *         &lt;sequence>
 *           &lt;element ref="{http://www.netex.org.uk/netex}PrivateCode" minOccurs="0"/>
 *           &lt;element ref="{http://www.netex.org.uk/netex}TypeOfFareStructureFactorRef" minOccurs="0"/>
 *           &lt;element name="Factor" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/>
 *         &lt;/sequence>
 *         &lt;sequence>
 *           &lt;group ref="{http://www.netex.org.uk/netex}QualityStructureFactorGroup"/>
 *         &lt;/sequence>
 *         &lt;sequence>
 *           &lt;group ref="{http://www.netex.org.uk/netex}FareDemandFactorGroup"/>
 *         &lt;/sequence>
 *       &lt;/sequence>
 *       &lt;attribute name="id" use="required" type="{http://www.netex.org.uk/netex}FareDemandFactorIdType" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "")
public class FareDemandFactor
    extends FareDemandFactorVersionStructure
{


}
