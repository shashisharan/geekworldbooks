package com.geekworld.secuirtyconfig;

import org.springframework.security.authentication.encoding.BasePasswordEncoder;
import org.springframework.stereotype.Component;

@Component
public class GeekWorldPasswordEncoder extends BasePasswordEncoder {

	public String encodePassword(String arg0, Object arg1) {
		// TODO Auto-generated method stub
		return null;
	}

	public boolean isPasswordValid(String arg0, String arg1, Object arg2) {
		// TODO Auto-generated method stub
		return false;
	}

}
