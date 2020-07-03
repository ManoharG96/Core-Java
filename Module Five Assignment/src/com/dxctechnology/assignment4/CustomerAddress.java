package com.dxctechnology.assignment4;

public class CustomerAddress{
	
	private String resAddressLine;
	private String resCity;
	
	public CustomerAddress(String resAddressLine, String resCity) {
		this.resAddressLine = resAddressLine;
		this.resCity = resCity;
	}
	
	public String getResAddressLine() {
		return resAddressLine;
	}
	public void setResAddressLine(String resAddressLine) {
		this.resAddressLine = resAddressLine;
	}
	public String getResCity() {
		return resCity;
	}
	public void setResCity(String resCity) {
		this.resCity = resCity;
	}	
	
	public String printResidentAddress() {
		return resAddressLine+ "," +resCity;
	}
	
}
