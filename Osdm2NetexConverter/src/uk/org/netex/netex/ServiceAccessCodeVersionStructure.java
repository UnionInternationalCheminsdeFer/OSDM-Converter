//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// �nderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2026.05.22 um 10:24:00 AM CEST 
//


package uk.org.netex.netex;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.NormalizedStringAdapter;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * Type for SERVICE ACCESS CODE restricts id.
 * 
 * <p>Java-Klasse f�r ServiceAccessCode_VersionStructure complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="ServiceAccessCode_VersionStructure">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.netex.org.uk/netex}TravelDocument_VersionStructure">
 *       &lt;sequence>
 *         &lt;group ref="{http://www.netex.org.uk/netex}ServiceAccessCodeGroup"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ServiceAccessCode_VersionStructure", propOrder = {
    "accessCode",
    "expiryDate",
    "vehicleAccessCredentialsAssignmentRef"
})
@XmlSeeAlso({
    ServiceAccessCode.class
})
public class ServiceAccessCodeVersionStructure
    extends TravelDocumentVersionStructure
{

    @XmlElement(name = "AccessCode", required = true)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String accessCode;
    @XmlElement(name = "ExpiryDate")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar expiryDate;
    @XmlElement(name = "VehicleAccessCredentialsAssignmentRef")
    protected VehicleAccessCredentialsAssignmentRefStructure vehicleAccessCredentialsAssignmentRef;

    /**
     * Ruft den Wert der accessCode-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccessCode() {
        return accessCode;
    }

    /**
     * Legt den Wert der accessCode-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccessCode(String value) {
        this.accessCode = value;
    }

    /**
     * Ruft den Wert der expiryDate-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getExpiryDate() {
        return expiryDate;
    }

    /**
     * Legt den Wert der expiryDate-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setExpiryDate(XMLGregorianCalendar value) {
        this.expiryDate = value;
    }

    /**
     * Ruft den Wert der vehicleAccessCredentialsAssignmentRef-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link VehicleAccessCredentialsAssignmentRefStructure }
     *     
     */
    public VehicleAccessCredentialsAssignmentRefStructure getVehicleAccessCredentialsAssignmentRef() {
        return vehicleAccessCredentialsAssignmentRef;
    }

    /**
     * Legt den Wert der vehicleAccessCredentialsAssignmentRef-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link VehicleAccessCredentialsAssignmentRefStructure }
     *     
     */
    public void setVehicleAccessCredentialsAssignmentRef(VehicleAccessCredentialsAssignmentRefStructure value) {
        this.vehicleAccessCredentialsAssignmentRef = value;
    }

}
