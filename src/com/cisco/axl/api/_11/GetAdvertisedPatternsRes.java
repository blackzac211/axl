
package com.cisco.axl.api._11;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GetAdvertisedPatternsRes complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetAdvertisedPatternsRes">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.cisco.com/AXL/API/11.0}APIResponse">
 *       &lt;sequence>
 *         &lt;element name="return">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="advertisedPatterns" type="{http://www.cisco.com/AXL/API/11.0}RAdvertisedPatterns"/>
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
@XmlType(name = "GetAdvertisedPatternsRes", propOrder = {
    "_return"
})
public class GetAdvertisedPatternsRes
    extends APIResponse
{

    @XmlElement(name = "return", required = true)
    protected GetAdvertisedPatternsRes.Return _return;

    /**
     * Gets the value of the return property.
     * 
     * @return
     *     possible object is
     *     {@link GetAdvertisedPatternsRes.Return }
     *     
     */
    public GetAdvertisedPatternsRes.Return getReturn() {
        return _return;
    }

    /**
     * Sets the value of the return property.
     * 
     * @param value
     *     allowed object is
     *     {@link GetAdvertisedPatternsRes.Return }
     *     
     */
    public void setReturn(GetAdvertisedPatternsRes.Return value) {
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
     *         &lt;element name="advertisedPatterns" type="{http://www.cisco.com/AXL/API/11.0}RAdvertisedPatterns"/>
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
        "advertisedPatterns"
    })
    public static class Return {

        @XmlElement(required = true)
        protected RAdvertisedPatterns advertisedPatterns;

        /**
         * Gets the value of the advertisedPatterns property.
         * 
         * @return
         *     possible object is
         *     {@link RAdvertisedPatterns }
         *     
         */
        public RAdvertisedPatterns getAdvertisedPatterns() {
            return advertisedPatterns;
        }

        /**
         * Sets the value of the advertisedPatterns property.
         * 
         * @param value
         *     allowed object is
         *     {@link RAdvertisedPatterns }
         *     
         */
        public void setAdvertisedPatterns(RAdvertisedPatterns value) {
            this.advertisedPatterns = value;
        }

    }

}
