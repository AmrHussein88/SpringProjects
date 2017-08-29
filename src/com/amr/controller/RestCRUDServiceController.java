package com.amr.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.amr.entities.User;
import com.amr.service.UserService;

@RestController
public class RestCRUDServiceController {

	@Autowired
	UserService userService;
	
	@RequestMapping(value="/allUsers" , method = RequestMethod.GET )
	public ResponseEntity<List<User>> getUserByUserName(){
		List<User>  allUsers = userService.findAllUsers();
		if(allUsers.isEmpty()){
			return  new ResponseEntity<List<User>>(HttpStatus.NOT_FOUND);
		}
			return new ResponseEntity<List<User>>(allUsers,HttpStatus.OK);
	}
	@RequestMapping(value = "/deleteUser/{userName}" , method = RequestMethod.DELETE)
	public ResponseEntity<User> deleteUser(@PathVariable("userName") String userName){
		List<User> user = userService.findUserByUserName(userName);
		if(user.isEmpty() || user == null){
			return new ResponseEntity<User>(HttpStatus.NOT_FOUND);
		}
		userService.deleteUser(userName);
		return new ResponseEntity<User>(HttpStatus.NO_CONTENT);
	}
	
}
