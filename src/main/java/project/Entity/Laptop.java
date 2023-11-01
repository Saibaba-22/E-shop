package project.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name="Laptop")
public class Laptop {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="Laptop-ID")	
	private String Laptop_ID;
	
	@Column(name="Laptop-Name")
	private String Laptop_Name;
	
	@Column(name="Description")
	private String Description;
	
	@Column(name="Laptop-Cost")
	private String Laptop_Cost;
	public Laptop() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Laptop(String laptop_ID, String laptop_Name, String description, String laptop_Cost) {
		super();
		Laptop_ID = laptop_ID;
		Laptop_Name = laptop_Name;
		Description = description;
		Laptop_Cost = laptop_Cost;
	}
	public String getLaptop_ID() {
		return Laptop_ID;
	}
	public void setLaptop_ID(String laptop_ID) {
		Laptop_ID = laptop_ID;
	}
	public String getLaptop_Name() {
		return Laptop_Name;
	}
	public void setLaptop_Name(String laptop_Name) {
		Laptop_Name = laptop_Name;
	}
	public String getDescription() {
		return Description;
	}
	public void setDescription(String description) {
		Description = description;
	}
	public String getLaptop_Cost() {
		return Laptop_Cost;
	}
	public void setLaptop_Cost(String laptop_Cost) {
		Laptop_Cost = laptop_Cost;
	}
	
	

}
