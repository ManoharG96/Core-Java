package com.dxctechnology.assignmet2;

public class Allowance {

	public static void main(String[] args){

		CalculateAllowance allowance = new CalculateAllowance();
		int[] items = {12,13,54};
		
		int sizeOfItems = items.length;

		try {
			System.out.println(allowance.calAllow(items, sizeOfItems));
		} catch (AllowanceException e) {
			System.out.println(e.getMessage());
		}
	}

}
