package project.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import jakarta.servlet.ServletException;
import project.Entity.SignIn;
import project.ServiceImpl.SignInServiceImpl;

@RestController
@CrossOrigin
@RequestMapping("/Signin")

public class SignInController {


	@Autowired
	private SignInServiceImpl signinservice;
		
	@GetMapping("/getsignin")
	List<SignIn> findAllSignIn(){
		return signinservice.findAllUsers();
	}
	@GetMapping("/findsignin/{id}")
	SignIn findByid(@PathVariable Long id,SignIn user) {
		return signinservice.findByid(id, user);
	}

	@PutMapping("/updatesignin/{id}")
	SignIn updateSignIn(@PathVariable Long id,@RequestBody SignIn user) {
		return signinservice.updateUsers(id, user);
	}

	@DeleteMapping("/deletesignin/{id}")
	public void  deleteSignIn(@PathVariable Long id) {
		signinservice.deleteUser(id);
	}

	
	@PostMapping("/login")
	public SignIn validate(@RequestBody SignIn user) throws ServletException
	{
		
		if(user.getUserName()==null || user.getPassword()==null)
		{
			throw new ServletException("Please fill in username and password");
		}
		String username=user.getUserName();
		String password=user.getPassword();
		user=signinservice.login(username, password);
		
		if(user==null)
		{
			throw new ServletException("User not found");
		}

		return user;
	}

}