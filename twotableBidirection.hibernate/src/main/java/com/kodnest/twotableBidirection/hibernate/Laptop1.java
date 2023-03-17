package com.kodnest.twotableBidirection.hibernate;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
@Entity
public class Laptop1 {
	@Id
	int l_id;
	String l_name;
	@OneToOne
	Student1 st;

	public void setL_id(int l_id) {
		this.l_id = l_id;
	}
	public void setL_name(String l_name) {
		this.l_name = l_name;
	}
	public void setSt(Student1 st) {
		this.st = st;
	}
	
	
}
