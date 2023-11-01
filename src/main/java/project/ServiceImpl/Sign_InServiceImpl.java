package project.ServiceImpl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import project.Entity.Sign_In;
import project.JpaRepository.Sign_InJPA;

@Service
public class Sign_InServiceImpl {
	@Autowired
	private Sign_InJPA signindao;
	
	public Sign_In findByid(int id, Sign_In user) {
		user=signindao.findById(id).get();
		return user;
	}
	
//	
	public Sign_In updateUsers(int id,Sign_In user) {
		try {
			Sign_In upsignin=signindao.findById(id).get();
			if(upsignin.getUserName()!=null) {
				upsignin.setUserName(user.getUserName());
			}
			if(upsignin.getPassword()!=null) {
				upsignin.setPassword(user.getPassword());
				}
			signindao.save(upsignin);
			return upsignin;
			}catch(Exception e) {
				throw new ResponseStatusException(HttpStatus.NOT_FOUND);
			}
	}
	public void deleteSign_in(int id) {
		try 
    	{
			signindao.deleteById(id);
    		throw new ResponseStatusException(HttpStatus.NO_CONTENT);
    	}
    	catch(Exception e)
    	{
    		throw new ResponseStatusException(HttpStatus.NOT_FOUND);
    	}
	}

	public Sign_In signup(Sign_In user) {
	    signindao.save(user);
	    return user;
	}

	
	public void deleteUser(int id) {
		try 
    	{
			signindao.existsById(id);
    		throw new ResponseStatusException(HttpStatus.NO_CONTENT);
    	}
    	catch(Exception e)
    	{
    		throw new ResponseStatusException(HttpStatus.NOT_FOUND);
    	}
	}

	public List<Sign_In> findAllUsers() {
		List<Sign_In> users=signindao.findAll();
		ArrayList<Sign_In> nusers=new ArrayList<>(users);
		return nusers;
	}
}