package project.JpaRepository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import project.Entity.Mobile_Phone;



@Repository
public interface Mobile_PhoneJPA extends JpaRepository<Mobile_Phone, Long>{

}
