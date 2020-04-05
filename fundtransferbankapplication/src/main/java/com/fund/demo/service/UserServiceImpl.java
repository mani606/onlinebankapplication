package com.fund.demo.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fund.demo.model.UserRegistration;
import com.fund.demo.repository.UserRepository;

@Service
public class UserServiceImpl implements UserService {

	@Autowired  
	UserRepository userrepository;

	@Override
	public List<UserRegistration> getAllUsers() {
		List<UserRegistration> user=new ArrayList<UserRegistration>();  
		userrepository.findAll().forEach(user11 -> user.add((UserRegistration) user));  
		return user;  
	}

	@Override
	public UserRegistration getUserRegistrationById(int id) {
		return  userrepository.findById(id);
	}

	@Override
	public void delete(int id) {
	userrepository.deleteById(id);
		
	}

	@Override
	public void update(UserRegistration users) {
		userrepository.update(users);
		
	}

	@Override
	public void save(UserRegistration users) {
		userrepository.save(users);  
		
	}

	
	

}
