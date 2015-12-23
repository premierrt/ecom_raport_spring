
package pl.project4.utils;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for queueMessageType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="queueMessageType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="type" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="title" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="content" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="signature" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="attachments" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="inlines" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="addressTo" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="addressFrom" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="dateToSend" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="validity" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="hourFrom" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="hourTo" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="deliveryReport" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="systemName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="systemUserName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="systemId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "queueMessageType", propOrder = {
    "type",
    "title",
    "content",
    "signature",
    "attachments",
    "inlines",
    "addressTo",
    "addressFrom",
    "dateToSend",
    "validity",
    "hourFrom",
    "hourTo",
    "deliveryReport",
    "systemName",
    "systemUserName",
    "systemId"
})
@XmlSeeAlso({
    QueueMessage.class
})
public class QueueMessageType {

    @XmlElement(required = true)
    protected String type;
    protected String title;
    protected String content;
    protected String signature;
    protected String attachments;
    protected String inlines;
    @XmlElement(required = true)
    protected String addressTo;
    @XmlElement(required = true)
    protected String addressFrom;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dateToSend;
    protected Integer validity;
    protected Integer hourFrom;
    protected Integer hourTo;
    protected Boolean deliveryReport;
    @XmlElement(required = true)
    protected String systemName;
    protected String systemUserName;
    protected String systemId;

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setType(String value) {
        this.type = value;
    }

    /**
     * Gets the value of the title property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTitle() {
        return title;
    }

    /**
     * Sets the value of the title property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTitle(String value) {
        this.title = value;
    }

    /**
     * Gets the value of the content property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContent() {
        return content;
    }

    /**
     * Sets the value of the content property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContent(String value) {
        this.content = value;
    }

    /**
     * Gets the value of the signature property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSignature() {
        return signature;
    }

    /**
     * Sets the value of the signature property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSignature(String value) {
        this.signature = value;
    }

    /**
     * Gets the value of the attachments property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAttachments() {
        return attachments;
    }

    /**
     * Sets the value of the attachments property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAttachments(String value) {
        this.attachments = value;
    }

    /**
     * Gets the value of the inlines property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInlines() {
        return inlines;
    }

    /**
     * Sets the value of the inlines property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInlines(String value) {
        this.inlines = value;
    }

    /**
     * Gets the value of the addressTo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddressTo() {
        return addressTo;
    }

    /**
     * Sets the value of the addressTo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddressTo(String value) {
        this.addressTo = value;
    }

    /**
     * Gets the value of the addressFrom property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddressFrom() {
        return addressFrom;
    }

    /**
     * Sets the value of the addressFrom property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddressFrom(String value) {
        this.addressFrom = value;
    }

    /**
     * Gets the value of the dateToSend property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDateToSend() {
        return dateToSend;
    }

    /**
     * Sets the value of the dateToSend property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDateToSend(XMLGregorianCalendar value) {
        this.dateToSend = value;
    }

    /**
     * Gets the value of the validity property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getValidity() {
        return validity;
    }

    /**
     * Sets the value of the validity property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setValidity(Integer value) {
        this.validity = value;
    }

    /**
     * Gets the value of the hourFrom property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getHourFrom() {
        return hourFrom;
    }

    /**
     * Sets the value of the hourFrom property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setHourFrom(Integer value) {
        this.hourFrom = value;
    }

    /**
     * Gets the value of the hourTo property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getHourTo() {
        return hourTo;
    }

    /**
     * Sets the value of the hourTo property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setHourTo(Integer value) {
        this.hourTo = value;
    }

    /**
     * Gets the value of the deliveryReport property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDeliveryReport() {
        return deliveryReport;
    }

    /**
     * Sets the value of the deliveryReport property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDeliveryReport(Boolean value) {
        this.deliveryReport = value;
    }

    /**
     * Gets the value of the systemName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSystemName() {
        return systemName;
    }

    /**
     * Sets the value of the systemName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSystemName(String value) {
        this.systemName = value;
    }

    /**
     * Gets the value of the systemUserName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSystemUserName() {
        return systemUserName;
    }

    /**
     * Sets the value of the systemUserName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSystemUserName(String value) {
        this.systemUserName = value;
    }

    /**
     * Gets the value of the systemId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSystemId() {
        return systemId;
    }

    /**
     * Sets the value of the systemId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSystemId(String value) {
        this.systemId = value;
    }

}
