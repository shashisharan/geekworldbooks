package com.geekworld.secuirtyconfig;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.dao.DaoAuthenticationProvider;
import org.springframework.security.authentication.encoding.BasePasswordEncoder;
import org.springframework.stereotype.Component;


@Component
public class AuthenticationProvider extends DaoAuthenticationProvider{
	
	@Autowired
	private secuirtyServiceImpl secuirtyServiceImpl;
	
	@Autowired
	private GeekWorldPasswordEncoder passwordEncoder;
	
	@PostConstruct
	public void init(){
		this.setUserDetailsService(secuirtyServiceImpl);
		this.setPasswordEncoder(passwordEncoder);
	}
	
	
	

}
