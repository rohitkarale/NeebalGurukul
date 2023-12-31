package com.service;

import com.model.Product;

public class ProductService {
	public Product increasePriceByCategory(Product p) {
		String category = p.getCategory();
		double increment = 0.0;

		if ("Mobiles".equalsIgnoreCase(category)) {
			increment = p.getPrice() * 0.02;
		} else if ("Laptops".equalsIgnoreCase(category)) {
			increment = p.getPrice() * 0.01;
		}

		p.setPrice(p.getPrice() + increment);
		return p;
	}

	public double computeTotalPrice(Product[] products) {
		double totalPrice = 0.0;
		for (Product p : products) {
			totalPrice += p.getPrice();
		}
		return totalPrice;
	}

	public void computeGreaterPrice(Product p1, Product p2) {
		if (p1.getPrice() > p2.getPrice()) {
			System.out.println(p1.getTitle() + " has a greater price than " + p2.getTitle());
		} else if (p2.getPrice() > p1.getPrice()) {
			System.out.println(p2.getTitle() + " has a greater price than " + p1.getTitle());
		} else {
			System.out.println(p1.getTitle() + " and " + p2.getTitle() + " have the same price.");
		}
	}
}
