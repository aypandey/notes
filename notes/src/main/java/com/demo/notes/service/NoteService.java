package com.demo.notes.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.notes.entity.Note;
import com.demo.notes.repo.NoteRepository;

@Service
public class NoteService {
	
	@Autowired
	private NoteRepository noteRepository;
	
	public List<Note> getAllNotes(String username) {
		return null;
	}
	
	public List<Note> searchGlobal(String searchText) {
		return noteRepository.findAllNotesByTag(searchText);
	}
	
	public List<Note> searchInternal(String userName, String searchText) {
		return noteRepository.findNotesByTag(userName, searchText);
	}
}
