package com.dxctechnology.assignment;

public class Customer extends Address {

	private String name;
	private Address cusAddress;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Address getCusAddress() {
		return cusAddress;
	}

	public void setCusAddress(Address cusAddress) {
		this.cusAddress = cusAddress;
	}

	public Customer(String name, String addressLine, String city) {
		super(addressLine, city);
		this.name = name;	
	}

	Customer(){}

	public void getCustmorDetails() {
		System.out.println("Customer Name: "+name);
		System.out.println("Customer Address: "+getAddressDetails());
	}

}
