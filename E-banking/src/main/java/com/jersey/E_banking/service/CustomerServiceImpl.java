package com.jersey.E_banking.service;

import java.util.List;

import com.jersey.E_banking.DAO.CustomerDAO;
import com.jersey.E_banking.domain.Customer;

public class CustomerServiceImpl implements CustomerService{
	private CustomerDAO customerDAO = new CustomerDAO();
	public CustomerServiceImpl() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public List<Customer> getAllCustomers() {
		// TODO Auto-generated method stub
		return customerDAO.getCustomers();
	}

	@Override
	public Customer getCustomer(int id) {
		// TODO Auto-generated method stub
		return customerDAO.getCustomer(id);
	}

	@Override
	public void createCustomer(Customer cust) {
		System.out.println(cust);
		 customerDAO.createCustomer(cust);
		
	}

}
