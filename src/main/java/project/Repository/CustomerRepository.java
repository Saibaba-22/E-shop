package project.Repository;

import java.util.List;

import project.Entity.Customer;

public interface CustomerRepository {
	public List<Customer> findAllCustomer(Customer user);
	public Customer signup(Customer user);
	public Customer findByid(Long id,Customer user);
	public Customer updateCustomer(Long id,Customer user);
	public void  deleteUser(Long id);
	public Customer login(String username, String userpassword);

}
