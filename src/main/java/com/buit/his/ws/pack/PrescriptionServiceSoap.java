
package com.buit.his.ws.pack;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebService(name = "PrescriptionServiceSoap", targetNamespace = "http://tempuri.org/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface PrescriptionServiceSoap {


    /**
     * 
     * @param xmlString
     * @return
     *     returns java.lang.String
     */
    @WebMethod(operationName = "RecievePrescription", action = "http://tempuri.org/RecievePrescription")
    @WebResult(name = "RecievePrescriptionResult", targetNamespace = "http://tempuri.org/")
    @RequestWrapper(localName = "RecievePrescription", targetNamespace = "http://tempuri.org/", className = "org.tempuri.RecievePrescription")
    @ResponseWrapper(localName = "RecievePrescriptionResponse", targetNamespace = "http://tempuri.org/", className = "org.tempuri.RecievePrescriptionResponse")
    public String recievePrescription(
        @WebParam(name = "xmlString", targetNamespace = "http://tempuri.org/")
        String xmlString);

}
