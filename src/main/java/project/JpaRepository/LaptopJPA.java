package project.JpaRepository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import project.Entity.Laptop;



@Repository
public interface LaptopJPA extends JpaRepository<Laptop, Integer>{

}
