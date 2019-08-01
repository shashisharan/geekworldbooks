package com.geekworld.listeners;

import org.springframework.context.ApplicationListener;
import org.springframework.security.authentication.event.AbstractAuthenticationFailureEvent;
import org.springframework.stereotype.Component;

@Component
public class LoginFailureListener implements
		ApplicationListener<AbstractAuthenticationFailureEvent> {

	public void onApplicationEvent(AbstractAuthenticationFailureEvent event) {
		event.getAuthentication().getAuthorities();

		System.out
				.println("Authentication failed Inside login failure listener");
		System.out.println("Principal: "
				+ event.getAuthentication().getPrincipal());
		System.out.println("Exception: " + event.getException());
		System.out.println("Authorities: "
				+ event.getAuthentication().getAuthorities());
		System.out
				.println("Details: " + event.getAuthentication().getDetails());

	}

}
