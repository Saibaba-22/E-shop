package project.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name="Laptop")
public class Laptop {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long LaptopID;
	
	@Column(name="LaptopName")
	private String LaptopName;
	
	@Column(name="LaptopDescription")
	private String Description;
	
	@Column(name="LaptopCost")
	private Long LaptopCost;
		
}
