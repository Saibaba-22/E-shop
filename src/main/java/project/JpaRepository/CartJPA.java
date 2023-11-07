package project.JpaRepository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import project.Entity.Cart;


@Repository
public interface CartJPA extends JpaRepository<Cart, Long>{

}
