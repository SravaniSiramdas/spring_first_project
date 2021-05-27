package com.cg.cms.service;

import java.util.List;

import com.cg.cms.entities.Customer;

public interface ICustomerService {
	void addCustomer(Customer customer);
	List<Customer> fetchAll();
	
	void delCustomer(int id);
	void updateCustomer(Customer customer);
	Customer fetchById(int id);
}
