package com.krishna.books.SpringBookDemo.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.krishna.books.SpringBookDemo.Entities.User;
import com.krishna.books.SpringBookDemo.Service.UserService;


/**
 * This Service class for providing the user credentials from the database.
 * @author krishnathapa
 *
 */

@Service
public class AppUserDetailsService implements UserDetailsService{

	@Autowired
	UserService userService;

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		User user = userService.find(username);
		return  (UserDetails) user;
	}

}
