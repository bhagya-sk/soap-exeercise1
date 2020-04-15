package com.reactiveworks.stocktrade.webservice;

import java.util.Date;
import java.util.List;
import java.util.Map;

import javax.jws.WebService;

import com.reactiveworks.stocktrade.model.StockTrade;
import com.reactiveworks.stocktrade.service.IStockTradeService;
import com.reactiveworks.stocktrade.service.exceptions.StockTradeServiceFailureException;
import com.reactiveworks.stocktrade.service.implementation.StockTradeServiceImpl;

@WebService(targetNamespace = "http://webservice.stocktrade.reactiveworks.com/", portName = "StockTradeWebServicePort", serviceName = "StockTradeWebServiceService")
public class StockTradeWebService {

	public List<StockTrade> getStockTrades() throws StockTradeServiceFailureException {
		IStockTradeService stockTradeService = new StockTradeServiceImpl();
		return stockTradeService.readStockTrades();
	}

	public StockTrade getMaxVolumeTrade(List<StockTrade> stockTradeObjList) {
		IStockTradeService stockTradeService = new StockTradeServiceImpl();
		return stockTradeService.getMaxVolumeTrade(stockTradeObjList);
	}

	public StockTrade getMinVolumeTrade(List<StockTrade> stockTradeObjList) {
		IStockTradeService stockTradeService = new StockTradeServiceImpl();
		return stockTradeService.getMinVolumeTrade(stockTradeObjList);
	}

	public Map<Date, Double> getDailyTradingDifferential(List<StockTrade> stockTradeObjList) {
		IStockTradeService stockTradeService = new StockTradeServiceImpl();
		return stockTradeService.getDailyTradingDifferential(stockTradeObjList);
	}

}
