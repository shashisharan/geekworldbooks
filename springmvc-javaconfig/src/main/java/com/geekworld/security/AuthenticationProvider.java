package com.geekworld.security;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.dao.DaoAuthenticationProvider;
import org.springframework.security.authentication.encoding.BasePasswordEncoder;

public class AuthenticationProvider extends DaoAuthenticationProvider{
	
	@Autowired
	private secuirtyServiceImpl secuirtyServiceImpl;
	
	@Autowired
	private BasePasswordEncoder passwordEncoder;
	
	@PostConstruct
	public void init(){
		this.setUserDetailsService(secuirtyServiceImpl);
		this.setPasswordEncoder(passwordEncoder);
	}
	
	
	

}
