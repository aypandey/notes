package com.demo.notes.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.demo.notes.entity.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long>{
	public User findByUserName(String username);
	
	@Query("select count(*) from User u where u.userName like ?1")
	public int isUserNameExist(String username);
}
