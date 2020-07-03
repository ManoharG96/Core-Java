package com.dxctechnology.assignment5;

public class Tablet extends Medicine {

	@Override
	public void displayLabel() {
		System.out.println("     Tablets    ");
		System.out.println("Store in cold Place");
		setPrice(600);
		setExpiryDate("12-12-2020");
		System.out.println("Ointment Price: "+getPrice());
		System.out.println("Ointment Price: "+getExpiryDate());
	}

}
