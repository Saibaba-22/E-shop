package project.Repository;

import java.util.List;

import project.Entity.Laptop;

public interface LaptopRepository {
	public List<Laptop> findAllUsers(Laptop user);
	public Laptop findByid(Long id,Laptop user);
	public Laptop updateLaptop(Long id,Laptop user);
	public void  deleteLaptop(Long id);
	public Laptop addLapy (Laptop laptop);
}
