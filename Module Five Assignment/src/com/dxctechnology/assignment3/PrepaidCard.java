package com.dxctechnology.assignment3;

public abstract class PrepaidCard {
	
	int cardNo;
	double availableBalance;
	double swipeLimit = 50000;
	
	public abstract boolean swipeCard (double money);
	
	public double rechargeAmount(double amount) {
	 return availableBalance + amount;
		
	}

	@Override
	public String toString() {
		return "PrepaidCard [cardNo=" + cardNo + ", availableBalance=" + availableBalance + ", swipeLimit=" + swipeLimit
				+ "]";
	}

}
