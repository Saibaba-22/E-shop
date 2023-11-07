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



import project.Entity.Customer;
import project.ServiceImpl.CustomerServiceImpl;

@RestController
public class CustomerController {
	@Autowired
	private CustomerServiceImpl Customerervice;
		
	@GetMapping("/customers")
	List<Customer> findAllCustomer(Customer user){
		return Customerervice.findAllCustomer(user);
	}
	
	@PostMapping("/sigup")
	Customer signup(@RequestBody Customer user) {
		return Customerervice.signup(user);
	}
	
	@GetMapping("/Customer/{id}")
	Customer findByid(@PathVariable Long id,Customer user) {
		return Customerervice.findByid(id, user);
	}
	
	@PutMapping("/updateuser/{id}")
	Customer updateCustomer(@PathVariable Long id,@RequestBody Customer user) {
		return Customerervice.updateCustomer(id, user);
	}
	
	@DeleteMapping("/user/{id}")
	public void  deleteUser(@PathVariable Long id) {
		Customerervice.deleteUser(id);
	}


	
}
