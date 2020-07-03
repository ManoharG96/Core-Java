package com.dxctechnology.assignment3;

public class CardMainClass {

	public static void main(String[] args) {
		
		TravelCard travelCard = new TravelCard();
		
		double rechargeAmount = travelCard.rechargeAmount(20000);
		System.out.println("Recharage amount is: "+rechargeAmount);
		
		boolean result = travelCard.swipeCard(200);
		
		if (result == true) {
			System.out.println("amount has been swiped from the travel card:");
		} else {
			System.out.println("didnt swiped enter the correct amount");
		}
		
		double points = travelCard.rewardMethod(6000);
		System.out.println(points);
		
	}
}
