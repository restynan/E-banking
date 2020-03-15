package com.jersey.E_banking.controller;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.jersey.E_banking.domain.Customer;
import com.jersey.E_banking.service.CustomerServiceImpl;

@Path("customers")
public class CustomerController {

	public CustomerController() {
		// TODO Auto-generated constructor stub
	}
	
	@GET
	@Produces (MediaType.APPLICATION_JSON)
	public List<Customer> getCustomers()
	{ 
		return new CustomerServiceImpl().getAllCustomers();
	
	
				}

}
