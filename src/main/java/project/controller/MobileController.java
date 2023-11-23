package project.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import project.Entity.Mobile;
import project.ServiceImpl.MobilePhoneServiceImpl;

@RestController
@CrossOrigin
@RequestMapping("/Mobile")
public class MobileController {
	@Autowired
	private MobilePhoneServiceImpl phoneservice;
	
	@GetMapping("/getallphones")
	public List<Mobile> findAllmobiles(Mobile mobile){
		return phoneservice.findAllmobiles(mobile);
	}
	
	@GetMapping("/findphone/{id}")
	public Mobile findByid(@PathVariable Long id,Mobile mobile) {
		return phoneservice.findByid(id, mobile);
	}
	
	@PutMapping("/updatephone/{id}")
	public Mobile updateMobilePhone(@PathVariable Long id,@RequestBody Mobile mobile) {
		return phoneservice.updateMobilePhone(id, mobile);
	}
	
	@DeleteMapping("/deletephone/{id}")
	public Mobile deleteMobilePhone(@PathVariable Long id) {
		return phoneservice.deleteMobilePhone(id);
	}
	
	@PostMapping("/addphone")
	public Mobile addphone(@RequestBody Mobile phone) {
		return phoneservice.addphone(phone);
	}
}
