//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// �nderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2026.05.22 um 10:24:00 AM CEST 
//


package uk.org.netex.netex;

import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElementRef;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Type for a PURPOSE OF GROUPING.
 * 
 * <p>Java-Klasse f�r PurposeOfGrouping_ValueStructure complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="PurposeOfGrouping_ValueStructure">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.netex.org.uk/netex}TypeOfValue_VersionStructure">
 *       &lt;sequence>
 *         &lt;group ref="{http://www.netex.org.uk/netex}PurposeOfGroupingGroup"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PurposeOfGrouping_ValueStructure", propOrder = {
    "classes",
    "typeOfEntity"
})
@XmlSeeAlso({
    PurposeOfGrouping.class
})
public class PurposeOfGroupingValueStructure
    extends TypeOfValueVersionStructure
{

    protected ClassRefsRelStructure classes;
    @XmlElementRef(name = "TypeOfEntity", namespace = "http://www.netex.org.uk/netex", type = JAXBElement.class, required = false)
    protected JAXBElement<? extends TypeOfEntityVersionStructure> typeOfEntity;

    /**
     * Ruft den Wert der classes-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ClassRefsRelStructure }
     *     
     */
    public ClassRefsRelStructure getClasses() {
        return classes;
    }

    /**
     * Legt den Wert der classes-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ClassRefsRelStructure }
     *     
     */
    public void setClasses(ClassRefsRelStructure value) {
        this.classes = value;
    }

    /**
     * Ruft den Wert der typeOfEntity-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link TypeOfOrganisation }{@code >}
     *     {@link JAXBElement }{@code <}{@link TypeOfFareContract }{@code >}
     *     {@link JAXBElement }{@code <}{@link TypeOfFareProduct }{@code >}
     *     {@link JAXBElement }{@code <}{@link TypeOfTravelDocument }{@code >}
     *     {@link JAXBElement }{@code <}{@link TypeOfNotice }{@code >}
     *     {@link JAXBElement }{@code <}{@link TypeOfLink }{@code >}
     *     {@link JAXBElement }{@code <}{@link TypeOfTimeDemandType }{@code >}
     *     {@link JAXBElement }{@code <}{@link TypeOfBatteryChemistry }{@code >}
     *     {@link JAXBElement }{@code <}{@link TypeOfFlexibleService }{@code >}
     *     {@link JAXBElement }{@code <}{@link TypeOfAccessRightAssignment }{@code >}
     *     {@link JAXBElement }{@code <}{@link TypeOfRetailDevice }{@code >}
     *     {@link JAXBElement }{@code <}{@link TypeOfCongestion }{@code >}
     *     {@link JAXBElement }{@code <}{@link TypeOfPassengerInformationEquipment }{@code >}
     *     {@link JAXBElement }{@code <}{@link TypeOfLine }{@code >}
     *     {@link JAXBElement }{@code <}{@link TypeOfFareStructureElement }{@code >}
     *     {@link JAXBElement }{@code <}{@link TypeOfSalesOfferPackage }{@code >}
     *     {@link JAXBElement }{@code <}{@link TypeOfFareContractEntry }{@code >}
     *     {@link JAXBElement }{@code <}{@link TypeOfTariff }{@code >}
     *     {@link JAXBElement }{@code <}{@link TypeOfFeature }{@code >}
     *     {@link JAXBElement }{@code <}{@link TypeOfDeliveryVariant }{@code >}
     *     {@link JAXBElement }{@code <}{@link TypeOfOperation }{@code >}
     *     {@link JAXBElement }{@code <}{@link TypeOfMobilityService }{@code >}
     *     {@link JAXBElement }{@code <}{@link TypeOfLinkSequence }{@code >}
     *     {@link JAXBElement }{@code <}{@link TypeOfEntityVersionStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link TypeOfEquipment }{@code >}
     *     {@link JAXBElement }{@code <}{@link TypeOfProjection }{@code >}
     *     {@link JAXBElement }{@code <}{@link TypeOfZone }{@code >}
     *     {@link JAXBElement }{@code <}{@link TypeOfJourneyPattern }{@code >}
     *     {@link JAXBElement }{@code <}{@link TypeOfActivation }{@code >}
     *     {@link JAXBElement }{@code <}{@link TypeOfTransfer }{@code >}
     *     {@link JAXBElement }{@code <}{@link TypeOfFacility }{@code >}
     *     {@link JAXBElement }{@code <}{@link TypeOfPoint }{@code >}
     *     {@link JAXBElement }{@code <}{@link TypeOfPlace }{@code >}
     *     {@link JAXBElement }{@code <}{@link TypeOfOrganisationPart }{@code >}
     *     {@link JAXBElement }{@code <}{@link CustomerAccountStatus }{@code >}
     *     {@link JAXBElement }{@code <}{@link TypeOfPlug }{@code >}
     *     {@link JAXBElement }{@code <}{@link TypeOfFrame }{@code >}
     *     {@link JAXBElement }{@code <}{@link TypeOfRollingStockValueStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link TypeOfFareStructureFactor }{@code >}
     *     {@link JAXBElement }{@code <}{@link TypeOfCustomerAccount }{@code >}
     *     {@link JAXBElement }{@code <}{@link TypeOfModeOfOperation }{@code >}
     *     {@link JAXBElement }{@code <}{@link TypeOfResponsibilityRole }{@code >}
     *     {@link JAXBElement }{@code <}{@link TypeOfService }{@code >}
     *     
     */
    public JAXBElement<? extends TypeOfEntityVersionStructure> getTypeOfEntity() {
        return typeOfEntity;
    }

    /**
     * Legt den Wert der typeOfEntity-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link TypeOfOrganisation }{@code >}
     *     {@link JAXBElement }{@code <}{@link TypeOfFareContract }{@code >}
     *     {@link JAXBElement }{@code <}{@link TypeOfFareProduct }{@code >}
     *     {@link JAXBElement }{@code <}{@link TypeOfTravelDocument }{@code >}
     *     {@link JAXBElement }{@code <}{@link TypeOfNotice }{@code >}
     *     {@link JAXBElement }{@code <}{@link TypeOfLink }{@code >}
     *     {@link JAXBElement }{@code <}{@link TypeOfTimeDemandType }{@code >}
     *     {@link JAXBElement }{@code <}{@link TypeOfBatteryChemistry }{@code >}
     *     {@link JAXBElement }{@code <}{@link TypeOfFlexibleService }{@code >}
     *     {@link JAXBElement }{@code <}{@link TypeOfAccessRightAssignment }{@code >}
     *     {@link JAXBElement }{@code <}{@link TypeOfRetailDevice }{@code >}
     *     {@link JAXBElement }{@code <}{@link TypeOfCongestion }{@code >}
     *     {@link JAXBElement }{@code <}{@link TypeOfPassengerInformationEquipment }{@code >}
     *     {@link JAXBElement }{@code <}{@link TypeOfLine }{@code >}
     *     {@link JAXBElement }{@code <}{@link TypeOfFareStructureElement }{@code >}
     *     {@link JAXBElement }{@code <}{@link TypeOfSalesOfferPackage }{@code >}
     *     {@link JAXBElement }{@code <}{@link TypeOfFareContractEntry }{@code >}
     *     {@link JAXBElement }{@code <}{@link TypeOfTariff }{@code >}
     *     {@link JAXBElement }{@code <}{@link TypeOfFeature }{@code >}
     *     {@link JAXBElement }{@code <}{@link TypeOfDeliveryVariant }{@code >}
     *     {@link JAXBElement }{@code <}{@link TypeOfOperation }{@code >}
     *     {@link JAXBElement }{@code <}{@link TypeOfMobilityService }{@code >}
     *     {@link JAXBElement }{@code <}{@link TypeOfLinkSequence }{@code >}
     *     {@link JAXBElement }{@code <}{@link TypeOfEntityVersionStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link TypeOfEquipment }{@code >}
     *     {@link JAXBElement }{@code <}{@link TypeOfProjection }{@code >}
     *     {@link JAXBElement }{@code <}{@link TypeOfZone }{@code >}
     *     {@link JAXBElement }{@code <}{@link TypeOfJourneyPattern }{@code >}
     *     {@link JAXBElement }{@code <}{@link TypeOfActivation }{@code >}
     *     {@link JAXBElement }{@code <}{@link TypeOfTransfer }{@code >}
     *     {@link JAXBElement }{@code <}{@link TypeOfFacility }{@code >}
     *     {@link JAXBElement }{@code <}{@link TypeOfPoint }{@code >}
     *     {@link JAXBElement }{@code <}{@link TypeOfPlace }{@code >}
     *     {@link JAXBElement }{@code <}{@link TypeOfOrganisationPart }{@code >}
     *     {@link JAXBElement }{@code <}{@link CustomerAccountStatus }{@code >}
     *     {@link JAXBElement }{@code <}{@link TypeOfPlug }{@code >}
     *     {@link JAXBElement }{@code <}{@link TypeOfFrame }{@code >}
     *     {@link JAXBElement }{@code <}{@link TypeOfRollingStockValueStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link TypeOfFareStructureFactor }{@code >}
     *     {@link JAXBElement }{@code <}{@link TypeOfCustomerAccount }{@code >}
     *     {@link JAXBElement }{@code <}{@link TypeOfModeOfOperation }{@code >}
     *     {@link JAXBElement }{@code <}{@link TypeOfResponsibilityRole }{@code >}
     *     {@link JAXBElement }{@code <}{@link TypeOfService }{@code >}
     *     
     */
    public void setTypeOfEntity(JAXBElement<? extends TypeOfEntityVersionStructure> value) {
        this.typeOfEntity = value;
    }

}
