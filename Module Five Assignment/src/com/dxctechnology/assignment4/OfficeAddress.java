package com.dxctechnology.assignment4;

public class OfficeAddress {
	
	private String officeAddressLine;
	private String officeCity;
	
	public String getOfficeAddressLine() {
		return officeAddressLine;
	}
	public void setOfficeAddressLine(String officeAddressLine) {
		this.officeAddressLine = officeAddressLine;
	}
	public String getOfficeCity() {
		return officeCity;
	}
	public void setOfficeCity(String officeCity) {
		this.officeCity = officeCity;
	}
	
	public OfficeAddress(String officeAddressLine, String officeCity) {
		this.officeAddressLine = officeAddressLine;
		this.officeCity = officeCity;
	}
	
	public String printOfficeAddress() {
		return officeAddressLine+ "," +officeCity;
	}

}
