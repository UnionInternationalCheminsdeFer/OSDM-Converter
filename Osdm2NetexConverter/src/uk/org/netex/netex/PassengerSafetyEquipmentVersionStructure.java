//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// �nderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2026.05.22 um 10:24:00 AM CEST 
//


package uk.org.netex.netex;

import java.math.BigDecimal;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Type for a PASSENGER SAFETY EQUIPMENT.
 * 
 * <p>Java-Klasse f�r PassengerSafetyEquipment_VersionStructure complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="PassengerSafetyEquipment_VersionStructure">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.netex.org.uk/netex}PassengerEquipment_VersionStructure">
 *       &lt;sequence>
 *         &lt;group ref="{http://www.netex.org.uk/netex}PassengerSafetyEquipmentGroup"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PassengerSafetyEquipment_VersionStructure", propOrder = {
    "cctv",
    "mobilePhoneCoverage",
    "panicButton",
    "sosPanel",
    "heightOfSosPanel",
    "lighting",
    "audioAnnouncements",
    "acousticAnnouncements",
    "audioAnnouncementType",
    "audioAnnouncementsTrigger"
})
@XmlSeeAlso({
    PassengerSafetyEquipment.class
})
public class PassengerSafetyEquipmentVersionStructure
    extends PassengerEquipmentVersionStructure
{

    @XmlElement(name = "Cctv")
    protected Boolean cctv;
    @XmlElement(name = "MobilePhoneCoverage")
    protected Boolean mobilePhoneCoverage;
    @XmlElement(name = "PanicButton")
    protected Boolean panicButton;
    @XmlElement(name = "SosPanel")
    protected Boolean sosPanel;
    @XmlElement(name = "HeightOfSosPanel")
    protected BigDecimal heightOfSosPanel;
    @XmlElement(name = "Lighting")
    @XmlSchemaType(name = "normalizedString")
    protected LightingEnumeration lighting;
    @XmlElement(name = "AudioAnnouncements")
    protected Boolean audioAnnouncements;
    @XmlElement(name = "AcousticAnnouncements")
    protected Boolean acousticAnnouncements;
    @XmlElement(name = "AudioAnnouncementType")
    @XmlSchemaType(name = "NMTOKEN")
    protected AudioAnnouncementTypeEnumeration audioAnnouncementType;
    @XmlElement(name = "AudioAnnouncementsTrigger")
    @XmlSchemaType(name = "NMTOKEN")
    protected AudioTriggerMethodEnumeration audioAnnouncementsTrigger;

    /**
     * Ruft den Wert der cctv-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCctv() {
        return cctv;
    }

    /**
     * Legt den Wert der cctv-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCctv(Boolean value) {
        this.cctv = value;
    }

    /**
     * Ruft den Wert der mobilePhoneCoverage-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMobilePhoneCoverage() {
        return mobilePhoneCoverage;
    }

    /**
     * Legt den Wert der mobilePhoneCoverage-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMobilePhoneCoverage(Boolean value) {
        this.mobilePhoneCoverage = value;
    }

    /**
     * Ruft den Wert der panicButton-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPanicButton() {
        return panicButton;
    }

    /**
     * Legt den Wert der panicButton-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPanicButton(Boolean value) {
        this.panicButton = value;
    }

    /**
     * Ruft den Wert der sosPanel-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSosPanel() {
        return sosPanel;
    }

    /**
     * Legt den Wert der sosPanel-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSosPanel(Boolean value) {
        this.sosPanel = value;
    }

    /**
     * Ruft den Wert der heightOfSosPanel-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getHeightOfSosPanel() {
        return heightOfSosPanel;
    }

    /**
     * Legt den Wert der heightOfSosPanel-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setHeightOfSosPanel(BigDecimal value) {
        this.heightOfSosPanel = value;
    }

    /**
     * Ruft den Wert der lighting-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link LightingEnumeration }
     *     
     */
    public LightingEnumeration getLighting() {
        return lighting;
    }

    /**
     * Legt den Wert der lighting-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link LightingEnumeration }
     *     
     */
    public void setLighting(LightingEnumeration value) {
        this.lighting = value;
    }

    /**
     * Ruft den Wert der audioAnnouncements-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAudioAnnouncements() {
        return audioAnnouncements;
    }

    /**
     * Legt den Wert der audioAnnouncements-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAudioAnnouncements(Boolean value) {
        this.audioAnnouncements = value;
    }

    /**
     * Ruft den Wert der acousticAnnouncements-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAcousticAnnouncements() {
        return acousticAnnouncements;
    }

    /**
     * Legt den Wert der acousticAnnouncements-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAcousticAnnouncements(Boolean value) {
        this.acousticAnnouncements = value;
    }

    /**
     * Ruft den Wert der audioAnnouncementType-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link AudioAnnouncementTypeEnumeration }
     *     
     */
    public AudioAnnouncementTypeEnumeration getAudioAnnouncementType() {
        return audioAnnouncementType;
    }

    /**
     * Legt den Wert der audioAnnouncementType-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link AudioAnnouncementTypeEnumeration }
     *     
     */
    public void setAudioAnnouncementType(AudioAnnouncementTypeEnumeration value) {
        this.audioAnnouncementType = value;
    }

    /**
     * Ruft den Wert der audioAnnouncementsTrigger-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link AudioTriggerMethodEnumeration }
     *     
     */
    public AudioTriggerMethodEnumeration getAudioAnnouncementsTrigger() {
        return audioAnnouncementsTrigger;
    }

    /**
     * Legt den Wert der audioAnnouncementsTrigger-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link AudioTriggerMethodEnumeration }
     *     
     */
    public void setAudioAnnouncementsTrigger(AudioTriggerMethodEnumeration value) {
        this.audioAnnouncementsTrigger = value;
    }

}
