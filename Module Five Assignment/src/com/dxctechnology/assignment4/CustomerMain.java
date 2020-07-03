package com.dxctechnology.assignment4;

public class CustomerMain {
	
	public static void main(String[] args) {
		OfficeAddress officeAddress = new OfficeAddress("CyberCity", "Noida");
		CustomerAddress customerAddress = new CustomerAddress("HSR Loyout", "Bangalore");
		Customer customer = new Customer("Munna", officeAddress, customerAddress);
		customer.printCustmorDetails();
		
	}
}
