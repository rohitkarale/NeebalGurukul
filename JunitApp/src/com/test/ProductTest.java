package com.test;


import org.junit.Assert;
import org.junit.Test;

import com.model.Product;
import com.service.ProductService;



public class ProductTest {
	
	private Product mobile;
	private Product Laptop;
	ProductService productService=new ProductService();
	
	Product p1=new Product(1,"Mobile",500,"Mobiles");
	Product p2=new Product(2,"Laptop",1000.0,"Laptops");
	
	
	
	@Test
    void testIncreasePriceByCategoryMobile() {
		Product updatedMobile = productService.increasePriceByCategory(mobile);
		Assert.assertEquals(null, 0, 0);
        Assert.assertEquals("Mobile price should be increased by 2%",510.10, updatedMobile.getPrice());
        
    }

    @Test
    void testIncreasePriceByCategoryLaptop() {
        Product updatedLaptop = productService.increasePriceByCategory(Laptop);
        Assert.assertEquals("Laptop price should be increased by 1%",1010.0, updatedLaptop.getPrice());
    }

    @Test
    void testComputeTotalPrice() {
        Product[] products = {mobile, Laptop};
        double totalPrice = productService.computeTotalPrice(products);
        
        Assert.assertEquals("Total price should be the sum of individual prices", 1500.0, totalPrice);
    }

    @Test
    void testComputeGreaterPrice() {
        productService.computeGreaterPrice(mobile, Laptop);
    }
	
	
}
