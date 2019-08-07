package com.demo.notes.model;

import java.util.Set;

public class NoteDTO {
	
	private String content;
	private Set<TagDTO> listTags;
	
	public NoteDTO() {
		super();
	}
	
	public NoteDTO(String content, Set<TagDTO> listTags) {
		super();
		this.content = content;
		this.listTags = listTags;
	}
	
	public String getContent() {
		return content;
	}
	
	public void setContent(String content) {
		this.content = content;
	}
	
	public Set<TagDTO> getListTags() {
		return listTags;
	}
	
	public void setListTags(Set<TagDTO> listTags) {
		this.listTags = listTags;
	}
}
