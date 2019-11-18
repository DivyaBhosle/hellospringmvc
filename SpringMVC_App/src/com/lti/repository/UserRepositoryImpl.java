package com.lti.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.lti.model.User;
@Repository("urepository")
public class UserRepositoryImpl implements UserRepository {

	@PersistenceContext
	EntityManager em;
	@Override
	public void addUser(User u) {
		
		
	}

	@Override
	public void updateUser(User u) {
		

		
	}

	@Override
	public void deleteUser(User u) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public User findUserById(User u) {
	return null;
	}

	@Transactional
	@Override
public User findUserByEmail(String email)
	{
    
		
		System.out.println("\n\n--Done with where clause with parameters");
		String q="Select u from User u where u.email= ?1";
		javax.persistence.TypedQuery<User> query=em.createQuery(q,User.class);
		query.setParameter(1,email);
		User u=query.getSingleResult();
		
		
		return u;
		
		
	}
	

	@Override
	public List<User> findAllUsers() {
		// TODO Auto-generated method stub
		return null;
	}
	
	

}
