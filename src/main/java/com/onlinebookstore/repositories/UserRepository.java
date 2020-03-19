package com.onlinebookstore.repositories;

import org.springframework.data.repository.CrudRepository;

import com.onlinebookstore.enitities.User;

public interface UserRepository extends CrudRepository<User, Long> {
  
	User findByUserName(String username);
}
