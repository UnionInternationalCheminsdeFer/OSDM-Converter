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
 * Type for a LOCAL SERVICE.
 * 
 * <p>Java-Klasse f�r LocalService_VersionStructure complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="LocalService_VersionStructure">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.netex.org.uk/netex}Equipment_VersionStructure">
 *       &lt;sequence>
 *         &lt;group ref="{http://www.netex.org.uk/netex}LocalServiceGroup"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LocalService_VersionStructure", propOrder = {
    "typesOfServiceFeature"
})
@XmlSeeAlso({
    LuggageServiceVersionStructure.class,
    TicketingServiceVersionStructure.class,
    AssistanceServiceVersionStructure.class,
    HireServiceVersionStructure.class,
    CommunicationServiceVersionStructure.class,
    RetailServiceVersionStructure.class,
    AssistanceBookingServiceVersionStructure.class,
    CateringServiceVersionStructure.class,
    MoneyServiceVersionStructure.class,
    CustomerServiceVersionStructure.class
})
public abstract class LocalServiceVersionStructure
    extends EquipmentVersionStructure
{

    protected TypeOfServiceFeatureRefsRelStructure typesOfServiceFeature;

    /**
     * Ruft den Wert der typesOfServiceFeature-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link TypeOfServiceFeatureRefsRelStructure }
     *     
     */
    public TypeOfServiceFeatureRefsRelStructure getTypesOfServiceFeature() {
        return typesOfServiceFeature;
    }

    /**
     * Legt den Wert der typesOfServiceFeature-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeOfServiceFeatureRefsRelStructure }
     *     
     */
    public void setTypesOfServiceFeature(TypeOfServiceFeatureRefsRelStructure value) {
        this.typesOfServiceFeature = value;
    }

}
