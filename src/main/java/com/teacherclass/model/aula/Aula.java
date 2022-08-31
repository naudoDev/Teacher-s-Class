package com.teacherclass.model.aula;

import javax.swing.text.Document;

import com.teacherclass.model.teacher.Professor;

public class Aula {

	private Long id;
	private Document document;
	private Professor professor;

	
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Document getDocument() {
		return document;
	}
	public void setDocument(Document document) {
		this.document = document;
	}
	public Professor getProfessor() {
		return professor;
	}
	public void setProfessor(Professor professor) {
		this.professor = professor;
	}
}
