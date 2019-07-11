package com.demo.notes.repo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.demo.notes.entity.User;

@Repository
public interface UserRepository extends CrudRepository<User, Long>{
	public User findByUserName(String username);
	
	public boolean isUserNameExist(String username);
}
