package com.ecommerce;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.autoconfigure.web.servlet.WebMvcAutoConfiguration;

import com.ecommerce.util.LoginValidatorUtil;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
public class EcommerceApplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
			SpringApplication.run(EcommerceApplication.class, args);
			
		}

	

}
