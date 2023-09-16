package com.test;

import org.junit.Test;

import com.service.NumberService;

import org.junit.Assert;

public class NumberServiceTest {
	
	NumberService numberService=new NumberService();
	
	@Test
	public void sumTest() {
		Assert.assertEquals(30, numberService.addition(10,20));
		Assert.assertEquals(0, numberService.addition(-20,20));
		//Assert.assertEquals(10,numberService.addition(3,4));
		Assert.assertNotEquals(30,numberService.addition(4,5));
	}
}
