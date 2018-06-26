package edu.fa.dao;

import org.springframework.stereotype.Repository;

import edu.fa.model.Fresher;

@Repository
public class FresherDao {
	
	public boolean login(Fresher fresher) {
		if(fresher.getUsername().equalsIgnoreCase("Jeremie") && fresher.getPassword().equals("123456")) {
			return true;
		}
		return false;
	}
	
	public boolean register(Fresher fresher) {
		if(fresher.getUsername().equals(fresher.getPassword())) {
			return false;
		}
		return true;
	}
}
