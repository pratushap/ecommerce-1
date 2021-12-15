package com.ecommerce;

import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;


import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;

@Configuration
@EnableWebSecurity
public class SecurityConfiguration extends WebSecurityConfigurerAdapter {
	
	
	  @Override public void configure(AuthenticationManagerBuilder auth) throws
	  Exception {
	  
	  auth.inMemoryAuthentication().withUser("user")
	  .password("$2a$12$KVwqNeRb21Dwk8FK36uqvejTKoq1dnYb3DkH2QUPccFYhszOk/5ua")
	  .roles("USER");
	  
	  
	  }
	  
	  @Bean public PasswordEncoder getPasswordEncoder() { return new
	  BCryptPasswordEncoder(); }
	 
	
} 