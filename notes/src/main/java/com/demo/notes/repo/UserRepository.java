package com.demo.notes.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.demo.notes.entity.User;

public interface UserRepository extends JpaRepository<User, Long>{
	public User findByUserName(String username);
}
