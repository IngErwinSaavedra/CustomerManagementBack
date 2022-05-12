package com.acl.spring.security.crud.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "customer")
public class Customer {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;

	@Column(name = "name_customer")
	private String firstName;
	
	@Column(name = "lastname_customer")
	private String lastName;
	
	@Column(name = "email_customer")
	private String email;
	
	@Column(name = "cellphone")
	private Integer cellphone;
	
	public Customer() {
		
	}
	
	public Customer(String firstName, String lastName, String email, Integer cellphone) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.cellphone = cellphone;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Integer getCellphone() {
		return cellphone;
	}

	public void setCellphone(Integer cellphone) {
		this.cellphone = cellphone;
	}
}
