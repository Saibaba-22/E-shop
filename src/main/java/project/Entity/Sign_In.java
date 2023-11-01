package project.Entity;


import java.util.Date;

import jakarta.persistence.*;


@Entity
@Table(name="SignIn")
public class Sign_In extends Customer{
	
	
	@Column(name="username")
	private String UserName;
	
	@Column(name="Password")
	private String Password;

	public Sign_In(String customer_ID, String first_Name, String last_Name, String mobile_Number, String email_ID,
			String address, Date date_of_Birth, String gender, String username, String password) {
		super(customer_ID, first_Name, last_Name, mobile_Number, email_ID, address, date_of_Birth, gender, username, password);
		// TODO Auto-generated constructor stub
	}

	public Sign_In(String customer_ID, String first_Name, String last_Name, String mobile_Number, String email_ID,
			String address, Date date_of_Birth, String gender, String username, String password, String userName2,
			String password2) {
		super(customer_ID, first_Name, last_Name, mobile_Number, email_ID, address, date_of_Birth, gender, username,
				password);
		UserName = userName2;
		Password = password2;
	}

	public String getUserName() {
		return UserName;
	}

	public void setUserName(String userName) {
		UserName = userName;
	}

	public String getPassword() {
		return Password;
	}

	public void setPassword(String password) {
		Password = password;
	}

	
}
