
package com.cisco.axl.api._11;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GetElinGroupRes complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetElinGroupRes">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.cisco.com/AXL/API/11.0}APIResponse">
 *       &lt;sequence>
 *         &lt;element name="return">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="elinGroup" type="{http://www.cisco.com/AXL/API/11.0}RElinGroup"/>
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
@XmlType(name = "GetElinGroupRes", propOrder = {
    "_return"
})
public class GetElinGroupRes
    extends APIResponse
{

    @XmlElement(name = "return", required = true)
    protected GetElinGroupRes.Return _return;

    /**
     * Gets the value of the return property.
     * 
     * @return
     *     possible object is
     *     {@link GetElinGroupRes.Return }
     *     
     */
    public GetElinGroupRes.Return getReturn() {
        return _return;
    }

    /**
     * Sets the value of the return property.
     * 
     * @param value
     *     allowed object is
     *     {@link GetElinGroupRes.Return }
     *     
     */
    public void setReturn(GetElinGroupRes.Return value) {
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
     *         &lt;element name="elinGroup" type="{http://www.cisco.com/AXL/API/11.0}RElinGroup"/>
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
        "elinGroup"
    })
    public static class Return {

        @XmlElement(required = true)
        protected RElinGroup elinGroup;

        /**
         * Gets the value of the elinGroup property.
         * 
         * @return
         *     possible object is
         *     {@link RElinGroup }
         *     
         */
        public RElinGroup getElinGroup() {
            return elinGroup;
        }

        /**
         * Sets the value of the elinGroup property.
         * 
         * @param value
         *     allowed object is
         *     {@link RElinGroup }
         *     
         */
        public void setElinGroup(RElinGroup value) {
            this.elinGroup = value;
        }

    }

}
