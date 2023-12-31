
package com.cisco.axl.api._11;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for OXBusyLampField complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OXBusyLampField">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence minOccurs="0">
 *         &lt;choice minOccurs="0">
 *           &lt;sequence minOccurs="0">
 *             &lt;element name="blfDirn" type="{http://www.cisco.com/AXL/API/11.0}String255" minOccurs="0"/>
 *             &lt;element name="routePartition" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *           &lt;/sequence>
 *         &lt;/choice>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OXBusyLampField", propOrder = {
    "blfDirn",
    "routePartition"
})
public class OXBusyLampField {

    protected String blfDirn;
    protected String routePartition;

    /**
     * Gets the value of the blfDirn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBlfDirn() {
        return blfDirn;
    }

    /**
     * Sets the value of the blfDirn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBlfDirn(String value) {
        this.blfDirn = value;
    }

    /**
     * Gets the value of the routePartition property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRoutePartition() {
        return routePartition;
    }

    /**
     * Sets the value of the routePartition property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRoutePartition(String value) {
        this.routePartition = value;
    }

}
