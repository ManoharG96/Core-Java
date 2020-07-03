package com.dxctechnology.assignment;

public class CustomerMain {
	
	public static void main(String[] args) {
		
		Customer customer1 = new Customer();
		customer1.setName("Manohar");
		customer1.setAddressLine("Gandi Nagar");
		
		customer1.setCity("Bellary");
		customer1.getCustmorDetails();
		
		Customer customer = new Customer("Munna", "HSR layout", "Bangalore");
		customer.getCustmorDetails();
	}
}
