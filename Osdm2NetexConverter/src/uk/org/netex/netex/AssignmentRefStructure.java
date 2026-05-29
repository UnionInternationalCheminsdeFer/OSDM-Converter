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
 * Type for a versioned reference to a NeTEx Object.
 * 
 * <p>Java-Klasse f�r AssignmentRefStructure complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="AssignmentRefStructure">
 *   &lt;simpleContent>
 *     &lt;restriction base="&lt;http://www.netex.org.uk/netex>OrderedVersionOfObjectRefStructure">
 *       &lt;attGroup ref="{http://www.netex.org.uk/netex}ReferenceModificationDetailsGroup"/>
 *       &lt;attribute name="ref" use="required" type="{http://www.netex.org.uk/netex}AssignmentIdType" />
 *       &lt;attribute name="nameOfRefClass" type="{http://www.netex.org.uk/netex}NameOfClassAssignmentRefStructureType" />
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
@XmlType(name = "AssignmentRefStructure")
@XmlSeeAlso({
    VehicleAccessCredentialsAssignmentRefStructure.class,
    DistributionAssignmentRefStructure.class,
    TimeDemandTypeAssignmentRefStructure.class,
    JourneyAccountingRefStructure.class,
    RechargingPointAssignmentRefStructure.class,
    VehicleMeetingPointAssignmentRefStructure.class,
    DeckPlanAssignmentRefStructure.class,
    SalesOfferPackageSubstitutionRefStructure.class,
    CheckConstraintDelayRefStructure.class,
    CheckConstraintRefStructure.class,
    TrainComponentLabelAssignmentRefStructure.class,
    VehicleServicePlaceAssignmentRefStructure.class,
    ServiceExclusionRefStructure.class,
    DisplayAssignmentRefStructure.class,
    StopAssignmentRefStructure.class,
    CheckConstraintThroughputRefStructure.class,
    NetworkRestrictionRefStructure.class,
    TransferRestrictionRefStructure.class,
    DayTypeAssignmentRefStructure.class,
    ActivationAssignmentRefStructure.class,
    AccessRightParameterAssignmentRefStructure.class,
    NoticeAssignmentRefStructure.class
})
public class AssignmentRefStructure
    extends OrderedVersionOfObjectRefStructure
{


}
