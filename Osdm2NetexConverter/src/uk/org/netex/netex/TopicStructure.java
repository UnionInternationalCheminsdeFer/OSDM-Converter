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
 * Type for abstract Request filter.
 * 
 * <p>Java-Klasse f�r TopicStructure complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="TopicStructure">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;group ref="{http://www.netex.org.uk/netex}TopicGroup"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TopicStructure", propOrder = {
    "description",
    "sources",
    "codespaceRef",
    "responsibilityRoleAssignment"
})
@XmlSeeAlso({
    NetworkFrameTopicStructure.class
})
public class TopicStructure {

    @XmlElement(name = "Description")
    protected MultilingualString description;
    protected DataSourcesRelStructure sources;
    @XmlElement(name = "CodespaceRef")
    protected CodespaceRefStructure codespaceRef;
    @XmlElement(name = "ResponsibilityRoleAssignment")
    protected ResponsibilityRoleAssignment responsibilityRoleAssignment;

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
     * Ruft den Wert der sources-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link DataSourcesRelStructure }
     *     
     */
    public DataSourcesRelStructure getSources() {
        return sources;
    }

    /**
     * Legt den Wert der sources-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link DataSourcesRelStructure }
     *     
     */
    public void setSources(DataSourcesRelStructure value) {
        this.sources = value;
    }

    /**
     * Ruft den Wert der codespaceRef-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link CodespaceRefStructure }
     *     
     */
    public CodespaceRefStructure getCodespaceRef() {
        return codespaceRef;
    }

    /**
     * Legt den Wert der codespaceRef-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link CodespaceRefStructure }
     *     
     */
    public void setCodespaceRef(CodespaceRefStructure value) {
        this.codespaceRef = value;
    }

    /**
     * Ruft den Wert der responsibilityRoleAssignment-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ResponsibilityRoleAssignment }
     *     
     */
    public ResponsibilityRoleAssignment getResponsibilityRoleAssignment() {
        return responsibilityRoleAssignment;
    }

    /**
     * Legt den Wert der responsibilityRoleAssignment-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ResponsibilityRoleAssignment }
     *     
     */
    public void setResponsibilityRoleAssignment(ResponsibilityRoleAssignment value) {
        this.responsibilityRoleAssignment = value;
    }

}
