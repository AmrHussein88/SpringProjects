package com.amr.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.amr.entities.User;
import com.amr.service.UserService;

@Controller
public class UserController {
	@Autowired
	private UserService userService;

/*	@Autowired
	public void setUserService(UserService userService) {
		this.userService = userService;
	}*/
	@RequestMapping(value="/addUser",method=RequestMethod.POST)
	public String addUser(@ModelAttribute("userF") User user ) {
		
	if(user.getUserId() == 0){
		
		
		userService.addUser(user);
	}
		return "anything";
	}

}
