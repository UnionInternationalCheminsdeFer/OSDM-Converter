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
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Type for an ACCEPTED DRIVER PERMIT.
 * 
 * <p>Java-Klasse f�r AcceptedDriverPermit_VersionStructure complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="AcceptedDriverPermit_VersionStructure">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.netex.org.uk/netex}DataManagedObjectStructure">
 *       &lt;group ref="{http://www.netex.org.uk/netex}AcceptedDriverPermitGroup"/>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AcceptedDriverPermit_VersionStructure", propOrder = {
    "name",
    "typeOfDriverPermitRef",
    "acceptedDriverPermits"
})
@XmlSeeAlso({
    AcceptedDriverPermit.class
})
public class AcceptedDriverPermitVersionStructure
    extends DataManagedObjectStructure
{

    @XmlElement(name = "Name")
    protected MultilingualString name;
    @XmlElement(name = "TypeOfDriverPermitRef")
    protected TypeOfDriverPermitRefStructure typeOfDriverPermitRef;
    protected AcceptedDriverPermitsRelStructure acceptedDriverPermits;

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
     * Ruft den Wert der typeOfDriverPermitRef-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link TypeOfDriverPermitRefStructure }
     *     
     */
    public TypeOfDriverPermitRefStructure getTypeOfDriverPermitRef() {
        return typeOfDriverPermitRef;
    }

    /**
     * Legt den Wert der typeOfDriverPermitRef-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeOfDriverPermitRefStructure }
     *     
     */
    public void setTypeOfDriverPermitRef(TypeOfDriverPermitRefStructure value) {
        this.typeOfDriverPermitRef = value;
    }

    /**
     * Ruft den Wert der acceptedDriverPermits-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link AcceptedDriverPermitsRelStructure }
     *     
     */
    public AcceptedDriverPermitsRelStructure getAcceptedDriverPermits() {
        return acceptedDriverPermits;
    }

    /**
     * Legt den Wert der acceptedDriverPermits-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link AcceptedDriverPermitsRelStructure }
     *     
     */
    public void setAcceptedDriverPermits(AcceptedDriverPermitsRelStructure value) {
        this.acceptedDriverPermits = value;
    }

}
