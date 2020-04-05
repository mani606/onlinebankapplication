package com.fund.demo.service;

import java.util.List;

import com.fund.demo.model.UserRegistration;

public interface UserService {

	List<UserRegistration> getAllUsers();


	UserRegistration getUserRegistrationById(int uid);


	void delete(int uid);



	void update(UserRegistration users);




	void save(UserRegistration users);


	


	


}
