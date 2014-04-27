/**
 * 
 */
package com.app.tradingplatform.domain;

import java.util.Date;

/**
 * @author Kurup
 *
 */
public class Welcome {
	
	/**
	 * @return the todaysDate
	 */
	public String getTodaysDate() {
		return todaysDate.toString();
	}
	/**
	 * @param todaysDate the todaysDate to set
	 */
	public void setTodaysDate(Date todaysDate) {
		this.todaysDate = todaysDate;
	}
	/**
	 * @param todaysDate the todaysDate to set
	 */
	public void setTodaysDate(long todaysDate) {
		this.todaysDate = new Date(todaysDate);
	}
	/**
	 * @return the welcomeString
	 */
	public String getWelcomeString() {
		return welcomeString;
	}
	/**
	 * @param welcomeString the welcomeString to set
	 */
	public void setWelcomeString(String welcomeString) {
		this.welcomeString = welcomeString;
	}
	/**
	 * @return the microbloggerEmail
	 */
	public String getMicrobloggerEmail() {
		return microbloggerEmail;
	}
	/**
	 * @param microbloggerEmail the microbloggerEmail to set
	 */
	public void setMicrobloggerEmail(String microbloggerEmail) {
		this.microbloggerEmail = microbloggerEmail;
	}
	Date todaysDate;
	String welcomeString;
	String microbloggerEmail;

}
