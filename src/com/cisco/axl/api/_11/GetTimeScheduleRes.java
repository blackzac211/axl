
package com.cisco.axl.api._11;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GetTimeScheduleRes complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetTimeScheduleRes">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.cisco.com/AXL/API/11.0}APIResponse">
 *       &lt;sequence>
 *         &lt;element name="return">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="timeSchedule" type="{http://www.cisco.com/AXL/API/11.0}RTimeSchedule"/>
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
@XmlType(name = "GetTimeScheduleRes", propOrder = {
    "_return"
})
public class GetTimeScheduleRes
    extends APIResponse
{

    @XmlElement(name = "return", required = true)
    protected GetTimeScheduleRes.Return _return;

    /**
     * Gets the value of the return property.
     * 
     * @return
     *     possible object is
     *     {@link GetTimeScheduleRes.Return }
     *     
     */
    public GetTimeScheduleRes.Return getReturn() {
        return _return;
    }

    /**
     * Sets the value of the return property.
     * 
     * @param value
     *     allowed object is
     *     {@link GetTimeScheduleRes.Return }
     *     
     */
    public void setReturn(GetTimeScheduleRes.Return value) {
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
     *         &lt;element name="timeSchedule" type="{http://www.cisco.com/AXL/API/11.0}RTimeSchedule"/>
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
        "timeSchedule"
    })
    public static class Return {

        @XmlElement(required = true)
        protected RTimeSchedule timeSchedule;

        /**
         * Gets the value of the timeSchedule property.
         * 
         * @return
         *     possible object is
         *     {@link RTimeSchedule }
         *     
         */
        public RTimeSchedule getTimeSchedule() {
            return timeSchedule;
        }

        /**
         * Sets the value of the timeSchedule property.
         * 
         * @param value
         *     allowed object is
         *     {@link RTimeSchedule }
         *     
         */
        public void setTimeSchedule(RTimeSchedule value) {
            this.timeSchedule = value;
        }

    }

}
