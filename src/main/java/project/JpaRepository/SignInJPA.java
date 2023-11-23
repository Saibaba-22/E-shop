package project.JpaRepository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import project.Entity.SignIn;

@Repository
public interface SignInJPA extends JpaRepository<SignIn, Long>{

	SignIn findByUserNameAndPassword(String UserName, String password);

}
