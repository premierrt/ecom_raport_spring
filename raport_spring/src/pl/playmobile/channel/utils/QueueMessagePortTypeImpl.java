
/**
 * Please modify this class to meet your needs
 * This class is not complete
 */

package pl.playmobile.channel.utils;

import java.util.logging.Logger;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.bind.annotation.XmlSeeAlso;

/**
 * This class was generated by Apache CXF 2.7.17
 * 2015-09-25T13:57:04.122+02:00
 * Generated source version: 2.7.17
 * 
 */

@javax.jws.WebService(
                      serviceName = "queueMessage-1",
                      portName = "default",
                      targetNamespace = "http://playmobile.pl/channel/utils",
                      wsdlLocation = "classpath:queuemessage.wsdl",
                      endpointInterface = "pl.playmobile.channel.utils.QueueMessagePortType")
                      
public class QueueMessagePortTypeImpl implements QueueMessagePortType {

    private static final Logger LOG = Logger.getLogger(QueueMessagePortTypeImpl.class.getName());

    /* (non-Javadoc)
     * @see pl.playmobile.channel.utils.QueueMessagePortType#queueMessages(pl.project4.utils.QueueMessages  queueMessages )*
     */
    public void queueMessages(pl.project4.utils.QueueMessages queueMessages) throws ServiceFault    { 
        LOG.info("Executing operation queueMessages");
        System.out.println(queueMessages);
        try {
        } catch (java.lang.Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
        //throw new ServiceFault("ServiceFault...");
    }

    /* (non-Javadoc)
     * @see pl.playmobile.channel.utils.QueueMessagePortType#queueMessage(pl.project4.utils.QueueMessage  queueMessage )*
     */
    public void queueMessage(pl.project4.utils.QueueMessage queueMessage) throws ServiceFault    { 
        LOG.info("Executing operation queueMessage");
        System.out.println(queueMessage);
        try {
        } catch (java.lang.Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
        //throw new ServiceFault("ServiceFault...");
    }

    /* (non-Javadoc)
     * @see pl.playmobile.channel.utils.QueueMessagePortType#cancelMessage(pl.project4.utils.CancelMessage  cancelMessage )*
     */
    public void cancelMessage(pl.project4.utils.CancelMessage cancelMessage) throws ServiceFault    { 
        LOG.info("Executing operation cancelMessage");
        System.out.println(cancelMessage);
        try {
        } catch (java.lang.Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
        //throw new ServiceFault("ServiceFault...");
    }

}
