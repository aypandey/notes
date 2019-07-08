package com.demo.notes.entity;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name="tag")
public class Tag {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	
	private String tagName;
	
	@ManyToMany(mappedBy="tags")
	private List<Note> taggedNotes;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTagName() {
		return tagName;
	}

	public void setTagName(String tagName) {
		this.tagName = tagName;
	}

	public List<Note> getTaggedNotes() {
		return taggedNotes;
	}

	public void setTaggedNotes(List<Note> taggedNotes) {
		this.taggedNotes = taggedNotes;
	}
}
