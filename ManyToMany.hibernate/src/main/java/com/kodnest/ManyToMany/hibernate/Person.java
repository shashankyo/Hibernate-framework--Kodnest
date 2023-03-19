package com.kodnest.ManyToMany.hibernate;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Person {

	@Id
	int P_id;
	String P_Name;
	@ManyToMany
	List<Language> l;
	public Person() {
		
		
	}
	public Person(int p_id, String p_Name, List<Language> l) {
		super();
		P_id = p_id;
		P_Name = p_Name;
		this.l = l;
	}
	public void setP_id(int p_id) {
		P_id = p_id;
	}
	public void setP_Name(String p_Name) {
		P_Name = p_Name;
	}
	public void setL(List<Language> l) {
		this.l = l;
	}
	
	
	
}
