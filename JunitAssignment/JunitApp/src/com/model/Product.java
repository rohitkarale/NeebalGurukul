package com.model;

public class Product {
	private int id;
	private String title;
	private double price;
	private String category;
	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Product(int id, String title, double price, String category) {
		super();
		this.id = id;
		this.title = title;
		this.price = price;
		this.category = category;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
		
}
