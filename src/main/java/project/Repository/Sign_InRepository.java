package project.Repository;

import java.util.List;

import project.Entity.Sign_In;

public interface Sign_InRepository {
	public List<Sign_In> findAllUsers();
	public Sign_In signup(Sign_In user);
	public Sign_In findByid(int id,Sign_In user);
	public Sign_In updateUsers(int id,Sign_In user);
	public void  deleteUser(int id);
	public Sign_In login(String username, String userpassword);
}
