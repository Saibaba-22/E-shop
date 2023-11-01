package project.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import project.Entity.Cart;
import project.ServiceImpl.CartServiceImpl;

@RestController
public class Cartcontroller {

	@Autowired
	private CartServiceImpl cartservice;
	
	@GetMapping("/carts")
	public List<Cart> findAllUsers(Cart user){
		return cartservice.findAllCart(user);
	}
	
	@GetMapping("/cart/{id}")
	public Cart findByid(@PathVariable int id,Cart user) {
		return cartservice.findByid(id, user);
	}
	
	@PutMapping("/updatecart/{id}")
	public Cart updateCart(@PathVariable int id,@RequestBody Cart user) {
		return cartservice.updateUsers(id, user);
	}
	
	@DeleteMapping("/cart/{id}")
	public void  deleteCart(@PathVariable int id) {
		cartservice.deleteCart(id);
	}
	
	@PostMapping("/carts")
	public Cart addcart(@RequestBody Cart cart) {
		return cartservice.addcart(cart);
	}
}
