
package com.cisco.axl.api._11;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ListCallingPartyTransformationPatternRes complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ListCallingPartyTransformationPatternRes">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.cisco.com/AXL/API/11.0}APIResponse">
 *       &lt;sequence>
 *         &lt;element name="return">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="callingPartyTransformationPattern" type="{http://www.cisco.com/AXL/API/11.0}LCallingPartyTransformationPattern" maxOccurs="unbounded" minOccurs="0"/>
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
@XmlType(name = "ListCallingPartyTransformationPatternRes", propOrder = {
    "_return"
})
public class ListCallingPartyTransformationPatternRes
    extends APIResponse
{

    @XmlElement(name = "return", required = true)
    protected ListCallingPartyTransformationPatternRes.Return _return;

    /**
     * Gets the value of the return property.
     * 
     * @return
     *     possible object is
     *     {@link ListCallingPartyTransformationPatternRes.Return }
     *     
     */
    public ListCallingPartyTransformationPatternRes.Return getReturn() {
        return _return;
    }

    /**
     * Sets the value of the return property.
     * 
     * @param value
     *     allowed object is
     *     {@link ListCallingPartyTransformationPatternRes.Return }
     *     
     */
    public void setReturn(ListCallingPartyTransformationPatternRes.Return value) {
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
     *         &lt;element name="callingPartyTransformationPattern" type="{http://www.cisco.com/AXL/API/11.0}LCallingPartyTransformationPattern" maxOccurs="unbounded" minOccurs="0"/>
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
        "callingPartyTransformationPattern"
    })
    public static class Return {

        protected List<LCallingPartyTransformationPattern> callingPartyTransformationPattern;

        /**
         * Gets the value of the callingPartyTransformationPattern property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the callingPartyTransformationPattern property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getCallingPartyTransformationPattern().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link LCallingPartyTransformationPattern }
         * 
         * 
         */
        public List<LCallingPartyTransformationPattern> getCallingPartyTransformationPattern() {
            if (callingPartyTransformationPattern == null) {
                callingPartyTransformationPattern = new ArrayList<LCallingPartyTransformationPattern>();
            }
            return this.callingPartyTransformationPattern;
        }

    }

}
