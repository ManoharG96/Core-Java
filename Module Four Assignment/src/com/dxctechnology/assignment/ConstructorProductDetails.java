package com.dxctechnology.assignment;
import java.util.Scanner;

class Product {

	String productId; 
	String productName;
	double productPrice;

	public Product(String productId, String productName, double productPrice) {	
		this.productId = productId;
		this.productName = productName;
		this.productPrice = productPrice;
	}

	void printProductDetails() {
		System.out.println("Product Id: "+productId);
		System.out.println("Product name: "+productName);
		System.out.println("Product Price: "+productPrice);
	}

}
public class ConstructorProductDetails {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);

		System.out.println("enter the code");
		String code = scn.nextLine();

		System.out.println("enter the Product name");
		String name = scn.nextLine();

		System.out.println("enter the price");
		double price = scn.nextDouble();

		Product product = new Product(code, name, price);
		product.printProductDetails();
		scn.close();
	}

}
