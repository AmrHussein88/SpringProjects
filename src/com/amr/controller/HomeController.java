package com.amr.controller;

import java.util.Locale;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.amr.entities.User;

@Controller
public class HomeController {
	// this method is for getting the home page of the application with a binded
	// object of user
	@RequestMapping(value = { "/" }, method = RequestMethod.GET)
	public String home(Locale locale, Model model) {
		User userIndex = new User();
		model.addAttribute("userIndex", userIndex);
		return "index";

	}

	// This method will be hit when clicking the registration link in the home page
	 
	@RequestMapping(value = { "/register" }, method = RequestMethod.GET)
	public String register(Locale locale, Model model) {
		User userRegisterationBean = new User();
		model.addAttribute("userRegisterationBean", userRegisterationBean);
		return "register";

	}

}
