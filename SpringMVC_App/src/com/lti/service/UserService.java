package com.lti.service;

import java.util.List;

import com.lti.model.User;

public interface UserService {
	
	public void addUser(User u);
	public void updateUser(User u);
	public void deleteUser(User u);
	public User findUserById(User u);
	public List<User> findAllUsers();
	
	public User login(User u);
	

}
