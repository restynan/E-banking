package com.jersey.E_banking.service;

import java.util.List;

import com.jersey.E_banking.DAO.CustomerDAO;
import com.jersey.E_banking.domain.Customer;

public class CustomerServiceImpl implements CustomerService{

	public CustomerServiceImpl() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public List<Customer> getAllCustomers() {
		// TODO Auto-generated method stub
		return new CustomerDAO().getCustomers();
	}

}
