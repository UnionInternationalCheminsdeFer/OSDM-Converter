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
 *     &lt;restriction base="{http://www.netex.org.uk/netex}RechargingStep_VersionStructure">
 *       &lt;sequence>
 *         &lt;sequence>
 *           &lt;group ref="{http://www.netex.org.uk/netex}EntityInVersionGroup" minOccurs="0"/>
 *         &lt;/sequence>
 *         &lt;sequence>
 *           &lt;group ref="{http://www.netex.org.uk/netex}VersionedChildGroup"/>
 *         &lt;/sequence>
 *         &lt;sequence>
 *           &lt;element name="Name" type="{http://www.netex.org.uk/netex}MultilingualString" minOccurs="0"/>
 *           &lt;element name="Description" type="{http://www.netex.org.uk/netex}MultilingualString" minOccurs="0"/>
 *           &lt;element name="ChargeEnergy" type="{http://www.netex.org.uk/netex}WattHoursType" minOccurs="0"/>
 *           &lt;element name="TargetEnergy" type="{http://www.netex.org.uk/netex}WattHoursType" minOccurs="0"/>
 *           &lt;group ref="{http://www.netex.org.uk/netex}RechargingDurationGroup"/>
 *           &lt;element ref="{http://www.netex.org.uk/netex}JourneyRef" minOccurs="0"/>
 *           &lt;element ref="{http://www.netex.org.uk/netex}PointInJourneyPatternRef" minOccurs="0"/>
 *           &lt;element ref="{http://www.netex.org.uk/netex}VehicleChargingEquipmentRef" minOccurs="0"/>
 *           &lt;element ref="{http://www.netex.org.uk/netex}RechargingEquipmentProfileRef" minOccurs="0"/>
 *           &lt;element name="vehicleTypes" type="{http://www.netex.org.uk/netex}vehicleTypeRefs_RelStructure" minOccurs="0"/>
 *           &lt;element name="vehicles" type="{http://www.netex.org.uk/netex}vehicleRefs_RelStructure" minOccurs="0"/>
 *         &lt;/sequence>
 *       &lt;/sequence>
 *       &lt;attribute name="id" use="required" type="{http://www.netex.org.uk/netex}RechargingStepIdType" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "")
public class RechargingStep
    extends RechargingStepVersionStructure
{


}
