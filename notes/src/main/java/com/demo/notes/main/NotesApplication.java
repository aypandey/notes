package com.demo.notes.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@ComponentScan(basePackages="com.demo.notes.*")
@EnableJpaRepositories("com.demo.notes.repo")
@EntityScan("com.demo.notes.entity")
public class NotesApplication {

	public static void main(String[] args) {
		SpringApplication.run(NotesApplication.class, args);
	}

}
