package com.demo.notes.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.demo.notes.entity.Note;
import com.demo.notes.entity.User;
import com.demo.notes.repo.UserRepository;

@Service
public class NoteService {
	
	private UserRepository userRepo;
	
	public List<Note> getAllNotes(String username) {
		User user = userRepo.findByUserName(username);
		
		return user.getNotes();
	}
	
	public List<Note> searchGlobal(String searchText) {
		
	}
	
	public List<Note> searchInternal(String username, String searchText) {
		
	}
}
