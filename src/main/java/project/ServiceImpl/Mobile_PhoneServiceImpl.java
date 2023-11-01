package project.ServiceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import project.Entity.Mobile_Phone;
import project.JpaRepository.Mobile_PhoneJPA;

@Service
public class Mobile_PhoneServiceImpl {

	@Autowired
	private Mobile_PhoneJPA phonedao;
	
	public List<Mobile_Phone> findAllmobiles(Mobile_Phone mobile) {
		List<Mobile_Phone> nmobile=phonedao.findAll();
		return nmobile;
	}
	
	public String deleteMobile_Phone(int id) {
		try 
    	{
			phonedao.deleteById(id);
    		return ("phone removed");
    	}
    	catch(Exception e)
    	{
    		throw new ResponseStatusException(HttpStatus.NOT_FOUND);
    	}
	}

	public Mobile_Phone findByid(int id,Mobile_Phone mobile) {
		mobile=phonedao.findById(id).get();
		return mobile;
	}
	
	public Mobile_Phone updateMobile_Phone(int id,Mobile_Phone mobile) {
		try {
			Mobile_Phone upphone=phonedao.findById(id).get();
			if(mobile.getMobile_Name()!=null){
				upphone.setMobile_Name(mobile.getMobile_Name());
			}
			if(mobile.getDescription()!=null){
				upphone.setDescription(mobile.getDescription());
			}
			if(mobile.getCost()!=null) {
				upphone.setCost(mobile.getCost());
			}
			phonedao.save(upphone);
			return upphone;
			}catch(Exception e) {
				throw new ResponseStatusException(HttpStatus.NOT_FOUND);
			}
	}
	
	public Mobile_Phone addphone(Mobile_Phone phone) {
		phonedao.save(phone);
		return phone;
	}
}
