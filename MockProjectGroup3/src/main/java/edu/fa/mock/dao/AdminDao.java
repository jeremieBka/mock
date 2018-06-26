package edu.fa.mock.dao;

import edu.fa.mock.model.Admin;

public interface AdminDao {

	public Admin login();
	
	public boolean createProduct();
	
	public boolean updateProduct();
	
	public boolean deleteProduct();
	
}
