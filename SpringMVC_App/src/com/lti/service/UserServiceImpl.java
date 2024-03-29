package com.lti.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.lti.model.User;
import com.lti.repository.UserRepository;
@Service("userservice")
public class UserServiceImpl implements UserService{

	@Autowired
	UserRepository repository;
	@Override
	public void addUser(User u) {
		repository.addUser(u);
	}

	@Override
	public void updateUser(User u) {
		// TODO Auto-generated method stub
		repository.updateUser(u);
		
	}

	@Override
	public void deleteUser(User u) {
		// TODO Auto-generated method stub
		repository.deleteUser(u);
	}

	@Override
	
	public User findUserById(User u) {
		User u1=repository.findUserById(u);
		return u1;
	}

	@Override
	public List<User> findAllUsers() {
		List<User> list=repository.findAllUsers();
		return list;
	}

	@Override
	public User login(User u) {
		
		User userToBeReturned=null;
		User udb=repository.findUserByEmail(u.getEmail());
		
		if(udb==null)
		{
			
		}
		else if(udb.getEmail().equals((u.getEmail()))&&(udb.getPassword().equals(u.getPassword())))
		{
			       userToBeReturned=udb;
		}
		else
		{
			
		}
		
		return userToBeReturned;
	}

}
