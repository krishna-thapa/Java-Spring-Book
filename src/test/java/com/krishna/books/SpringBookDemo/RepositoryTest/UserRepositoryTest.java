package com.krishna.books.SpringBookDemo.RepositoryTest;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.Assert.*;
import static org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase.Replace.NONE;

import java.util.Optional;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringRunner;

import com.krishna.books.SpringBookDemo.DAO.UserRepository;
import com.krishna.books.SpringBookDemo.Entities.User;


@ActiveProfiles("test")
@RunWith(SpringRunner.class)
@DataJpaTest
@AutoConfigureTestDatabase(replace = NONE)
public class UserRepositoryTest {

	@Autowired
	private TestEntityManager entityManager;
	@Autowired
	private UserRepository userRepository;

	@Test
	public void testSave() {
		User user = new User();
		user.setUsername("user.user");
		user.setFullName("kamalbberriga");
		user.setPassword("don");
		user.setRole("USER");
		entityManager.persist(user);
		entityManager.flush();
		// when
		Optional<User> testUser = userRepository.findById(user.getId());
		// then
		System.out.println("------------"+testUser.get().getFullName());
		//assertThat(testUser.get().getFullName().isEqualTo(user.getFullName()));
		assertEquals(testUser.get().getFullName(),user.getFullName());
	}


	// test method for the findOneByUsername
    @Test
    public void findOneByUsername() {
		User user = new User();
		user.setUsername("user.user");
		user.setFullName("kamalbberriga");
		user.setPassword("don");
		user.setRole("USER");
        entityManager.persist(user);

        User testUser = userRepository.findOneByUsername(user.getUsername());
		// then
		assertThat(testUser.getUsername()).isEqualTo(user.getUsername());
    }
	
	

}
