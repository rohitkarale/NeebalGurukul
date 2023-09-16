package com.test;

import static org.junit.Assert.assertEquals;

import org.junit.Assert;
import org.junit.Test;

import com.model.Product;
import com.service.ProductService;

public class ProductServiceTest {

	ProductService productService = new ProductService();

	Product p1 = new Product(1, "Mobile", 500.0, "Mobiles");
	Product p2 = new Product(2, "Laptop", 1000.0, "Laptops");

	Product parray[] = { p1, p2 };

	@Test
	public void testIncreasePriceByCategoryMobiles() {
		assertEquals(Math.round(510.0), Math.round(productService.increasePriceByCategory(p1).getPrice()));
	}

	@Test
	public void testIncreasePriceByCategoryLaptops() {
		assertEquals(Math.round(1010.0), Math.round(productService.increasePriceByCategory(p2).getPrice()));
	}
	
	@Test
	public void testComputeTotalPrice() {
        
        double totalPrice = productService.computeTotalPrice(parray);
        assertEquals(Math.round(1500.0) , Math.round(totalPrice));
    }
	
	@Test
	public void testComputeGreaterPrice() {
  
        productService.computeGreaterPrice(p1, p2);
    }
}
