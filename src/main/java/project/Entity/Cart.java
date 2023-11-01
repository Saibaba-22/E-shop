package project.Entity;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name="Cart")
public class Cart {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="Cart-ID")	
	private String Cart_ID;
	
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
	private String Over_All_Cost;
	
	@JsonIgnore
	@OneToMany
	private List<Laptop> laptops;
	
	@JsonIgnore
	@OneToMany
	private List<Mobile_Phone> mobiles;
	
	@JsonIgnore
	@OneToOne
	private Customer user;
	
	public Cart(String cart_ID, String user_ID, String product_ID, String product_Name, String product_Cost,
			String quantity, String over_All_Cost) {
		super();
		Cart_ID = cart_ID;
		User_ID = user_ID;
		Product_ID = product_ID;
		Product_Name = product_Name;
		Product_Cost = product_Cost;
		Quantity = quantity;
		Over_All_Cost = over_All_Cost;
	}
	public Cart() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getCart_ID() {
		return Cart_ID;
	}
	public void setCart_ID(String cart_ID) {
		Cart_ID = cart_ID;
	}
	public String getUser_ID() {
		return User_ID;
	}
	public void setUser_ID(String user_ID) {
		User_ID = user_ID;
	}
	public String getProduct_ID() {
		return Product_ID;
	}
	public void setProduct_ID(String product_ID) {
		Product_ID = product_ID;
	}
	public String getProduct_Name() {
		return Product_Name;
	}
	public void setProduct_Name(String product_Name) {
		Product_Name = product_Name;
	}
	public String getProduct_Cost() {
		return Product_Cost;
	}
	public void setProduct_Cost(String product_Cost) {
		Product_Cost = product_Cost;
	}
	public String getQuantity() {
		return Quantity;
	}
	public void setQuantity(String quantity) {
		Quantity = quantity;
	}
	public String getOver_All_Cost() {
		return Over_All_Cost;
	}
	public void setOver_All_Cost(String over_All_Cost) {
		Over_All_Cost = over_All_Cost;
	}
	
	

}
