package com.onlinebookstore.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.onlinebookstore.enitities.User;
import com.onlinebookstore.repositories.UserRepository;

@Service
public class UserSecurityService implements UserDetailsService{

	@Autowired
	UserRepository userRepository;
	
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		
		User user = userRepository.findByUserName(username);
		
		if(null == user) {
			
			throw new UsernameNotFoundException("User Not Found: "+username);
		}
		
		return user;
	}

}
