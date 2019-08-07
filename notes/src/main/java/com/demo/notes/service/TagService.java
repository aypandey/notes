package com.demo.notes.service;

import org.springframework.beans.factory.annotation.Autowired;

import com.demo.notes.entity.Tag;
import com.demo.notes.repo.TagRepository;

public class TagService {

	@Autowired
	private TagRepository tagRepository;
	
	public Tag createTag(Tag tag) {
		return tagRepository.save(tag);
	}
}
