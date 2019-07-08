package com.demo.notes.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.demo.notes.entity.Note;
import com.demo.notes.entity.User;
import com.demo.notes.repo.NoteRepository;
import com.demo.notes.repo.UserRepository;

@Service
public class NoteService {
	
	private UserRepository userRepo;
	
	private NoteRepository noteRepository;
	
	public List<Note> getAllNotes(String username) {
		User user = userRepo.findByUserName(username);
		
		return user.getNotes();
	}
	
	public List<Note> searchGlobal(String searchText) {
		return noteRepository.findAllNotesByTag(searchText);
	}
	
	public List<Note> searchInternal(String userName, String searchText) {
		return noteRepository.findNotesByTag(userName, searchText);
	}
}
