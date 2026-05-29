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
 * Type for a BOARDING POSITION.
 * 
 * <p>Java-Klasse f�r BoardingPosition_VersionStructure complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="BoardingPosition_VersionStructure">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.netex.org.uk/netex}StopPlaceSpace_VersionStructure">
 *       &lt;sequence>
 *         &lt;group ref="{http://www.netex.org.uk/netex}BoardingPositionGroup"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BoardingPosition_VersionStructure", propOrder = {
    "publicCode",
    "boardingPositionType",
    "boardingPositionEntrances",
    "platformHeight",
    "edgeToTrackCenterDistance"
})
@XmlSeeAlso({
    BoardingPosition.class
})
public class BoardingPositionVersionStructure
    extends StopPlaceSpaceVersionStructure
{

    @XmlElement(name = "PublicCode")
    protected PublicCodeStructure publicCode;
    @XmlElement(name = "BoardingPositionType")
    @XmlSchemaType(name = "string")
    protected BoardingPositionTypeEnumeration boardingPositionType;
    protected EntranceRefsRelStructure boardingPositionEntrances;
    @XmlElement(name = "PlatformHeight")
    protected BigDecimal platformHeight;
    @XmlElement(name = "EdgeToTrackCenterDistance")
    protected BigDecimal edgeToTrackCenterDistance;

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
     * Ruft den Wert der boardingPositionType-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BoardingPositionTypeEnumeration }
     *     
     */
    public BoardingPositionTypeEnumeration getBoardingPositionType() {
        return boardingPositionType;
    }

    /**
     * Legt den Wert der boardingPositionType-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BoardingPositionTypeEnumeration }
     *     
     */
    public void setBoardingPositionType(BoardingPositionTypeEnumeration value) {
        this.boardingPositionType = value;
    }

    /**
     * Ruft den Wert der boardingPositionEntrances-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link EntranceRefsRelStructure }
     *     
     */
    public EntranceRefsRelStructure getBoardingPositionEntrances() {
        return boardingPositionEntrances;
    }

    /**
     * Legt den Wert der boardingPositionEntrances-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link EntranceRefsRelStructure }
     *     
     */
    public void setBoardingPositionEntrances(EntranceRefsRelStructure value) {
        this.boardingPositionEntrances = value;
    }

    /**
     * Ruft den Wert der platformHeight-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPlatformHeight() {
        return platformHeight;
    }

    /**
     * Legt den Wert der platformHeight-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPlatformHeight(BigDecimal value) {
        this.platformHeight = value;
    }

    /**
     * Ruft den Wert der edgeToTrackCenterDistance-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getEdgeToTrackCenterDistance() {
        return edgeToTrackCenterDistance;
    }

    /**
     * Legt den Wert der edgeToTrackCenterDistance-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setEdgeToTrackCenterDistance(BigDecimal value) {
        this.edgeToTrackCenterDistance = value;
    }

}
