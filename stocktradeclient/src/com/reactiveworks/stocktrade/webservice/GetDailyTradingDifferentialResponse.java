
package com.reactiveworks.stocktrade.webservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for getDailyTradingDifferentialResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getDailyTradingDifferentialResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="return" type="{http://webservice.stocktrade.reactiveworks.com/}dailyTradingDiffWrapper" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getDailyTradingDifferentialResponse", propOrder = {
    "_return"
})
public class GetDailyTradingDifferentialResponse {

    @XmlElement(name = "return")
    protected DailyTradingDiffWrapper _return;

    /**
     * Gets the value of the return property.
     * 
     * @return
     *     possible object is
     *     {@link DailyTradingDiffWrapper }
     *     
     */
    public DailyTradingDiffWrapper getReturn() {
        return _return;
    }

    /**
     * Sets the value of the return property.
     * 
     * @param value
     *     allowed object is
     *     {@link DailyTradingDiffWrapper }
     *     
     */
    public void setReturn(DailyTradingDiffWrapper value) {
        this._return = value;
    }

}
