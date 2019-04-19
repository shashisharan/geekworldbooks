package com.geekworld.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class AfterLoggedInController {
	
	@RequestMapping(value="/welcome")
	public String getFirstPage(){
		return "firstPage";
	}

}
