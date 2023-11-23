package project.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import project.Entity.Laptop;
import project.ServiceImpl.LaptopServiceImpl;

@RestController
@CrossOrigin
@RequestMapping("/Lapy")

public class LapyController {
	@Autowired
	private LaptopServiceImpl laptopservice;
	
	@GetMapping("/getalllapy")
	public List<Laptop> findAllUsers(Laptop user){
		return laptopservice.findAllUsers();
	}
	
	@GetMapping("/findlapy/{id}")
	public Laptop findByid(@PathVariable Long id,Laptop user) {
		return laptopservice.findbyid(id, user);
	}
	
	@PutMapping("/updatelapy/{id}")
	public Laptop updateLaptop(@PathVariable Long id,@RequestBody Laptop user) {
		return laptopservice.updateLaptop(id, user);
	}
	
	@DeleteMapping("/deletelapy/{id}")
	public Laptop  deleteLaptop(@PathVariable Long id) {
		return laptopservice.deleteLaptop(id);
	}
	
	@PostMapping("/addlapy")
	public Laptop addLapy (@RequestBody Laptop laptop) {
		return laptopservice.addLapy(laptop);
	}
	
}
