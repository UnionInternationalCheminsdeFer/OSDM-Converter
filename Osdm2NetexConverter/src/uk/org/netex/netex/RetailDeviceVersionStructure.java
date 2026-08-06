//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// �nderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2026.05.22 um 10:24:00 AM CEST 
//


package uk.org.netex.netex;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElementRef;
import jakarta.xml.bind.annotation.XmlElementRefs;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Type for RETAIL DEVICE.
 * 
 * <p>Java-Klasse f�r RetailDevice_VersionStructure complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="RetailDevice_VersionStructure">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.netex.org.uk/netex}InstalledEquipment_VersionStructure">
 *       &lt;sequence>
 *         &lt;group ref="{http://www.netex.org.uk/netex}RetailDeviceGroup"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RetailDevice_VersionStructure", propOrder = {
    "rest"
})
@XmlSeeAlso({
    RetailDevice.class
})
public class RetailDeviceVersionStructure
    extends InstalledEquipmentVersionStructure
{

    @XmlElementRefs({
        @XmlElementRef(name = "OrganisationRef_Dummy", namespace = "http://www.netex.org.uk/netex", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "TypeOfRetailDeviceRef", namespace = "http://www.netex.org.uk/netex", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "Status", namespace = "http://www.netex.org.uk/netex", type = JAXBElement.class, required = false)
    })
    protected List<JAXBElement<?>> rest;

    /**
     * Ruft das restliche Contentmodell ab. 
     * 
     * <p>
     * Sie rufen diese "catch-all"-Eigenschaft aus folgendem Grund ab: 
     * Der Feldname "Status" wird von zwei verschiedenen Teilen eines Schemas verwendet. Siehe: 
     * Zeile 267 von file:/D:/eclipse-wsp3/NeTex/schema/xsd/netex_part_3/part3_salesTransactions/netex_retailConsortium_version.xsd
     * Zeile 192 von file:/D:/eclipse-wsp3/NeTex/schema/xsd/netex_framework/netex_responsibility/netex_version_support.xsd
     * <p>
     * Um diese Eigenschaft zu entfernen, wenden Sie eine Eigenschaftenanpassung f�r eine
     * der beiden folgenden Deklarationen an, um deren Namen zu �ndern: 
     * Gets the value of the rest property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the rest property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRest().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JAXBElement }{@code <}{@link TravelAgentRefStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link AuthorityRef }{@code >}
     * {@link JAXBElement }{@code <}{@link OnlineServiceOperatorRefStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link TypeOfRetailDeviceRefStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link ManagementAgentRefStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link RetailConsortiumRefStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link TransportOrganisationRefStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link ServicedOrganisationRefStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link OrganisationRefStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link OrganisationRefStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link OperatorRefStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link OtherOrganisationRefStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link GeneralOrganisationRefStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * 
     */
    public List<JAXBElement<?>> getRest() {
        if (rest == null) {
            rest = new ArrayList<JAXBElement<?>>();
        }
        return this.rest;
    }

}
