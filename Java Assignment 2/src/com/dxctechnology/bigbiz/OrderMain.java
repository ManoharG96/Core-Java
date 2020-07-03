package com.dxctechnology.bigbiz;

import java.util.Scanner;

public class OrderMain {

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);
		System.out.println("Enter the no of orders to be added");
		int noOfItemsToAdd = scn.nextInt();
		
		OrderUtil util = new OrderUtil();

		for (int i = 0; i < noOfItemsToAdd; i++) {

			System.out.println("Enter the order id");
			String id = scn.next();
			System.out.println("Enter the customer name");
			String name = scn.next();
			System.out.println("Enter the order amount(Order amount should be more than 1000)");
			float amount = scn.nextFloat();
			System.out.println("enter the mode of payment (COD, Gift Card, Internet Banking)");
			String payment = scn.next();

			try {
				util.addOrder(new Order(id, name, amount, payment));
			} catch (OrderInvalidException e) {
				System.out.println(e.getMessage());
			}

		}
		System.out.println("Total amount for the above order is "+util.totalAmount());

		System.out.println("Enter the order id to be wanted to search");
		String searchId = scn.next();

	
		try {
			//Order order = util.searchById(searchId);
			System.out.println("order details of id " + "searchId "+util.searchById(searchId));
		} catch (OrderInvalidException e) {
			System.out.println(e.getMessage());
		}
		scn.close();
	}
}
