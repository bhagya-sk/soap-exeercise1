
package com.reactiveworks.stocktrade.webservice.jaxws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

/**
 * This class was generated by Apache CXF 3.2.1
 * Mon Mar 23 11:11:24 PDT 2020
 * Generated source version: 3.2.1
 */

@XmlRootElement(name = "getMinVolumeTrade", namespace = "http://webservice.stocktrade.reactiveworks.com/")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getMinVolumeTrade", namespace = "http://webservice.stocktrade.reactiveworks.com/")

public class GetMinVolumeTrade {

    @XmlElement(name = "arg0")
    private java.util.List<com.reactiveworks.stocktrade.model.StockTrade> arg0;

    public java.util.List<com.reactiveworks.stocktrade.model.StockTrade> getArg0() {
        return this.arg0;
    }

    public void setArg0(java.util.List<com.reactiveworks.stocktrade.model.StockTrade> newArg0)  {
        this.arg0 = newArg0;
    }

}
