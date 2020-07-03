package com.dxctechnology.assignment2;

import java.util.Scanner;

public class CustomerMain {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter the customer no which start c or C");
		String cusNo = scn.next();
		System.out.println("Enter the customer name atleast 4 letter");
		String cusName = scn.next();
		System.out.println("Enter the category (Gold, Platinum, Silver)");
		String cusCat = scn.next();
		Customer customer = new Customer(cusNo, cusName, cusCat);
		System.out.println(customer);
	}

}
