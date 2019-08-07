package com.demo.notes.repo;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.demo.notes.entity.Note;

@Repository
public interface NoteRepository extends CrudRepository<Note, Long>{
	
	@Query("select * from Note n where n.author like ?1 and ")
	public List<Note> findNotesByTag(String userName, String searchText);
	
	@Query("select * from Note n where n.author like ?1 and ")
	public List<Note> findAllNotesByTag(String searchText);
}
