package project.ServiceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import project.Entity.Laptop;
import project.JpaRepository.LaptopJPA;

@Service
public class LaptopServiceImpl {

	@Autowired
	private LaptopJPA laptopdao;
	
	public Laptop findByiLaptop(int id, Laptop laptop) {
		laptop=laptopdao.findById(id).get();
		return laptop;
	}

	
	public Laptop findbyid(int id, Laptop laptop) {
		laptop=laptopdao.findById(id).get();
		return laptop;
	}
	
	public void deleteLaptop(int id) {
		try 
    	{
			laptopdao.deleteById(id);
    		throw new ResponseStatusException(HttpStatus.NO_CONTENT);
    	}
    	catch(Exception e)
    	{
    		throw new ResponseStatusException(HttpStatus.NOT_FOUND);
    	}
	}

	public List<Laptop> findAllUsers() {
		List<Laptop> alllaptop=laptopdao.findAll();
		return alllaptop;
	}
	
	public Laptop updateLaptop(int id,Laptop user) {
		try {
			Laptop uplaptop=laptopdao.findById(id).get();
			if(user.getLaptop_Name()!=null){
				uplaptop.setLaptop_Name(user.getLaptop_Name());
			}
			
			if(user.getDescription()!=null) {
				uplaptop.setDescription(user.getDescription());
			}
			if(user.getLaptop_Cost()!=null) {
				uplaptop.setLaptop_Cost(user.getLaptop_Cost());
			}
			laptopdao.save(uplaptop);
			return uplaptop;
			}catch(Exception e) {
				throw new ResponseStatusException(HttpStatus.NOT_FOUND);
			}
	}
	
	public Laptop addLapy (Laptop laptop) {
		laptopdao.save(laptop);
		return laptop;
	}
}

