package com.demo.notes.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="tag")
public class Tag implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	
	private String tagName;
	
//	@ManyToMany(mappedBy="tags")
//	private List<Note> taggedNotes;

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

	public Tag(String tagName) {
		super();
		this.tagName = tagName;
	}
	
	public Tag() {
		super();
	}

//	public List<Note> getTaggedNotes() {
//		return taggedNotes;
//	}
//
//	public void setTaggedNotes(List<Note> taggedNotes) {
//		this.taggedNotes = taggedNotes;
//	}
	
	
}
