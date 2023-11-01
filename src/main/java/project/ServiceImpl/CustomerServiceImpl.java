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
	
	public Customer signup(Customer user) {
	userdao.save(user);
	return user;
	}

	public Customer findByid(int id, Customer user) {
		user=userdao.findById(id).get();
		return user;
	}

	public Customer updateCustomer(int id, Customer user) {
		try {
			Customer upuser=userdao.findById(id).get();
			if(user.getMobile_Number()!=null){
				upuser.setMobile_Number(user.getMobile_Number());
			}
			if(user.getAddress()!=null){
				upuser.setAddress(user.getAddress());
			}
			if(user.getDate_of_Birth()!=null) {
				upuser.setDate_of_Birth(user.getDate_of_Birth());
			}
			if(user.getLast_Name()!=null) {
				upuser.setLast_Name(user.getLast_Name());
				}
			if(user.getFirst_Name()!=null) {
				upuser.setFirst_Name(user.getFirst_Name());
			}
			if(user.getGender()!=null) {
				upuser.setGender(user.getGender());
			}
			userdao.save(upuser);
			return upuser;
			}catch(Exception e) {
				throw new ResponseStatusException(HttpStatus.NOT_FOUND);
			}
	}

	public void deleteUser(int id) {
		try 
    	{
			userdao.deleteById(id);
    		throw new ResponseStatusException(HttpStatus.NO_CONTENT);
    	}
    	catch(Exception e)
    	{
    		throw new ResponseStatusException(HttpStatus.NOT_FOUND);
    	}
	}

	public List<Customer> findAllCustomer(Customer user) {
		List<Customer> Customer=userdao.findAll();
		return Customer;
	}


}
