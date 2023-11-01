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

import project.Entity.Laptop;
import project.ServiceImpl.LaptopServiceImpl;

@RestController
public class LapyController {
	@Autowired
	private LaptopServiceImpl laptopservice;
	
	@GetMapping("/lapy")
	public List<Laptop> findAllUsers(Laptop user){
		return laptopservice.findAllUsers();
	}
	
	@GetMapping("/lapy/{id}")
	public Laptop findByid(@PathVariable int id,Laptop user) {
		return laptopservice.findbyid(id, user);
	}
	
	@PutMapping("/updatelapy/{id}")
	public Laptop updateLaptop(@PathVariable int id,@RequestBody Laptop user) {
		return laptopservice.updateLaptop(id, user);
	}
	
	@DeleteMapping("/laptop/{id}")
	public void  deleteLaptop(@PathVariable int id) {
		laptopservice.deleteLaptop(id);
	}
	
	@PostMapping("/Laptop")
	public Laptop addLapy (@RequestBody Laptop laptop) {
		return laptopservice.addLapy(laptop);
	}
}
