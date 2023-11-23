package project.Repository;

import java.util.List;

import project.Entity.Mobile;


public interface MobilePhoneRepository {
	public List<Mobile> findAllmobiles(Mobile mobile);
	public Mobile findByid(Long id,Mobile mobile);
	public Mobile updateMobile_Phone(Long id,Mobile mobile);
	public String deleteMobile_Phone(Long id);
	public Mobile addphone(Mobile phone);
}

/*
public Users signup(Users user);
public Users login(String usernae, String userpassword);
*/