
package com.cisco.schemas.ast.soap;

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
@WebService(name = "RisPortType", targetNamespace = "http://schemas.cisco.com/ast/soap")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface RisPortType {


    /**
     * 
     * @param stateInfo
     * @param cmSelectionCriteria
     * @return
     *     returns com.cisco.schemas.ast.soap.SelectCmDeviceReturn
     */
    @WebMethod(action = "selectCmDevice")
    @WebResult(name = "selectCmDeviceReturn", targetNamespace = "http://schemas.cisco.com/ast/soap")
    @RequestWrapper(localName = "selectCmDevice", targetNamespace = "http://schemas.cisco.com/ast/soap", className = "com.cisco.schemas.ast.soap.SelectCmDevice")
    @ResponseWrapper(localName = "selectCmDeviceResponse", targetNamespace = "http://schemas.cisco.com/ast/soap", className = "com.cisco.schemas.ast.soap.SelectCmDeviceResponse")
    public SelectCmDeviceReturn selectCmDevice(
        @WebParam(name = "StateInfo", targetNamespace = "http://schemas.cisco.com/ast/soap")
        String stateInfo,
        @WebParam(name = "CmSelectionCriteria", targetNamespace = "http://schemas.cisco.com/ast/soap")
        CmSelectionCriteria cmSelectionCriteria);

    /**
     * 
     * @param stateInfo
     * @param ctiSelectionCriteria
     * @return
     *     returns com.cisco.schemas.ast.soap.SelectCtiItemReturn
     */
    @WebMethod(action = "selectCtiItem")
    @WebResult(name = "selectCtiItemReturn", targetNamespace = "http://schemas.cisco.com/ast/soap")
    @RequestWrapper(localName = "selectCtiItem", targetNamespace = "http://schemas.cisco.com/ast/soap", className = "com.cisco.schemas.ast.soap.SelectCtiItem")
    @ResponseWrapper(localName = "selectCtiItemResponse", targetNamespace = "http://schemas.cisco.com/ast/soap", className = "com.cisco.schemas.ast.soap.SelectCtiItemResponse")
    public SelectCtiItemReturn selectCtiItem(
        @WebParam(name = "StateInfo", targetNamespace = "http://schemas.cisco.com/ast/soap")
        String stateInfo,
        @WebParam(name = "CtiSelectionCriteria", targetNamespace = "http://schemas.cisco.com/ast/soap")
        CtiSelectionCriteria ctiSelectionCriteria);

    /**
     * 
     * @param stateInfo
     * @param cmSelectionCriteria
     * @return
     *     returns com.cisco.schemas.ast.soap.SelectCmDeviceReturn
     */
    @WebMethod(action = "selectCmDeviceExt")
    @WebResult(name = "selectCmDeviceReturn", targetNamespace = "http://schemas.cisco.com/ast/soap")
    @RequestWrapper(localName = "selectCmDeviceExt", targetNamespace = "http://schemas.cisco.com/ast/soap", className = "com.cisco.schemas.ast.soap.SelectCmDeviceExt")
    @ResponseWrapper(localName = "selectCmDeviceResponse", targetNamespace = "http://schemas.cisco.com/ast/soap", className = "com.cisco.schemas.ast.soap.SelectCmDeviceResponse")
    public SelectCmDeviceReturn selectCmDeviceExt(
        @WebParam(name = "StateInfo", targetNamespace = "http://schemas.cisco.com/ast/soap")
        String stateInfo,
        @WebParam(name = "CmSelectionCriteria", targetNamespace = "http://schemas.cisco.com/ast/soap")
        CmSelectionCriteria cmSelectionCriteria);

}
