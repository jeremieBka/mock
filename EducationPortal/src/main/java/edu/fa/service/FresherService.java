package edu.fa.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.fa.dao.FresherDao;
import edu.fa.model.Fresher;
@Service
public class FresherService {
	@Autowired
	private FresherDao fresherDao;
	
	public boolean login(Fresher fresher) {
		return fresherDao.login(fresher);
	}
	
	public boolean register(Fresher fresher) {
		return fresherDao.register(fresher);
	}
}
