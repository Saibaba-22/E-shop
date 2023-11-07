package project.Entity;

import java.util.Date;
import java.util.Set;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Inheritance;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Data
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="Customeruser")
@Inheritance
public class Customer {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="Customer-ID")	
	private Long Customer_ID;

	@Column(name="First-Name", length = 10)
	private String First_Name;
	
	@Column(name="Last-Name", length= 20)
	private String Last_Name;
	
	@Column(name="Mobile-Number", length= 15)
	private String Mobile_Number;

	@Column(name="Email-ID", length= 20)
	private String Email_ID;	
	
	@Column(name = "Address", length= 50)
	private String Address;
	
	@Column(name = "Date-of-Birth")
	private Date Date_of_Birth;
	
	@Column(name="Gender" , length=6)
	private String Gender;
		
	public Customer(Long customer_ID2, String first_Name, String last_Name, String mobile_Number, String email_ID,
			String address, Date date_of_Birth, String gender, String username, String password) {
		Customer_ID = customer_ID2;
		First_Name = first_Name;
		Last_Name = last_Name;
		Mobile_Number = mobile_Number;
		Email_ID = email_ID;
		Address = address;
		Date_of_Birth = date_of_Birth;
		Gender = gender;

	}

	
	public Long getCustomer_ID() {
		return Customer_ID;
	}

	public void setCustomer_ID(Long customer_ID) {
		Customer_ID = customer_ID;
	}

	public String getFirst_Name() {
		return First_Name;
	}

	public void setFirst_Name(String first_Name) {
		First_Name = first_Name;
	}

	public String getLast_Name() {
		return Last_Name;
	}

	public void setLast_Name(String last_Name) {
		Last_Name = last_Name;
	}

	public String getMobile_Number() {
		return Mobile_Number;
	}

	public void setMobile_Number(String mobile_Number) {
		Mobile_Number = mobile_Number;
	}

	public String getEmail_ID() {
		return Email_ID;
	}

	public void setEmail_ID(String email_ID) {
		Email_ID = email_ID;
	}

	public String getAddress() {
		return Address;
	}

	public void setAddress(String address) {
		Address = address;
	}

	public Date getDate_of_Birth() {
		return Date_of_Birth;
	}

	public void setDate_of_Birth(Date date_of_Birth) {
		Date_of_Birth = date_of_Birth;
	}

	public String getGender() {
		return Gender;
	}

	public void setGender(String gender) {
		Gender = gender;
	}
		
}


/* 

@Column(name="UserName", length=15)
private String Username;

	public String getUsername() {
		return Username;
	}

	public void setUsername(String username) {
		Username = username;
	}

*/