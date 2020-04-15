package com.reactiveworks.stocktrade.db;

import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Properties;

import org.apache.commons.dbcp2.BasicDataSource;

import org.apache.log4j.Logger;

import com.reactiveworks.stocktrade.db.exceptions.DBOperationFailureException;
import com.reactiveworks.stocktrade.db.exceptions.DBAccessFailureDaoException;

/**
 * This class Provides utility methods for database operations.
 */
public class DBUtil {

	private static final Logger LOGGER_OBJ = Logger.getLogger("DBUtil.class");
	private static final String PROPERTY_FILE = "database.properties";
	private static final String URL = "url";
	private static final String USER_NAME = "username";
	private static final String PASSWORD = "password";
	private static final String DRIVER_CLASS_NAME = "driver.class.name";
	private static BasicDataSource dataSource ;

	private DBUtil() {

	}

	/**
	 * Gets the connection object from the connection pool.
	 * 
	 * @return the connection object from the connection pool.
	 * @throws DBAccessFailureDaoException     when there is problem in accessing
	 *                                     stocktrade data from the database.
	 * @throws DBOperationFailureException when operation on database fails.
	 */
	public static synchronized Connection getdbconnection()
			throws DBAccessFailureDaoException, DBOperationFailureException {
		Connection connection = null;
		if (dataSource == null) {
			dataSource = new BasicDataSource();
			try (InputStream input = DBUtil.class.getClassLoader().getResourceAsStream(PROPERTY_FILE)) {

				Properties properties = new Properties();
				properties.load(input);
				dataSource.setUrl(properties.getProperty(URL));
				dataSource.setUsername(properties.getProperty(USER_NAME));
				dataSource.setPassword(properties.getProperty(PASSWORD));
				dataSource.setDriverClassName(properties.getProperty(DRIVER_CLASS_NAME));

			} catch (IOException exp) {
				LOGGER_OBJ.error("not able to read the properties file " + PROPERTY_FILE);
				throw new DBOperationFailureException("not able to read the file " + PROPERTY_FILE, exp);
			} 
		}
		
		try {

			connection = dataSource.getConnection();

		} catch (SQLException exp) {
			LOGGER_OBJ.error(" unable to access the stocktrade database ");
			throw new DBAccessFailureDaoException("unable to access the stocktrade database " + exp);
		}

		return connection;
	}

	/**
	 * Releases ResultSet, PreparedStatement, Connection object's database and JDBC
	 * resources
	 * 
	 * @param resultSet  resultSet object.
	 * @param pstatement preparedStatement object.
	 * @param connection connection object from the connection pool.
	 * @throws DBAccessFailureDaoException when there is problem in accessing stocktrade
	 *                                 data from the database.
	 */
	public static void cleanupdbresources(ResultSet resultSet, PreparedStatement pstatement, Connection connection) {

		try {
			if (resultSet != null) {
				resultSet.close();
			}
		} catch (SQLException exp) {
			LOGGER_OBJ.error(" unable to close resultSet resource ");
		} finally {
			try {
				if (pstatement != null) {
					pstatement.close();
				}
			} catch (SQLException exp) {
				LOGGER_OBJ.error(" unable to access the stocktrade database ");
			} finally {
				try {
					if (connection != null) {
						connection.close();
					}
				} catch (SQLException exp) {
					LOGGER_OBJ.error(" unable to access the stocktrade database ");
				}

			}
		}
	}
}