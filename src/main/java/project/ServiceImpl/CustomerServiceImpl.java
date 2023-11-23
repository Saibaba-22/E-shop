package project.ServiceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import project.Entity.Customer;
import project.JpaRepository.CustomerJpa;

@Service
public class CustomerServiceImpl {
	@Autowired
	private CustomerJpa userdao;

	public List<Customer> findAllCustomer(Customer user) {
		List<Customer> Customer=userdao.findAll();
		return Customer;
	}

	public Customer findByid(Long id, Customer user) {
		user=userdao.findById(id).get();
		return user;
	}

	public Customer addCustomer(Customer user) {
		userdao.save(user);
		return user;
	}

	public Customer updateCustomer(Long id, Customer user) {
		try {
			Customer upuser=userdao.findById(id).get();
			if(user.getFirstName()!=null){
				upuser.setMobileNumber(user.getMobileNumber());
			}
			if(user.getAddress()!=null){
				upuser.setAddress(user.getAddress());
			}
			if(user.getDateofBirth()!=null) {
				upuser.setDateofBirth(user.getDateofBirth());
			}
			if(user.getLastName()!=null){
				upuser.setLastName(user.getLastName());
			}
			if(user.getFirstName()!=null) {
				upuser.setFirstName(user.getFirstName());
			}
			userdao.save(upuser);
			return upuser;
			}catch(Exception e) {
				throw new ResponseStatusException(HttpStatus.NOT_FOUND);
			}
	}

	public Customer deleteUser(Long id) {
		try 
    	{
			Customer user=userdao.findById(id).get();
			userdao.deleteById(id);
    		return user;
    	}
    	catch(Exception e)
    	{
    		throw new ResponseStatusException(HttpStatus.NOT_FOUND);
    	}
	}

}
