package project.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



import project.Entity.Customer;
import project.Entity.SignIn;
import project.ServiceImpl.CustomerServiceImpl;

@RestController
@CrossOrigin
@RequestMapping("/User")

public class CustomerController {
	@Autowired
	private CustomerServiceImpl Customerservice;
		
	@GetMapping("/getusers")
	List<Customer> findAllCustomer(Customer user){
		return Customerservice.findAllCustomer(user);
	}
	
	@GetMapping("/finduser/{id}")
	Customer findByid(@PathVariable Long id,Customer user) {
		return Customerservice.findByid(id, user);
	}

	@PutMapping("/updateuser/{id}")
	Customer updateCustomer(@PathVariable Long id,@RequestBody Customer user) {
		return Customerservice.updateCustomer(id, user);
	}

	@DeleteMapping("/deleteuser/{id}")
	public void  deleteUser(@PathVariable Long id) {
		Customerservice.deleteUser(id);
	}
	
	@PostMapping("/adduser")
	Customer addUser(@RequestBody Customer user) {
		return Customerservice.addCustomer(user);
	}

}

