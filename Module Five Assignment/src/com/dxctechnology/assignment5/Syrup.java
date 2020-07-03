package com.dxctechnology.assignment5;

public class Syrup extends Medicine{

	@Override
	public void displayLabel() {
		System.out.println("     Syrup    ");
		System.out.println("shake well before use");
		setPrice(866);
		setExpiryDate("07-04-2022");
		System.out.println("Ointment Price: "+getPrice());
		System.out.println("Ointment Price: "+getExpiryDate());
			
	}


}
