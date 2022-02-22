package com.carmenguevara.backend.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


// Entities in JPA are nothing but POJOs (Plane old Java Objects) representing data that persisted to the database.
//and Entity represent a table store in a database. Every instance of an entity represents a row in the table.  

//Nice article: https://www.baeldung.com/jpa-entities
//If you see @Bean instead of @Entity
@Entity
@Table(name="students") //it needs to match the table
public class Student {
	
//	GENERATIONTYPE.IDENTITY indicated that the persistence provider must assign primary keys for the entity using a database identity column.
	
	@Id
	@Column
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	@Column
	private String first_name;
	@Column
	private String last_name;
	
	
	public int getId() {
		return id;
	}
	
	public String getFirst_name() {
		return first_name;
	}
	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}
	public String getLast_name() {
		return last_name;
	}
	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}
	
	

}
