package com.teacherclass.model.teacher;

import java.util.ArrayList;
import java.util.List;

import com.teacherclass.model.aula.Aula;
import com.teacherclass.model.school.Escola;

public class Professor {

	private Long id;
	private String name;
	private List<Aula> aulas = new ArrayList<>();
	private Escola escola;
	private String email;
	private String password;

	
	
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
	public List<Aula> getAulas() {
		return aulas;
	}
	public void setAulas(List<Aula> aulas) {
		this.aulas = aulas;
	}
	public Escola getEscola() {
		return escola;
	}
	public void setEscola(Escola escola) {
		this.escola = escola;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
}
