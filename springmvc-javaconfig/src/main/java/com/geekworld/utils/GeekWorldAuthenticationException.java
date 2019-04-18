package com.geekworld.utils;

public class GeekWorldAuthenticationException extends Exception {
	
	private String message;
	
	public GeekWorldAuthenticationException(String messsage){
		this.message=messsage;
	}

}
