package com.geekworld.listeners;

import org.springframework.context.ApplicationListener;
import org.springframework.security.authentication.event.InteractiveAuthenticationSuccessEvent;
import org.springframework.security.core.userdetails.User;
import org.springframework.stereotype.Component;

@Component
public class LoginListener implements
		ApplicationListener<InteractiveAuthenticationSuccessEvent> {

	public void onApplicationEvent(InteractiveAuthenticationSuccessEvent event) {

		System.out.println("Login Sucess Inside LoginListener");
		// UserDetails user = (UserDetails)
		// event.getAuthentication().getPrincipal();
		User user = (User) event.getAuthentication().getPrincipal();
		// System.out.println("LOGIN name: "+user.getUsername());
		System.out.println("" + user);

	}

}
