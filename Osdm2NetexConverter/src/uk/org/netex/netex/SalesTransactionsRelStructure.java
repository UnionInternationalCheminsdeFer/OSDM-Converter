//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// �nderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2026.05.22 um 10:24:00 AM CEST 
//


package uk.org.netex.netex;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlElements;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Type for a list of SALES TRANSACTIONs.
 * 
 * <p>Java-Klasse f�r salesTransactions_RelStructure complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="salesTransactions_RelStructure">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.netex.org.uk/netex}containmentAggregationStructure">
 *       &lt;choice maxOccurs="unbounded">
 *         &lt;element ref="{http://www.netex.org.uk/netex}SalesTransactionRef"/>
 *         &lt;element ref="{http://www.netex.org.uk/netex}SalesTransaction"/>
 *       &lt;/choice>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "salesTransactions_RelStructure", propOrder = {
    "salesTransactionRefOrSalesTransaction"
})
public class SalesTransactionsRelStructure
    extends ContainmentAggregationStructure
{

    @XmlElements({
        @XmlElement(name = "SalesTransactionRef", type = SalesTransactionRefStructure.class),
        @XmlElement(name = "SalesTransaction", type = SalesTransaction.class)
    })
    protected List<Object> salesTransactionRefOrSalesTransaction;

    /**
     * Gets the value of the salesTransactionRefOrSalesTransaction property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the salesTransactionRefOrSalesTransaction property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSalesTransactionRefOrSalesTransaction().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SalesTransactionRefStructure }
     * {@link SalesTransaction }
     * 
     * 
     */
    public List<Object> getSalesTransactionRefOrSalesTransaction() {
        if (salesTransactionRefOrSalesTransaction == null) {
            salesTransactionRefOrSalesTransaction = new ArrayList<Object>();
        }
        return this.salesTransactionRefOrSalesTransaction;
    }

}
