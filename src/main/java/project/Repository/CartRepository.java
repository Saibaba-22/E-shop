package project.Repository;

import java.util.List;

import project.Entity.Cart;


public interface CartRepository {
	public List<Cart> findAllUsers(Cart user);
	public Cart findByid(Long id,Cart user);
	public Cart updateCart(Long id,Cart user);
	public void  deleteCart(Long id);
	public Cart addcart(Cart cart);
}

/*
public Users signup(Users user);
public Users login(String username, String userpassword);
*/