# E-Banking System

## Overview
The E-Banking System is a Java-based application designed to manage customer data efficiently for an electronic banking platform. This project leverages the power of Java to handle customer information, including their identification details and registration dates. It is built with a focus on simplicity and functionality, ensuring ease of use and effective data management.

## Key Components

### Customer Data Access Object (DAO)
The `CustomerDAO` class is the core of the project, responsible for managing customer data. It provides methods to add, retrieve, and search for customer information.

### Customer Management
The application stores customer data in a list. Each customer is represented by an instance of the `Customer` class, which includes attributes such as ID, first name, last name, and registration date.

### Functionality
- **Get Customers:** Retrieve a list of all customers.
- **Get Customer by ID:** Find a customer by their unique ID.
- **Create Customer:** Add a new customer to the system.

## Sample Data
The `CustomerDAO` class initializes with two sample customers:
- Customer 1: Resty Nasimbwa, registered on August 3, 2014.
- Customer 2: Allan Kigozi, registered on March 9, 2017.

## How It Works
- The `CustomerDAO` class contains a list of customers.
- Methods in the class allow for adding new customers and retrieving existing customer data.
- The `createCustomer` method adds a new customer to the list and confirms the action with a print statement.

## Potential Extensions
- Integrate with a database for persistent storage.
- Expand customer attributes to include more detailed information.
- Implement additional functionalities such as updating and deleting customer records.
- Develop a user interface for easier interaction with the system.

## Conclusion
The E-Banking System project is a foundational application for managing customer data in an electronic banking environment. Its simple yet effective structure makes it a valuable starting point for further development and enhancements in the banking domain.
