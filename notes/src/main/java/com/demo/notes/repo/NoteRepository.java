package com.demo.notes.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.demo.notes.entity.Note;

public interface NoteRepository extends JpaRepository<Note, Long>{
	
	public List<Note> findNotesByTag(String userName, String searchText);
	
	public List<Note> findAllNotesByTag(String searchText);
}
