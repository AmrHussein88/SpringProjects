package com.amr.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.amr.entities.User;
import com.amr.dao.UserDao;

@Service
@Transactional
public class UserServiceImpl implements UserService {
	@Autowired
	private UserDao userDao;

	@Override
	public void addUser(User user) {

		this.userDao.addUser(user);
	}

	@Override
	public void deleteUser(User user) {
		this.userDao.deleteUser(user);
	}

	@Override
	public void updateUser(User user) {
		this.userDao.updateUser(user);
	}

	@Override
	public List<User> findUserByUserName(String userName) {

		List<User> result = userDao.findUserByUserName(userName);
		return result;
	}

}
