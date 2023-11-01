package project.Repository;

import java.util.List;

import project.Entity.Mobile_Phone;


public interface Mobile_PhoneRepository {
	public List<Mobile_Phone> findAllmobiles(Mobile_Phone mobile);
	public Mobile_Phone findByid(int id,Mobile_Phone mobile);
	public Mobile_Phone updateMobile_Phone(int id,Mobile_Phone mobile);
	public String deleteMobile_Phone(int id);
	public Mobile_Phone addphone(Mobile_Phone phone);
}

/*
public Users signup(Users user);
public Users login(String usernae, String userpassword);
*/