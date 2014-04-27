/**
 * 
 */
package com.app.DataProvider;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.app.tradingplatform.dao.UserHome;
import com.app.tradingplatform.domain.User;

/**
 * @author Kurup
 * 
 */

@Repository
public class TradeDataProviderImpl implements TradeDataProvider {

	@Autowired
	private UserHome dao;

	@Override
	@Transactional
	public String loadData() {

		User u = new User(0, "Kurup", "Ashwin", "520 Lincoln Ave", "Manhonk MA");
		User y = new User(1, "Deshmukh", "Prema", "888 Mirabilis St", "Ronkonkoma NY");

//		Session session = dao.getSessionFactory().openSession();
//
//		Transaction transaction = null;

		try

		{

			dao.persist(u);
			dao.persist(y);
			// transaction = session.beginTransaction();
			//
			// session.save(u);
			//
			// transaction.commit();
			//
			// System.out.println("Data Saved");

		} catch (Exception e)

		{

			e.printStackTrace();

		} finally {
//			session.close();
		}

		System.out.println(String.format("%s has loaded data.",
				TradeDataProviderImpl.class));

		return "Some data from data provider";
	}
	
	@Override
	@Transactional
	public List<User> getAllUsers()
	{
		User x = dao.findById(0);
		User y = dao.findById(1);
		ArrayList<User> t = new ArrayList<User>();
		t.add(x);
		t.add(y);
		x = dao.findById(1);
		y = dao.findById(0);
		return t;
	}

}
