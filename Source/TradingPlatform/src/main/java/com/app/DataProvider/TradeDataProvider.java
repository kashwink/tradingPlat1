/**
 * 
 */
package com.app.DataProvider;

import java.util.List;

import com.app.tradingplatform.domain.User;

/**
 * @author Kurup
 *
 */
public interface TradeDataProvider {

	
	    String loadData();
	    List<User> getAllUsers();

}
