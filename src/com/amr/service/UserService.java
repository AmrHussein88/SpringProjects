package com.amr.service;

import java.util.List;

import com.amr.entities.User;

public interface UserService {
	
		public void addUser(User user);
		public void deleteUser(User user);
		public void updateUser(User user);
		public List<User> findUserByUserName(String userName);

}
