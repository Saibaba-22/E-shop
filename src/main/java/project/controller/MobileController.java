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

import project.Entity.Mobile_Phone;
import project.ServiceImpl.Mobile_PhoneServiceImpl;

@RestController
public class MobileController {
	@Autowired
	private Mobile_PhoneServiceImpl phoneservice;
	
	@GetMapping("/phone}")
	public List<Mobile_Phone> findAllmobiles(Mobile_Phone mobile){
		return phoneservice.findAllmobiles(mobile);
	}
	
	@GetMapping("/phone/{id}")
	public Mobile_Phone findByid(@PathVariable int id,Mobile_Phone mobile) {
		return phoneservice.findByid(id, mobile);
	}
	
	@PutMapping("/updatephone/{id}")
	public Mobile_Phone updateMobile_Phone(@PathVariable int id,@RequestBody Mobile_Phone mobile) {
		return phoneservice.updateMobile_Phone(id, mobile);
	}
	
	@DeleteMapping("/Phone/{id}")
	public String deleteMobile_Phone(@PathVariable int id) {
		return phoneservice.deleteMobile_Phone(id);
	}
	
	@PostMapping("/Phone")
	public Mobile_Phone addphone(@RequestBody Mobile_Phone phone) {
		return phoneservice.addphone(phone);
	}
}
