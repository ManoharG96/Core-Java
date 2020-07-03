package com.dxctechnology.assignment;

public class Address {
	
	private String addressLine;
	private String city;
	
	public String getAddressLine() {
		return addressLine;
	}
	public void setAddressLine(String addressLine) {
		this.addressLine = addressLine;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public Address(String addressLine, String city) {
		this.addressLine = addressLine;
		this.city = city;
	}
	public String getAddressDetails() {
		String address = addressLine+","+city;
		return address;
	}
	public Address() {
		// TODO Auto-generated constructor stub
	}

}
