package project.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Mobile {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)	
	private Long MobileID;
	
	@Column(name="MobileName")
	private String MobileName;
	
	@Column(name="Description")
	private String MobileDescription;
	
	@Column(name="MobileCost")
	private Long Cost;
	
}
