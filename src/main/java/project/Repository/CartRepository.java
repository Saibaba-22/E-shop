package project.Repository;

import java.util.List;

import project.Entity.Cart;


public interface CartRepository {
	public List<Cart> findAllUsers(Cart user);
	public Cart findByid(int id,Cart user);
	public Cart updateCart(int id,Cart user);
	public void  deleteCart(int id);
	public Cart addcart(Cart cart);
}

/*
public Users signup(Users user);
public Users login(String username, String userpassword);
*/