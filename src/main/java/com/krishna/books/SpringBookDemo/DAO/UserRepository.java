package com.krishna.books.SpringBookDemo.DAO;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.krishna.books.SpringBookDemo.Entities.User;

/**
 * this the user  Repository interface 
 * @author krishnathapa
 *
 */
@Repository
public interface UserRepository extends JpaRepository<User, Long>{

	public User findOneByUsername(String username);

	public Optional<User> findById(Long id);
}
