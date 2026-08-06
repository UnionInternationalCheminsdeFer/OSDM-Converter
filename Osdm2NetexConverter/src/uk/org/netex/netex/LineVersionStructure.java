//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// �nderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2026.05.22 um 10:24:00 AM CEST 
//


package uk.org.netex.netex;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlList;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Type for a LINE.
 * 
 * <p>Java-Klasse f�r Line_VersionStructure complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="Line_VersionStructure">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.netex.org.uk/netex}DataManagedObjectStructure">
 *       &lt;sequence>
 *         &lt;group ref="{http://www.netex.org.uk/netex}LineGroup"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Line_VersionStructure", propOrder = {
    "name",
    "shortName",
    "description",
    "transportMode",
    "transportSubmode",
    "url",
    "publicCode",
    "privateCode",
    "externalLineRef",
    "authorityRef",
    "operatorRef",
    "additionalOperators",
    "otherModes",
    "operationalContextRef",
    "lineType",
    "typeOfLineRef",
    "externalProductCategoryRef",
    "typeOfProductCategoryRef",
    "typeOfServiceRef",
    "accessModes",
    "restrictedLine",
    "userTypes",
    "monitored",
    "routes",
    "representedByGroupRef",
    "presentation",
    "alternativePresentation",
    "printedPresentation",
    "paymentMethods",
    "typesOfPaymentMethod",
    "purchaseMoment",
    "contactDetails",
    "accessibilityAssessment",
    "allowedDirections",
    "facilities",
    "noticeAssignments",
    "documentLinks",
    "bookingArrangements"
})
@XmlSeeAlso({
    Line.class,
    FlexibleLineVersionStructure.class
})
public class LineVersionStructure
    extends DataManagedObjectStructure
{

    @XmlElement(name = "Name", required = true)
    protected MultilingualString name;
    @XmlElement(name = "ShortName")
    protected MultilingualString shortName;
    @XmlElement(name = "Description")
    protected MultilingualString description;
    @XmlElement(name = "TransportMode")
    @XmlSchemaType(name = "NMTOKEN")
    protected AllPublicTransportModesEnumeration transportMode;
    @XmlElement(name = "TransportSubmode")
    protected TransportSubmodeStructure transportSubmode;
    @XmlElement(name = "Url")
    @XmlSchemaType(name = "anyURI")
    protected String url;
    @XmlElement(name = "PublicCode")
    protected PublicCodeStructure publicCode;
    @XmlElement(name = "PrivateCode")
    protected PrivateCodeStructure privateCode;
    @XmlElement(name = "ExternalLineRef")
    protected ExternalObjectRefStructure externalLineRef;
    @XmlElement(name = "AuthorityRef")
    protected AuthorityRef authorityRef;
    @XmlElement(name = "OperatorRef")
    protected OperatorRefStructure operatorRef;
    protected TransportOrganisationRefsRelStructure additionalOperators;
    protected ModeRefsRelStructure otherModes;
    @XmlElement(name = "OperationalContextRef")
    protected OperationalContextRefStructure operationalContextRef;
    @XmlElement(name = "LineType")
    @XmlSchemaType(name = "string")
    protected LineTypeEnumeration lineType;
    @XmlElement(name = "TypeOfLineRef")
    protected TypeOfLineRefStructure typeOfLineRef;
    @XmlElement(name = "ExternalProductCategoryRef")
    protected ExternalObjectRefStructure externalProductCategoryRef;
    @XmlElement(name = "TypeOfProductCategoryRef")
    protected TypeOfProductCategoryRefStructure typeOfProductCategoryRef;
    @XmlElement(name = "TypeOfServiceRef")
    protected TypeOfServiceRefStructure typeOfServiceRef;
    @XmlList
    @XmlElement(name = "AccessModes")
    protected List<AccessModeEnumeration> accessModes;
    @XmlElement(name = "RestrictedLine", defaultValue = "false")
    protected Boolean restrictedLine;
    @XmlList
    @XmlElement(name = "UserTypes")
    protected List<UserTypeEnumeration> userTypes;
    @XmlElement(name = "Monitored")
    protected Boolean monitored;
    protected RouteRefsRelStructure routes;
    @XmlElement(name = "RepresentedByGroupRef")
    protected GroupOfLinesRefStructure representedByGroupRef;
    @XmlElement(name = "Presentation")
    protected PresentationStructure presentation;
    @XmlElement(name = "AlternativePresentation")
    protected PresentationStructure alternativePresentation;
    @XmlElement(name = "PrintedPresentation")
    protected PrintPresentationStructure printedPresentation;
    @XmlList
    @XmlElement(name = "PaymentMethods")
    protected List<PaymentMethodEnumeration> paymentMethods;
    protected TypeOfPaymentMethodValueStructure typesOfPaymentMethod;
    @XmlList
    @XmlElement(name = "PurchaseMoment")
    protected List<PurchaseMomentEnumeration> purchaseMoment;
    @XmlElement(name = "ContactDetails")
    protected ContactStructure contactDetails;
    @XmlElement(name = "AccessibilityAssessment")
    protected AccessibilityAssessment accessibilityAssessment;
    protected AllowedLineDirectionsRelStructure allowedDirections;
    protected ServiceFacilitySetsRelStructure facilities;
    protected NoticeAssignmentsRelStructure noticeAssignments;
    protected InfoLinksRelStructure documentLinks;
    protected BookingArrangementsRelStructure bookingArrangements;

    /**
     * Ruft den Wert der name-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link MultilingualString }
     *     
     */
    public MultilingualString getName() {
        return name;
    }

    /**
     * Legt den Wert der name-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link MultilingualString }
     *     
     */
    public void setName(MultilingualString value) {
        this.name = value;
    }

    /**
     * Ruft den Wert der shortName-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link MultilingualString }
     *     
     */
    public MultilingualString getShortName() {
        return shortName;
    }

    /**
     * Legt den Wert der shortName-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link MultilingualString }
     *     
     */
    public void setShortName(MultilingualString value) {
        this.shortName = value;
    }

    /**
     * Ruft den Wert der description-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link MultilingualString }
     *     
     */
    public MultilingualString getDescription() {
        return description;
    }

    /**
     * Legt den Wert der description-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link MultilingualString }
     *     
     */
    public void setDescription(MultilingualString value) {
        this.description = value;
    }

    /**
     * Ruft den Wert der transportMode-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link AllPublicTransportModesEnumeration }
     *     
     */
    public AllPublicTransportModesEnumeration getTransportMode() {
        return transportMode;
    }

    /**
     * Legt den Wert der transportMode-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link AllPublicTransportModesEnumeration }
     *     
     */
    public void setTransportMode(AllPublicTransportModesEnumeration value) {
        this.transportMode = value;
    }

    /**
     * Ruft den Wert der transportSubmode-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link TransportSubmodeStructure }
     *     
     */
    public TransportSubmodeStructure getTransportSubmode() {
        return transportSubmode;
    }

    /**
     * Legt den Wert der transportSubmode-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link TransportSubmodeStructure }
     *     
     */
    public void setTransportSubmode(TransportSubmodeStructure value) {
        this.transportSubmode = value;
    }

    /**
     * Ruft den Wert der url-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUrl() {
        return url;
    }

    /**
     * Legt den Wert der url-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUrl(String value) {
        this.url = value;
    }

    /**
     * Ruft den Wert der publicCode-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link PublicCodeStructure }
     *     
     */
    public PublicCodeStructure getPublicCode() {
        return publicCode;
    }

    /**
     * Legt den Wert der publicCode-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link PublicCodeStructure }
     *     
     */
    public void setPublicCode(PublicCodeStructure value) {
        this.publicCode = value;
    }

    /**
     * DEPRECATED - use privateCodes. -v2.0
     * 
     * @return
     *     possible object is
     *     {@link PrivateCodeStructure }
     *     
     */
    public PrivateCodeStructure getPrivateCode() {
        return privateCode;
    }

    /**
     * Legt den Wert der privateCode-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link PrivateCodeStructure }
     *     
     */
    public void setPrivateCode(PrivateCodeStructure value) {
        this.privateCode = value;
    }

    /**
     * Ruft den Wert der externalLineRef-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ExternalObjectRefStructure }
     *     
     */
    public ExternalObjectRefStructure getExternalLineRef() {
        return externalLineRef;
    }

    /**
     * Legt den Wert der externalLineRef-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ExternalObjectRefStructure }
     *     
     */
    public void setExternalLineRef(ExternalObjectRefStructure value) {
        this.externalLineRef = value;
    }

    /**
     * A line should always have an AUTHORITY, even when the information is provided in a ResponsibilitySet.
     * 
     * @return
     *     possible object is
     *     {@link AuthorityRef }
     *     
     */
    public AuthorityRef getAuthorityRef() {
        return authorityRef;
    }

    /**
     * Legt den Wert der authorityRef-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link AuthorityRef }
     *     
     */
    public void setAuthorityRef(AuthorityRef value) {
        this.authorityRef = value;
    }

    /**
     * An OPERATOR should be set, even when the same as the AUTHORITY. In some cases OPERATOR or AUTHORITY are managed through a ResponsibilitySet. However, for compatibility OperatorRef and AuthorityRef still should be filled in. +v2.0
     * 
     * @return
     *     possible object is
     *     {@link OperatorRefStructure }
     *     
     */
    public OperatorRefStructure getOperatorRef() {
        return operatorRef;
    }

    /**
     * Legt den Wert der operatorRef-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link OperatorRefStructure }
     *     
     */
    public void setOperatorRef(OperatorRefStructure value) {
        this.operatorRef = value;
    }

    /**
     * Ruft den Wert der additionalOperators-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link TransportOrganisationRefsRelStructure }
     *     
     */
    public TransportOrganisationRefsRelStructure getAdditionalOperators() {
        return additionalOperators;
    }

    /**
     * Legt den Wert der additionalOperators-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link TransportOrganisationRefsRelStructure }
     *     
     */
    public void setAdditionalOperators(TransportOrganisationRefsRelStructure value) {
        this.additionalOperators = value;
    }

    /**
     * Ruft den Wert der otherModes-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ModeRefsRelStructure }
     *     
     */
    public ModeRefsRelStructure getOtherModes() {
        return otherModes;
    }

    /**
     * Legt den Wert der otherModes-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ModeRefsRelStructure }
     *     
     */
    public void setOtherModes(ModeRefsRelStructure value) {
        this.otherModes = value;
    }

    /**
     * Ruft den Wert der operationalContextRef-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link OperationalContextRefStructure }
     *     
     */
    public OperationalContextRefStructure getOperationalContextRef() {
        return operationalContextRef;
    }

    /**
     * Legt den Wert der operationalContextRef-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link OperationalContextRefStructure }
     *     
     */
    public void setOperationalContextRef(OperationalContextRefStructure value) {
        this.operationalContextRef = value;
    }

    /**
     * Ruft den Wert der lineType-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link LineTypeEnumeration }
     *     
     */
    public LineTypeEnumeration getLineType() {
        return lineType;
    }

    /**
     * Legt den Wert der lineType-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link LineTypeEnumeration }
     *     
     */
    public void setLineType(LineTypeEnumeration value) {
        this.lineType = value;
    }

    /**
     * Ruft den Wert der typeOfLineRef-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link TypeOfLineRefStructure }
     *     
     */
    public TypeOfLineRefStructure getTypeOfLineRef() {
        return typeOfLineRef;
    }

    /**
     * Legt den Wert der typeOfLineRef-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeOfLineRefStructure }
     *     
     */
    public void setTypeOfLineRef(TypeOfLineRefStructure value) {
        this.typeOfLineRef = value;
    }

    /**
     * Ruft den Wert der externalProductCategoryRef-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ExternalObjectRefStructure }
     *     
     */
    public ExternalObjectRefStructure getExternalProductCategoryRef() {
        return externalProductCategoryRef;
    }

    /**
     * Legt den Wert der externalProductCategoryRef-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ExternalObjectRefStructure }
     *     
     */
    public void setExternalProductCategoryRef(ExternalObjectRefStructure value) {
        this.externalProductCategoryRef = value;
    }

    /**
     * Ruft den Wert der typeOfProductCategoryRef-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link TypeOfProductCategoryRefStructure }
     *     
     */
    public TypeOfProductCategoryRefStructure getTypeOfProductCategoryRef() {
        return typeOfProductCategoryRef;
    }

    /**
     * Legt den Wert der typeOfProductCategoryRef-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeOfProductCategoryRefStructure }
     *     
     */
    public void setTypeOfProductCategoryRef(TypeOfProductCategoryRefStructure value) {
        this.typeOfProductCategoryRef = value;
    }

    /**
     * Ruft den Wert der typeOfServiceRef-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link TypeOfServiceRefStructure }
     *     
     */
    public TypeOfServiceRefStructure getTypeOfServiceRef() {
        return typeOfServiceRef;
    }

    /**
     * Legt den Wert der typeOfServiceRef-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeOfServiceRefStructure }
     *     
     */
    public void setTypeOfServiceRef(TypeOfServiceRefStructure value) {
        this.typeOfServiceRef = value;
    }

    /**
     * Gets the value of the accessModes property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the accessModes property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAccessModes().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AccessModeEnumeration }
     * 
     * 
     */
    public List<AccessModeEnumeration> getAccessModes() {
        if (accessModes == null) {
            accessModes = new ArrayList<AccessModeEnumeration>();
        }
        return this.accessModes;
    }

    /**
     * Ruft den Wert der restrictedLine-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isRestrictedLine() {
        return restrictedLine;
    }

    /**
     * Legt den Wert der restrictedLine-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setRestrictedLine(Boolean value) {
        this.restrictedLine = value;
    }

    /**
     * Gets the value of the userTypes property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the userTypes property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getUserTypes().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link UserTypeEnumeration }
     * 
     * 
     */
    public List<UserTypeEnumeration> getUserTypes() {
        if (userTypes == null) {
            userTypes = new ArrayList<UserTypeEnumeration>();
        }
        return this.userTypes;
    }

    /**
     * Ruft den Wert der monitored-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMonitored() {
        return monitored;
    }

    /**
     * Legt den Wert der monitored-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMonitored(Boolean value) {
        this.monitored = value;
    }

    /**
     * Ruft den Wert der routes-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link RouteRefsRelStructure }
     *     
     */
    public RouteRefsRelStructure getRoutes() {
        return routes;
    }

    /**
     * Legt den Wert der routes-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link RouteRefsRelStructure }
     *     
     */
    public void setRoutes(RouteRefsRelStructure value) {
        this.routes = value;
    }

    /**
     * Ruft den Wert der representedByGroupRef-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link GroupOfLinesRefStructure }
     *     
     */
    public GroupOfLinesRefStructure getRepresentedByGroupRef() {
        return representedByGroupRef;
    }

    /**
     * Legt den Wert der representedByGroupRef-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link GroupOfLinesRefStructure }
     *     
     */
    public void setRepresentedByGroupRef(GroupOfLinesRefStructure value) {
        this.representedByGroupRef = value;
    }

    /**
     * Ruft den Wert der presentation-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link PresentationStructure }
     *     
     */
    public PresentationStructure getPresentation() {
        return presentation;
    }

    /**
     * Legt den Wert der presentation-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link PresentationStructure }
     *     
     */
    public void setPresentation(PresentationStructure value) {
        this.presentation = value;
    }

    /**
     * Ruft den Wert der alternativePresentation-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link PresentationStructure }
     *     
     */
    public PresentationStructure getAlternativePresentation() {
        return alternativePresentation;
    }

    /**
     * Legt den Wert der alternativePresentation-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link PresentationStructure }
     *     
     */
    public void setAlternativePresentation(PresentationStructure value) {
        this.alternativePresentation = value;
    }

    /**
     * Ruft den Wert der printedPresentation-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link PrintPresentationStructure }
     *     
     */
    public PrintPresentationStructure getPrintedPresentation() {
        return printedPresentation;
    }

    /**
     * Legt den Wert der printedPresentation-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link PrintPresentationStructure }
     *     
     */
    public void setPrintedPresentation(PrintPresentationStructure value) {
        this.printedPresentation = value;
    }

    /**
     * Gets the value of the paymentMethods property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the paymentMethods property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPaymentMethods().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PaymentMethodEnumeration }
     * 
     * 
     */
    public List<PaymentMethodEnumeration> getPaymentMethods() {
        if (paymentMethods == null) {
            paymentMethods = new ArrayList<PaymentMethodEnumeration>();
        }
        return this.paymentMethods;
    }

    /**
     * Ruft den Wert der typesOfPaymentMethod-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link TypeOfPaymentMethodValueStructure }
     *     
     */
    public TypeOfPaymentMethodValueStructure getTypesOfPaymentMethod() {
        return typesOfPaymentMethod;
    }

    /**
     * Legt den Wert der typesOfPaymentMethod-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeOfPaymentMethodValueStructure }
     *     
     */
    public void setTypesOfPaymentMethod(TypeOfPaymentMethodValueStructure value) {
        this.typesOfPaymentMethod = value;
    }

    /**
     * Gets the value of the purchaseMoment property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the purchaseMoment property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPurchaseMoment().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PurchaseMomentEnumeration }
     * 
     * 
     */
    public List<PurchaseMomentEnumeration> getPurchaseMoment() {
        if (purchaseMoment == null) {
            purchaseMoment = new ArrayList<PurchaseMomentEnumeration>();
        }
        return this.purchaseMoment;
    }

    /**
     * Ruft den Wert der contactDetails-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ContactStructure }
     *     
     */
    public ContactStructure getContactDetails() {
        return contactDetails;
    }

    /**
     * Legt den Wert der contactDetails-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ContactStructure }
     *     
     */
    public void setContactDetails(ContactStructure value) {
        this.contactDetails = value;
    }

    /**
     * Ruft den Wert der accessibilityAssessment-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link AccessibilityAssessment }
     *     
     */
    public AccessibilityAssessment getAccessibilityAssessment() {
        return accessibilityAssessment;
    }

    /**
     * Legt den Wert der accessibilityAssessment-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link AccessibilityAssessment }
     *     
     */
    public void setAccessibilityAssessment(AccessibilityAssessment value) {
        this.accessibilityAssessment = value;
    }

    /**
     * Ruft den Wert der allowedDirections-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link AllowedLineDirectionsRelStructure }
     *     
     */
    public AllowedLineDirectionsRelStructure getAllowedDirections() {
        return allowedDirections;
    }

    /**
     * Legt den Wert der allowedDirections-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link AllowedLineDirectionsRelStructure }
     *     
     */
    public void setAllowedDirections(AllowedLineDirectionsRelStructure value) {
        this.allowedDirections = value;
    }

    /**
     * Ruft den Wert der facilities-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ServiceFacilitySetsRelStructure }
     *     
     */
    public ServiceFacilitySetsRelStructure getFacilities() {
        return facilities;
    }

    /**
     * Legt den Wert der facilities-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ServiceFacilitySetsRelStructure }
     *     
     */
    public void setFacilities(ServiceFacilitySetsRelStructure value) {
        this.facilities = value;
    }

    /**
     * Ruft den Wert der noticeAssignments-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link NoticeAssignmentsRelStructure }
     *     
     */
    public NoticeAssignmentsRelStructure getNoticeAssignments() {
        return noticeAssignments;
    }

    /**
     * Legt den Wert der noticeAssignments-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link NoticeAssignmentsRelStructure }
     *     
     */
    public void setNoticeAssignments(NoticeAssignmentsRelStructure value) {
        this.noticeAssignments = value;
    }

    /**
     * Ruft den Wert der documentLinks-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link InfoLinksRelStructure }
     *     
     */
    public InfoLinksRelStructure getDocumentLinks() {
        return documentLinks;
    }

    /**
     * Legt den Wert der documentLinks-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link InfoLinksRelStructure }
     *     
     */
    public void setDocumentLinks(InfoLinksRelStructure value) {
        this.documentLinks = value;
    }

    /**
     * Ruft den Wert der bookingArrangements-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BookingArrangementsRelStructure }
     *     
     */
    public BookingArrangementsRelStructure getBookingArrangements() {
        return bookingArrangements;
    }

    /**
     * Legt den Wert der bookingArrangements-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BookingArrangementsRelStructure }
     *     
     */
    public void setBookingArrangements(BookingArrangementsRelStructure value) {
        this.bookingArrangements = value;
    }

}
