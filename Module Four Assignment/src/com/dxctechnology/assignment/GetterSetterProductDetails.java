package com.dxctechnology.assignment;

class Product2 {
	
	String productId; 
	String productName;
	double productPrice;

	public String getProductId() {
		return productId;
	}
	public void setProductId(String productId) {
		this.productId = productId;
	}
	public String getProductName() {
		return productName;
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
	
	void printProductDetails() {
		System.out.println("Product Id: "+productId);
		System.out.println("Product name: "+productName);
		System.out.println("Product Price: "+productPrice);
	}

}
public class GetterSetterProductDetails {

	public static void main(String[] args) {
		Product2 product = new Product2();
		product.setProductId("M08");
		product.setProductName("milk");
		product.setProductPrice(45);
		System.out.println("Product Id: "+product.getProductId());
		System.out.println("Product name: "+product.getProductName());
		System.out.println("Product Price: "+product.getProductPrice());

	}

}
