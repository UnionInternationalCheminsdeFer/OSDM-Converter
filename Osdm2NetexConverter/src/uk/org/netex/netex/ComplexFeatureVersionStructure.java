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
 * Type for a COMPLEX FEATURE.
 * 
 * <p>Java-Klasse f�r ComplexFeature_VersionStructure complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="ComplexFeature_VersionStructure">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.netex.org.uk/netex}GroupOfPoints_VersionStructure">
 *       &lt;sequence>
 *         &lt;group ref="{http://www.netex.org.uk/netex}ComplexFeatureGroup"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ComplexFeature_VersionStructure", propOrder = {
    "groupOfEntitiesRef",
    "featureMembers"
})
@XmlSeeAlso({
    ComplexFeature.class
})
public class ComplexFeatureVersionStructure
    extends GroupOfPointsVersionStructure
{

    @XmlElement(name = "GroupOfEntitiesRef")
    protected GroupOfEntitiesRef groupOfEntitiesRef;
    protected ComplexFeatureMembersRelStructure featureMembers;

    /**
     * Ruft den Wert der groupOfEntitiesRef-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link GroupOfEntitiesRef }
     *     
     */
    public GroupOfEntitiesRef getGroupOfEntitiesRef() {
        return groupOfEntitiesRef;
    }

    /**
     * Legt den Wert der groupOfEntitiesRef-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link GroupOfEntitiesRef }
     *     
     */
    public void setGroupOfEntitiesRef(GroupOfEntitiesRef value) {
        this.groupOfEntitiesRef = value;
    }

    /**
     * Ruft den Wert der featureMembers-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ComplexFeatureMembersRelStructure }
     *     
     */
    public ComplexFeatureMembersRelStructure getFeatureMembers() {
        return featureMembers;
    }

    /**
     * Legt den Wert der featureMembers-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ComplexFeatureMembersRelStructure }
     *     
     */
    public void setFeatureMembers(ComplexFeatureMembersRelStructure value) {
        this.featureMembers = value;
    }

}
