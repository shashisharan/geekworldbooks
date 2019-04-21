package com.geekworld.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.context.request.WebRequest;

import com.geekworld.models.UserRegisterationModel;

@Controller
public class RegistrationController {

	@GetMapping("/registration")
	public String registerFirstTime(WebRequest request,Model model){
		model.addAttribute("user",new UserRegisterationModel());
		
	return "/thymeleaf/registeration/firstTimeUser.html";
		
	}
}
