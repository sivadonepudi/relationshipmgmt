/**
 * 
 */
package com.relationship.repository;

import org.springframework.data.repository.CrudRepository;

import com.relationship.model.User;

/**
 * @author sidonepudi
 *
 */
public interface UserRepository extends CrudRepository<User, Integer> {
	public User findByEmail(String email);

}
