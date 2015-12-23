package pl.playmobile.channel.utils;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;
import javax.xml.ws.Service;

/**
 * This class was generated by Apache CXF 2.7.17
 * 2015-09-25T13:57:04.141+02:00
 * Generated source version: 2.7.17
 * 
 */
@WebServiceClient(name = "queueMessage-1", 
                  wsdlLocation = "http://10.10.33.51:8040/queuemessage?wsdl",
                  targetNamespace = "http://playmobile.pl/channel/utils") 
public class QueueMessage1 extends Service {

    public final static URL WSDL_LOCATION;

    public final static QName SERVICE = new QName("http://playmobile.pl/channel/utils", "queueMessage-1");
    public final static QName Default = new QName("http://playmobile.pl/channel/utils", "default");
    static {
        URL url = null;
        try {
            url = new URL("http://10.10.33.51:8040/queuemessage?wsdl");
        } catch (MalformedURLException e) {
            java.util.logging.Logger.getLogger(QueueMessage1.class.getName())
                .log(java.util.logging.Level.INFO, 
                     "Can not initialize the default wsdl from {0}", "classhpath:queuemessage.wsdl");
        }
        WSDL_LOCATION = url;
    }

    public QueueMessage1(URL wsdlLocation) {
        super(wsdlLocation, SERVICE);
    }

    public QueueMessage1(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public QueueMessage1() {
        super(WSDL_LOCATION, SERVICE);
    }
    
    //This constructor requires JAX-WS API 2.2. You will need to endorse the 2.2
    //API jar or re-run wsdl2java with "-frontend jaxws21" to generate JAX-WS 2.1
    //compliant code instead.
    public QueueMessage1(WebServiceFeature ... features) {
        super(WSDL_LOCATION, SERVICE, features);
    }

    //This constructor requires JAX-WS API 2.2. You will need to endorse the 2.2
    //API jar or re-run wsdl2java with "-frontend jaxws21" to generate JAX-WS 2.1
    //compliant code instead.
    public QueueMessage1(URL wsdlLocation, WebServiceFeature ... features) {
        super(wsdlLocation, SERVICE, features);
    }

    //This constructor requires JAX-WS API 2.2. You will need to endorse the 2.2
    //API jar or re-run wsdl2java with "-frontend jaxws21" to generate JAX-WS 2.1
    //compliant code instead.
    public QueueMessage1(URL wsdlLocation, QName serviceName, WebServiceFeature ... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     *
     * @return
     *     returns QueueMessagePortType
     */
    @WebEndpoint(name = "default")
    public QueueMessagePortType getDefault() {
        return super.getPort(Default, QueueMessagePortType.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns QueueMessagePortType
     */
    @WebEndpoint(name = "default")
    public QueueMessagePortType getDefault(WebServiceFeature... features) {
        return super.getPort(Default, QueueMessagePortType.class, features);
    }

}