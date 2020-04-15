package com.reactiveworks.stocktrade;

import com.reactiveworks.stocktrade.service.exceptions.StockTradeServiceFailureException;
import com.reactiveworks.stocktrade.webservice.StockTradeWebService;

public class Test {
	
	public static void main(String[] args) throws StockTradeServiceFailureException {
		
//		IStockTradeDao stockTradeDao=StockTradeDaoFactory.getInstance();
//		IStockTradeDao stockTradeDao2 = StockTradeDaoFactory.getInstance("csv");
//		List<StockTrade> stockTradeRecords = stockTradeDao2.getStockTradeRecords();
//		for(int i=0;i<stockTradeRecords.size();i++)
//		stockTradeDao.createStockTradeRecord(stockTradeRecords.get(i));
		
		StockTradeWebService service=new StockTradeWebService();
		System.out.println(service.getStockTrades());
	}

}
