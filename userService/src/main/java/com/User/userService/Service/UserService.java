/**
 * 
 */
package com.User.userService.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.User.userService.Entity.User;
import com.User.userService.Repository.UserRepository;

/**
 * @author ustjavafsdb411
 *
 */
@Service
public class UserService {

	@Autowired
	UserRepository repository;

	public User addUser(User user) {
		
		return repository.save(user);
	}

	public List<User> getAllUser() {
		// TODO Auto-generated method stub
		return repository.findAll();
	}

	public List<User> getUserBasedOnWork(String work) {
		// TODO Auto-generated method stub
		return repository.findAllUsersByWork(work);
	}
}
