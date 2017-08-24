package com.amr.entities;

import java.io.Serializable;
import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

import org.hibernate.validator.constraints.NotEmpty;


/**
 * The persistent class for the Users database table.
 * 
 */
@Entity
@Table(name="Users")
@NamedQuery(name="User.findAll", query="SELECT u FROM User u")
public class User implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(unique=true, nullable=false)
	private int userId;
	@NotNull
	@NotEmpty(message="Please enter a Name")
	@Column(length=45)
	private String frstName;
	@NotNull
	@Column(length=45)
	private String lastName;
	@NotNull
	@Column(length=45)
	@Pattern(regexp=".*([a-zA-Z0-9]{4}$)",message="Password should not contains special characters")

	private String password;
	@NotNull
	@Column(length=45)
	private String userName;

	public User() {
	}

	public int getUserId() {
		return this.userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getFrstName() {
		return this.frstName;
	}

	public void setFrstName(String frstName) {
		this.frstName = frstName;
	}

	public String getLastName() {
		return this.lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getUserName() {
		return this.userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

}