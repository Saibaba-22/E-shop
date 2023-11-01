package project.ServiceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import project.Entity.Cart;
import project.JpaRepository.CartJPA;

@Service
public class CartServiceImpl {

	@Autowired
	private CartJPA cartdao;
	
	public Cart findByid(int id, Cart cart) {
		cart=cartdao.findById(id).get();
		return cart;
	}
	
	public Cart updateUsers(int id, Cart cart) {
		try {
			Cart upcart=cartdao.findById(id).get();
			if(upcart.getProduct_ID()!=null) {
				upcart.setProduct_ID(upcart.getProduct_ID());
			}
			if(upcart.getQuantity()!=null) {
				upcart.setQuantity(upcart.getQuantity());
				}
			if(upcart.getProduct_Cost()!=null) {
				upcart.setProduct_Cost(upcart.getProduct_Cost());
			}
			if(upcart.getOver_All_Cost()!=null) {
				upcart.setOver_All_Cost(upcart.getOver_All_Cost());
			}
			cartdao.save(upcart);
			return upcart;
			}catch(Exception e) {
				throw new ResponseStatusException(HttpStatus.NOT_FOUND);
			}
	}

	public void deleteCart(int id) {
		try 
    	{
			cartdao.deleteById(id);
    		throw new ResponseStatusException(HttpStatus.NO_CONTENT);
    	}
    	catch(Exception e)
    	{
    		throw new ResponseStatusException(HttpStatus.NOT_FOUND);
    	}
	}

	public List<Cart> findAllCart(Cart cart) {
		List<Cart> carts=cartdao.findAll();
		return carts;
	}
	
	public Cart addcart(Cart cart) {
		cartdao.save(cart);
		return cart;
	}

}
