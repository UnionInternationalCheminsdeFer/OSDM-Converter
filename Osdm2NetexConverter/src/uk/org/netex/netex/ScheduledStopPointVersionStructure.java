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
 * Type for SCHEDULED STOP POINT restricts id.
 * 
 * <p>Java-Klasse f�r ScheduledStopPoint_VersionStructure complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="ScheduledStopPoint_VersionStructure">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.netex.org.uk/netex}TimingPoint_VersionStructure">
 *       &lt;sequence>
 *         &lt;group ref="{http://www.netex.org.uk/netex}ScheduledStopPointGroup"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ScheduledStopPoint_VersionStructure", propOrder = {
    "stopAreas",
    "tariffZones",
    "shortName",
    "nameSuffix",
    "description",
    "label",
    "shortStopCode",
    "publicCode",
    "privateCode",
    "externalStopPointRef",
    "url",
    "stopType",
    "compassBearing",
    "presentation",
    "vehicleModes",
    "forAlighting",
    "forBoarding",
    "requestStop",
    "requestMethodType",
    "boardingRequestMethod",
    "alightingRequestMethod",
    "countryRef",
    "topographicPlaceRef",
    "topographicPlaceView",
    "atCentre"
})
@XmlSeeAlso({
    ScheduledStopPoint.class,
    FareScheduledStopPointVersionStructure.class
})
public class ScheduledStopPointVersionStructure
    extends TimingPointVersionStructure
{

    protected StopAreaRefsRelStructure stopAreas;
    protected TariffZoneRefsRelStructure tariffZones;
    @XmlElement(name = "ShortName")
    protected MultilingualString shortName;
    @XmlElement(name = "NameSuffix")
    protected MultilingualString nameSuffix;
    @XmlElement(name = "Description")
    protected MultilingualString description;
    @XmlElement(name = "Label")
    protected MultilingualString label;
    @XmlElement(name = "ShortStopCode")
    protected PrivateCodeStructure shortStopCode;
    @XmlElement(name = "PublicCode")
    protected PublicCodeStructure publicCode;
    @XmlElement(name = "PrivateCode")
    protected PrivateCodeStructure privateCode;
    @XmlElement(name = "ExternalStopPointRef")
    protected ExternalObjectRefStructure externalStopPointRef;
    @XmlElement(name = "Url")
    @XmlSchemaType(name = "anyURI")
    protected String url;
    @XmlElement(name = "StopType")
    @XmlSchemaType(name = "string")
    protected StopTypeEnumeration stopType;
    @XmlElement(name = "CompassBearing")
    protected Float compassBearing;
    @XmlElement(name = "Presentation")
    protected PresentationStructure presentation;
    @XmlList
    @XmlElement(name = "VehicleModes")
    protected List<AllPublicTransportModesEnumeration> vehicleModes;
    @XmlElement(name = "ForAlighting")
    protected Boolean forAlighting;
    @XmlElement(name = "ForBoarding")
    protected Boolean forBoarding;
    @XmlElement(name = "RequestStop", defaultValue = "false")
    protected Boolean requestStop;
    @XmlElement(name = "RequestMethodType", defaultValue = "noneRequired")
    @XmlSchemaType(name = "NMTOKEN")
    protected RequestMethodTypeEnumeration requestMethodType;
    @XmlList
    @XmlElement(name = "BoardingRequestMethod", defaultValue = "noneRequired")
    protected List<RequestMethodTypeEnumeration> boardingRequestMethod;
    @XmlList
    @XmlElement(name = "AlightingRequestMethod", defaultValue = "noneRequired")
    protected List<RequestMethodTypeEnumeration> alightingRequestMethod;
    @XmlElement(name = "CountryRef")
    protected CountryRef countryRef;
    @XmlElement(name = "TopographicPlaceRef")
    protected TopographicPlaceRefStructure topographicPlaceRef;
    @XmlElement(name = "TopographicPlaceView")
    protected TopographicPlaceView topographicPlaceView;
    @XmlElement(name = "AtCentre", defaultValue = "false")
    protected Boolean atCentre;

    /**
     * Ruft den Wert der stopAreas-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link StopAreaRefsRelStructure }
     *     
     */
    public StopAreaRefsRelStructure getStopAreas() {
        return stopAreas;
    }

    /**
     * Legt den Wert der stopAreas-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link StopAreaRefsRelStructure }
     *     
     */
    public void setStopAreas(StopAreaRefsRelStructure value) {
        this.stopAreas = value;
    }

    /**
     * Ruft den Wert der tariffZones-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link TariffZoneRefsRelStructure }
     *     
     */
    public TariffZoneRefsRelStructure getTariffZones() {
        return tariffZones;
    }

    /**
     * Legt den Wert der tariffZones-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link TariffZoneRefsRelStructure }
     *     
     */
    public void setTariffZones(TariffZoneRefsRelStructure value) {
        this.tariffZones = value;
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
     * Ruft den Wert der nameSuffix-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link MultilingualString }
     *     
     */
    public MultilingualString getNameSuffix() {
        return nameSuffix;
    }

    /**
     * Legt den Wert der nameSuffix-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link MultilingualString }
     *     
     */
    public void setNameSuffix(MultilingualString value) {
        this.nameSuffix = value;
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
     * Ruft den Wert der label-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link MultilingualString }
     *     
     */
    public MultilingualString getLabel() {
        return label;
    }

    /**
     * Legt den Wert der label-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link MultilingualString }
     *     
     */
    public void setLabel(MultilingualString value) {
        this.label = value;
    }

    /**
     * Ruft den Wert der shortStopCode-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link PrivateCodeStructure }
     *     
     */
    public PrivateCodeStructure getShortStopCode() {
        return shortStopCode;
    }

    /**
     * Legt den Wert der shortStopCode-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link PrivateCodeStructure }
     *     
     */
    public void setShortStopCode(PrivateCodeStructure value) {
        this.shortStopCode = value;
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
     * Ruft den Wert der externalStopPointRef-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ExternalObjectRefStructure }
     *     
     */
    public ExternalObjectRefStructure getExternalStopPointRef() {
        return externalStopPointRef;
    }

    /**
     * Legt den Wert der externalStopPointRef-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ExternalObjectRefStructure }
     *     
     */
    public void setExternalStopPointRef(ExternalObjectRefStructure value) {
        this.externalStopPointRef = value;
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
     * Ruft den Wert der stopType-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link StopTypeEnumeration }
     *     
     */
    public StopTypeEnumeration getStopType() {
        return stopType;
    }

    /**
     * Legt den Wert der stopType-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link StopTypeEnumeration }
     *     
     */
    public void setStopType(StopTypeEnumeration value) {
        this.stopType = value;
    }

    /**
     * Ruft den Wert der compassBearing-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getCompassBearing() {
        return compassBearing;
    }

    /**
     * Legt den Wert der compassBearing-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setCompassBearing(Float value) {
        this.compassBearing = value;
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
     * Gets the value of the vehicleModes property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the vehicleModes property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getVehicleModes().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AllPublicTransportModesEnumeration }
     * 
     * 
     */
    public List<AllPublicTransportModesEnumeration> getVehicleModes() {
        if (vehicleModes == null) {
            vehicleModes = new ArrayList<AllPublicTransportModesEnumeration>();
        }
        return this.vehicleModes;
    }

    /**
     * Ruft den Wert der forAlighting-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isForAlighting() {
        return forAlighting;
    }

    /**
     * Legt den Wert der forAlighting-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setForAlighting(Boolean value) {
        this.forAlighting = value;
    }

    /**
     * Ruft den Wert der forBoarding-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isForBoarding() {
        return forBoarding;
    }

    /**
     * Legt den Wert der forBoarding-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setForBoarding(Boolean value) {
        this.forBoarding = value;
    }

    /**
     * Ruft den Wert der requestStop-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isRequestStop() {
        return requestStop;
    }

    /**
     * Legt den Wert der requestStop-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setRequestStop(Boolean value) {
        this.requestStop = value;
    }

    /**
     * Ruft den Wert der requestMethodType-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link RequestMethodTypeEnumeration }
     *     
     */
    public RequestMethodTypeEnumeration getRequestMethodType() {
        return requestMethodType;
    }

    /**
     * Legt den Wert der requestMethodType-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link RequestMethodTypeEnumeration }
     *     
     */
    public void setRequestMethodType(RequestMethodTypeEnumeration value) {
        this.requestMethodType = value;
    }

    /**
     * Gets the value of the boardingRequestMethod property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the boardingRequestMethod property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBoardingRequestMethod().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RequestMethodTypeEnumeration }
     * 
     * 
     */
    public List<RequestMethodTypeEnumeration> getBoardingRequestMethod() {
        if (boardingRequestMethod == null) {
            boardingRequestMethod = new ArrayList<RequestMethodTypeEnumeration>();
        }
        return this.boardingRequestMethod;
    }

    /**
     * Gets the value of the alightingRequestMethod property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the alightingRequestMethod property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAlightingRequestMethod().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RequestMethodTypeEnumeration }
     * 
     * 
     */
    public List<RequestMethodTypeEnumeration> getAlightingRequestMethod() {
        if (alightingRequestMethod == null) {
            alightingRequestMethod = new ArrayList<RequestMethodTypeEnumeration>();
        }
        return this.alightingRequestMethod;
    }

    /**
     * Ruft den Wert der countryRef-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link CountryRef }
     *     
     */
    public CountryRef getCountryRef() {
        return countryRef;
    }

    /**
     * Legt den Wert der countryRef-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link CountryRef }
     *     
     */
    public void setCountryRef(CountryRef value) {
        this.countryRef = value;
    }

    /**
     * Ruft den Wert der topographicPlaceRef-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link TopographicPlaceRefStructure }
     *     
     */
    public TopographicPlaceRefStructure getTopographicPlaceRef() {
        return topographicPlaceRef;
    }

    /**
     * Legt den Wert der topographicPlaceRef-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link TopographicPlaceRefStructure }
     *     
     */
    public void setTopographicPlaceRef(TopographicPlaceRefStructure value) {
        this.topographicPlaceRef = value;
    }

    /**
     * Ruft den Wert der topographicPlaceView-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link TopographicPlaceView }
     *     
     */
    public TopographicPlaceView getTopographicPlaceView() {
        return topographicPlaceView;
    }

    /**
     * Legt den Wert der topographicPlaceView-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link TopographicPlaceView }
     *     
     */
    public void setTopographicPlaceView(TopographicPlaceView value) {
        this.topographicPlaceView = value;
    }

    /**
     * Ruft den Wert der atCentre-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAtCentre() {
        return atCentre;
    }

    /**
     * Legt den Wert der atCentre-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAtCentre(Boolean value) {
        this.atCentre = value;
    }

}
