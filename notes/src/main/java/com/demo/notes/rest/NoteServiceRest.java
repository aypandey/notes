package com.demo.notes.rest;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import javax.ws.rs.core.MediaType;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.demo.notes.entity.Note;
import com.demo.notes.entity.Tag;
import com.demo.notes.entity.User;
import com.demo.notes.model.NoteDTO;
import com.demo.notes.model.TagDTO;
import com.demo.notes.service.NoteService;
import com.demo.notes.service.TagService;

@RestController
@RequestMapping("/{username}")
public class NoteServiceRest {
	
	@Autowired
	private NoteService noteService;
	
	@Autowired
	private TagService tagService;
	
	@RequestMapping("/createnote")
	@PostMapping(consumes = MediaType.APPLICATION_JSON)
	public Note createNote(@RequestBody NoteDTO note, User author) {
		Set<TagDTO> listTags = note.getListTags();
		Note newNote = new Note(note.getContent(), author);
		List<Tag> tags = new ArrayList<Tag>();
		for(TagDTO dto: listTags) {
			Tag tag = new Tag(dto.getTagName());
			tagService.createTag(tag);
			tags.add(tag);
		}
		newNote.setTags(tags);
		return noteService.createNote(newNote);
	}
	
}
