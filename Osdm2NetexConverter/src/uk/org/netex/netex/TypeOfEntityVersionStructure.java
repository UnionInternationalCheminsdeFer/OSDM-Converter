//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// �nderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2026.05.22 um 10:24:00 AM CEST 
//


package uk.org.netex.netex;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.CollapsedStringAdapter;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * Type for a TYPE OFENTITY. Abstract supertype used to define open classifications of value types.
 * 
 * <p>Java-Klasse f�r TypeOfEntity_VersionStructure complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="TypeOfEntity_VersionStructure">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.netex.org.uk/netex}TypeOfValue_VersionStructure">
 *       &lt;attribute name="nameOfClassifiedEntityClass" type="{http://www.netex.org.uk/netex}NameOfClass" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TypeOfEntity_VersionStructure")
@XmlSeeAlso({
    TypeOfRollingStockValueStructure.class,
    TypeOfServiceFeatureValueStructure.class,
    TypeOfDeliveryVariantValueStructure.class,
    TypeOfFareStructureFactorVersionStructure.class,
    TypeOfFareProductVersionStructure.class,
    TypeOfTravelDocumentVersionStructure.class,
    TypeOfFlexibleServiceValueStructure.class,
    TypeOfFeatureValueStructure.class,
    TypeOfPointValueStructure.class,
    TypeOfPlaceValueStructure.class,
    TypeOfTransferValueStructure.class,
    TypeOfCongestionValueStructure.class,
    TypeOfZoneValueStructure.class,
    TypeOfOperationValueStructure.class,
    TypeOfNoticeValueStructure.class,
    TypeOfModeOfOperationValueStructure.class,
    TypeOfProductCategoryStructure.class,
    TypeOfProjectionValueStructure.class,
    TypeOfOrganisationValueStructure.class,
    TypeOfPassengerInformationEquipmentValueStructure.class,
    TypeOfEquipmentValueStructure.class,
    TypeOfLineValueStructure.class,
    TypeOfFrameValueStructure.class,
    TypeOfMobilityServiceValueStructure.class,
    TypeOfRetailDeviceVersionStructure.class,
    TypeOfJourneyPatternValueStructure.class,
    TypeOfFareContractVersionStructure.class,
    TypeOfFareContractEntryVersionStructure.class,
    TypeOfResponsibilityRoleValueStructure.class,
    TypeOfFareStructureElementVersionStructure.class,
    TypeOfLinkValueStructure.class,
    TypeOfSalesOfferPackageVersionStructure.class,
    TypeOfOrganisationPartValueStructure.class,
    TypeOfSecurityListVersionStructure.class,
    TypeOfServiceStructure.class,
    TypeOfAccessRightAssignmentVersionStructure.class,
    TypeOfLinkSequenceValueStructure.class,
    TypeOfActivationValueStructure.class,
    CustomerAccountStatusVersionStructure.class,
    TypeOfBatteryChemistryValueStructure.class,
    TypeOfTimeDemandTypeStructure.class,
    TypeOfCustomerAccountVersionStructure.class,
    TypeOfFacilityVersionStructure.class,
    TypeOfPlugValueStructure.class,
    TypeOfTariffValueStructure.class
})
public class TypeOfEntityVersionStructure
    extends TypeOfValueVersionStructure
{

    @XmlAttribute(name = "nameOfClassifiedEntityClass")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String nameOfClassifiedEntityClass;

    /**
     * Ruft den Wert der nameOfClassifiedEntityClass-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNameOfClassifiedEntityClass() {
        return nameOfClassifiedEntityClass;
    }

    /**
     * Legt den Wert der nameOfClassifiedEntityClass-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNameOfClassifiedEntityClass(String value) {
        this.nameOfClassifiedEntityClass = value;
    }

}
