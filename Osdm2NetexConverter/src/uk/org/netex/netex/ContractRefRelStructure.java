//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// �nderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2026.05.22 um 10:24:00 AM CEST 
//


package uk.org.netex.netex;

import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlElementRef;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Type for a reference to a Contract.
 * 
 * <p>Java-Klasse f�r ContractRef_RelStructure complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="ContractRef_RelStructure">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.netex.org.uk/netex}containmentAggregationStructure">
 *       &lt;choice>
 *         &lt;element ref="{http://www.netex.org.uk/netex}ContractRef"/>
 *         &lt;element ref="{http://www.netex.org.uk/netex}Contract"/>
 *       &lt;/choice>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ContractRef_RelStructure", propOrder = {
    "contractRef",
    "contract"
})
public class ContractRefRelStructure
    extends ContainmentAggregationStructure
{

    @XmlElementRef(name = "ContractRef", namespace = "http://www.netex.org.uk/netex", type = JAXBElement.class, required = false)
    protected JAXBElement<? extends ContractRefStructure> contractRef;
    @XmlElement(name = "Contract")
    protected Contract contract;

    /**
     * Ruft den Wert der contractRef-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link SupplyContractRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link ContractRefStructure }{@code >}
     *     
     */
    public JAXBElement<? extends ContractRefStructure> getContractRef() {
        return contractRef;
    }

    /**
     * Legt den Wert der contractRef-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link SupplyContractRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link ContractRefStructure }{@code >}
     *     
     */
    public void setContractRef(JAXBElement<? extends ContractRefStructure> value) {
        this.contractRef = value;
    }

    /**
     * Ruft den Wert der contract-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Contract }
     *     
     */
    public Contract getContract() {
        return contract;
    }

    /**
     * Legt den Wert der contract-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Contract }
     *     
     */
    public void setContract(Contract value) {
        this.contract = value;
    }

}
