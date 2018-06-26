package edu.fa.mock.dao;

import java.util.List;

import edu.fa.mock.model.Customer;
import edu.fa.mock.model.Products;

public interface CustomerDao {

	public Customer login();
	
	public List<Products> getListProduct();
	
	 
}
