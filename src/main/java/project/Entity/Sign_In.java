package project.Entity;


import java.util.Date;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.*;


@Entity
@Table(name="SignIn")
public class Sign_In extends Customer{
	
		
	@Column(name="username")
	private String UserName2;
	
	@Column(name="Password")
	private String Password;
	
	public Sign_In() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Sign_In(String userName2, String password) {
		super();
		UserName2 = userName2;
		Password = password;
	}

	public String getUserName2() {
		return UserName2;
	}

	public void setUserName2(String userName2) {
		UserName2 = userName2;
	}

	public String getPassword() {
		return Password;
	}

	public void setPassword(String password) {
		Password = password;
	}
}



