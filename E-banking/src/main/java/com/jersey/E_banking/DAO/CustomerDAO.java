package com.jersey.E_banking.DAO;

import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.jersey.E_banking.domain.Customer;

public class CustomerDAO {
List<Customer>customers =new ArrayList<Customer>();
	public CustomerDAO() {
		customers.add(new Customer(1,"resty","nasimbwa", LocalDate.of(2014, Month.AUGUST, 3)));
		customers.add(new Customer(2,"Allan","Kigozi", LocalDate.of(2017, Month.MARCH, 9)));
	}

public List<Customer> getCustomers(){
	return customers;
}	
	
	
}
