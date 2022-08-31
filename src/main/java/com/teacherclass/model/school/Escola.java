package com.teacherclass.model.school;

import com.teacherclass.enumeration.school.Titulacao;

public class Escola {

	private Long id;
	private String name;
	private Titulacao titulacao;

	
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Titulacao getTitulacao() {
		return titulacao;
	}
	public void setTitulacao(Titulacao titulacao) {
		this.titulacao = titulacao;
	}
}
