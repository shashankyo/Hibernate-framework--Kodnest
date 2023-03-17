package com.kodnest.twotableBidirection.hibernate;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Student1 {
	@Id
	int id;
	String name;
	@OneToOne
	Laptop1 l_id;
	public Student1(int id, String name, Laptop1 l_id) {
		super();
		this.id = id;
		this.name = name;
		this.l_id = l_id;
	}

}
