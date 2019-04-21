package com.geekworld.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;



@Controller
public class HomeControllers {
	
	@RequestMapping("/login")
	public String returnLoginPage(){
		return "/login/login";
	}

}
