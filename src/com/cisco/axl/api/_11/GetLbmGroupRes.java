
package com.cisco.axl.api._11;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GetLbmGroupRes complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetLbmGroupRes">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.cisco.com/AXL/API/11.0}APIResponse">
 *       &lt;sequence>
 *         &lt;element name="return">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="lbmGroup" type="{http://www.cisco.com/AXL/API/11.0}RLbmGroup"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetLbmGroupRes", propOrder = {
    "_return"
})
public class GetLbmGroupRes
    extends APIResponse
{

    @XmlElement(name = "return", required = true)
    protected GetLbmGroupRes.Return _return;

    /**
     * Gets the value of the return property.
     * 
     * @return
     *     possible object is
     *     {@link GetLbmGroupRes.Return }
     *     
     */
    public GetLbmGroupRes.Return getReturn() {
        return _return;
    }

    /**
     * Sets the value of the return property.
     * 
     * @param value
     *     allowed object is
     *     {@link GetLbmGroupRes.Return }
     *     
     */
    public void setReturn(GetLbmGroupRes.Return value) {
        this._return = value;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="lbmGroup" type="{http://www.cisco.com/AXL/API/11.0}RLbmGroup"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "lbmGroup"
    })
    public static class Return {

        @XmlElement(required = true)
        protected RLbmGroup lbmGroup;

        /**
         * Gets the value of the lbmGroup property.
         * 
         * @return
         *     possible object is
         *     {@link RLbmGroup }
         *     
         */
        public RLbmGroup getLbmGroup() {
            return lbmGroup;
        }

        /**
         * Sets the value of the lbmGroup property.
         * 
         * @param value
         *     allowed object is
         *     {@link RLbmGroup }
         *     
         */
        public void setLbmGroup(RLbmGroup value) {
            this.lbmGroup = value;
        }

    }

}
