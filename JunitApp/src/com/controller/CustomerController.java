package com.controller;

import com.model.Customer;
import com.service.CustomerService;

public class CustomerController {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CustomerService customerService=new CustomerService();
		
		Customer c1=new Customer(1,"Yash",55000,"Saving");
		Customer c2=new Customer(2,"Azhar",95000,"Current");
		c1=customerService.computeInterest(c1);
		System.out.println(c1.getBalance());
	}
}
