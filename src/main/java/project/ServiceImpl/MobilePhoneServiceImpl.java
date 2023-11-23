package project.ServiceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import jakarta.transaction.Transactional;
import project.Entity.Mobile;
import project.JpaRepository.MobilePhoneJPA;

@Service
public class MobilePhoneServiceImpl {

	@Autowired
	public MobilePhoneJPA mobilephonedao;
	
	@Transactional
	public List<Mobile> findAllmobiles(Mobile mobile) {
		List<Mobile> mobile1=mobilephonedao.findAll();
		return mobile1;
	}

	@Transactional
	public Mobile findByid(Long id,Mobile mobile) {
		mobile=mobilephonedao.findById(id).get();
		return mobile;
	}

	@Transactional
	public Mobile addphone(Mobile phone) {
		mobilephonedao.save(phone);
		return phone;
	}

	@Transactional
	public Mobile deleteMobilePhone(Long id) {
		try 
		{
			Mobile phone=mobilephonedao.findById(id).get();
			mobilephonedao.deleteById(id);
    		return phone;
    	}
    	catch(Exception e)
    	{
    		throw new ResponseStatusException(HttpStatus.NOT_FOUND);
    	}
	}
	
	@Transactional
	public Mobile updateMobilePhone(Long id,Mobile mobile) {
		try {
			Mobile upphone=mobilephonedao.findById(id).get();
			if(mobile.getMobileName()!=null) {
				upphone.setMobileName(mobile.getMobileName());
			}
			if(mobile.getMobileDescription()!=null) {
				upphone.setMobileDescription(mobile.getMobileDescription());
			}
			if(mobile.getCost()!=null) {
				upphone.setCost(mobile.getCost());
			}
			mobilephonedao.save(upphone);
			return upphone;
			}catch(Exception e) {
				throw new ResponseStatusException(HttpStatus.NOT_FOUND);
			}

		}
}
	

