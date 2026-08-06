//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// �nderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2026.05.22 um 10:24:00 AM CEST 
//


package uk.org.siri.siri;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse f�r CommunicationsTransportMethodEnumeration.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="CommunicationsTransportMethodEnumeration">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN">
 *     &lt;enumeration value="httpPost"/>
 *     &lt;enumeration value="other"/>
 *     &lt;enumeration value="wsdlSoap"/>
 *     &lt;enumeration value="wsdlSoapDocumentLiteral"/>
 *     &lt;enumeration value="httpUrlJSON"/>
 *     &lt;enumeration value="httpUrlProtoBuffers"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "CommunicationsTransportMethodEnumeration")
@XmlEnum
public enum CommunicationsTransportMethodEnumeration {

    @XmlEnumValue("httpPost")
    HTTP_POST("httpPost"),
    @XmlEnumValue("other")
    OTHER("other"),
    @XmlEnumValue("wsdlSoap")
    WSDL_SOAP("wsdlSoap"),
    @XmlEnumValue("wsdlSoapDocumentLiteral")
    WSDL_SOAP_DOCUMENT_LITERAL("wsdlSoapDocumentLiteral"),
    @XmlEnumValue("httpUrlJSON")
    HTTP_URL_JSON("httpUrlJSON"),
    @XmlEnumValue("httpUrlProtoBuffers")
    HTTP_URL_PROTO_BUFFERS("httpUrlProtoBuffers");
    private final String value;

    CommunicationsTransportMethodEnumeration(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static CommunicationsTransportMethodEnumeration fromValue(String v) {
        for (CommunicationsTransportMethodEnumeration c: CommunicationsTransportMethodEnumeration.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
