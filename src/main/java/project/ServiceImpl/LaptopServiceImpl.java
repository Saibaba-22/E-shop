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
	
	public Laptop findbyid(Long id, Laptop laptop) {
		laptop=laptopdao.findById(id).get();
		return laptop;
	}
	
	public List<Laptop> findAllUsers() {
		List<Laptop> alllaptop=laptopdao.findAll();
		return alllaptop;
	}
	
	public Laptop deleteLaptop(Long id) {
		try 
    	{	
			Laptop laptop=laptopdao.findById(id).get();
			laptopdao.deleteById(id);
    		return laptop;
    	}
    	catch(Exception e)
    	{
    		throw new ResponseStatusException(HttpStatus.NOT_FOUND);
    	}
	}
	
	public Laptop updateLaptop(Long id,Laptop user) {
		try {
			Laptop uplaptop=laptopdao.findById(id).get();
			if(user.getLaptopName()!=null){
				uplaptop.setLaptopName(user.getLaptopName());
			}
			
			if(user.getDescription()!=null) {
				uplaptop.setDescription(user.getDescription());
			}
			if(user.getLaptopCost()!=null) {
				uplaptop.setLaptopCost(user.getLaptopCost());
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

