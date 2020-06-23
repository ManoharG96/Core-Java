package com.dxctechnology.assignment;

class Product1 {

	String productId = "M009"; 
	String productName = "Milk";
	double productPrice = 25.00;

}
public class InstanceProductDetails {

	public static void main(String[] args) {
		
		Product1 product = new Product1();
		
		System.out.println("Product Id: "+product.productId);
		System.out.println("Product name: "+product.productName);
		System.out.println("Product Price: "+product.productPrice);
		
		product.productId = "B006";
		product.productName = "Biscuit";
		product.productPrice = 30;
		
		System.out.println("Product Id: "+product.productId);
		System.out.println("Product name: "+product.productName);
		System.out.println("Product Price: "+product.productPrice);


	}

}
