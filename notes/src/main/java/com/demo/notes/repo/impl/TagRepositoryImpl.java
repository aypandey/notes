package com.demo.notes.repo.impl;

import java.util.Optional;

import org.springframework.stereotype.Component;

import com.demo.notes.entity.Tag;
import com.demo.notes.repo.TagRepository;

@Component
public class TagRepositoryImpl implements TagRepository{

	@Override
	public long count() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void delete(Tag arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteAll() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteAll(Iterable<? extends Tag> arg0) {
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
	public Iterable<Tag> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Iterable<Tag> findAllById(Iterable<Long> arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Optional<Tag> findById(Long arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends Tag> S save(S arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends Tag> Iterable<S> saveAll(Iterable<S> arg0) {
		// TODO Auto-generated method stub
		return null;
	}

}
