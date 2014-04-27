/**
 * 
 */
package com.app.tradingplatform.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.DataProvider.TradeDataProvider;
import com.app.tradingplatform.domain.User;

/**
 * @author Kurup
 * 
 */
@Service
public class TraderUserServiceImpl implements TraderUserService {

	@Autowired
	private TradeDataProvider dataProvider;

	@Override
	public String getUser() {
		 String data = dataProvider.loadData();
		 
		 List<User> a = dataProvider.getAllUsers();
		 
	        System.out.println(String.format("This is %s. DataProvider class is %s",
	        		TraderUserServiceImpl.class, dataProvider.getClass()));
		return "";
	}

}
