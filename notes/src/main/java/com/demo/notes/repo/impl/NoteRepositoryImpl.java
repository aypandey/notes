package com.demo.notes.repo.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Component;

import com.demo.notes.entity.Note;
import com.demo.notes.repo.NoteRepository;

@Component
public class NoteRepositoryImpl implements NoteRepository{

	@Override
	public long count() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void delete(Note arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteAll() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteAll(Iterable<? extends Note> arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteById(Long arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean existsById(Long arg0) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Iterable<Note> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Iterable<Note> findAllById(Iterable<Long> arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Optional<Note> findById(Long arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends Note> S save(S arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends Note> Iterable<S> saveAll(Iterable<S> arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Note> findNotesByTag(String userName, String searchText) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Note> findAllNotesByTag(String searchText) {
		// TODO Auto-generated method stub
		return null;
	}

}
