package com.dxctechnology.assignment5;

import java.util.Random;

public class TestMedicine {

	public static void main(String[] args) {
		Random random = new Random();
		int number = random.nextInt(3);
		System.out.println("Number is "+number);
		switch (number) {
		case 1: 
			Ointment ointment = new Ointment();
			ointment.displayLabel();
			break;
		case 2:
			Syrup syrup = new Syrup();
			syrup.displayLabel();
			break;
		case 3: 
			Tablet tablet = new Tablet();
			tablet.displayLabel();
			break;
		default: System.out.println("No Medicine Found Run Again");
		}
	}
}
