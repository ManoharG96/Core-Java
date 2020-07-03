package com.dxctechnology.assignment5;

public class Ointment extends Medicine {
	
	@Override
	public void displayLabel() {
		System.out.println("     Ointment    ");
		System.out.println("For External use only");
		setPrice(300);
		setExpiryDate("20-12-2021");
		System.out.println("Ointment Price: "+getPrice());
		System.out.println("Ointment Price: "+getExpiryDate());
		
	}

}
