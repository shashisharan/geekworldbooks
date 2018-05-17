package com.geekworld.secuirtyconfig;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Component;


@Component
public class secuirtyServiceImpl implements UserDetailsService {

	@Autowired
	private UserDao userDao;

	public UserDetails loadUserByUsername(String arg0)
			throws UsernameNotFoundException {

		UserDetails userDetails=userDao.getUser(arg0);
		// TODO Auto-generated method stub
		return userDetails;
	}

}
