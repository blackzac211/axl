
package com.cisco.axl.api._11;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AddSipRoutePatternReq complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AddSipRoutePatternReq">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.cisco.com/AXL/API/11.0}APIRequest">
 *       &lt;sequence>
 *         &lt;element name="sipRoutePattern" type="{http://www.cisco.com/AXL/API/11.0}XSipRoutePattern"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AddSipRoutePatternReq", propOrder = {
    "sipRoutePattern"
})
public class AddSipRoutePatternReq
    extends APIRequest
{

    @XmlElement(required = true)
    protected XSipRoutePattern sipRoutePattern;

    /**
     * Gets the value of the sipRoutePattern property.
     * 
     * @return
     *     possible object is
     *     {@link XSipRoutePattern }
     *     
     */
    public XSipRoutePattern getSipRoutePattern() {
        return sipRoutePattern;
    }

    /**
     * Sets the value of the sipRoutePattern property.
     * 
     * @param value
     *     allowed object is
     *     {@link XSipRoutePattern }
     *     
     */
    public void setSipRoutePattern(XSipRoutePattern value) {
        this.sipRoutePattern = value;
    }

}
