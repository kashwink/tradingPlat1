package com.app.tradingplatform;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.app.tradingplatform.domain.Welcome;
import com.app.tradingplatform.service.TraderUserService;

/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {
	
	@Autowired
	private TraderUserService testService;
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	/**
	 * Simply selects the home view to render by returning its name.
	 */	
	@RequestMapping(value = "login", method = RequestMethod.GET)
	public @ResponseBody Welcome getName() { // test
		
		Welcome response = new Welcome();
		testService.getUser();
		response.setMicrobloggerEmail("kashwink@gmail.com");
		response.setTodaysDate(System.currentTimeMillis());
		response.setWelcomeString("Please dont try");

		return response;

	}	
	
}
