package com.demo.notes.repo;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.demo.notes.entity.Note;

@Repository
public interface NoteRepository extends CrudRepository<Note, Long>{
	
	public List<Note> findNotesByTag(String userName, String searchText);
	
	public List<Note> findAllNotesByTag(String searchText);
}
