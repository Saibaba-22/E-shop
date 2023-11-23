package project.ServiceImpl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import project.Entity.SignIn;
import project.JpaRepository.SignInJPA;

@Service
public class SignInServiceImpl {
	@Autowired
	private SignInJPA signindao;
	
	public SignIn findByid(Long id, SignIn user) {
		user=signindao.findById(id).get();
		return user;
	}
	
	public List<SignIn> findAllUsers() {
		List<SignIn> users=signindao.findAll();
		ArrayList<SignIn> nusers=new ArrayList<>(users);
		return nusers;
	}
	
	public SignIn deleteUser(Long id) {
		try 
    	{	SignIn user=signindao.findById(id).get();
			signindao.existsById(id);
    		return user;
    	}
    	catch(Exception e)
    	{
    		throw new ResponseStatusException(HttpStatus.NOT_FOUND);
    	}
	}
	public SignIn updateUsers(Long id,SignIn user)
	{
		try {
			SignIn upuser=signindao.findById(id).get();
			if(user.getUserName()!=null) {
				upuser.setUserName(user.getUserName());
			}
			if(user.getPassword()!=null){
				upuser.setPassword(user.getPassword());
			}
			signindao.save(upuser);
			return upuser;
			}catch(Exception e) {
				throw new ResponseStatusException(HttpStatus.NOT_FOUND);
			}		
	}
	
	
	public SignIn login(String username, String password) 
	{	
		 SignIn user=signindao.findByUserNameAndPassword(username, password);
		 return user;
	}
	
	public SignIn signup(SignIn user) {
	signindao.save(user);
	return user;
	}

}