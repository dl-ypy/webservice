
package com.ypy.cxf;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

/**
 * This class was generated by the JAX-WS RI. JAX-WS RI 2.1.3-hudson-390-
 * Generated source version: 2.0
 * 
 */
@WebService(name = "HelloWorldImpl", targetNamespace = "http://impl.cxf.ypy.com/")
public interface HelloWorldImpl {

	/**
	 * 
	 * @param arg0
	 * @return returns java.lang.String
	 */
	@WebMethod
	@WebResult(targetNamespace = "")
	@RequestWrapper(localName = "say", targetNamespace = "http://impl.cxf.ypy.com/", className = "com.ypy.cxf.Say")
	@ResponseWrapper(localName = "sayResponse", targetNamespace = "http://impl.cxf.ypy.com/", className = "com.ypy.cxf.SayResponse")
	public String say(@WebParam(name = "arg0", targetNamespace = "") String arg0);

}
