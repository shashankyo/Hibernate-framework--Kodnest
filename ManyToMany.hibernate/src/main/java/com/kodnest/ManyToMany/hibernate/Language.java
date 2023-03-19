package com.kodnest.ManyToMany.hibernate;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Language {

	@Id
	int L_id;
	String L_Name;
	@ManyToMany
	List<Person> P;
	public Language() {
		super();
		
	}
	public Language(int l_id, String l_Name, List<Person> p) {
		super();
		L_id = l_id;
		L_Name = l_Name;
		P = p;
	}
	public void setL_id(int l_id) {
		L_id = l_id;
	}
	public void setL_Name(String l_Name) {
		L_Name = l_Name;
	}
	public void setP(List<Person> p) {
		P = p;
	}
	
	
	
	
}
