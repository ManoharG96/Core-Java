package com.dxctechnology.electricalbill;

import java.util.Scanner;

public class ElectricalBill {

	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		System.out.println("enter the current reading");
		int currentReading = scn.nextInt();
		System.out.println("Enter the previous reading");
		int previousReading = scn.nextInt();
		
		ElectricalBillMethodClass bill = new ElectricalBillMethodClass();
		double billCalucate = bill.calculateBill(previousReading, currentReading);
		System.out.println("Electric bill for this month is :"+String.format("%.2f", billCalucate));
		
		scn.close();
	
	}

}
