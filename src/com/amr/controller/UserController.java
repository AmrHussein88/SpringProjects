package com.amr.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;

import org.omg.CORBA.Request;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ValidationUtils;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.amr.entities.User;
import com.amr.service.UserService;

@Controller
public class UserController {
	@Autowired
	private UserService userService;

	// This method is responsible for validating the login credentials
	@RequestMapping(value = "/index", method = RequestMethod.POST)
	public String login(@ModelAttribute("userF") User user, HttpServletRequest request, Model model) {

		List<User> userLookup = userService.findUserByUserName(user.getUserName());
		String page = null;
		if (userLookup != null && !userLookup.isEmpty()) {
			for (User userValues : userLookup) {
				String userName = request.getParameter("userName");
				String password = request.getParameter("password");
				if (userName.equals(userValues.getUserName()) && password.equals(userValues.getPassword())) {
					user = userValues;
					model.addAttribute(user);
					page = "home";

				}
			}

		} else {
			page = "index";
		}
		return page;
	}

	// This method will add a new user after filling the registration form
	@RequestMapping(value = "/register", method = RequestMethod.POST)
	public String register(@Valid @ModelAttribute("userRegisterationBean") User userRegisterationBean, BindingResult result,Model model) {
		if (result.hasErrors()) {
			return "register";
		} else
			userService.addUser(userRegisterationBean);
		model.addAttribute("userIndex",userRegisterationBean);

		return "index";
	}
	
	//This method will edit be used when editing the profile
	
	@RequestMapping(value="/editProfile" , method = RequestMethod.GET)
	public String editProfile (@ModelAttribute("userF") User user ,HttpServletRequest request, Model model){
		//Remember searching for how to pass the user object from page to page
		String uName=request.getParameter("userName");
		model.addAttribute(user);
		return "editProfile";
	}

}
