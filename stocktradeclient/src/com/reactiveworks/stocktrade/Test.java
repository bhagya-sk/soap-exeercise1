package com.reactiveworks.stocktrade;

import com.reactiveworks.stocktrade.webservice.StockTradeServiceFailureException_Exception;
import com.reactiveworks.stocktrade.webservice.StockTradeWebService;
import com.reactiveworks.stocktrade.webservice.StockTradeWebServiceService;

public class Test {

	public static void main(String[] args) throws StockTradeServiceFailureException_Exception {
		StockTradeWebServiceService service=new StockTradeWebServiceService();
		StockTradeWebService port = service.getStockTradeWebServicePort();
		//System.out.println(port.getStockTrades());
		System.out.println( port.getDailyTradingDifferential(port.getStockTrades()));
		System.out.println( port.getMaxVolumeTrade(port.getStockTrades()));
		System.out.println( port.getMinVolumeTrade(port.getStockTrades()));
	}

}
