package org.vgl.service.data.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.vgl.service.data.model.User;


/**
 * 
 * @author Cloude
 *
 */
public interface UserDao extends CrudRepository<User, Long> {
	
	List<User> findByEmail(String email);
}
