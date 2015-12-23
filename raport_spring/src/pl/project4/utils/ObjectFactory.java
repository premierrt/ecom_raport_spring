
package pl.project4.utils;

import javax.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the pl.project4.utils package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {


    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: pl.project4.utils
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link CancelMessage }
     * 
     */
    public CancelMessage createCancelMessage() {
        return new CancelMessage();
    }

    /**
     * Create an instance of {@link QueueMessage }
     * 
     */
    public QueueMessage createQueueMessage() {
        return new QueueMessage();
    }

    /**
     * Create an instance of {@link QueueMessageType }
     * 
     */
    public QueueMessageType createQueueMessageType() {
        return new QueueMessageType();
    }

    /**
     * Create an instance of {@link QueueMessages }
     * 
     */
    public QueueMessages createQueueMessages() {
        return new QueueMessages();
    }

}
