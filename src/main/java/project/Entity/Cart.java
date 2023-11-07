package project.Entity;

import java.util.Set;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.JoinColumn;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name="Cart")
public class Cart {
	
	@Id
	@Column(name="Cart-ID")	
	private Long Cart_ID;
	
	@Column(name="UserID")
	private String User_ID;
	
	@Column(name="ProductID")
	private String Product_ID;
	
	@Column(name="Product-Name")
	private String Product_Name;
	
	@Column(name="Product-Cost")
	private String Product_Cost;
	
	@Column(name="Quantity")
	private String Quantity;
	
	@Column(name="Over-all_cost")
	private Long Over_All_Cost;
	
	@JsonIgnore
	@ManyToMany
	@JoinTable(
			joinColumns =@JoinColumn(name="cart_id"),
			inverseJoinColumns=@JoinColumn(name="Laptop_id"))
	private Set<Laptop> laptops;
	
	@JsonIgnore
	@ManyToMany
	@JoinTable(
			joinColumns =@JoinColumn(name="cart_id"),
			inverseJoinColumns=@JoinColumn(name="mobile_id"))
	private Set<Mobile_Phone> mobiles;
	
	@JsonIgnore
	@OneToOne
	private Customer user;

}
