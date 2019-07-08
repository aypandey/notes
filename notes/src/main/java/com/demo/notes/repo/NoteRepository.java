package com.demo.notes.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.demo.notes.entity.Note;

public interface NoteRepository extends JpaRepository<Note, Long>{

}
