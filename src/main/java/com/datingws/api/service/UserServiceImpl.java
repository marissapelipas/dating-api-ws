package com.datingws.api.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.datingws.api.model.User;
import com.datingws.api.repository.UserRepository;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserRepository repository;

	@Override
	public void save(User user) {
		repository.save(user);
	}

	@Override
	public User findByEmail(String email) { 
		return repository.findByEmail(email);
	}

	@Override
	public User signIn(User user) throws ServiceException {
		User existingUser = findByEmail(user.getEmail());
		if (existingUser != null) {
			throw new ServiceException("duplicateEmail");
		} else {
			this.save(user);
			return user;
		}		
	} 
	
	

}
