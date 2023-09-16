package com.controller;

import com.model.Product;
import com.service.ProductService;

public class ProductConntroller {
	public static void main(String[] args) {
		ProductService productService= new ProductService();
		Product p1=new Product(1,"Mobile",500,"Mobiles");
		Product p2=new Product(2,"Laptop",1000.0,"Laptops");
		productService.computeGreaterPrice(p1, p2);
	}
}
