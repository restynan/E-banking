package com.jersey.E_banking.service;

import java.util.List;

import com.jersey.E_banking.domain.Customer;

public interface CustomerService {
	public List<Customer>getAllCustomers();
	
	public Customer getCustomer(int id);

	public void createCustomer(Customer cust);

}
