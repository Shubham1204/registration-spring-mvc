package com.userRegistration.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.userRegistration.model.UserModel;
import com.userRegistration.service.UserService;

@Controller
public class RegisterController {

	@Autowired
	private UserService userService;
	
	@RequestMapping("/register")
	public String register(Model model) {
		model.addAttribute("page_name", "Registration");
		return "registration";
	}
	
	@RequestMapping(path="/registered",method = RequestMethod.POST)
	public String registered(@ModelAttribute UserModel userModel, Model model) {
		model.addAttribute("page_name", "Registered User");
		int id=userService.createUser(userModel);
		System.out.println(id);
		model.addAttribute("userCreationId", id);
	return "registered";
	}
}
