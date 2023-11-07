package project.JpaRepository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import project.Entity.Sign_In;

@Repository
public interface Sign_InJPA extends JpaRepository<Sign_In, Long>{

}
