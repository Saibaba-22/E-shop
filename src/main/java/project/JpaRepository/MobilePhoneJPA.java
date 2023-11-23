package project.JpaRepository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import project.Entity.Mobile;



@Repository
public interface MobilePhoneJPA extends JpaRepository<Mobile, Long>{

}
