package com.jersey.E_banking.domain;


import java.time.LocalDate;
import java.util.Date;
import javax.xml.bind.annotation.XmlRootElement;



@XmlRootElement
public class Customer {
	
	private int id;
	private String firstName;
	private String  lastName;
	private LocalDate birthday ; 

	public Customer() {}
	
	public Customer(int id, String firstName, String lastName, LocalDate birthday) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.birthday = birthday;
	}

	

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public LocalDate getBirthday() {
		return birthday;
	}

	public void setBirthday(LocalDate birthday) {
		this.birthday = birthday;
	}

	@Override
	public String toString() {
		return "Customer [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", birthday=" + birthday
				+ "]";
	}
	
	
	
	
}