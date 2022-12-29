/**
 * 
 */
package com.User.userService.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.User.userService.Entity.User;
import com.User.userService.Service.UserService;

/**
 * @author ustjavafsdb411
 *
 */
@RestController
@RequestMapping("/user")
public class UserController {
	
	@Autowired
	UserService service;
	
	@PostMapping("/register")
	public User addUser(@RequestBody User user) {
		return service.addUser(user);
		
	}
	
	@GetMapping("/getUser")
	public List<User> getAllUser() {
		return service.getAllUser();
		
	}
	@GetMapping("/getUser/{work}")
	public List<User> userBasedOnWork(@PathVariable String work ) {
		return service.getUserBasedOnWork(work);
	}

}
