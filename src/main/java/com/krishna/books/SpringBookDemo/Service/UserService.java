package com.krishna.books.SpringBookDemo.Service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.krishna.books.SpringBookDemo.DAO.UserRepository;
import com.krishna.books.SpringBookDemo.Entities.User;


/**
 * 
 * @author krishnathapa
 *
 */
@Service
public class UserService {

	@Autowired
	UserRepository userRepository;
	
	public User save(User user) {
		return userRepository.saveAndFlush(user);
	}

	public User update(User user) {
		return userRepository.save(user);
	}

	public User find(String userName) {
		return userRepository.findOneByUsername(userName);
	}

	public Optional<User> find(Long id) {
		return userRepository.findById(id);
	}
}
