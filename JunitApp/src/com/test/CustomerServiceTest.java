package com.test;

import org.junit.Test;

import com.model.Customer;
import com.service.CustomerService;

import junit.framework.Assert;

public class CustomerServiceTest {
	CustomerService customerService = new CustomerService();

	Customer c1 = new Customer(1, "Yash", 55000, "Saving");
	Customer c2 = new Customer(2, "Azhar", 95000, "Current");
	Customer c3 = new Customer(3, "Azhar", 57200, "Current");

	Customer[] carry = { c1, c2 };

	@Test
	public void computeInterestTest() {
		Assert.assertEquals(Math.round(c3.getBalance()), Math.round
				(customerService.computeInterest(c3).getBalance()));
	}

}
