package project.JpaRepository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import project.Entity.Customer;


@Repository
public interface CustomerJpa extends JpaRepository<Customer, Integer>{

}
