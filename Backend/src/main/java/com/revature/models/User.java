package com.revature.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

@Entity
@Table(name ="users")
@Component
public class User {
	
	@Id
	@GeneratedValue(strategy =GenerationType.IDENTITY)
	private int id;
	@Column
	private String username;
	@Column
	private String password;
	@Column
	private String first_name;
	@Column
	private String last_name;
	@Column
	private String email;
	
	
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}

	//retrieving from DB
	public User(int id, String username, String password, String first_name, String last_name, String email) {
		super();
		this.id = id;
		this.username = username;
		this.password = password;
		this.first_name = first_name;
		this.last_name = last_name;
		this.email = email;
	}
	
	//inserting into DB
	public User(String username, String password, String first_name, String last_name, String email) {
		super();
		this.username = username;
		this.password = password;
		this.first_name = first_name;
		this.last_name = last_name;
		this.email = email;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", username=" + username + ", password=" + password + ", first_name=" + first_name
				+ ", last_name=" + last_name + ", email=" + email + "]";
	}
	
	
	

}
