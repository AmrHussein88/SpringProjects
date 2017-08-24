package com.amr.dao;

import java.util.List;

import com.amr.entities.User;

public interface UserDao {
public void addUser(User user);
public void deleteUser(User user);
public void updateUser(User user);
public List<User> findUserByUserName(String userName);


}
