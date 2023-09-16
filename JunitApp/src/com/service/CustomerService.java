package com.service;

import com.model.Customer;

public class CustomerService {

	public Customer computeInterest(Customer c1) {
		// TODO Auto-generated method stub
		if(c1.getAccountType().equalsIgnoreCase("Saving")) {
			c1.setBalance(c1.getBalance()*1.04);
		}
		if(c1.getAccountType().equalsIgnoreCase("Current")) {
			c1.setBalance(c1.getBalance()*1);
		}
		return c1;
	}	
	public double computeBalance (Customer[] carry) {
		double sum = 0;
		for(Customer x: carry) {
			sum+= x.getBalance();
		}
		return sum;
	}
}
