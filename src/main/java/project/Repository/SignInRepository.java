package project.Repository;

import java.util.List;

import project.Entity.SignIn;

public interface SignInRepository {
	public List<SignIn> findAllUsers();
	public SignIn findByid(Long id,SignIn user);
	public SignIn updateUsers(Long id,SignIn user);
	public void  deleteUser(Long id);
	
	
	public SignIn signup(SignIn user);
	public SignIn login(String username, String userpassword);
}
