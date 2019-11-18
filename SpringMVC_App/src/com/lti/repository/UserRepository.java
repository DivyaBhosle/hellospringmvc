package com.lti.repository;

import java.util.List;

import com.lti.model.User;

public interface UserRepository {

	public void addUser(User u);
	public void updateUser(User u);
	public void deleteUser(User u);
	public User findUserById(User u);
	public User findUserByEmail(String email);
	public List<User> findAllUsers();
	
}
