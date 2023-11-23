package project.Entity;

import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.*;

@Data
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="Customer")
@Inheritance
public class Customer {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)	
	private Long CustomerID;

	@Column(name="FirstName", length = 10)
	private String FirstName;
	
	@Column(name="LastName", length= 20)
	private String LastName;
	
	@Column(name="MobileNumber", length= 15)
	private String MobileNumber;

	@Column(name="EmailID", length= 20)
	private String EmailID;	
	
	@Column(name = "Address", length= 50)
	private String Address;
	
	@Column(name = "DateofBirth")
	private String DateofBirth;
	
	@Column(name="Gender" , length=6)
	private String Gender;
		

}


