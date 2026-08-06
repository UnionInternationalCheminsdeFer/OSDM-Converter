//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// �nderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2026.05.22 um 10:24:00 AM CEST 
//


package uk.org.netex.netex;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse f�r PaymentMethodEnumeration.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="PaymentMethodEnumeration">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}normalizedString">
 *     &lt;enumeration value="cash"/>
 *     &lt;enumeration value="cashExactChangeOnly"/>
 *     &lt;enumeration value="cashAndCard"/>
 *     &lt;enumeration value="coin"/>
 *     &lt;enumeration value="banknote"/>
 *     &lt;enumeration value="cheque"/>
 *     &lt;enumeration value="travellersCheque"/>
 *     &lt;enumeration value="postalOrder"/>
 *     &lt;enumeration value="companyCheque"/>
 *     &lt;enumeration value="creditCard"/>
 *     &lt;enumeration value="debitCard"/>
 *     &lt;enumeration value="cardsOnly"/>
 *     &lt;enumeration value="travelCard"/>
 *     &lt;enumeration value="contactlessPaymentCard"/>
 *     &lt;enumeration value="contactlessTravelCard"/>
 *     &lt;enumeration value="directDebit"/>
 *     &lt;enumeration value="bankTransfer"/>
 *     &lt;enumeration value="epayDevice"/>
 *     &lt;enumeration value="epayAccount"/>
 *     &lt;enumeration value="sms"/>
 *     &lt;enumeration value="mobilePhone"/>
 *     &lt;enumeration value="mobileApp"/>
 *     &lt;enumeration value="voucher"/>
 *     &lt;enumeration value="token"/>
 *     &lt;enumeration value="warrant"/>
 *     &lt;enumeration value="mileagePoints"/>
 *     &lt;enumeration value="other"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "PaymentMethodEnumeration")
@XmlEnum
public enum PaymentMethodEnumeration {


    /**
     * Payment in coins or notes accepted.
     * 
     */
    @XmlEnumValue("cash")
    CASH("cash"),

    /**
     * Payment in coins or notes accepted, must be exact amount.
     * 
     */
    @XmlEnumValue("cashExactChangeOnly")
    CASH_EXACT_CHANGE_ONLY("cashExactChangeOnly"),

    /**
     * Payment with either cash or debit / credit card accepted.
     * 
     */
    @XmlEnumValue("cashAndCard")
    CASH_AND_CARD("cashAndCard"),

    /**
     * Payment in specie (coins) only.
     * 
     */
    @XmlEnumValue("coin")
    COIN("coin"),

    /**
     * Payment in cash with banknotes (but no coins).
     * 
     */
    @XmlEnumValue("banknote")
    BANKNOTE("banknote"),

    /**
     * Payment with personal Bankers' cheque.
     * 
     */
    @XmlEnumValue("cheque")
    CHEQUE("cheque"),

    /**
     * Payment with Traveller's cheque.
     * 
     */
    @XmlEnumValue("travellersCheque")
    TRAVELLERS_CHEQUE("travellersCheque"),

    /**
     * Payment by Postal order.
     * 
     */
    @XmlEnumValue("postalOrder")
    POSTAL_ORDER("postalOrder"),

    /**
     * Payment with Company cheque.
     * 
     */
    @XmlEnumValue("companyCheque")
    COMPANY_CHEQUE("companyCheque"),

    /**
     * Payment by credit card (E.g. Visa, MasterCard, etc).
     * 
     */
    @XmlEnumValue("creditCard")
    CREDIT_CARD("creditCard"),

    /**
     * Payment by Bank debit card.
     * 
     */
    @XmlEnumValue("debitCard")
    DEBIT_CARD("debitCard"),

    /**
     * Paymentonly with debit or credit card (no cash).
     * 
     */
    @XmlEnumValue("cardsOnly")
    CARDS_ONLY("cardsOnly"),

    /**
     * Payment with stored value travel card or smartcard.
     * 
     */
    @XmlEnumValue("travelCard")
    TRAVEL_CARD("travelCard"),

    /**
     * NFC Payment by contactless credit or debit card
     * 
     */
    @XmlEnumValue("contactlessPaymentCard")
    CONTACTLESS_PAYMENT_CARD("contactlessPaymentCard"),

    /**
     * NFC Payment with stored value travel card or smartcard .
     * 
     */
    @XmlEnumValue("contactlessTravelCard")
    CONTACTLESS_TRAVEL_CARD("contactlessTravelCard"),

    /**
     * Electronic payment by direct debit at retailers request from customer's bank account .
     * 
     */
    @XmlEnumValue("directDebit")
    DIRECT_DEBIT("directDebit"),

    /**
     * Electronic payment from customer account to retailers account.
     * 
     */
    @XmlEnumValue("bankTransfer")
    BANK_TRANSFER("bankTransfer"),

    /**
     * Electronic payment with on device application (e.g. ApplePay, GooglePay etc).
     * 
     */
    @XmlEnumValue("epayDevice")
    EPAY_DEVICE("epayDevice"),

    /**
     * Electronic payment direct from account (e.g. PayPal etc).
     * 
     */
    @XmlEnumValue("epayAccount")
    EPAY_ACCOUNT("epayAccount"),

    /**
     * Payment by SMS charge to mobile account.
     * 
     */
    @XmlEnumValue("sms")
    SMS("sms"),

    /**
     * Payment with mobile device / mobile app. [Use more specific MOBILE app]
     * 
     */
    @XmlEnumValue("mobilePhone")
    MOBILE_PHONE("mobilePhone"),

    /**
     * Payment with mobile device / mobile app. +v1.2.2
     * 
     */
    @XmlEnumValue("mobileApp")
    MOBILE_APP("mobileApp"),

    /**
     * Payment with coupons or vouchers.
     * 
     */
    @XmlEnumValue("voucher")
    VOUCHER("voucher"),

    /**
     * Payment with physical tokens.
     * 
     */
    @XmlEnumValue("token")
    TOKEN("token"),

    /**
     * Payment with warrant issued by an organisation (e.g. Army, government).
     * 
     */
    @XmlEnumValue("warrant")
    WARRANT("warrant"),

    /**
     * Payment in mileage points.
     * 
     */
    @XmlEnumValue("mileagePoints")
    MILEAGE_POINTS("mileagePoints"),

    /**
     * Other means of payment .
     * 
     */
    @XmlEnumValue("other")
    OTHER("other");
    private final String value;

    PaymentMethodEnumeration(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static PaymentMethodEnumeration fromValue(String v) {
        for (PaymentMethodEnumeration c: PaymentMethodEnumeration.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
