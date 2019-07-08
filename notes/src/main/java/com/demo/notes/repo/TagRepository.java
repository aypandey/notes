package com.demo.notes.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.demo.notes.entity.Tag;

public interface TagRepository extends JpaRepository<Tag, Long>{

}
