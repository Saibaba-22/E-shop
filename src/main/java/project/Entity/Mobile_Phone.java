package project.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name="Mobile-Phone")
public class Mobile_Phone {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="Mobile-ID")	
	private Long Mobile_ID;
	
	@Column(name="Mobile-Name")
	private String Mobile_Name;
	
	@Column(name="Description")
	private String Description;
	
	@Column(name="MobileCost")
	private Long Cost;
		
	public Mobile_Phone(Long mobile_ID, String mobile_Name, String description, Long cost) {
		super();
		Mobile_ID = mobile_ID;
		Mobile_Name = mobile_Name;
		Description = description;
		Cost = cost;
	}
	public Mobile_Phone() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Long getMobile_ID() {
		return Mobile_ID;
	}
	public void setMobile_ID(Long mobile_ID) {
		Mobile_ID = mobile_ID;
	}
	public String getMobile_Name() {
		return Mobile_Name;
	}
	public void setMobile_Name(String mobile_Name) {
		Mobile_Name = mobile_Name;
	}
	public String getDescription() {
		return Description;
	}
	public void setDescription(String description) {
		Description = description;
	}
	public Long getCost() {
		return Cost;
	}
	public void setCost(Long cost) {
		Cost = cost;
	}

}
