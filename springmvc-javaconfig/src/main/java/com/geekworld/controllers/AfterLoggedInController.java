package com.geekworld.controllers;

import org.springframework.security.authentication.AnonymousAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class AfterLoggedInController {
	
	@RequestMapping(value="/welcome")
	public String getFirstPage(){
		
		Authentication authentication1 = SecurityContextHolder.getContext().getAuthentication();
		String currentPrincipalName = authentication1.getName();
		System.out.println("Current Principal Name"+currentPrincipalName);
		
		System.out.println(SecurityContextHolder.getContext().getAuthentication().getCredentials());
		
		Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
		if (!(authentication instanceof AnonymousAuthenticationToken)) {
		    String currentUserName2 = authentication.getName();
		    System.out.println("Current Principal Name"+currentUserName2);
		}
		return "/firstPage";
	}

}
