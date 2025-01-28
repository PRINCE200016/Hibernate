package com.itrainu.User;

import java.util.Date;
import javax.persistence.*;

@Entity
@Table(name = "user")
public class UserDTO {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private int id;
	@Column(name = "first_name")
	private String firstName;
	@Column(name = "last_name")
	private String lastName;
	@Column(name = "login_id")
	private String loginId;
	@Column(name = "password")
	private String password;
	@Column(name = "dob")
	private Date dob;
	@Column(name = "address")
	private String address;

	// Getter and Setter for 'id'
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	// Getter and Setter for 'firstName'
	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	// Getter and Setter for 'lastName'
	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	// Getter and Setter for 'loginId'
	public String getLoginId() {
		return loginId;
	}

	public void setLoginId(String loginId) {
		this.loginId = loginId;
	}

	// Getter and Setter for 'password'
	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	// Getter and Setter for 'dob'
	public Date getDob() {
		return dob;
	}

	public void setDob(Date dob) {
		this.dob = dob;
	}

	// Getter and Setter for 'address'
	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address; // Fixed the closing brace issue
	}
}
