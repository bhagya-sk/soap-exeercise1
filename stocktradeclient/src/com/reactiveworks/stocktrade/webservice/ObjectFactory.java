
package com.reactiveworks.stocktrade.webservice;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.reactiveworks.stocktrade.webservice package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _GetDailyTradingDifferential_QNAME = new QName("http://webservice.stocktrade.reactiveworks.com/", "getDailyTradingDifferential");
    private final static QName _GetDailyTradingDifferentialResponse_QNAME = new QName("http://webservice.stocktrade.reactiveworks.com/", "getDailyTradingDifferentialResponse");
    private final static QName _GetMaxVolumeTrade_QNAME = new QName("http://webservice.stocktrade.reactiveworks.com/", "getMaxVolumeTrade");
    private final static QName _GetMaxVolumeTradeResponse_QNAME = new QName("http://webservice.stocktrade.reactiveworks.com/", "getMaxVolumeTradeResponse");
    private final static QName _GetMinVolumeTrade_QNAME = new QName("http://webservice.stocktrade.reactiveworks.com/", "getMinVolumeTrade");
    private final static QName _GetMinVolumeTradeResponse_QNAME = new QName("http://webservice.stocktrade.reactiveworks.com/", "getMinVolumeTradeResponse");
    private final static QName _GetStockTrades_QNAME = new QName("http://webservice.stocktrade.reactiveworks.com/", "getStockTrades");
    private final static QName _GetStockTradesResponse_QNAME = new QName("http://webservice.stocktrade.reactiveworks.com/", "getStockTradesResponse");
    private final static QName _StockTradeServiceFailureException_QNAME = new QName("http://webservice.stocktrade.reactiveworks.com/", "StockTradeServiceFailureException");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.reactiveworks.stocktrade.webservice
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link DailyTradingDiffWrapper }
     * 
     */
    public DailyTradingDiffWrapper createDailyTradingDiffWrapper() {
        return new DailyTradingDiffWrapper();
    }

    /**
     * Create an instance of {@link DailyTradingDiffWrapper.DailyTrdDiff }
     * 
     */
    public DailyTradingDiffWrapper.DailyTrdDiff createDailyTradingDiffWrapperDailyTrdDiff() {
        return new DailyTradingDiffWrapper.DailyTrdDiff();
    }

    /**
     * Create an instance of {@link GetDailyTradingDifferential }
     * 
     */
    public GetDailyTradingDifferential createGetDailyTradingDifferential() {
        return new GetDailyTradingDifferential();
    }

    /**
     * Create an instance of {@link GetDailyTradingDifferentialResponse }
     * 
     */
    public GetDailyTradingDifferentialResponse createGetDailyTradingDifferentialResponse() {
        return new GetDailyTradingDifferentialResponse();
    }

    /**
     * Create an instance of {@link GetMaxVolumeTrade }
     * 
     */
    public GetMaxVolumeTrade createGetMaxVolumeTrade() {
        return new GetMaxVolumeTrade();
    }

    /**
     * Create an instance of {@link GetMaxVolumeTradeResponse }
     * 
     */
    public GetMaxVolumeTradeResponse createGetMaxVolumeTradeResponse() {
        return new GetMaxVolumeTradeResponse();
    }

    /**
     * Create an instance of {@link GetMinVolumeTrade }
     * 
     */
    public GetMinVolumeTrade createGetMinVolumeTrade() {
        return new GetMinVolumeTrade();
    }

    /**
     * Create an instance of {@link GetMinVolumeTradeResponse }
     * 
     */
    public GetMinVolumeTradeResponse createGetMinVolumeTradeResponse() {
        return new GetMinVolumeTradeResponse();
    }

    /**
     * Create an instance of {@link GetStockTrades }
     * 
     */
    public GetStockTrades createGetStockTrades() {
        return new GetStockTrades();
    }

    /**
     * Create an instance of {@link GetStockTradesResponse }
     * 
     */
    public GetStockTradesResponse createGetStockTradesResponse() {
        return new GetStockTradesResponse();
    }

    /**
     * Create an instance of {@link StockTradeServiceFailureException }
     * 
     */
    public StockTradeServiceFailureException createStockTradeServiceFailureException() {
        return new StockTradeServiceFailureException();
    }

    /**
     * Create an instance of {@link StockTrade }
     * 
     */
    public StockTrade createStockTrade() {
        return new StockTrade();
    }

    /**
     * Create an instance of {@link DailyTradingDiffWrapper.DailyTrdDiff.Entry }
     * 
     */
    public DailyTradingDiffWrapper.DailyTrdDiff.Entry createDailyTradingDiffWrapperDailyTrdDiffEntry() {
        return new DailyTradingDiffWrapper.DailyTrdDiff.Entry();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetDailyTradingDifferential }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.stocktrade.reactiveworks.com/", name = "getDailyTradingDifferential")
    public JAXBElement<GetDailyTradingDifferential> createGetDailyTradingDifferential(GetDailyTradingDifferential value) {
        return new JAXBElement<GetDailyTradingDifferential>(_GetDailyTradingDifferential_QNAME, GetDailyTradingDifferential.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetDailyTradingDifferentialResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.stocktrade.reactiveworks.com/", name = "getDailyTradingDifferentialResponse")
    public JAXBElement<GetDailyTradingDifferentialResponse> createGetDailyTradingDifferentialResponse(GetDailyTradingDifferentialResponse value) {
        return new JAXBElement<GetDailyTradingDifferentialResponse>(_GetDailyTradingDifferentialResponse_QNAME, GetDailyTradingDifferentialResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetMaxVolumeTrade }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.stocktrade.reactiveworks.com/", name = "getMaxVolumeTrade")
    public JAXBElement<GetMaxVolumeTrade> createGetMaxVolumeTrade(GetMaxVolumeTrade value) {
        return new JAXBElement<GetMaxVolumeTrade>(_GetMaxVolumeTrade_QNAME, GetMaxVolumeTrade.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetMaxVolumeTradeResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.stocktrade.reactiveworks.com/", name = "getMaxVolumeTradeResponse")
    public JAXBElement<GetMaxVolumeTradeResponse> createGetMaxVolumeTradeResponse(GetMaxVolumeTradeResponse value) {
        return new JAXBElement<GetMaxVolumeTradeResponse>(_GetMaxVolumeTradeResponse_QNAME, GetMaxVolumeTradeResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetMinVolumeTrade }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.stocktrade.reactiveworks.com/", name = "getMinVolumeTrade")
    public JAXBElement<GetMinVolumeTrade> createGetMinVolumeTrade(GetMinVolumeTrade value) {
        return new JAXBElement<GetMinVolumeTrade>(_GetMinVolumeTrade_QNAME, GetMinVolumeTrade.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetMinVolumeTradeResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.stocktrade.reactiveworks.com/", name = "getMinVolumeTradeResponse")
    public JAXBElement<GetMinVolumeTradeResponse> createGetMinVolumeTradeResponse(GetMinVolumeTradeResponse value) {
        return new JAXBElement<GetMinVolumeTradeResponse>(_GetMinVolumeTradeResponse_QNAME, GetMinVolumeTradeResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetStockTrades }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.stocktrade.reactiveworks.com/", name = "getStockTrades")
    public JAXBElement<GetStockTrades> createGetStockTrades(GetStockTrades value) {
        return new JAXBElement<GetStockTrades>(_GetStockTrades_QNAME, GetStockTrades.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetStockTradesResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.stocktrade.reactiveworks.com/", name = "getStockTradesResponse")
    public JAXBElement<GetStockTradesResponse> createGetStockTradesResponse(GetStockTradesResponse value) {
        return new JAXBElement<GetStockTradesResponse>(_GetStockTradesResponse_QNAME, GetStockTradesResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StockTradeServiceFailureException }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.stocktrade.reactiveworks.com/", name = "StockTradeServiceFailureException")
    public JAXBElement<StockTradeServiceFailureException> createStockTradeServiceFailureException(StockTradeServiceFailureException value) {
        return new JAXBElement<StockTradeServiceFailureException>(_StockTradeServiceFailureException_QNAME, StockTradeServiceFailureException.class, null, value);
    }

}
