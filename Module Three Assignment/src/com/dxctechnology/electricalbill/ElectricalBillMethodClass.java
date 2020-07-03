package com.dxctechnology.electricalbill;

public class ElectricalBillMethodClass {
	
	public double calculateBill (int previousReading, int currentReading) {
		double total = 0;
		int reading = currentReading - previousReading;
		if (reading<30) {
			total = reading * 2.3 ;	
		} else if (reading <70 ) {
			total = (30 * 2.3) + ((reading-30) * 3.3);
		} else if (reading >= 100) {
			total = (30 * 2.3) + (70 * 3.3) + ((reading-100) * 4.6);
		}
		
		return total;
		
	}

}
