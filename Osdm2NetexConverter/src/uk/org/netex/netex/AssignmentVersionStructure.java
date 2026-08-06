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
 * Type for ASSIGNMENT.
 * 
 * <p>Java-Klasse f�r Assignment_VersionStructure complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="Assignment_VersionStructure">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.netex.org.uk/netex}Assignment_VersionStructure_Dummy">
 *       &lt;sequence>
 *         &lt;sequence>
 *           &lt;group ref="{http://www.netex.org.uk/netex}EntityInVersionGroup" minOccurs="0"/>
 *         &lt;/sequence>
 *         &lt;sequence>
 *           &lt;group ref="{http://www.netex.org.uk/netex}DataManagedObjectGroup"/>
 *         &lt;/sequence>
 *         &lt;sequence>
 *           &lt;group ref="{http://www.netex.org.uk/netex}AssignmentGroup"/>
 *         &lt;/sequence>
 *       &lt;/sequence>
 *       &lt;attribute name="id" use="required" type="{http://www.netex.org.uk/netex}AssignmentIdType" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Assignment_VersionStructure")
@XmlSeeAlso({
    RechargingPointAssignmentVersionStructure.class,
    Assignment.class,
    VehicleServicePlaceAssignmentDummy.class,
    VehicleMeetingPointAssignmentDummy.class,
    DayTypeAssignmentVersionStructure.class,
    DisplayAssignmentVersionStructure.class,
    CheckConstraintVersionStructure.class,
    TransferRestrictionVersionStructure.class,
    CheckConstraintDelayVersionStructure.class,
    VehicleAccessCredentialsAssignmentVersionStructure.class,
    ActivationAssignmentVersionStructure.class,
    DeckPlanAssignmentVersionStructure.class,
    JourneyAccountingVersionStructure.class,
    TrainComponentLabelAssignmentVersionStructure.class,
    CheckConstraintThroughputVersionStructure.class,
    NoticeAssignmentVersionStructure.class,
    ServiceExclusionVersionStructure.class,
    VehicleServicePlaceAssignmentVersionStructure.class,
    VehicleMeetingPointAssignmentVersionStructure.class,
    AccessRightParameterAssignmentVersionStructure.class,
    SalesOfferPackageSubstitutionVersionStructure.class,
    StopAssignmentVersionStructure.class,
    TimeDemandTypeAssignmentVersionStructure.class,
    NetworkRestrictionVersionStructure.class
})
public abstract class AssignmentVersionStructure
    extends AssignmentVersionStructureDummy
{


}
