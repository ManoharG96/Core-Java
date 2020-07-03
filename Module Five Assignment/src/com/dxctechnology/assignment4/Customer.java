package com.dxctechnology.assignment4;

public class Customer {
	
	private String name;
	private OfficeAddress officeAddress;
	private CustomerAddress customerAddress;
	
	public Customer(String name, OfficeAddress officeAddress, CustomerAddress customerAddress) {
		super();
		this.name = name;
		this.officeAddress = officeAddress;
		this.customerAddress = customerAddress;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void printCustmorDetails() {
		System.out.println("Name : "+name);
		System.out.println("Resdential Address: "+customerAddress.printResidentAddress());
		System.out.println("Office Address: "+officeAddress.printOfficeAddress());
	}
}
