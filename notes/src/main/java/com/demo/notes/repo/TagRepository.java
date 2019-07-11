package com.demo.notes.repo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.demo.notes.entity.Tag;

@Repository
public interface TagRepository extends CrudRepository<Tag, Long>{

}
