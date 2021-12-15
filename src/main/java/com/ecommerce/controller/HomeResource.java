package com.ecommerce.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.ecommerce.util.LoginValidatorUtil;
import java.util.logging.Logger;
@RestController
public class HomeResource {
	
	private final static Logger LOGGER = 
            Logger.getLogger(HomeResource.class.getName());
	
	@RequestMapping("/")
	public  String home() {
		
		
		LOGGER.info(LoginValidatorUtil.checkUserLoggedIn());
		
		return "Welcome";
	}
	
}
