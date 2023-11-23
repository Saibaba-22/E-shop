package project.Entity;



import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

@Data
@Entity
public class SignIn extends Customer{
	
	@NotNull
	@Column(name="Username", unique=true)
	private String userName;
	
	@NotNull
	@Column(name="Password", unique=true)
	private String password;
	
	public SignIn() {
		super();
		// TODO Auto-generated constructor stub
	}

	public SignIn(String userName, String password) {
		super();
		userName = this.userName;
		password = this.password;
	}

	public SignIn(Long CustomerID, String FirstName, 
			String LastName, String MobileNumber, String EmailID,
			String Address, String DateofBirth, String Gender) {
		super(CustomerID, FirstName, LastName, MobileNumber, 
				EmailID, Address, DateofBirth, Gender);
		// TODO Auto-generated constructor stub
	}
	
	
	
}

