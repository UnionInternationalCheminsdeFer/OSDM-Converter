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
import jakarta.xml.bind.annotation.XmlType;


/**
 * Type for a list of SERVICE ACCESS CODEs.
 * 
 * <p>Java-Klasse f�r serviceAccessCodeRefs_RelStructure complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="serviceAccessCodeRefs_RelStructure">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.netex.org.uk/netex}oneToManyRelationshipStructure">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.netex.org.uk/netex}ServiceAccessCodeRef"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "serviceAccessCodeRefs_RelStructure", propOrder = {
    "serviceAccessCodeRef"
})
public class ServiceAccessCodeRefsRelStructure
    extends OneToManyRelationshipStructure
{

    @XmlElement(name = "ServiceAccessCodeRef", required = true)
    protected ServiceAccessCodeRefStructure serviceAccessCodeRef;

    /**
     * Ruft den Wert der serviceAccessCodeRef-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ServiceAccessCodeRefStructure }
     *     
     */
    public ServiceAccessCodeRefStructure getServiceAccessCodeRef() {
        return serviceAccessCodeRef;
    }

    /**
     * Legt den Wert der serviceAccessCodeRef-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ServiceAccessCodeRefStructure }
     *     
     */
    public void setServiceAccessCodeRef(ServiceAccessCodeRefStructure value) {
        this.serviceAccessCodeRef = value;
    }

}
