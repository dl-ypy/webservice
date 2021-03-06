
package com.ypy.cxf;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.logging.Logger;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;

/**
 * This class was generated by the JAX-WS RI. JAX-WS RI 2.1.3-hudson-390-
 * Generated source version: 2.0
 * <p>
 * An example of how this class may be used:
 * 
 * <pre>
* HelloWorldImplService service = new HelloWorldImplService();
* HelloWorldImpl portType = service.getHelloWorldImplPort();
* portType.say(...);
 * </pre>
 * </p>
 * 
 */
@WebServiceClient(name = "HelloWorldImplService", targetNamespace = "http://impl.cxf.ypy.com/", wsdlLocation = "http://localhost:8686/cxf/webservice/HelloWorld?wsdl")
public class HelloWorldImplService extends Service {

	private final static URL HELLOWORLDIMPLSERVICE_WSDL_LOCATION;
	private final static Logger logger = Logger.getLogger(com.ypy.cxf.HelloWorldImplService.class.getName());

	static {
		URL url = null;
		try {
			URL baseUrl;
			baseUrl = com.ypy.cxf.HelloWorldImplService.class.getResource(".");
			url = new URL(baseUrl, "http://localhost:8686/cxf/webservice/HelloWorld?wsdl");
		} catch (MalformedURLException e) {
			logger.warning(
					"Failed to create URL for the wsdl Location: 'http://localhost:8686/cxf/webservice/HelloWorld?wsdl', retrying as a local file");
			logger.warning(e.getMessage());
		}
		HELLOWORLDIMPLSERVICE_WSDL_LOCATION = url;
	}

	public HelloWorldImplService(URL wsdlLocation, QName serviceName) {
		super(wsdlLocation, serviceName);
	}

	public HelloWorldImplService() {
		super(HELLOWORLDIMPLSERVICE_WSDL_LOCATION, new QName("http://impl.cxf.ypy.com/", "HelloWorldImplService"));
	}

	/**
	 * 
	 * @return returns HelloWorldImpl
	 */
	@WebEndpoint(name = "HelloWorldImplPort")
	public HelloWorldImpl getHelloWorldImplPort() {
		return super.getPort(new QName("http://impl.cxf.ypy.com/", "HelloWorldImplPort"), HelloWorldImpl.class);
	}

}
