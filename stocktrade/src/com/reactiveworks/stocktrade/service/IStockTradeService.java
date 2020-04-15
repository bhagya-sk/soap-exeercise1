package com.reactiveworks.stocktrade.service;

import java.util.Date;
import java.util.List;
import java.util.Map;

import com.reactiveworks.stocktrade.model.StockTrade;
import com.reactiveworks.stocktrade.service.exceptions.StockTradeServiceFailureException;

public interface IStockTradeService {
	
	/**
	 * Gets the list of stocktrade objects.
	 * @return the list of stocktrade objects.
	 */
	 public List<StockTrade> readStockTrades() throws StockTradeServiceFailureException ;

	 /**
	  * Finds the stocktrade object which has max volume.
	  * @param stockTradeObjList list of stocktrade objects.
	  * @return the stocktrade object with the max volume.
	  */
	public StockTrade getMaxVolumeTrade(List<StockTrade> stockTradeObjList);

	/**
	 * Finds the stocktrade object which has min volume.
	 * @param stockTradeObjList list of stocktrade objects.
	 * @return the stocktrade object which has min volume.
	 */
	public StockTrade getMinVolumeTrade(List<StockTrade> stockTradeObjList);

	/**
	 * Computes the daily trading difference.
	 * @param stockTradeObjList the list of stocktrade objects.
	 * @return the map which contains the difference of open vs High with Date being the Key
	 */
	public Map<Date,Double> getDailyTradingDifferential(List<StockTrade> stockTradeObjList);

}