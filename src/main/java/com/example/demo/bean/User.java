package com.example.demo.bean;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;

import lombok.Data;

@Entity
@Table(name = "users")
@Data
public class User {

	@NotBlank
	private String firstname;;

	@NotBlank
	private String lastName;

	@Column(name = "registration_Date_Time")
	private LocalDateTime regDate;

	@NotEmpty
	@Email
	@Id
	private String email;

	@NotEmpty
	private String password;

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	private String role;

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

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public LocalDateTime getRegDate() {
		return regDate;
	}

	public void setRegDate(LocalDateTime date) {
		this.regDate = date;
	}

	@Override
	public String toString() {
		return "User [firstname=" + firstname + ", lastName=" + lastName + ", regDate=" + regDate + ", email=" + email
				+ ", password=" + password + ", role=" + role + "]";
	}

}
