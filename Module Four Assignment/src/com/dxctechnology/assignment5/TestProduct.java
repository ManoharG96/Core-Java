package com.dxctechnology.assignment5;

public class TestProduct {

	public static void main(String[] args) {
		Product product = new Product("BabyDoll", 500, 't');
		product.printProductDetails();
		System.out.println();
		
		Product product1 = new Product("Laptop", 25000, 'e');
		product1.printProductDetails();
		System.out.println();
		
		Product product2 = new Product("Milk",200);
		product2.printProductDetails();
		System.out.println();

	}

}
