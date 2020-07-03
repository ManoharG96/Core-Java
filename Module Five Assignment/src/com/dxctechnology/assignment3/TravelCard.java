package com.dxctechnology.assignment3;

public class TravelCard extends PrepaidCard implements Rewardable {

	double rewardPoints; 

	@Override
	public double rewardMethod(double amount) {
		rewardPoints = amount * 0.05;
		return rewardPoints;
	}

	@Override
	public boolean swipeCard(double money) {
		double res = money * 60;
		if (res < availableBalance && res < swipeLimit) {
			return true;
		}else
			return false;
	}
}