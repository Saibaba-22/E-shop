package project.Repository;

import java.util.List;

import project.Entity.Customer;

public interface CustomerRepository {
	public List<Customer> findAllCustomer(Customer user);
	public Customer signup(Customer user);
	public Customer findByid(int id,Customer user);
	public Customer updateCustomer(int id,Customer user);
	public void  deleteUser(int id);
	public Customer login(String username, String userpassword);

}
