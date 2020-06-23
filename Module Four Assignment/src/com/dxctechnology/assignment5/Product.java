package com.dxctechnology.assignment5;

public class Product {
	private String productId;
	private String productName;
	private double productPrice;
	private char categoryType;

	public String getProductName() {
		return productName;
	}

	public String getProductId() {
		return productId;
	}

	public String setProductId(String productId) {
		return this.productId = productId;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public double getProductPrice() {
		return productPrice;
	}

	public void setProductPrice(double productPrice) {
		this.productPrice = productPrice;
	}

	public char getCategoryType() {
		return categoryType;
	}

	public char setCategoryType(char categoryType) {
		return this.categoryType = categoryType;
	}

	public Product(String productName, double productPrice, char categoryType) {
		this.productName = productName;
		this.productPrice = productPrice;
		this.categoryType = categoryType;
		this.productId = generateProductCode(categoryType);
	}

	public Product(String productName, double productPrice) {
		this.productName = productName;
		this.productPrice = productPrice;
		this.productId = generateProductCode(categoryType);
		this.categoryType = setCategoryType('e');
	}

	private static int counter = 100;

	String res, res1,res2 = null;
	
	private String generateProductCode (char c) {
		this.categoryType = c;
		if (c == 'e') {
			res = "e" + counter++;
			productId = setProductId(res);
		}
		else if (c=='a') {
			res1 = "a"+ counter++;	
			productId = setProductId(res);
		}

		else if (c== 't') {
			res2 = "t" +counter++;
			productId = setProductId(res2);
		}

		return productId;
	}
	
	public void printProductDetails() {
		System.out.println("Product Id: "+generateProductCode(categoryType));
		System.out.println("Product name: "+getProductName());
		System.out.println("Product Price: "+getProductPrice());
		System.out.println("Product category: "+getCategoryType());
	}
}
