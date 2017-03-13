package com.datingws.api.service;

import com.datingws.api.model.User;

public interface UserService {

	void save(User user); 
	
	User findByEmail(String email);
	
	User signIn(User user) throws ServiceException;
}
