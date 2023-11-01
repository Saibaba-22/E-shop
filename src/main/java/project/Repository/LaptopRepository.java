package project.Repository;

import java.util.List;

import project.Entity.Laptop;

public interface LaptopRepository {
	public List<Laptop> findAllUsers(Laptop user);
	public Laptop findByid(int id,Laptop user);
	public Laptop updateLaptop(int id,Laptop user);
	public void  deleteLaptop(int id);
	public Laptop addLapy (Laptop laptop);
}
