package com.kodnest.twotable.hibernate;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Laptop {

	@Id
	int l_id;
	String l_brand;
	public Laptop(int l_id, String l_brand) {
		super();
		this.l_id = l_id;
		this.l_brand = l_brand;
	}
	
	
}
