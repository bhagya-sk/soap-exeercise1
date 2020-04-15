package com.reactiveworks.stocktrade.dao;

import java.util.List;

import com.reactiveworks.stocktrade.db.exceptions.DBOperationFailureException;
import com.reactiveworks.stocktrade.db.exceptions.DBAccessFailureDaoException;
import com.reactiveworks.stocktrade.db.exceptions.InvalidDBRecordFormatDaoException;
import com.reactiveworks.stocktrade.db.exceptions.OperationNotSupportedDaoException;
import com.reactiveworks.stocktrade.model.StockTrade;

/**
 * Interface for StockTradeDao implementation.
 */
public interface IStockTradeDao {


	/**
	 * Reads the information from the CSV file and creates the list of stockTrade
	 * objects.
	 * 
	 * @return the list of stockTrade objects.
	 * @throws DBAccessFailureDaoException        when there is problem in accessing the
	 *                                        CSV file.
	 * @throws InvalidDBRecordFormatDaoException when the format of the CSV record is
	 *                                        invalid.
	 * @throws DBOperationFailureException    when operation on csv file fails.
	 */

	public List<StockTrade> getStockTradeRecords()
			throws DBAccessFailureDaoException, InvalidDBRecordFormatDaoException, DBOperationFailureException;

	/**
	 * Creates the stockTrade record in the database.
	 * 
	 * @param stockTradeObj stockTrade object which has to be inserted into the
	 * 
	 * @throws DBAccessFailureDaoException        when there is problem in accessing the
	 *                                        CSV file.
	 * @throws InvalidDBRecordFormatDaoException when the format of the CSV record is
	 *                                        invalid.
	 * @throws DBOperationFailureException    when operation on csv file fails.
	 */
	public void createStockTradeRecord(StockTrade stockTradeObj)
			throws OperationNotSupportedDaoException, DBAccessFailureDaoException, DBOperationFailureException;

	/**
	 * Deletes the stockTrade records from the database.
	 * 
	  * @throws DBAccessFailureDaoException        when there is problem in accessing the
	 *                                        CSV file.
	 * @throws InvalidDBRecordFormatDaoException when the format of the CSV record is
	 *                                        invalid.
	 * @throws DBOperationFailureException    when operation on csv file fails.
	 */
	public void deleteStockTradeRecord(int stockTradeId) throws OperationNotSupportedDaoException
	,DBAccessFailureDaoException,DBOperationFailureException;

    /**
     * updates the record in the database.
     * 
     * @throws DBAccessFailureDaoException        when there is problem in accessing the
	 *                                        CSV file.
	 * @throws InvalidDBRecordFormatDaoException when the format of the CSV record is
	 *                                        invalid.
	 * @throws DBOperationFailureException    when operation on csv file fails.
     */
	public void updateStockTradeRecord(int stockTrdId, double volume) throws OperationNotSupportedDaoException, DBAccessFailureDaoException, DBOperationFailureException;

}